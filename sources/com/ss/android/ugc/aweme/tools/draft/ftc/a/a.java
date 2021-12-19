package com.ss.android.ugc.aweme.tools.draft.ftc.a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.m;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.dg;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.FTCPreviewSurfaceView;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.f;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.g;
import com.ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout;
import com.ss.android.ugc.aweme.views.AlwaysMarqueeTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.model.a f139522a;

    /* renamed from: b  reason: collision with root package name */
    public final List<VideoPublishEditModel> f139523b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, C3682a> f139524c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private boolean f139525d = true;

    /* renamed from: e  reason: collision with root package name */
    private final Context f139526e;

    /* renamed from: f  reason: collision with root package name */
    private final m f139527f;

    /* renamed from: g  reason: collision with root package name */
    private final b<f, z> f139528g;

    static {
        Covode.recordClassIndex(91226);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return view == obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a  reason: collision with other inner class name */
    public static final class C3682a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f139529a = true;

        /* renamed from: b  reason: collision with root package name */
        public dmt.av.video.z f139530b;

        /* renamed from: c  reason: collision with root package name */
        public long f139531c;

        /* renamed from: d  reason: collision with root package name */
        final AvatarImageView f139532d;

        /* renamed from: e  reason: collision with root package name */
        final ImageView f139533e;

        /* renamed from: f  reason: collision with root package name */
        public final AlwaysMarqueeTextView f139534f;

        /* renamed from: g  reason: collision with root package name */
        final SmartCircleImageView f139535g;

        /* renamed from: h  reason: collision with root package name */
        public final FrameLayout f139536h;

        /* renamed from: i  reason: collision with root package name */
        final TuxTextView f139537i;

        /* renamed from: j  reason: collision with root package name */
        final TuxTextView f139538j;

        /* renamed from: k  reason: collision with root package name */
        public final FrameLayout f139539k;

        /* renamed from: l  reason: collision with root package name */
        final View f139540l;

        /* renamed from: m  reason: collision with root package name */
        public final VideoPublishEditModel f139541m;
        final com.ss.android.ugc.aweme.account.model.a n;
        public final h.f.a.b<f, z> o;
        private final Handler p = new Handler(Looper.getMainLooper());
        private boolean q;
        private ValueAnimator r;
        private FTCPreviewSurfaceView s;
        private final PeriscopeLayout t;
        private final m u;

        static {
            Covode.recordClassIndex(91227);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a$b */
        public static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3682a f139544a;

            static {
                Covode.recordClassIndex(91230);
            }

            b(C3682a aVar) {
                this.f139544a = aVar;
            }

            public final void run() {
                this.f139544a.f139534f.requestFocus();
            }
        }

        public final dmt.av.video.z a() {
            dmt.av.video.z zVar = this.f139530b;
            if (zVar == null) {
                l.a("mPresenter");
            }
            return zVar;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!this.q) {
                this.q = true;
                c();
                this.t.a();
            }
        }

        private final void c() {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.end();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                ofFloat.setDuration(8000L);
                ofFloat.setRepeatMode(1);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new c(this));
                this.r = ofFloat;
            }
            ValueAnimator valueAnimator2 = this.r;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3683a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3682a f139543a;

            static {
                Covode.recordClassIndex(91229);
            }

            View$OnClickListenerC3683a(C3682a aVar) {
                this.f139543a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f139543a.o.invoke(new f.a(this.f139543a.f139541m));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a$c */
        public static final class c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3682a f139545a;

            static {
                Covode.recordClassIndex(91231);
            }

            c(C3682a aVar) {
                this.f139545a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f139545a.f139531c > 64) {
                    this.f139545a.f139531c = currentTimeMillis;
                    FrameLayout frameLayout = this.f139545a.f139536h;
                    l.b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    frameLayout.setRotation(((Float) animatedValue).floatValue());
                }
            }
        }

        private final void a(VideoPublishEditModel videoPublishEditModel) {
            this.f139530b = new dmt.av.video.z(videoPublishEditModel.videoEditorType, "KidsDraft");
            Context context = this.f139540l.getContext();
            l.b(context, "");
            m mVar = this.u;
            FTCPreviewSurfaceView fTCPreviewSurfaceView = this.s;
            dmt.av.video.z zVar = this.f139530b;
            if (zVar == null) {
                l.a("mPresenter");
            }
            g.a(context, mVar, fTCPreviewSurfaceView, zVar, videoPublishEditModel);
            FTCPreviewSurfaceView fTCPreviewSurfaceView2 = this.s;
            int intValue = g.a(this.f139541m).getFirst().intValue();
            int intValue2 = g.a(this.f139541m).getSecond().intValue();
            if (fTCPreviewSurfaceView2 != null) {
                Context context2 = fTCPreviewSurfaceView2.getContext();
                int e2 = dh.e(context2);
                int b2 = dh.b(context2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                int d2 = dh.d(context2);
                if (d2 != com.ss.android.ugc.aweme.adaptation.a.f66177a.b()) {
                    com.ss.android.ugc.aweme.adaptation.a.f66177a.a(d2);
                }
                if (e2 * 9 > b2 * 16) {
                    e2 = com.ss.android.ugc.aweme.adaptation.a.f66177a.b(com.ss.android.ugc.aweme.adaptation.a.c());
                }
                if (dg.a(intValue, intValue2)) {
                    layoutParams.width = (intValue * e2) / intValue2;
                    layoutParams.height = e2;
                    layoutParams.topMargin = 0;
                    layoutParams.leftMargin = (b2 - layoutParams.width) / 2;
                } else {
                    layoutParams.width = b2;
                    layoutParams.height = (intValue2 * b2) / intValue;
                    layoutParams.topMargin = ((e2 - layoutParams.height) / 2) + 0;
                    layoutParams.leftMargin = 0;
                }
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(layoutParams.leftMargin);
                fTCPreviewSurfaceView2.setLayoutParams(layoutParams);
            }
        }

        public final void a(boolean z) {
            if (z) {
                dmt.av.video.z zVar = this.f139530b;
                if (zVar == null) {
                    l.a("mPresenter");
                }
                zVar.e();
                b();
                this.p.post(new b(this));
                r.a("video_play", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "personal_homepage").a("group_id", this.f139541m.creationId).a("author_id", this.n.c()).a());
            } else {
                if (this.q) {
                    this.q = false;
                    ValueAnimator valueAnimator = this.r;
                    if (valueAnimator != null) {
                        valueAnimator.end();
                    }
                    PeriscopeLayout periscopeLayout = this.t;
                    periscopeLayout.f139707k.removeCallbacksAndMessages(null);
                    periscopeLayout.f139707k.removeCallbacks(periscopeLayout.f139708l);
                    int childCount = periscopeLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        periscopeLayout.a(periscopeLayout.getChildAt(i2));
                    }
                }
                dmt.av.video.z zVar2 = this.f139530b;
                if (zVar2 == null) {
                    l.a("mPresenter");
                }
                zVar2.d();
            }
            this.f139529a = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.tools.draft.ftc.util.f, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3682a(View view, m mVar, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.account.model.a aVar, h.f.a.b<? super f, z> bVar) {
            l.d(view, "");
            l.d(mVar, "");
            l.d(videoPublishEditModel, "");
            l.d(aVar, "");
            l.d(bVar, "");
            this.f139540l = view;
            this.u = mVar;
            this.f139541m = videoPublishEditModel;
            this.n = aVar;
            this.o = bVar;
            View findViewById = view.findViewById(R.id.d8k);
            l.b(findViewById, "");
            this.s = (FTCPreviewSurfaceView) findViewById;
            View findViewById2 = view.findViewById(R.id.b1a);
            l.b(findViewById2, "");
            this.f139532d = (AvatarImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.b1b);
            l.b(findViewById3, "");
            this.f139533e = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.f32);
            l.b(findViewById4, "");
            this.f139534f = (AlwaysMarqueeTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.b1d);
            l.b(findViewById5, "");
            this.f139535g = (SmartCircleImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.cpu);
            l.b(findViewById6, "");
            this.f139536h = (FrameLayout) findViewById6;
            View findViewById7 = view.findViewById(R.id.cwj);
            l.b(findViewById7, "");
            this.t = (PeriscopeLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.f_d);
            l.b(findViewById8, "");
            this.f139537i = (TuxTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.eyc);
            l.b(findViewById9, "");
            this.f139538j = (TuxTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.b18);
            l.b(findViewById10, "");
            this.f139539k = (FrameLayout) findViewById10;
            a(videoPublishEditModel);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tools.draft.ftc.a.a.C3682a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C3682a f139542a;

                static {
                    Covode.recordClassIndex(91228);
                }

                {
                    this.f139542a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C3682a aVar = this.f139542a;
                    aVar.a(!aVar.f139529a);
                }
            });
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f139523b.size();
    }

    public final C3682a a(int i2) {
        return this.f139524c.get(Integer.valueOf(i2));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        String str;
        String str2;
        MethodCollector.i(1032);
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(this.f139526e), R.layout.adq, viewGroup, false);
        viewGroup.addView(a2);
        if (!this.f139524c.containsKey(Integer.valueOf(i2))) {
            l.b(a2, "");
            m mVar = this.f139527f;
            VideoPublishEditModel videoPublishEditModel = this.f139523b.get(i2);
            com.ss.android.ugc.aweme.account.model.a aVar = this.f139522a;
            if (aVar == null) {
                l.a("userData");
            }
            this.f139524c.put(Integer.valueOf(i2), new C3682a(a2, mVar, videoPublishEditModel, aVar, this.f139528g));
        }
        C3682a aVar2 = this.f139524c.get(Integer.valueOf(i2));
        if (aVar2 != null) {
            boolean z = this.f139525d;
            aVar2.f139533e.setOnClickListener(new C3682a.View$OnClickListenerC3683a(aVar2));
            AlwaysMarqueeTextView alwaysMarqueeTextView = aVar2.f139534f;
            VideoPublishEditModel videoPublishEditModel2 = aVar2.f139541m;
            Context context = aVar2.f139540l.getContext();
            if (context == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.account.model.a aVar3 = aVar2.n;
            c originalRecordMusic = videoPublishEditModel2.getOriginalRecordMusic();
            if (originalRecordMusic == null || (str = originalRecordMusic.musicName) == null) {
                str = context.getResources().getString(R.string.dnk);
                l.b(str, "");
            }
            c originalRecordMusic2 = videoPublishEditModel2.getOriginalRecordMusic();
            UrlModel urlModel = null;
            if ((originalRecordMusic2 == null || (str2 = originalRecordMusic2.authorName) == null) && (aVar3 == null || (str2 = aVar3.a()) == null)) {
                str2 = "";
            }
            alwaysMarqueeTextView.setText(str + '-' + str2);
            c originalRecordMusic3 = aVar2.f139541m.getOriginalRecordMusic();
            if (originalRecordMusic3 != null) {
                urlModel = originalRecordMusic3.coverThumb;
            }
            v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).a(n.a(27.0d), n.a(27.0d));
            a3.K = true;
            a3.E = aVar2.f139535g;
            a3.c();
            aVar2.b();
            e.a(aVar2.f139532d, aVar2.n.g());
            aVar2.f139537i.setText("@" + aVar2.n.a());
            if (!TextUtils.isEmpty(aVar2.f139541m.title)) {
                aVar2.f139538j.setVisibility(0);
                aVar2.f139538j.setText(aVar2.f139541m.title);
            }
            if (!z) {
                dmt.av.video.z zVar = aVar2.f139530b;
                if (zVar == null) {
                    l.a("mPresenter");
                }
                zVar.d();
            }
        }
        this.f139525d = false;
        l.b(a2, "");
        MethodCollector.o(1032);
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.tools.draft.ftc.util.f, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, m mVar, b<? super f, z> bVar) {
        l.d(context, "");
        l.d(mVar, "");
        l.d(bVar, "");
        this.f139526e = context;
        this.f139527f = mVar;
        this.f139528g = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        dmt.av.video.z a2;
        MethodCollector.i(1034);
        l.d(viewGroup, "");
        l.d(obj, "");
        if (this.f139524c.containsKey(Integer.valueOf(i2))) {
            C3682a aVar = this.f139524c.get(Integer.valueOf(i2));
            if (!(aVar == null || (a2 = aVar.a()) == null)) {
                a2.b();
            }
            this.f139524c.remove(Integer.valueOf(i2));
        }
        viewGroup.removeView((View) obj);
        MethodCollector.o(1034);
    }
}
