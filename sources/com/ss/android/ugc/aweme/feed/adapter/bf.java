package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.x.ad;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bf implements LongPressLayout.a {

    /* renamed from: a  reason: collision with root package name */
    private final BaseFeedPageParams f91703a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f91704b;

    static {
        Covode.recordClassIndex(57735);
    }

    bf(BaseFeedPageParams baseFeedPageParams, Context context) {
        this.f91703a = baseFeedPageParams;
        this.f91704b = context;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.LongPressLayout.a
    public final void a(float f2, float f3) {
        BaseFeedPageParams baseFeedPageParams = this.f91703a;
        Context context = this.f91704b;
        if (!baseFeedPageParams.isPlayListCleanMode().booleanValue()) {
            if (ad.a(baseFeedPageParams.eventType == null ? "" : baseFeedPageParams.eventType)) {
                c.a(new f(baseFeedPageParams.awemeFromPage, f2, f3, context.hashCode()));
            }
        }
    }
}
