package com.ss.android.ugc.aweme.discover.mixfeed;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.f;
import com.ss.android.ugc.aweme.discover.mob.q;
import com.ss.android.ugc.aweme.search.gson.SearchMixFeedCollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.l.a.a.e;
import com.ss.android.ugc.aweme.search.l.a.g;
import com.ss.android.ugc.aweme.search.l.a.h;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.List;

public final class n implements com.ss.android.ugc.aweme.discover.j.a {
    public static final b z = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.model.d f81835a;

    /* renamed from: b  reason: collision with root package name */
    public String f81836b;

    /* renamed from: c  reason: collision with root package name */
    public int f81837c;

    /* renamed from: d  reason: collision with root package name */
    public int f81838d;

    /* renamed from: e  reason: collision with root package name */
    public int f81839e;

    /* renamed from: f  reason: collision with root package name */
    public String f81840f;

    /* renamed from: g  reason: collision with root package name */
    public String f81841g;

    /* renamed from: h  reason: collision with root package name */
    public int f81842h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.g.b f81843i;

    /* renamed from: j  reason: collision with root package name */
    public String f81844j;

    /* renamed from: k  reason: collision with root package name */
    public int f81845k;

    /* renamed from: l  reason: collision with root package name */
    public Integer f81846l;

    /* renamed from: m  reason: collision with root package name */
    public Integer f81847m;
    public Integer n;
    public int o;
    public int p;
    public String q;
    public String r;
    public int s;
    public String t;
    public String u;
    public String v;
    public f w;
    public String x;
    public boolean y;

    public static final class b {
        static {
            Covode.recordClassIndex(50821);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private n() {
        this.f81836b = "";
        this.f81840f = "";
        this.f81844j = "";
        this.q = "";
        this.r = "";
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f81848a;

        static {
            Covode.recordClassIndex(50820);
        }

        public a() {
            n nVar = new n((byte) 0);
            this.f81848a = nVar;
            nVar.o = p.f81851a;
            nVar.p = p.f81852b;
        }

        public final n a() {
            if (this.f81848a.f81843i == null) {
                a((com.ss.android.ugc.aweme.search.g.b) null);
            }
            return this.f81848a;
        }

        public final a a(int i2) {
            this.f81848a.f81837c = i2;
            return this;
        }

        public final a b(int i2) {
            this.f81848a.f81838d = i2;
            return this;
        }

        public final a c(int i2) {
            this.f81848a.f81839e = i2;
            return this;
        }

        public final a d(int i2) {
            this.f81848a.f81842h = i2;
            return this;
        }

        public final a e(int i2) {
            this.f81848a.f81845k = i2;
            return this;
        }

        public final a g(String str) {
            this.f81848a.u = str;
            return this;
        }

        public final a h(String str) {
            this.f81848a.t = str;
            return this;
        }

        public final a a(com.ss.android.ugc.aweme.search.model.d dVar) {
            this.f81848a.f81835a = dVar;
            return this;
        }

        public final a b(String str) {
            l.d(str, "");
            this.f81848a.f81840f = str;
            return this;
        }

        public final a c(String str) {
            this.f81848a.f81841g = str;
            return this;
        }

        public final a d(String str) {
            l.d(str, "");
            this.f81848a.f81844j = str;
            return this;
        }

        public final a e(String str) {
            l.d(str, "");
            this.f81848a.q = str;
            return this;
        }

        public final a f(String str) {
            l.d(str, "");
            this.f81848a.r = str;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f81848a.f81836b = str;
            return this;
        }

        public final a a(com.ss.android.ugc.aweme.search.g.b bVar) {
            int i2;
            if (bVar != null) {
                this.f81848a.f81843i = bVar;
                this.f81848a.f81847m = Integer.valueOf(bVar.getSortType());
                this.f81848a.n = Integer.valueOf(bVar.getFilterBy());
                n nVar = this.f81848a;
                if (!bVar.isDefaultOption()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                nVar.f81846l = Integer.valueOf(i2);
            }
            return this;
        }
    }

    static {
        Covode.recordClassIndex(50819);
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (p.f81851a == 0) {
            p.f81851a = com.ss.android.ugc.aweme.base.utils.n.b((double) i.b(a2));
        }
        if (p.f81852b == 0) {
            p.f81852b = com.ss.android.ugc.aweme.base.utils.n.b((double) i.a(a2));
        }
    }

    public final b.i<m> a() {
        if (this.f81837c == 0) {
            g.a(this.f81835a).b();
            h.a(this.f81835a).a().b(0);
            com.ss.android.ugc.aweme.search.l.a.a.f121303d.a();
            com.ss.android.ugc.aweme.search.l.a.a.f121302c.a((Integer) 0);
            q.a(j.f121154b);
            SearchMixFeedCollectionTypeAdapterFactory.f121128a = true;
            this.x = s.a.a().a();
        } else {
            SearchMixFeedCollectionTypeAdapterFactory.f121128a = false;
        }
        b.i<m> a2 = o.a(this);
        b.i<TContinuationResult> b2 = a2.b(new c(this, a2));
        l.b(b2, "");
        return b2;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int hashCode = ((((((((((((((this.f81836b.hashCode() * 31) + this.f81837c) * 31) + this.f81838d) * 31) + this.f81839e) * 31) + this.f81840f.hashCode()) * 31) + this.f81842h) * 31) + this.f81844j.hashCode()) * 31) + this.f81845k) * 31;
        Integer num = this.f81846l;
        int i4 = -1;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        int i5 = (hashCode + i2) * 31;
        Integer num2 = this.f81847m;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = -1;
        }
        int i6 = (i5 + i3) * 31;
        Integer num3 = this.n;
        if (num3 != null) {
            i4 = num3.intValue();
        }
        return i6 + i4;
    }

    public final b.i<com.bytedance.ies.ugc.aweme.network.a.b<m>> b() {
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        LinkedHashMap<String, Integer> linkedHashMap;
        com.ss.android.ugc.aweme.search.model.d dVar;
        if (this.f81837c == 0) {
            g.a(this.f81835a).b();
            h.a(this.f81835a).a().b(1);
            com.ss.android.ugc.aweme.search.l.a.a.f121303d.a((Integer) 1);
            q.a(j.f121154b);
        }
        SearchMixFeedCollectionTypeAdapterFactory.f121128a = false;
        SearchApiNew.RealApi realApi = SearchApiNew.RealApi.a.f80781a;
        String str5 = this.f81836b;
        int i5 = this.f81837c;
        int i6 = this.f81838d;
        if (!TextUtils.isEmpty(this.f81844j)) {
            str = this.f81844j;
        } else {
            str = null;
        }
        int i7 = this.f81845k;
        if (!TextUtils.isEmpty(this.f81840f)) {
            str2 = this.f81840f;
        } else {
            str2 = null;
        }
        String str6 = this.f81841g;
        int i8 = this.f81842h;
        int i9 = this.s;
        String str7 = this.t;
        String str8 = this.u;
        Integer num = this.f81846l;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        Integer num2 = this.n;
        if (num2 != null) {
            i3 = num2.intValue();
        } else {
            i3 = 0;
        }
        Integer num3 = this.f81847m;
        if (num3 != null) {
            i4 = num3.intValue();
        } else {
            i4 = 0;
        }
        f fVar = this.w;
        if (fVar == null || (dVar = fVar.r) == null) {
            str3 = null;
        } else {
            str3 = dVar.getGuideSearchBaseWord();
        }
        String a2 = RawURLGetter.a("other");
        com.ss.android.ugc.aweme.search.model.d dVar2 = this.f81835a;
        if (dVar2 != null) {
            str4 = dVar2.getTrendingEventId();
        } else {
            str4 = null;
        }
        String a3 = s.a.a().a();
        if (a3 == null) {
            a3 = "";
        }
        String str9 = this.r;
        String str10 = this.v;
        com.ss.android.ugc.aweme.search.g.b bVar = this.f81843i;
        if (bVar == null || (linkedHashMap = bVar.activityToFieldMap()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        return realApi.searchMTMixFeedListByChunk(str5, i5, i6, str, i7, str2, str6, i8, i9, str7, str8, i2, i3, i4, str3, a2, str4, a3, str9, str10, linkedHashMap);
    }

    public final String toString() {
        return "SearchMixFeedRequest(keyword='" + this.f81836b + "', cursor=" + this.f81837c + ", count=" + this.f81838d + ", pullRefresh=" + this.f81839e + ", searchId='" + this.f81840f + "', correctType=" + this.f81842h + ", searchSource='" + this.f81844j + "', hotSearchSource=" + this.f81845k + ", sortType=" + this.f81847m + ", filterBy=" + this.n + ", clientWidth=" + this.o + ')';
    }

    public /* synthetic */ n(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<e, z> {
        final /* synthetic */ String $from;

        static {
            Covode.recordClassIndex(50824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.$from = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            e eVar2 = eVar;
            String str = "";
            l.d(eVar2, str);
            String str2 = this.$from;
            if (str2 != null) {
                str = str2;
            }
            eVar2.a(2, str);
            return z.f158842a;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!l.a(getClass(), obj.getClass()))) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f81837c == nVar.f81837c && this.f81838d == nVar.f81838d && this.f81839e == nVar.f81839e && this.f81842h == nVar.f81842h && this.f81845k == nVar.f81845k && !(!l.a(this.f81847m, nVar.f81847m)) && !(!l.a(this.n, nVar.n)) && !(!l.a((Object) this.f81836b, (Object) nVar.f81836b)) && !(!l.a((Object) this.f81840f, (Object) nVar.f81840f)) && !(!l.a((Object) this.f81844j, (Object) nVar.f81844j))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f81849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.i f81850b;

        static {
            Covode.recordClassIndex(50822);
        }

        c(n nVar, b.i iVar) {
            this.f81849a = nVar;
            this.f81850b = iVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            int i2;
            int i3;
            com.ss.android.ugc.aweme.search.l.a.e d2 = g.a(this.f81849a.f81835a).d();
            com.ss.android.ugc.aweme.search.l.a.i b2 = h.a(this.f81849a.f81835a).b();
            q.b(j.f121154b);
            if (this.f81850b.c()) {
                final Exception e2 = this.f81850b.e();
                com.ss.android.ugc.aweme.discover.api.a.f80827a = null;
                d2.b(1).b(e2.getMessage());
                b2.c(1).b(e2.getMessage());
                com.ss.android.ugc.aweme.search.l.a.a.a((h.f.a.b<? super e, z>) new h.f.a.b<e, z>() {
                    /* class com.ss.android.ugc.aweme.discover.mixfeed.n.c.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(50823);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(e eVar) {
                        e eVar2 = eVar;
                        l.d(eVar2, "");
                        eVar2.a(e2);
                        return z.f158842a;
                    }
                });
            } else if (this.f81850b.b()) {
                com.ss.android.ugc.aweme.discover.api.a.f80827a = null;
                d2.b(2).g();
                b2.c(2).f();
            } else {
                m mVar = (m) this.f81850b.d();
                l.b(mVar, "");
                com.ss.android.ugc.aweme.discover.api.a.a(mVar.f81827e);
                List<h> list = mVar.f81826c;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                d2.c(i2).a(mVar.getRequestId()).a(mVar).b(0);
                List<h> list2 = mVar.f81826c;
                if (list2 != null) {
                    i3 = list2.size();
                } else {
                    i3 = 0;
                }
                com.ss.android.ugc.aweme.search.l.a.i a2 = b2.e(i3).a(mVar.getRequestId());
                Integer valueOf = Integer.valueOf(mVar.f81824a);
                if (!l.a(a2, com.ss.android.ugc.aweme.search.l.a.j.f121376a)) {
                    a2.v = valueOf;
                }
                a2.a(mVar).c(0);
            }
            if (this.f81849a.y) {
                return null;
            }
            return iVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.j.a
    public final void a(int i2, String str) {
        this.y = true;
        g.a(this.f81835a).d().b(2).g();
        h.a(this.f81835a).b().c(2).d(i2).f();
        com.ss.android.ugc.aweme.search.l.a.a.a((h.f.a.b<? super e, z>) new d(str));
    }
}
