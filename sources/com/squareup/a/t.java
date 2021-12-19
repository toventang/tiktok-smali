package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a.b.s;
import com.squareup.a.a.c.b;
import com.squareup.a.a.d;
import com.squareup.a.a.e;
import com.squareup.a.a.i;
import com.squareup.a.a.j;
import com.squareup.a.k;
import com.squareup.a.p;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class t implements Cloneable {
    private static SSLSocketFactory A;

    /* renamed from: a  reason: collision with root package name */
    static final List<u> f57905a = j.a(u.HTTP_2, u.SPDY_3, u.HTTP_1_1);

    /* renamed from: b  reason: collision with root package name */
    static final List<k> f57906b = j.a(k.f57855a, k.f57856b, k.f57857c);

    /* renamed from: c  reason: collision with root package name */
    public final i f57907c;

    /* renamed from: d  reason: collision with root package name */
    public m f57908d;

    /* renamed from: e  reason: collision with root package name */
    public Proxy f57909e;

    /* renamed from: f  reason: collision with root package name */
    public List<u> f57910f;

    /* renamed from: g  reason: collision with root package name */
    public List<k> f57911g;

    /* renamed from: h  reason: collision with root package name */
    public final List<r> f57912h;

    /* renamed from: i  reason: collision with root package name */
    public final List<r> f57913i;

    /* renamed from: j  reason: collision with root package name */
    public ProxySelector f57914j;

    /* renamed from: k  reason: collision with root package name */
    public CookieHandler f57915k;

    /* renamed from: l  reason: collision with root package name */
    public e f57916l;

    /* renamed from: m  reason: collision with root package name */
    public c f57917m;
    public SocketFactory n;
    public SSLSocketFactory o;
    public HostnameVerifier p;
    public f q;
    public b r;
    public j s;
    public n t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    @Override // java.lang.Object
    public /* synthetic */ Object clone() {
        return new t(this);
    }

    static {
        Covode.recordClassIndex(36020);
        d.f57739b = new d() {
            /* class com.squareup.a.t.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36021);
            }

            @Override // com.squareup.a.a.d
            public final e a(t tVar) {
                return tVar.f57916l;
            }

            @Override // com.squareup.a.a.d
            public final i a(j jVar) {
                return jVar.f57852f;
            }

            @Override // com.squareup.a.a.d
            public final void a(p.a aVar, String str) {
                aVar.a(str);
            }

            @Override // com.squareup.a.a.d
            public final boolean a(j jVar, b bVar) {
                if (!j.f57847g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                } else if (bVar.f57734i || jVar.f57849c == 0) {
                    jVar.f57851e.remove(bVar);
                    return true;
                } else {
                    jVar.notifyAll();
                    return false;
                }
            }

            @Override // com.squareup.a.a.d
            public final void b(j jVar, b bVar) {
                if (j.f57847g || Thread.holdsLock(jVar)) {
                    if (jVar.f57851e.isEmpty()) {
                        jVar.f57848b.execute(jVar.f57850d);
                    }
                    jVar.f57851e.add(bVar);
                    return;
                }
                throw new AssertionError();
            }

            @Override // com.squareup.a.a.d
            public final b a(j jVar, a aVar, s sVar) {
                int i2;
                if (j.f57847g || Thread.holdsLock(jVar)) {
                    for (b bVar : jVar.f57851e) {
                        int size = bVar.f57733h.size();
                        com.squareup.a.a.a.d dVar = bVar.f57729d;
                        if (dVar != null) {
                            i2 = dVar.a();
                        } else {
                            i2 = 1;
                        }
                        if (size < i2 && aVar.equals(bVar.f57726a.f57952a) && !bVar.f57734i) {
                            sVar.a(bVar);
                            return bVar;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            @Override // com.squareup.a.a.d
            public final void a(k kVar, SSLSocket sSLSocket, boolean z) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (kVar.f57861f != null) {
                    enabledCipherSuites = (String[]) j.a(String.class, kVar.f57861f, sSLSocket.getEnabledCipherSuites());
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (kVar.f57862g != null) {
                    enabledProtocols = (String[]) j.a(String.class, kVar.f57862g, sSLSocket.getEnabledProtocols());
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                if (z && j.a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
                    int length = enabledCipherSuites.length + 1;
                    String[] strArr = new String[length];
                    System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                    strArr[length - 1] = "TLS_FALLBACK_SCSV";
                    enabledCipherSuites = strArr;
                }
                k b2 = new k.a(kVar).a(enabledCipherSuites).b(enabledProtocols).b();
                if (b2.f57862g != null) {
                    sSLSocket.setEnabledProtocols(b2.f57862g);
                }
                if (b2.f57861f != null) {
                    sSLSocket.setEnabledCipherSuites(b2.f57861f);
                }
            }
        };
    }

    public t() {
        this.f57912h = new ArrayList();
        this.f57913i = new ArrayList();
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.f57907c = new i();
        this.f57908d = new m();
    }

    /* access modifiers changed from: package-private */
    public final synchronized SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory;
        MethodCollector.i(10847);
        if (A == null) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                A = instance.getSocketFactory();
            } catch (GeneralSecurityException unused) {
                AssertionError assertionError = new AssertionError();
                MethodCollector.o(10847);
                throw assertionError;
            }
        }
        sSLSocketFactory = A;
        MethodCollector.o(10847);
        return sSLSocketFactory;
    }

    public final e a(v vVar) {
        return new e(this, vVar);
    }

    public final t a(c cVar) {
        this.f57917m = cVar;
        this.f57916l = null;
        return this;
    }

    public final void b(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(20000);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                this.y = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void c(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(20000);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                this.z = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public final void a(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(15000);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                this.x = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    t(t tVar) {
        e eVar;
        ArrayList arrayList = new ArrayList();
        this.f57912h = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f57913i = arrayList2;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.f57907c = tVar.f57907c;
        this.f57908d = tVar.f57908d;
        this.f57909e = tVar.f57909e;
        this.f57910f = tVar.f57910f;
        this.f57911g = tVar.f57911g;
        arrayList.addAll(tVar.f57912h);
        arrayList2.addAll(tVar.f57913i);
        this.f57914j = tVar.f57914j;
        this.f57915k = tVar.f57915k;
        c cVar = tVar.f57917m;
        this.f57917m = cVar;
        if (cVar != null) {
            eVar = cVar.f57781a;
        } else {
            eVar = tVar.f57916l;
        }
        this.f57916l = eVar;
        this.n = tVar.n;
        this.o = tVar.o;
        this.p = tVar.p;
        this.q = tVar.q;
        this.r = tVar.r;
        this.s = tVar.s;
        this.t = tVar.t;
        this.u = tVar.u;
        this.v = tVar.v;
        this.w = tVar.w;
        this.x = tVar.x;
        this.y = tVar.y;
        this.z = tVar.z;
    }
}
