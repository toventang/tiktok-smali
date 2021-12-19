package com.bytedance.ies.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class IESAppLogger {
    private static volatile IESAppLogger instance = null;
    private static final Object object = new Object();
    private String appId = null;
    private a appLoggerCallback;
    private Boolean initFlag = false;
    private Boolean isAbroad = false;

    public interface a {
        static {
            Covode.recordClassIndex(19798);
        }

        void a(String str, JSONObject jSONObject, String str2);
    }

    static {
        Covode.recordClassIndex(19797);
    }

    private IESAppLogger() {
    }

    public static IESAppLogger sharedInstance() {
        IESAppLogger iESAppLogger;
        MethodCollector.i(2830);
        if (instance != null) {
            IESAppLogger iESAppLogger2 = instance;
            MethodCollector.o(2830);
            return iESAppLogger2;
        }
        synchronized (object) {
            try {
                if (instance == null) {
                    instance = new IESAppLogger();
                }
                iESAppLogger = instance;
            } finally {
                MethodCollector.o(2830);
            }
        }
        return iESAppLogger;
    }

    private static JSONObject copyJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return new JSONObject();
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public void appLogOnEvent(String str, String str2, String str3) {
        appLogOnEvent(str, str2, str3, false);
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2) {
        appLogOnEvent(str, jSONObject, str2, false);
    }

    public void setAppLogCallback(String str, a aVar, boolean z) {
        MethodCollector.i(2832);
        if (this.initFlag.booleanValue()) {
            MethodCollector.o(2832);
            return;
        }
        synchronized (object) {
            try {
                if (!this.initFlag.booleanValue()) {
                    this.appId = str;
                    this.appLoggerCallback = aVar;
                    this.initFlag = true;
                    this.isAbroad = Boolean.valueOf(z);
                }
            } finally {
                MethodCollector.o(2832);
            }
        }
    }

    public void appLogOnEvent(String str, String str2, String str3, boolean z) {
        JSONObject jSONObject;
        if (this.appLoggerCallback != null) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = new JSONObject();
            }
            appLogOnEvent(str, jSONObject, str3, z);
        }
    }

    public void appLogOnEvent(String str, JSONObject jSONObject, String str2, boolean z) {
        if (this.appLoggerCallback != null) {
            if (z) {
                this.appLoggerCallback.a(str, copyJson(jSONObject), str2);
            }
            JSONObject copyJson = copyJson(jSONObject);
            try {
                if (this.isAbroad.booleanValue()) {
                    copyJson.put("second_appid", "2780");
                    copyJson.put("second_appname", "vesdk_abroad");
                } else {
                    copyJson.put("second_appid", "1357");
                    copyJson.put("second_appname", "video_editor_sdk");
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.appLoggerCallback.a(str, copyJson, str2);
        }
    }
}
