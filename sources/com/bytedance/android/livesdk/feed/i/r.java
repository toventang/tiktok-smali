package com.bytedance.android.livesdk.feed.i;

import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f17564a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItem f17565b;

    static {
        Covode.recordClassIndex(9719);
    }

    r(p pVar, FeedItem feedItem) {
        this.f17564a = pVar;
        this.f17565b = feedItem;
    }

    public final void onClick(View view) {
        p pVar = this.f17564a;
        pVar.a(this.f17565b);
        pVar.a("title");
    }
}
