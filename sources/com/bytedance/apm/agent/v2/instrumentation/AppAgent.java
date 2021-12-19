package com.bytedance.apm.agent.v2.instrumentation;

import android.text.TextUtils;
import com.bytedance.apm.agent.tracing.AutoLaunchTraceHelper;
import com.bytedance.covode.number.Covode;

public class AppAgent {
    private static long attachBaseContextEndTime;
    private static long attachBaseContextStartTime;
    private static long constructorEndTime;
    private static long constructorStartTime;
    private static long onCreateEndTime;
    private static long onCreateStartTime;

    static {
        Covode.recordClassIndex(14387);
    }

    public static void onTrace(String str, boolean z) {
        if (TextUtils.equals(str, "<init>")) {
            if (z) {
                constructorStartTime = System.currentTimeMillis();
            } else {
                constructorEndTime = System.currentTimeMillis();
            }
        } else if (TextUtils.equals(str, "attachBaseContext")) {
            if (z) {
                attachBaseContextStartTime = System.currentTimeMillis();
            } else {
                attachBaseContextEndTime = System.currentTimeMillis();
            }
        } else if (!TextUtils.equals(str, "onCreate")) {
        } else {
            if (z) {
                onCreateStartTime = System.currentTimeMillis();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            onCreateEndTime = currentTimeMillis;
            AutoLaunchTraceHelper.assignAppTime(constructorStartTime, constructorEndTime, attachBaseContextStartTime, attachBaseContextEndTime, onCreateStartTime, currentTimeMillis);
        }
    }
}
