package com.ss.android.ugc.aweme.base;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import h.a.ag;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import l.b.o;

public final class AnchorListManager {

    /* renamed from: a  reason: collision with root package name */
    public static final Keva f67936a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f67937b;

    /* renamed from: c  reason: collision with root package name */
    static String f67938c;

    /* renamed from: d  reason: collision with root package name */
    public static int f67939d;

    /* renamed from: e  reason: collision with root package name */
    static Map<String, AnchorPublishStruct> f67940e;

    /* renamed from: f  reason: collision with root package name */
    public static final AnchorListManager f67941f = new AnchorListManager();

    /* renamed from: g  reason: collision with root package name */
    private static final String f67942g;

    /* renamed from: h  reason: collision with root package name */
    private static final AnchorListApi f67943h;

    /* renamed from: i  reason: collision with root package name */
    private static final com.bytedance.ies.ugc.aweme.network.f f67944i;

    /* renamed from: j  reason: collision with root package name */
    private static final Keva f67945j;

    /* renamed from: k  reason: collision with root package name */
    private static final com.google.gson.f f67946k = new com.google.gson.f();

    public interface AnchorImpressionApi {
        static {
            Covode.recordClassIndex(41821);
        }

        @o(a = "/aweme/v1/anchor/addlink/impression/report/")
        @l.b.e
        i<Object> postAnchorImpressionReport(@l.b.c(a = "impression_list_json") String str);
    }

    public interface AnchorListApi {
        static {
            Covode.recordClassIndex(41822);
        }

        @l.b.f(a = "/aweme/v1/anchor/list/")
        i<a> getAnchorList();
    }

    public interface c {
        static {
            Covode.recordClassIndex(41828);
        }

        int a();
    }

    public static final class f extends com.google.gson.b.a<Map<String, AnchorPublishStruct>> {
        static {
            Covode.recordClassIndex(41832);
        }

        f() {
        }
    }

    public static final class h extends com.google.gson.b.a<Map<String, AnchorPublishStruct>> {
        static {
            Covode.recordClassIndex(41834);
        }

        h() {
        }
    }

    private AnchorListManager() {
    }

    public static final class d {
        @com.google.gson.a.c(a = "anchor_type")

        /* renamed from: a  reason: collision with root package name */
        public final String f67951a;

        static {
            Covode.recordClassIndex(41829);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && l.a(this.f67951a, ((d) obj).f67951a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f67951a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "AnchorLogExtra(impressionType=" + this.f67951a + ")";
        }

        private /* synthetic */ d() {
            this("");
        }

        private d(String str) {
            this.f67951a = str;
        }
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f67954a = new g();

        static {
            Covode.recordClassIndex(41833);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AnchorListManager.g();
            return z.f158842a;
        }
    }

    public static boolean b() {
        if (f67939d > 0) {
            return true;
        }
        return false;
    }

    public static Map<String, AnchorPublishStruct> d() {
        return c();
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f67952a = new e();

        static {
            Covode.recordClassIndex(41830);
        }

        e() {
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            public static final a f67953a = new a();

            static {
                Covode.recordClassIndex(41831);
            }

            a() {
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                if (AnchorListManager.e()) {
                    AnchorListManager.g();
                }
                return z.f158842a;
            }
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            Map map;
            l.b(iVar, "");
            a aVar = (a) iVar.d();
            if (aVar == null) {
                r.a("rd_tiktokec_shop_fetch_anchor_list", new com.ss.android.ugc.aweme.app.f.d().a("where", "AnchorListManager").a("error_code", "-1").a("error_msg", "anchorList result is null").f66730a);
            } else if (aVar.f67957a == 0) {
                AnchorListManager.f67937b = true;
                List<AnchorPublishStruct> list = aVar.f67959c;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        arrayList.add(v.a(AnchorListManager.b((AnchorPublishStruct) t), t));
                    }
                    map = ag.a(arrayList);
                } else {
                    map = null;
                }
                Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct>");
                AnchorListManager.f67940e = ad.h(map);
                i.b(g.f67954a, i.f4824a);
                AnchorListManager.f67938c = aVar.f67960d;
                AnchorListManager.b(AnchorListManager.c());
                AnchorListManager.a(AnchorListManager.c());
                ArrayList arrayList2 = new ArrayList();
                Map<String, AnchorPublishStruct> c2 = AnchorListManager.c();
                if (c2 != null) {
                    for (Map.Entry<String, AnchorPublishStruct> entry : c2.entrySet()) {
                        arrayList2.add(Integer.valueOf(entry.getValue().type));
                    }
                }
                r.a("rd_tiktokec_shop_fetch_anchor_list", new com.ss.android.ugc.aweme.app.f.d().a("where", "AnchorListManager").a("error_code", String.valueOf(aVar.f67957a)).a("error_msg", "anchorList fetch success").a("anchor_type", arrayList2.toString()).f66730a);
                i.b(a.f67953a, i.f4824a);
            } else {
                r.a("rd_tiktokec_shop_fetch_anchor_list", new com.ss.android.ugc.aweme.app.f.d().a("where", "AnchorListManager").a("error_code", String.valueOf(aVar.f67957a)).a("error_msg", "anchorList statusCode is error").f66730a);
            }
            return null;
        }
    }

    public static boolean e() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Boolean enableAnchorCache = iESSettingsProxy.getEnableAnchorCache();
            l.b(enableAnchorCache, "");
            return enableAnchorCache.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static Map<String, AnchorPublishStruct> c() {
        Map<String, AnchorPublishStruct> map;
        if (e() && (((map = f67940e) == null || map.isEmpty()) && !f67937b)) {
            Map<String, AnchorPublishStruct> h2 = h();
            b(h2);
            a(h2);
            f67940e = h2;
        }
        return f67940e;
    }

    private static Map<String, AnchorPublishStruct> h() {
        try {
            Keva keva = f67936a;
            f67938c = keva.getString("anchor_region_keva", null);
            String string = keva.getString("anchor_map_key", null);
            if (!TextUtils.isEmpty(string)) {
                return (Map) f67946k.a(string, new f().type);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AnchorListManager getLocalData Exception: ".concat(String.valueOf(e2)));
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            e2.printStackTrace();
        }
        return null;
    }

    static {
        Covode.recordClassIndex(41820);
        String str = "https://" + com.bytedance.ies.ugc.appcontext.d.f34604k.f34586a;
        f67942g = str;
        f67943h = (AnchorListApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(AnchorListApi.class);
        f67944i = RetrofitFactory.a().b(str).d();
        Keva repo = Keva.getRepo("anchor_data_keva");
        l.b(repo, "");
        f67936a = repo;
        Keva repo2 = Keva.getRepo("fe-storage");
        l.b(repo2, "");
        f67945j = repo2;
    }

    public static void g() {
        Collection<AnchorPublishStruct> values;
        List k2;
        AnchorPublishStruct anchorPublishStruct;
        try {
            Keva keva = f67936a;
            keva.storeString("anchor_map_key", f67946k.b(c(), new h().type));
            Map<String, AnchorPublishStruct> c2 = c();
            if (!(c2 == null || (values = c2.values()) == null || (k2 = n.k(values)) == null || (anchorPublishStruct = (AnchorPublishStruct) k2.get(0)) == null)) {
                f67945j.storeString("ECOMMERCE_i18N_STORAGE_PROMPT_STRING", anchorPublishStruct.anchorTips);
            }
            keva.storeBoolean("anchor_local_map_success", true);
            String str = f67938c;
            if (str != null && str.length() > 0) {
                keva.storeString("anchor_region_keva", f67938c);
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AnchorListManager saveData Exception: ".concat(String.valueOf(e2)));
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            e2.printStackTrace();
        }
    }

    public final List<AnchorPublishStruct> f() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection<AnchorPublishStruct> values;
        Collection<AnchorPublishStruct> values2;
        Map<String, AnchorPublishStruct> c2 = c();
        if (c2 == null || (values2 = c2.values()) == null) {
            arrayList = h.a.z.INSTANCE;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (T t : values2) {
                if (t.isNew) {
                    arrayList3.add(t);
                }
            }
            arrayList = arrayList3;
        }
        Map<String, AnchorPublishStruct> d2 = d();
        if (d2 == null || (values = d2.values()) == null) {
            arrayList2 = h.a.z.INSTANCE;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : values) {
                if (!t2.isNew) {
                    arrayList4.add(t2);
                }
            }
            arrayList2 = arrayList4;
        }
        return n.d(arrayList, arrayList2);
    }

    public static void a() {
        f67943h.getAnchorList().a(e.f67952a, i.f4826c, null);
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class b extends Enum<b> implements c {
        public static final b CreationPageEntered;
        public static final b TitleSeen;
        public static final b Unknown;

        /* renamed from: a  reason: collision with root package name */
        private static final /* synthetic */ b[] f67950a;

        static {
            Covode.recordClassIndex(41824);
            c cVar = new c("Unknown");
            Unknown = cVar;
            C1537b bVar = new C1537b("TitleSeen");
            TitleSeen = bVar;
            a aVar = new a("CreationPageEntered");
            CreationPageEntered = aVar;
            f67950a = new b[]{cVar, bVar, aVar};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f67950a.clone();
        }

        static final class a extends b {
            static {
                Covode.recordClassIndex(41825);
            }

            @Override // com.ss.android.ugc.aweme.base.AnchorListManager.c
            public final int a() {
                return 2;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(String str) {
                super(str, 2, null);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.base.AnchorListManager$b$b  reason: collision with other inner class name */
        static final class C1537b extends b {
            static {
                Covode.recordClassIndex(41826);
            }

            @Override // com.ss.android.ugc.aweme.base.AnchorListManager.c
            public final int a() {
                return 1;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C1537b(String str) {
                super(str, 1, null);
            }
        }

        static final class c extends b {
            static {
                Covode.recordClassIndex(41827);
            }

            @Override // com.ss.android.ugc.aweme.base.AnchorListManager.c
            public final int a() {
                return 0;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            c(String str) {
                super(str, 0, null);
            }
        }

        private b(String str, int i2) {
        }

        public /* synthetic */ b(String str, int i2, h.f.b.g gVar) {
            this(str, i2);
        }
    }

    private static i<Object> a(String str) {
        return ((AnchorImpressionApi) f67944i.a(AnchorImpressionApi.class)).postAnchorImpressionReport(str);
    }

    public static String a(AnchorPublishStruct anchorPublishStruct) {
        l.d(anchorPublishStruct, "");
        String str = anchorPublishStruct.logExtra;
        if (str == null) {
            return null;
        }
        Object a2 = f67946k.a(str, d.class);
        l.b(a2, "");
        d dVar = (d) a2;
        if (dVar != null) {
            return dVar.f67951a;
        }
        return null;
    }

    public static String b(AnchorPublishStruct anchorPublishStruct) {
        l.d(anchorPublishStruct, "");
        return anchorPublishStruct.type + '(' + anchorPublishStruct.subtype + ')';
    }

    public static i<Object> a(List<AnchorPublishStruct> list) {
        l.d(list, "");
        b bVar = b.TitleSeen;
        ArrayList arrayList = new ArrayList();
        for (AnchorPublishStruct anchorPublishStruct : list) {
            if (anchorPublishStruct.isNew) {
                arrayList.add(new a(bVar.a(), anchorPublishStruct.type, anchorPublishStruct.subtype));
            }
        }
        String b2 = new com.google.gson.f().b(arrayList);
        l.b(b2, "");
        return a(b2);
    }

    public static void b(Map<String, AnchorPublishStruct> map) {
        if (map != null) {
            for (Map.Entry<String, AnchorPublishStruct> entry : map.entrySet()) {
                AnchorPublishStruct value = entry.getValue();
                if (value.isNew) {
                    value.hadNew = true;
                }
            }
        }
    }

    public final i<Object> c(AnchorPublishStruct anchorPublishStruct) {
        AnchorPublishStruct anchorPublishStruct2;
        l.d(anchorPublishStruct, "");
        String b2 = b(anchorPublishStruct);
        Map<String, AnchorPublishStruct> c2 = c();
        if (!(c2 == null || (anchorPublishStruct2 = c2.get(b2)) == null)) {
            anchorPublishStruct2.isNew = false;
        }
        g();
        String b3 = new com.google.gson.f().b(n.c(new a(b.CreationPageEntered.a(), anchorPublishStruct.type, anchorPublishStruct.subtype)));
        l.b(b3, "");
        return a(b3);
    }

    public static void a(Map<String, AnchorPublishStruct> map) {
        f67939d = 0;
        if (map != null) {
            for (Map.Entry<String, AnchorPublishStruct> entry : map.entrySet()) {
                if (entry.getValue().isNew) {
                    f67939d++;
                }
            }
        }
    }

    public static AnchorPublishStruct a(int i2, String str) {
        l.d(str, "");
        Map<String, AnchorPublishStruct> c2 = c();
        if (c2 != null) {
            return c2.get(i2 + '(' + str + ')');
        }
        return null;
    }

    public static final class a {
        @com.google.gson.a.c(a = "impression_type")

        /* renamed from: a  reason: collision with root package name */
        public final int f67947a;
        @com.google.gson.a.c(a = "anchor_type")

        /* renamed from: b  reason: collision with root package name */
        public final int f67948b;
        @com.google.gson.a.c(a = "anchor_subtype")

        /* renamed from: c  reason: collision with root package name */
        public final String f67949c;

        static {
            Covode.recordClassIndex(41823);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f67947a == aVar.f67947a && this.f67948b == aVar.f67948b && l.a(this.f67949c, aVar.f67949c);
        }

        public final int hashCode() {
            int i2 = ((this.f67947a * 31) + this.f67948b) * 31;
            String str = this.f67949c;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "AnchorAddLinkImpression(impressionType=" + this.f67947a + ", anchorType=" + this.f67948b + ", anchorSubtype=" + this.f67949c + ")";
        }

        public a(int i2, int i3, String str) {
            this.f67947a = i2;
            this.f67948b = i3;
            this.f67949c = str;
        }
    }
}
