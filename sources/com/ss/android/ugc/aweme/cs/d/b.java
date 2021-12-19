package com.ss.android.ugc.aweme.cs.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import h.f.b.l;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f79008a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(49044);
    }

    public static boolean b() {
        g.a().w();
        return false;
    }

    public static Set<String> a() {
        return g.a().g().b().a();
    }

    public static final String a(c cVar) {
        String draftDir;
        l.d(cVar, "");
        if (cVar.W.Q) {
            EditPreviewInfo a2 = d.a(cVar, false);
            if (a2 == null || (draftDir = a2.getDraftDir()) == null) {
                return "";
            }
            return draftDir;
        } else if (cVar.f83182c != null) {
            String str = cVar.W.S;
            if (str == null) {
                return "";
            }
            return str;
        } else {
            String a3 = com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a(cVar.W.S);
            if (a3 == null) {
                return "";
            }
            return a3;
        }
    }
}
