package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;

public final class h {

    /* renamed from: a */
    public static final h f102256a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(65428);
    }

    public static final /* synthetic */ class a extends j implements m<String, Throwable, z> {
        static {
            Covode.recordClassIndex(65429);
        }

        a(com.ss.android.ugc.aweme.im.service.m.a aVar) {
            super(2, aVar, com.ss.android.ugc.aweme.im.service.m.a.class, "e", "e(Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
        }

        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Throwable th) {
            String str2 = str;
            Throwable th2 = th;
            l.d(str2, "");
            l.d(th2, "");
            com.ss.android.ugc.aweme.im.service.m.a.a(str2, th2);
            return z.f158842a;
        }
    }

    public static void a(String str, String str2, m<? super String, ? super Exception, z> mVar) {
        l.d(mVar, "");
        if (str2 != null && str2.length() != 0) {
            return;
        }
        if (str == null || str.length() == 0) {
            mVar.invoke("SecUidHelper", new IllegalArgumentException("Null or empty uid and SecUid"));
        }
    }
}
