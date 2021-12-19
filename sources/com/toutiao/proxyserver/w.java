package com.toutiao.proxyserver;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.a.a;
import com.toutiao.proxyserver.net.e;
import com.toutiao.proxyserver.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public final class w extends a {

    /* renamed from: m  reason: collision with root package name */
    private final Socket f155028m;
    private final c n;
    private final ExecutorService o;
    private volatile i p;
    private boolean q;
    private volatile boolean r = true;

    public interface c {
        static {
            Covode.recordClassIndex(103213);
        }

        void a(w wVar);

        void b(w wVar);
    }

    static {
        Covode.recordClassIndex(103206);
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        b f155040a;

        /* renamed from: b  reason: collision with root package name */
        com.toutiao.proxyserver.c.c f155041b;

        /* renamed from: c  reason: collision with root package name */
        ExecutorService f155042c;

        /* renamed from: d  reason: collision with root package name */
        Socket f155043d;

        /* renamed from: e  reason: collision with root package name */
        c f155044e;

        static {
            Covode.recordClassIndex(103211);
        }

        a() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.toutiao.proxyserver.ad$a */
    /* JADX DEBUG: Multi-variable search result rejected for r13v7, resolved type: com.toutiao.proxyserver.ad$a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x022f, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0232, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0234, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0236, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0237, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0239, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023c, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023f, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "OtherException: " + com.toutiao.proxyserver.e.c.a(r2), r26.f154718g);
        r5 = new com.toutiao.proxyserver.j(0, "OtherException", r2);
        r26.f154722k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0267, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0268, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x026a, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x026b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x026c, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "RandomAccessFileWrapper" + com.toutiao.proxyserver.e.c.a(r3), r26.f154718g);
        r26.r = r2;
        r5 = new com.toutiao.proxyserver.j(4, "RandomAccessFileWrapper.FileException", r3);
        com.toutiao.proxyserver.u.a(4, " RandomAccessFileWrapper.FileException：" + com.toutiao.proxyserver.e.c.a(r3), r26.f154718g);
        r26.f154722k++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ad, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ae, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b0, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b1, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02be, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "IOException: " + com.toutiao.proxyserver.e.c.a(r2), r26.f154718g);
        r5 = new com.toutiao.proxyserver.j(r9, "IOException", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e6, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0330, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0334, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0336, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0337, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0338, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "CancelException: " + com.toutiao.proxyserver.e.c.a(r2), r26.f154718g);
        com.toutiao.proxyserver.u.a(r10, "Task was cancel.", r26.f154718g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0357, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0358, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0359, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "ContentLengthNotMatchException: " + com.toutiao.proxyserver.e.c.a(r3), r26.f154718g);
        r26.q = true;
        com.toutiao.proxyserver.u.a(5, " ContentLengthNotMatchException: " + com.toutiao.proxyserver.e.c.a(r3), r26.f154718g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x038e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x038f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0390, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "SocketWriteException: " + com.toutiao.proxyserver.e.c.a(r2), r26.f154718g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03a9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a8, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a0, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a4, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01aa, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ac, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ae, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01af, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b1, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b4, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e3, code lost:
        if (com.toutiao.proxyserver.u.f154994i != null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e5, code lost:
        com.toutiao.proxyserver.u.f154994i.a(r10, "flush error.", r27.f155046b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ef, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f0, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f3, code lost:
        r2 = false;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01fa, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fd, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "flush error" + r2.toString(), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0219, code lost:
        throw new com.toutiao.proxyserver.ab(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x021a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x021c, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0221, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0225, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0227, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0228, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x022b, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x023e A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:32:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026a A[ExcHandler: a (e com.toutiao.proxyserver.x$a), Splitter:B:32:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0334 A[ExcHandler: e (e com.toutiao.proxyserver.e), PHI: r10 
      PHI: (r10v2 int) = (r10v4 int), (r10v4 int), (r10v4 int), (r10v6 int), (r10v10 int), (r10v10 int) binds: [B:72:0x01d9, B:86:0x0211, B:73:?, B:69:0x01c4, B:54:0x0192, B:55:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x0192] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0336 A[ExcHandler: e (e com.toutiao.proxyserver.e), Splitter:B:41:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0358 A[ExcHandler: f (r3v0 'e' com.toutiao.proxyserver.f A[CUSTOM_DECLARE]), Splitter:B:41:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x038f A[ExcHandler: ab (r2v4 'e' com.toutiao.proxyserver.ab A[CUSTOM_DECLARE]), Splitter:B:18:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC, Splitter:B:23:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01aa A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:38:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ac A[ExcHandler: a (e com.toutiao.proxyserver.x$a), Splitter:B:38:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ae A[ExcHandler: IOException (e java.io.IOException), Splitter:B:38:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b7 A[ExcHandler: z (e com.toutiao.proxyserver.z), Splitter:B:32:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ef A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:50:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2 A[ExcHandler: a (e com.toutiao.proxyserver.x$a), Splitter:B:50:0x0172] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01fa A[ExcHandler: z (e com.toutiao.proxyserver.z), Splitter:B:50:0x0172] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.toutiao.proxyserver.w.b r27) {
        /*
        // Method dump skipped, instructions count: 1008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.w.a(com.toutiao.proxyserver.w$b):boolean");
    }

    @Override // com.toutiao.proxyserver.a
    public final void a() {
        super.a();
        m();
    }

    private void l() {
        if (!u.C) {
            return;
        }
        if (s.f154950a == 1) {
            t.a().c();
        } else {
            t.a().a(g(), this.f154719h);
        }
    }

    private boolean n() {
        if (this.f154720i == null || this.f154720i.f155052c == null) {
            return false;
        }
        return TextUtils.equals(this.f154720i.f155052c.f155061i, "music");
    }

    private void m() {
        i iVar = this.p;
        this.p = null;
        if (iVar != null) {
            iVar.a();
            com.toutiao.proxyserver.e.c.c("TAG_PROXY_ProxyTask", "cancel fetch task, " + com.toutiao.proxyserver.e.c.a(new RuntimeException()), this.f154718g);
        }
    }

    public final void run() {
        b k2 = k();
        if (k2 != null) {
            c cVar = this.n;
            if (cVar != null) {
                cVar.a(this);
            }
            try {
                this.f154712a.b(this.f154719h);
                try {
                    a(k2);
                } catch (e e2) {
                    com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", com.toutiao.proxyserver.e.c.a(e2), this.f154718g);
                }
                if (this.q) {
                    this.f154712a.d(this.f154718g);
                }
                this.f154712a.c(this.f154719h);
                a();
                com.toutiao.proxyserver.g.b.a(this.f155028m);
                com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "close socket vid: " + this.f154718g + ", " + k2.f155047c, null);
                c cVar2 = this.n;
                if (cVar2 != null) {
                    cVar2.b(this);
                }
            } catch (com.toutiao.proxyserver.d.a unused) {
                com.toutiao.proxyserver.g.b.a(this.f155028m);
                c cVar3 = this.n;
                if (cVar3 != null) {
                    cVar3.b(this);
                }
            }
        }
    }

    private b k() {
        b bVar;
        try {
            this.f154720i = y.a(this.f155028m.getInputStream());
            y.a aVar = this.f154720i.f155052c;
            String a2 = u.a(aVar.f155054b, aVar.f155055c, aVar.f155060h, aVar.f155061i);
            com.toutiao.proxyserver.e.c.a("TAG_PROXY_ProxyTask", "auth-------rece>" + this.f154720i.f155052c.f155056d, null);
            com.toutiao.proxyserver.e.c.a("TAG_PROXY_ProxyTask", "auth-------base>".concat(String.valueOf(a2)), null);
            if (!a2.equals(aVar.f155056d)) {
                com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "Illegal url. Extra:" + this.f154720i.f155052c, null);
                return null;
            }
            com.toutiao.proxyserver.e.c.a("TAG_PROXY_ProxyTask", "-----legal------", null);
            OutputStream outputStream = this.f155028m.getOutputStream();
            if (n()) {
                bVar = u.f154988c;
                this.f154720i.f155051b.add(new com.toutiao.proxyserver.net.c("cache_scene", "music"));
                a.C4113a.f154764a.f154763b.incrementAndGet();
                if (a.C4113a.f154764a.f154763b.get() > u.v) {
                    return null;
                }
            } else if (this.f154720i.f155052c.f155053a == 1) {
                bVar = u.f154986a;
            } else {
                bVar = u.f154987b;
            }
            if (bVar == null) {
                com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "cache is null", this.f154718g);
                return null;
            }
            this.f154712a = bVar;
            this.f154718g = this.f154720i.f155052c.f155054b;
            this.f154719h = this.f154720i.f155052c.f155055c;
            this.f154721j = new ad(this.f154720i.f155052c.f155060h);
            this.f154716e = this.f154720i.f155051b;
            com.toutiao.proxyserver.e.c.b("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.f154720i.toString(), this.f154718g);
            return new b(outputStream, this.f154720i.f155052c.f155057e, this.f154718g);
        } catch (IOException e2) {
            com.toutiao.proxyserver.g.b.a(this.f155028m);
            com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", com.toutiao.proxyserver.e.c.a(e2), this.f154718g);
            return null;
        } catch (y.c e3) {
            com.toutiao.proxyserver.g.b.a(this.f155028m);
            com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", com.toutiao.proxyserver.e.c.a(e3), this.f154718g);
            return null;
        }
    }

    w(a aVar) {
        super(aVar.f155040a, aVar.f155041b);
        this.o = aVar.f155042c;
        this.f155028m = aVar.f155043d;
        this.n = aVar.f155044e;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final OutputStream f155045a;

        /* renamed from: b  reason: collision with root package name */
        final String f155046b;

        /* renamed from: c  reason: collision with root package name */
        public int f155047c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f155048d;

        static {
            Covode.recordClassIndex(103212);
        }

        /* access modifiers changed from: package-private */
        public final void a(byte[] bArr, int i2) {
            MethodCollector.i(9779);
            if (!this.f155048d) {
                try {
                    this.f155045a.write(bArr, 0, i2);
                    this.f155048d = true;
                    MethodCollector.o(9779);
                } catch (IOException e2) {
                    if (u.f154994i != null) {
                        u.f154994i.a(-1, "Write header to player error.", this.f155046b);
                    }
                    ab abVar = new ab(e2);
                    MethodCollector.o(9779);
                    throw abVar;
                }
            } else {
                MethodCollector.o(9779);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(byte[] bArr, int i2) {
            MethodCollector.i(9946);
            try {
                this.f155045a.write(bArr, 0, i2);
                this.f155047c += i2;
                MethodCollector.o(9946);
            } catch (IOException e2) {
                if (u.f154994i != null) {
                    u.f154994i.a(-1, "Write data to player error.", this.f155046b);
                }
                com.toutiao.proxyserver.e.c.d("TAG_PROXY_ProxyTask", "writeData error" + e2.toString(), null);
                ab abVar = new ab(e2);
                MethodCollector.o(9946);
                throw abVar;
            }
        }

        b(OutputStream outputStream, int i2, String str) {
            this.f155045a = outputStream;
            this.f155047c = i2;
            this.f155046b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0429, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x042c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x042d, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x042f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0430, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d1 A[Catch:{ IOException -> 0x045b, Exception -> 0x0458, all -> 0x0455 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d3 A[Catch:{ IOException -> 0x045b, Exception -> 0x0458, all -> 0x0455 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02df A[LOOP:0: B:108:0x02df->B:131:0x034e, LOOP_START, PHI: r11 r12 
      PHI: (r11v2 com.toutiao.proxyserver.x) = (r11v1 com.toutiao.proxyserver.x), (r11v3 com.toutiao.proxyserver.x) binds: [B:107:0x02dd, B:131:0x034e] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v11 com.toutiao.proxyserver.d) = (r12v9 com.toutiao.proxyserver.d), (r12v12 com.toutiao.proxyserver.d) binds: [B:107:0x02dd, B:131:0x034e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:108:0x02df] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03a1 A[Catch:{ IOException -> 0x042f, Exception -> 0x042c, all -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03a3 A[Catch:{ IOException -> 0x042f, Exception -> 0x042c, all -> 0x0429 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0409 A[SYNTHETIC, Splitter:B:159:0x0409] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0429 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:141:0x0369] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x048e A[Catch:{ all -> 0x04d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x051e A[SYNTHETIC, Splitter:B:250:0x051e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.toutiao.proxyserver.w.b r30, java.lang.String r31) {
        /*
        // Method dump skipped, instructions count: 1319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.w.a(com.toutiao.proxyserver.w$b, java.lang.String):void");
    }

    private byte[] a(com.toutiao.proxyserver.c.a aVar, b bVar, String str) {
        if (aVar != null) {
            com.toutiao.proxyserver.e.c.b("TAG_PROXY_ProxyTask", "get header from db", this.f154718g);
            return com.toutiao.proxyserver.g.b.a(aVar, bVar.f155047c).getBytes(com.toutiao.proxyserver.g.b.f154859a);
        }
        e a2 = a(str, 0, -1, "HEAD");
        com.toutiao.proxyserver.g.b.a(a2, false, false);
        com.toutiao.proxyserver.c.a a3 = com.toutiao.proxyserver.g.b.a(a2, this.f154713b, this.f154719h, this.f154720i.f155052c.f155053a);
        com.toutiao.proxyserver.e.c.c("TAG_PROXY_ProxyTask", "get header from network", this.f154718g);
        return com.toutiao.proxyserver.g.b.a(a3, bVar.f155047c).getBytes(com.toutiao.proxyserver.g.b.f154859a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x031f A[SYNTHETIC, Splitter:B:109:0x031f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.toutiao.proxyserver.c.a r25, java.io.File r26, com.toutiao.proxyserver.w.b r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 843
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.w.a(com.toutiao.proxyserver.c.a, java.io.File, com.toutiao.proxyserver.w$b, java.lang.String):void");
    }

    private void a(final boolean z, final int i2, final int i3, final int i4, final int i5) {
        final o oVar = u.f154992g;
        if (oVar != null) {
            com.toutiao.proxyserver.g.b.b(new Runnable() {
                /* class com.toutiao.proxyserver.w.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103207);
                }

                public final void run() {
                    o oVar = oVar;
                    w.this.g();
                    y yVar = w.this.f154720i;
                    y yVar2 = w.this.f154720i;
                    oVar.a();
                }
            });
        }
    }
}
