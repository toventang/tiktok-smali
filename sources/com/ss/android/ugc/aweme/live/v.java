package com.ss.android.ugc.aweme.live;

import com.bytedance.covode.number.Covode;

final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveBroadcastActivity f108628a;

    static {
        Covode.recordClassIndex(69617);
    }

    v(LiveBroadcastActivity liveBroadcastActivity) {
        this.f108628a = liveBroadcastActivity;
    }

    public final void run() {
        LiveBroadcastActivity liveBroadcastActivity = this.f108628a;
        Live.getService().g().a(liveBroadcastActivity.hashCode(), liveBroadcastActivity);
    }
}
