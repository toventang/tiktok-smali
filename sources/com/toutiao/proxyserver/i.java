package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.c.c;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public final class i extends a {

    /* renamed from: m  reason: collision with root package name */
    final Object f154892m = this;
    public Exception n;
    private int o;
    private final b p;
    private final boolean q;
    private q r;
    private int s;

    public interface b {
        static {
            Covode.recordClassIndex(103159);
        }

        void a(i iVar);

        void b(i iVar);
    }

    static {
        Covode.recordClassIndex(103155);
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        String f154901a;

        /* renamed from: b  reason: collision with root package name */
        String f154902b;

        /* renamed from: c  reason: collision with root package name */
        ad f154903c;

        /* renamed from: d  reason: collision with root package name */
        q f154904d;

        /* renamed from: e  reason: collision with root package name */
        b f154905e;

        /* renamed from: f  reason: collision with root package name */
        c f154906f;

        /* renamed from: g  reason: collision with root package name */
        List<com.toutiao.proxyserver.net.c> f154907g;

        /* renamed from: h  reason: collision with root package name */
        int f154908h;

        /* renamed from: i  reason: collision with root package name */
        y f154909i;

        /* renamed from: j  reason: collision with root package name */
        b f154910j;

        /* renamed from: k  reason: collision with root package name */
        boolean f154911k;

        static {
            Covode.recordClassIndex(103158);
        }

        a() {
        }

        /* access modifiers changed from: package-private */
        public final i a() {
            if (this.f154905e != null && this.f154906f != null && (this.f154904d != null || (!TextUtils.isEmpty(this.f154901a) && !TextUtils.isEmpty(this.f154902b) && this.f154903c != null))) {
                return new i(this);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: package-private */
        public final a a(ad adVar) {
            if (adVar != null) {
                this.f154903c = adVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: package-private */
        public final a a(b bVar) {
            if (bVar != null) {
                this.f154905e = bVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: package-private */
        public final a b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f154902b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: package-private */
        public final a a(c cVar) {
            if (cVar != null) {
                this.f154906f = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        public final a a(q qVar) {
            if (qVar != null) {
                this.f154904d = qVar;
                return this;
            }
            throw new IllegalArgumentException("urlsLazyProvider is NULL");
        }

        /* access modifiers changed from: package-private */
        public final a a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f154901a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }
    }

    @Override // com.toutiao.proxyserver.a
    public final void a() {
        super.a();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0007 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0007 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.toutiao.proxyserver.a, com.toutiao.proxyserver.i] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Throwable, com.toutiao.proxyserver.z] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Throwable, com.toutiao.proxyserver.x$a] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k() {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.i.k():boolean");
    }

    public final void run() {
        q qVar;
        try {
            if (this.f154721j == null && (qVar = this.r) != null) {
                String[] a2 = qVar.a();
                if (a2 == null || a2.length <= 0) {
                    u.a(1, "lazy provide lazy url fail, provide empty urls.");
                    return;
                }
                this.f154721j = new ad(com.toutiao.proxyserver.g.b.a(a2));
                this.f154718g = this.r.c();
                this.f154719h = com.toutiao.proxyserver.g.a.a(this.f154718g);
                com.toutiao.proxyserver.e.c.b("TAG_PROXY_DownloadTask", "lazy preload rawKey:" + this.f154718g + ", key:" + this.f154719h, null);
                if (!TextUtils.isEmpty(this.f154719h)) {
                    String a3 = com.toutiao.proxyserver.g.a.a(this.f154719h);
                    File e2 = this.f154712a.e(a3);
                    int b2 = this.r.b();
                    if (b2 > 0) {
                        this.o = b2;
                    }
                    if (e2 != null && e2.length() >= ((long) this.o)) {
                        com.toutiao.proxyserver.e.c.b("TAG_PROXY_DownloadTask", "lazy no need preload, file size: " + e2.length() + ", need preload size: " + this.o, null);
                        return;
                    } else if (v.a().a(g(), a3)) {
                        com.toutiao.proxyserver.e.c.c("TAG_PROXY_DownloadTask", "lazy has pending proxy task, skip preload for key: " + this.f154719h, null);
                        return;
                    } else {
                        b bVar = this.p;
                        if (bVar != null) {
                            bVar.a(this);
                        }
                    }
                } else {
                    return;
                }
            }
            try {
                this.f154712a.b(this.f154719h);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    k();
                } catch (e e3) {
                    com.toutiao.proxyserver.e.c.c("TAG_PROXY_DownloadTask", com.toutiao.proxyserver.e.c.a(e3), this.f154718g);
                    if (this.q) {
                        a(this.s, this.f154718g);
                    }
                }
                this.f154715d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
                this.f154712a.c(this.f154719h);
                b bVar2 = this.p;
                if (bVar2 != null) {
                    bVar2.b(this);
                }
            } catch (com.toutiao.proxyserver.d.a unused) {
                b bVar3 = this.p;
                if (bVar3 != null) {
                    bVar3.b(this);
                }
            }
        } catch (Exception e4) {
            u.a(1, "lazy provide lazy url fail:" + e4.toString());
        }
    }

    i(a aVar) {
        super(aVar.f154905e, aVar.f154906f);
        int i2;
        this.o = aVar.f154908h;
        this.p = aVar.f154910j;
        this.f154718g = aVar.f154901a;
        this.f154719h = aVar.f154902b;
        this.f154716e = aVar.f154907g;
        this.f154721j = aVar.f154903c;
        this.f154720i = aVar.f154909i;
        this.q = aVar.f154911k;
        this.r = aVar.f154904d;
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f154716e)) {
            Iterator it = this.f154716e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.toutiao.proxyserver.net.c cVar = (com.toutiao.proxyserver.net.c) it.next();
                if (TextUtils.equals(cVar.f154930a, "cache_scene") && TextUtils.equals(cVar.f154931b, "music")) {
                    i2 = 1;
                    break;
                }
            }
        }
        i2 = 0;
        this.s = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0431 A[SYNTHETIC, Splitter:B:130:0x0431] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0519 A[SYNTHETIC, Splitter:B:193:0x0519] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x016d A[SYNTHETIC, Splitter:B:39:0x016d] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0280 A[Catch:{ IOException -> 0x045c, Exception -> 0x0457, all -> 0x0455 }, LOOP:0: B:65:0x0280->B:87:0x031c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r23) {
        /*
        // Method dump skipped, instructions count: 1314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.i.b(java.lang.String):void");
    }

    private void c(final int i2, final int i3) {
        final o oVar = u.f154992g;
        if (oVar != null) {
            com.toutiao.proxyserver.g.b.b(new Runnable() {
                /* class com.toutiao.proxyserver.i.AnonymousClass2 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f154895b = false;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f154896c = 0;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ int f154899f;

                static {
                    Covode.recordClassIndex(103157);
                }

                public final void run() {
                    o oVar = oVar;
                    i.this.g();
                    String str = i.this.f154718g;
                    oVar.a();
                }

                {
                    this.f154899f = 0;
                }
            });
        }
    }
}
