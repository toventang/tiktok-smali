package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class cl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bz f72689a;

    static {
        Covode.recordClassIndex(44783);
    }

    cl(bz bzVar) {
        this.f72689a = bzVar;
    }

    public final void run() {
        bz bzVar = this.f72689a;
        if (!Keva.getRepo("reply_with_video_bubble").getBoolean(b.g().getCurUserId(), false) && bzVar.getActivity() != null) {
            if (bzVar.Y == null) {
                bzVar.Y = new com.bytedance.ies.dmt.ui.tooltip.b(bzVar.getActivity()).a(bzVar.f72649b).b(48).a(5000L).a(R.string.am6).a();
            }
            bzVar.Y.a();
            Keva.getRepo("reply_with_video_bubble").storeBoolean(b.g().getCurUserId(), true);
            if (bzVar.W != null) {
                com.ss.android.ugc.aweme.comment.b bVar = bzVar.W;
                if (bVar.f71468b.getActivity() != null && bVar.f71469c != null && bVar.f71469c.n() != null) {
                    Comment n = bVar.f71469c.n();
                    String awemeId = n.getAwemeId();
                    r.a("comment_reply_toast_show", new d().a("group_id", awemeId).a("reply_comment_id", n.getCid()).a("author_id", b.g().getCurUserId()).f66730a);
                }
            }
        }
    }
}
