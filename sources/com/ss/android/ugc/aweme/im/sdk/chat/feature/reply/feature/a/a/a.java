package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100955a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(64579);
    }

    public static final void a(String str) {
        C2505a aVar = C2505a.f100956a;
        l.d(str, "");
        l.d(aVar, "");
        androidx.c.a aVar2 = new androidx.c.a();
        aVar2.put("enter_from", str);
        aVar.invoke("share_comment_toast", aVar2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.a.a.a$a  reason: collision with other inner class name */
    static final /* synthetic */ class C2505a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2505a f100956a = new C2505a();

        static {
            Covode.recordClassIndex(64580);
        }

        C2505a() {
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

    public static final /* synthetic */ class b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100957a = new b();

        static {
            Covode.recordClassIndex(64581);
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
