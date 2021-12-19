package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.cd;
import com.ss.android.ugc.aweme.video.ad;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private Activity f44149a;

    static {
        Covode.recordClassIndex(27054);
    }

    public final void a() {
        Intent intent = this.f44149a.getIntent();
        if (this.f44149a.isTaskRoot() && intent != null && intent.hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(intent.getAction())) {
            cd.f122158b.a();
        }
        ad.f143259a = true;
    }

    public d(Activity activity) {
        this.f44149a = activity;
    }
}
