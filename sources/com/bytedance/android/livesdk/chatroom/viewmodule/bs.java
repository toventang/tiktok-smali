package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.core.f.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.drawerfeed.f;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class bs implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveDrawerEntranceWidget f16497a;

    static {
        Covode.recordClassIndex(9136);
    }

    bs(LiveDrawerEntranceWidget liveDrawerEntranceWidget) {
        this.f16497a = liveDrawerEntranceWidget;
    }

    public final void onClick(View view) {
        LiveDrawerEntranceWidget liveDrawerEntranceWidget = this.f16497a;
        Bundle bundle = new Bundle();
        bundle.putString("pull_type", "button");
        bundle.putLong("room_id", ((Long) liveDrawerEntranceWidget.dataChannel.b(di.class)).longValue());
        if (LiveDrawerVersion.INSTANCE.getValue()) {
            f.a(a.a(liveDrawerEntranceWidget.getContext()), true, bundle, "button");
        } else {
            com.bytedance.android.b.a.a.f6785g.f6790d = "button";
            f.a(a.a(liveDrawerEntranceWidget.getContext()), true);
        }
        b.a.a("livesdk_explore_click").a(liveDrawerEntranceWidget.dataChannel).a("ops_type", "click").b();
    }
}
