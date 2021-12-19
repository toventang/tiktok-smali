package com.bytedance.android.live_settings.repo;

import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import java.util.Map;

public abstract class BaseRepo {
    private Keva dataRepo = getDataRepo();
    private f gson;

    static {
        Covode.recordClassIndex(7371);
    }

    /* access modifiers changed from: package-private */
    public abstract Keva getDataRepo();

    /* access modifiers changed from: package-private */
    public abstract String getTag();

    public void clear() {
        this.dataRepo.clear();
    }

    public Map<String, ?> getAll() {
        return this.dataRepo.getAll();
    }

    public void load() {
        this.dataRepo.name();
    }

    protected BaseRepo() {
    }

    public f getGson() {
        if (this.gson == null) {
            this.gson = NormalGson.singleton();
        }
        return this.gson;
    }

    public boolean contains(String str) {
        return this.dataRepo.contains(str);
    }

    public void erase(String str) {
        this.dataRepo.erase(str);
    }

    public boolean getBooleanValue(String str, boolean z) {
        return this.dataRepo.getBoolean(str, z);
    }

    public double getDoubleValue(String str, double d2) {
        return this.dataRepo.getDouble(str, d2);
    }

    public float getFloatValue(String str, float f2) {
        return this.dataRepo.getFloat(str, f2);
    }

    public int getIntValue(String str, int i2) {
        return this.dataRepo.getInt(str, i2);
    }

    public long getLongValue(String str, long j2) {
        return this.dataRepo.getLong(str, j2);
    }

    public String[] getStringArrayValue(String str, String[] strArr) {
        return this.dataRepo.getStringArray(str, strArr);
    }

    public String getStringValue(String str, String str2) {
        return this.dataRepo.getString(str, str2);
    }

    public void storeBooleanValue(String str, boolean z) {
        this.dataRepo.storeBoolean(str, z);
    }

    public void storeDoubleValue(String str, double d2) {
        this.dataRepo.storeDouble(str, d2);
    }

    public void storeFloatValue(String str, float f2) {
        this.dataRepo.storeFloat(str, f2);
    }

    public void storeIntValue(String str, int i2) {
        this.dataRepo.storeInt(str, i2);
    }

    public void storeLongValue(String str, long j2) {
        this.dataRepo.storeLong(str, j2);
    }

    public void storeStringArrayValue(String str, String[] strArr) {
        this.dataRepo.storeStringArray(str, strArr);
    }

    public void storeStringValue(String str, String str2) {
        this.dataRepo.storeString(str, str2);
    }

    public Object getValue(String str, Class cls) {
        try {
            return getGson().a(this.dataRepo.getString(str, null), cls);
        } catch (Throwable th) {
            SettingsManager.INSTANCE.getMonitor().reportException("BaseRepo#getValue", "exception: " + th.getMessage() + "  , key = " + str);
            return null;
        }
    }
}
