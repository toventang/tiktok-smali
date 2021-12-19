package com.bytedance.android.live_settings;

import com.bytedance.android.live_settings.repo.SettingsRepo;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class SettingsValueProvider {
    public static final SettingsValueProvider INSTANCE = new SettingsValueProvider();

    private SettingsValueProvider() {
    }

    private final boolean isSettingsSaving() {
        return SaveSettingsValue.isSaving;
    }

    public final void clear() {
        SettingsRepo.INSTANCE.clear();
    }

    static {
        Covode.recordClassIndex(7370);
    }

    public final boolean getBooleanValue(String str, boolean z) {
        l.c(str, "");
        if (isSettingsSaving()) {
            return z;
        }
        return SettingsRepo.INSTANCE.getBooleanValue(str, z);
    }

    public final double getDoubleValue(String str, double d2) {
        l.c(str, "");
        if (isSettingsSaving()) {
            return d2;
        }
        return SettingsRepo.INSTANCE.getDoubleValue(str, d2);
    }

    public final float getFloatValue(String str, float f2) {
        l.c(str, "");
        if (isSettingsSaving()) {
            return f2;
        }
        return SettingsRepo.INSTANCE.getFloatValue(str, f2);
    }

    public final int getIntValue(String str, int i2) {
        l.c(str, "");
        if (isSettingsSaving()) {
            return i2;
        }
        return SettingsRepo.INSTANCE.getIntValue(str, i2);
    }

    public final long getLongValue(String str, long j2) {
        l.c(str, "");
        if (isSettingsSaving()) {
            return j2;
        }
        return SettingsRepo.INSTANCE.getLongValue(str, j2);
    }

    public final String[] getStringArrayValue(String str, String[] strArr) {
        l.c(str, "");
        l.c(strArr, "");
        if (isSettingsSaving()) {
            return strArr;
        }
        String[] stringArrayValue = SettingsRepo.INSTANCE.getStringArrayValue(str, strArr);
        l.a((Object) stringArrayValue, "");
        return stringArrayValue;
    }

    public final String getStringValue(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        if (isSettingsSaving()) {
            return str2;
        }
        String stringValue = SettingsRepo.INSTANCE.getStringValue(str, str2);
        l.a((Object) stringValue, "");
        return stringValue;
    }

    public final Object getValue(String str, Class<?> cls) {
        l.c(str, "");
        l.c(cls, "");
        if (isSettingsSaving()) {
            return null;
        }
        return SettingsRepo.INSTANCE.getValue(str, cls);
    }
}
