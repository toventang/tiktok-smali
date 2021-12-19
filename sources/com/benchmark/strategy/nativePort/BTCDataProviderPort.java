package com.benchmark.strategy.nativePort;

import android.os.Bundle;
import com.benchmark.ByteBenchBundle;
import com.benchmark.tools.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class BTCDataProviderPort {
    static {
        Covode.recordClassIndex(3051);
    }

    private native void native_clearRepo(int i2);

    private native void native_closeRepo(int i2);

    private native boolean native_deleteRepo(int i2);

    private native void native_dumpRepo(int i2);

    private native boolean native_getBoolean(int i2, String str, boolean z);

    private native int native_getDeviceFeature(int i2, long j2);

    private native float native_getFloat(int i2, String str, float f2);

    private native int native_getInt(int i2, String str, int i3);

    private native long native_getLong(int i2, String str, long j2);

    private native String native_getString(int i2, String str);

    private native int native_init(String str);

    private native void native_isOpenRuntimeDecision(boolean z);

    private native void native_openRepo(int i2);

    private native void native_storeBoolean(int i2, String str, boolean z, boolean z2);

    private native void native_storeFloat(int i2, String str, boolean z, float f2);

    private native void native_storeInt(int i2, String str, boolean z, int i3);

    private native void native_storeLong(int i2, String str, boolean z, long j2);

    private native void native_storeString(int i2, String str, boolean z, String str2);

    private boolean ifEnableNativeEnvironment() {
        return a.f6364a;
    }

    /* renamed from: com.benchmark.strategy.nativePort.BTCDataProviderPort$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6363a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        static {
            /*
                r0 = 3052(0xbec, float:4.277E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.benchmark.port.a$a[] r0 = com.benchmark.port.a.EnumC0084a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.benchmark.strategy.nativePort.BTCDataProviderPort.AnonymousClass1.f6363a = r2
                com.benchmark.port.a$a r0 = com.benchmark.port.a.EnumC0084a.INT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.benchmark.strategy.nativePort.BTCDataProviderPort.AnonymousClass1.f6363a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.benchmark.port.a$a r0 = com.benchmark.port.a.EnumC0084a.FLOAT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.benchmark.strategy.nativePort.BTCDataProviderPort.AnonymousClass1.f6363a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.benchmark.port.a$a r0 = com.benchmark.port.a.EnumC0084a.STRING     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.benchmark.strategy.nativePort.BTCDataProviderPort.AnonymousClass1.f6363a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.benchmark.port.a$a r0 = com.benchmark.port.a.EnumC0084a.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.strategy.nativePort.BTCDataProviderPort.AnonymousClass1.<clinit>():void");
        }
    }

    public void clearRepo(int i2) {
        MethodCollector.i(1443);
        if (ifEnableNativeEnvironment()) {
            native_clearRepo(i2);
        }
        MethodCollector.o(1443);
    }

    public void closeRepo(int i2) {
        MethodCollector.i(1440);
        if (ifEnableNativeEnvironment()) {
            native_closeRepo(i2);
        }
        MethodCollector.o(1440);
    }

    public Boolean deleteRepo(int i2) {
        MethodCollector.i(1441);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1441);
            return false;
        }
        Boolean valueOf = Boolean.valueOf(native_deleteRepo(i2));
        MethodCollector.o(1441);
        return valueOf;
    }

    public void dumpRepo(int i2) {
        MethodCollector.i(1444);
        if (ifEnableNativeEnvironment()) {
            native_dumpRepo(i2);
        }
        MethodCollector.o(1444);
    }

    public int init(String str) {
        MethodCollector.i(1437);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1437);
            return -1;
        }
        int native_init = native_init(str);
        MethodCollector.o(1437);
        return native_init;
    }

    public void isOpenRuntimeDecision(boolean z) {
        MethodCollector.i(1438);
        if (ifEnableNativeEnvironment()) {
            native_isOpenRuntimeDecision(z);
        }
        MethodCollector.o(1438);
    }

    public void openRepo(int i2) {
        MethodCollector.i(1439);
        if (ifEnableNativeEnvironment()) {
            native_openRepo(i2);
        }
        MethodCollector.o(1439);
    }

    public String getString(int i2, String str) {
        MethodCollector.i(1446);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1446);
            return null;
        }
        String native_getString = native_getString(i2, str);
        MethodCollector.o(1446);
        return native_getString;
    }

    public boolean getBoolean(int i2, String str, boolean z) {
        MethodCollector.i(1450);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1450);
            return z;
        }
        boolean native_getBoolean = native_getBoolean(i2, str, z);
        MethodCollector.o(1450);
        return native_getBoolean;
    }

    public float getFloat(int i2, String str, float f2) {
        MethodCollector.i(1449);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1449);
            return f2;
        }
        float native_getFloat = native_getFloat(i2, str, f2);
        MethodCollector.o(1449);
        return native_getFloat;
    }

    public int getInt(int i2, String str, int i3) {
        MethodCollector.i(1447);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1447);
            return i3;
        }
        int native_getInt = native_getInt(i2, str, i3);
        MethodCollector.o(1447);
        return native_getInt;
    }

    public long getLong(int i2, String str, long j2) {
        MethodCollector.i(1448);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1448);
            return j2;
        }
        long native_getLong = native_getLong(i2, str, j2);
        MethodCollector.o(1448);
        return native_getLong;
    }

    public void getDeviceFeature(int i2, com.benchmark.port.a[] aVarArr, Bundle bundle) {
        MethodCollector.i(1453);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1453);
            return;
        }
        ByteBenchBundle obtain = ByteBenchBundle.obtain();
        native_getDeviceFeature(i2, obtain.getHandle());
        for (com.benchmark.port.a aVar : aVarArr) {
            int i3 = AnonymousClass1.f6363a[aVar.f6321k.ordinal()];
            if (i3 == 1) {
                bundle.putInt(aVar.f6320j, obtain.getInt(aVar.f6320j));
            } else if (i3 == 2) {
                bundle.putFloat(aVar.f6320j, obtain.getFloat(aVar.f6320j));
            } else if (i3 == 3) {
                bundle.putString(aVar.f6320j, obtain.getString(aVar.f6320j));
            } else if (i3 == 4) {
                bundle.putBoolean(aVar.f6320j, obtain.getBool(aVar.f6320j));
            }
        }
        obtain.recycle();
        MethodCollector.o(1453);
    }

    public void storeBoolean(int i2, String str, boolean z, boolean z2) {
        MethodCollector.i(1460);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1460);
            return;
        }
        native_storeBoolean(i2, str, z, z2);
        MethodCollector.o(1460);
    }

    public void storeFloat(int i2, String str, boolean z, float f2) {
        MethodCollector.i(1462);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1462);
            return;
        }
        native_storeFloat(i2, str, z, f2);
        MethodCollector.o(1462);
    }

    public void storeInt(int i2, String str, boolean z, int i3) {
        MethodCollector.i(1455);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1455);
            return;
        }
        native_storeInt(i2, str, z, i3);
        MethodCollector.o(1455);
    }

    public void storeLong(int i2, String str, boolean z, long j2) {
        MethodCollector.i(1458);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1458);
            return;
        }
        native_storeLong(i2, str, z, j2);
        MethodCollector.o(1458);
    }

    public void storeString(int i2, String str, boolean z, String str2) {
        MethodCollector.i(1459);
        if (!ifEnableNativeEnvironment()) {
            MethodCollector.o(1459);
            return;
        }
        native_storeString(i2, str, z, str2);
        MethodCollector.o(1459);
    }
}
