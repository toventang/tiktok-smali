package com.tencent.wcdb;

import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.tencent.wcdb.database.c;

public class CursorWindow extends c implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR = new Parcelable.Creator<CursorWindow>() {
        /* class com.tencent.wcdb.CursorWindow.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103003);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CursorWindow[] newArray(int i2) {
            return new CursorWindow[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CursorWindow createFromParcel(Parcel parcel) {
            return new CursorWindow((byte) 0);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static int f154523d;

    /* renamed from: a  reason: collision with root package name */
    public long f154524a;

    /* renamed from: b  reason: collision with root package name */
    public int f154525b;

    /* renamed from: c  reason: collision with root package name */
    public final String f154526c;

    private static native boolean nativeAllocRow(long j2);

    private static native void nativeClear(long j2);

    static native void nativeCopyStringToBuffer(long j2, int i2, int i3, CharArrayBuffer charArrayBuffer);

    private static native long nativeCreate(String str, int i2);

    private static native void nativeDispose(long j2);

    private static native void nativeFreeLastRow(long j2);

    private static native byte[] nativeGetBlob(long j2, int i2, int i3);

    private static native double nativeGetDouble(long j2, int i2, int i3);

    private static native long nativeGetLong(long j2, int i2, int i3);

    private static native int nativeGetNumRows(long j2);

    private static native String nativeGetString(long j2, int i2, int i3);

    private static native int nativeGetType(long j2, int i2, int i3);

    private static native boolean nativePutBlob(long j2, byte[] bArr, int i2, int i3);

    private static native boolean nativePutDouble(long j2, double d2, int i2, int i3);

    private static native boolean nativePutLong(long j2, long j3, int i2, int i3);

    private static native boolean nativePutNull(long j2, int i2, int i3);

    private static native boolean nativePutString(long j2, String str, int i2, int i3);

    private static native boolean nativeSetNumColumns(long j2, int i2);

    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.wcdb.database.c
    public final void c() {
        f();
    }

    private CursorWindow() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            f();
        } finally {
            super.finalize();
        }
    }

    private void f() {
        MethodCollector.i(3054);
        long j2 = this.f154524a;
        if (j2 != 0) {
            nativeDispose(j2);
            this.f154524a = 0;
        }
        MethodCollector.o(3054);
    }

    public final int b() {
        MethodCollector.i(3058);
        d();
        try {
            return nativeGetNumRows(this.f154524a);
        } finally {
            e();
            MethodCollector.o(3058);
        }
    }

    static {
        Covode.recordClassIndex(103002);
        int identifier = Resources.getSystem().getIdentifier("config_cursorWindowSize", "integer", "android");
        if (identifier != 0) {
            f154523d = a(Resources.getSystem(), identifier) * 1024;
        } else {
            f154523d = 2097152;
        }
    }

    public final void a() {
        MethodCollector.i(3056);
        d();
        try {
            this.f154525b = 0;
            nativeClear(this.f154524a);
        } finally {
            e();
            MethodCollector.o(3056);
        }
    }

    public String toString() {
        return this.f154526c + " {" + Long.toHexString(this.f154524a) + "}";
    }

    /* synthetic */ CursorWindow(byte b2) {
        this();
    }

    public CursorWindow(String str) {
        MethodCollector.i(3052);
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.f154526c = str;
        long nativeCreate = nativeCreate(str, f154523d);
        this.f154524a = nativeCreate;
        if (nativeCreate != 0) {
            MethodCollector.o(3052);
            return;
        }
        f fVar = new f("Cursor window allocation of " + (f154523d / 1024) + " kb failed. ");
        MethodCollector.o(3052);
        throw fVar;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        throw new UnsupportedOperationException();
    }

    public final int a(int i2, int i3) {
        MethodCollector.i(3060);
        d();
        try {
            return nativeGetType(this.f154524a, i2 - this.f154525b, i3);
        } finally {
            e();
            MethodCollector.o(3060);
        }
    }

    public final String c(int i2, int i3) {
        MethodCollector.i(3071);
        d();
        try {
            return nativeGetString(this.f154524a, i2 - this.f154525b, i3);
        } finally {
            e();
            MethodCollector.o(3071);
        }
    }

    public final long d(int i2, int i3) {
        MethodCollector.i(3072);
        d();
        try {
            return nativeGetLong(this.f154524a, i2 - this.f154525b, i3);
        } finally {
            e();
            MethodCollector.o(3072);
        }
    }

    public final double e(int i2, int i3) {
        MethodCollector.i(3073);
        d();
        try {
            return nativeGetDouble(this.f154524a, i2 - this.f154525b, i3);
        } finally {
            e();
            MethodCollector.o(3073);
        }
    }

    public final byte[] b(int i2, int i3) {
        MethodCollector.i(3061);
        d();
        try {
            return nativeGetBlob(this.f154524a, i2 - this.f154525b, i3);
        } finally {
            e();
            MethodCollector.o(3061);
        }
    }

    private static int a(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }
}
