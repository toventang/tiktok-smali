package com.bytedance.keva;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;

public abstract class Keva {

    public interface OnChangeListener {
        static {
            Covode.recordClassIndex(24498);
        }

        void onChanged(Keva keva, String str);
    }

    static {
        Covode.recordClassIndex(24497);
    }

    public abstract Map<String, Object> buildNewMap(Map<String, Object> map);

    public abstract void clear();

    public abstract boolean contains(String str);

    public abstract int count();

    public abstract void dump();

    public abstract void erase(String str);

    public abstract Map<String, ?> getAll();

    public abstract boolean getBoolean(String str, boolean z);

    public abstract byte[] getBytes(String str, byte[] bArr);

    public abstract byte[] getBytesJustDisk(String str, byte[] bArr);

    public abstract double getDouble(String str, double d2);

    public abstract float getFloat(String str, float f2);

    public abstract int getInt(String str, int i2);

    public abstract long getLong(String str, long j2);

    public abstract String getString(String str, String str2);

    public abstract String[] getStringArray(String str, String[] strArr);

    public abstract String[] getStringArrayJustDisk(String str, String[] strArr);

    public abstract String getStringJustDisk(String str, String str2);

    public abstract Set<String> getStringSet(String str, Set<String> set);

    public abstract Set<String> getStringSetJustDisk(String str, Set<String> set);

    public abstract String name();

    public abstract void registerChangeListener(OnChangeListener onChangeListener);

    public abstract void storeBoolean(String str, boolean z);

    public abstract void storeBytes(String str, byte[] bArr);

    public abstract void storeBytesJustDisk(String str, byte[] bArr);

    public abstract void storeDouble(String str, double d2);

    public abstract void storeFloat(String str, float f2);

    public abstract void storeInt(String str, int i2);

    public abstract void storeLong(String str, long j2);

    public abstract void storeString(String str, String str2);

    public abstract void storeStringArray(String str, String[] strArr);

    public abstract void storeStringArrayJustDisk(String str, String[] strArr);

    public abstract void storeStringJustDisk(String str, String str2);

    public abstract void storeStringSet(String str, Set<String> set);

    public abstract void storeStringSetJustDisk(String str, Set<String> set);

    public abstract void unRegisterChangeListener(OnChangeListener onChangeListener);

    public static void forceInit() {
        KevaImpl.forceInitImpl();
    }

    public int calculateSize() {
        return count();
    }

    public static Keva getRepo(String str) {
        return KevaImpl.getRepo(str, 0);
    }

    public static boolean isRepoPorted(String str) {
        return KevaImpl.isRepoPorted(str);
    }

    public static Keva getRepoSync(String str, int i2) {
        return KevaImpl.getRepoSync(str, i2);
    }

    public static Keva getRepo(String str, int i2) {
        return KevaImpl.getRepo(str, i2);
    }

    public static Keva getRepoFromSp(Context context, String str, int i2) {
        return KevaImpl.getRepoFromSp(context, str, i2);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i2) {
        return KevaImpl.getRepoFromSpSync(context, str, i2);
    }
}
