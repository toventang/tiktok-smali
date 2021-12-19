package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.m.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tools.draft.d.a;
import com.ss.android.ugc.aweme.tools.draft.d.c;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    static long f139417a;

    /* renamed from: b  reason: collision with root package name */
    public static int f139418b;

    /* renamed from: c  reason: collision with root package name */
    static boolean f139419c = true;

    /* renamed from: d  reason: collision with root package name */
    private static long f139420d;

    static {
        Covode.recordClassIndex(91152);
    }

    public static final double a(long j2) {
        double currentTimeMillis = (double) (System.currentTimeMillis() - j2);
        Double.isNaN(currentTimeMillis);
        double d2 = currentTimeMillis / 8.64E7d;
        q.a("DraftEditHelper -> sinceFirstSaveTime: saveTime = " + j2 + "; time = " + d2 + '}');
        return d2;
    }

    static final int b(List<? extends a> list) {
        int i2 = 0;
        for (a aVar : list) {
            if (aVar.a() == 101 || aVar.a() == 106) {
                i2++;
            }
        }
        return i2;
    }

    private static long c(List<?> list) {
        long[] a2;
        l.d(list, "");
        Iterator it = new ArrayList(list).iterator();
        long j2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                a2 = new long[]{0, 0};
            } else {
                a2 = new e(e.c.f39342a).a(next);
            }
            j2 += a2[0] + a2[1];
        }
        return j2;
    }

    public static final void a(List<? extends a> list) {
        l.d(list, "");
        long j2 = 0;
        for (a aVar : list) {
            if (aVar.a() == 101 || aVar.a() == 106) {
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.entity.DraftCommonDetails");
                j2 += ((c) aVar).f139483f;
            }
        }
        d.a("tool_performance_draft_info", new b().a("count", b(list)).a("storage_size", j2).f149193a);
    }

    public static final void a(int i2, List<?> list) {
        l.d(list, "");
        if (f139419c && i2 == f139418b) {
            f139419c = false;
            f139420d = System.currentTimeMillis();
            r.a("load_drafts", new b().a("duration", f139420d - f139417a).a("memorySize", c(list)).f149193a);
            c(list);
        }
    }
}
