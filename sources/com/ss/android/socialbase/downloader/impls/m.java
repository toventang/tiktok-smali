package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.ab;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.ag;
import com.ss.android.socialbase.downloader.depend.e;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.downloader.o;
import com.ss.android.socialbase.downloader.k.h;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.a;
import java.util.List;

public class m extends k.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f60648a = m.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final o f60649b = new p(true);

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(a aVar) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.b(h.a(aVar));
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, boolean z) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(List<String> list) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, boolean z, boolean z2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, z, z2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, int i3, g gVar, int i4, boolean z) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.b(i2, i3, h.a(gVar), com.ss.android.socialbase.downloader.k.g.c(i4), z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, int i3, g gVar, int i4, boolean z, boolean z2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, i3, h.a(gVar), com.ss.android.socialbase.downloader.k.g.c(i4), z, z2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean a(DownloadInfo downloadInfo) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.a(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, Notification notification) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, notification);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(boolean z) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(z);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, long j2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, j2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(DownloadChunk downloadChunk) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(downloadChunk);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, List<DownloadChunk> list) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.b(i2, list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(af afVar) {
        h.AnonymousClass18 r0;
        o oVar = this.f60649b;
        if (oVar != null) {
            if (afVar == null) {
                r0 = null;
            } else {
                r0 = new ag(afVar) {
                    /* class com.ss.android.socialbase.downloader.k.h.AnonymousClass18 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ af f60797a;

                    static {
                        Covode.recordClassIndex(37507);
                    }

                    {
                        this.f60797a = r1;
                    }

                    @Override // com.ss.android.socialbase.downloader.depend.ag
                    public final void a(int i2, int i3) {
                        try {
                            this.f60797a.a(i2, i3);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                };
            }
            oVar.a(r0);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, x xVar) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, h.a(xVar));
        }
    }

    static {
        Covode.recordClassIndex(37449);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadInfo> b() {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.d();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean f() {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.b();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a() {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean c() {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.c();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean d() {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.f();
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void e() {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.g();
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void b(List<String> list) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.b(list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadInfo> c(String str) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.c(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadInfo> d(String str) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.e(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final long e(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return 0;
        }
        return oVar.e(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final int f(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return 0;
        }
        return oVar.f(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean g(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.g(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final DownloadInfo h(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.h(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadChunk> i(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.i(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void j(int i2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.j(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean k(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.l(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void l(int i2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.k(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final int m(int i2) {
        return d.a().b(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean n(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.n(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void o(int i2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.o(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean p(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.p(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final x q(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return h.a(oVar.q(i2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final ab r(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return h.a(oVar.r(i2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final e s(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return h.a(oVar.s(i2));
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadInfo> a(String str) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.a(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void c(int i2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.c(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void d(int i2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.d(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadInfo> e(String str) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.d(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final List<DownloadInfo> b(String str) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.b(str);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean b(int i2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.b(i2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final boolean b(DownloadInfo downloadInfo) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return false;
        }
        return oVar.c(downloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void c(int i2, boolean z) {
        d.a().b(i2, z);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final int a(String str, String str2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return 0;
        }
        return oVar.a(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final DownloadInfo b(String str, String str2) {
        o oVar = this.f60649b;
        if (oVar == null) {
            return null;
        }
        return oVar.b(str, str2);
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, int i3) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, i3);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void b(int i2, List<DownloadChunk> list) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, list);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void b(int i2, boolean z) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, z, false);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, int i3, long j2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, i3, j2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, int i3, int i4, int i5) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, i3, i4, i5);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void a(int i2, int i3, int i4, long j2) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, i3, i4, j2);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.k
    public final void b(int i2, int i3, g gVar, int i4, boolean z) {
        o oVar = this.f60649b;
        if (oVar != null) {
            oVar.a(i2, i3, h.a(gVar), com.ss.android.socialbase.downloader.k.g.c(i4), z);
        }
    }
}
