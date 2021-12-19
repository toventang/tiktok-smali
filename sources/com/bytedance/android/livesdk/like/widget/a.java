package com.bytedance.android.livesdk.like.widget;

import android.view.View;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Room f18473a;

    static {
        Covode.recordClassIndex(10391);
    }

    a(Room room) {
        this.f18473a = room;
    }

    public final void onClick(View view) {
        UserProfileEvent userProfileEvent = new UserProfileEvent(this.f18473a.getOwner().getId());
        userProfileEvent.mSource = "video_head";
        com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
    }
}
