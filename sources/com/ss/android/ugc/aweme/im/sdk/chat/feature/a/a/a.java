package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100323a = new a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a$a  reason: collision with other inner class name */
    public static final class C2466a {

        /* renamed from: a  reason: collision with root package name */
        static String f100324a = "greeting_emoji_alert_show";

        /* renamed from: b  reason: collision with root package name */
        static String f100325b = "greeting_emoji_alert_close";

        /* renamed from: c  reason: collision with root package name */
        public static String f100326c = "greeting_emoji";

        /* renamed from: d  reason: collision with root package name */
        public static final C2466a f100327d = new C2466a();

        private C2466a() {
        }

        static {
            Covode.recordClassIndex(64098);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static String f100328a = "emoji_id";

        /* renamed from: b  reason: collision with root package name */
        public static final b f100329b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(64099);
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(64097);
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class c extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100330a = new c();

        static {
            Covode.recordClassIndex(64100);
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
        public static final d f100331a = new d();

        static {
            Covode.recordClassIndex(64101);
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

    public static /* synthetic */ void a(String str, String str2, List list, boolean z) {
        c cVar = c.f100330a;
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        l.d(cVar, "");
        androidx.c.a aVar = new androidx.c.a();
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((com.ss.android.ugc.aweme.emoji.g.a) list.get(i2)).getId());
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        aVar.put("conversation_id", str2);
        aVar.put("to_user_id", str);
        String str3 = b.f100328a;
        String sb2 = sb.toString();
        l.b(sb2, "");
        aVar.put(str3, sb2);
        if (z) {
            cVar.invoke(C2466a.f100325b, aVar);
        } else {
            cVar.invoke(C2466a.f100324a, aVar);
        }
    }
}
