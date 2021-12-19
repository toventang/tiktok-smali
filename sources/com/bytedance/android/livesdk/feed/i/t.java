package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f17568a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItem f17569b;

    static {
        Covode.recordClassIndex(9721);
    }

    t(p pVar, FeedItem feedItem) {
        this.f17568a = pVar;
        this.f17569b = feedItem;
    }

    public final void onClick(View view) {
        p pVar = this.f17568a;
        pVar.a(this.f17569b);
        pVar.a("image");
    }
}
