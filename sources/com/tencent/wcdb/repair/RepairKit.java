package com.tencent.wcdb.repair;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.database.SQLiteException;
import com.tencent.wcdb.support.a;

public class RepairKit implements a.AbstractC4112a {

    /* renamed from: a  reason: collision with root package name */
    public long f154693a;

    /* renamed from: b  reason: collision with root package name */
    public int f154694b;

    /* renamed from: c  reason: collision with root package name */
    public b f154695c;

    /* renamed from: d  reason: collision with root package name */
    public a f154696d;

    /* renamed from: e  reason: collision with root package name */
    public RepairCursor f154697e;

    public interface a {
        static {
            Covode.recordClassIndex(103079);
        }

        int a(String str, int i2);
    }

    static {
        Covode.recordClassIndex(103077);
    }

    private static native void nativeCancel(long j2);

    private static native void nativeFini(long j2);

    public static native void nativeFreeMaster(long j2);

    private static native long nativeInit(String str, byte[] bArr, SQLiteCipherSpec sQLiteCipherSpec, byte[] bArr2);

    public static native int nativeIntegrityFlags(long j2);

    private static native String nativeLastError();

    public static native long nativeLoadMaster(String str, byte[] bArr, String[] strArr, byte[] bArr2);

    public static native long nativeMakeMaster(String[] strArr);

    public static native boolean nativeSaveMaster(long j2, String str, byte[] bArr);

    public native int nativeOutput(long j2, long j3, long j4, int i2);

    /* access modifiers changed from: package-private */
    public static class RepairCursor extends com.tencent.wcdb.a {

        /* renamed from: i  reason: collision with root package name */
        long f154698i;

        static {
            Covode.recordClassIndex(103078);
        }

        private static native byte[] nativeGetBlob(long j2, int i2);

        private static native int nativeGetColumnCount(long j2);

        private static native double nativeGetDouble(long j2, int i2);

        private static native long nativeGetLong(long j2, int i2);

        private static native String nativeGetString(long j2, int i2);

        private static native int nativeGetType(long j2, int i2);

        private RepairCursor() {
        }

        @Override // com.tencent.wcdb.a
        public String[] getColumnNames() {
            throw new UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
        public int getCount() {
            throw new UnsupportedOperationException();
        }

        @Override // com.tencent.wcdb.a
        public int getColumnCount() {
            MethodCollector.i(3964);
            int nativeGetColumnCount = nativeGetColumnCount(this.f154698i);
            MethodCollector.o(3964);
            return nativeGetColumnCount;
        }

        /* synthetic */ RepairCursor(byte b2) {
            this();
        }

        public float getFloat(int i2) {
            return (float) getDouble(i2);
        }

        @Override // com.tencent.wcdb.d
        public int getInt(int i2) {
            return (int) getLong(i2);
        }

        public short getShort(int i2) {
            return (short) ((int) getLong(i2));
        }

        @Override // com.tencent.wcdb.a
        public byte[] getBlob(int i2) {
            MethodCollector.i(61);
            byte[] nativeGetBlob = nativeGetBlob(this.f154698i, i2);
            MethodCollector.o(61);
            return nativeGetBlob;
        }

        public double getDouble(int i2) {
            MethodCollector.i(60);
            double nativeGetDouble = nativeGetDouble(this.f154698i, i2);
            MethodCollector.o(60);
            return nativeGetDouble;
        }

        @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
        public long getLong(int i2) {
            MethodCollector.i(59);
            long nativeGetLong = nativeGetLong(this.f154698i, i2);
            MethodCollector.o(59);
            return nativeGetLong;
        }

        @Override // com.tencent.wcdb.d, com.tencent.wcdb.a
        public String getString(int i2) {
            MethodCollector.i(4149);
            String nativeGetString = nativeGetString(this.f154698i, i2);
            MethodCollector.o(4149);
            return nativeGetString;
        }

        @Override // com.tencent.wcdb.a
        public int getType(int i2) {
            MethodCollector.i(3967);
            int nativeGetType = nativeGetType(this.f154698i, i2);
            MethodCollector.o(3967);
            return nativeGetType;
        }

        public boolean isNull(int i2) {
            if (getType(i2) == 0) {
                return true;
            }
            return false;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f154699a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f154700b;

        static {
            Covode.recordClassIndex(103080);
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            a();
            super.finalize();
        }

        public final void a() {
            MethodCollector.i(66);
            long j2 = this.f154699a;
            if (j2 == 0) {
                MethodCollector.o(66);
                return;
            }
            RepairKit.nativeFreeMaster(j2);
            this.f154699a = 0;
            MethodCollector.o(66);
        }

        public b(long j2, byte[] bArr) {
            this.f154699a = j2;
            this.f154700b = bArr;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        a();
        super.finalize();
    }

    public final void a() {
        MethodCollector.i(76);
        b bVar = this.f154695c;
        if (bVar != null) {
            bVar.a();
            this.f154695c = null;
        }
        long j2 = this.f154693a;
        if (j2 != 0) {
            nativeFini(j2);
            this.f154693a = 0;
        }
        MethodCollector.o(76);
    }

    @Override // com.tencent.wcdb.support.a.AbstractC4112a
    public final void b() {
        MethodCollector.i(77);
        long j2 = this.f154693a;
        if (j2 == 0) {
            MethodCollector.o(77);
            return;
        }
        nativeCancel(j2);
        MethodCollector.o(77);
    }

    private int onProgress(String str, int i2, long j2) {
        if (this.f154696d == null) {
            return 0;
        }
        if (this.f154697e == null) {
            this.f154697e = new RepairCursor((byte) 0);
        }
        this.f154697e.f154698i = j2;
        return this.f154696d.a(str, i2);
    }

    public RepairKit(String str, byte[] bArr, b bVar) {
        byte[] bArr2;
        MethodCollector.i(75);
        if (str != null) {
            if (bVar == null) {
                bArr2 = null;
            } else {
                bArr2 = bVar.f154700b;
            }
            long nativeInit = nativeInit(str, bArr, null, bArr2);
            this.f154693a = nativeInit;
            if (nativeInit != 0) {
                this.f154694b = nativeIntegrityFlags(nativeInit);
                this.f154695c = bVar;
                MethodCollector.o(75);
                return;
            }
            SQLiteException sQLiteException = new SQLiteException("Failed initialize RepairKit.");
            MethodCollector.o(75);
            throw sQLiteException;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        MethodCollector.o(75);
        throw illegalArgumentException;
    }
}
