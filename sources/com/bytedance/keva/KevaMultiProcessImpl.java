package com.bytedance.keva;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class KevaMultiProcessImpl extends KevaImpl {
    static {
        Covode.recordClassIndex(24513);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dump() {
        super.dump();
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dumpNative() {
        super.dumpNative();
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String name() {
        return super.name();
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        int size;
        MethodCollector.i(9253);
        synchronized (this) {
            try {
                this.mValueMap.clear();
                try {
                    rebuildValueMap(this.mHandle);
                    checkReportException(this.mHandle);
                    size = this.mValueMap.size();
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, name(), null, null, th);
                    MethodCollector.o(9253);
                    return 0;
                }
            } finally {
                MethodCollector.o(9253);
            }
        }
        return size;
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        Map<String, ?> buildNewMap;
        MethodCollector.i(9069);
        synchronized (this) {
            try {
                this.mValueMap.clear();
                try {
                    rebuildValueMap(this.mHandle);
                    checkReportException(this.mHandle);
                } catch (Throwable th) {
                    sMonitor.reportThrowable(2, name(), null, null, th);
                }
                buildNewMap = buildNewMap(new HashMap());
            } finally {
                MethodCollector.o(9069);
            }
        }
        return buildNewMap;
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void erase(String str) {
        super.erase(str);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        super.registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        super.unRegisterChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ Map buildNewMap(Map map) {
        return super.buildNewMap(map);
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        long j2;
        boolean contains;
        MethodCollector.i(9250);
        synchronized (this) {
            try {
                KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
                long j3 = this.mHandle;
                if (kevaValueWrapper == null) {
                    j2 = 0;
                } else {
                    j2 = kevaValueWrapper.offset;
                }
                contains = contains(j3, str, j2);
                try {
                } catch (Throwable th) {
                    MethodCollector.o(9250);
                    throw th;
                }
            } catch (Throwable th2) {
                sMonitor.reportThrowable(2, name(), str, null, th2);
                MethodCollector.o(9250);
                return false;
            }
        }
        MethodCollector.o(9250);
        return contains;
    }

    KevaMultiProcessImpl(String str, int i2) {
        super(str, i2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeBoolean(String str, boolean z) {
        super.storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeBytes(String str, byte[] bArr) {
        super.storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeBytesJustDisk(String str, byte[] bArr) {
        super.storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeDouble(String str, double d2) {
        super.storeDouble(str, d2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeFloat(String str, float f2) {
        super.storeFloat(str, f2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeInt(String str, int i2) {
        super.storeInt(str, i2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeLong(String str, long j2) {
        super.storeLong(str, j2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeString(String str, String str2) {
        super.storeString(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringArray(String str, String[] strArr) {
        super.storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringArrayJustDisk(String str, String[] strArr) {
        super.storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringJustDisk(String str, String str2) {
        super.storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringSet(String str, Set set) {
        super.storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void storeStringSetJustDisk(String str, Set set) {
        super.storeStringSetJustDisk(str, set);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ boolean getBoolean(String str, boolean z) {
        return super.getBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ byte[] getBytes(String str, byte[] bArr) {
        return super.getBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ byte[] getBytesJustDisk(String str, byte[] bArr) {
        return super.getBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ double getDouble(String str, double d2) {
        return super.getDouble(str, d2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ float getFloat(String str, float f2) {
        return super.getFloat(str, f2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ int getInt(String str, int i2) {
        return super.getInt(str, i2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ long getLong(String str, long j2) {
        return super.getLong(str, j2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String getString(String str, String str2) {
        return super.getString(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String[] getStringArray(String str, String[] strArr) {
        return super.getStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String[] getStringArrayJustDisk(String str, String[] strArr) {
        return super.getStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ String getStringJustDisk(String str, String str2) {
        return super.getStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ Set getStringSet(String str, Set set) {
        return super.getStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva, com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ Set getStringSetJustDisk(String str, Set set) {
        return super.getStringSetJustDisk(str, set);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public boolean fetchBoolean(String str, boolean z) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchBoolean(j3, str, j2, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public double fetchDouble(String str, double d2) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchDouble(j3, str, j2, d2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public float fetchFloat(String str, float f2) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchFloat(j3, str, j2, f2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public int fetchInt(String str, int i2) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchInt(j3, str, j2, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public long fetchLong(String str, long j2) {
        long j3;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j4 = this.mHandle;
        if (kevaValueWrapper == null) {
            j3 = 0;
        } else {
            j3 = kevaValueWrapper.offset;
        }
        return fetchLong(j4, str, j3, j2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public String fetchString(String str, String str2, boolean z) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchString(j3, str, j2, str2);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchStringArray(j3, str, j2, strArr, 3);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.keva.KevaImpl
    public byte[] fetchBytes(String str, byte[] bArr, int i2, boolean z) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = (KevaImpl.KevaValueWrapper) this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchBytes(j3, str, j2, bArr, i2);
    }
}
