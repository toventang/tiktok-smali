package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;

public final class ca extends f<Object, a> {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14660a;

    static {
        Covode.recordClassIndex(8141);
    }

    static final class a {
        @c(a = "is_login")

        /* renamed from: a  reason: collision with root package name */
        boolean f14661a;
        @c(a = "user_id")

        /* renamed from: b  reason: collision with root package name */
        String f14662b = "";
        @c(a = "short_id")

        /* renamed from: c  reason: collision with root package name */
        long f14663c = -1;
        @c(a = "sec_user_id")

        /* renamed from: d  reason: collision with root package name */
        String f14664d;
        @c(a = "is_silent")

        /* renamed from: e  reason: collision with root package name */
        int f14665e;

        static {
            Covode.recordClassIndex(8142);
        }

        a() {
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ a invoke(Object obj, g gVar) {
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        b a2 = b2.a();
        a aVar = new a();
        aVar.f14661a = b2.e();
        if (aVar.f14661a) {
            aVar.f14662b = String.valueOf(a2.getId());
            aVar.f14664d = a2.getSecUid();
        }
        aVar.f14665e = f14660a ? 1 : 0;
        return aVar;
    }
}
