package com.ss.android.ugc.aweme.feed.ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.discover.hitrank.d;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final m f94964a;

    static {
        Covode.recordClassIndex(60230);
    }

    n(m mVar) {
        this.f94964a = mVar;
    }

    public final void onClick(View view) {
        User author;
        ClickAgent.onClick(view);
        m mVar = this.f94964a;
        if (view.getId() == R.id.b7j) {
            mVar.Q.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", mVar.L.getAid());
            if (view.getVisibility() != 4 && !b.E(mVar.L) && !mVar.j() && mVar.L != null && !mVar.L.isDelete() && (author = mVar.L.getAuthor()) != null && author.getFollowStatus() == 0 && !TextUtils.equals(author.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
                if (mVar.f94851c != null && b.s(mVar.L) && !b.Y(mVar.L)) {
                    g.a().a(view.getContext(), mVar.L);
                    a.a("draw_ad", "follow", mVar.L.getAwemeRawAd()).a("anchor_id", m.a(mVar.L)).a("room_id", m.b(mVar.L)).c();
                }
                if (b.aa(mVar.L) || b.Y(mVar.L)) {
                    g.a().a(mVar.R, mVar.L, "plus_sign");
                }
                if (!f.a.f68431a.c()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(mVar.R).a(R.string.de8).a();
                    return;
                }
                if (mVar.Q != null) {
                    ag agVar = new ag(12, mVar.L);
                    agVar.f93454e = "feed";
                    mVar.Q.a("feed_internal_event", agVar);
                }
                if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    d.a(author, 5);
                    mVar.b();
                    com.ss.android.ugc.aweme.feed.x.a.a(mVar.R, mVar.R.getString(R.string.kv, author.getNickname()), false, 0);
                }
            }
        }
    }
}
