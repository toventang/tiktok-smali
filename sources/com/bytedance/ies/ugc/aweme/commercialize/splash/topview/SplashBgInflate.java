package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.q;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class SplashBgInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f34871a;

    static {
        Covode.recordClassIndex(20916);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final Class<? extends Activity> b() {
        return null;
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

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public final Drawable b(Context context) {
        Drawable drawable = this.f34871a;
        if (drawable != null) {
            this.f34871a = null;
            return drawable;
        }
        try {
            return context.getResources().getDrawable(R.drawable.splash_bg_normal);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        try {
            this.f34871a = context.getResources().getDrawable(R.drawable.splash_bg_normal);
        } catch (Exception unused) {
        }
    }
}
