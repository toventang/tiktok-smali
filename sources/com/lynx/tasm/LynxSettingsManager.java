package com.lynx.tasm;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.google.gson.l;
import com.lynx.tasm.base.LLog;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;

public class LynxSettingsManager {
    private static volatile LynxSettingsManager sInstance;
    private SharedPreferences mSP = null;
    private HashMap<String, Object> mSettingDict = new HashMap<>();
    private Integer mSettingsTime = 0;

    static {
        Covode.recordClassIndex(34784);
    }

    /* access modifiers changed from: package-private */
    public String getLynxVersion() {
        return "2.1.5-rc.33-cxxshared";
    }

    /* access modifiers changed from: package-private */
    public Integer getSettingsTime() {
        return this.mSettingsTime;
    }

    public static LynxSettingsManager inst() {
        MethodCollector.i(12770);
        if (sInstance == null) {
            synchronized (LynxEnv.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LynxSettingsManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12770);
                    throw th;
                }
            }
        }
        LynxSettingsManager lynxSettingsManager = sInstance;
        MethodCollector.o(12770);
        return lynxSettingsManager;
    }

    public void tryToLoadLocalCachedSettings() {
        MethodCollector.i(12879);
        synchronized (this) {
            try {
                SharedPreferences sharedPreferences = this.mSP;
                if (sharedPreferences == null) {
                    LLog.a(6, "LynxSettingsManager", "please call initSettings first");
                } else if (!sharedPreferences.contains("settings")) {
                    LLog.a(4, "LynxSettingsManager", "Lynx load local cached settings: no cached.");
                    MethodCollector.o(12879);
                } else {
                    String string = this.mSP.getString("settings", "");
                    if (this.mSP.contains("settings_time")) {
                        this.mSettingsTime = Integer.valueOf(this.mSP.getInt("settings_time", 0));
                    } else {
                        this.mSettingsTime = 0;
                    }
                    f fVar = new f();
                    this.mSettingDict = (HashMap) fVar.a((l) ((l) fVar.a(string, l.class)).j(), (Class) this.mSettingDict.getClass());
                    LynxEnv.b().a(this.mSettingDict);
                    LLog.a(4, "LynxSettingsManager", "Lynx load local cached settings success");
                    MethodCollector.o(12879);
                }
            } finally {
                MethodCollector.o(12879);
            }
        }
    }

    private SharedPreferences initIfNot(Context context) {
        SharedPreferences sharedPreferences = this.mSP;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        return d.a(context, "lynx_settings_manager_sp", 0);
    }

    public void initSettings(Context context) {
        MethodCollector.i(12771);
        synchronized (this) {
            if (context != null) {
                try {
                    this.mSP = initIfNot(context);
                } catch (Throwable th) {
                    MethodCollector.o(12771);
                    throw th;
                }
            }
            tryToLoadLocalCachedSettings();
        }
        MethodCollector.o(12771);
    }

    public void setSettingsWithTime(String str, Integer num) {
        MethodCollector.i(12975);
        synchronized (this) {
            try {
                LLog.a(4, "LynxSettingsManager", "Lynx setSettings ".concat(String.valueOf(str)));
                f fVar = new f();
                this.mSettingDict = (HashMap) fVar.a((l) ((l) fVar.a(str, l.class)).j(), (Class) this.mSettingDict.getClass());
                this.mSettingsTime = num;
                LynxEnv.b().a(this.mSettingDict);
                SharedPreferences sharedPreferences = this.mSP;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("settings", str).apply();
                    this.mSP.edit().putInt("settings_time", this.mSettingsTime.intValue()).apply();
                }
            } finally {
                MethodCollector.o(12975);
            }
        }
    }
}
