package com.ss.android.ugc.aweme.im.sdk.relations.data.core.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class c extends f<IMUser, IMContact> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f103026f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<String> f103027a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<? extends List<String>> f103028b;

    /* renamed from: c  reason: collision with root package name */
    public String f103029c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f103030d;

    /* renamed from: e  reason: collision with root package name */
    public int f103031e;
    private final h.f.a.b<IMUser, IMContact> r;
    private final h.f.a.b<List<? extends IMUser>, List<IMContact>> s;

    static {
        Covode.recordClassIndex(66045);
    }

    public static final class a extends f.a<c, IMUser, IMContact> {

        /* renamed from: a  reason: collision with root package name */
        public final c f103032a = new c((byte) 0);

        static {
            Covode.recordClassIndex(66046);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ c a() {
            return this.f103032a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ c b() {
            return this.f103032a;
        }

        public final a a(boolean z) {
            this.f103032a.f103030d = z;
            return this;
        }

        public final a a(h.f.a.a<? extends List<String>> aVar) {
            l.d(aVar, "");
            this.f103032a.f103028b = aVar;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f103032a.f103029c = str;
            return this;
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(66047);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final h.f.a.b<IMUser, IMContact> a() {
        return this.r;
    }

    private c() {
        this.r = d.f103034a;
        this.s = C2610c.f103033a;
    }

    private final List<String> i() {
        List<String> list;
        h.f.a.a<? extends List<String>> aVar = this.f103028b;
        if (aVar == null || (list = (List) aVar.invoke()) == null) {
            return this.f103027a;
        }
        return list;
    }

    private final int j() {
        if (this.f103030d) {
            return -1;
        }
        if (this.n < 0) {
            this.n = 100;
        }
        return this.n + 5;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean b() {
        String str;
        if (!super.b() || (str = this.f103029c) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<IMUser> d() {
        if (!this.f103030d) {
            int j2 = j();
            com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
            List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(i(), j2, this.f103031e * j2, this.f103029c);
            com.ss.android.ugc.aweme.im.service.m.a.c("FollowLoader", "loadMoreInternal: " + a2.size() + " pageIndex:" + this.f103031e + " pageSize:" + j2);
            this.f103031e++;
            return a2;
        }
        throw new UnsupportedOperationException("Weight sort mode not support load more!");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a4  */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.aweme.im.service.model.IMUser> c() {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c.c():java.util.List");
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.c$c  reason: collision with other inner class name */
    static final class C2610c extends m implements h.f.a.b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2610c f103033a = new C2610c();

        static {
            Covode.recordClassIndex(66048);
        }

        C2610c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ List<? extends IMUser> invoke(List<? extends IMUser> list) {
            l.d(list, "");
            return list;
        }
    }

    static final class d extends m implements h.f.a.b<IMUser, IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103034a = new d();

        static {
            Covode.recordClassIndex(66049);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ IMUser invoke(IMUser iMUser) {
            l.d(iMUser, "");
            return iMUser;
        }
    }
}
