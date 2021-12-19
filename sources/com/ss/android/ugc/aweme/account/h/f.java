package com.ss.android.ugc.aweme.account.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.c;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f63055a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(38840);
    }

    public static final String a(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f40156j.getString("code");
        }
        return "";
    }

    public static final String b(AuthResult authResult) {
        if (authResult != null) {
            return authResult.f40156j.getString("profile_key");
        }
        return "";
    }

    public static final String d(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        return a(authResult.f40150d);
    }

    public static final String a(c cVar) {
        if (cVar == null) {
            return "";
        }
        return a(cVar.f40167b);
    }

    public static final String c(AuthResult authResult) {
        if (authResult == null) {
            return "";
        }
        if (l.a((Object) authResult.f40150d, (Object) "google")) {
            l.b("311", "");
            return "311";
        } else if (l.a((Object) authResult.f40150d, (Object) "facebook")) {
            l.b("310", "");
            return "310";
        } else if (l.a((Object) authResult.f40150d, (Object) "twitter")) {
            l.b("313", "");
            return "313";
        } else if (l.a((Object) authResult.f40150d, (Object) "instagram")) {
            l.b("312", "");
            return "312";
        } else if (l.a((Object) authResult.f40150d, (Object) "vk")) {
            l.b("334", "");
            return "334";
        } else if (l.a((Object) authResult.f40150d, (Object) "google_web")) {
            l.b("934", "");
            return "934";
        } else if (!l.a((Object) authResult.f40150d, (Object) "google_onetap")) {
            return "";
        } else {
            l.b("311", "");
            return "311";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r3) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.h.f.a(java.lang.String):java.lang.String");
    }
}
