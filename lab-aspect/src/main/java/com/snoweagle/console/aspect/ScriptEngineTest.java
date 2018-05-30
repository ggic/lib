package com.snoweagle.console.aspect;

import javax.script.*;

/**
 * Created by Patrick on 2018/5/29.
 */
public class ScriptEngineTest {
    public static void main(String[] args) throws ScriptException {
        String words = "a*0.01+b*0.1+c;";
        ScriptEngine engine=new ScriptEngineManager().getEngineByName("JavaScript");
        engine.put("a", 4);
        engine.put("b", 3);
        engine.put("c", 10000.001);

//        Bindings bindings = engine.getBindings(ScriptContext.ENGINE_SCOPE);

        Object eval = engine.eval(words);
        System.out.println(eval);

    }


}
