package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final k f17531a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItem f17532b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f17533c;

    static {
        Covode.recordClassIndex(9709);
    }

    l(k kVar, FeedItem feedItem, Room room) {
        this.f17531a = kVar;
        this.f17532b = feedItem;
        this.f17533c = room;
    }

    public final void onClick(View view) {
        this.f17531a.a(this.f17532b, this.f17533c, view);
    }
}
