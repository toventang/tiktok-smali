package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class AppInstrumentation {
    private static long attachBaseContextEndTime;
    private static long attachBaseContextStartTime;
    private static long constructorEndTime;
    private static long constructorStartTime;
    private static boolean isValid;
    private static long launcherActivityCreateEndTime;
    private static long launcherActivityCreateStartTime;
    private static String launcherActivityName;
    private static long launcherActivityOnWindowFocusChangedTime;
    private static long launcherActivityResumeEndTime;
    private static long launcherActivityResumeStartTime;
    private static long onCreateEndTime;
    private static long onCreateStartTime;

    static {
        Covode.recordClassIndex(14321);
    }

    public static void launcherActivityOnWindowFocusChangedEnd() {
    }

    public static void attachBaseContextEnd() {
        if (attachBaseContextEndTime == 0) {
            attachBaseContextEndTime = System.currentTimeMillis();
        }
    }

    public static void attachBaseContextStart() {
        if (attachBaseContextStartTime == 0) {
            attachBaseContextStartTime = System.currentTimeMillis();
        }
    }

    public static void initEnd() {
        if (constructorEndTime == 0) {
            constructorEndTime = System.currentTimeMillis();
        }
    }

    public static void initStart() {
        if (constructorStartTime == 0) {
            constructorStartTime = System.currentTimeMillis();
        }
    }

    public static void onCreateEnd() {
        if (onCreateEndTime == 0) {
            onCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void onCreateStart() {
        if (onCreateStartTime == 0) {
            onCreateStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnCreateEnd() {
        if (launcherActivityCreateEndTime == 0 && isValid) {
            launcherActivityCreateEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnResumeEnd() {
        if (launcherActivityResumeEndTime == 0 && isValid) {
            launcherActivityResumeEndTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnCreateStart(String str) {
        if (launcherActivityCreateStartTime == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            launcherActivityCreateStartTime = currentTimeMillis;
            if (currentTimeMillis - onCreateEndTime < 800) {
                isValid = true;
                launcherActivityName = str;
            }
        }
    }

    public static void launcherActivityOnResumeStart(String str) {
        if (launcherActivityResumeStartTime == 0 && isValid) {
            launcherActivityResumeStartTime = System.currentTimeMillis();
        }
    }

    public static void launcherActivityOnWindowFocusChangedStart(String str) {
        if (launcherActivityOnWindowFocusChangedTime == 0 && onCreateStartTime > 0 && isValid) {
            long currentTimeMillis = System.currentTimeMillis();
            launcherActivityOnWindowFocusChangedTime = currentTimeMillis;
            long j2 = currentTimeMillis - constructorStartTime;
            if (j2 > 0 && j2 < 15000) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("application_constructor", constructorEndTime - constructorStartTime);
                    jSONObject.put("application_attachBaseContext", attachBaseContextEndTime - attachBaseContextStartTime);
                    jSONObject.put("application_onCreate", onCreateEndTime - onCreateStartTime);
                    jSONObject.put("launcher_activity_onCreate", launcherActivityCreateEndTime - launcherActivityCreateStartTime);
                    jSONObject.put("launcher_activity_onResume", launcherActivityResumeEndTime - launcherActivityResumeStartTime);
                    jSONObject.put("app_to_first_activity_windowfocus", j2);
                    jSONObject.put("app_to_first_activity_windowfocus#" + launcherActivityName, j2);
                    jSONObject.put("launcher_activity_onCreate#" + launcherActivityName, launcherActivityCreateEndTime - launcherActivityCreateStartTime);
                    jSONObject.put("launcher_activity_onResume#" + launcherActivityName, launcherActivityResumeEndTime - launcherActivityResumeStartTime);
                    MonitorTool.monitorStart(jSONObject, constructorStartTime, launcherActivityResumeEndTime);
                } catch (Exception unused) {
                }
                onCreateStartTime = 0;
                isValid = false;
            }
        }
    }
}
