package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import java.util.Map;

public final class eq {

    /* renamed from: a  reason: collision with root package name */
    public static final eq f142881a = new eq();

    private eq() {
    }

    static {
        Covode.recordClassIndex(93491);
    }

    public static String a() {
        try {
            Keva repo = Keva.getRepo("user_logout_log");
            l.b(repo, "");
            Map<String, ?> all = repo.getAll();
            if (all.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            l.b(all, "");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!l.a((Object) entry.getKey(), (Object) "last_time")) {
                    sb.append(entry.getKey()).append(":").append(entry.getValue()).append(" ");
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "error";
        }
    }
}
