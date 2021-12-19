package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.shortvideo.ag;
import com.ss.android.ugc.aweme.shortvideo.upload.aa;
import com.ss.android.ugc.aweme.shortvideo.upload.i;
import com.ss.android.ugc.aweme.shortvideo.upload.j;
import com.ss.android.ugc.aweme.shortvideo.upload.l;
import com.ss.android.ugc.aweme.shortvideo.upload.m;
import com.ss.android.ugc.aweme.shortvideo.upload.p;
import com.ss.android.ugc.aweme.shortvideo.upload.s;
import com.ss.android.ugc.aweme.shortvideo.upload.x;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.tools.utils.q;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public final class af implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Lock f124890a;

    /* renamed from: b  reason: collision with root package name */
    public final Condition f124891b;

    /* renamed from: c  reason: collision with root package name */
    public final Lock f124892c;

    /* renamed from: d  reason: collision with root package name */
    public final Condition f124893d;

    /* renamed from: e  reason: collision with root package name */
    public final p f124894e = new p();

    /* renamed from: f  reason: collision with root package name */
    public final RandomAccessFile f124895f;

    /* renamed from: g  reason: collision with root package name */
    public volatile int f124896g = 0;

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f124897h;

    /* renamed from: i  reason: collision with root package name */
    public volatile i.c f124898i;

    /* renamed from: j  reason: collision with root package name */
    public l.a f124899j;

    /* renamed from: k  reason: collision with root package name */
    public int f124900k = 0;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f124901l = null;

    /* renamed from: m  reason: collision with root package name */
    public final LinkedList<aa> f124902m = new LinkedList<>();
    public final File n;
    public int o = 0;
    public final String p;
    private final boolean q;
    private final com.ss.android.ugc.aweme.shortvideo.upload.c.a<Long> r = new com.ss.android.ugc.aweme.shortvideo.upload.c.a<>(-1L);
    private boolean s = false;

    static {
        Covode.recordClassIndex(82061);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final boolean c() {
        return this.f124897h;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final void a(byte[] bArr, int i2, int i3, boolean z) {
        a("produce offset:%d size:%d isFinish:%b", Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
        if (g() >= 0) {
            d dVar = new d(bArr, i2, i3);
            this.f124890a.lock();
            try {
                this.f124894e.a(dVar);
                this.f124891b.await();
                if (dVar.f124929a == null) {
                    this.f124890a.unlock();
                    this.f124897h = z;
                    this.f124892c.lock();
                    this.f124893d.signalAll();
                    this.f124892c.unlock();
                    return;
                }
                throw new j(dVar.f124929a);
            } catch (InterruptedException e2) {
                throw new j(e2);
            } catch (Throwable th) {
                this.f124890a.unlock();
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final long d() {
        return ((Long) this.r.f132094a).longValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final long e() {
        if (this.f124897h) {
            return this.n.length();
        }
        return -1;
    }

    private int g() {
        if (i.c.UPLOAD_FINISH.equals(this.f124898i)) {
            return -1;
        }
        if (i.c.UPLOAD_CANCEL.equals(this.f124898i)) {
            return -2;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final int a() {
        a("StartGetHeaderSize", new Object[0]);
        int f2 = f();
        a("EndGetHeaderSize result:%d", Integer.valueOf(f2));
        return f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.af$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f124903a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 82062(0x1408e, float:1.14993E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.shortvideo.upload.i$a[] r0 = com.ss.android.ugc.aweme.shortvideo.upload.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.shortvideo.af.AnonymousClass1.f124903a = r2
                com.ss.android.ugc.aweme.shortvideo.upload.i$a r0 = com.ss.android.ugc.aweme.shortvideo.upload.i.a.CONSUME_FAIL     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.shortvideo.af.AnonymousClass1.f124903a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.shortvideo.upload.i$a r0 = com.ss.android.ugc.aweme.shortvideo.upload.i.a.CONSUME_END     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.af.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements m {

        /* renamed from: a  reason: collision with root package name */
        public volatile i.b f124927a;

        static {
            Covode.recordClassIndex(82065);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.m
        public final void a() {
            if (af.this.f124896g > 0) {
                af.this.f124892c.lock();
                this.f124927a = i.b.GET_HEADER_SIZE_DONE;
                af.this.f124893d.signalAll();
                af.this.f124892c.unlock();
                return;
            }
            this.f124927a = i.b.GET_HEADER_SIZE_WAIT;
        }

        private c() {
        }

        /* synthetic */ c(af afVar, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final void b() {
        b("stop cancelUpload, currentStatus:" + this.f124898i, new Object[0]);
        if (this.f124898i == i.c.UPLOADING) {
            this.f124898i = i.c.UPLOAD_CANCEL;
            try {
                ag.a(this.n.getPath());
                this.f124894e.a(new b(s.CANCEL));
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements m {

        /* renamed from: a  reason: collision with root package name */
        public volatile int f124934a;

        /* renamed from: b  reason: collision with root package name */
        public Exception f124935b;

        /* renamed from: c  reason: collision with root package name */
        public volatile i.a f124936c;

        /* renamed from: e  reason: collision with root package name */
        private final long f124938e;

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f124939f;

        /* renamed from: g  reason: collision with root package name */
        private final long f124940g;

        /* renamed from: h  reason: collision with root package name */
        private final long f124941h;

        static {
            Covode.recordClassIndex(82067);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.m
        public final void a() {
            int length = (int) af.this.n.length();
            if (!af.this.f124897h) {
                if (this.f124940g > ((long) length)) {
                    this.f124936c = i.a.CONSUME_WAIT_DATA;
                } else {
                    a(length);
                }
            } else if (this.f124938e < ((long) length)) {
                a(length);
            } else {
                a(i.a.CONSUME_END);
            }
        }

        private void a(i.a aVar) {
            af.this.f124892c.lock();
            this.f124936c = aVar;
            af.this.f124893d.signalAll();
            af.this.f124892c.unlock();
        }

        private int b(int i2) {
            long min = Math.min(this.f124941h, (long) i2) - this.f124938e;
            if (min > 16) {
                min -= min % 16;
            }
            return (int) min;
        }

        private void a(int i2) {
            this.f124934a = b(i2);
            try {
                af.this.f124895f.seek(this.f124938e);
                af.this.f124895f.read(this.f124939f, 0, this.f124934a);
                a(i.a.CONSUME_DONE);
            } catch (IOException e2) {
                this.f124935b = e2;
                a(i.a.CONSUME_FAIL);
            }
        }

        private e(long j2, byte[] bArr, int i2, int i3) {
            this.f124938e = j2;
            this.f124939f = bArr;
            this.f124941h = ((long) i2) + j2;
            this.f124940g = j2 + ((long) i3);
        }

        /* synthetic */ e(af afVar, long j2, byte[] bArr, int i2, int i3, byte b2) {
            this(j2, bArr, i2, i3);
        }
    }

    private int f() {
        boolean await;
        int g2 = g();
        if (g2 < 0) {
            return g2;
        }
        if (this.f124896g > 0) {
            return this.f124896g;
        }
        c cVar = new c(this, (byte) 0);
        this.f124892c.lock();
        do {
            try {
                this.f124894e.a(cVar);
                do {
                    await = this.f124893d.await(30, TimeUnit.SECONDS);
                } while (cVar.f124927a == null);
                if (await) {
                    int g3 = g();
                    if (g3 < 0) {
                        this.f124892c.unlock();
                        return g3;
                    }
                } else {
                    this.o = -1;
                    throw new j("upload timeout");
                }
            } catch (InterruptedException e2) {
                throw new j(e2);
            } catch (Throwable th) {
                this.f124892c.unlock();
                throw th;
            }
        } while (cVar.f124927a == i.b.GET_HEADER_SIZE_WAIT);
        this.f124892c.unlock();
        if (this.f124896g <= 0) {
            return -1;
        }
        return this.f124896g;
    }

    class b implements m {

        /* renamed from: b  reason: collision with root package name */
        private final s f124926b;

        static {
            Covode.recordClassIndex(82064);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.m
        public final void a() {
            af.this.f124892c.lock();
            af.this.f124893d.signalAll();
            af.this.f124892c.unlock();
            if (af.this.f124899j != null) {
                af.this.f124899j.a(this.f124926b);
            }
            af.this.f124890a.lock();
            af.this.f124891b.signalAll();
            af.this.f124890a.unlock();
            try {
                af.this.f124895f.close();
                af.this.b("raf.close();", new Object[0]);
            } catch (IOException e2) {
                af.this.b("raf.close() " + e2.getMessage(), new Object[0]);
            }
            if (af.this.n.exists()) {
                a(af.this.n);
            }
            af.this.f124894e.f132133a.quit();
        }

        private static boolean a(File file) {
            MethodCollector.i(12167);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(12167);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(12167);
            return delete;
        }

        public b(s sVar) {
            this.f124926b = sVar;
        }
    }

    class d implements m {

        /* renamed from: a  reason: collision with root package name */
        public volatile Exception f124929a;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f124931c;

        /* renamed from: d  reason: collision with root package name */
        private final int f124932d;

        /* renamed from: e  reason: collision with root package name */
        private final int f124933e;

        static {
            Covode.recordClassIndex(82066);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.m
        public final void a() {
            try {
                if (af.this.f124895f.length() == 0) {
                    int i2 = this.f124932d;
                    if (i2 % 16 != 0) {
                        af.this.f124900k = 16 - (i2 % 16);
                        i2 = this.f124932d + af.this.f124900k;
                        af afVar = af.this;
                        afVar.f124901l = Arrays.copyOf(this.f124931c, afVar.f124900k);
                    }
                    af.this.f124896g = i2;
                    af afVar2 = af.this;
                    afVar2.b("Produce on empty file, mMp4HeaderSize:%d", Integer.valueOf(afVar2.f124896g));
                    if (this.f124932d == 0) {
                        gr.a(af.this.p, 100102, "");
                    }
                    com.bytedance.apm.b.a("parallel_upload_ve_compile_first_offset", i2, (JSONObject) null);
                    af.this.f124895f.write(new byte[i2], 0, i2);
                    af.this.f124895f.write(this.f124931c, af.this.f124900k, this.f124933e - af.this.f124900k);
                } else {
                    af.this.f124895f.seek((long) this.f124932d);
                    af.this.f124895f.write(this.f124931c, 0, this.f124933e);
                    if (this.f124932d == 0 && af.this.f124901l != null) {
                        af.this.f124895f.write(af.this.f124901l, 0, af.this.f124900k);
                    }
                }
                af.this.a("write offset:%d size:%d", Integer.valueOf(this.f124932d), Integer.valueOf(this.f124933e));
            } catch (IOException e2) {
                this.f124929a = e2;
            }
            af.this.f124890a.lock();
            af.this.f124891b.signalAll();
            af.this.f124890a.unlock();
        }

        public d(byte[] bArr, int i2, int i3) {
            this.f124931c = bArr;
            this.f124932d = i2;
            this.f124933e = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public volatile int f124904a;

        /* renamed from: b  reason: collision with root package name */
        public Exception f124905b;

        /* renamed from: c  reason: collision with root package name */
        public volatile i.a f124906c;

        /* renamed from: e  reason: collision with root package name */
        private final int f124908e;

        /* renamed from: f  reason: collision with root package name */
        private volatile int f124909f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f124910g;

        static {
            Covode.recordClassIndex(82063);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.upload.m
        public final void a() {
            aa aaVar;
            int a2;
            String cVar;
            Iterator<aa> it = af.this.f124902m.iterator();
            do {
                aaVar = null;
                if (!it.hasNext()) {
                    break;
                }
                aaVar = it.next();
            } while (this.f124908e != aaVar.f131970a);
            if (aaVar == null) {
                if (af.this.f124902m.isEmpty()) {
                    af afVar = af.this;
                    afVar.b("[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d", Integer.valueOf(afVar.f124896g));
                    if (af.this.f124896g > 0) {
                        a2 = af.this.f124896g;
                    } else {
                        af.this.b("[SliceConsume] sliceModel=null consume wait", new Object[0]);
                        this.f124906c = i.a.CONSUME_WAIT_DATA;
                        return;
                    }
                } else {
                    a2 = af.this.f124902m.getLast().a();
                    if (af.this.f124897h) {
                        if (this.f124908e == 0) {
                            this.f124909f = af.this.f124896g;
                        } else if (((long) a2) >= af.this.n.length()) {
                            this.f124909f = 0;
                        }
                        a2 = 0;
                    }
                }
                aaVar = new aa(this.f124908e, a2, this.f124909f);
            }
            long length = af.this.n.length();
            if (length == 0) {
                af.this.b("parallel_upload_file_delete_on_consume OutputFileLength:" + length + " UploadStatus:" + af.this.f124898i, new Object[0]);
                ar a3 = new ar().a("OutputFileLength", Long.valueOf(length));
                if (af.this.f124898i == null) {
                    cVar = "null";
                } else {
                    cVar = af.this.f124898i.toString();
                }
                o.a("parallel_upload_file_delete_on_consume", a3.a("UploadStatus", cVar).a());
            }
            try {
                if (((long) aaVar.a()) > af.this.n.length()) {
                    if (!af.this.f124897h) {
                        this.f124906c = i.a.CONSUME_WAIT_DATA;
                        return;
                    }
                    aaVar.f131972c = ((int) af.this.n.length()) - aaVar.f131971b;
                }
                this.f124904a = aaVar.f131972c;
                af.this.f124895f.seek((long) aaVar.f131971b);
                if (aaVar.f131972c < 0) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new Exception("ArrayIndexOutOfBoundsException sliceModel.getOffset():" + aaVar.f131971b + "  mOutputFile.length():" + af.this.n.length()));
                    a(i.a.CONSUME_FAIL);
                    return;
                }
                af.this.f124895f.read(this.f124910g, 0, aaVar.f131972c);
                af.this.f124902m.add(aaVar);
                if (aaVar.f131971b == 0 && aaVar.f131972c == 0) {
                    a(i.a.CONSUME_END);
                } else {
                    a(i.a.CONSUME_DONE);
                }
                af.this.a("consume execute %d-%d", Integer.valueOf(aaVar.f131971b), Integer.valueOf(aaVar.a()));
                af.this.b("consume execute %d-%d", Integer.valueOf(aaVar.f131971b), Integer.valueOf(aaVar.a()));
            } catch (IOException e2) {
                this.f124905b = e2;
                a(i.a.CONSUME_FAIL);
            }
        }

        private void a(i.a aVar) {
            af.this.f124892c.lock();
            this.f124906c = aVar;
            af.this.f124893d.signalAll();
            af.this.f124892c.unlock();
        }

        private a(int i2, byte[] bArr, int i3) {
            this.f124908e = i2;
            this.f124910g = bArr;
            this.f124909f = i3;
        }

        /* synthetic */ a(af afVar, int i2, byte[] bArr, int i3, byte b2) {
            this(i2, bArr, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final void a(l.a aVar) {
        this.f124899j = aVar;
    }

    private static boolean a(File file) {
        MethodCollector.i(13306);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(13306);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(13306);
        return delete;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final void a(boolean z) {
        s sVar;
        b("stop stopUpload, currentStatus:" + this.f124898i, new Object[0]);
        if (this.f124898i == i.c.UPLOADING) {
            this.f124898i = i.c.UPLOAD_FINISH;
            try {
                ag.a(this.n.getPath());
                p pVar = this.f124894e;
                if (z) {
                    sVar = s.SUCCESS;
                } else {
                    sVar = s.FAILED;
                }
                pVar.a(new b(sVar));
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    private void c(String str, Object... objArr) {
        a(true, true, str, objArr);
    }

    public final void a(String str, Object... objArr) {
        a(true, false, str, objArr);
    }

    public final void b(String str, Object... objArr) {
        a(false, true, str, objArr);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final long a(long j2, long j3) {
        long b2 = b(j2, j3);
        a("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(b2));
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r2 == null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072 A[SYNTHETIC, Splitter:B:36:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long b(long r14, long r16) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.af.b(long, long):long");
    }

    public af(String str, String str2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f124890a = reentrantLock;
        this.f124891b = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.f124892c = reentrantLock2;
        this.f124893d = reentrantLock2.newCondition();
        File file = new File(str);
        this.n = file;
        this.p = str2;
        this.f124898i = i.c.UPLOADING;
        try {
            new File((String) Objects.requireNonNull(file.getParent())).mkdirs();
            String parent = file.getParent();
            h.f.b.l.d(parent, "");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(ag.f124942a);
            com.ss.android.ugc.tools.utils.i.a(parent, new ag.a(linkedHashSet));
            String path = file.getPath();
            h.f.b.l.d(path, "");
            ag.f124942a.add(path);
            if (file.exists()) {
                a(file);
            }
            file.createNewFile();
            this.f124895f = new RandomAccessFile(file, "rw");
            a("createFile,filePath:%s", str);
            this.q = com.bytedance.ies.abmock.b.a().a(true, "enable_publish_detail_alog", false);
            this.s = com.ss.android.ugc.aweme.settings.m.c();
        } catch (IOException e2) {
            throw new j(e2);
        }
    }

    private int b(int i2, byte[] bArr, int i3) {
        int g2 = g();
        if (g2 < 0) {
            return g2;
        }
        a aVar = new a(this, i2, bArr, i3, (byte) 0);
        this.f124892c.lock();
        do {
            try {
                aVar.f124906c = null;
                this.f124894e.a(aVar);
                boolean z = true;
                do {
                    if (this.s) {
                        this.f124893d.await();
                    } else {
                        z = this.f124893d.await(30, TimeUnit.SECONDS);
                    }
                } while (aVar.f124906c == null);
                if (z) {
                    int g3 = g();
                    if (g3 < 0) {
                        this.f124892c.unlock();
                        return g3;
                    }
                } else {
                    this.o = -1;
                    throw new j("upload timeout");
                }
            } catch (InterruptedException e2) {
                throw new j(e2);
            } catch (Throwable th) {
                this.f124892c.unlock();
                throw th;
            }
        } while (aVar.f124906c == i.a.CONSUME_WAIT_DATA);
        this.f124892c.unlock();
        int i4 = AnonymousClass1.f124903a[aVar.f124906c.ordinal()];
        if (i4 == 1) {
            throw new j(aVar.f124905b);
        } else if (i4 != 2) {
            return aVar.f124904a;
        } else {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final int a(int i2, byte[] bArr, int i3) {
        c("StartSliceConsume sliceId:%d size:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (this.f124902m.isEmpty()) {
            this.r.a(0L);
        } else {
            this.r.a(Long.valueOf((long) this.f124902m.getLast().a()));
        }
        int b2 = b(i2, bArr, i3);
        c("EndSliceConsume sliceId:%d size:%d result:%d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(b2));
        return b2;
    }

    private void a(boolean z, boolean z2, String str, Object... objArr) {
        String str2 = com.a.a(Locale.US, str, objArr) + " hash:" + hashCode() + ",publishId:" + this.p;
        if (z2) {
            q.a("ConcurrentUploadByFile:".concat(String.valueOf(str2)));
        }
        if (z) {
            x.f132161a.a(str2);
        }
    }

    private int b(long j2, byte[] bArr, int i2, int i3) {
        int g2 = g();
        if (g2 < 0) {
            return g2;
        }
        e eVar = new e(this, j2, bArr, i2, i3, (byte) 0);
        this.f124892c.lock();
        do {
            try {
                eVar.f124936c = null;
                this.f124894e.a(eVar);
                boolean z = true;
                do {
                    if (this.s) {
                        this.f124893d.await();
                    } else {
                        z = this.f124893d.await(30, TimeUnit.SECONDS);
                    }
                } while (eVar.f124936c == null);
                if (z) {
                    int g3 = g();
                    if (g3 < 0) {
                        this.f124892c.unlock();
                        return g3;
                    }
                } else {
                    this.o = -1;
                    throw new j("upload timeout");
                }
            } catch (InterruptedException e2) {
                throw new j(e2);
            } catch (Throwable th) {
                this.f124892c.unlock();
                throw th;
            }
        } while (eVar.f124936c == i.a.CONSUME_WAIT_DATA);
        this.f124892c.unlock();
        int i4 = AnonymousClass1.f124903a[eVar.f124936c.ordinal()];
        if (i4 == 1) {
            throw new j(eVar.f124935b);
        } else if (i4 != 2) {
            return eVar.f124934a;
        } else {
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.upload.l
    public final int a(long j2, byte[] bArr, int i2, int i3) {
        a(true, this.q, "StartStreamConsume offset:%d maxSize:%d minSize:%d", Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3));
        this.r.a(Long.valueOf(j2));
        int b2 = b(j2, bArr, i2, i3);
        a(true, this.q, "EndStreamConsume offset:%d maxSize:%d minSize:%d result:%d", Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(b2));
        return b2;
    }
}
