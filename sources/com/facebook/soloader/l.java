package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public abstract class l extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f49213a = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    protected final Context f49214f;

    /* renamed from: g  reason: collision with root package name */
    protected String f49215g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f49216h;

    static {
        Covode.recordClassIndex(30773);
    }

    /* access modifiers changed from: protected */
    public abstract e a();

    /* access modifiers changed from: protected */
    public static abstract class d implements Closeable {
        static {
            Covode.recordClassIndex(30778);
        }

        public abstract boolean a();

        public abstract c b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        protected d() {
        }
    }

    /* access modifiers changed from: protected */
    public static abstract class e implements Closeable {
        static {
            Covode.recordClassIndex(30779);
        }

        /* access modifiers changed from: protected */
        public abstract b b();

        /* access modifiers changed from: protected */
        public abstract d c();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        protected e() {
        }
    }

    /* access modifiers changed from: protected */
    public static final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final a f49226a;

        /* renamed from: b  reason: collision with root package name */
        public final InputStream f49227b;

        static {
            Covode.recordClassIndex(30777);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f49227b.close();
        }

        public c(a aVar, InputStream inputStream) {
            this.f49226a = aVar;
            this.f49227b = inputStream;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] b() {
        /*
            r5 = this;
            android.os.Parcel r4 = android.os.Parcel.obtain()
            com.facebook.soloader.l$e r3 = r5.a()
            com.facebook.soloader.l$b r0 = r3.b()     // Catch:{ all -> 0x0036 }
            com.facebook.soloader.l$a[] r2 = r0.f49225a     // Catch:{ all -> 0x0036 }
            r0 = 1
            r4.writeByte(r0)     // Catch:{ all -> 0x0036 }
            int r0 = r2.length     // Catch:{ all -> 0x0036 }
            r4.writeInt(r0)     // Catch:{ all -> 0x0036 }
            r1 = 0
        L_0x0017:
            int r0 = r2.length     // Catch:{ all -> 0x0036 }
            if (r1 >= r0) goto L_0x002b
            r0 = r2[r1]     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.f49223c     // Catch:{ all -> 0x0036 }
            r4.writeString(r0)     // Catch:{ all -> 0x0036 }
            r0 = r2[r1]     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.f49224d     // Catch:{ all -> 0x0036 }
            r4.writeString(r0)     // Catch:{ all -> 0x0036 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x002b:
            r3.close()
            byte[] r0 = r4.marshall()
            r4.recycle()
            return r0
        L_0x0036:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.l.b():byte[]");
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a[] f49225a;

        static {
            Covode.recordClassIndex(30776);
        }

        public b(a[] aVarArr) {
            this.f49225a = aVarArr;
        }

        static final b a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    a[] aVarArr = new a[readInt];
                    for (int i2 = 0; i2 < readInt; i2++) {
                        aVarArr[i2] = new a(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new b(aVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void a(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f49225a.length);
            int i2 = 0;
            while (true) {
                a[] aVarArr = this.f49225a;
                if (i2 < aVarArr.length) {
                    dataOutput.writeUTF(aVarArr[i2].f49223c);
                    dataOutput.writeUTF(this.f49225a[i2].f49224d);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private Object b(String str) {
        Object obj;
        synchronized (this.f49213a) {
            obj = this.f49213a.get(str);
            if (obj == null) {
                obj = new Object();
                this.f49213a.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(String str) {
        synchronized (b(str)) {
            this.f49215g = str;
            a(2);
        }
    }

    private void a(a[] aVarArr) {
        String[] list = this.f49199b.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < aVarArr.length) {
                            if (aVarArr[i2].f49223c.equals(str)) {
                                break;
                            }
                            i2++;
                            if (0 != 0) {
                                break;
                            }
                        } else {
                            j.a(new File(this.f49199b, str));
                            break;
                        }
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f49199b);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.i
    public final void a(int i2) {
        File file = this.f49199b;
        if (file.mkdirs() || file.isDirectory()) {
            f fVar = new f(new File(this.f49199b, "dso_lock"));
            try {
                if (!a(fVar, i2, b())) {
                }
            } finally {
                fVar.close();
            }
        } else {
            throw new IOException("cannot mkdir: ".concat(String.valueOf(file)));
        }
    }

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public final String f49223c;

        /* renamed from: d  reason: collision with root package name */
        public final String f49224d;

        static {
            Covode.recordClassIndex(30775);
        }

        public a(String str, String str2) {
            this.f49223c = str;
            this.f49224d = str2;
        }
    }

    protected l(Context context, String str) {
        super(new File(context.getApplicationInfo().dataDir + "/" + str), 1);
        this.f49214f = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r4, byte r5) {
        /*
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r3.<init>(r4, r0)
            r0 = 0
            r3.seek(r0)     // Catch:{ all -> 0x0021 }
            r3.write(r5)     // Catch:{ all -> 0x0021 }
            long r0 = r3.getFilePointer()     // Catch:{ all -> 0x0021 }
            r3.setLength(r0)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ all -> 0x0021 }
            r0.sync()     // Catch:{ all -> 0x0021 }
            r3.close()
            return
        L_0x0021:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x002c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.l.a(java.io.File, byte):void");
    }

    @Override // com.facebook.soloader.c, com.facebook.soloader.i
    public final int a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        int a2;
        synchronized (b(str)) {
            a2 = a(str, i2, this.f49199b, threadPolicy);
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5 != 1) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if ((r14 & 2) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a8, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b4, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c0, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(final com.facebook.soloader.f r13, int r14, final byte[] r15) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.l.a(com.facebook.soloader.f, int, byte[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0108, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010e, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0111, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(byte r15, com.facebook.soloader.l.b r16, com.facebook.soloader.l.d r17) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.l.a(byte, com.facebook.soloader.l$b, com.facebook.soloader.l$d):void");
    }
}
