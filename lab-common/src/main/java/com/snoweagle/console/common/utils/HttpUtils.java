package com.snoweagle.console.common.utils;

import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by snoweagle on 12/10/2016.
 */
public class HttpUtils {

    private static CloseableHttpClient httpclient = HttpClients.createDefault();
    protected final static Logger log = LoggerFactory.getLogger(HttpUtils.class);
    /**
     * get请求
     *
     * @param url
     * @param parmStr
     * @param timeOut
     * @return
     * @throws IOException
     */
    public static String get(String url, String parmStr, int timeOut) throws IOException {
        fail4Null(url, "URL");
        String uri = url + (StringUtils.isEmpty(parmStr) ? "" : "?" + parmStr);
        log.info("--->[ 请求URL ][get]：{}", uri);
        HttpGet httpget = new HttpGet(uri);
        httpget.setConfig(RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).build());
        return responseHandler(httpget);
    }

    /**
     * post请求
     *
     * @param url
     * @param formMap
     * @param timeOut
     * @return
     * @throws IOException
     */
    public static String post(String url, Map<String, String> formMap, int timeOut) throws IOException {
        log.info("--->[ 请求URL ][post]：",url);
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(getPostParameterPairs(formMap), Consts.UTF_8);
        HttpPost httppost = new HttpPost(url);
        httppost.setConfig(RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).build());
        httppost.setEntity(entity);
        return responseHandler(httppost);
    }
    public static String post(String url, String postParams, int timeOut) throws IOException {
        log.info("--->[ 请求URL ][post] url：{}  params:[]" , url,postParams);
        HttpPost httppost = new HttpPost(url);
        httppost.setConfig(RequestConfig.custom().setSocketTimeout(timeOut).setConnectTimeout(timeOut).build());
        StringEntity entity = new StringEntity(postParams);
        httppost.setEntity(entity);
        return responseHandler(httppost);
    }
    /**
     * get请求 异常返回null
     *
     * @param url
     * @param parmStr
     * @param timeOut
     * @return
     */
    public static String getWithNoException(String url, String parmStr, int timeOut) {
        try {
            return get(url, parmStr, timeOut);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    /**
     * post 异常返回null
     *
     * @param url
     * @param formMap
     * @param timeOut
     * @return
     */
    public static String postWithNoException(String url, Map<String, String> formMap, int timeOut) {
        try {
            return post(url, formMap, timeOut);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }

    private static String responseHandler(HttpRequestBase httpRequestBase) throws IOException {
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httpRequestBase);
            int statusCode = response.getStatusLine().getStatusCode();
            HttpEntity httpEntity = response.getEntity();
            if (statusCode == HttpStatus.SC_OK) {
                String resp = EntityUtils.toString(httpEntity, Consts.UTF_8);
                log.info("------>[ 正常HTTP返回 ]-->{}", resp);
                return resp;
            } else {
                throw new RuntimeException(" [ 远程服务异常 ] statusCode:" + statusCode);
            }
        } finally {
            HttpClientUtils.closeQuietly(response);
        }

    }

    /**
     * map转 list nvp
     *
     * @param postParams
     * @return
     */
    private static List<NameValuePair> getPostParameterPairs(Map<String, String> postParams) {
        List<NameValuePair> result = new ArrayList<>(postParams.size());
        for (String key : postParams.keySet()) {
            result.add(new BasicNameValuePair(key, postParams.get(key)));
        }
        return result;
    }

    private static void fail4Null(Object str, String msg) {
        if (str == null || StringUtils.isEmpty(String.valueOf(str)))
            throw new IllegalArgumentException(msg + "不能是空");
    }

}
