package com.ss.android.ugc.aweme.emoji.d.a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(56046);
    }

    private static final String a() {
        Locale b2 = b();
        if (b2 == null) {
            return "";
        }
        String language = b2.getLanguage();
        l.b(language, "");
        return language;
    }

    private static final Locale b() {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.a().getResources().getConfiguration().getLocales().get(0);
        }
        return d.a().getResources().getConfiguration().locale;
    }

    public static final boolean c(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        l.d(aVar, "");
        return a(aVar.getAnimateType());
    }

    public static final boolean d(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        l.d(aVar, "");
        return a(aVar.getStaticType());
    }

    public static final String a(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        l.d(aVar, "");
        if (aVar.getDisplayNameLangs() != null) {
            return aVar.getDisplayNameLangs().get(Locale.ENGLISH.getLanguage());
        }
        return "";
    }

    public static final String b(com.ss.android.ugc.aweme.emoji.g.a aVar) {
        l.d(aVar, "");
        if (aVar.getStickerType() == 2) {
            return "";
        }
        if (TextUtils.equals(Locale.ENGLISH.getLanguage(), a())) {
            String a2 = a(aVar);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        } else if (TextUtils.isEmpty(aVar.getDisplayName())) {
            return a(aVar);
        }
        return aVar.getDisplayName();
    }

    private static final boolean a(String str) {
        if (!(str == null || str.length() == 0)) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase();
            l.b(lowerCase, "");
            if (!l.a((Object) lowerCase, (Object) "gif")) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = str.toLowerCase();
                l.b(lowerCase2, "");
                if (l.a((Object) lowerCase2, (Object) "webp")) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
