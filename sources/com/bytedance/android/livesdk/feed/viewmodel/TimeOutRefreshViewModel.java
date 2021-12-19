package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.livesetting.feed.BackRefreshTimeoutSetting;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.covode.number.Covode;
import f.a.l.c;

public class TimeOutRefreshViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17709a;

    /* renamed from: b  reason: collision with root package name */
    public c<Object> f17710b = new c<>();

    /* renamed from: c  reason: collision with root package name */
    public long f17711c = Long.MAX_VALUE;

    static {
        Covode.recordClassIndex(9824);
    }

    public final void a() {
        if (!this.f17709a && this.f17711c != Long.MAX_VALUE && System.currentTimeMillis() - this.f17711c > ((long) BackRefreshTimeoutSetting.INSTANCE.getValue())) {
            this.f17710b.onNext(i.f22198c);
        }
        this.f17711c = Long.MAX_VALUE;
        this.f17709a = false;
    }
}
