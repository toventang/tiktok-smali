package com.ss.android.ttve.monitor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static int f61218a;

    /* renamed from: b  reason: collision with root package name */
    public static int f61219b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference<IMonitor> f61220c;

    /* renamed from: d  reason: collision with root package name */
    static boolean f61221d = true;

    /* renamed from: e  reason: collision with root package name */
    private static String f61222e = "";

    public static boolean a(String str, String str2, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j2));
        return a(str, str2, hashMap);
    }

    public static boolean a(String str, String str2, float f2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f2));
        return a(str, str2, hashMap);
    }

    private static boolean a(WeakReference<IMonitor> weakReference, String str, Map map) {
        if (weakReference == null || weakReference.get() == null) {
            an.d("TEMonitor", "monitorEventToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || map == null) {
            an.d("TEMonitor", "monitorEventToBusiness param invalid");
            return false;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                a(map, jSONObject);
                return a(weakReference, str, jSONObject);
            } catch (JSONException e2) {
                an.d("TEMonitor", "monitorEventToBusiness json err: ".concat(String.valueOf(e2)));
                return false;
            }
        }
    }

    static boolean a(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        if (weakReference == null || weakReference.get() == null) {
            an.d("TEMonitor", "monitorEventJsonToBusiness business monitor invalid");
            return false;
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
            an.d("TEMonitor", "monitorEventJsonToBusiness param invalid");
            return false;
        } else {
            try {
                weakReference.get().monitorLog(str, jSONObject);
                return true;
            } catch (Exception e2) {
                an.d("TEMonitor", "Something happened when monitor log: ".concat(String.valueOf(e2)));
                return true;
            }
        }
    }

    private static boolean a(WeakReference<IMonitor> weakReference, String str, String str2, Map map) {
        if (!f61221d) {
            return a(weakReference, str2, map);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
            if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish") || str2.equals("iesve_veeditor_edit") || str2.equals("iesve_veeditor_cut") || str2.equals("iesve_veeditor_frame_report")) {
                a(str2, map, jSONObject);
            } else {
                a(map, jSONObject);
            }
            b(weakReference, str, jSONObject);
            return true;
        } catch (JSONException unused) {
            an.b("TEMonitor", "No monitor callback, skip");
            return false;
        }
    }

    public static void a(Map map, JSONObject jSONObject) {
        for (String str : map.keySet()) {
            str.startsWith("iesve_");
            int a2 = j.a(str);
            if (a2 == 1) {
                try {
                    jSONObject.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                } catch (Exception unused) {
                    an.d("TEMonitor", "Parse int error:" + map.get(str));
                }
            } else if (a2 == 2) {
                try {
                    jSONObject.put(str, (double) Float.parseFloat(String.valueOf(map.get(str))));
                } catch (Exception unused2) {
                    an.d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str, map.get(str));
            }
        }
    }

    static {
        Covode.recordClassIndex(37689);
    }

    private static int a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("completed")) {
                return jSONObject.getInt("completed");
            }
            return 0;
        } catch (JSONException e2) {
            an.d("TEMonitor", "get complete filed error!");
            e2.printStackTrace();
            return 0;
        }
    }

    public static void a(int i2) {
        if (i2 == 0) {
            a(0, "te_record_err_code", 0L);
        } else if (i2 == 1) {
            a(1, "te_edit_err_code", 0L);
            a(1, "te_composition_err_code", 0L);
        }
    }

    public static void a(String str, double d2) {
        MethodCollector.i(1807);
        if (TextUtils.isEmpty(str)) {
            an.c("TEMonitor", "perfDouble: key is null");
            MethodCollector.o(1807);
            return;
        }
        TEMonitorInvoker.nativePerfDouble(str, d2);
        MethodCollector.o(1807);
    }

    public static void a(String str, long j2) {
        MethodCollector.i(1804);
        if (TextUtils.isEmpty(str)) {
            an.c("TEMonitor", "perfLong: key is null");
            MethodCollector.o(1804);
            return;
        }
        TEMonitorInvoker.nativePerfLong(str, j2);
        MethodCollector.o(1804);
    }

    public static boolean a(String str, String str2, Map map) {
        return a(f61220c, str, str2, map);
    }

    public static void a(int i2, String str, double d2) {
        MethodCollector.i(1814);
        if (TextUtils.isEmpty(str)) {
            an.c("TEMonitor", "perfDouble: key is null");
            MethodCollector.o(1814);
            return;
        }
        TEMonitorInvoker.nativePerfDouble(i2, str, d2);
        MethodCollector.o(1814);
    }

    static void b(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i2;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            i2 = a(jSONObject);
            try {
                if (jSONObject.has("service")) {
                    str2 = jSONObject.getString("service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(f61222e)) {
                        f61222e = e.a("device_id") + "_" + System.currentTimeMillis();
                    }
                    jSONObject.put("te_record_compose_vid", f61222e);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    f61222e = "";
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            i2 = 0;
        }
        e.a(str2, i2, jSONObject);
        if (weakReference != null && weakReference.get() != null) {
            try {
                weakReference.get().monitorLog(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(int i2, String str, long j2) {
        MethodCollector.i(1811);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(1811);
            return;
        }
        TEMonitorInvoker.nativePerfLong(i2, str, j2);
        MethodCollector.o(1811);
    }

    public static void a(int i2, String str, String str2) {
        MethodCollector.i(1818);
        if (TextUtils.isEmpty(str)) {
            an.c("TEMonitor", "perfString: key is null");
            MethodCollector.o(1818);
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i2, str, str2);
        MethodCollector.o(1818);
    }

    private static void a(String str, Map map, JSONObject jSONObject) {
        int i2;
        for (String str2 : map.keySet()) {
            if (str.equals("iesve_veeditor_record_finish") || str.equals("iesve_veeditor_composition_finish") || str.equals("iesve_veeditor_edit") || str.equals("iesve_veeditor_cut")) {
                i2 = j.a(str2);
            } else {
                i2 = j.a(str2);
            }
            if (i2 == 1) {
                try {
                    jSONObject.put(str2, Integer.parseInt(String.valueOf(map.get(str2))));
                } catch (Exception unused) {
                    an.d("TEMonitor", "Parse int error:" + map.get(str2));
                }
            } else if (i2 == 2) {
                try {
                    jSONObject.put(str2, (double) Float.parseFloat(String.valueOf(map.get(str2))));
                } catch (Exception unused2) {
                    an.d("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }
}
