package com.ss.android.ugc.aweme.commercialize.utils.b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.at;
import com.ss.android.ugc.aweme.feed.i.ac;
import com.ss.android.ugc.aweme.feed.i.ad;
import com.ss.android.ugc.aweme.main.MainActivity;
import h.f.b.l;
import h.m.p;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f75661a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(46662);
    }

    private static final void a(Uri uri) {
        r.a("enter_personal_detail", new d().a("scene_id", "1048").a("enter_from", "advertisement").a("to_user_id", uri.getLastPathSegment()).f66730a);
    }

    public static final void a(String str) {
        l.d(str, "");
        Uri parse = Uri.parse(str);
        l.b(parse, "");
        String host = parse.getHost();
        String path = parse.getPath();
        if (host != null && host.length() != 0 && host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -309425751) {
                if (hashCode == 3599307 && host.equals("user") && path != null && p.b(path, "/profile", false)) {
                    a(parse);
                }
            } else if (host.equals("profile")) {
                a(parse);
            }
        }
    }

    public static final void a(Context context, String str) {
        l.d(context, "");
        ad adVar = new ad(context.hashCode());
        adVar.f93449c = str;
        at.a(new ac("homepage_hot", context instanceof MainActivity), adVar);
    }
}
