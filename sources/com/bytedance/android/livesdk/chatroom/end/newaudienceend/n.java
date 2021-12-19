package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewRecommendView f15492a;

    static {
        Covode.recordClassIndex(8558);
    }

    n(LiveNewRecommendView liveNewRecommendView) {
        this.f15492a = liveNewRecommendView;
    }

    public final void onClick(View view) {
        LiveNewRecommendView liveNewRecommendView = this.f15492a;
        if (liveNewRecommendView.f15457b != null && view != null && view.getTag() != null && (view.getTag() instanceof Room)) {
            p.a((Room) view.getTag(), liveNewRecommendView.f15456a, liveNewRecommendView.f15457b, false);
        }
    }
}
