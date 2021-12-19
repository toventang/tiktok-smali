package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.detail.ui.al;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a;
import com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p;
import com.ss.android.ugc.aweme.feed.i.ae;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.seekbar.e;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.l;
import com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class dw extends a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public AudioControlView f94643a;

    /* renamed from: b  reason: collision with root package name */
    NewVideoPlayerProgressbar f94644b;

    /* renamed from: c  reason: collision with root package name */
    LineProgressBar f94645c;

    /* renamed from: d  reason: collision with root package name */
    boolean f94646d = true;

    /* renamed from: e  reason: collision with root package name */
    private View f94647e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f94648f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.base.a.a f94649g;

    /* renamed from: h  reason: collision with root package name */
    private AnimatorSet f94650h;

    /* renamed from: i  reason: collision with root package name */
    private AnimatorSet f94651i;

    /* renamed from: j  reason: collision with root package name */
    private AnimatorSet f94652j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f94653k;

    /* renamed from: l  reason: collision with root package name */
    private View f94654l;

    /* renamed from: m  reason: collision with root package name */
    private FrameLayout.LayoutParams f94655m;
    private long n;

    static {
        Covode.recordClassIndex(60068);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(8, new g(dw.class, "onPlayerControllerVideoPlayProgressEvent", e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(10, new g(dw.class, "onShareEndEvent", ae.class, ThreadMode.POSTING, 0, false));
        hashMap.put(12, new g(dw.class, "onAwesomeSplashEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        LineProgressBar lineProgressBar = this.f94645c;
        if (lineProgressBar != null) {
            lineProgressBar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void h() {
        super.h();
        EventBus.a().b(this);
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        Activity activity = this.f94648f;
        if (activity instanceof com.ss.android.ugc.aweme.base.a.g) {
            ((com.ss.android.ugc.aweme.base.a.g) activity).registerActivityOnKeyDownListener(this.f94649g);
        }
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        Activity activity = this.f94648f;
        if (activity instanceof com.ss.android.ugc.aweme.base.a.g) {
            ((com.ss.android.ugc.aweme.base.a.g) activity).unRegisterActivityOnKeyDownListener(this.f94649g);
        }
    }

    public final void c() {
        if (this.f94644b != null && this.f94643a != null) {
            AnimatorSet animatorSet = this.f94652j;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.f94644b.setAlpha(0.0f);
            this.f94643a.setAlpha(1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
        c();
        AnimatorSet animatorSet = this.f94650h;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f94650h.cancel();
        }
        AnimatorSet animatorSet2 = this.f94651i;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            this.f94651i.cancel();
        }
        AudioControlView audioControlView = this.f94643a;
        if (audioControlView != null) {
            audioControlView.f68267c = null;
        }
        LineProgressBar lineProgressBar = this.f94645c;
        if (lineProgressBar != null) {
            lineProgressBar.c();
            this.f94645c.clearAnimation();
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f94644b;
        if (newVideoPlayerProgressbar != null) {
            newVideoPlayerProgressbar.clearAnimation();
        }
        p();
        this.f94648f = null;
    }

    public final void b() {
        if (this.f94644b != null && this.f94643a != null) {
            if (this.f94651i != null || this.f94650h != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f94652j = animatorSet;
                animatorSet.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.feed.ui.dw.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(60072);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        h hVar = new h(dw.this.L, dw.this.M, dw.this.P, 0, null);
                        hVar.f95114a = false;
                        c.a(hVar);
                    }
                });
                this.f94652j.play(this.f94644b.getShowAnim()).after(this.f94643a.getHideVolumeAnim());
                this.f94652j.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.n = SystemClock.elapsedRealtime();
        if (this.L != null) {
            if (com.ss.android.ugc.aweme.story.d.a.g(this.L)) {
                this.f94644b.setVisibility(8);
            } else if (com.ss.android.ugc.aweme.feed.ui.seekbar.a.c.b(this.L) || this.L.getVideoControl() == null || this.L.getVideoControl().showProgressBar != 1) {
                o.a(this.f94644b, 8);
            } else {
                this.f94644b.setProgress(0);
                if (this.L.getVideo() != null) {
                    this.f94644b.setMax(this.L.getVideo().getDuration());
                }
                o.a(this.f94644b, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final b e(b bVar) {
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        return bVar;
    }

    @r
    public void onShareEndEvent(ae aeVar) {
        o.a(this.f94647e, 0);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
        AudioControlView audioControlView = this.f94643a;
        if (audioControlView != null) {
            audioControlView.setOnAudioControlViewHideListener(new AudioControlView.b() {
                /* class com.ss.android.ugc.aweme.feed.ui.dw.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(60069);
                }

                @Override // com.ss.android.ugc.aweme.base.ui.AudioControlView.b
                public final void a() {
                    dw.this.b();
                }

                @Override // com.ss.android.ugc.aweme.base.ui.AudioControlView.b
                public final void b() {
                    dw.this.c();
                }
            });
        }
    }

    @r
    public void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        boolean z;
        if (aVar.f34874a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f94653k = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void c(b bVar) {
        if (bVar != null) {
            p.f93149a.a(new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.r(false, new dy(this, bVar.f67014a, bVar)));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        if (view instanceof FrameLayout) {
            this.f94654l = view;
            View a2 = com.a.b.c.a((Activity) this.R, (int) R.layout.tp);
            this.f94647e = a2;
            this.f94643a = (AudioControlView) a2.findViewById(R.id.nj);
            this.f94644b = (NewVideoPlayerProgressbar) this.f94647e.findViewById(R.id.fgu);
            this.f94645c = (LineProgressBar) this.f94647e.findViewById(R.id.cag);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, n.a(1.0d));
            layoutParams.gravity = 80;
            if (c.b.f66221a.t) {
                int a3 = n.a(8.0d);
                layoutParams.leftMargin = a3;
                layoutParams.rightMargin = a3;
            }
            this.f94655m = layoutParams;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(b bVar) {
        MethodCollector.i(8122);
        if (!this.K) {
            this.K = true;
            View view = this.f94654l;
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).addView(this.f94647e, this.f94655m);
            }
        }
        if (bVar == null) {
            MethodCollector.o(8122);
        } else {
            MethodCollector.o(8122);
        }
    }

    @r
    public void onPlayerControllerVideoPlayProgressEvent(e eVar) {
        if (this.L != null && eVar.f95100a != null && eVar.f95100a.getAid().equals(this.L.getAid())) {
            if (this.f94644b.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.n + 600) {
                this.f94644b.setMax(this.L.getVideo().getDuration());
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f94644b;
                double duration = (double) this.L.getVideo().getDuration();
                double d2 = (double) eVar.f95103d;
                Double.isNaN(d2);
                Double.isNaN(duration);
                newVideoPlayerProgressbar.setProgress((int) (duration * (d2 / 100.0d)));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("load_progress_bar", (u<b>) this.J).a("in_video_view_holder", (u<b>) this.J).a("on_page_unselected", (u<b>) this.J).a("on_page_selected", (u<b>) this.J).a("stopPlayAnimation", (u<b>) this.J);
        }
    }

    public dw(View view, Activity activity) {
        super(view);
        EventBus.a(EventBus.a(), this);
        this.f94648f = activity;
        this.f94649g = new dx(this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i2, KeyEvent keyEvent) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        if (i2 != 25 && i2 != 24) {
            return false;
        }
        if (i2 == 24) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.m.b.a().b();
        if (z) {
            str = "up";
        } else {
            str = "down";
        }
        if (this.L != null) {
            str2 = this.L.getFromGroupId();
        } else {
            str2 = "";
        }
        com.ss.android.ugc.aweme.common.r.a("adjust_volumn", new d().a("enter_from", this.M).a("to_status", str).a("group_id", str2).f66730a);
        AudioControlView audioControlView = this.f94643a;
        if (audioControlView == null || !audioControlView.e()) {
            Activity activity = this.f94648f;
            if (!(activity instanceof com.ss.android.ugc.aweme.main.j) || !ScrollSwitchStateManager.a.a((androidx.fragment.app.e) activity).b("page_feed") || !(((com.ss.android.ugc.aweme.main.j) this.f94648f).getCurFragment() instanceof l) || (!((l) ((com.ss.android.ugc.aweme.main.j) this.f94648f).getCurFragment()).m() && !((l) ((com.ss.android.ugc.aweme.main.j) this.f94648f).getCurFragment()).n())) {
                z2 = false;
            } else {
                z2 = true;
            }
            Activity activity2 = this.f94648f;
            if (!(activity2 instanceof al) || !ScrollSwitchStateManager.a.a((androidx.fragment.app.e) activity2).b("page_feed")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f94648f instanceof com.ss.android.ugc.aweme.main.j) {
                MainPageExperimentServiceImpl.b();
            }
            if (z2 || z3) {
                AudioControlView audioControlView2 = this.f94643a;
                if (audioControlView2 != null) {
                    audioControlView2.a();
                    audioControlView2.f68269e.f68282e = true;
                }
                h hVar = new h(this.L, this.M, this.P, i2, keyEvent);
                hVar.f95114a = true;
                com.ss.android.ugc.d.a.c.a(hVar);
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.f94644b;
                if (newVideoPlayerProgressbar != null) {
                    newVideoPlayerProgressbar.setAlpha(0.0f);
                }
                if (i2 == 25) {
                    AudioControlView audioControlView3 = this.f94643a;
                    if (audioControlView3 != null) {
                        if (this.f94653k) {
                            audioControlView3.b();
                        } else if (this.f94644b != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.f94650h = animatorSet;
                            animatorSet.play(this.f94643a.getShowVolumeAnim()).after(this.f94644b.getHideAnim());
                            this.f94650h.addListener(new AnimatorListenerAdapter() {
                                /* class com.ss.android.ugc.aweme.feed.ui.dw.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(60070);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (dw.this.f94643a != null) {
                                        dw.this.f94643a.b();
                                    }
                                }
                            });
                            this.f94650h.start();
                        }
                    }
                } else {
                    AudioControlView audioControlView4 = this.f94643a;
                    if (audioControlView4 != null) {
                        if (this.f94653k) {
                            audioControlView4.c();
                        } else if (this.f94644b != null) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            this.f94651i = animatorSet2;
                            animatorSet2.play(this.f94643a.getShowVolumeAnim()).after(this.f94644b.getHideAnim());
                            this.f94651i.addListener(new AnimatorListenerAdapter() {
                                /* class com.ss.android.ugc.aweme.feed.ui.dw.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(60071);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (dw.this.f94643a != null) {
                                        dw.this.f94643a.c();
                                    }
                                }
                            });
                            this.f94651i.start();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
