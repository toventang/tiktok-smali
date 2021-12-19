package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.kids.commonfeed.a.a;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.VideoPlayerProgressBar;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class VideoProgressBarWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(67859);
    }

    public static final class a extends com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a implements u<com.ss.android.ugc.aweme.arch.widgets.base.b>, i, j {

        /* renamed from: a  reason: collision with root package name */
        public AudioControlView f106086a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoProgressBarWidget f106087b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f106088c;

        /* renamed from: j  reason: collision with root package name */
        private Activity f106089j;

        /* renamed from: k  reason: collision with root package name */
        private VideoPlayerProgressBar f106090k;

        /* renamed from: l  reason: collision with root package name */
        private LineProgressBar f106091l;

        /* renamed from: m  reason: collision with root package name */
        private AnimatorSet f106092m;
        private AnimatorSet n;
        private AnimatorSet o;
        private boolean p = true;
        private long q;

        static {
            Covode.recordClassIndex(67860);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final String b() {
            return "progress_bar";
        }

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(28, new g(a.class, "onVolumeChangeEvent", com.ss.android.ugc.aweme.kids.common.b.c.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.VideoProgressBarWidget$a$a  reason: collision with other inner class name */
        public static final class C2704a implements AudioControlView.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f106093a;

            static {
                Covode.recordClassIndex(67861);
            }

            @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView.b
            public final void a() {
                this.f106093a.d();
            }

            @Override // com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.AudioControlView.b
            public final void b() {
                this.f106093a.e();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C2704a(a aVar) {
                this.f106093a = aVar;
            }
        }

        private final void g() {
            LineProgressBar lineProgressBar = this.f106091l;
            if (lineProgressBar != null) {
                lineProgressBar.b();
            }
        }

        public final void d() {
            if (this.f106090k != null && this.f106086a != null) {
                if (this.n != null || this.f106092m != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.o = animatorSet;
                    VideoPlayerProgressBar videoPlayerProgressBar = this.f106090k;
                    if (videoPlayerProgressBar == null) {
                        l.b();
                    }
                    AnimatorSet.Builder play = animatorSet.play(videoPlayerProgressBar.getShowAnim());
                    AudioControlView audioControlView = this.f106086a;
                    if (audioControlView == null) {
                        l.b();
                    }
                    play.after(audioControlView.getHideVolumeAnim());
                    AnimatorSet animatorSet2 = this.o;
                    if (animatorSet2 == null) {
                        l.b();
                    }
                    animatorSet2.start();
                }
            }
        }

        public final void e() {
            if (this.f106090k != null && this.f106086a != null) {
                AnimatorSet animatorSet = this.o;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                VideoPlayerProgressBar videoPlayerProgressBar = this.f106090k;
                if (videoPlayerProgressBar == null) {
                    l.b();
                }
                videoPlayerProgressBar.setAlpha(0.0f);
                AudioControlView audioControlView = this.f106086a;
                if (audioControlView == null) {
                    l.b();
                }
                audioControlView.setAlpha(1.0f);
            }
        }

        private final void h() {
            VideoPlayerProgressBar videoPlayerProgressBar;
            this.q = SystemClock.elapsedRealtime();
            if (this.f106099d != null) {
                Aweme aweme = this.f106099d;
                l.b(aweme, "");
                if (aweme.getVideoControl() != null) {
                    Aweme aweme2 = this.f106099d;
                    l.b(aweme2, "");
                    if (aweme2.getVideoControl().showProgressBar == 1) {
                        VideoPlayerProgressBar videoPlayerProgressBar2 = this.f106090k;
                        if (videoPlayerProgressBar2 != null) {
                            videoPlayerProgressBar2.setProgress(0);
                        }
                        Aweme aweme3 = this.f106099d;
                        l.b(aweme3, "");
                        if (!(aweme3.getVideo() == null || (videoPlayerProgressBar = this.f106090k) == null)) {
                            Aweme aweme4 = this.f106099d;
                            l.b(aweme4, "");
                            Video video = aweme4.getVideo();
                            l.b(video, "");
                            videoPlayerProgressBar.setMax(video.getDuration());
                        }
                        o.a(this.f106090k, 0);
                        return;
                    }
                }
                o.a(this.f106090k, 8);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a() {
            e();
            AnimatorSet animatorSet = this.f106092m;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                AnimatorSet animatorSet2 = this.f106092m;
                if (animatorSet2 == null) {
                    l.b();
                }
                animatorSet2.cancel();
            }
            AnimatorSet animatorSet3 = this.n;
            if (animatorSet3 != null) {
                animatorSet3.removeAllListeners();
                AnimatorSet animatorSet4 = this.n;
                if (animatorSet4 == null) {
                    l.b();
                }
                animatorSet4.cancel();
            }
            AudioControlView audioControlView = this.f106086a;
            if (audioControlView != null) {
                audioControlView.f106253c = null;
            }
            LineProgressBar lineProgressBar = this.f106091l;
            if (lineProgressBar != null) {
                lineProgressBar.c();
                LineProgressBar lineProgressBar2 = this.f106091l;
                if (lineProgressBar2 == null) {
                    l.b();
                }
                lineProgressBar2.clearAnimation();
            }
            VideoPlayerProgressBar videoPlayerProgressBar = this.f106090k;
            if (videoPlayerProgressBar != null) {
                videoPlayerProgressBar.clearAnimation();
            }
            cg.b(this);
            this.f106089j = null;
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f106094a;

            static {
                Covode.recordClassIndex(67862);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(a aVar) {
                this.f106094a = aVar;
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                if (this.f106094a.f106086a != null) {
                    AudioControlView audioControlView = this.f106094a.f106086a;
                    if (audioControlView == null) {
                        l.b();
                    }
                    audioControlView.a();
                    com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "addVolume");
                    audioControlView.f106255e.sendEmptyMessage(2);
                }
            }
        }

        public static final class c extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f106095a;

            static {
                Covode.recordClassIndex(67863);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            c(a aVar) {
                this.f106095a = aVar;
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                if (this.f106095a.f106086a != null) {
                    AudioControlView audioControlView = this.f106095a.f106086a;
                    if (audioControlView == null) {
                        l.b();
                    }
                    audioControlView.a();
                    com.ss.android.ugc.aweme.framework.a.a.a(4, "VoiceAdjust", "cutVolume");
                    audioControlView.f106255e.sendEmptyMessage(3);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar) {
            super.a(aVar);
            AudioControlView audioControlView = this.f106086a;
            if (audioControlView != null) {
                audioControlView.setOnAudioControlViewHideListener(new C2704a(this));
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(DataCenter dataCenter) {
            if (dataCenter != null) {
                dataCenter.a("load_progress_bar", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                dataCenter.a("on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                dataCenter.a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                dataCenter.a("stop_animation", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
                dataCenter.a("on_play_progress_change", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(View view) {
            MethodCollector.i(5587);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.ad4, (ViewGroup) null);
                this.f106086a = (AudioControlView) inflate.findViewById(R.id.nj);
                this.f106090k = (VideoPlayerProgressBar) inflate.findViewById(R.id.fgu);
                this.f106091l = (LineProgressBar) inflate.findViewById(R.id.cag);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, n.a(1.0d));
                layoutParams.gravity = 80;
                if (a.C2699a.f105969a.f105968m) {
                    int a2 = n.a(8.0d);
                    layoutParams.leftMargin = a2;
                    layoutParams.rightMargin = a2;
                }
                frameLayout.addView(inflate, layoutParams);
            }
            MethodCollector.o(5587);
        }

        @r
        public final void onVolumeChangeEvent(com.ss.android.ugc.aweme.kids.common.b.c cVar) {
            l.d(cVar, "");
            AudioControlView audioControlView = this.f106086a;
            if (audioControlView == null || audioControlView.f106255e == null || !audioControlView.f106255e.f106267d) {
                VideoPlayerProgressBar videoPlayerProgressBar = this.f106090k;
                if (videoPlayerProgressBar != null) {
                    videoPlayerProgressBar.setAlpha(0.0f);
                }
                ObjectAnimator objectAnimator = null;
                if (cVar.f105884a) {
                    if (this.f106086a != null && this.f106090k != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        this.n = animatorSet;
                        AudioControlView audioControlView2 = this.f106086a;
                        if (audioControlView2 == null) {
                            l.b();
                        }
                        AnimatorSet.Builder play = animatorSet.play(audioControlView2.getShowVolumeAnim());
                        VideoPlayerProgressBar videoPlayerProgressBar2 = this.f106090k;
                        if (videoPlayerProgressBar2 != null) {
                            objectAnimator = videoPlayerProgressBar2.getHideAnim();
                        }
                        play.after(objectAnimator);
                        AnimatorSet animatorSet2 = this.n;
                        if (animatorSet2 == null) {
                            l.b();
                        }
                        animatorSet2.addListener(new b(this));
                        AnimatorSet animatorSet3 = this.n;
                        if (animatorSet3 == null) {
                            l.b();
                        }
                        animatorSet3.start();
                    }
                } else if (this.f106086a != null && this.f106090k != null) {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.f106092m = animatorSet4;
                    AudioControlView audioControlView3 = this.f106086a;
                    if (audioControlView3 == null) {
                        l.b();
                    }
                    AnimatorSet.Builder play2 = animatorSet4.play(audioControlView3.getShowVolumeAnim());
                    VideoPlayerProgressBar videoPlayerProgressBar3 = this.f106090k;
                    if (videoPlayerProgressBar3 != null) {
                        objectAnimator = videoPlayerProgressBar3.getHideAnim();
                    }
                    play2.after(objectAnimator);
                    AnimatorSet animatorSet5 = this.f106092m;
                    if (animatorSet5 == null) {
                        l.b();
                    }
                    animatorSet5.addListener(new c(this));
                    AnimatorSet animatorSet6 = this.f106092m;
                    if (animatorSet6 == null) {
                        l.b();
                    }
                    animatorSet6.start();
                }
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
            com.ss.android.ugc.aweme.arch.widgets.base.b bVar2 = bVar;
            if (bVar2 != null) {
                String str = bVar2.f67014a;
                switch (str.hashCode()) {
                    case -1121670825:
                        if (str.equals("on_play_progress_change")) {
                            Float f2 = (Float) bVar2.a();
                            l.b(f2, "");
                            float floatValue = f2.floatValue();
                            if (this.f106099d != null) {
                                VideoPlayerProgressBar videoPlayerProgressBar = this.f106090k;
                                if (videoPlayerProgressBar == null || videoPlayerProgressBar.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.q + 600) {
                                    VideoPlayerProgressBar videoPlayerProgressBar2 = this.f106090k;
                                    if (videoPlayerProgressBar2 != null) {
                                        Aweme aweme = this.f106099d;
                                        l.b(aweme, "");
                                        Video video = aweme.getVideo();
                                        l.b(video, "");
                                        videoPlayerProgressBar2.setMax(video.getDuration());
                                    }
                                    VideoPlayerProgressBar videoPlayerProgressBar3 = this.f106090k;
                                    if (videoPlayerProgressBar3 != null) {
                                        Aweme aweme2 = this.f106099d;
                                        l.b(aweme2, "");
                                        Video video2 = aweme2.getVideo();
                                        l.b(video2, "");
                                        double duration = (double) video2.getDuration();
                                        double d2 = (double) floatValue;
                                        Double.isNaN(d2);
                                        Double.isNaN(duration);
                                        videoPlayerProgressBar3.setProgress(((Integer) Double.valueOf(duration * (d2 / 100.0d))).intValue());
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    case -904341062:
                        if (str.equals("load_progress_bar")) {
                            Boolean bool = (Boolean) bVar2.a();
                            l.b(bool, "");
                            if (bool.booleanValue()) {
                                LineProgressBar lineProgressBar = this.f106091l;
                                if (lineProgressBar != null) {
                                    lineProgressBar.a();
                                    return;
                                }
                                return;
                            }
                            g();
                            return;
                        }
                        return;
                    case -301890681:
                        if (str.equals("stop_animation") && !this.p) {
                            VideoPlayerProgressBar videoPlayerProgressBar4 = this.f106090k;
                            if (videoPlayerProgressBar4 != null) {
                                videoPlayerProgressBar4.setProgress(0);
                                videoPlayerProgressBar4.clearAnimation();
                                videoPlayerProgressBar4.setVisibility(4);
                            }
                            LineProgressBar lineProgressBar2 = this.f106091l;
                            if (lineProgressBar2 != null) {
                                lineProgressBar2.clearAnimation();
                                lineProgressBar2.c();
                                return;
                            }
                            return;
                        }
                        return;
                    case 350216171:
                        if (str.equals("on_page_selected")) {
                            this.p = true;
                            d();
                            h();
                            return;
                        }
                        return;
                    case 1628582276:
                        if (str.equals("on_page_unselected")) {
                            this.p = false;
                            h();
                            g();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VideoProgressBarWidget videoProgressBarWidget, View view, View view2) {
            super(view2);
            this.f106087b = videoProgressBarWidget;
            this.f106088c = view;
            cg.a(this);
            this.f106089j = videoProgressBarWidget.d();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    public final com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a b(View view) {
        return new a(this, view, view);
    }
}
