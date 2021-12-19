package com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class a {

    /* renamed from: a */
    public static final a f101069a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(64658);
    }

    public static /* synthetic */ void a() {
        f fVar = f.f101075a;
        l.d(fVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", "chat");
        fVar.invoke("report_notice_show", aVar);
    }

    public static void a(m<? super String, ? super Map<String, String>, z> mVar) {
        l.d(mVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", "chat");
        aVar.put("enter_method", "button");
        mVar.invoke("click_report", aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a$a */
    public static final /* synthetic */ class C2510a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final C2510a f101070a = new C2510a();

        static {
            Covode.recordClassIndex(64659);
        }

        C2510a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final b f101071a = new b();

        static {
            Covode.recordClassIndex(64660);
        }

        b() {
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
        public static final c f101072a = new c();

        static {
            Covode.recordClassIndex(64661);
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
        public static final d f101073a = new d();

        static {
            Covode.recordClassIndex(64662);
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
        public static final e f101074a = new e();

        static {
            Covode.recordClassIndex(64663);
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

    public static final /* synthetic */ class f extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a */
        public static final f f101075a = new f();

        static {
            Covode.recordClassIndex(64664);
        }

        f() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static void a(Integer num, m<? super String, ? super Map<String, String>, z> mVar) {
        String str;
        l.d(mVar, "");
        if (num != null) {
            if (num.intValue() == 1) {
                str = "close";
            } else if (num.intValue() == 2) {
                str = "make_safe";
            } else if (num.intValue() == 3) {
                str = "report";
            } else {
                return;
            }
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("action_type", str);
            aVar.put("enter_from", "chat");
            mVar.invoke("report_notice_click", aVar);
        }
    }
}
