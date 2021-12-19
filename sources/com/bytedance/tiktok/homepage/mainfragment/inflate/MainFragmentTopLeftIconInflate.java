package com.bytedance.tiktok.homepage.mainfragment.inflate;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.live.a.a;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.s.d;
import com.ss.android.ugc.aweme.story.g;
import h.f.b.l;
import java.util.List;

public final class MainFragmentTopLeftIconInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f44201a;

    static {
        Covode.recordClassIndex(27081);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "inflate_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return ad.INFLATE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        return HomePageUIFrameServiceImpl.e().a();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public final void c() {
        boolean a2 = a.a();
        int a3 = n.a(24.0d);
        int a4 = n.a(44.0d);
        if (a2) {
            a3 = n.a(56.0d);
            a4 = n.a(56.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a3, a4);
        if (!a2) {
            if (!g.f137757a.i()) {
                layoutParams.setMargins(n.a(16.0d), 0, 0, 0);
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(n.a(16.0d));
            } else {
                layoutParams.setMargins(0, 0, n.a(16.0d), 0);
                int i3 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(n.a(16.0d));
            }
        }
        if (b.a().a(true, "optimize_feed_tab_layout", false)) {
            layoutParams.topMargin = n.a(-3.0d);
        }
        ImageView imageView = this.f44201a;
        if (imageView == null) {
            l.b();
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        l.d(context, "");
        if (activity != null) {
            context = activity;
        }
        this.f44201a = a.a(context);
        if (d.i()) {
            c();
        }
    }
}
