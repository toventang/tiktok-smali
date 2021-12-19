package com.ss.bytertc.base.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.bytertc.base.utils.JsonUtils;
import org.webrtc.ContextUtils;

public class RtcPreferences {
    private static volatile RtcPreferences sInstance;
    private final SharedPreferences mSharedPreferences;

    static {
        Covode.recordClassIndex(100710);
    }

    private static RtcPreferences getInstance() {
        return instance(ContextUtils.getApplicationContext());
    }

    private RtcPreferences(Context context) {
        this.mSharedPreferences = d.a(context, "rtc_preference", 0);
    }

    public void remove(String str) {
        if (str != null) {
            SharedPreferences.Editor edit = this.mSharedPreferences.edit();
            edit.remove(str);
            edit.apply();
        }
    }

    public static RtcPreferences instance(Context context) {
        MethodCollector.i(7183);
        if (sInstance == null) {
            synchronized (RtcPreferences.class) {
                if (context != null) {
                    try {
                        sInstance = new RtcPreferences(context);
                    } catch (Throwable th) {
                        MethodCollector.o(7183);
                        throw th;
                    }
                } else {
                    RuntimeException runtimeException = new RuntimeException("unable to init RtcPreferences without context");
                    MethodCollector.o(7183);
                    throw runtimeException;
                }
            }
        }
        RtcPreferences rtcPreferences = sInstance;
        MethodCollector.o(7183);
        return rtcPreferences;
    }

    public int getInt(String str, int i2) {
        return this.mSharedPreferences.getInt(str, i2);
    }

    public String getString(String str, String str2) {
        return this.mSharedPreferences.getString(str, str2);
    }

    public void put(String str, Object obj) {
        putString(str, JsonUtils.toJson(obj));
    }

    public <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        return (T) JsonUtils.fromJson(string, cls);
    }

    public void putInt(String str, int i2) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putInt(str, i2);
        edit.apply();
    }

    public void putString(String str, String str2) {
        SharedPreferences.Editor edit = this.mSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
