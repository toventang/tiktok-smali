package com.ss.android.ugc.aweme.video;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import com.ss.android.ugc.playerkit.simapicommon.a.d;
import com.ss.android.ugc.playerkit.simapicommon.a.h;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;

public final class n {
    public long A;
    public com.ss.android.ugc.playerkit.a.a<Long, Long> B = c.f143497a;
    public List<? extends Surface> C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public String M;
    public boolean N = true;
    public boolean O;
    public HashMap<String, Object> P;
    public boolean Q;
    public boolean R = true;
    public boolean S;

    /* renamed from: a  reason: collision with root package name */
    public OnPreRenderListener f143481a;

    /* renamed from: b  reason: collision with root package name */
    public h f143482b;

    /* renamed from: c  reason: collision with root package name */
    public List<d> f143483c;

    /* renamed from: d  reason: collision with root package name */
    public int f143484d = -1;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.player.sdk.b.b f143485e;

    /* renamed from: f  reason: collision with root package name */
    public i f143486f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f143487g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f143488h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f143489i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f143490j;

    /* renamed from: k  reason: collision with root package name */
    public Surface f143491k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f143492l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f143493m = true;
    public String n = "";
    public String o = "";
    public boolean p = true;
    public boolean q = true;
    public x r = x.Normal;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public float w = 1.0f;
    public boolean x;
    public a y;
    public boolean z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f143494a;

        /* renamed from: b  reason: collision with root package name */
        public int f143495b;

        static {
            Covode.recordClassIndex(93889);
        }
    }

    static {
        Covode.recordClassIndex(93888);
    }

    static final class c<T, R> implements com.ss.android.ugc.playerkit.a.a<Long, Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f143497a = new c();

        static {
            Covode.recordClassIndex(93891);
        }

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.playerkit.a.a
        public final /* bridge */ /* synthetic */ Long a(Long l2) {
            return l2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final n f143496a = new n();

        static {
            Covode.recordClassIndex(93890);
        }

        public final b a(int i2) {
            this.f143496a.f143490j = i2;
            return this;
        }

        public final b b(int i2) {
            this.f143496a.L = i2;
            return this;
        }

        public final b c(int i2) {
            this.f143496a.f143484d = i2;
            return this;
        }

        public final b d(boolean z) {
            this.f143496a.p = z;
            return this;
        }

        public final b e(boolean z) {
            this.f143496a.q = z;
            return this;
        }

        public final b f(boolean z) {
            this.f143496a.s = z;
            return this;
        }

        public final b g(boolean z) {
            this.f143496a.N = z;
            return this;
        }

        public final b h(boolean z) {
            this.f143496a.v = z;
            return this;
        }

        public final b i(boolean z) {
            this.f143496a.f143493m = z;
            return this;
        }

        public final b j(boolean z) {
            this.f143496a.D = z;
            return this;
        }

        public final b k(boolean z) {
            this.f143496a.E = z;
            return this;
        }

        public final b l(boolean z) {
            this.f143496a.K = z;
            return this;
        }

        public final b m(boolean z) {
            this.f143496a.O = z;
            return this;
        }

        public final b a(x xVar) {
            this.f143496a.r = xVar;
            return this;
        }

        public final b b(String str) {
            this.f143496a.M = str;
            return this;
        }

        public final b c(boolean z) {
            this.f143496a.f143489i = z;
            return this;
        }

        public final b a(h hVar) {
            this.f143496a.f143482b = hVar;
            return this;
        }

        public final b b(boolean z) {
            this.f143496a.f143492l = z;
            return this;
        }

        public final b a(String str) {
            if (str != null) {
                this.f143496a.a(str);
            }
            return this;
        }

        public final b a(List<d> list) {
            this.f143496a.f143483c = list;
            return this;
        }

        public final b a(boolean z) {
            this.f143496a.f143487g = z;
            return this;
        }
    }

    public final void a(String str) {
        l.c(str, "");
        this.n = str;
    }
}
