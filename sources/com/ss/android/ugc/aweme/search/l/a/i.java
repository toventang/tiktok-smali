package com.ss.android.ugc.aweme.search.l.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.a.e;
import com.bytedance.lighten.a.h;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.discover.ui.SearchUserLinearLayoutManager;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.aweme.utils.fe;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public long f121363a;

    /* renamed from: b  reason: collision with root package name */
    public int f121364b;

    /* renamed from: c  reason: collision with root package name */
    public long f121365c;

    /* renamed from: d  reason: collision with root package name */
    public long f121366d;

    /* renamed from: e  reason: collision with root package name */
    public long f121367e;

    /* renamed from: f  reason: collision with root package name */
    public int f121368f;

    /* renamed from: g  reason: collision with root package name */
    public int f121369g = -1;

    /* renamed from: h  reason: collision with root package name */
    public g f121370h;

    /* renamed from: i  reason: collision with root package name */
    public int f121371i;

    /* renamed from: j  reason: collision with root package name */
    public int f121372j;

    /* renamed from: k  reason: collision with root package name */
    public int f121373k = -1;

    /* renamed from: l  reason: collision with root package name */
    public String f121374l;

    /* renamed from: m  reason: collision with root package name */
    public int f121375m = -1;
    public String n;
    public int o;
    public int p;
    public long q = -1;
    public e r;
    public int s;
    public int t = -1;
    public int u;
    public Integer v = 0;
    public boolean w;
    public final List<Runnable> x = new ArrayList();
    public final d y;

    static {
        Covode.recordClassIndex(79080);
    }

    public final i d() {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.p = 1;
        return this;
    }

    public final i e() {
        this.q = SearchUserLinearLayoutManager.f82171a;
        SearchUserLinearLayoutManager.f82171a = -1;
        return this;
    }

    public final i b() {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        long j2 = this.f121366d;
        if (j2 == 0) {
            j2 = this.f121363a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f121367e = currentTimeMillis;
        this.f121368f = (int) (currentTimeMillis - j2);
        return this;
    }

    public final i c() {
        if (!l.a(this, j.f121376a) && this.f121365c == 0) {
            this.f121365c = System.currentTimeMillis();
        }
        return this;
    }

    public final void f() {
        if (!l.a(this, j.f121376a)) {
            h.b(this.y);
        }
    }

    public final i a() {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        if (this.f121366d == 0) {
            this.f121366d = System.currentTimeMillis();
        }
        Context context = h.f39857a;
        l.b(context, "");
        this.f121369g = fe.b(context).getValue();
        return this;
    }

    public final String toString() {
        return "SearchResultShowEventV2(tabType=" + this.u + ", trigger=" + this.f121364b + ", itemCount=" + this.f121371i + ", cost=" + this.s + ", netLogId=" + this.f121374l + ", status=" + this.f121375m + ", errorMsg=" + this.n + ')';
    }

    private i g(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.u = i2;
        return this;
    }

    public final i a(g gVar) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.f121370h = gVar;
        return this;
    }

    public final i b(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.t = i2;
        return this;
    }

    public final i f(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.f121372j = i2;
        return this;
    }

    public final i a(long j2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        long j3 = this.f121366d;
        if (j3 == 0) {
            j3 = this.f121363a;
        }
        this.f121367e = j2;
        this.f121368f = (int) (j2 - j3);
        return this;
    }

    public final i d(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.o = i2;
        return this;
    }

    public final i e(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.f121371i = i2;
        return this;
    }

    public i(d dVar) {
        l.d(dVar, "");
        this.y = dVar;
    }

    public final i b(String str) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.n = str;
        return this;
    }

    public final i c(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.f121375m = i2;
        if (i2 == 0) {
            this.n = null;
            this.o = 0;
        } else {
            this.o = 1;
        }
        return this;
    }

    public final i a(int i2) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        if (i2 == j.f121155c) {
            g(2);
        } else if (i2 == j.f121156d) {
            g(1);
        } else if (i2 == j.f121157e) {
            g(4);
        } else if (i2 == j.f121159g) {
            g(5);
        } else if (i2 == j.f121154b) {
            g(0);
        } else if (i2 == j.f121160h) {
            g(6);
        }
        this.y.setIndex(i2);
        return this;
    }

    public final i a(e eVar) {
        if (eVar == null || l.a(this, j.f121376a)) {
            return this;
        }
        this.r = eVar.b();
        return this;
    }

    public final i a(String str) {
        if (l.a(this, j.f121376a)) {
            return this;
        }
        this.f121374l = str;
        return this;
    }
}
