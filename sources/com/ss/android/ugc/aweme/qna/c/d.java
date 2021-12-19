package com.ss.android.ugc.aweme.qna.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qna.model.h;
import h.f.b.l;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f119272a = new HashSet();

    static {
        Covode.recordClassIndex(77474);
    }

    public final void a(h hVar) {
        String str;
        if (hVar != null && (str = hVar.f119497h) != null && !hVar.n && this.f119272a.add(str)) {
            l.d(str, "");
            r.a("qa_recommendation_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "qa_personal_profile").a("question_id", str).f66730a);
        }
    }
}
