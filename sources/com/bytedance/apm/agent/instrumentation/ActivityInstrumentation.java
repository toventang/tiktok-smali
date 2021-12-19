package com.bytedance.apm.agent.instrumentation;

import android.text.TextUtils;
import com.bytedance.apm.agent.helper.PageShowHelper;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import org.json.JSONObject;

public class ActivityInstrumentation {
    static boolean isFirstWindowFocusChanged;
    private static String sActivityName;
    private static HashSet<String> sMethodSet = new HashSet<>(32);
    private static long sOnCreateEnd;
    private static long sOnCreateStart;
    private static long sOnResumeEnd;
    private static long sOnResumeStart;
    private static long sOnWindowFocusedChangeStart;

    static {
        Covode.recordClassIndex(14320);
    }

    static boolean isValid(String str) {
        if (TextUtils.isEmpty(sActivityName) || !TextUtils.equals(str, sActivityName)) {
            return false;
        }
        return true;
    }

    public static void onTrace(String str, String str2, boolean z) {
        if (!TextUtils.equals("onCreate", str2)) {
            boolean z2 = true;
            if (!TextUtils.equals("onResume", str2) || !isValid(str)) {
                if (TextUtils.equals("onWindowFocusChanged", str2) && isValid(str) && sOnCreateStart > 0) {
                    if (!isFirstWindowFocusChanged) {
                        AppInstrumentation.launcherActivityOnWindowFocusChangedStart(sActivityName);
                        isFirstWindowFocusChanged = true;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    sOnWindowFocusedChangeStart = currentTimeMillis;
                    if (currentTimeMillis - sOnCreateStart < 5000) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("begin_time", sOnCreateStart);
                            jSONObject.put("end_time", sOnWindowFocusedChangeStart);
                            jSONObject.put("page_type", "activity");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("onCreate", sOnCreateEnd - sOnCreateStart);
                            jSONObject2.put("onResume", sOnResumeEnd - sOnResumeStart);
                            jSONObject2.put("activityOnCreateToWindowFocusChanged", sOnWindowFocusedChangeStart - sOnCreateStart);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("scene", sActivityName);
                            if (sMethodSet.contains(sActivityName + str2)) {
                                z2 = false;
                            }
                            jSONObject3.put("is_first", z2);
                            sMethodSet.add(sActivityName + str2);
                            MonitorTool.monitorPerformance("page_load", jSONObject2, jSONObject3, jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                    sOnCreateStart = 0;
                    sActivityName = null;
                }
            } else if (z) {
                if (sOnCreateStart > 0) {
                    sOnResumeStart = System.currentTimeMillis();
                    if (!isFirstWindowFocusChanged) {
                        AppInstrumentation.launcherActivityOnResumeStart(sActivityName);
                    }
                    PageShowHelper.onPageShowHideAction(sActivityName, true);
                }
            } else if (sOnCreateStart > 0) {
                sOnResumeEnd = System.currentTimeMillis();
                if (!isFirstWindowFocusChanged) {
                    AppInstrumentation.launcherActivityOnResumeEnd();
                }
            }
        } else if (z) {
            sActivityName = str;
            sOnCreateStart = System.currentTimeMillis();
            if (!isFirstWindowFocusChanged) {
                AppInstrumentation.launcherActivityOnCreateStart(sActivityName);
            }
        } else if (isValid(str)) {
            sOnCreateEnd = System.currentTimeMillis();
            if (!isFirstWindowFocusChanged) {
                AppInstrumentation.launcherActivityOnCreateEnd();
            }
        }
    }
}
