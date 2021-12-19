package com.ss.android.ugc.aweme.notice.api.e;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f112750a;

    static {
        Covode.recordClassIndex(72467);
    }

    s(Activity activity) {
        this.f112750a = activity;
    }

    public final void run() {
        new b(this.f112750a).e(R.string.bp9).b();
    }
}
