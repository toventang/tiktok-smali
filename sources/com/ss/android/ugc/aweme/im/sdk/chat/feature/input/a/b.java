package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f100617a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(64365);
    }

    public static /* synthetic */ void a(String str) {
        C2481b bVar = C2481b.f100619a;
        l.d(str, "");
        l.d(bVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", str);
        String str2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b;
        if (str2 != null) {
            aVar.put("process_id", str2);
        }
        bVar.invoke("show_keyboard", aVar);
    }

    public static /* synthetic */ void b(String str) {
        a aVar = a.f100618a;
        l.d(str, "");
        l.d(aVar, "");
        androidx.c.a aVar2 = new androidx.c.a();
        aVar2.put("enter_from", str);
        String str2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b;
        if (str2 != null) {
            aVar2.put("process_id", str2);
        }
        aVar.invoke("show_emoji_panel", aVar2);
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100618a = new a();

        static {
            Covode.recordClassIndex(64366);
        }

        a() {
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
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b$b  reason: collision with other inner class name */
    public static final /* synthetic */ class C2481b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2481b f100619a = new C2481b();

        static {
            Covode.recordClassIndex(64367);
        }

        C2481b() {
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
}
