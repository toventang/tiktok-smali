package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100369a = new a();

    private static String c(int i2) {
        switch (i2) {
            case 1:
                return "save_success";
            case 2:
                return "cancel_save";
            case 3:
                return "discard_edit";
            case 4:
                return "cancel_discard";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "submit_success";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "cancel_submit";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "delete_keyword";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "cancel_delete";
            default:
                return "";
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(64120);
    }

    public static /* synthetic */ void a(int i2) {
        c cVar = c.f100372a;
        l.d(cVar, "");
        Map<String, String> map = new com.ss.android.ugc.aweme.app.f.d().a("status", c(i2)).f66730a;
        l.b(map, "");
        cVar.invoke("edit_welcome_message", map);
    }

    public static /* synthetic */ void b(int i2) {
        b bVar = b.f100371a;
        l.d(bVar, "");
        Map<String, String> map = new com.ss.android.ugc.aweme.app.f.d().a("status", c(i2)).f66730a;
        l.b(map, "");
        bVar.invoke("edit_auto_reply_keyword", map);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.a$a  reason: collision with other inner class name */
    public static final /* synthetic */ class C2469a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2469a f100370a = new C2469a();

        static {
            Covode.recordClassIndex(64121);
        }

        C2469a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100371a = new b();

        static {
            Covode.recordClassIndex(64122);
        }

        b() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100372a = new c();

        static {
            Covode.recordClassIndex(64123);
        }

        c() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f100373a = new d();

        static {
            Covode.recordClassIndex(64124);
        }

        d() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class e extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f100374a = new e();

        static {
            Covode.recordClassIndex(64125);
        }

        e() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class f extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f100375a = new f();

        static {
            Covode.recordClassIndex(64126);
        }

        f() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: private */
    public static void a(String str, int i2, m<? super String, ? super Map<String, String>, z> mVar) {
        String str2;
        l.d(str, "");
        l.d(mVar, "");
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str);
        if (i2 == 1) {
            str2 = "business_welcome_message";
        } else if (i2 == 2) {
            str2 = "business_auto_reply";
        } else {
            return;
        }
        Map<String, String> map = a2.a("target", str2).f66730a;
        l.b(map, "");
        mVar.invoke("enter_business_message_edit", map);
    }

    /* access modifiers changed from: private */
    public static void a(String str, int i2, boolean z, m<? super String, ? super Map<String, String>, z> mVar) {
        String str2;
        String str3;
        l.d(str, "");
        l.d(mVar, "");
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str);
        if (i2 == 1) {
            str2 = "welcome_message";
        } else if (i2 == 2) {
            str2 = "auto_reply";
        } else {
            return;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("target", str2);
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        Map<String, String> map = a3.a("status", str3).f66730a;
        l.b(map, "");
        mVar.invoke("switch_business_message_button", map);
    }
}
