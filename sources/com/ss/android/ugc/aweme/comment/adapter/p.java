package com.ss.android.ugc.aweme.comment.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;

final /* synthetic */ class p implements MentionTextView.f {

    /* renamed from: a  reason: collision with root package name */
    private final h f71400a;

    static {
        Covode.recordClassIndex(43950);
    }

    p(h hVar) {
        this.f71400a = hVar;
    }

    @Override // com.ss.android.ugc.aweme.views.MentionTextView.f
    public final void a(TextExtraStruct textExtraStruct) {
        h hVar = this.f71400a;
        if (textExtraStruct.getUserId().equals(b.g().getCurUserId())) {
            r.a("self_mention_click", new d().a("enter_from", hVar.C).f66730a);
        }
        if (f.j() != null) {
            SmartRouter.buildRoute(f.j(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_uid", textExtraStruct.getSecUid()).open();
        }
        hVar.f71384k.getContext();
        r.a(StringSet.name, "comment_at", textExtraStruct.getUserId(), 0);
        hVar.a(textExtraStruct.getUserId(), "comment_at");
    }
}
