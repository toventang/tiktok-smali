package com.ss.android.ugc.aweme.discover.lynx;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.c;
import com.bytedance.hybrid.spark.page.c;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f81408a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(50596);
    }

    public static c b(Context context) {
        l.d(context, "");
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
            l.b(context, "");
        }
        return c.a.a(context, new SparkContext()).b();
    }

    public static BulletContainerView a(Context context) {
        l.d(context, "");
        BulletContainerView bulletContainerView = new BulletContainerView(context, null, 6, (byte) 0);
        bulletContainerView.a(BulletService.f().a());
        if ((context instanceof Activity) && (context instanceof m)) {
            BulletActivityWrapper bulletActivityWrapper = new BulletActivityWrapper((Activity) context);
            bulletActivityWrapper.a((m) context);
            bulletContainerView.setActivityWrapper(bulletActivityWrapper);
        }
        return bulletContainerView;
    }
}
