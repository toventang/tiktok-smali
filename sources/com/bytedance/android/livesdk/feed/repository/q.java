package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.media.d;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.ArrayList;
import java.util.List;

final /* synthetic */ class q implements f {

    /* renamed from: a  reason: collision with root package name */
    private final FeedRepository.a f17641a;

    static {
        Covode.recordClassIndex(9781);
    }

    q(FeedRepository.a aVar) {
        this.f17641a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        FeedRepository.a aVar = this.f17641a;
        Pair pair = (Pair) obj;
        if (!(pair == null || h.a((List) pair.first))) {
            ArrayList arrayList = new ArrayList();
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || feedItem.item == null || !(feedItem.item instanceof d) || ((d) feedItem.item).getVideoModel() == null || ((d) feedItem.item).getVideoModel().getCoverModel() == null)) {
                    arrayList.add(((d) feedItem.item).getVideoModel().getCoverModel());
                }
            }
            aVar.f17620j.onNext(arrayList);
        }
    }
}
