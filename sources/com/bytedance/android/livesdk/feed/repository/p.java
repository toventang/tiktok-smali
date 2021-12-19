package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.c.a;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.List;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f17640a = new p();

    static {
        Covode.recordClassIndex(9780);
    }

    private p() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (!(pair == null || h.a((List) pair.first))) {
            for (FeedItem feedItem : (List) pair.first) {
                if (((a) pair.second).a() != null) {
                    feedItem.logPb = ((a) pair.second).a().toString();
                }
            }
        }
    }
}
