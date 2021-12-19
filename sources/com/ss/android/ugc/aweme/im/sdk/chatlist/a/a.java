package com.ss.android.ugc.aweme.im.sdk.chatlist.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.a.ag;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.Map;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f101846a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(65147);
    }

    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.a f101852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.k.a f101853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f101854c;

        static {
            Covode.recordClassIndex(65153);
        }

        public f(com.bytedance.ies.im.core.api.b.a aVar, com.ss.android.ugc.aweme.im.service.k.a aVar2, m mVar) {
            this.f101852a = aVar;
            this.f101853b = aVar2;
            this.f101854c = mVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.bytedance.im.core.d.h a2 = this.f101852a.a(this.f101853b.bF_());
            if (a2 == null) {
                return null;
            }
            this.f101854c.invoke("chat_show", ag.a(ag.a(a.a(this.f101853b), v.a("is_master", String.valueOf(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.c(a2)))), v.a("chat_type", "group")));
            return z.f158842a;
        }
    }

    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.im.core.api.b.a f101856a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.k.a f101857b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m f101858c;

        static {
            Covode.recordClassIndex(65155);
        }

        public h(com.bytedance.ies.im.core.api.b.a aVar, com.ss.android.ugc.aweme.im.service.k.a aVar2, m mVar) {
            this.f101856a = aVar;
            this.f101857b = aVar2;
            this.f101858c = mVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.bytedance.im.core.d.h a2 = this.f101856a.a(this.f101857b.bF_());
            if (a2 == null) {
                return null;
            }
            this.f101858c.invoke("chat_show", ag.a(ag.a(a.a(this.f101857b), v.a("to_user_id", String.valueOf(com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(a2)))), v.a("chat_type", "private")));
            return z.f158842a;
        }
    }

    public static Map<String, String> a(com.ss.android.ugc.aweme.im.service.k.a aVar) {
        String str;
        String str2;
        String str3;
        p[] pVarArr = new p[6];
        pVarArr[0] = v.a("chat_type", "private");
        pVarArr[1] = v.a("conversation_id", aVar.bF_());
        if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
            str = "notification_page";
        } else {
            str = "chat_list";
        }
        pVarArr[2] = v.a("enter_from", str);
        if (aVar.s) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        pVarArr[3] = v.a("is_top", str2);
        pVarArr[4] = v.a("unread_cnt", String.valueOf(aVar.q));
        if (aVar.q > 0) {
            str3 = "number_dot";
        } else if (aVar.r) {
            str3 = "yellow_dot";
        } else {
            str3 = "";
        }
        pVarArr[5] = v.a("notice_type", str3);
        return ag.a(pVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.a.a$a  reason: collision with other inner class name */
    public static final /* synthetic */ class C2531a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2531a f101847a = new C2531a();

        static {
            Covode.recordClassIndex(65148);
        }

        C2531a() {
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
        public static final b f101848a = new b();

        static {
            Covode.recordClassIndex(65149);
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
        public static final c f101849a = new c();

        static {
            Covode.recordClassIndex(65150);
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

    public static final /* synthetic */ class d extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f101850a = new d();

        static {
            Covode.recordClassIndex(65151);
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
        public static final e f101851a = new e();

        static {
            Covode.recordClassIndex(65152);
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

    public static final /* synthetic */ class g extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f101855a = new g();

        static {
            Covode.recordClassIndex(65154);
        }

        g() {
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
    public static final /* synthetic */ class i extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f101859a = new i();

        static {
            Covode.recordClassIndex(65156);
        }

        i() {
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

    public static /* synthetic */ void a(int i2, int i3) {
        i iVar = i.f101859a;
        l.d(iVar, "");
        androidx.c.a aVar = new androidx.c.a();
        if (i3 < 0) {
            aVar.put("total_chat_cnt", String.valueOf(i2));
        } else {
            aVar.put("total_chat_cnt", String.valueOf(i2));
            aVar.put("show_chat_cnt", String.valueOf(i3));
        }
        iVar.invoke("show_chat_list", aVar);
    }

    public static /* synthetic */ void b(String str, int i2) {
        String str2;
        b bVar = b.f101848a;
        l.d(bVar, "");
        androidx.c.a aVar = new androidx.c.a();
        if (i2 == 1) {
            str2 = "message_box";
        } else {
            str2 = "message";
        }
        aVar.put("enter_from", str2);
        aVar.put("target", str);
        aVar.put("chat_type", com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(i2));
        bVar.invoke("chat_list_delete_confirm", aVar);
    }

    public static /* synthetic */ void a(String str, int i2) {
        String str2;
        c cVar = c.f101849a;
        l.d(cVar, "");
        androidx.c.a aVar = new androidx.c.a();
        if (i2 == 1) {
            str2 = "message_box";
        } else {
            str2 = "message";
        }
        aVar.put("enter_from", str2);
        aVar.put("target", str);
        aVar.put("chat_type", com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(i2));
        cVar.invoke("chat_list_feedback", aVar);
    }

    public static /* synthetic */ void a(String str, int i2, String str2, String str3) {
        C2531a aVar = C2531a.f101847a;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(aVar, "");
        androidx.c.a aVar2 = new androidx.c.a();
        aVar2.put("enter_from", str);
        aVar2.put("num", String.valueOf(i2));
        aVar2.put("enter_method", str2);
        aVar2.put("notice_type", str3);
        aVar.invoke("enter_chat_list", aVar2);
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", str);
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_method", str2);
    }
}
