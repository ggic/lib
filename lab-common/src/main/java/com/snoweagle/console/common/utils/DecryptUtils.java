package com.snoweagle.console.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created by snoweagle on 12/10/2016.
 */
@Slf4j
public class DecryptUtils {
    private static final String PUBLIC_KEY = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALm0j1O/by4mmjg/ZV2+9ujwz8+XunX2"
            + "aEERSL+PjHzQv0JT6F18lCUalRL29L9G2dqeMNQgdSasxMKb5/AG/08CAwEAAQ==";
    private static final String PRI_KEY = "MIIBUwIBADANBgkqhkiG9w0BAQEFAASCAT0wggE5AgEAAkEAubSPU79vLiaaOD9l"
            + "Xb726PDPz5e6dfZoQRFIv4+MfNC/QlPoXXyUJRqVEvb0v0bZ2p4w1CB1JqzEwpvn"
            + "8Ab/TwIDAQABAkBP8nG5xjJhFfFSwcgr4ah+hB2S62k0m44qZPyCq5P5r1DJH7wZ"
            + "cqt6CqCPA34FwlLkoQc7/wb564HzveGyu5bxAiEA3BF9QdNW2a5cSkSCWJkPs8Yk"
            + "FnobFGdYzBLqZY+3pFUCIQDYBsA1sNRwgh7dffkXiaPJ/k1RPLFrxazSBZWx6nOZ"
            + "EwIgcqjiHEPiwnQoPcHIMCU/mykncFaaeV0HVPyeB+CDjCkCIBJH7/gbML8co9QG"
            + "lw/A3BV56b0YL8N5BPj49AQMXR/1AiBZ6A+2ooNh2YIezGXYc7+pW4J0NPoyFKN/" + "fIq3bLln9w==";

    /**
     * BASE64解码
     *
     * @param pStr
     * @return
     */
    public static byte[] decryptBase64(final String pStr) throws IOException {
        return Base64.decodeBase64(pStr);

    }

    /**
     * BASE64编码
     *
     * @param str
     * @return
     */
    public static String encryptBase64(final byte[] str) {
        return new String(Base64.encodeBase64(str)).replace("\r\n", "");
    }

    private static RSAPublicKey getPubKey(final String pubKey)
            throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        final X509EncodedKeySpec pubKeySpec = new X509EncodedKeySpec(Base64.decodeBase64(pubKey));
        final KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return (RSAPublicKey) keyFactory.generatePublic(pubKeySpec);

    }

    private static RSAPrivateKey getPrivateKey(final String priKey)
            throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        final KeyFactory keyf = KeyFactory.getInstance("RSA");
        return (RSAPrivateKey) keyf.generatePrivate(new PKCS8EncodedKeySpec(Base64.decodeBase64(priKey)));
    }

    /**
     * 加密
     *
     * @param publicKey
     * @param srcBytes
     * @return
     */
    private static byte[] encryptRSA(final PublicKey publicKey, final byte[] srcBytes) throws NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        final Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(srcBytes);

    }

    /**
     * 解密
     *
     * @param privateKey
     * @param srcBytes
     * @return
     */
    private static byte[] decryptRSA(final PrivateKey privateKey, final byte[] srcBytes) throws NoSuchPaddingException,
            NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        final Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(srcBytes);

    }

    public static String encrypt(final String str) {
        try {
            return encryptBase64(encryptRSA(getPubKey(PUBLIC_KEY), str.getBytes()));
        } catch (final Exception e) {
//            log.error(e.getMessage(), e);
        }
        return null;
    }

    public static String decrypt(final String str) {
        try {
            return new String(decryptRSA(getPrivateKey(PRI_KEY), decryptBase64(str)));
        } catch (final Exception e) {
//            log.error(e.getMessage(), e);
        }
        return null;
    }

}
