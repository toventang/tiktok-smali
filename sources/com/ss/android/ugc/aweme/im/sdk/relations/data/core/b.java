package com.ss.android.ugc.aweme.im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b extends f<IMUser, IMContact> {

    /* renamed from: e  reason: collision with root package name */
    public static final C2612b f103065e = new C2612b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<String> f103066a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<? extends List<String>> f103067b;

    /* renamed from: c  reason: collision with root package name */
    public String f103068c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.relations.data.b.d[] f103069d;

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.b<IMUser, IMContact> f103070f;
    private final h.f.a.b<List<? extends IMUser>, List<IMContact>> r;

    static {
        Covode.recordClassIndex(66075);
    }

    public static final class a extends f.a<b, IMUser, IMContact> {

        /* renamed from: a  reason: collision with root package name */
        public final b f103071a = new b((byte) 0);

        static {
            Covode.recordClassIndex(66076);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ b a() {
            return this.f103071a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f.a
        public final /* bridge */ /* synthetic */ b b() {
            return this.f103071a;
        }

        public final a a(com.ss.android.ugc.aweme.im.sdk.relations.data.b.d[] dVarArr) {
            this.f103071a.f103069d = dVarArr;
            return this;
        }

        public final a a(h.f.a.a<? extends List<String>> aVar) {
            l.d(aVar, "");
            this.f103071a.f103067b = aVar;
            return this;
        }

        public final a a(String str) {
            l.d(str, "");
            this.f103071a.f103068c = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.b$b  reason: collision with other inner class name */
    public static final class C2612b {
        static {
            Covode.recordClassIndex(66077);
        }

        private C2612b() {
        }

        public /* synthetic */ C2612b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final h.f.a.b<IMUser, IMContact> a() {
        return this.f103070f;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<IMUser> d() {
        throw new UnsupportedOperationException("FamiliarsLoader not support load more");
    }

    private b() {
        this.f103070f = d.f103077a;
        this.r = c.f103074a;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f, com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.e
    public final boolean b() {
        String str;
        if (!super.b() || (str = this.f103068c) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f
    public final List<IMUser> c() {
        List<String> list;
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.a();
        Map<String, Integer> c2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.c();
        if (c2.isEmpty()) {
            return new ArrayList();
        }
        com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a();
        h.f.a.a<? extends List<String>> aVar = this.f103067b;
        if (aVar == null || (list = (List) aVar.invoke()) == null) {
            list = this.f103066a;
        }
        if (this.n < 0) {
            this.n = 100;
        }
        List<IMUser> a2 = com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c.a(list, this.n + 5, 0, this.f103068c);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.ss.android.ugc.aweme.im.sdk.relations.data.b.d[] dVarArr = this.f103069d;
        if (dVarArr != null) {
            for (com.ss.android.ugc.aweme.im.sdk.relations.data.b.d dVar : dVarArr) {
                linkedHashMap.put(Integer.valueOf(dVar.f102994a), dVar.f102995b);
            }
        }
        ArrayList arrayList = new ArrayList();
        l.b(a2, "");
        for (T t : a2) {
            if ((t instanceof IMUser) && c2.keySet().contains(t.getSecUid())) {
                t.setRecType((String) linkedHashMap.get(c2.get(t.getSecUid())));
                arrayList.add(t);
            }
        }
        if (arrayList.size() > 1) {
            n.a((List) arrayList, (Comparator) new e(linkedHashMap, c2));
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("FamiliarsLoader", "loadInternal: " + arrayList.size());
        return arrayList;
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    static final class c extends m implements h.f.a.b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f103074a = new c();

        static {
            Covode.recordClassIndex(66078);
        }

        c() {
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
        public static final d f103077a = new d();

        static {
            Covode.recordClassIndex(66079);
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

    public static final class e<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f103080a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f103081b;

        static {
            Covode.recordClassIndex(66080);
        }

        public e(Map map, Map map2) {
            this.f103080a = map;
            this.f103081b = map2;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a((String) this.f103080a.get(this.f103081b.get(t.getSecUid())), (String) this.f103080a.get(this.f103081b.get(t2.getSecUid())));
        }
    }
}
