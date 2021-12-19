package com.bytedance.tiktok.homepage.mainfragment.inflate;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.q;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import java.util.List;

public final class MainFragmentTopRightIconInflate implements q {

    /* renamed from: a  reason: collision with root package name */
    private View f44202a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f44203b;

    /* renamed from: c  reason: collision with root package name */
    private AnimatedImageView f44204c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f44205d;

    static {
        Covode.recordClassIndex(27082);
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

    public final View a(Context context, int i2) {
        View view;
        l.d(context, "");
        if (i2 == 3) {
            view = this.f44202a;
            if (view == null) {
                view = a.b(context);
            }
            this.f44202a = null;
        } else if (i2 == 4) {
            view = this.f44203b;
            if (view == null) {
                view = a.d(context);
            }
            this.f44203b = null;
        } else if (i2 != 5) {
            view = this.f44205d;
            if (view == null) {
                view = a.e(context);
            }
            this.f44205d = null;
        } else {
            view = this.f44204c;
            if (view == null) {
                view = a.c(context);
            }
            this.f44204c = null;
        }
        return view;
    }

    @Override // com.ss.android.ugc.aweme.lego.q
    public final void a(Context context, Activity activity) {
        Activity activity2;
        Activity activity3;
        l.d(context, "");
        if (activity != null) {
            activity2 = activity;
        } else {
            activity2 = context;
        }
        this.f44203b = (ImageView) a.d(activity2);
        if (activity != null) {
            activity3 = activity;
        } else {
            activity3 = context;
        }
        this.f44204c = (AnimatedImageView) a.c(activity3);
        if (activity != null) {
            context = activity;
        }
        this.f44205d = (ImageView) a.e(context);
    }
}
