package com.ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.internal.LobbyCore;
import com.google.android.gms.common.GoogleApiAvailability;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.utils.in;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65125a = new a((byte) 0);

    static {
        Covode.recordClassIndex(40025);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40026);
        }

        private a() {
        }

        public static boolean b() {
            if (!l.a((Object) in.b(), (Object) "")) {
                return true;
            }
            return false;
        }

        public static boolean c() {
            String a2;
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(LobbyCore.getApplication()) == 0 && (a2 = d.a()) != null) {
                    Locale locale = Locale.ENGLISH;
                    l.b(locale, "");
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = a2.toUpperCase(locale);
                    l.b(upperCase, "");
                    if (!n.a("US").contains(upperCase)) {
                        return false;
                    }
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        static boolean a() {
            List<BaseLoginMethod> list;
            String b2 = in.b();
            if (b2 != null) {
                list = q.b(b2);
            } else {
                list = null;
            }
            if (list != null && (!list.isEmpty())) {
                for (BaseLoginMethod baseLoginMethod : list) {
                    if (baseLoginMethod instanceof TPLoginMethod) {
                        String platform = ((TPLoginMethod) baseLoginMethod).getPlatform();
                        if (l.a((Object) platform, (Object) "google_onetap") || l.a((Object) platform, (Object) "google")) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
