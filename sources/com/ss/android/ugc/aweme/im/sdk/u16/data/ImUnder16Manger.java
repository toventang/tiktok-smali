package com.ss.android.ugc.aweme.im.sdk.u16.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.ab;
import h.z;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.b.t;

public final class ImUnder16Manger {

    /* renamed from: a  reason: collision with root package name */
    public static final IUnder16Api f103773a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f103774b;

    /* renamed from: c  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.ap.c f103775c = com.ss.android.ugc.aweme.ap.e.a(n.f103799a);

    /* renamed from: d  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.ap.c f103776d = com.ss.android.ugc.aweme.ap.e.a(b.f103787a);

    /* renamed from: e  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.ap.c f103777e = com.ss.android.ugc.aweme.ap.e.a(a.f103786a);

    /* renamed from: f  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.ap.c f103778f = com.ss.android.ugc.aweme.ap.e.a(o.f103800a);

    /* renamed from: g  reason: collision with root package name */
    public static final Keva f103779g = Keva.getRepo("disable_im_under_sixteen_repo");

    /* renamed from: h  reason: collision with root package name */
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.service.g>> f103780h = new ConcurrentHashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public static final ImUnder16Manger f103781i = new ImUnder16Manger();

    /* renamed from: j  reason: collision with root package name */
    private static final h.h f103782j = h.i.a((h.f.a.a) k.f103796a);

    /* renamed from: k  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.ap.c f103783k = com.ss.android.ugc.aweme.ap.e.a(h.f103793a);

    /* renamed from: l  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.ap.c f103784l = com.ss.android.ugc.aweme.ap.e.a(m.f103798a);

    /* renamed from: m  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.ap.c f103785m = com.ss.android.ugc.aweme.ap.e.a(l.f103797a);
    private static final com.ss.android.ugc.aweme.ap.c n = com.ss.android.ugc.aweme.ap.e.a(i.f103794a);
    private static final com.ss.android.ugc.aweme.ap.c o = com.ss.android.ugc.aweme.ap.e.a(j.f103795a);
    private static final com.ss.android.ugc.aweme.ap.c p = com.ss.android.ugc.aweme.ap.e.a(e.f103790a);
    private static final com.ss.android.ugc.aweme.ap.c q = com.ss.android.ugc.aweme.ap.e.a(p.f103801a);
    private static final com.ss.android.ugc.aweme.ap.c r = com.ss.android.ugc.aweme.ap.e.a(d.f103789a);
    private static final com.ss.android.ugc.aweme.ap.c s = com.ss.android.ugc.aweme.ap.e.a(c.f103788a);

    public interface IUnder16Api {
        static {
            Covode.recordClassIndex(66473);
        }

        @l.b.f(a = "im/disable/chat/notice/")
        ab<a> getUnder16Info();

        @l.b.f(a = "im/disable/status/upload/")
        ab<BaseResponse> uploadStatus(@t(a = "status") int i2);
    }

    public static boolean a() {
        return ((Boolean) f103782j.getValue()).booleanValue();
    }

    private ImUnder16Manger() {
    }

    public static String e() {
        return (String) p.a();
    }

    public static String f() {
        return (String) q.a();
    }

    private static boolean h() {
        return ((Boolean) f103784l.a()).booleanValue();
    }

    private static boolean i() {
        return ((Boolean) o.a()).booleanValue();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103786a = new a();

        static {
            Covode.recordClassIndex(66474);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.a()) {
                return ImUnder16Manger.f103779g.getString("chat_cell_content", "");
            }
            return "";
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f103787a = new b();

        static {
            Covode.recordClassIndex(66475);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.a()) {
                return ImUnder16Manger.f103779g.getString("chat_cell_title", "");
            }
            return "";
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f103788a = new c();

        static {
            Covode.recordClassIndex(66476);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.a()) {
                return ImUnder16Manger.f103779g.getString("alert_content", "");
            }
            return "";
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f103789a = new d();

        static {
            Covode.recordClassIndex(66477);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.a()) {
                return ImUnder16Manger.f103779g.getString("alert_title", "");
            }
            return "";
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f103790a = new e();

        static {
            Covode.recordClassIndex(66478);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.a()) {
                return ImUnder16Manger.f103779g.getString("download_data_page_url", "");
            }
            return "";
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f103793a = new h();

        static {
            Covode.recordClassIndex(66481);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.a()) {
                z = ImUnder16Manger.f103779g.getBoolean("is_chat_function_off", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f103794a = new i();

        static {
            Covode.recordClassIndex(66482);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.a()) {
                z = ImUnder16Manger.f103779g.getBoolean("clear_im_chatlist", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f103795a = new j();

        static {
            Covode.recordClassIndex(66483);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.a()) {
                z = ImUnder16Manger.f103779g.getBoolean("is_group_chat_open", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f103796a = new k();

        static {
            Covode.recordClassIndex(66484);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            return Boolean.valueOf(g2.isLogin());
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f103797a = new l();

        static {
            Covode.recordClassIndex(66485);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.a()) {
                z = ImUnder16Manger.f103779g.getBoolean("redirect_to_msg_disappear_page", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f103798a = new m();

        static {
            Covode.recordClassIndex(66486);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (ImUnder16Manger.a()) {
                z = ImUnder16Manger.f103779g.getBoolean("show_msg_privacy_entrance", true);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f103799a = new n();

        static {
            Covode.recordClassIndex(66487);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (ImUnder16Manger.a()) {
                z = ImUnder16Manger.f103779g.getBoolean("show_msg_disappear_chat_cell", false);
            }
            return Boolean.valueOf(z);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f103800a = new o();

        static {
            Covode.recordClassIndex(66488);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2 = Long.MAX_VALUE;
            if (ImUnder16Manger.a()) {
                j2 = ImUnder16Manger.f103779g.getLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE);
            }
            return Long.valueOf(j2);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f103801a = new p();

        static {
            Covode.recordClassIndex(66489);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (ImUnder16Manger.a()) {
                return ImUnder16Manger.f103779g.getString("msg_disappear_page_url", "");
            }
            return "";
        }
    }

    public static boolean b() {
        return ((Boolean) f103783k.a()).booleanValue();
    }

    public static boolean c() {
        return ((Boolean) f103785m.a()).booleanValue();
    }

    public static boolean d() {
        return ((Boolean) n.a()).booleanValue();
    }

    static {
        Covode.recordClassIndex(66472);
        Object a2 = RetrofitFactory.a().b(com.ss.android.ugc.aweme.im.sdk.common.controller.d.a.f102220b).d().a(IUnder16Api.class);
        h.f.b.l.b(a2, "");
        f103773a = (IUnder16Api) a2;
    }

    public static void g() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (g2.isLogin()) {
            Keva keva = f103779g;
            a(keva.getBoolean("is_chat_function_off", false));
            b(keva.getBoolean("show_msg_privacy_entrance", true));
            a(keva.getString("download_data_page_url", ""));
            b(keva.getString("msg_disappear_page_url", ""));
            c(keva.getString("alert_title", ""));
            d(keva.getString("alert_content", ""));
            e(keva.getString("chat_cell_title", ""));
            f(keva.getString("chat_cell_content", ""));
            c(keva.getBoolean("show_msg_disappear_chat_cell", false));
            e(keva.getBoolean("clear_im_chatlist", false));
            d(keva.getBoolean("redirect_to_msg_disappear_page", false));
            f(keva.getBoolean("is_group_chat_open", false));
            a(keva.getLong("msg_disappear_chat_cell_server_time", Long.MAX_VALUE));
        } else {
            f103774b = false;
            a(false);
            b(true);
            a("");
            b("");
            c("");
            d("");
            e("");
            f("");
            c(false);
            e(false);
            d(false);
            f(false);
            a(Long.MAX_VALUE);
        }
        StringBuilder sb = new StringBuilder("disable chat config updated isLogin = ");
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g3, "");
        com.ss.android.ugc.aweme.im.service.m.a.c("ImUnder16Manger", sb.append(g3.isLogin()).append(": {is_of = ").append(b()).append("; do_ur = ").append(e()).append("; ms_ur = ").append(f()).append("; sh_en = ").append(h()).append("; re_pa =").append(c()).append("; cl_ch = ").append(d()).append("}, group_open = ").append(i()).toString());
    }

    public static void a(String str) {
        p.a(str);
    }

    public static void b(String str) {
        q.a(str);
    }

    public static void c(String str) {
        r.a(str);
    }

    public static void d(String str) {
        s.a(str);
    }

    public static void e(String str) {
        f103776d.a(str);
    }

    public static void f(String str) {
        f103777e.a(str);
    }

    public static final class g extends h.f.b.m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f103792a = new g();

        static {
            Covode.recordClassIndex(66480);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("ImUnder16Manger", th2);
            return z.f158842a;
        }
    }

    public static void a(long j2) {
        f103778f.a(Long.valueOf(j2));
    }

    public static void b(boolean z) {
        f103784l.a(Boolean.valueOf(z));
    }

    public static void c(boolean z) {
        f103775c.a(Boolean.valueOf(z));
    }

    public static void d(boolean z) {
        f103785m.a(Boolean.valueOf(z));
    }

    public static void a(boolean z) {
        f103783k.a(Boolean.valueOf(z));
    }

    public static void e(boolean z) {
        n.a(Boolean.valueOf(z));
    }

    public static void f(boolean z) {
        o.a(Boolean.valueOf(z));
    }

    public static final class f extends h.f.b.m implements h.f.a.b<a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f103791a = new f();

        static {
            Covode.recordClassIndex(66479);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            if (aVar2 != null) {
                ImUnder16Manger.f103779g.storeBoolean("is_u16_fetched", true);
                ImUnder16Manger.f103779g.storeBoolean("is_chat_function_off", aVar2.f103805d);
                ImUnder16Manger.f103779g.storeBoolean("show_msg_privacy_entrance", aVar2.f103812k);
                ImUnder16Manger.f103779g.storeString("download_data_page_url", aVar2.f103806e);
                ImUnder16Manger.f103779g.storeString("msg_disappear_page_url", aVar2.f103807f);
                ImUnder16Manger.f103779g.storeString("alert_title", aVar2.f103808g);
                ImUnder16Manger.f103779g.storeString("alert_content", aVar2.f103809h);
                ImUnder16Manger.f103779g.storeString("chat_cell_title", aVar2.f103810i);
                ImUnder16Manger.f103779g.storeString("chat_cell_content", aVar2.f103811j);
                ImUnder16Manger.f103779g.storeBoolean("show_msg_disappear_chat_cell", aVar2.f103813l);
                ImUnder16Manger.f103779g.storeBoolean("clear_im_chatlist", aVar2.n);
                ImUnder16Manger.f103779g.storeBoolean("redirect_to_msg_disappear_page", aVar2.f103814m);
                ImUnder16Manger.f103779g.storeLong("msg_disappear_chat_cell_server_time", aVar2.o);
                ImUnder16Manger.f103779g.storeBoolean("is_group_chat_open", aVar2.p);
                com.ss.android.ugc.aweme.im.service.m.a.b("ImUnder16Manger", "response info store !");
                ImUnder16Manger.g();
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.b.e());
                com.ss.android.ugc.aweme.im.service.m.a.c("ImUnder16Manger", "disable chat config saved : {sh_al = " + aVar2.f103804c + "; is_of = " + aVar2.f103805d + "; do_ur = " + aVar2.f103806e + "; ms_ur = " + aVar2.f103807f + "; sh_en = " + aVar2.f103812k + "; re_pa =" + aVar2.f103814m + "; cl_ch = " + aVar2.n + '}');
            }
            ImUnder16Manger.f103774b = true;
            CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.service.g> copyOnWriteArrayList = ImUnder16Manger.f103780h.get(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b());
            if (copyOnWriteArrayList != null) {
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
            return z.f158842a;
        }
    }
}
