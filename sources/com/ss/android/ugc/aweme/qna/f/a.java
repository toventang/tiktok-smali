package com.ss.android.ugc.aweme.qna.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f119370a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(77513);
    }

    public static void a(String str, String str2, Long l2, Integer num, Integer num2) {
        d dVar = new d();
        if (str != null) {
            dVar.a("enter_from", str);
        }
        dVar.a("enter_method", str2);
        if (l2 != null) {
            dVar.a("question_id", l2.longValue());
        }
        if (num != null) {
            dVar.a("invitee_cnt", num.intValue());
        }
        if (num2 != null) {
            dVar.a("is_success", num2.intValue());
        }
        r.a("send_qa_invitation", dVar.f66730a);
    }
}
