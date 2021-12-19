package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100620a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(64368);
    }

    public static /* synthetic */ void a(String str) {
        b bVar = b.f100622a;
        l.d(str, "");
        l.d(bVar, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("to_user_id", str);
        bVar.invoke("auto_emoji_show", aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.a.a$a  reason: collision with other inner class name */
    public static final /* synthetic */ class C2482a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2482a f100621a = new C2482a();

        static {
            Covode.recordClassIndex(64369);
        }

        C2482a() {
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
        public static final b f100622a = new b();

        static {
            Covode.recordClassIndex(64370);
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
}
