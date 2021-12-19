package com.ss.android.ugc.aweme.sticker.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.a.ag;
import h.p;
import h.v;
import java.util.HashMap;
import java.util.Map;

public final class l {
    static {
        Covode.recordClassIndex(88239);
    }

    public static final void a(String str, Map<String, String> map) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(map, "");
        b bVar = new b();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.a(entry.getKey(), entry.getValue());
        }
        d.a(str, bVar.f149193a);
    }

    public static final HashMap<String, String> a(ShortVideoContext shortVideoContext, p<String, String>... pVarArr) {
        h.f.b.l.d(shortVideoContext, "");
        h.f.b.l.d(pVarArr, "");
        HashMap<String, String> c2 = ag.c(v.a("enter_from", "video_shoot_page"), v.a("creation_id", shortVideoContext.q), v.a("shoot_way", shortVideoContext.r));
        if (shortVideoContext.C != 0) {
            c2.put("draft_id", String.valueOf(shortVideoContext.C));
        }
        String str = shortVideoContext.D;
        h.f.b.l.b(str, "");
        if (str.length() > 0) {
            c2.put("new_draft_id", shortVideoContext.D);
        }
        for (p<String, String> pVar : pVarArr) {
            c2.put(pVar.component1(), pVar.component2());
        }
        return c2;
    }
}
