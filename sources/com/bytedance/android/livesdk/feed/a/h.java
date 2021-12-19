package com.bytedance.android.livesdk.feed.a;

import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f17259a;

    static {
        Covode.recordClassIndex(9576);
    }

    h(d dVar) {
        this.f17259a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f17259a;
        FeedItem feedItem = (FeedItem) obj;
        dVar.f17240k = true;
        if (feedItem != null && (feedItem.item instanceof Media)) {
            dVar.f17230a.c();
        }
        if (dVar.f17237h != null) {
            dVar.f17237h.a();
        }
    }
}
