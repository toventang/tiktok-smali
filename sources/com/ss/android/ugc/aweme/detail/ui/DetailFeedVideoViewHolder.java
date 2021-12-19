package com.ss.android.ugc.aweme.detail.ui;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.detail.transition.b;
import com.ss.android.ugc.aweme.detail.ui.a.a;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.adapter.cl;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.trending.a;
import com.ss.android.ugc.aweme.trending.service.ITrendingFeedService;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.aweme.video.preload.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class DetailFeedVideoViewHolder extends VideoViewCell implements j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f79897a = true;

    /* renamed from: b  reason: collision with root package name */
    private final BaseFeedPageParams f79898b;

    /* renamed from: c  reason: collision with root package name */
    private ViewStub f79899c;

    /* renamed from: d  reason: collision with root package name */
    private a f79900d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.detail.ui.a.a f79901e;

    static {
        Covode.recordClassIndex(49699);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final ag e() {
        return new ag(true, e.a().f143601a);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void j() {
        super.j();
        ValueAnimator valueAnimator = this.f79901e.f79907a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void f() {
        super.f();
        a aVar = this.f79900d;
        if (aVar != null) {
            Aweme aweme = aVar.f93945b;
            if (aweme != null) {
                aweme.getAid();
            }
            aVar.a();
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void i() {
        super.i();
        com.ss.android.ugc.aweme.detail.ui.a.a aVar = this.f79901e;
        RelativeLayout relativeLayout = this.q;
        l.b(relativeLayout, "");
        l.d(relativeLayout, "");
        if (relativeLayout.getChildCount() != 0 && aVar.f79908b) {
            aVar.a(relativeLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(int i2) {
        super.a(i2);
        a aVar = this.f79900d;
        if (aVar != null) {
            Aweme aweme = aVar.f93945b;
            if (aweme != null) {
                aweme.getAid();
            }
            View view = aVar.f93946c;
            if (view != null && view.getVisibility() == 0) {
                aVar.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(Aweme aweme) {
        super.a(aweme);
        a aVar = this.f79900d;
        if (!(aVar == null || aweme == null)) {
            aweme.getDesc();
            aVar.f93945b = aweme;
        }
        if (b.f79870a && aweme != null) {
            v.a(this.I, aweme.getAid());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DetailFeedVideoViewHolder(cf cfVar) {
        super(cfVar);
        androidx.fragment.app.e activity;
        l.d(cfVar, "");
        MethodCollector.i(5250);
        BaseFeedPageParams baseFeedPageParams = cfVar.f91770e;
        this.f79898b = baseFeedPageParams;
        View findViewById = cfVar.f91766a.findViewById(R.id.eqy);
        l.b(findViewById, "");
        this.f79899c = (ViewStub) findViewById;
        ITrendingFeedService b2 = TrendingDetailServiceImpl.b();
        com.ss.android.ugc.aweme.feed.param.b bVar = baseFeedPageParams.param;
        l.b(bVar, "");
        String enterMethodValue = bVar.getEnterMethodValue();
        l.b(enterMethodValue, "");
        boolean z = !b2.a(enterMethodValue);
        com.ss.android.ugc.aweme.feed.param.b bVar2 = baseFeedPageParams.param;
        l.b(bVar2, "");
        if (!TextUtils.isEmpty(bVar2.getTrendingEventId()) && z) {
            View inflate = this.f79899c.inflate();
            Fragment fragment = this.f91517l;
            if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
                l.b(inflate, "");
                l.b(activity, "");
                this.f79900d = new a(inflate, activity);
            }
        }
        this.f79901e = new com.ss.android.ugc.aweme.detail.ui.a.a();
        MethodCollector.o(5250);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void a(boolean z) {
        super.a(z);
        com.ss.android.ugc.aweme.detail.ui.a.a aVar = this.f79901e;
        RelativeLayout relativeLayout = this.q;
        l.b(relativeLayout, "");
        l.d(relativeLayout, "");
        aVar.f79908b = z;
        ValueAnimator valueAnimator = aVar.f79907a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            cl.f91793c = 0;
            relativeLayout.setAlpha(0.0f);
            aVar.f79907a = ValueAnimator.ofFloat(relativeLayout.getAlpha(), 1.0f);
            ValueAnimator valueAnimator2 = aVar.f79907a;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(400L);
            }
        } else {
            cl.f91793c = 1;
            aVar.f79907a = ValueAnimator.ofFloat(relativeLayout.getAlpha(), 0.0f);
            ValueAnimator valueAnimator3 = aVar.f79907a;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(200L);
            }
        }
        ValueAnimator valueAnimator4 = aVar.f79907a;
        if (valueAnimator4 != null) {
            valueAnimator4.setInterpolator(new AccelerateInterpolator());
        }
        ValueAnimator valueAnimator5 = aVar.f79907a;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new a.b(relativeLayout));
        }
        ValueAnimator valueAnimator6 = aVar.f79907a;
        if (valueAnimator6 != null) {
            valueAnimator6.start();
        }
    }
}
