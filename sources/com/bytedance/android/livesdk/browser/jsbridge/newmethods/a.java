package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.c.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public final class a extends f<C0313a, Object> {
    static {
        Covode.recordClassIndex(8047);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a$a  reason: collision with other inner class name */
    static final class C0313a {
        @c(a = StringSet.type)

        /* renamed from: a  reason: collision with root package name */
        String f14491a;
        @c(a = "item")

        /* renamed from: b  reason: collision with root package name */
        String f14492b;

        static {
            Covode.recordClassIndex(8048);
        }

        C0313a() {
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(C0313a aVar, g gVar) {
        C0313a aVar2 = aVar;
        if (TextUtils.equals(aVar2.f14491a, "toolbar")) {
            if (!TextUtils.equals(aVar2.f14492b, "gift")) {
                return null;
            }
            com.bytedance.android.livesdk.an.a.a().a(new k(1));
            return null;
        } else if (!TextUtils.equals(aVar2.f14491a, "gift_panel") || !TextUtils.equals(aVar2.f14492b, "prop")) {
            return null;
        } else {
            com.bytedance.android.livesdk.an.a.a().a(new k(2));
            return null;
        }
    }
}
