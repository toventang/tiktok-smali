package com.ss.android.ugc.aweme.im.sdk.share.data.a;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.g;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c implements d<IMContact>, com.ss.android.ugc.aweme.im.sdk.relations.data.core.d, b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f103392e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<String> f103393a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<List<IMContact>> f103394b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<IMContact>> f103395c = new t<>();

    /* renamed from: f  reason: collision with root package name */
    private final g f103396f;

    static {
        Covode.recordClassIndex(66255);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66256);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.data.a.c$a$a  reason: collision with other inner class name */
        public static final class C2625a extends m implements h.f.a.a<g> {
            final /* synthetic */ Boolean $isSharePanel;
            final /* synthetic */ String $shareItemType;
            final /* synthetic */ c.b $widgetType;

            static {
                Covode.recordClassIndex(66257);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2625a(String str, c.b bVar, Boolean bool) {
                super(0);
                this.$shareItemType = str;
                this.$widgetType = bVar;
                this.$isSharePanel = bool;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ g invoke() {
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c cVar = new com.ss.android.ugc.aweme.im.sdk.relations.data.b.c(2, false);
                cVar.f102984e = true;
                cVar.f102986g = true;
                cVar.f102989j = true;
                cVar.f102988i = true;
                cVar.f102981b = this.$shareItemType;
                cVar.f102990k = this.$widgetType;
                cVar.f102980a = this.$isSharePanel;
                return new g(cVar);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(String str, Boolean bool, c.b bVar) {
            return new c((g) i.a((h.f.a.a) new C2625a(str, bVar, bool)).getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final /* bridge */ /* synthetic */ LiveData a() {
        return this.f103393a;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final /* bridge */ /* synthetic */ LiveData b() {
        return this.f103394b;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final /* bridge */ /* synthetic */ LiveData c() {
        return this.f103395c;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void e() {
        this.f103396f.a((d<IMContact>) this);
        this.f103396f.a((com.ss.android.ugc.aweme.im.sdk.relations.data.core.d) this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void f() {
        this.f103396f.d();
        this.f103396f.m();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void d() {
        List<IMContact> e2 = this.f103396f.e();
        if (!e2.isEmpty()) {
            a(e2, this.f103396f.f());
        } else {
            this.f103396f.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(Throwable th) {
        l.d(th, "");
        l.d(th, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void c(Throwable th) {
        l.d(th, "");
        l.d(th, "");
    }

    public c(g gVar) {
        l.d(gVar, "");
        this.f103396f = gVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.data.a.b
    public final void a(String str) {
        l.d(str, "");
        this.f103393a.setValue(str);
        if (str.length() == 0) {
            this.f103394b.setValue(z.INSTANCE);
        } else {
            this.f103396f.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.d
    public final void b(Throwable th) {
        l.d(th, "");
        this.f103395c.postValue(new ArrayList());
        com.ss.android.ugc.aweme.im.service.m.a.a("ShareContactsRepository", "onSearchError", th);
    }

    private static List<IMContact> a(List<IMContact> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == 3) {
                break;
            }
        }
        int b2 = n.b((List) list, (Object) t);
        if (t == null || b2 < 0) {
            return list;
        }
        return n.d((Collection) n.o(list.subList(0, b2)), (Iterable) list.subList(b2, list.size()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void b(List<IMContact> list, boolean z) {
        l.d(list, "");
        l.d(list, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.d
    public final void a(List<IMContact> list, String str) {
        l.d(list, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareContactsRepository", "onSearchResult: " + list.size());
        this.f103394b.setValue(list);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.d
    public final void a(List<IMContact> list, boolean z) {
        l.d(list, "");
        List<IMContact> a2 = a(list);
        com.ss.android.ugc.aweme.im.service.m.a.b("ShareContactsRepository", "onLoadSuccess: " + a2.size() + ", " + z);
        this.f103395c.setValue(a2);
    }
}
