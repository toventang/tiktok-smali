package com.ss.android.ugc.aweme.feed.ui.seekbar.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.ui.am;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.f;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class b implements VideoSeekBar.b, VideoSeekBar.c, h, i, j {
    public static String x = "CommonControl";
    public static final a y = new a((byte) 0);
    private final h A = h.i.a((h.f.a.a) new d(this));
    private final Runnable B;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f95059a;

    /* renamed from: b  reason: collision with root package name */
    public int f95060b = 1;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f95061c;

    /* renamed from: d  reason: collision with root package name */
    public int f95062d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f95063e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f95064f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f95065g;

    /* renamed from: h  reason: collision with root package name */
    public int f95066h;

    /* renamed from: i  reason: collision with root package name */
    public long f95067i;

    /* renamed from: j  reason: collision with root package name */
    public al f95068j;

    /* renamed from: k  reason: collision with root package name */
    public String f95069k = "";

    /* renamed from: l  reason: collision with root package name */
    public int f95070l = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f95071m;
    public boolean n;
    public boolean o = true;
    public boolean p = true;
    public Float q;
    public int r;
    public final VideoSeekBar s;
    public final ViewGroup t;
    public final TextView u;
    public final TextView v;
    public final ScrollSwitchStateManager w;
    private final Handler z = new Handler(Looper.getMainLooper());

    public boolean a(Object obj) {
        l.d(obj, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.h
    public void b(boolean z2) {
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.h
    public void c() {
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(289, new g(b.class, "onVideoMaskEvent", ah.class, ThreadMode.POSTING, 0, false));
        hashMap.put(290, new g(b.class, "onFullFeedVideoChangeEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(291, new g(b.class, "onPlayerControllerVideoPlayProgressChange", com.ss.android.ugc.aweme.feed.ui.seekbar.e.class, ThreadMode.POSTING, 0, false));
        hashMap.put(292, new g(b.class, "onPlayerControllerVideoStatusEvent", f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(293, new g(b.class, "onRenderFirstFrame", com.ss.android.ugc.aweme.feed.ui.seekbar.d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(294, new g(b.class, "onFullFeedFragmentPageStateChangeEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(295, new g(b.class, "onVideoProgressVolumeKeyEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.h.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60262);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f95074a;

        static {
            Covode.recordClassIndex(60266);
        }

        e(b bVar) {
            this.f95074a = bVar;
        }

        public final void run() {
            this.f95074a.s.setSeekBarShowType(0);
        }
    }

    static {
        Covode.recordClassIndex(60261);
    }

    static final class d extends m implements h.f.a.a<Float> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(60265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(n.b(this.this$0.s.getContext(), 12.0f) / ((float) n.a(this.this$0.s.getContext())));
        }
    }

    private final void d() {
        if (!this.n) {
            Context context = this.s.getContext();
            if (!(context instanceof androidx.fragment.app.e)) {
                context = null;
            }
            androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
            if (eVar != null) {
                this.n = true;
                ScrollSwitchStateManager scrollSwitchStateManager = this.w;
                if (scrollSwitchStateManager != null) {
                    scrollSwitchStateManager.c(eVar, new C2287b(this));
                }
                ScrollSwitchStateManager scrollSwitchStateManager2 = this.w;
                if (scrollSwitchStateManager2 != null) {
                    scrollSwitchStateManager2.f(eVar, new c(this));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.a.h
    public final void b() {
        EventBus.a().b(this);
        this.f95068j = null;
        this.z.removeCallbacks(this.B);
    }

    public final void a() {
        int i2;
        Video video;
        d();
        this.s.setProgress(0.0f);
        if (!a(this.f95059a)) {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
            com.ss.android.ugc.aweme.framework.a.a.a(2, x, "do not show progressbar");
            return;
        }
        this.s.setAlpha(1.0f);
        this.s.setVisibility(0);
        com.ss.android.ugc.aweme.framework.a.a.a(2, x, "progressbar can drag");
        this.t.setVisibility(8);
        Aweme aweme = this.f95059a;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            i2 = 0;
        } else {
            i2 = video.getDuration();
        }
        this.f95062d = com.ss.android.ugc.aweme.bo.a.a(i2);
        this.s.a(0.0f);
        this.v.setText(com.ss.android.ugc.aweme.bo.a.f68737a.a(this.f95062d, false));
        this.u.setText(com.ss.android.ugc.aweme.bo.a.f68737a.a(0, false));
        this.s.setSeekBarShowType(0);
    }

    private final boolean a(Aweme aweme) {
        if (1 != this.f95060b || !c.b(aweme) || !b(aweme) || !c.a(aweme) || com.ss.android.ugc.aweme.story.d.a.g(aweme)) {
            return false;
        }
        return true;
    }

    private final boolean b(Aweme aweme) {
        String str;
        Aweme aweme2 = this.f95061c;
        String str2 = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        }
        return com.bytedance.common.utility.m.a(str, str2);
    }

    private final void c(boolean z2) {
        al alVar;
        VerticalViewPager aQ;
        if (this.w != null && (alVar = this.f95068j) != null && (aQ = alVar.aQ()) != null) {
            aQ.setCanTouch(z2);
        }
    }

    @r
    public final void onFullFeedFragmentPageStateChangeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.c cVar) {
        l.d(cVar, "");
        if (a(cVar) && a(cVar.f95085a)) {
            a(cVar.f95085a, cVar.f95086b, true);
        }
    }

    @r
    public final void onRenderFirstFrame(com.ss.android.ugc.aweme.feed.ui.seekbar.d dVar) {
        l.d(dVar, "");
        if (a(dVar)) {
            this.f95061c = dVar.f95095a;
            a();
        }
    }

    @r
    public final void onVideoMaskEvent(ah ahVar) {
        String str;
        l.d(ahVar, "");
        String str2 = ahVar.f93464b;
        Aweme aweme = this.f95059a;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (l.a((Object) str2, (Object) str)) {
            a(ahVar.f93463a);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void a(SeekBar seekBar) {
        al alVar;
        this.f95063e = true;
        if (this.f95066h == 1 && (alVar = this.f95068j) != null) {
            alVar.au();
        }
        if (seekBar != null) {
            this.f95071m = seekBar.getProgress();
        }
    }

    @r
    public final void onFullFeedVideoChangeEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.a aVar) {
        String str = "";
        l.d(aVar, str);
        if (a(aVar)) {
            this.f95059a = aVar.f95051a;
            String str2 = aVar.f95052b;
            if (str2 != null) {
                str = str2;
            }
            this.f95069k = str;
            this.f95070l = aVar.f95053c;
            this.f95068j = aVar.f95054d;
            this.f95066h = 0;
            if (!this.o) {
                this.p = false;
            }
            a();
        }
    }

    @r
    public final void onPlayerControllerVideoStatusEvent(f fVar) {
        l.d(fVar, "");
        if (a(fVar) && a(fVar.f95106a)) {
            int i2 = fVar.f95109d;
            if (i2 == 1) {
                this.f95066h = 1;
                this.r = 0;
                this.s.setPauseStatus(true);
                this.s.setSeekBarShowType(1);
            } else if (i2 == 2) {
                this.f95066h = 2;
                this.s.setPauseStatus(false);
                if (this.o) {
                    this.s.setSeekBarShowType(0);
                }
            }
        }
    }

    @r
    public final void onVideoProgressVolumeKeyEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.h hVar) {
        l.d(hVar, "");
        if (a(hVar) && a(hVar.f95115b) && this.o) {
            if (hVar.f95114a) {
                this.s.setVisibility(4);
            } else {
                this.s.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.a.b$b  reason: collision with other inner class name */
    public static final class C2287b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f95072a;

        static {
            Covode.recordClassIndex(60263);
        }

        C2287b(b bVar) {
            this.f95072a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.base.ui.e b2;
            VerticalViewPager aQ;
            Integer num = (Integer) obj;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f95072a.w;
            if (!scrollSwitchStateManager.f99139a.f99152a) {
                b2 = null;
            } else {
                b2 = scrollSwitchStateManager.b(scrollSwitchStateManager.f99139a.getValue().intValue());
            }
            if (b2 instanceof am) {
                b bVar = this.f95072a;
                Aweme aweme = bVar.f95059a;
                l.b(num, "");
                bVar.a(aweme, num.intValue(), true);
            }
            al alVar = this.f95072a.f95068j;
            if (alVar != null && (aQ = alVar.aQ()) != null) {
                aQ.setCanTouch(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f95073a;

        static {
            Covode.recordClassIndex(60264);
        }

        c(b bVar) {
            this.f95073a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Fragment fragment;
            boolean z;
            al alVar;
            VerticalViewPager aQ;
            Integer num = (Integer) obj;
            WeakReference<Fragment> weakReference = this.f95073a.w.f99149k;
            if (weakReference != null) {
                fragment = weakReference.get();
            } else {
                fragment = null;
            }
            if (fragment instanceof com.ss.android.ugc.aweme.main.i) {
                com.ss.android.ugc.aweme.main.i iVar = (com.ss.android.ugc.aweme.main.i) fragment;
                if (l.a((Object) "FeedFollowFragment", (Object) iVar.w()) || l.a((Object) "FeedRecommendFragment", (Object) iVar.w()) || l.a((Object) "FeedLearnFragment", (Object) iVar.w())) {
                    z = true;
                    b bVar = this.f95073a;
                    Aweme aweme = bVar.f95059a;
                    l.b(num, "");
                    bVar.a(aweme, num.intValue(), z);
                    alVar = this.f95073a.f95068j;
                    if (alVar != null && (aQ = alVar.aQ()) != null) {
                        aQ.setCanTouch(true);
                        return;
                    }
                }
            }
            z = false;
            b bVar2 = this.f95073a;
            Aweme aweme2 = bVar2.f95059a;
            l.b(num, "");
            bVar2.a(aweme2, num.intValue(), z);
            alVar = this.f95073a.f95068j;
            if (alVar != null) {
            }
        }
    }

    @r
    public final void onPlayerControllerVideoPlayProgressChange(com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar) {
        l.d(eVar, "");
        if (a(eVar) && a(eVar.f95100a) && !this.f95063e) {
            if (this.f95066h == 1) {
                int i2 = this.r + 1;
                this.r = i2;
                if (i2 > 3) {
                    this.r = 0;
                    this.s.setSeekBarShowType(0);
                }
            }
            if (this.f95067i == 0 || SystemClock.elapsedRealtime() > this.f95067i + 600) {
                this.s.a(eVar.f95103d);
                this.u.setText(com.ss.android.ugc.aweme.bo.a.f68737a.a(eVar.f95103d, this.f95062d));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.b
    public void a(MotionEvent motionEvent) {
        Integer valueOf;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                this.f95064f = false;
                this.q = Float.valueOf(motionEvent.getRawX());
            } else if (valueOf != null) {
                if (valueOf.intValue() == 2) {
                    Float f2 = this.q;
                    if (f2 != null && Math.abs(f2.floatValue() - motionEvent.getRawX()) > 10.0f) {
                        this.s.setSeekBarShowType(1);
                        if (c.b(this.f95059a) && this.t.getVisibility() != 0) {
                            this.t.setVisibility(0);
                            this.t.setAlpha(0.0f);
                            ViewPropertyAnimator animate = this.t.animate();
                            if (!(animate == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
                                duration.start();
                            }
                        }
                        this.o = false;
                        c(false);
                        this.f95064f = true;
                    }
                } else if (valueOf.intValue() == 1 || valueOf.intValue() == 3) {
                    this.o = true;
                    c(true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public void b(SeekBar seekBar) {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        al alVar;
        String str;
        this.f95067i = SystemClock.elapsedRealtime();
        int i2 = 0;
        this.f95063e = false;
        String str2 = null;
        if (this.f95064f || this.f95066h == 1) {
            this.f95064f = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                if (!this.p) {
                    this.p = true;
                } else {
                    v.O().a(((float) progress) / 100.0f);
                    if (this.f95071m < progress) {
                        str = "back";
                    } else {
                        str = "front";
                    }
                    if (this.f95066h == 1) {
                        i2 = 1;
                    }
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f95069k).a("impr_type", ac.j(this.f95059a)).a("action_type", str).a("is_pause", i2).a("author_id", ac.a(this.f95059a)).a("page_type", this.f95070l).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(this.f95059a)));
                    Aweme aweme = this.f95059a;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    }
                    com.ss.android.ugc.aweme.common.r.a("click_progress_bar", a2.a("group_id", str2).f66730a);
                }
            }
        }
        if (this.f95066h == 1 && (alVar = this.f95068j) != null) {
            alVar.o(alVar.aD());
        }
        this.t.setAlpha(1.0f);
        ViewPropertyAnimator animate = this.t.animate();
        if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
            duration.start();
        }
        this.t.setVisibility(8);
        this.z.removeCallbacks(this.B);
        this.z.postDelayed(this.B, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z2) {
        if (z2) {
            VideoSeekBar videoSeekBar = this.s;
            com.bytedance.ies.dmt.ui.f.d.a(videoSeekBar, videoSeekBar.getAlpha(), 0.0f);
            return;
        }
        com.bytedance.ies.dmt.ui.f.d.a(this.s, 0.0f, 1.0f);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
    public final void a(SeekBar seekBar, int i2, boolean z2) {
        this.u.setText(com.ss.android.ugc.aweme.bo.a.f68737a.a(((float) i2) / 100.0f, this.f95062d));
    }

    public final void a(Aweme aweme, int i2, boolean z2) {
        if (!a(aweme) || !z2) {
            this.s.setVisibility(4);
            return;
        }
        if (i2 == 0) {
            this.s.setVisibility(0);
            this.f95066h = 2;
            if (this.f95063e) {
                this.t.setVisibility(0);
                return;
            }
        } else {
            this.s.setVisibility(4);
        }
        this.t.setVisibility(8);
    }

    public b(VideoSeekBar videoSeekBar, ViewGroup viewGroup, TextView textView, TextView textView2, ScrollSwitchStateManager scrollSwitchStateManager) {
        l.d(videoSeekBar, "");
        l.d(viewGroup, "");
        l.d(textView, "");
        l.d(textView2, "");
        this.s = videoSeekBar;
        this.t = viewGroup;
        this.u = textView;
        this.v = textView2;
        this.w = scrollSwitchStateManager;
        String b2 = ab.a(getClass()).b();
        x = b2 == null ? "CommonControl" : b2;
        videoSeekBar.setVisibility(8);
        viewGroup.setVisibility(8);
        videoSeekBar.setOnSeekBarChangeListener(this);
        videoSeekBar.setOnDispatchTouchEventListener(this);
        textView2.setAlpha(0.75f);
        EventBus.a(EventBus.a(), this);
        this.B = new e(this);
    }
}
