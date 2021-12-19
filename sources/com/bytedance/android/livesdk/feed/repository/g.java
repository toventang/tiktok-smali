package com.bytedance.android.livesdk.feed.repository;

import android.text.TextUtils;
import com.bytedance.android.live.core.a.n;
import com.bytedance.android.live.core.f.q;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements n {

    /* renamed from: a  reason: collision with root package name */
    private final String f17630a;

    static {
        Covode.recordClassIndex(9771);
    }

    g(String str) {
        this.f17630a = str;
    }

    @Override // com.bytedance.android.live.core.a.n
    public final boolean a(Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        return (feedItem == null || feedItem.item == null || !TextUtils.equals(q.a(feedItem.item.getMixId()), q.a(this.f17630a))) ? false : true;
    }
}
