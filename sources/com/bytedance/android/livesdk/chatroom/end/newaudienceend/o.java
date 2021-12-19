package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewRecommendView f15493a;

    /* renamed from: b  reason: collision with root package name */
    private final List f15494b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15495c;

    static {
        Covode.recordClassIndex(8559);
    }

    o(LiveNewRecommendView liveNewRecommendView, List list, int i2) {
        this.f15493a = liveNewRecommendView;
        this.f15494b = list;
        this.f15495c = i2;
    }

    public final void onClick(View view) {
        LiveNewRecommendView liveNewRecommendView = this.f15493a;
        List list = this.f15494b;
        int i2 = this.f15495c;
        if (liveNewRecommendView.f15459d != null) {
            liveNewRecommendView.f15459d.e();
        }
        p.a((Room) list.get(i2), liveNewRecommendView.getContext(), liveNewRecommendView.f15457b, false);
    }
}
