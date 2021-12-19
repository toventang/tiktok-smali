package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.d.a.a;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.tools.draft.bg;
import h.f.b.l;
import java.util.Calendar;
import java.util.Locale;

public final class g {
    static {
        Covode.recordClassIndex(91212);
    }

    private static c b(c cVar) {
        l.d(cVar, "");
        a aVar = new a();
        aVar.a(cVar);
        cVar.C = aVar.a();
        return cVar;
    }

    public static final String a(h hVar) {
        long j2;
        l.d(hVar, "");
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        l.b(instance2, "");
        if (bg.a()) {
            j2 = hVar.f139503b.f139501g;
        } else {
            j2 = hVar.f139503b.f139500f;
        }
        instance2.setTimeInMillis(j2);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return "today";
        }
        long timeInMillis = instance2.getTimeInMillis();
        BDDateFormat bDDateFormat = new BDDateFormat("L");
        Locale locale = Locale.getDefault();
        l.b(locale, "");
        return bDDateFormat.a(timeInMillis, locale);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.ss.android.ugc.aweme.tools.draft.d.h a(com.ss.android.ugc.aweme.draft.model.c r16) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.d.g.a(com.ss.android.ugc.aweme.draft.model.c):com.ss.android.ugc.aweme.tools.draft.d.h");
    }
}
