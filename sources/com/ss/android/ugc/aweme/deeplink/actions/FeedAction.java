package com.ss.android.ugc.aweme.deeplink.actions;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import com.ss.android.ugc.aweme.launcher.service.mob.a;
import h.a.n;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public final class FeedAction extends b<z> {
    static {
        Covode.recordClassIndex(49336);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final ArrayList<Integer> getFlags() {
        return n.d(67108864, 268435456);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        boolean z;
        l.d(str, "");
        l.d(hashMap, "");
        HashMap hashMap2 = new HashMap();
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("is_from_notification");
        if (queryParameter != null) {
            Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type kotlin.Boolean");
            z = ((Boolean) queryParameter).booleanValue();
        } else {
            z = false;
        }
        String queryParameter2 = parse.getQueryParameter("tab");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        l.b(queryParameter2, "");
        try {
            int parseInt = Integer.parseInt(queryParameter2);
            hashMap2.put("tab", Integer.valueOf(parseInt));
            if (parseInt == 1) {
                a.f107296a.a("homepage_hot", parse, z);
            } else if (parseInt == 2) {
                a.f107296a.a("homepage_fresh", parse, z);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        hashMap2.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        return com.ss.android.ugc.aweme.friends.service.a.f97047a.a(str, new p<>("aweme://main", hashMap2));
    }
}
