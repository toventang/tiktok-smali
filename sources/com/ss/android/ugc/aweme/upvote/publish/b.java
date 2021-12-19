package com.ss.android.ugc.aweme.upvote.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.upvote.d.c;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.f.b.l;
import java.util.Collection;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f142291a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(93049);
    }

    public static List<String> a() {
        List<String> b2 = dg.b(Keva.getRepo("upvote_publish_cache").getString(b(), ""), String[].class);
        l.b(b2, "");
        return b2;
    }

    private static String b() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return "upvote_publish_".concat(String.valueOf(g2.getCurUserId()));
    }

    public static void a(String str) {
        l.d(str, "");
        List g2 = n.g((Collection) a());
        if (!g2.contains(str)) {
            g2.add(str);
            int size = g2.size() - c.a();
            int a2 = n.a(g2);
            if (1 <= size && a2 >= size) {
                g2 = g2.subList(size, g2.size());
            }
            a(g2);
        }
    }

    public static void b(String str) {
        l.d(str, "");
        List g2 = n.g((Collection) a());
        g2.remove(str);
        a(g2);
    }

    static void a(List<String> list) {
        Keva.getRepo("upvote_publish_cache").storeString(b(), dg.a().b(list));
    }
}
