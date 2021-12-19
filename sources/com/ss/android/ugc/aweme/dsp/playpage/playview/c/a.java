package com.ss.android.ugc.aweme.dsp.playpage.playview.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.playerservice.a.j;
import com.ss.android.ugc.aweme.dsp.playerservice.c.f;
import com.ss.android.ugc.aweme.dsp.playerservice.c.g;
import com.ss.android.ugc.aweme.feed.ui.seekbar.MutableSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends FrameLayout implements j {

    /* renamed from: k  reason: collision with root package name */
    public static final C1998a f83851k = new C1998a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.base.b f83852a;

    /* renamed from: b  reason: collision with root package name */
    public VideoSeekBar f83853b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f83854c;

    /* renamed from: d  reason: collision with root package name */
    public TuxTextView f83855d;

    /* renamed from: e  reason: collision with root package name */
    public long f83856e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f83857f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f83858g;

    /* renamed from: h  reason: collision with root package name */
    public Float f83859h;

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f83860i;

    /* renamed from: j  reason: collision with root package name */
    public VideoSeekBar.c f83861j;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.b.c f83862l;

    /* renamed from: m  reason: collision with root package name */
    private MutableSeekBar f83863m;
    private LineProgressBar n;
    private TuxTextView o;
    private final h p;
    private final h q;

    static {
        Covode.recordClassIndex(52290);
    }

    private final b.AnonymousClass1 getMInnerSeekBarChangeListener() {
        return (b.AnonymousClass1) this.p.getValue();
    }

    private final c.AnonymousClass1 getMOnDispatchTouchEventListener() {
        return (c.AnonymousClass1) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(float f2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void b(long j2) {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void c() {
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void d() {
    }

    public final void setPageIndex(int i2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.playview.c.a$a  reason: collision with other inner class name */
    public static final class C1998a {
        static {
            Covode.recordClassIndex(52291);
        }

        private C1998a() {
        }

        public /* synthetic */ C1998a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void bd_() {
        e();
    }

    public final VideoSeekBar getVideoSeekBar() {
        return this.f83853b;
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new VideoSeekBar.c(this) {
                /* class com.ss.android.ugc.aweme.dsp.playpage.playview.c.a.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f83864a;

                static {
                    Covode.recordClassIndex(52293);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83864a = r1;
                }

                @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
                public final void a(SeekBar seekBar) {
                    this.f83864a.this$0.f83857f = true;
                    VideoSeekBar.c cVar = this.f83864a.this$0.f83861j;
                    if (cVar != null) {
                        cVar.a(seekBar);
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
                public final void b(SeekBar seekBar) {
                    int i2;
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator duration;
                    com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
                    f e2;
                    com.ss.android.ugc.aweme.dsp.playpage.base.b bVar;
                    com.ss.android.ugc.aweme.dsp.playerservice.f.a a3;
                    com.ss.android.ugc.aweme.dsp.playerservice.f.a a4;
                    if (this.f83864a.this$0.f83857f && this.f83864a.this$0.f83858g) {
                        if (seekBar != null) {
                            i2 = seekBar.getProgress();
                        } else {
                            i2 = 0;
                        }
                        int b2 = com.ss.android.ugc.aweme.bo.a.b(((float) i2) / 100.0f, (int) this.f83864a.this$0.f83856e);
                        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar2 = this.f83864a.this$0.f83852a;
                        if (!(bVar2 == null || (a4 = bVar2.a()) == null)) {
                            a4.c((long) b2);
                        }
                        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar3 = this.f83864a.this$0.f83852a;
                        if (!(bVar3 == null || (a2 = bVar3.a()) == null || (e2 = a2.f83565a.e()) == null || !e2.isPauseState() || (bVar = this.f83864a.this$0.f83852a) == null || (a3 = bVar.a()) == null)) {
                            a3.g(new com.ss.android.ugc.aweme.dsp.playerservice.b.f("RESUME_FROM_SEEK"));
                        }
                        a aVar = this.f83864a.this$0;
                        LinearLayout linearLayout = aVar.f83854c;
                        if (linearLayout == null || linearLayout.getVisibility() != 8) {
                            LinearLayout linearLayout2 = aVar.f83854c;
                            if (linearLayout2 != null) {
                                linearLayout2.setAlpha(1.0f);
                            }
                            LinearLayout linearLayout3 = aVar.f83854c;
                            if (!(linearLayout3 == null || (animate = linearLayout3.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
                                duration.start();
                            }
                            LinearLayout linearLayout4 = aVar.f83854c;
                            if (linearLayout4 != null) {
                                linearLayout4.setVisibility(8);
                            }
                        }
                        this.f83864a.this$0.removeCallbacks(this.f83864a.this$0.f83860i);
                        this.f83864a.this$0.postDelayed(this.f83864a.this$0.f83860i, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                    }
                    this.f83864a.this$0.f83857f = false;
                    this.f83864a.this$0.f83858g = false;
                    VideoSeekBar.c cVar = this.f83864a.this$0.f83861j;
                    if (cVar != null) {
                        cVar.b(seekBar);
                    }
                }

                @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.c
                public final void a(SeekBar seekBar, int i2, boolean z) {
                    TuxTextView tuxTextView = this.f83864a.this$0.f83855d;
                    if (tuxTextView != null) {
                        tuxTextView.setText(com.ss.android.ugc.aweme.bo.a.f68737a.a(((float) i2) / 100.0f, ((int) this.f83864a.this$0.f83856e) / 1000));
                    }
                    VideoSeekBar.c cVar = this.f83864a.this$0.f83861j;
                    if (cVar != null) {
                        cVar.a(seekBar, i2, z);
                    }
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new VideoSeekBar.b(this) {
                /* class com.ss.android.ugc.aweme.dsp.playpage.playview.c.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f83865a;

                static {
                    Covode.recordClassIndex(52295);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83865a = r1;
                }

                @Override // com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar.b
                public final void a(MotionEvent motionEvent) {
                    Integer valueOf;
                    ViewPropertyAnimator animate;
                    ViewPropertyAnimator alpha;
                    ViewPropertyAnimator duration;
                    if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                        if (valueOf.intValue() == 0) {
                            this.f83865a.this$0.f83858g = false;
                            this.f83865a.this$0.f83859h = Float.valueOf(motionEvent.getRawX());
                        } else if (valueOf != null) {
                            if (valueOf.intValue() == 2) {
                                Float f2 = this.f83865a.this$0.f83859h;
                                if (f2 != null && Math.abs(f2.floatValue() - motionEvent.getRawX()) > 10.0f) {
                                    VideoSeekBar videoSeekBar = this.f83865a.this$0.f83853b;
                                    if (videoSeekBar != null) {
                                        videoSeekBar.setSeekBarShowType(1);
                                    }
                                    a aVar = this.f83865a.this$0;
                                    LinearLayout linearLayout = aVar.f83854c;
                                    if (linearLayout == null || linearLayout.getVisibility() != 0) {
                                        LinearLayout linearLayout2 = aVar.f83854c;
                                        if (linearLayout2 != null) {
                                            linearLayout2.setVisibility(0);
                                        }
                                        LinearLayout linearLayout3 = aVar.f83854c;
                                        if (linearLayout3 != null) {
                                            linearLayout3.setAlpha(0.0f);
                                        }
                                        LinearLayout linearLayout4 = aVar.f83854c;
                                        if (!(linearLayout4 == null || (animate = linearLayout4.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(200)) == null)) {
                                            duration.start();
                                        }
                                    }
                                    this.f83865a.this$0.f83858g = true;
                                }
                            } else if (valueOf.intValue() != 1) {
                                valueOf.intValue();
                            }
                        }
                    }
                }
            };
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83866a;

        static {
            Covode.recordClassIndex(52296);
        }

        d(a aVar) {
            this.f83866a = aVar;
        }

        public final void run() {
            VideoSeekBar videoSeekBar = this.f83866a.f83853b;
            if (videoSeekBar != null) {
                videoSeekBar.setSeekBarShowType(0);
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83867a;

        static {
            Covode.recordClassIndex(52297);
        }

        e(a aVar) {
            this.f83867a = aVar;
        }

        public final void run() {
            VideoSeekBar videoSeekBar = this.f83867a.f83853b;
            if (videoSeekBar != null) {
                videoSeekBar.setVisibility(0);
            }
        }
    }

    private void e() {
        VideoSeekBar videoSeekBar = this.f83853b;
        if (videoSeekBar != null) {
            videoSeekBar.setVisibility(8);
        }
        LineProgressBar lineProgressBar = this.n;
        if (lineProgressBar != null) {
            lineProgressBar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void be_() {
        LineProgressBar lineProgressBar = this.n;
        if (lineProgressBar != null) {
            lineProgressBar.b();
        }
        postDelayed(new e(this), 300);
        f();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83852a;
        if (!(bVar == null || (a2 = bVar.a()) == null)) {
            a2.b(this);
        }
        this.f83852a = null;
        super.onDetachedFromWindow();
    }

    private final void f() {
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        boolean z;
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83852a;
        if (bVar != null && (a2 = bVar.a()) != null) {
            long g2 = a2.f83565a.g();
            this.f83856e = g2;
            int i2 = (int) (g2 / 1000);
            TuxTextView tuxTextView = this.o;
            if (tuxTextView != null) {
                com.ss.android.ugc.aweme.bo.a aVar = com.ss.android.ugc.aweme.bo.a.f68737a;
                if (i2 > 3600) {
                    z = true;
                } else {
                    z = false;
                }
                tuxTextView.setText(aVar.a(i2, z));
            }
        }
    }

    public final void setData(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        this.f83862l = cVar;
        e();
    }

    public final void setOnSeekBarChangeListener(VideoSeekBar.c cVar) {
        l.d(cVar, "");
        this.f83861j = cVar;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.a aVar) {
        l.d(aVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(long j2) {
        VideoSeekBar videoSeekBar = this.f83853b;
        if (videoSeekBar != null) {
            videoSeekBar.setVisibility(0);
        }
        LineProgressBar lineProgressBar = this.n;
        if (lineProgressBar != null) {
            lineProgressBar.setVisibility(4);
        }
        if (!this.f83857f) {
            int a2 = h.g.a.a((((float) j2) * 100.0f) / ((float) this.f83856e));
            VideoSeekBar videoSeekBar2 = this.f83853b;
            if (videoSeekBar2 != null) {
                videoSeekBar2.setProgress((float) a2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.c.b bVar) {
        LineProgressBar lineProgressBar;
        l.d(bVar, "");
        int i2 = b.f83868a[bVar.ordinal()];
        if (i2 == 1) {
            LineProgressBar lineProgressBar2 = this.n;
            if (lineProgressBar2 != null) {
                lineProgressBar2.setVisibility(4);
            }
        } else if ((i2 == 2 || i2 == 3) && (lineProgressBar = this.n) != null) {
            lineProgressBar.setVisibility(0);
        }
    }

    public final void setPlayPage(com.ss.android.ugc.aweme.dsp.playpage.base.b bVar) {
        com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        f e2;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a3;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a4;
        l.d(bVar, "");
        this.f83852a = bVar;
        if (!(bVar == null || (a4 = bVar.a()) == null)) {
            a4.a(this);
        }
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar2 = this.f83852a;
        if (bVar2 == null || (a3 = bVar2.a()) == null) {
            cVar = null;
        } else {
            cVar = a3.f83565a.n();
        }
        if (cVar != null) {
            f();
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        com.ss.android.ugc.aweme.dsp.playpage.base.b bVar3 = this.f83852a;
        if (bVar3 == null || (a2 = bVar3.a()) == null || (e2 = a2.f83565a.e()) == null || !e2.isStopState()) {
            VideoSeekBar videoSeekBar = this.f83853b;
            if (videoSeekBar != null) {
                videoSeekBar.setVisibility(0);
                return;
            }
            return;
        }
        VideoSeekBar videoSeekBar2 = this.f83853b;
        if (videoSeekBar2 != null) {
            videoSeekBar2.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MutableSeekBar mutableSeekBar = null;
        MethodCollector.i(1533);
        this.f83860i = new d(this);
        this.p = i.a((h.f.a.a) new b(this));
        this.q = i.a((h.f.a.a) new c(this));
        com.a.a(LayoutInflater.from(context), R.layout.am_, this, true);
        VideoSeekBar videoSeekBar = (VideoSeekBar) findViewById(R.id.cqd);
        if (videoSeekBar != null) {
            videoSeekBar.setOnSeekBarChangeListener(getMInnerSeekBarChangeListener());
            videoSeekBar.setOnDispatchTouchEventListener(getMOnDispatchTouchEventListener());
            videoSeekBar.setSeekBarShowType(0);
        } else {
            videoSeekBar = null;
        }
        this.f83853b = videoSeekBar;
        this.f83863m = videoSeekBar != null ? videoSeekBar.getMutableSeekBar() : mutableSeekBar;
        this.f83854c = (LinearLayout) findViewById(R.id.cqf);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.cqg);
        tuxTextView.setAlpha(0.75f);
        tuxTextView.a(32.0f);
        this.o = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.cq1);
        tuxTextView2.a(32.0f);
        this.f83855d = tuxTextView2;
        ((TuxTextView) findViewById(R.id.cq0)).setText("/");
        this.n = (LineProgressBar) findViewById(R.id.cq2);
        MethodCollector.o(1533);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(f fVar) {
        l.d(fVar, "");
        if (!this.f83857f) {
            if (fVar.isPauseState()) {
                removeCallbacks(this.f83860i);
                VideoSeekBar videoSeekBar = this.f83853b;
                if (videoSeekBar != null) {
                    videoSeekBar.setSeekBarShowType(1);
                }
            } else if (fVar.isStopState()) {
                VideoSeekBar videoSeekBar2 = this.f83853b;
                if (videoSeekBar2 != null) {
                    videoSeekBar2.setProgress(0.0f);
                }
                VideoSeekBar videoSeekBar3 = this.f83853b;
                if (videoSeekBar3 != null) {
                    videoSeekBar3.setSeekBarShowType(0);
                }
            } else {
                VideoSeekBar videoSeekBar4 = this.f83853b;
                if (videoSeekBar4 != null) {
                    videoSeekBar4.setSeekBarShowType(0);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.j
    public final void a(g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
