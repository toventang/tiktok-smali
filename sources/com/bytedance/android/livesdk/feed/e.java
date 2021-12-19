package com.bytedance.android.livesdk.feed;

import android.content.Context;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.android.livesdk.feed.g.a;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.DislikeTipViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.TimeOutRefreshViewModel;
import com.bytedance.covode.number.Covode;

public final class e implements ad.b {

    /* renamed from: a  reason: collision with root package name */
    public long f17422a;

    /* renamed from: b  reason: collision with root package name */
    public i f17423b;

    /* renamed from: c  reason: collision with root package name */
    private l f17424c;

    /* renamed from: d  reason: collision with root package name */
    private m f17425d;

    /* renamed from: e  reason: collision with root package name */
    private Context f17426e;

    /* renamed from: f  reason: collision with root package name */
    private a f17427f;

    /* renamed from: g  reason: collision with root package name */
    private q f17428g;

    static {
        Covode.recordClassIndex(9659);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        if (cls.isAssignableFrom(BaseFeedDataViewModel.class)) {
            return new BaseFeedDataViewModel(this.f17424c, this.f17423b, this.f17427f);
        }
        if (cls.isAssignableFrom(TabFeedViewModel.class)) {
            return new TabFeedViewModel(this.f17424c, this.f17423b, this.f17425d, this.f17427f, this.f17428g, this.f17422a);
        }
        if (cls.isAssignableFrom(DislikeTipViewModel.class)) {
            return new DislikeTipViewModel(this.f17425d, this.f17422a, this.f17426e);
        }
        if (cls.isAssignableFrom(TimeOutRefreshViewModel.class)) {
            return new TimeOutRefreshViewModel();
        }
        throw new IllegalArgumentException("unknown model " + cls.getName());
    }

    public e(l lVar, m mVar, Context context, q qVar, a aVar) {
        this.f17424c = lVar;
        this.f17425d = mVar;
        this.f17426e = context;
        this.f17428g = qVar;
        this.f17427f = aVar;
    }
}
