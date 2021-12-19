package com.bytedance.shadowhook;

import com.bytedance.covode.number.Covode;

public class ShadowHook {

    /* renamed from: a  reason: collision with root package name */
    public static final int f44103a = a.SHARED.value;

    /* renamed from: b  reason: collision with root package name */
    private static int f44104b = 2;

    private static native int nativeGetInitErrno();

    private static native String nativeGetRecords();

    private static native int nativeInit(int i2, boolean z);

    private static native void nativeSetDebuggable(boolean z);

    private static native String nativeToErrmsg(int i2);

    static {
        Covode.recordClassIndex(26966);
    }

    public enum a {
        SHARED(0),
        UNIQUE(1);
        
        public final int value;

        static {
            Covode.recordClassIndex(26967);
        }

        private a(int i2) {
            this.value = i2;
        }
    }
}
