package com.bytedance.android.livesdk.feed.i;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.e;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final p f17571a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedItem f17572b;

    static {
        Covode.recordClassIndex(9723);
    }

    v(p pVar, FeedItem feedItem) {
        this.f17571a = pVar;
        this.f17572b = feedItem;
    }

    public final void onClick(View view) {
        p pVar = this.f17571a;
        FeedItem feedItem = this.f17572b;
        pVar.a(feedItem);
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof e) && !TextUtils.equals(((e) feedItem.item).f23111b, "app")) {
            pVar.a("more_button");
        }
    }
}
