package com.ss.ugc.effectplatform.e;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.a.c.f;
import com.ss.ugc.effectplatform.f.g;
import com.ss.ugc.effectplatform.util.k;
import com.ss.ugc.effectplatform.util.u;
import d.a.d.a.j;
import h.f.b.ab;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f153578a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.ugc.effectplatform.a.c.d f153579b;

    /* renamed from: c  reason: collision with root package name */
    private j f153580c;

    /* renamed from: d  reason: collision with root package name */
    private i f153581d;

    /* renamed from: e  reason: collision with root package name */
    private f f153582e;

    static {
        Covode.recordClassIndex(102385);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(102387);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public j f153583a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.ugc.effectplatform.a.c.d f153584b;

        /* renamed from: c  reason: collision with root package name */
        private f f153585c;

        /* renamed from: d  reason: collision with root package name */
        private i f153586d;

        static {
            Covode.recordClassIndex(102386);
        }

        public final d a() {
            if (this.f153584b == null) {
                throw new IllegalArgumentException("networkClient is required to setup!");
            } else if (this.f153583a != null) {
                com.ss.ugc.effectplatform.a.c.d dVar = this.f153584b;
                if (dVar == null) {
                    l.a("networkClient");
                }
                j jVar = this.f153583a;
                if (jVar == null) {
                    l.a("writeDisk");
                }
                return new d(dVar, jVar, this.f153586d, this.f153585c, (byte) 0);
            } else {
                throw new IllegalArgumentException("cacheStrategy is required to setup!");
            }
        }

        public final a a(f fVar) {
            this.f153585c = fVar;
            return this;
        }

        public final a a(com.ss.ugc.effectplatform.a.c.d dVar) {
            l.c(dVar, "");
            this.f153584b = dVar;
            return this;
        }

        public final a a(i iVar) {
            l.c(iVar, "");
            this.f153586d = iVar;
            return this;
        }

        public final a a(j jVar) {
            l.c(jVar, "");
            this.f153583a = jVar;
            return this;
        }
    }

    private final void a(String str, long j2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        f fVar = this.f153582e;
        if (fVar != null) {
            str2 = fVar.name();
        } else {
            str2 = null;
        }
        d.a.e.b.a("DownloadManager", sb.append(str2).append("-->").append(str).append(" , cost ").append(j2).append(" mills.").toString());
    }

    public final long a(String str, c cVar) {
        l.c(str, "");
        d.a.e.b.a("DownloadManager", "downloadUrl=" + str + " start");
        e eVar = new e();
        long currentTimeMillis = System.currentTimeMillis();
        if (!u.a(str)) {
            f fVar = null;
            try {
                fVar = this.f153579b.fetchFromNetwork(new e(str, c.GET, null, null, false, 28));
                if (fVar != null && fVar.f153440a == 200) {
                    eVar.f153588b = System.currentTimeMillis() - currentTimeMillis;
                    a("fetchInputStream success! url: ".concat(String.valueOf(str)), eVar.f153588b);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    try {
                        String a2 = this.f153580c.a(new b(fVar.f153441b), fVar.f153442c, cVar);
                        if (a2 == null) {
                            return -1;
                        }
                        long a3 = k.a(a2);
                        eVar.f153591e = a3;
                        eVar.f153589c = System.currentTimeMillis() - currentTimeMillis2;
                        if (a3 > 0) {
                            a("writeToDisk success! url: ".concat(String.valueOf(str)), eVar.f153589c);
                            i iVar = this.f153581d;
                            if (iVar == null) {
                                eVar.f153587a = System.currentTimeMillis() - currentTimeMillis;
                                a("unnecessary to unzip, download success", eVar.f153587a);
                                cVar.a(eVar);
                                return a3;
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            try {
                                boolean a4 = iVar.a(a2);
                                eVar.f153590d = System.currentTimeMillis() - currentTimeMillis3;
                                eVar.f153587a = System.currentTimeMillis() - currentTimeMillis;
                                if (a4) {
                                    a("unzip success! url: ".concat(String.valueOf(str)), eVar.f153590d);
                                    a("download success! url: ".concat(String.valueOf(str)), eVar.f153587a);
                                    cVar.a(eVar);
                                    return a3;
                                }
                                eVar.f153592f = new com.ss.ugc.effectplatform.f.f("unzip file failed!");
                                a("unzip failed! url: ".concat(String.valueOf(str)), eVar.f153590d);
                                a("download failed! url: ".concat(String.valueOf(str)), eVar.f153587a);
                                cVar.a(eVar);
                                return -1;
                            } catch (Exception e2) {
                                if ((e2 instanceof com.ss.ugc.effectplatform.f.c) || (e2 instanceof com.ss.ugc.effectplatform.f.a) || (e2 instanceof j) || (e2 instanceof com.ss.ugc.effectplatform.f.f)) {
                                    throw e2;
                                }
                                throw new com.ss.ugc.effectplatform.f.f(ab.a(e2.getClass()).c() + ':' + e2.getMessage());
                            }
                        } else {
                            a("writeToDisk failed! url: ".concat(String.valueOf(str)), eVar.f153589c);
                            eVar.f153587a = System.currentTimeMillis() - currentTimeMillis;
                            eVar.f153592f = new j("write file to disk failed!");
                            cVar.a(eVar);
                            return a3;
                        }
                    } catch (Exception e3) {
                        if ((e3 instanceof com.ss.ugc.effectplatform.f.c) || (e3 instanceof com.ss.ugc.effectplatform.f.a) || (e3 instanceof j)) {
                            throw e3;
                        }
                        throw new j(ab.a(e3.getClass()).c() + ':' + e3.getMessage());
                    }
                }
            } catch (Exception e4) {
                eVar.f153592f = new com.ss.ugc.effectplatform.f.d(400, ab.a(e4.getClass()).c() + ':' + e4.getMessage());
            }
            eVar.f153587a = System.currentTimeMillis() - currentTimeMillis;
            if (fVar != null) {
                int i2 = fVar.f153440a;
                String str2 = fVar.f153443d;
                if (str2 == null) {
                    str2 = "status code is " + fVar.f153440a;
                }
                eVar.f153592f = new com.ss.ugc.effectplatform.f.d(i2, str2);
            }
            a("fetchFromNetwork failed! url: ".concat(String.valueOf(str)), eVar.f153587a);
            cVar.a(eVar);
            return -1;
        }
        eVar.f153587a = System.currentTimeMillis() - currentTimeMillis;
        eVar.f153592f = new g("invalid url");
        a("download failed! url: ".concat(String.valueOf(str)), eVar.f153587a);
        cVar.a(eVar);
        return -1;
    }

    private d(com.ss.ugc.effectplatform.a.c.d dVar, j jVar, i iVar, f fVar) {
        this.f153579b = dVar;
        this.f153580c = jVar;
        this.f153581d = iVar;
        this.f153582e = fVar;
    }

    public /* synthetic */ d(com.ss.ugc.effectplatform.a.c.d dVar, j jVar, i iVar, f fVar, byte b2) {
        this(dVar, jVar, iVar, fVar);
    }
}
