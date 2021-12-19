package com.benchmark.presenter;

import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.benchmark.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SensorInfoBridge {
    static {
        Covode.recordClassIndex(3040);
    }

    public static int com_benchmark_presenter_SensorInfoBridge_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    private String keyToString(int i2) {
        if (i2 == 12) {
            return "relative_humidity";
        }
        if (i2 == 13) {
            return "temperature";
        }
        if (i2 == 18) {
            return "step_detector";
        }
        if (i2 == 19) {
            return "step_counter";
        }
        switch (i2) {
            case 1:
                return "accelerometer";
            case 2:
                return "magnetic_field";
            case 3:
                return "orientation";
            case 4:
                return "gyroscope";
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return "light";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return "pressure";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return "temperature";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return "proximity";
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return "gravity";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                return "linear_acceleration";
            default:
                return "other";
        }
    }

    public String getSensorInfo() {
        SensorManager sensorManager;
        Context context = b.f6095l.f6096a;
        if (context == null || (sensorManager = (SensorManager) com_benchmark_presenter_SensorInfoBridge_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "sensor")) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Sensor sensor : sensorManager.getSensorList(-1)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(StringSet.name, sensor.getName());
                jSONObject2.put("maxRange", (double) sensor.getMaximumRange());
                jSONObject2.put("minDelay", sensor.getMinDelay());
                jSONObject2.put("power", (double) sensor.getPower());
                jSONObject2.put("resolution", (double) sensor.getResolution());
                jSONObject2.put(StringSet.type, sensor.getType());
                jSONObject2.put("vendor", sensor.getVendor());
                jSONObject2.put("version", sensor.getVersion());
                String valueOf = String.valueOf(sensor.getType());
                if (!jSONObject.has(valueOf)) {
                    jSONObject.put(valueOf, new JSONArray());
                }
                jSONObject.getJSONArray(valueOf).put(jSONObject2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com_benchmark_presenter_SensorInfoBridge_com_ss_android_ugc_aweme_lancet_LogLancet_i("SensorInfoBridge", "getSensorInfo: " + jSONObject.toString());
        return jSONObject.toString();
    }

    public static Object com_benchmark_presenter_SensorInfoBridge_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(11644);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11644);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
