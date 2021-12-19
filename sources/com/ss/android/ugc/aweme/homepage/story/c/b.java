package com.ss.android.ugc.aweme.homepage.story.c;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.story.container.h;
import com.ss.android.ugc.aweme.profile.f.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.d.a;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f99256a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(63240);
    }

    public static boolean a(Aweme aweme) {
        l.d(aweme, "");
        return a.n(aweme);
    }

    public static boolean a(String str) {
        String str2;
        User c2 = ai.c();
        if (c2 != null) {
            str2 = c2.getUid();
        } else {
            str2 = null;
        }
        return TextUtils.equals(str, str2);
    }

    public static String a(e eVar) {
        l.d(eVar, "");
        String a2 = h.a(eVar);
        int hashCode = a2.hashCode();
        if (hashCode != -1525083535) {
            return (hashCode == 984907784 && !a2.equals("For You")) ? "homepage_hot" : "homepage_hot";
        }
        if (a2.equals("Following")) {
            return "homepage_follow";
        }
    }
}
