package com.ss.android.ugc.aweme.search.l.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.discover.ui.SearchUserLinearLayoutManager;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e {
    public boolean A;
    public final List<Runnable> B = new ArrayList();
    public final d C;

    /* renamed from: a  reason: collision with root package name */
    public long f121340a;

    /* renamed from: b  reason: collision with root package name */
    public int f121341b;

    /* renamed from: c  reason: collision with root package name */
    public long f121342c;

    /* renamed from: d  reason: collision with root package name */
    public long f121343d;

    /* renamed from: e  reason: collision with root package name */
    public long f121344e;

    /* renamed from: f  reason: collision with root package name */
    public g f121345f;

    /* renamed from: g  reason: collision with root package name */
    public int f121346g;

    /* renamed from: h  reason: collision with root package name */
    public int f121347h;

    /* renamed from: i  reason: collision with root package name */
    public int f121348i;

    /* renamed from: j  reason: collision with root package name */
    public int f121349j;

    /* renamed from: k  reason: collision with root package name */
    public int f121350k;

    /* renamed from: l  reason: collision with root package name */
    public int f121351l;

    /* renamed from: m  reason: collision with root package name */
    public int f121352m;
    public int n = -1;
    public String o;
    public int p = -1;
    public String q;
    public int r;
    public int s = -1;
    public int t = -1;
    public int u;
    public long v = -1;
    public long w = -1;
    public long x = -1;
    public com.bytedance.ies.ugc.aweme.network.a.e y;
    public boolean z;

    static {
        Covode.recordClassIndex(79076);
    }

    public final e e() {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.u = 1;
        return this;
    }

    public final void g() {
        if (!l.a(this, f.f121353a)) {
            g.b(this.C);
        }
    }

    public final e b() {
        if (!l.a(this, f.f121353a) && this.f121342c == 0) {
            this.f121342c = System.currentTimeMillis();
        }
        return this;
    }

    public final e c() {
        if (!l.a(this, f.f121353a) && this.f121343d == 0) {
            this.f121343d = System.currentTimeMillis();
        }
        return this;
    }

    public final e d() {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        long j2 = this.f121342c;
        if (j2 == 0) {
            j2 = this.f121340a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f121344e = currentTimeMillis;
        this.f121351l = (int) (currentTimeMillis - j2);
        return this;
    }

    public final e f() {
        this.w = SearchUserLinearLayoutManager.f82171a;
        SearchUserLinearLayoutManager.f82171a = -1;
        return this;
    }

    public final String toString() {
        return "SearchResultShowEvent(tabType=" + this.f121346g + ", trigger=" + this.f121347h + ", displayType=" + this.f121348i + ", itemCount=" + this.f121349j + ", cost=" + this.f121350k + ", netCost=" + this.f121351l + ", netLogId=" + this.o + ", status=" + this.p + ", errorMsg=" + this.q + ')';
    }

    public final boolean a() {
        if (this.f121342c > 0) {
            return true;
        }
        return false;
    }

    private e f(int i2) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.f121346g = i2;
        return this;
    }

    public final e a(g gVar) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.f121345f = gVar;
        return this;
    }

    public final e b(String str) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.q = str;
        return this;
    }

    public final e c(int i2) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.f121349j = i2;
        return this;
    }

    public final e d(int i2) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.f121352m = i2;
        return this;
    }

    public final e a(long j2) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        long j3 = this.f121342c;
        if (j3 == 0) {
            j3 = this.f121340a;
        }
        this.f121344e = j2;
        this.f121351l = (int) (j2 - j3);
        return this;
    }

    public final e e(int i2) {
        if (this.s == -1) {
            this.s = i2;
        } else if (this.t == -1) {
            this.t = i2;
        }
        return this;
    }

    public e(d dVar) {
        l.d(dVar, "");
        this.C = dVar;
    }

    public final e a(com.bytedance.ies.ugc.aweme.network.a.e eVar) {
        if (eVar == null || l.a(this, f.f121353a)) {
            return this;
        }
        this.y = eVar.b();
        return this;
    }

    public final e b(int i2) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.p = i2;
        if (i2 == 0) {
            this.q = null;
            this.r = 0;
        } else {
            this.r = 1;
        }
        return this;
    }

    public final e a(int i2) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        if (i2 == j.f121155c) {
            f(2);
        } else if (i2 == j.f121156d) {
            f(1);
        } else if (i2 == j.f121157e) {
            f(4);
        } else if (i2 == j.f121159g) {
            f(5);
        } else if (i2 == j.f121154b) {
            f(0);
        } else if (i2 == j.f121160h) {
            f(6);
        }
        this.C.setIndex(i2);
        return this;
    }

    public final e a(String str) {
        if (l.a(this, f.f121353a)) {
            return this;
        }
        this.o = str;
        return this;
    }
}
