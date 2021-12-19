package com.squareup.a.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.a.a.a.d;
import com.squareup.a.a.b.e;
import com.squareup.a.a.b.k;
import com.squareup.a.a.b.s;
import com.squareup.a.a.d.f;
import com.squareup.a.a.j;
import com.squareup.a.i;
import com.squareup.a.o;
import com.squareup.a.q;
import com.squareup.a.u;
import com.squareup.a.v;
import com.squareup.a.x;
import com.squareup.a.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import k.aa;
import k.g;
import k.h;

public final class b implements i {

    /* renamed from: m  reason: collision with root package name */
    private static SSLSocketFactory f57725m;
    private static f n;

    /* renamed from: a  reason: collision with root package name */
    public final z f57726a;

    /* renamed from: b  reason: collision with root package name */
    public Socket f57727b;

    /* renamed from: c  reason: collision with root package name */
    public o f57728c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f57729d;

    /* renamed from: e  reason: collision with root package name */
    public int f57730e;

    /* renamed from: f  reason: collision with root package name */
    public h f57731f;

    /* renamed from: g  reason: collision with root package name */
    public g f57732g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Reference<s>> f57733h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f57734i;

    /* renamed from: j  reason: collision with root package name */
    public long f57735j = Long.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    private Socket f57736k;

    /* renamed from: l  reason: collision with root package name */
    private u f57737l;

    static {
        Covode.recordClassIndex(35966);
    }

    @Override // com.squareup.a.i
    public final z a() {
        return this.f57726a;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Connection{").append(this.f57726a.f57952a.f57411a.f57882d).append(":").append(this.f57726a.f57952a.f57411a.f57883e).append(", proxy=").append(this.f57726a.f57953b).append(" hostAddress=").append(this.f57726a.f57954c).append(" cipherSuite=");
        o oVar = this.f57728c;
        if (oVar != null) {
            str = oVar.f57873a;
        } else {
            str = "none";
        }
        return append.append(str).append(" protocol=").append(this.f57737l).append('}').toString();
    }

    public b(z zVar) {
        this.f57726a = zVar;
    }

    private static synchronized f a(SSLSocketFactory sSLSocketFactory) {
        f fVar;
        synchronized (b.class) {
            MethodCollector.i(12658);
            if (sSLSocketFactory != f57725m) {
                n = com.squareup.a.a.h.f57757a.a(com.squareup.a.a.h.f57757a.a(sSLSocketFactory));
                f57725m = sSLSocketFactory;
            }
            fVar = n;
            MethodCollector.o(12658);
        }
        return fVar;
    }

    /* JADX INFO: finally extract failed */
    public final boolean a(boolean z) {
        if (this.f57727b.isClosed() || this.f57727b.isInputShutdown() || this.f57727b.isOutputShutdown()) {
            return false;
        }
        if (this.f57729d == null && z) {
            try {
                int soTimeout = this.f57727b.getSoTimeout();
                try {
                    this.f57727b.setSoTimeout(1);
                    if (this.f57731f.e()) {
                        this.f57727b.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f57727b.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f57727b.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    private void a(int i2, int i3) {
        v a2 = new v.a().a(this.f57726a.f57952a.f57411a).a("Host", j.a(this.f57726a.f57952a.f57411a)).a("Proxy-Connection", "Keep-Alive").a("User-Agent", "okhttp/2.7.5").a();
        q qVar = a2.f57919a;
        String str = "CONNECT " + qVar.f57882d + ":" + qVar.f57883e + " HTTP/1.1";
        do {
            e eVar = new e(null, this.f57731f, this.f57732g);
            this.f57731f.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            this.f57732g.timeout().timeout((long) i3, TimeUnit.MILLISECONDS);
            eVar.a(a2.f57921c, str);
            eVar.b();
            x.a c2 = eVar.c();
            c2.f57942a = a2;
            x a3 = c2.a();
            long a4 = k.a(a3.f57936f);
            if (a4 == -1) {
                a4 = 0;
            }
            aa a5 = eVar.a(a4);
            j.a(a5, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a5.close();
            int i4 = a3.f57933c;
            if (i4 != 200) {
                if (i4 == 407) {
                    a2 = k.a(this.f57726a.f57952a.f57414d, a3, this.f57726a.f57953b);
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + a3.f57933c);
                }
            } else if (!this.f57731f.a().e() || !this.f57732g.a().e()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            } else {
                return;
            }
        } while (a2 != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a2 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a8 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0251  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r14, int r15, int r16, java.util.List<com.squareup.a.k> r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 667
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.a.c.b.a(int, int, int, java.util.List, boolean):void");
    }
}
