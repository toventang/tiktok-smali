package com.bytedance.android.livesdk.usercard;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.b.c;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.rank.api.j;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f21852a;

    static {
        Covode.recordClassIndex(12867);
    }

    k(f fVar) {
        this.f21852a = fVar;
    }

    public final void onClick(View view) {
        f fVar = this.f21852a;
        m mVar = m.NONE;
        if (fVar.q.equals(j.HOURLY_RANK.getRankName())) {
            mVar = m.HOURLY_RANK_INVITE;
        } else if (fVar.q.equals(j.WEEKLY_RANK.getRankName())) {
            mVar = m.WEEKLY_RANK_INVITE;
        }
        b.a.a().V = "rank";
        a.a().a(new com.bytedance.android.live.liveinteract.api.b.a(new c(String.valueOf(fVar.f21839g), fVar.f21836d.getSecUid(), String.valueOf(fVar.f21841i), fVar.f21836d.displayId, mVar, fVar.f21836d.getAvatarThumb().mUrls, (char) 0)));
        view.setClickable(false);
        if (fVar.f21844l != null) {
            fVar.f21844l.a();
        }
    }
}
