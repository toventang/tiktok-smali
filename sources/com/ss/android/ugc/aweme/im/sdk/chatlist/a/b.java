package com.ss.android.ugc.aweme.im.sdk.chatlist.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class b {

    /* renamed from: a */
    public static final b f101860a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(65157);
    }

    public static final /* synthetic */ class a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final a f101861a = new a();

        static {
            Covode.recordClassIndex(65158);
        }

        a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.b$b */
    public static final /* synthetic */ class C2532b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final C2532b f101862a = new C2532b();

        static {
            Covode.recordClassIndex(65159);
        }

        C2532b() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class c extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final c f101863a = new c();

        static {
            Covode.recordClassIndex(65160);
        }

        c() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class d extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final d f101864a = new d();

        static {
            Covode.recordClassIndex(65161);
        }

        d() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class e extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final e f101865a = new e();

        static {
            Covode.recordClassIndex(65162);
        }

        e() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static /* synthetic */ void a(String str, boolean z) {
        String str2;
        a aVar = a.f101861a;
        l.d(aVar, "");
        androidx.c.a aVar2 = new androidx.c.a();
        aVar2.put("enter_from", "message_rec");
        aVar2.put("platform", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar2.put("is_auth", str2);
        aVar2.put("previous_page", "message_rec");
        aVar.invoke("authorize_card_show", aVar2);
    }

    public static void a(String str, String str2, m<? super String, ? super Map<String, String>, z> mVar) {
        l.d(str, "");
        l.d(mVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", "chat");
        aVar.put("to_user_id", str2);
        mVar.invoke(str, aVar);
    }

    public static void b(String str, String str2, m<? super String, ? super Map<String, String>, z> mVar) {
        l.d(mVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", "chat");
        aVar.put("target", str);
        aVar.put("to_user_id", str2);
        mVar.invoke("block_confirm", aVar);
    }
}
