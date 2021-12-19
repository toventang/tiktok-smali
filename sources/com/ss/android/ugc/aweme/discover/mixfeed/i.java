package com.ss.android.ugc.aweme.discover.mixfeed;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.a.e;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.discover.mixfeed.n;
import com.ss.android.ugc.aweme.discover.mixfeed.ui.b;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.search.l.a.a;
import com.ss.android.ugc.aweme.search.l.a.f;
import com.ss.android.ugc.aweme.search.l.a.g;
import com.ss.android.ugc.aweme.search.l.a.h;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;

public final class i extends u {

    /* renamed from: a  reason: collision with root package name */
    public int f81792a = -1;

    /* renamed from: b  reason: collision with root package name */
    public transient boolean f81793b;

    /* renamed from: c  reason: collision with root package name */
    public b f81794c;

    /* renamed from: d  reason: collision with root package name */
    long f81795d;

    /* renamed from: e  reason: collision with root package name */
    public long f81796e;
    private transient boolean s;
    private transient boolean t = true;
    private transient boolean u;

    static {
        Covode.recordClassIndex(50803);
    }

    private void l() {
        d();
        if (this.mData != null && ((m) this.mData).f81826c != null) {
            ((m) this.mData).f81826c.clear();
        }
    }

    public final void a(final int i2) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f81792a = i2;
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.discover.mixfeed.i.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(50807);
                }

                public final void run() {
                    i.this.f81792a = i2;
                }
            });
        }
    }

    private void e(m mVar) {
        this.f81794c.k();
        this.mData = mVar;
        d(mVar);
        handleData(mVar);
        a(0);
        if (this.mNotifyListeners != null) {
            for (o oVar : this.mNotifyListeners) {
                oVar.c();
            }
        }
    }

    private void d(m mVar) {
        int size;
        String requestId;
        e eVar;
        int size2;
        if (!this.u) {
            com.ss.android.ugc.aweme.search.l.a.e d2 = g.a(this.f81245i).a(this.f81796e).d((int) (this.f81796e - this.f81795d));
            if (this.mData == null) {
                size = 0;
            } else {
                size = ((m) this.mData).f81826c.size();
            }
            com.ss.android.ugc.aweme.search.l.a.e c2 = d2.c(size);
            String str = "";
            if (this.mData == null) {
                requestId = str;
            } else {
                requestId = ((SearchApiResult) this.mData).getRequestId();
            }
            com.ss.android.ugc.aweme.search.l.a.e a2 = c2.a(requestId).a((com.ss.android.ugc.aweme.app.api.g) this.mData);
            e eVar2 = null;
            if (mVar == null) {
                eVar = null;
            } else {
                eVar = mVar.f81833k;
            }
            a2.a(eVar).b(0);
            a.f121303d.c();
            com.ss.android.ugc.aweme.search.l.a.i f2 = h.a(this.f81245i).a(this.f81796e).f((int) (this.f81796e - this.f81795d));
            if (this.mData == null) {
                size2 = 0;
            } else {
                size2 = ((m) this.mData).f81826c.size();
            }
            com.ss.android.ugc.aweme.search.l.a.i e2 = f2.e(size2);
            if (this.mData != null) {
                str = ((SearchApiResult) this.mData).getRequestId();
            }
            com.ss.android.ugc.aweme.search.l.a.i a3 = e2.a(str).a((com.ss.android.ugc.aweme.app.api.g) this.mData);
            if (mVar != null) {
                eVar2 = mVar.f81833k;
            }
            a3.a(eVar2).c(0);
            this.u = true;
        }
    }

    public final synchronized void a(m mVar) {
        int i2;
        MethodCollector.i(3665);
        if (!(mVar == null || mVar.f81826c == null)) {
            for (h hVar : mVar.f81826c) {
                hVar.s = mVar.f81834l;
            }
        }
        this.f81794c.l();
        if (this.f81792a == 4 || this.f81793b) {
            MethodCollector.o(3665);
            return;
        }
        com.ss.android.ugc.aweme.search.l.a.a.e eVar = a.f121302c;
        Integer valueOf = Integer.valueOf(mVar.f81831i);
        if (eVar.f121331d == null) {
            eVar.f121331d = valueOf;
            if (valueOf != null) {
                i2 = valueOf.intValue();
            } else {
                i2 = -2;
            }
            eVar.a("is_hit_trunk", Integer.valueOf(i2));
        }
        if (mVar.f81832j == 2) {
            this.s = true;
            a.f121303d.o = true;
            a(1);
            this.f81794c.g();
            this.mData = mVar;
            c(mVar);
            x.a();
            x.a(mVar.f81826c);
            x.f81877c.b(mVar.f81826c);
            com.ss.android.ugc.aweme.discover.api.a.a(mVar.f81827e);
            a_(mVar.f81826c);
            this.f81794c.d();
            MethodCollector.o(3665);
            return;
        }
        if (mVar.f81831i == -1) {
            this.f81794c.f();
            com.ss.android.ugc.aweme.discover.api.a.f80827a = null;
            com.ss.android.ugc.aweme.search.l.a.e a2 = g.a(this.f81245i);
            if (!l.a(a2, f.f121353a)) {
                a2.n = 0;
            }
            a(2);
            l();
            x.a();
        }
        if (mVar.f81831i == 0) {
            if (this.mData == null || ((m) this.mData).f81826c == null || ((m) this.mData).f81826c.size() <= 0) {
                g.a(this.f81245i).r = 2;
                MethodCollector.o(3665);
                return;
            }
            d(mVar);
            com.ss.android.ugc.aweme.search.l.a.e c2 = g.a(this.f81245i).c();
            if (!l.a(c2, f.f121353a)) {
                c2.n = 1;
            }
            this.f81794c.k();
            this.f81794c.e();
            a(3);
        }
        if (mVar.f81832j == 4) {
            if (!this.s && this.t && getItems().size() > 0) {
                l();
                com.ss.android.ugc.aweme.discover.api.a.f80827a = null;
            }
            if (this.s && this.f81792a == 1) {
                l();
                com.ss.android.ugc.aweme.discover.api.a.f80827a = null;
                g.a(this.f81245i).r = 3;
            }
            a.f121303d.o = false;
            this.t = false;
            List items = getItems();
            List<h> list = mVar.f81826c;
            if (list == null) {
                MethodCollector.o(3665);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(items);
            c(mVar);
            com.ss.android.ugc.aweme.discover.api.a.a(mVar.f81827e);
            arrayList.addAll(list);
            a(4);
            mVar.f81826c = arrayList;
            e(mVar);
        }
        MethodCollector.o(3665);
    }

    public final void a(final Exception exc, final b.i<com.bytedance.ies.ugc.aweme.network.a.b<m>> iVar) {
        String message;
        a.f121303d.c();
        this.f81247k = null;
        if (exc == null && iVar.e() == null) {
            g.a(this.f81245i).d().b(1);
            a.f121302c.a(6, 5, "CHUNK_REQUEST_FAIL");
        } else {
            com.ss.android.ugc.aweme.search.l.a.e b2 = g.a(this.f81245i).d().b(1);
            if (exc.getMessage() != null) {
                message = exc.getMessage();
            } else {
                message = iVar.e().getMessage();
            }
            b2.b(message);
            a.f121302c.a(exc);
        }
        if (this.f81792a == 1 || this.mData == null) {
            this.mHandler.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.discover.mixfeed.i.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(50806);
                }

                public final void run() {
                    i.this.mIsLoading = false;
                    i.this.f81249m = false;
                    b bVar = i.this.f81794c;
                    Exception exc = exc;
                    if (exc == null) {
                        exc = iVar.e();
                    }
                    bVar.a(1, exc);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.discover.mixfeed.u
    public final void a(String str, int i2, int i3, int i4, String str2, int i5, com.ss.android.ugc.aweme.search.g.b bVar, String str3, String str4) {
        String str5;
        b.i<?> second;
        if (i2 != 0) {
            super.a(str, i2, i3, i4, str2, i5, bVar, str3, str4);
            return;
        }
        a(1, "trunkV2 new request");
        this.f81870f = str;
        this.f81871g = i5;
        this.f81244h = bVar;
        if (this.f81245i == null || this.f81245i.getSugUserId() == null || this.f81245i.getSugUserId().equals("")) {
            str5 = "";
        } else {
            str5 = this.f81245i.getSugUserId();
        }
        n a2 = new n.a().a(str).a(i2).b(i3).c(i4).b(str2).d(i5).a(this.f81244h).d(e()).e(this.o).a(this.f81245i).e(str3).h(str5).f(com.ss.android.ugc.aweme.discover.api.a.a()).c(str4).a();
        l.d(a2, "");
        l.d(a2, "");
        p<n, b.i<?>> pVar = com.ss.android.ugc.aweme.discover.j.l.f81272a.get(a2);
        if (pVar != null) {
            g.a(a2.f81835a).e();
            h.a(a2.f81835a).d();
        } else {
            pVar = null;
        }
        com.ss.android.ugc.aweme.discover.j.l.a(a2);
        if (pVar == null) {
            second = null;
        } else {
            a2 = pVar.getFirst();
            second = pVar.getSecond();
        }
        this.mIsLoading = true;
        if (second == null) {
            second = a2.b();
        }
        this.f81247k = a2;
        a(0);
        this.t = true;
        this.s = false;
        this.u = false;
        this.f81249m = true;
        this.n = true;
        this.f81793b = false;
        a.f121303d.a((Integer) 1);
        second.b(new j(this, a2));
        second.a(new b.g<com.bytedance.ies.ugc.aweme.network.a.b<m>, Object>() {
            /* class com.ss.android.ugc.aweme.discover.mixfeed.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(50805);
            }

            @Override // b.g
            public final Object then(b.i<com.bytedance.ies.ugc.aweme.network.a.b<m>> iVar) {
                if (i.this.mHandler == null || iVar == null) {
                    i.this.f81249m = false;
                    return null;
                }
                if (iVar.b()) {
                    i.this.f81249m = false;
                    i.this.a(0);
                } else if (iVar.c()) {
                    i.this.f81249m = false;
                    i.this.a(iVar.e(), iVar);
                }
                return null;
            }
        }, b.i.f4826c, null);
    }
}
