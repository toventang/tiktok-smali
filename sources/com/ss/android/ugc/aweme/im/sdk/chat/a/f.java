package com.ss.android.ugc.aweme.im.sdk.chat.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f100112a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(63811);
    }

    public static final /* synthetic */ class a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100113a = new a();

        static {
            Covode.recordClassIndex(63812);
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

    static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100114a = new b();

        static {
            Covode.recordClassIndex(63813);
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

    public static final /* synthetic */ class c extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100115a = new c();

        static {
            Covode.recordClassIndex(63814);
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

    public static void a(boolean z, String str) {
        String str2;
        b bVar = b.f100114a;
        l.d(bVar, "");
        if (z) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("enter_from", "chat");
        aVar.put("chat_type", str2);
        aVar.put("target", str);
        bVar.invoke("message_long_press_feedback", aVar);
    }
}
