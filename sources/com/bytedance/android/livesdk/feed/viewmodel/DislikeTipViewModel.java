package com.bytedance.android.livesdk.feed.viewmodel;

import android.content.Context;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.model.ah;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.f.b;

public class DislikeTipViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17704a;

    /* renamed from: b  reason: collision with root package name */
    public int f17705b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17706c;

    /* renamed from: d  reason: collision with root package name */
    private Context f17707d;

    static {
        Covode.recordClassIndex(9821);
    }

    public DislikeTipViewModel(m mVar, long j2, Context context) {
        boolean z;
        ah a2 = mVar.a(j2);
        if (a2 == null || a2.getDislike() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f17704a = z;
        this.f17707d = context;
        this.f17706c = b.a(context, "ttlive_live_user").a("HAVE_SHOW_DISLIKE_GUIDE", false);
    }
}
