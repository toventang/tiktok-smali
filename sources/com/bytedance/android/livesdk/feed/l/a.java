package com.bytedance.android.livesdk.feed.l;

import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<FeedItem> f17588a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.base.model.c.a f17589b;

    static {
        Covode.recordClassIndex(9737);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f17588a, aVar.f17588a) && l.a(this.f17589b, aVar.f17589b);
    }

    public final int hashCode() {
        List<FeedItem> list = this.f17588a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        com.bytedance.android.live.base.model.c.a aVar = this.f17589b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FeedData(feedItems=" + this.f17588a + ", feedExtra=" + this.f17589b + ")";
    }

    public a(List<FeedItem> list, com.bytedance.android.live.base.model.c.a aVar) {
        this.f17588a = list;
        this.f17589b = aVar;
    }
}
