package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {

    /* renamed from: Ι  reason: contains not printable characters */
    private static AppsFlyerProperties f126 = new AppsFlyerProperties();

    /* renamed from: ı  reason: contains not printable characters */
    private String f127;

    /* renamed from: ǃ  reason: contains not printable characters */
    private boolean f128;

    /* renamed from: ɩ  reason: contains not printable characters */
    private Map<String, Object> f129 = new HashMap();

    /* renamed from: ɹ  reason: contains not printable characters */
    private boolean f130 = false;

    /* renamed from: ι  reason: contains not printable characters */
    private boolean f131;

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled() {
        this.f131 = true;
    }

    /* access modifiers changed from: protected */
    public void setOnReceiveCalled() {
        this.f128 = true;
    }

    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        

        /* renamed from: ǃ  reason: contains not printable characters */
        private final int f133;

        public final int getValue() {
            return this.f133;
        }

        static {
            Covode.recordClassIndex(2679);
        }

        private EmailsCryptType(int i2) {
            this.f133 = i2;
        }
    }

    public static AppsFlyerProperties getInstance() {
        return f126;
    }

    /* renamed from: ι  reason: contains not printable characters */
    private boolean m111() {
        return this.f130;
    }

    /* access modifiers changed from: protected */
    public boolean isFirstLaunchCalled() {
        return this.f131;
    }

    /* access modifiers changed from: protected */
    public boolean isOnReceiveCalled() {
        return this.f128;
    }

    public boolean isEnableLog() {
        return getBoolean("shouldLog", true);
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean("disableLogs", false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean("disableOtherSdk", false);
    }

    static {
        Covode.recordClassIndex(2678);
    }

    private AppsFlyerProperties() {
    }

    /* access modifiers changed from: protected */
    public void setFirstLaunchCalled(boolean z) {
        this.f131 = z;
    }

    /* access modifiers changed from: protected */
    public void setReferrer(String str) {
        set("AF_REFERRER", str);
        this.f127 = str;
    }

    public synchronized Object getObject(String str) {
        Object obj;
        MethodCollector.i(2989);
        obj = this.f129.get(str);
        MethodCollector.o(2989);
        return obj;
    }

    public synchronized String getString(String str) {
        String str2;
        MethodCollector.i(2927);
        str2 = (String) this.f129.get(str);
        MethodCollector.o(2927);
        return str2;
    }

    public synchronized void remove(String str) {
        MethodCollector.i(2422);
        this.f129.remove(str);
        MethodCollector.o(2422);
    }

    public synchronized void setCustomData(String str) {
        MethodCollector.i(2440);
        this.f129.put("additionalCustomData", str);
        MethodCollector.o(2440);
    }

    public synchronized void setUserEmails(String str) {
        MethodCollector.i(2926);
        this.f129.put("userEmails", str);
        MethodCollector.o(2926);
    }

    public String getReferrer(Context context) {
        String str = this.f127;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return AppsFlyerLibCore.getSharedPreferences(context).getString("referrer", null);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        MethodCollector.i(3556);
        sharedPreferences.edit().putString("savedProperties", new JSONObject(this.f129).toString()).apply();
        MethodCollector.o(3556);
    }

    public synchronized void loadProperties(Context context) {
        MethodCollector.i(623);
        if (m111()) {
            MethodCollector.o(623);
            return;
        }
        String string = AppsFlyerLibCore.getSharedPreferences(context).getString("savedProperties", null);
        if (string != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (this.f129.get(next) == null) {
                        this.f129.put(next, jSONObject.getString(next));
                    }
                }
                this.f130 = true;
            } catch (JSONException e2) {
                AFLogger.afErrorLog("Failed loading properties", e2);
            }
            AFLogger.afDebugLog(new StringBuilder("Done loading properties: ").append(this.f130).toString());
        }
        MethodCollector.o(623);
    }

    public boolean getBoolean(String str, boolean z) {
        String string = getString(str);
        if (string == null) {
            return z;
        }
        return Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i2) {
        String string = getString(str);
        if (string == null) {
            return i2;
        }
        return Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j2) {
        String string = getString(str);
        if (string == null) {
            return j2;
        }
        return Long.valueOf(string).longValue();
    }

    public synchronized void set(String str, int i2) {
        MethodCollector.i(2432);
        this.f129.put(str, Integer.toString(i2));
        MethodCollector.o(2432);
    }

    public synchronized void set(String str, long j2) {
        MethodCollector.i(2434);
        this.f129.put(str, Long.toString(j2));
        MethodCollector.o(2434);
    }

    public synchronized void set(String str, String str2) {
        MethodCollector.i(2426);
        this.f129.put(str, str2);
        MethodCollector.o(2426);
    }

    public synchronized void set(String str, boolean z) {
        MethodCollector.i(2436);
        this.f129.put(str, Boolean.toString(z));
        MethodCollector.o(2436);
    }

    public synchronized void set(String str, String[] strArr) {
        MethodCollector.i(2428);
        this.f129.put(str, strArr);
        MethodCollector.o(2428);
    }
}
