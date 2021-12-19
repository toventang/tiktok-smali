package com.ss.android.ugc.aweme.splash;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TransitActivity f134678a;

    static {
        Covode.recordClassIndex(88008);
    }

    c(TransitActivity transitActivity) {
        this.f134678a = transitActivity;
    }

    public final void run() {
        Intent a2;
        TransitActivity transitActivity = this.f134678a;
        Intent intent = transitActivity.getIntent();
        if (intent != null) {
            intent.setExtrasClassLoader(TransitActivity.class.getClassLoader());
            a2 = (Intent) intent.getParcelableExtra("main");
            if (a2 != null) {
                a2.setExtrasClassLoader(TransitActivity.class.getClassLoader());
                a.a(a2, transitActivity);
                transitActivity.startActivity(a2);
                transitActivity.overridePendingTransition(0, 0);
            }
        }
        a2 = com.ss.android.ugc.aweme.utils.a.c.a(transitActivity);
        a.a(a2, transitActivity);
        transitActivity.startActivity(a2);
        transitActivity.overridePendingTransition(0, 0);
    }
}
