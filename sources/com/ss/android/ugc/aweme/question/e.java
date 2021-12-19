package com.ss.android.ugc.aweme.question;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;

public final class e extends s {
    public c I;
    protected String J;

    static {
        Covode.recordClassIndex(77924);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final void g() {
        d dVar;
        if (QnaService.a().enablePublicQna()) {
            TuxTextView a2 = a(R.string.cyv);
            a2.setOnClickListener(new f(this));
            if (this.I.getCreator() == null || !this.I.getCreator().getUid().equals(b.g().getCurUserId())) {
                dVar = new d.a(getActivity()).b(R.string.f5_).c(R.string.f59).f33648a;
            } else {
                dVar = new d.a(getActivity()).b(R.string.f5b).c(R.string.f5a).f33648a;
            }
            MtEmptyView a3 = MtEmptyView.a(getContext());
            a3.setStatus(dVar);
            this.o.setBuilder(DmtStatusView.a.a(getContext()).b(a3).c(a2));
            return;
        }
        super.g();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null) {
            this.I = (c) bundle.getSerializable("detail_question_detail");
            this.J = (String) bundle.getSerializable("from_group_id");
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final SmartRoute a(Aweme aweme, s.c cVar) {
        SmartRoute a2 = super.a(aweme, cVar);
        c cVar2 = this.I;
        if (cVar2 != null) {
            a2.withParam("question_content", cVar2.getContent());
            a2.withParam("show_answer_question_button", 1);
            a2.withParam("video_from", "qa_detail");
            a2.withParam("enter_from", "qa_detail");
            a2.withParam("from_group_id", this.J);
        }
        return a2;
    }
}
