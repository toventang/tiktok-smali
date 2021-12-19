package com.bytedance.android.live.liveinteract.match.ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.match.b.g.c;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MatchBonusTaskContainer extends RelativeLayout implements c.b {
    public static final a s = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f10886a;

    /* renamed from: b  reason: collision with root package name */
    public RelativeLayout f10887b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f10888c;

    /* renamed from: d  reason: collision with root package name */
    public TaskMarqueeTextView f10889d;

    /* renamed from: e  reason: collision with root package name */
    public ConstraintLayout f10890e;

    /* renamed from: f  reason: collision with root package name */
    public ProgressBar f10891f;

    /* renamed from: g  reason: collision with root package name */
    public LiveTextView f10892g;

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f10893h;

    /* renamed from: i  reason: collision with root package name */
    public TaskMarqueeTextView f10894i;

    /* renamed from: j  reason: collision with root package name */
    public LiveTextView f10895j;

    /* renamed from: k  reason: collision with root package name */
    public View f10896k;

    /* renamed from: l  reason: collision with root package name */
    public FrameLayout f10897l;

    /* renamed from: m  reason: collision with root package name */
    public HSAnimImageView f10898m;
    public DataChannel n;
    public com.bytedance.android.live.liveinteract.match.b.g.c o;
    public ObjectAnimator p;
    public boolean q;
    public boolean r;
    private ImageView t;
    private TaskMarqueeTextView u;
    private CardView v;
    private LiveAutoRtlImageView w;
    private boolean x;
    private final Handler y;

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f10903a = new c();

        static {
            Covode.recordClassIndex(5827);
        }

        c() {
        }

        public final void onClick(View view) {
        }
    }

    static {
        Covode.recordClassIndex(5824);
    }

    public MatchBonusTaskContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5825);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10921a;

        static {
            Covode.recordClassIndex(5835);
        }

        k(MatchBonusTaskContainer matchBonusTaskContainer) {
            this.f10921a = matchBonusTaskContainer;
        }

        public final void run() {
            this.f10921a.f();
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MatchBonusTaskContainer this$0;

        static {
            Covode.recordClassIndex(5842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(MatchBonusTaskContainer matchBonusTaskContainer) {
            super(0);
            this.this$0 = matchBonusTaskContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.e();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f10920b;

        static {
            Covode.recordClassIndex(5834);
        }

        j(MatchBonusTaskContainer matchBonusTaskContainer, View view) {
            this.f10919a = matchBonusTaskContainer;
            this.f10920b = view;
        }

        public final void run() {
            DataChannel dataChannel = this.f10919a.n;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.match.b.c.a.class, Integer.valueOf(this.f10920b.getMeasuredWidth()));
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MatchBonusTaskContainer this$0;

        static {
            Covode.recordClassIndex(5838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(MatchBonusTaskContainer matchBonusTaskContainer) {
            super(0);
            this.this$0 = matchBonusTaskContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((MatchBonusTaskContainer) null, (com.bytedance.android.livesdkapi.depend.model.live.a.f) y.a((int) R.string.efn), (String) MatchBonusTaskContainer.f(this.this$0), (TaskMarqueeTextView) MatchBonusTaskContainer.g(this.this$0), (ViewGroup) true);
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MatchBonusTaskContainer this$0;

        static {
            Covode.recordClassIndex(5840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(MatchBonusTaskContainer matchBonusTaskContainer) {
            super(0);
            this.this$0 = matchBonusTaskContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a((MatchBonusTaskContainer) null, (com.bytedance.android.livesdkapi.depend.model.live.a.f) y.a((int) R.string.efh), (String) MatchBonusTaskContainer.f(this.this$0), (TaskMarqueeTextView) MatchBonusTaskContainer.g(this.this$0), (ViewGroup) true);
            return z.f158842a;
        }
    }

    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.live.a.h f10908b;

        static {
            Covode.recordClassIndex(5830);
        }

        public f(MatchBonusTaskContainer matchBonusTaskContainer, com.bytedance.android.livesdkapi.depend.model.live.a.h hVar) {
            this.f10907a = matchBonusTaskContainer;
            this.f10908b = hVar;
        }

        public final void run() {
            com.bytedance.android.live.liveinteract.match.b.g.c a2 = MatchBonusTaskContainer.a(this.f10907a);
            com.bytedance.android.livesdkapi.depend.model.live.a.b bVar = this.f10908b.f23087a;
            if (bVar == null) {
                h.f.b.l.b();
            }
            a2.a(bVar);
            com.bytedance.android.live.liveinteract.match.b.g.c a3 = MatchBonusTaskContainer.a(this.f10907a);
            com.bytedance.android.livesdkapi.depend.model.live.a.c cVar = this.f10908b.f23088b;
            if (cVar == null) {
                h.f.b.l.b();
            }
            a3.a(cVar);
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10909a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f10910b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10911c;

        static {
            Covode.recordClassIndex(5831);
        }

        g(MatchBonusTaskContainer matchBonusTaskContainer, List list, int i2) {
            this.f10909a = matchBonusTaskContainer;
            this.f10910b = list;
            this.f10911c = i2;
        }

        public final void run() {
            if (this.f10909a.f10886a && MatchBonusTaskContainer.e(this.f10909a) != null && this.f10911c + 1 < this.f10910b.size()) {
                MatchBonusTaskContainer matchBonusTaskContainer = this.f10909a;
                com.bytedance.android.livesdkapi.depend.model.live.a.f fVar = ((com.bytedance.android.livesdkapi.depend.model.live.a.k) this.f10910b.get(this.f10911c + 1)).f23092b;
                TaskMarqueeTextView taskMarqueeTextView = this.f10909a.f10889d;
                if (taskMarqueeTextView == null) {
                    h.f.b.l.a("tvTaskNotice");
                }
                matchBonusTaskContainer.a((MatchBonusTaskContainer) fVar, (com.bytedance.android.livesdkapi.depend.model.live.a.f) null, (String) taskMarqueeTextView, (TaskMarqueeTextView) MatchBonusTaskContainer.e(this.f10909a), (ViewGroup) true);
            }
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10923a;

        static {
            Covode.recordClassIndex(5839);
        }

        n(MatchBonusTaskContainer matchBonusTaskContainer) {
            this.f10923a = matchBonusTaskContainer;
        }

        public final void run() {
            if (MatchBonusTaskContainer.g(this.f10923a) != null && MatchBonusTaskContainer.g(this.f10923a).getVisibility() == 0) {
                MatchBonusTaskContainer.g(this.f10923a).setVisibility(8);
                MatchBonusTaskContainer.b(this.f10923a).setVisibility(8);
            }
        }
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10924a;

        static {
            Covode.recordClassIndex(5841);
        }

        p(MatchBonusTaskContainer matchBonusTaskContainer) {
            this.f10924a = matchBonusTaskContainer;
        }

        public final void run() {
            if (this.f10924a.f10886a && MatchBonusTaskContainer.g(this.f10924a) != null && MatchBonusTaskContainer.a(this.f10924a) != null && MatchBonusTaskContainer.a(this.f10924a).f10786h == com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED) {
                MatchBonusTaskContainer matchBonusTaskContainer = this.f10924a;
                matchBonusTaskContainer.a((MatchBonusTaskContainer) MatchBonusTaskContainer.a(matchBonusTaskContainer).x, (com.bytedance.android.livesdkapi.depend.model.live.a.f) null, (String) MatchBonusTaskContainer.f(this.f10924a), (TaskMarqueeTextView) MatchBonusTaskContainer.g(this.f10924a), (ViewGroup) true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f10886a = false;
        ObjectAnimator objectAnimator = this.p;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            ObjectAnimator objectAnimator2 = this.p;
            if (objectAnimator2 == null) {
                h.f.b.l.b();
            }
            objectAnimator2.end();
            this.p = null;
        }
        this.y.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    static final class r extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ MatchBonusTaskContainer this$0;

        static {
            Covode.recordClassIndex(5843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(MatchBonusTaskContainer matchBonusTaskContainer) {
            super(0);
            this.this$0 = matchBonusTaskContainer;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            LiveTextView liveTextView = this.this$0.f10895j;
            if (liveTextView == null) {
                h.f.b.l.a("tvBonusCountDown");
            }
            liveTextView.setVisibility(8);
            View view = this.this$0.f10896k;
            if (view == null) {
                h.f.b.l.a("mDividerInBonus");
            }
            view.setVisibility(8);
            MatchBonusTaskContainer.g(this.this$0).setBackgroundResource(R.drawable.bt0);
            MatchBonusTaskContainer matchBonusTaskContainer = this.this$0;
            matchBonusTaskContainer.a((MatchBonusTaskContainer) MatchBonusTaskContainer.a(matchBonusTaskContainer).z, (com.bytedance.android.livesdkapi.depend.model.live.a.f) null, (String) MatchBonusTaskContainer.f(this.this$0), (TaskMarqueeTextView) MatchBonusTaskContainer.g(this.this$0), (ViewGroup) true);
            return z.f158842a;
        }
    }

    private final void g() {
        com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
        if (cVar == null) {
            h.f.b.l.a("mPresenter");
        }
        if (cVar.o == 0) {
            CardView cardView = this.v;
            if (cardView == null) {
                h.f.b.l.a("lnBonusWaveAnim");
            }
            cardView.setVisibility(8);
            LiveAutoRtlImageView liveAutoRtlImageView = this.w;
            if (liveAutoRtlImageView == null) {
                h.f.b.l.a("mWaveAnim");
            }
            liveAutoRtlImageView.setVisibility(8);
            return;
        }
        LiveAutoRtlImageView liveAutoRtlImageView2 = this.w;
        if (liveAutoRtlImageView2 == null) {
            h.f.b.l.a("mWaveAnim");
        }
        liveAutoRtlImageView2.setVisibility(0);
        CardView cardView2 = this.v;
        if (cardView2 == null) {
            h.f.b.l.a("lnBonusWaveAnim");
        }
        cardView2.setVisibility(0);
        CardView cardView3 = this.v;
        if (cardView3 == null) {
            h.f.b.l.a("lnBonusWaveAnim");
        }
        if (cardView3.getWidth() == 0) {
            CardView cardView4 = this.v;
            if (cardView4 == null) {
                h.f.b.l.a("lnBonusWaveAnim");
            }
            cardView4.post(new k(this));
            return;
        }
        f();
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.c.b
    public final void a() {
        if (this.f10886a) {
            ao.a(y.e(), y.a((int) R.string.efc), 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.c.b
    public final void b() {
        c();
        if (this.f10886a) {
            ProgressBar progressBar = this.f10891f;
            if (progressBar == null) {
                h.f.b.l.a("mTaskProgressBar");
            }
            int progress = progressBar.getProgress();
            com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
            if (cVar == null) {
                h.f.b.l.a("mPresenter");
            }
            if (progress != ((int) cVar.o) * 10) {
                int[] iArr = new int[2];
                ProgressBar progressBar2 = this.f10891f;
                if (progressBar2 == null) {
                    h.f.b.l.a("mTaskProgressBar");
                }
                iArr[0] = progressBar2.getProgress();
                com.bytedance.android.live.liveinteract.match.b.g.c cVar2 = this.o;
                if (cVar2 == null) {
                    h.f.b.l.a("mPresenter");
                }
                iArr[1] = ((int) cVar2.o) * 10;
                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                h.f.b.l.b(ofInt, "");
                ofInt.setDuration(100L);
                ofInt.addUpdateListener(new t(this));
                ofInt.addListener(new s(this));
                ofInt.start();
            }
        }
        d();
    }

    public final void d() {
        com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
        if (cVar == null) {
            h.f.b.l.a("mPresenter");
        }
        if (cVar.f10784f || this.q) {
            HSAnimImageView hSAnimImageView = this.f10898m;
            if (hSAnimImageView == null) {
                h.f.b.l.a("supportAnim");
            }
            hSAnimImageView.setVisibility(8);
            ConstraintLayout constraintLayout = this.f10890e;
            if (constraintLayout == null) {
                h.f.b.l.a("mTaskContainer");
            }
            constraintLayout.setOnClickListener(c.f10903a);
            return;
        }
        HSAnimImageView hSAnimImageView2 = this.f10898m;
        if (hSAnimImageView2 == null) {
            h.f.b.l.a("supportAnim");
        }
        hSAnimImageView2.setVisibility(0);
        HSAnimImageView hSAnimImageView3 = this.f10898m;
        if (hSAnimImageView3 == null) {
            h.f.b.l.a("supportAnim");
        }
        hSAnimImageView3.a();
        ConstraintLayout constraintLayout2 = this.f10890e;
        if (constraintLayout2 == null) {
            h.f.b.l.a("mTaskContainer");
        }
        constraintLayout2.setOnClickListener(new d(this));
    }

    public final void e() {
        if (this.f10886a) {
            com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
            if (cVar == null) {
                h.f.b.l.a("mPresenter");
            }
            if (cVar.f10786h.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.d.TASK_IN_PROCESS) >= 0) {
                com.bytedance.android.live.liveinteract.match.b.g.c cVar2 = this.o;
                if (cVar2 == null) {
                    h.f.b.l.a("mPresenter");
                }
                if (cVar2.f10786h != com.bytedance.android.live.liveinteract.match.b.b.d.TASK_FAILED) {
                    g();
                    return;
                }
            }
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                ObjectAnimator objectAnimator2 = this.p;
                if (objectAnimator2 == null) {
                    h.f.b.l.b();
                }
                objectAnimator2.end();
            }
            CardView cardView = this.v;
            if (cardView == null) {
                h.f.b.l.a("lnBonusWaveAnim");
            }
            cardView.setVisibility(8);
            LiveAutoRtlImageView liveAutoRtlImageView = this.w;
            if (liveAutoRtlImageView == null) {
                h.f.b.l.a("mWaveAnim");
            }
            liveAutoRtlImageView.setVisibility(8);
        }
    }

    public final void c() {
        com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
        if (cVar == null) {
            h.f.b.l.a("mPresenter");
        }
        if (cVar.f10791m == 0) {
            ImageView imageView = this.t;
            if (imageView == null) {
                h.f.b.l.a("ivSenderCount");
            }
            imageView.setVisibility(8);
            com.bytedance.android.live.liveinteract.match.b.g.c cVar2 = this.o;
            if (cVar2 == null) {
                h.f.b.l.a("mPresenter");
            }
            com.bytedance.android.livesdkapi.depend.model.live.a.f fVar = cVar2.w;
            TaskMarqueeTextView taskMarqueeTextView = this.u;
            if (taskMarqueeTextView == null) {
                h.f.b.l.a("tvTaskProgress");
            }
            ConstraintLayout constraintLayout = this.f10890e;
            if (constraintLayout == null) {
                h.f.b.l.a("mTaskContainer");
            }
            a(fVar, (String) null, taskMarqueeTextView, (ViewGroup) constraintLayout, false);
            return;
        }
        ImageView imageView2 = this.t;
        if (imageView2 == null) {
            h.f.b.l.a("ivSenderCount");
        }
        imageView2.setVisibility(0);
        TaskMarqueeTextView taskMarqueeTextView2 = this.u;
        if (taskMarqueeTextView2 == null) {
            h.f.b.l.a("tvTaskProgress");
        }
        StringBuilder sb = new StringBuilder();
        com.bytedance.android.live.liveinteract.match.b.g.c cVar3 = this.o;
        if (cVar3 == null) {
            h.f.b.l.a("mPresenter");
        }
        StringBuilder append = sb.append(cVar3.o).append('/');
        com.bytedance.android.live.liveinteract.match.b.g.c cVar4 = this.o;
        if (cVar4 == null) {
            h.f.b.l.a("mPresenter");
        }
        taskMarqueeTextView2.setText(append.append(cVar4.n).toString());
        ConstraintLayout constraintLayout2 = this.f10890e;
        if (constraintLayout2 == null) {
            h.f.b.l.a("mTaskContainer");
        }
        a(constraintLayout2, 0);
    }

    public final void f() {
        FrameLayout frameLayout = this.f10897l;
        if (frameLayout == null) {
            h.f.b.l.a("mBonusGroupView");
        }
        int width = frameLayout.getWidth();
        float f2 = -((float) y.a(67.0f));
        float f3 = (float) width;
        float a2 = (f3 * 1.0f) + ((float) y.a(67.0f)) + ((float) y.a(24.0f));
        if (width != 0) {
            int a3 = y.a(12.0f);
            if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
                f2 = (float) y.a(67.0f);
                a2 = ((-1.0f * f3) - ((float) y.a(67.0f))) - ((float) y.a(24.0f));
            }
            com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
            if (cVar == null) {
                h.f.b.l.a("mPresenter");
            }
            if (cVar.f10786h.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.d.TASK_SUCCEED) >= 0) {
                CardView cardView = this.v;
                if (cardView == null) {
                    h.f.b.l.a("lnBonusWaveAnim");
                }
                com.bytedance.android.livesdk.utils.p.c(cardView, a3);
                CardView cardView2 = this.v;
                if (cardView2 == null) {
                    h.f.b.l.a("lnBonusWaveAnim");
                }
                com.bytedance.android.livesdk.utils.p.d(cardView2, a3);
            } else {
                com.bytedance.android.live.liveinteract.match.b.g.c cVar2 = this.o;
                if (cVar2 == null) {
                    h.f.b.l.a("mPresenter");
                }
                float f4 = ((float) cVar2.o) * 1.0f;
                com.bytedance.android.live.liveinteract.match.b.g.c cVar3 = this.o;
                if (cVar3 == null) {
                    h.f.b.l.a("mPresenter");
                }
                int i2 = (int) (f3 * (1.0f - (f4 / ((float) cVar3.n))));
                if (com.bytedance.android.live.uikit.c.a.a(getContext())) {
                    CardView cardView3 = this.v;
                    if (cardView3 == null) {
                        h.f.b.l.a("lnBonusWaveAnim");
                    }
                    com.bytedance.android.livesdk.utils.p.c(cardView3, i2);
                } else {
                    CardView cardView4 = this.v;
                    if (cardView4 == null) {
                        h.f.b.l.a("lnBonusWaveAnim");
                    }
                    com.bytedance.android.livesdk.utils.p.d(cardView4, i2);
                }
            }
            LiveAutoRtlImageView liveAutoRtlImageView = this.w;
            if (liveAutoRtlImageView == null) {
                h.f.b.l.a("mWaveAnim");
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveAutoRtlImageView, "translationX", f2, a2);
            this.p = ofFloat;
            if (ofFloat != null) {
                ofFloat.setInterpolator(androidx.core.h.b.b.a(0.52f, 0.0f, 0.74f, 0.0f));
            }
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.setDuration(1500L);
            }
            ObjectAnimator objectAnimator2 = this.p;
            if (objectAnimator2 != null) {
                objectAnimator2.setRepeatMode(1);
            }
            ObjectAnimator objectAnimator3 = this.p;
            if (objectAnimator3 != null) {
                objectAnimator3.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator4 = this.p;
            if (objectAnimator4 != null) {
                objectAnimator4.start();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10886a = true;
        View findViewById = findViewById(R.id.dqk);
        h.f.b.l.b(findViewById, "");
        this.f10887b = (RelativeLayout) findViewById;
        View findViewById2 = findViewById(R.id.chb);
        h.f.b.l.b(findViewById2, "");
        this.f10888c = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.f91);
        h.f.b.l.b(findViewById3, "");
        this.f10889d = (TaskMarqueeTextView) findViewById3;
        View findViewById4 = findViewById(R.id.aed);
        h.f.b.l.b(findViewById4, "");
        this.f10890e = (ConstraintLayout) findViewById4;
        View findViewById5 = findViewById(R.id.c1x);
        h.f.b.l.b(findViewById5, "");
        this.t = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.f90);
        h.f.b.l.b(findViewById6, "");
        this.u = (TaskMarqueeTextView) findViewById6;
        View findViewById7 = findViewById(R.id.d2t);
        h.f.b.l.b(findViewById7, "");
        this.f10891f = (ProgressBar) findViewById7;
        View findViewById8 = findViewById(R.id.ey0);
        h.f.b.l.b(findViewById8, "");
        this.f10892g = (LiveTextView) findViewById8;
        View findViewById9 = findViewById(R.id.ch4);
        h.f.b.l.b(findViewById9, "");
        this.v = (CardView) findViewById9;
        View findViewById10 = findViewById(R.id.fly);
        h.f.b.l.b(findViewById10, "");
        this.w = (LiveAutoRtlImageView) findViewById10;
        View findViewById11 = findViewById(R.id.a6f);
        h.f.b.l.b(findViewById11, "");
        this.f10893h = (LinearLayout) findViewById11;
        View findViewById12 = findViewById(R.id.ew8);
        h.f.b.l.b(findViewById12, "");
        this.f10894i = (TaskMarqueeTextView) findViewById12;
        View findViewById13 = findViewById(R.id.exy);
        h.f.b.l.b(findViewById13, "");
        this.f10895j = (LiveTextView) findViewById13;
        View findViewById14 = findViewById(R.id.and);
        h.f.b.l.b(findViewById14, "");
        this.f10896k = findViewById14;
        View findViewById15 = findViewById(R.id.ud);
        h.f.b.l.b(findViewById15, "");
        this.f10897l = (FrameLayout) findViewById15;
        View findViewById16 = findViewById(R.id.c1w);
        h.f.b.l.b(findViewById16, "");
        this.f10898m = (HSAnimImageView) findViewById16;
    }

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ long $timeStamp;
        final /* synthetic */ MatchBonusTaskContainer this$0;

        static {
            Covode.recordClassIndex(5836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(MatchBonusTaskContainer matchBonusTaskContainer, long j2) {
            super(0);
            this.this$0 = matchBonusTaskContainer;
            this.$timeStamp = j2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            Boolean bool;
            String str;
            com.bytedance.android.live.base.model.user.b a2;
            if (this.this$0.f10886a) {
                MatchBonusTaskContainer.b(this.this$0).setVisibility(0);
                MatchBonusTaskContainer.c(this.this$0).setVisibility(0);
                ProgressBar d2 = MatchBonusTaskContainer.d(this.this$0);
                if (MatchBonusTaskContainer.a(this.this$0).n > 0) {
                    i2 = ((int) MatchBonusTaskContainer.a(this.this$0).n) * 10;
                } else {
                    i2 = 100;
                }
                d2.setMax(i2);
                long j2 = this.$timeStamp - (MatchBonusTaskContainer.a(this.this$0).f10789k - MatchBonusTaskContainer.a(this.this$0).f10790l);
                LiveTextView liveTextView = this.this$0.f10892g;
                if (liveTextView == null) {
                    h.f.b.l.a("tvTaskCountDown");
                }
                MatchBonusTaskContainer.a(j2, liveTextView);
                this.this$0.c();
                if (!this.this$0.r) {
                    this.this$0.r = true;
                    if (!this.this$0.q) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("invitee_list", w.a(b.a.a().p));
                        if (b.a.a().q) {
                            str = "inviter";
                        } else {
                            str = "invitee";
                        }
                        hashMap.put("anchor_type", str);
                        String str2 = b.a.a().aj;
                        if (str2 == null) {
                            str2 = "";
                        }
                        hashMap.put("request_from", str2);
                        hashMap.put("time_stamp", String.valueOf(System.currentTimeMillis()));
                        com.bytedance.android.livesdk.at.f b2 = u.a().b();
                        if (!(b2 == null || (a2 = b2.a()) == null)) {
                            hashMap.put("user_id", String.valueOf(a2.getId()));
                        }
                        com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
                        com.bytedance.android.live.liveinteract.platform.common.g.b.b(hashMap);
                        com.bytedance.android.live.liveinteract.platform.common.g.b.a(true, false, (Map<String, String>) hashMap);
                        com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_pk_task_icon_show", hashMap);
                    }
                    this.this$0.d();
                    MatchBonusTaskContainer matchBonusTaskContainer = this.this$0;
                    matchBonusTaskContainer.a(MatchBonusTaskContainer.e(matchBonusTaskContainer), MatchBonusTaskContainer.c(this.this$0), AnonymousClass1.f10922a);
                }
                ObjectAnimator objectAnimator = this.this$0.p;
                if (objectAnimator != null) {
                    bool = Boolean.valueOf(objectAnimator.isRunning());
                } else {
                    bool = null;
                }
                if (com.bytedance.android.livesdk.utils.p.c(bool)) {
                    this.this$0.e();
                }
            }
            return z.f158842a;
        }
    }

    public final void setAnchor(boolean z) {
        this.q = z;
    }

    public static final class s implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10925a;

        static {
            Covode.recordClassIndex(5844);
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public s(MatchBonusTaskContainer matchBonusTaskContainer) {
            this.f10925a = matchBonusTaskContainer;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            this.f10925a.e();
        }
    }

    public static final /* synthetic */ com.bytedance.android.live.liveinteract.match.b.g.c a(MatchBonusTaskContainer matchBonusTaskContainer) {
        com.bytedance.android.live.liveinteract.match.b.g.c cVar = matchBonusTaskContainer.o;
        if (cVar == null) {
            h.f.b.l.a("mPresenter");
        }
        return cVar;
    }

    public static final /* synthetic */ FrameLayout b(MatchBonusTaskContainer matchBonusTaskContainer) {
        FrameLayout frameLayout = matchBonusTaskContainer.f10897l;
        if (frameLayout == null) {
            h.f.b.l.a("mBonusGroupView");
        }
        return frameLayout;
    }

    public static final /* synthetic */ ConstraintLayout c(MatchBonusTaskContainer matchBonusTaskContainer) {
        ConstraintLayout constraintLayout = matchBonusTaskContainer.f10890e;
        if (constraintLayout == null) {
            h.f.b.l.a("mTaskContainer");
        }
        return constraintLayout;
    }

    public static final /* synthetic */ ProgressBar d(MatchBonusTaskContainer matchBonusTaskContainer) {
        ProgressBar progressBar = matchBonusTaskContainer.f10891f;
        if (progressBar == null) {
            h.f.b.l.a("mTaskProgressBar");
        }
        return progressBar;
    }

    public static final /* synthetic */ LinearLayout e(MatchBonusTaskContainer matchBonusTaskContainer) {
        LinearLayout linearLayout = matchBonusTaskContainer.f10888c;
        if (linearLayout == null) {
            h.f.b.l.a("lnTaskNotice");
        }
        return linearLayout;
    }

    public static final /* synthetic */ TaskMarqueeTextView f(MatchBonusTaskContainer matchBonusTaskContainer) {
        TaskMarqueeTextView taskMarqueeTextView = matchBonusTaskContainer.f10894i;
        if (taskMarqueeTextView == null) {
            h.f.b.l.a("tvBonusContent");
        }
        return taskMarqueeTextView;
    }

    public static final /* synthetic */ LinearLayout g(MatchBonusTaskContainer matchBonusTaskContainer) {
        LinearLayout linearLayout = matchBonusTaskContainer.f10893h;
        if (linearLayout == null) {
            h.f.b.l.a("mBonusResultContainer");
        }
        return linearLayout;
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10899a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10900b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10901c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10902d;

        static {
            Covode.recordClassIndex(5826);
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            if (this.f10899a.f10886a) {
                this.f10900b.invoke();
                if (!h.f.b.l.a(this.f10901c, this.f10902d)) {
                    this.f10901c.setAlpha(1.0f);
                }
            }
        }

        public b(MatchBonusTaskContainer matchBonusTaskContainer, h.f.a.a aVar, ViewGroup viewGroup, ViewGroup viewGroup2) {
            this.f10899a = matchBonusTaskContainer;
            this.f10900b = aVar;
            this.f10901c = viewGroup;
            this.f10902d = viewGroup2;
        }
    }

    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10906b;

        static {
            Covode.recordClassIndex(5829);
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            if (this.f10905a.f10886a && MatchBonusTaskContainer.e(this.f10905a) != null) {
                MatchBonusTaskContainer.e(this.f10905a).setVisibility(8);
                this.f10906b.invoke();
            }
        }

        public e(MatchBonusTaskContainer matchBonusTaskContainer, h.f.a.a aVar) {
            this.f10905a = matchBonusTaskContainer;
            this.f10906b = aVar;
        }
    }

    public static final class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TaskMarqueeTextView f10913b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f10914c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f10915d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10916e;

        static {
            Covode.recordClassIndex(5832);
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            TaskMarqueeTextView taskMarqueeTextView;
            h.f.b.l.d(animator, "");
            if (this.f10912a.f10886a && (taskMarqueeTextView = this.f10913b) != null) {
                taskMarqueeTextView.setText(com.bytedance.android.live.liveinteract.match.ui.d.a.a(taskMarqueeTextView, this.f10914c, this.f10915d));
                this.f10912a.a(this.f10916e, 0);
            }
        }

        public h(MatchBonusTaskContainer matchBonusTaskContainer, TaskMarqueeTextView taskMarqueeTextView, SpannableStringBuilder spannableStringBuilder, boolean z, ViewGroup viewGroup) {
            this.f10912a = matchBonusTaskContainer;
            this.f10913b = taskMarqueeTextView;
            this.f10914c = spannableStringBuilder;
            this.f10915d = z;
            this.f10916e = viewGroup;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10918b;

        static {
            Covode.recordClassIndex(5833);
        }

        i(MatchBonusTaskContainer matchBonusTaskContainer, ViewGroup viewGroup) {
            this.f10917a = matchBonusTaskContainer;
            this.f10918b = viewGroup;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            h.f.b.l.b(valueAnimator, "");
            if ((valueAnimator.getAnimatedValue() instanceof Integer) && this.f10917a.f10886a && (viewGroup = this.f10918b) != null) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                b.a(viewGroup, ((Integer) animatedValue).intValue());
            }
        }
    }

    static final class t implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10926a;

        static {
            Covode.recordClassIndex(5845);
        }

        t(MatchBonusTaskContainer matchBonusTaskContainer) {
            this.f10926a = matchBonusTaskContainer;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            if ((valueAnimator.getAnimatedValue() instanceof Integer) && this.f10926a.f10886a) {
                ProgressBar d2 = MatchBonusTaskContainer.d(this.f10926a);
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                d2.setProgress(((Integer) animatedValue).intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchBonusTaskContainer f10904a;

        static {
            Covode.recordClassIndex(5828);
        }

        d(MatchBonusTaskContainer matchBonusTaskContainer) {
            this.f10904a = matchBonusTaskContainer;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0111  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r14) {
            /*
            // Method dump skipped, instructions count: 378
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.ui.view.MatchBonusTaskContainer.d.onClick(android.view.View):void");
        }
    }

    public static void a(long j2, LiveTextView liveTextView) {
        if (j2 >= 0) {
            liveTextView.setText(new StringBuilder().append(j2).append('s').toString());
        } else {
            liveTextView.setText("0s");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, int i2) {
        if (view == null) {
            DataChannel dataChannel = this.n;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.match.b.c.a.class, Integer.valueOf(i2));
            }
        } else if (view.getMeasuredWidth() == 0) {
            view.post(new j(this, view));
        } else {
            DataChannel dataChannel2 = this.n;
            if (dataChannel2 != null) {
                dataChannel2.c(com.bytedance.android.live.liveinteract.match.b.c.a.class, Integer.valueOf(view.getMeasuredWidth()));
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.c.b
    public final void a(long j2, com.bytedance.android.live.liveinteract.match.b.b.d dVar) {
        Boolean bool;
        int i2;
        ObjectAnimator objectAnimator;
        Boolean bool2;
        ObjectAnimator objectAnimator2;
        h.f.b.l.d(dVar, "");
        boolean z = false;
        if (dVar.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.d.DISABLED) > 0) {
            RelativeLayout relativeLayout = this.f10887b;
            if (relativeLayout == null) {
                h.f.b.l.a("rootView");
            }
            relativeLayout.setVisibility(0);
        } else {
            RelativeLayout relativeLayout2 = this.f10887b;
            if (relativeLayout2 == null) {
                h.f.b.l.a("rootView");
            }
            relativeLayout2.setVisibility(8);
        }
        switch (a.f10975a[dVar.ordinal()]) {
            case 1:
                RelativeLayout relativeLayout3 = this.f10887b;
                if (relativeLayout3 == null) {
                    h.f.b.l.a("rootView");
                }
                relativeLayout3.setVisibility(8);
                ObjectAnimator objectAnimator3 = this.p;
                if (objectAnimator3 != null) {
                    bool2 = Boolean.valueOf(objectAnimator3.isRunning());
                } else {
                    bool2 = null;
                }
                if (!com.bytedance.android.livesdk.utils.p.c(bool2) && (objectAnimator2 = this.p) != null) {
                    objectAnimator2.end();
                }
                TaskMarqueeTextView taskMarqueeTextView = this.f10889d;
                if (taskMarqueeTextView == null) {
                    h.f.b.l.a("tvTaskNotice");
                }
                taskMarqueeTextView.setTextSize(1, 13.0f);
                TaskMarqueeTextView taskMarqueeTextView2 = this.f10894i;
                if (taskMarqueeTextView2 == null) {
                    h.f.b.l.a("tvBonusContent");
                }
                taskMarqueeTextView2.setTextSize(1, 13.0f);
                TaskMarqueeTextView taskMarqueeTextView3 = this.u;
                if (taskMarqueeTextView3 == null) {
                    h.f.b.l.a("tvTaskProgress");
                }
                taskMarqueeTextView3.setTextSize(1, 13.0f);
                LinearLayout linearLayout = this.f10888c;
                if (linearLayout == null) {
                    h.f.b.l.a("lnTaskNotice");
                }
                b.a(linearLayout, -2);
                ConstraintLayout constraintLayout = this.f10890e;
                if (constraintLayout == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                b.a(constraintLayout, -2);
                LinearLayout linearLayout2 = this.f10893h;
                if (linearLayout2 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                b.a(linearLayout2, -2);
                CardView cardView = this.v;
                if (cardView == null) {
                    h.f.b.l.a("lnBonusWaveAnim");
                }
                cardView.setVisibility(8);
                LiveAutoRtlImageView liveAutoRtlImageView = this.w;
                if (liveAutoRtlImageView == null) {
                    h.f.b.l.a("mWaveAnim");
                }
                liveAutoRtlImageView.setVisibility(8);
                ProgressBar progressBar = this.f10891f;
                if (progressBar == null) {
                    h.f.b.l.a("mTaskProgressBar");
                }
                progressBar.setProgress(0);
                ProgressBar progressBar2 = this.f10891f;
                if (progressBar2 == null) {
                    h.f.b.l.a("mTaskProgressBar");
                }
                progressBar2.setMax(100);
                ConstraintLayout constraintLayout2 = this.f10890e;
                if (constraintLayout2 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                constraintLayout2.setVisibility(8);
                LinearLayout linearLayout3 = this.f10893h;
                if (linearLayout3 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout3.setVisibility(8);
                LinearLayout linearLayout4 = this.f10888c;
                if (linearLayout4 == null) {
                    h.f.b.l.a("lnTaskNotice");
                }
                linearLayout4.setVisibility(8);
                HSAnimImageView hSAnimImageView = this.f10898m;
                if (hSAnimImageView == null) {
                    h.f.b.l.a("supportAnim");
                }
                hSAnimImageView.setVisibility(8);
                this.x = false;
                this.r = false;
                a((View) null, 0);
                return;
            case 2:
                LinearLayout linearLayout5 = this.f10888c;
                if (linearLayout5 == null) {
                    h.f.b.l.a("lnTaskNotice");
                }
                linearLayout5.setVisibility(0);
                FrameLayout frameLayout = this.f10897l;
                if (frameLayout == null) {
                    h.f.b.l.a("mBonusGroupView");
                }
                frameLayout.setVisibility(8);
                ConstraintLayout constraintLayout3 = this.f10890e;
                if (constraintLayout3 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                constraintLayout3.setVisibility(8);
                LinearLayout linearLayout6 = this.f10893h;
                if (linearLayout6 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout6.setVisibility(8);
                this.x = false;
                this.r = false;
                ObjectAnimator objectAnimator4 = this.p;
                if (objectAnimator4 != null) {
                    bool = Boolean.valueOf(objectAnimator4.isRunning());
                } else {
                    bool = null;
                }
                if (!com.bytedance.android.livesdk.utils.p.c(bool) && (objectAnimator = this.p) != null) {
                    objectAnimator.end();
                }
                com.bytedance.android.live.liveinteract.match.b.g.c cVar = this.o;
                if (cVar == null) {
                    h.f.b.l.a("mPresenter");
                }
                List<com.bytedance.android.livesdkapi.depend.model.live.a.k> list = cVar.f10787i;
                if (list.size() != 0) {
                    LinearLayout linearLayout7 = this.f10888c;
                    if (linearLayout7 == null) {
                        h.f.b.l.a("lnTaskNotice");
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout7, "scaleY", 0.0f, 1.0f);
                    h.f.b.l.b(ofFloat, "");
                    ofFloat.setDuration(150L);
                    TaskMarqueeTextView taskMarqueeTextView4 = this.f10889d;
                    if (taskMarqueeTextView4 == null) {
                        h.f.b.l.a("tvTaskNotice");
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(taskMarqueeTextView4, "alpha", 0.0f, 1.0f);
                    h.f.b.l.b(ofFloat2, "");
                    ofFloat2.setDuration(100L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(ofFloat, ofFloat2);
                    animatorSet.start();
                    long j3 = 0;
                    com.bytedance.android.live.liveinteract.match.b.g.c cVar2 = this.o;
                    if (cVar2 == null) {
                        h.f.b.l.a("mPresenter");
                    }
                    long j4 = cVar2.f10788j - j2;
                    if (list.size() > 1) {
                        int size = list.size();
                        int i3 = 0;
                        i2 = 0;
                        while (i3 < size && list.get(i3).f23091a < j4) {
                            j4 -= list.get(i3).f23091a;
                            i2++;
                            i3++;
                        }
                    } else {
                        i2 = 0;
                    }
                    com.bytedance.android.live.liveinteract.match.b.g.c cVar3 = this.o;
                    if (cVar3 == null) {
                        h.f.b.l.a("mPresenter");
                    }
                    SpannableStringBuilder a2 = com.bytedance.android.live.liveinteract.match.ui.d.a.a(cVar3.f10787i.get(i2).f23092b);
                    TaskMarqueeTextView taskMarqueeTextView5 = this.f10889d;
                    if (taskMarqueeTextView5 == null) {
                        h.f.b.l.a("tvTaskNotice");
                    }
                    float measureText = taskMarqueeTextView5.getPaint().measureText(a2.toString());
                    LinearLayout linearLayout8 = this.f10888c;
                    if (linearLayout8 == null) {
                        h.f.b.l.a("lnTaskNotice");
                    }
                    float paddingStart = measureText + ((float) linearLayout8.getPaddingStart());
                    LinearLayout linearLayout9 = this.f10888c;
                    if (linearLayout9 == null) {
                        h.f.b.l.a("lnTaskNotice");
                    }
                    float paddingEnd = paddingStart + ((float) linearLayout9.getPaddingEnd());
                    if (((float) (y.c() - y.a(24.0f))) <= paddingEnd) {
                        z = true;
                    }
                    TaskMarqueeTextView taskMarqueeTextView6 = this.f10889d;
                    if (taskMarqueeTextView6 == null) {
                        h.f.b.l.a("tvTaskNotice");
                    }
                    TaskMarqueeTextView taskMarqueeTextView7 = this.f10889d;
                    if (taskMarqueeTextView7 == null) {
                        h.f.b.l.a("tvTaskNotice");
                    }
                    taskMarqueeTextView6.setText(com.bytedance.android.live.liveinteract.match.ui.d.a.a(taskMarqueeTextView7, a2, z));
                    a((View) null, (int) paddingEnd);
                    if (list.size() > 1 && i2 != list.size() - 1) {
                        int size2 = list.size();
                        for (int i4 = i2; i4 < size2; i4++) {
                            if (i4 == i2) {
                                j3 = (list.get(i2).f23091a - j4) * 1000;
                            } else {
                                j3 += list.get(i4).f23091a * 1000;
                            }
                            com.bytedance.android.live.core.c.a.a(3, "BattleTaskContainer", "noticeDuration = " + j3 + " index = " + i4);
                            this.y.postDelayed(new g(this, list, i4), j3);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.y.removeCallbacksAndMessages(null);
                this.x = false;
                l lVar = new l(this, j2);
                LinearLayout linearLayout10 = this.f10888c;
                if (linearLayout10 == null) {
                    h.f.b.l.a("lnTaskNotice");
                }
                if (linearLayout10.getVisibility() == 8) {
                    lVar.invoke();
                    return;
                }
                TaskMarqueeTextView taskMarqueeTextView8 = this.f10889d;
                if (taskMarqueeTextView8 == null) {
                    h.f.b.l.a("tvTaskNotice");
                }
                taskMarqueeTextView8.a();
                AnimatorSet animatorSet2 = new AnimatorSet();
                Animator[] animatorArr = new Animator[2];
                TaskMarqueeTextView taskMarqueeTextView9 = this.f10889d;
                if (taskMarqueeTextView9 == null) {
                    h.f.b.l.a("tvTaskNotice");
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(taskMarqueeTextView9, "alpha", 1.0f, 0.0f);
                ofFloat3.setDuration(100L);
                animatorArr[0] = ofFloat3;
                LinearLayout linearLayout11 = this.f10888c;
                if (linearLayout11 == null) {
                    h.f.b.l.a("lnTaskNotice");
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linearLayout11, "scaleY", 1.0f, 0.0f);
                ofFloat4.setDuration(150L);
                animatorArr[1] = ofFloat4;
                animatorSet2.playSequentially(animatorArr);
                animatorSet2.addListener(new e(this, lVar));
                animatorSet2.start();
                return;
            case 4:
                FrameLayout frameLayout2 = this.f10897l;
                if (frameLayout2 == null) {
                    h.f.b.l.a("mBonusGroupView");
                }
                frameLayout2.setVisibility(0);
                LinearLayout linearLayout12 = this.f10893h;
                if (linearLayout12 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout12.setVisibility(0);
                ConstraintLayout constraintLayout4 = this.f10890e;
                if (constraintLayout4 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                constraintLayout4.setVisibility(8);
                ProgressBar progressBar3 = this.f10891f;
                if (progressBar3 == null) {
                    h.f.b.l.a("mTaskProgressBar");
                }
                progressBar3.setProgress(0);
                LiveTextView liveTextView = this.f10895j;
                if (liveTextView == null) {
                    h.f.b.l.a("tvBonusCountDown");
                }
                liveTextView.setVisibility(8);
                View view = this.f10896k;
                if (view == null) {
                    h.f.b.l.a("mDividerInBonus");
                }
                view.setVisibility(8);
                LinearLayout linearLayout13 = this.f10893h;
                if (linearLayout13 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout13.setBackgroundResource(R.drawable.bsz);
                CardView cardView2 = this.v;
                if (cardView2 == null) {
                    h.f.b.l.a("lnBonusWaveAnim");
                }
                cardView2.setVisibility(8);
                HSAnimImageView hSAnimImageView2 = this.f10898m;
                if (hSAnimImageView2 == null) {
                    h.f.b.l.a("supportAnim");
                }
                hSAnimImageView2.setVisibility(8);
                ObjectAnimator objectAnimator5 = this.p;
                if (objectAnimator5 != null) {
                    objectAnimator5.end();
                }
                this.r = false;
                ConstraintLayout constraintLayout5 = this.f10890e;
                if (constraintLayout5 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                LinearLayout linearLayout14 = this.f10893h;
                if (linearLayout14 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                a(constraintLayout5, linearLayout14, new m(this));
                LinearLayout linearLayout15 = this.f10893h;
                if (linearLayout15 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout15.postDelayed(new n(this), 3000);
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                FrameLayout frameLayout3 = this.f10897l;
                if (frameLayout3 == null) {
                    h.f.b.l.a("mBonusGroupView");
                }
                frameLayout3.setVisibility(0);
                LinearLayout linearLayout16 = this.f10893h;
                if (linearLayout16 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout16.setVisibility(0);
                ConstraintLayout constraintLayout6 = this.f10890e;
                if (constraintLayout6 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                constraintLayout6.setVisibility(8);
                LiveTextView liveTextView2 = this.f10895j;
                if (liveTextView2 == null) {
                    h.f.b.l.a("tvBonusCountDown");
                }
                liveTextView2.setVisibility(8);
                View view2 = this.f10896k;
                if (view2 == null) {
                    h.f.b.l.a("mDividerInBonus");
                }
                view2.setVisibility(8);
                HSAnimImageView hSAnimImageView3 = this.f10898m;
                if (hSAnimImageView3 == null) {
                    h.f.b.l.a("supportAnim");
                }
                hSAnimImageView3.setVisibility(8);
                this.x = false;
                this.r = false;
                LinearLayout linearLayout17 = this.f10893h;
                if (linearLayout17 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout17.setBackgroundResource(R.drawable.bsy);
                ConstraintLayout constraintLayout7 = this.f10890e;
                if (constraintLayout7 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                LinearLayout linearLayout18 = this.f10893h;
                if (linearLayout18 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                a(constraintLayout7, linearLayout18, new o(this));
                e();
                LinearLayout linearLayout19 = this.f10893h;
                if (linearLayout19 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout19.postDelayed(new p(this), 3000);
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                FrameLayout frameLayout4 = this.f10897l;
                if (frameLayout4 == null) {
                    h.f.b.l.a("mBonusGroupView");
                }
                frameLayout4.setVisibility(0);
                LinearLayout linearLayout20 = this.f10893h;
                if (linearLayout20 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout20.setVisibility(0);
                LinearLayout linearLayout21 = this.f10893h;
                if (linearLayout21 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout21.setBackgroundResource(R.drawable.bt0);
                ConstraintLayout constraintLayout8 = this.f10890e;
                if (constraintLayout8 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                constraintLayout8.setVisibility(8);
                LiveTextView liveTextView3 = this.f10895j;
                if (liveTextView3 == null) {
                    h.f.b.l.a("tvBonusCountDown");
                }
                liveTextView3.setVisibility(0);
                View view3 = this.f10896k;
                if (view3 == null) {
                    h.f.b.l.a("mDividerInBonus");
                }
                view3.setVisibility(0);
                HSAnimImageView hSAnimImageView4 = this.f10898m;
                if (hSAnimImageView4 == null) {
                    h.f.b.l.a("supportAnim");
                }
                hSAnimImageView4.setVisibility(8);
                com.bytedance.android.live.liveinteract.match.b.g.c cVar4 = this.o;
                if (cVar4 == null) {
                    h.f.b.l.a("mPresenter");
                }
                long j5 = cVar4.t;
                com.bytedance.android.live.liveinteract.match.b.g.c cVar5 = this.o;
                if (cVar5 == null) {
                    h.f.b.l.a("mPresenter");
                }
                long j6 = j2 - (j5 - cVar5.u);
                LiveTextView liveTextView4 = this.f10895j;
                if (liveTextView4 == null) {
                    h.f.b.l.a("tvBonusCountDown");
                }
                a(j6, liveTextView4);
                if (!this.x) {
                    this.x = true;
                    com.bytedance.android.live.liveinteract.match.b.g.c cVar6 = this.o;
                    if (cVar6 == null) {
                        h.f.b.l.a("mPresenter");
                    }
                    com.bytedance.android.livesdkapi.depend.model.live.a.f fVar = cVar6.y;
                    TaskMarqueeTextView taskMarqueeTextView10 = this.f10894i;
                    if (taskMarqueeTextView10 == null) {
                        h.f.b.l.a("tvBonusContent");
                    }
                    LinearLayout linearLayout22 = this.f10893h;
                    if (linearLayout22 == null) {
                        h.f.b.l.a("mBonusResultContainer");
                    }
                    a(fVar, (String) null, taskMarqueeTextView10, (ViewGroup) linearLayout22, false);
                    ConstraintLayout constraintLayout9 = this.f10890e;
                    if (constraintLayout9 == null) {
                        h.f.b.l.a("mTaskContainer");
                    }
                    LinearLayout linearLayout23 = this.f10893h;
                    if (linearLayout23 == null) {
                        h.f.b.l.a("mBonusResultContainer");
                    }
                    a(constraintLayout9, linearLayout23, new q(this));
                    return;
                }
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                FrameLayout frameLayout5 = this.f10897l;
                if (frameLayout5 == null) {
                    h.f.b.l.a("mBonusGroupView");
                }
                frameLayout5.setVisibility(0);
                LinearLayout linearLayout24 = this.f10893h;
                if (linearLayout24 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                linearLayout24.setVisibility(0);
                ConstraintLayout constraintLayout10 = this.f10890e;
                if (constraintLayout10 == null) {
                    h.f.b.l.a("mTaskContainer");
                }
                constraintLayout10.setVisibility(8);
                this.x = false;
                this.r = false;
                ObjectAnimator objectAnimator6 = this.p;
                if (objectAnimator6 != null) {
                    objectAnimator6.end();
                }
                LinearLayout linearLayout25 = this.f10893h;
                if (linearLayout25 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                LinearLayout linearLayout26 = this.f10893h;
                if (linearLayout26 == null) {
                    h.f.b.l.a("mBonusResultContainer");
                }
                a(linearLayout25, linearLayout26, new r(this));
                return;
            default:
                return;
        }
    }

    private /* synthetic */ MatchBonusTaskContainer(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MatchBonusTaskContainer(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(8443);
        this.y = new Handler(Looper.getMainLooper());
        com.a.a(LayoutInflater.from(context), R.layout.bfh, this, true);
        MethodCollector.o(8443);
    }

    public final void a(ViewGroup viewGroup, ViewGroup viewGroup2, h.f.a.a<z> aVar) {
        if (this.f10886a) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(150L);
            ofFloat.addListener(new b(this, aVar, viewGroup, viewGroup2));
            if (!h.f.b.l.a(viewGroup, viewGroup2)) {
                viewGroup2.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(150L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2);
            animatorSet.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(com.bytedance.android.livesdkapi.depend.model.live.a.f fVar, String str, TaskMarqueeTextView taskMarqueeTextView, ViewGroup viewGroup, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        boolean z2;
        float measuredWidth;
        if (this.f10886a) {
            if (fVar != null) {
                spannableStringBuilder = com.bytedance.android.live.liveinteract.match.ui.d.a.a(fVar);
            } else if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
            } else {
                return;
            }
            float measureText = taskMarqueeTextView.getPaint().measureText(spannableStringBuilder.toString()) + ((float) y.a(16.0f));
            if (!z) {
                measureText += (float) y.a(50.0f);
            }
            int c2 = y.c() - y.a(24.0f);
            float a2 = ((float) y.a(100.0f)) * 1.0f;
            if (((float) c2) <= measureText) {
                z2 = true;
            } else {
                z2 = false;
            }
            CharSequence text = taskMarqueeTextView.getText();
            h.f.b.l.b(text, "");
            if (text.length() == 0) {
                taskMarqueeTextView.setText(com.bytedance.android.live.liveinteract.match.ui.d.a.a(taskMarqueeTextView, spannableStringBuilder, z2));
                a(viewGroup, 0);
            } else if (!h.f.b.l.a((Object) taskMarqueeTextView.getText().toString(), (Object) spannableStringBuilder.toString())) {
                taskMarqueeTextView.setAlpha(0.0f);
                if (viewGroup.getMeasuredWidth() == 0) {
                    measuredWidth = a2;
                } else {
                    measuredWidth = ((float) viewGroup.getMeasuredWidth()) * 1.0f;
                }
                if (measureText < a2) {
                    measureText = a2;
                }
                int[] iArr = new int[2];
                iArr[0] = (int) measuredWidth;
                if (!z2) {
                    c2 = (int) measureText;
                }
                iArr[1] = c2;
                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                h.f.b.l.b(ofInt, "");
                ofInt.setDuration(150L);
                ofInt.addUpdateListener(new i(this, viewGroup));
                h.f.b.l.b(ofInt, "");
                ofInt.addListener(new h(this, taskMarqueeTextView, spannableStringBuilder, z2, viewGroup));
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(taskMarqueeTextView, "alpha", 0.0f, 1.0f);
                h.f.b.l.b(ofFloat, "");
                ofFloat.setDuration(100L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofInt, ofFloat);
                animatorSet.start();
            }
        }
    }
}
