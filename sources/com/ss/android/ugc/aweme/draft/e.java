package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.draft.model.h;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.tools.utils.i;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f83131a;

    static {
        Covode.recordClassIndex(51836);
        File b2 = i.b(com.ss.android.ugc.aweme.port.in.i.f115645a);
        l.b(b2, "");
        String absolutePath = b2.getAbsolutePath();
        l.b(absolutePath, "");
        f83131a = h.a(absolutePath);
    }

    public static final String b(String str) {
        if (str == null) {
            return null;
        }
        return p.a(str, f83131a, "./", true);
    }

    public static final d a(c cVar) {
        l.d(cVar, "");
        if (cVar.W.bo != null) {
            return new a(cVar);
        }
        if (cVar.k()) {
            return new o(cVar);
        }
        if (d.i(cVar) != null) {
            return new l(cVar);
        }
        if (d.h(cVar) != null) {
            return new b(cVar);
        }
        return new p();
    }

    public static final DraftCheckResult a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new DraftCheckResult(0, null, null, 0, 14, null);
        }
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((DraftFileCheckResult) obj).isSuc()) {
                arrayList2.add(obj);
            }
        }
        return new DraftCheckResult(list.size(), arrayList2, null, 0, 12, null);
    }

    public static final DraftFileCheckResult a(String str) {
        if (str == null || str.length() == 0) {
            return new DraftFileCheckResult(-100, str);
        }
        if (!h.b(str)) {
            return new DraftFileCheckResult(-101, b(str));
        }
        if (h.d(str) <= 0) {
            return new DraftFileCheckResult(-102, b(str));
        }
        return new DraftFileCheckResult(0, null, 2, null);
    }

    public static final DraftCheckResult a(c cVar, boolean z) {
        l.d(cVar, "");
        DraftCheckResult a2 = a(cVar).a();
        String f2 = cVar.f();
        l.b(f2, "");
        DraftLoadResult draftLoadResult = new DraftLoadResult(f2, h.a(cVar), j.a(cVar.I), cVar.W.bs, a2, false, 32, null);
        if (z && !g.a().A().a()) {
            g.a().c().b().a(draftLoadResult);
            g.a().c().a().a(draftLoadResult);
        }
        return a2;
    }
}
