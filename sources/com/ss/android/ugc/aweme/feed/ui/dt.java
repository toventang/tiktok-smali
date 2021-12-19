package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.a.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.a.a;
import com.ss.android.ugc.aweme.cp.e;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.experiment.gg;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.ss.android.ugc.aweme.performance.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class dt extends h {

    /* renamed from: b  reason: collision with root package name */
    SmartCircleImageView f94619b;

    /* renamed from: c  reason: collision with root package name */
    SmartCircleImageView f94620c;

    /* renamed from: d  reason: collision with root package name */
    PeriscopeLayout f94621d;

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f94622e;

    /* renamed from: f  reason: collision with root package name */
    public ValueAnimator f94623f;

    /* renamed from: g  reason: collision with root package name */
    public long f94624g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f94625h;

    /* renamed from: i  reason: collision with root package name */
    private e f94626i;

    static {
        Covode.recordClassIndex(60058);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void g() {
        super.g();
        e();
    }

    private e c() {
        if (this.f94626i == null) {
            this.f94626i = new e();
        }
        return this.f94626i;
    }

    private static boolean d() {
        if (cn.f89703a) {
            return false;
        }
        i.b();
        return b.a().a(true, "anim_opt", false);
    }

    private void e() {
        long j2;
        if (this.f94625h && !d()) {
            this.f94625h = false;
            p pVar = p.f93149a;
            r rVar = new r(false, new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.dt.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(60061);
                }

                public final void run() {
                    dt dtVar = dt.this;
                    if (dtVar.f94621d != null) {
                        dtVar.f94621d.b();
                    }
                    if (dt.this.f94622e != null && dt.this.f94623f != null) {
                        dt.this.f94623f.end();
                    }
                }
            });
            if (gg.f90139a) {
                j2 = 300;
            } else {
                j2 = 0;
            }
            pVar.a(rVar, j2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.ui.h
    public final void b() {
        long j2;
        if (this.f94625h && !d()) {
            this.f94625h = false;
            p pVar = p.f93149a;
            r rVar = new r(false, new Runnable() {
                /* class com.ss.android.ugc.aweme.feed.ui.dt.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(60062);
                }

                public final void run() {
                    if (!(dt.this.f94622e == null || dt.this.f94623f == null)) {
                        dt.this.f94623f.end();
                    }
                    dt dtVar = dt.this;
                    if (dtVar.f94621d != null) {
                        dtVar.f94621d.c();
                    }
                }
            });
            if (gg.f90139a) {
                j2 = 300;
            } else {
                j2 = 0;
            }
            pVar.a(rVar, j2);
        }
    }

    public dt(View view) {
        super(view);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    private static void a(SmartImageView smartImageView) {
        v a2 = com.bytedance.lighten.a.r.a(2131233114);
        a2.E = smartImageView;
        a2.c();
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a, com.ss.android.ugc.aweme.feed.ui.h
    public final void a(DataCenter dataCenter) {
        dataCenter.a("stopPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("startPlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J).a("pausePlayAnimation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a, com.ss.android.ugc.aweme.feed.ui.h
    public final void a(View view) {
        super.a(view);
        this.T = c.a((Activity) this.R, (int) R.layout.t0);
        this.f94622e = (FrameLayout) this.T.findViewById(R.id.cpu);
        this.f94620c = (SmartCircleImageView) this.T.findViewById(R.id.cpt);
        this.f94619b = (SmartCircleImageView) this.T.findViewById(R.id.d0c);
        this.f94621d = (PeriscopeLayout) this.T.findViewById(R.id.cwj);
        this.f94620c.setOnTouchListener(new com.bytedance.ies.dmt.ui.widget.b());
        e c2 = c();
        c2.f78259a = this.T.findViewById(R.id.cr0);
        c2.f78261c = this.f94622e;
        c2.f78262d = this.f94620c;
        c2.f78260b = this.f94621d;
        c2.f78263e = this.f94619b;
        c2.f78264f = this.S;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        long j2;
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -2058685350:
                    if (str.equals("pausePlayAnimation")) {
                        e();
                        return;
                    }
                    return;
                case -1661876786:
                    if (str.equals("stopPlayAnimation")) {
                        b();
                        return;
                    }
                    return;
                case 307897710:
                    if (str.equals("startPlayAnimation") && !this.f94625h && !d() && !com.ss.android.ugc.aweme.power.c.a().b()) {
                        this.f94625h = true;
                        p pVar = p.f93149a;
                        r rVar = new r(false, new Runnable() {
                            /* class com.ss.android.ugc.aweme.feed.ui.dt.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(60060);
                            }

                            public final void run() {
                                dt dtVar = dt.this;
                                if (dtVar.f94622e != null) {
                                    if (dtVar.f94623f != null) {
                                        dtVar.f94623f.end();
                                    } else {
                                        dtVar.f94623f = ValueAnimator.ofFloat(0.0f, 360.0f);
                                        dtVar.f94623f.setDuration(8000L);
                                        dtVar.f94623f.setRepeatMode(1);
                                        dtVar.f94623f.setInterpolator(new LinearInterpolator());
                                        dtVar.f94623f.setRepeatCount(-1);
                                        dtVar.f94623f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                            /* class com.ss.android.ugc.aweme.feed.ui.dt.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(60059);
                                            }

                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                if (System.currentTimeMillis() - dt.this.f94624g > 64) {
                                                    dt.this.f94624g = System.currentTimeMillis();
                                                    dt.this.f94622e.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                                }
                                            }
                                        });
                                    }
                                    a.a(dtVar.f94623f, com.ss.android.ugc.aweme.base.ui.a.c.f68345a);
                                } else {
                                    dtVar.f94622e.clearAnimation();
                                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                    rotateAnimation.setDuration(8000);
                                    rotateAnimation.setInterpolator(new LinearInterpolator());
                                    rotateAnimation.setRepeatMode(1);
                                    rotateAnimation.setRepeatCount(-1);
                                    rotateAnimation.setFillAfter(true);
                                    FrameLayout frameLayout = dtVar.f94622e;
                                    int i2 = com.ss.android.ugc.aweme.base.ui.a.c.f68345a;
                                    l.d(rotateAnimation, "");
                                    l.d(frameLayout, "");
                                    if (!com.ss.android.ugc.aweme.base.ui.a.b.b(i2)) {
                                        frameLayout.setVisibility(8);
                                    } else if (com.ss.android.ugc.aweme.base.ui.a.b.a(i2)) {
                                        frameLayout.startAnimation(rotateAnimation);
                                    }
                                }
                                dt dtVar2 = dt.this;
                                if (dtVar2.f94621d != null) {
                                    dtVar2.f94621d.a();
                                }
                            }
                        });
                        if (gg.f90139a) {
                            j2 = 300;
                        } else {
                            j2 = 0;
                        }
                        pVar.a(rVar, j2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!TextUtils.equals(bVar.f67014a, "video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = new com.ss.android.ugc.aweme.arch.widgets.base.b("ui_state", hashMap);
        hashMap.put("aweme_state", this.L);
        hashMap.put("event_type_state", this.M);
        hashMap.put("enter_method_state", this.U);
        return bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0115  */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b r10) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.dt.b(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    private static void a(SmartImageView smartImageView, UrlModel urlModel, int i2, int i3) {
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).a(i2, i3);
        a2.K = true;
        v a3 = a2.a("VideoMusicCoverView");
        a3.E = smartImageView;
        a3.c();
    }
}
