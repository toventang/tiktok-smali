package com.ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.b.b;
import com.ss.ugc.effectplatform.a.c.c;
import com.ss.ugc.effectplatform.a.c.e;
import com.ss.ugc.effectplatform.b.f;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse;
import com.ss.ugc.effectplatform.util.g;
import com.ss.ugc.effectplatform.util.i;
import com.ss.ugc.effectplatform.util.j;
import com.ss.ugc.effectplatform.util.p;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class FetchCategoryEffectTask extends a<CategoryPageModel, CategoryEffectListResponse> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f153669c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.ugc.effectplatform.a f153670d;

    /* renamed from: f  reason: collision with root package name */
    private final String f153671f;

    /* renamed from: g  reason: collision with root package name */
    private final String f153672g;

    /* renamed from: h  reason: collision with root package name */
    private final int f153673h;

    /* renamed from: i  reason: collision with root package name */
    private final int f153674i;

    /* renamed from: j  reason: collision with root package name */
    private final int f153675j;

    /* renamed from: k  reason: collision with root package name */
    private final String f153676k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f153677l = null;

    static {
        Covode.recordClassIndex(102523);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int e() {
        return 10002;
    }

    /* access modifiers changed from: package-private */
    public static final class CategoryVersion {
        private final int cursor;
        private final int sorting_position;
        private final String version;

        static {
            Covode.recordClassIndex(102524);
        }

        public static /* synthetic */ CategoryVersion copy$default(CategoryVersion categoryVersion, String str, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = categoryVersion.version;
            }
            if ((i4 & 2) != 0) {
                i2 = categoryVersion.cursor;
            }
            if ((i4 & 4) != 0) {
                i3 = categoryVersion.sorting_position;
            }
            return categoryVersion.copy(str, i2, i3);
        }

        public final String component1() {
            return this.version;
        }

        public final int component2() {
            return this.cursor;
        }

        public final int component3() {
            return this.sorting_position;
        }

        public final CategoryVersion copy(String str, int i2, int i3) {
            l.c(str, "");
            return new CategoryVersion(str, i2, i3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryVersion)) {
                return false;
            }
            CategoryVersion categoryVersion = (CategoryVersion) obj;
            return l.a(this.version, categoryVersion.version) && this.cursor == categoryVersion.cursor && this.sorting_position == categoryVersion.sorting_position;
        }

        public final int hashCode() {
            String str = this.version;
            return ((((str != null ? str.hashCode() : 0) * 31) + this.cursor) * 31) + this.sorting_position;
        }

        public final String toString() {
            return "CategoryVersion(version=" + this.version + ", cursor=" + this.cursor + ", sorting_position=" + this.sorting_position + ")";
        }

        public final int getCursor() {
            return this.cursor;
        }

        public final int getSorting_position() {
            return this.sorting_position;
        }

        public final String getVersion() {
            return this.version;
        }

        public CategoryVersion(String str, int i2, int i3) {
            l.c(str, "");
            this.version = str;
            this.cursor = i2;
            this.sorting_position = i3;
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102525);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final int d() {
        return this.f153670d.n;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final e c() {
        String str;
        HashMap<String, String> a2 = i.a(this.f153670d, true);
        a2.put("panel", this.f153671f);
        String str2 = this.f153672g;
        if (str2 == null) {
            str2 = "hot";
        }
        a2.put("category", str2);
        a2.put("cursor", String.valueOf(this.f153674i));
        a2.put("count", String.valueOf(this.f153673h));
        a2.put("sorting_position", String.valueOf(this.f153675j));
        String str3 = this.f153676k;
        if (str3 == null) {
            str3 = "0";
        }
        a2.put("version", str3);
        String str4 = this.f153670d.y;
        if (str4 != null) {
            a2.put("test_status", str4);
        }
        Map<String, String> map = this.f153677l;
        if (map != null) {
            a2.putAll(map);
        }
        c cVar = c.GET;
        StringBuilder append = new StringBuilder().append(this.f153670d.A).append(this.f153670d.f153401a);
        if (this.f153670d.p == 2) {
            str = "/category/effects/v2";
        } else {
            str = "/category/effects";
        }
        return new e(p.a(a2, append.append(str).toString()), cVar, null, null, false, 60);
    }

    private final long a(CategoryEffectListResponse categoryEffectListResponse) {
        String str;
        int i2;
        String convertObjToJson;
        f fVar;
        CategoryEffectModel category_effects;
        CategoryEffectModel category_effects2;
        CategoryEffectModel category_effects3;
        String convertObjToJson2;
        long j2;
        String a2 = g.a(this.f153671f, this.f153672g, this.f153673h, this.f153674i, this.f153675j);
        long j3 = 0;
        try {
            b bVar = this.f153670d.q;
            if (!(bVar == null || (convertObjToJson2 = bVar.f153430a.convertObjToJson(categoryEffectListResponse)) == null)) {
                f fVar2 = (f) d.a.b.b.a(this.f153670d.w);
                if (fVar2 != null) {
                    j2 = fVar2.a(a2, convertObjToJson2);
                } else {
                    j2 = 0;
                }
                j3 = j2 / ((long) com.ss.ugc.effectplatform.c.a.f153563a);
            }
        } catch (Exception e2) {
            d.a.e.b.a("FetchCategoryEffectTask", "Json Exception: ".concat(String.valueOf(e2)), null);
        }
        try {
            CategoryPageModel data = categoryEffectListResponse.getData();
            if (data == null || (category_effects3 = data.getCategory_effects()) == null || (str = category_effects3.getVersion()) == null) {
                str = "0";
            }
            CategoryPageModel data2 = categoryEffectListResponse.getData();
            int i3 = 0;
            if (data2 == null || (category_effects2 = data2.getCategory_effects()) == null) {
                i2 = 0;
            } else {
                i2 = category_effects2.getCursor();
            }
            CategoryPageModel data3 = categoryEffectListResponse.getData();
            if (!(data3 == null || (category_effects = data3.getCategory_effects()) == null)) {
                i3 = category_effects.getSorting_position();
            }
            CategoryVersion categoryVersion = new CategoryVersion(str, i2, i3);
            b bVar2 = this.f153670d.q;
            if (!(bVar2 == null || (convertObjToJson = bVar2.f153430a.convertObjToJson(categoryVersion)) == null || (fVar = (f) d.a.b.b.a(this.f153670d.w)) == null)) {
                fVar.a(g.b(this.f153671f, this.f153672g), convertObjToJson);
            }
        } catch (Exception e3) {
            d.a.e.b.a("FetchCategoryEffectTask", "Json Exception: ".concat(String.valueOf(e3)), null);
        }
        return j3;
    }

    /* Return type fixed from 'com.ss.ugc.effectplatform.model.h' to match base method */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ CategoryEffectListResponse a(b bVar, String str) {
        l.c(bVar, "");
        l.c(str, "");
        return (CategoryEffectListResponse) bVar.f153430a.convertJsonToObj(str, CategoryEffectListResponse.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.a
    public final void a(String str, String str2, com.ss.ugc.effectplatform.model.e eVar) {
        l.c(eVar, "");
        eVar.a(str, this.f153670d.A, str2);
        super.a(str, str2, eVar);
        V v = this.f153670d.s.f156544a;
        if (v != null) {
            com.ss.ugc.effectplatform.a aVar = this.f153670d;
            String str3 = this.f153671f;
            String str4 = this.f153672g;
            if (str4 == null) {
                str4 = "";
            }
            h.p[] pVarArr = new h.p[3];
            pVarArr[0] = v.a("error_code", Integer.valueOf(eVar.f153651a));
            if (str2 == null) {
                str2 = "";
            }
            pVarArr[1] = v.a("host_ip", str2);
            if (str == null) {
                str = "";
            }
            pVarArr[2] = v.a("download_url", str);
            com.ss.ugc.effectplatform.i.b.a(v, false, aVar, str3, str4, ag.a(pVarArr), eVar.f153652b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [long, long, long, com.ss.ugc.effectplatform.model.h] */
    @Override // com.ss.ugc.effectplatform.task.a
    public final /* synthetic */ void a(long j2, long j3, long j4, CategoryEffectListResponse categoryEffectListResponse) {
        List<Effect> list;
        List<Effect> list2;
        List<Effect> list3;
        List<Effect> list4;
        List<Effect> list5;
        CategoryEffectListResponse categoryEffectListResponse2 = categoryEffectListResponse;
        String str = "";
        l.c(categoryEffectListResponse2, str);
        CategoryPageModel data = categoryEffectListResponse2.getData();
        if (data != null) {
            String str2 = this.f153670d.f153409i;
            String str3 = this.f153671f;
            CategoryEffectModel category_effects = data.getCategory_effects();
            List<Effect> list6 = null;
            if (category_effects != null) {
                list = category_effects.getCategory_effects();
            } else {
                list = null;
            }
            j.a(str2, str3, list);
            String str4 = this.f153670d.f153409i;
            String str5 = this.f153671f;
            CategoryEffectModel category_effects2 = data.getCategory_effects();
            if (category_effects2 != null) {
                list2 = category_effects2.getCollection();
            } else {
                list2 = null;
            }
            j.a(str4, str5, list2);
            String str6 = this.f153670d.f153409i;
            String str7 = this.f153671f;
            CategoryEffectModel category_effects3 = data.getCategory_effects();
            if (category_effects3 != null) {
                list3 = category_effects3.getBind_effects();
            } else {
                list3 = null;
            }
            j.a(str6, str7, list3);
            if (this.f153670d.p == 2) {
                List<String> url_prefix = data.getUrl_prefix();
                CategoryEffectModel category_effects4 = data.getCategory_effects();
                if (category_effects4 != null) {
                    list4 = category_effects4.getCategory_effects();
                } else {
                    list4 = null;
                }
                j.a(url_prefix, list4);
                List<String> url_prefix2 = data.getUrl_prefix();
                CategoryEffectModel category_effects5 = data.getCategory_effects();
                if (category_effects5 != null) {
                    list5 = category_effects5.getCollection();
                } else {
                    list5 = null;
                }
                j.a(url_prefix2, list5);
                List<String> url_prefix3 = data.getUrl_prefix();
                CategoryEffectModel category_effects6 = data.getCategory_effects();
                if (category_effects6 != null) {
                    list6 = category_effects6.getBind_effects();
                }
                j.a(url_prefix3, list6);
            }
            long a2 = a(categoryEffectListResponse2);
            super.a(j2, j3, j4, categoryEffectListResponse2);
            long currentTimeMillis = System.currentTimeMillis();
            V v = this.f153670d.s.f156544a;
            if (v != null) {
                com.ss.ugc.effectplatform.a aVar = this.f153670d;
                String str8 = this.f153671f;
                String str9 = this.f153672g;
                if (str9 != null) {
                    str = str9;
                }
                com.ss.ugc.effectplatform.i.b.a(v, true, aVar, str8, str, ag.a(v.a("duration", Long.valueOf(currentTimeMillis - j2)), v.a("network_time", Long.valueOf(j3 - j2)), v.a("json_time", Long.valueOf(j4 - j3)), v.a("io_time", Long.valueOf(currentTimeMillis - j4)), v.a("size", Long.valueOf(a2))), "");
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCategoryEffectTask(com.ss.ugc.effectplatform.a aVar, String str, String str2, String str3, int i2, int i3, int i4, String str4, Map<String, String> map) {
        super(aVar.r.f156544a, aVar.q, aVar.K, str2);
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f153670d = aVar;
        this.f153671f = str;
        this.f153672g = str3;
        this.f153673h = i2;
        this.f153674i = i3;
        this.f153675j = i4;
        this.f153676k = str4;
    }
}
