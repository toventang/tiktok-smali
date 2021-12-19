package com.ss.android.ugc.aweme.qna.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qna.model.h;
import h.f.b.l;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f119267a = new HashSet();

    static {
        Covode.recordClassIndex(77468);
    }

    public final void a(h hVar) {
        String str;
        Integer num;
        if (hVar != null && (str = hVar.f119497h) != null && hVar.n && this.f119267a.add(str)) {
            List<String> list = hVar.o;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            l.d(str, "");
            r.a("qa_invitation_show", new d().a("enter_from", "qa_personal_profile").a("question_id", str).a("inviter_cnt", num).f66730a);
        }
    }
}
