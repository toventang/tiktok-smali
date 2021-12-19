package com.ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtRadioButton;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView;
import com.ss.android.ugc.tools.c.a;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.z;
import java.text.DecimalFormat;
import java.util.Objects;

public final class f extends com.bytedance.scene.j implements q {
    public static final a y = new a((byte) 0);
    private View A;

    /* renamed from: a  reason: collision with root package name */
    public VolumeTapsView f125186a;

    /* renamed from: b  reason: collision with root package name */
    public k f125187b;

    /* renamed from: c  reason: collision with root package name */
    public l f125188c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f125189d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f125190e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f125191f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f125192g;

    /* renamed from: h  reason: collision with root package name */
    public final CountdownViewModel f125193h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f125194i;

    /* renamed from: j  reason: collision with root package name */
    public int f125195j;

    /* renamed from: k  reason: collision with root package name */
    public ViewGroup f125196k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f125197l;
    public RadioGroup t;
    public DmtRadioButton u;
    public DmtRadioButton v;
    public com.ss.android.ugc.aweme.framework.d.c w;
    public b x;
    private SafeHandler z;

    public interface b {
        static {
            Covode.recordClassIndex(82210);
        }

        void a(int i2);
    }

    static {
        Covode.recordClassIndex(82208);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82209);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(float f2) {
            String format = new DecimalFormat("0.0").format(Float.valueOf(f2));
            h.f.b.l.b(format, "");
            return format;
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        com.ss.android.ugc.aweme.framework.d.c cVar = this.w;
        if (cVar != null) {
            cVar.c();
        }
    }

    public final String a() {
        if (this.f125195j == 3) {
            return "3s";
        }
        return "10s";
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        k kVar = this.f125187b;
        if (kVar != null) {
            kVar.a();
        }
        l lVar = this.f125188c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        ViewGroup viewGroup = this.f125196k;
        if (viewGroup == null) {
            h.f.b.l.a("countDownTitleView");
        }
        viewGroup.post(new c(this));
    }

    public static final class m implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f125209b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f125210c;

        static {
            Covode.recordClassIndex(82226);
        }

        public final void onGlobalLayout() {
            f fVar = this.f125208a;
            fVar.withState(fVar.f125193h, new a(this));
            View view = this.f125210c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", (float) view.getMeasuredHeight(), 0.0f);
            ofFloat.setInterpolator(new com.ss.android.ugc.aweme.g.a());
            ofFloat.setDuration(490L);
            ofFloat.start();
        }

        static final class a extends h.f.b.m implements h.f.a.b<CountdownState, z> {
            final /* synthetic */ m this$0;

            static {
                Covode.recordClassIndex(82227);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(m mVar) {
                super(1);
                this.this$0 = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(CountdownState countdownState) {
                CountdownState countdownState2 = countdownState;
                h.f.b.l.d(countdownState2, "");
                this.this$0.f125208a.a((long) f.a(this.this$0.f125208a).getStopPosition(), countdownState2.getStartTime(), countdownState2.getMaxDuration());
                this.this$0.f125209b.getViewTreeObserver().removeOnGlobalLayoutListener(this.this$0);
                k kVar = this.this$0.f125208a.f125187b;
                if (kVar == null) {
                    return null;
                }
                kVar.a(countdownState2.getMusicPath(), (int) (countdownState2.getStartTime() + countdownState2.getSdkRecordTime()), (int) (countdownState2.getStartTime() + countdownState2.getMaxDuration()));
                return z.f158842a;
            }
        }

        m(f fVar, View view, View view2) {
            this.f125208a = fVar;
            this.f125209b = view;
            this.f125210c = view2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f125212b;

        static {
            Covode.recordClassIndex(82228);
        }

        n(f fVar, int i2) {
            this.f125211a = fVar;
            this.f125212b = i2;
        }

        public final /* synthetic */ void run() {
            if (this.f125211a.w == null) {
                Activity activity = this.f125211a.f42913m;
                if (activity != null) {
                    h.f.b.l.b(activity, "");
                    this.f125211a.w = new com.ss.android.ugc.aweme.framework.d.c(activity);
                } else {
                    return;
                }
            }
            com.ss.android.ugc.aweme.framework.d.c cVar = this.f125211a.w;
            if (cVar != null) {
                f fVar = this.f125211a;
                Object[] objArr = new Object[1];
                int i2 = 3;
                if (this.f125212b != 3) {
                    i2 = 10;
                }
                objArr[0] = Integer.valueOf(i2);
                cVar.a(fVar.a(R.string.av2, objArr));
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125198a;

        static {
            Covode.recordClassIndex(82211);
        }

        c(f fVar) {
            this.f125198a = fVar;
        }

        public final void run() {
            if (((float) f.d(this.f125198a).getMeasuredWidth()) < ((float) (f.e(this.f125198a).getMeasuredWidth() + f.f(this.f125198a).getMeasuredWidth())) + com.bytedance.common.utility.n.b(this.f125198a.f42913m, 8.0f)) {
                f fVar = this.f125198a;
                DmtRadioButton dmtRadioButton = fVar.u;
                if (dmtRadioButton == null) {
                    h.f.b.l.a("countDownShortView");
                }
                fVar.a(dmtRadioButton);
                f fVar2 = this.f125198a;
                DmtRadioButton dmtRadioButton2 = fVar2.v;
                if (dmtRadioButton2 == null) {
                    h.f.b.l.a("countDownLongView");
                }
                fVar2.a(dmtRadioButton2);
            }
            f fVar3 = this.f125198a;
            ViewGroup viewGroup = fVar3.f125196k;
            if (viewGroup == null) {
                h.f.b.l.a("countDownTitleView");
            }
            viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new h(fVar3));
        }
    }

    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125205a;

        static {
            Covode.recordClassIndex(82218);
        }

        public final void onGlobalLayout() {
            if (f.d(this.f125205a).getMeasuredWidth() < f.e(this.f125205a).getMeasuredWidth() + f.f(this.f125205a).getMeasuredWidth()) {
                int[] iArr = new int[2];
                f.e(this.f125205a).getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int[] iArr2 = new int[2];
                f.f(this.f125205a).getLocationOnScreen(iArr2);
                float b2 = ((float) (iArr2[0] - i2)) - com.bytedance.common.utility.n.b(this.f125205a.f42913m, 16.0f);
                ViewGroup.LayoutParams layoutParams = f.e(this.f125205a).getLayoutParams();
                layoutParams.width = (int) b2;
                f.e(this.f125205a).setLayoutParams(layoutParams);
            }
            f.d(this.f125205a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(f fVar) {
            this.f125205a = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f125214b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f125215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f125216d;

        static {
            Covode.recordClassIndex(82229);
        }

        o(f fVar, long j2, long j3, long j4) {
            this.f125213a = fVar;
            this.f125214b = j2;
            this.f125215c = j3;
            this.f125216d = j4;
        }

        public final void run() {
            f fVar = this.f125213a;
            long j2 = this.f125214b;
            long j3 = this.f125215c;
            long j4 = this.f125216d;
            float f2 = ((float) (j2 - j3)) * 1.0f;
            VolumeTapsView volumeTapsView = fVar.f125186a;
            if (volumeTapsView == null) {
                h.f.b.l.a("volumeTapsView");
            }
            float max = Math.max(0.0f, (f2 * ((float) volumeTapsView.getMeasuredWidth())) / ((float) j4));
            f.c(this.f125213a).setText(a.a(((float) (this.f125214b - this.f125215c)) / 1000.0f) + 's');
            f.c(this.f125213a).setTranslationX((max / ((float) f.a(this.f125213a).getMeasuredWidth())) * ((float) (f.a(this.f125213a).getMeasuredWidth() - f.c(this.f125213a).getMeasuredWidth())));
            f.b(this.f125213a).setAlpha(this.f125213a.a(max));
            TextView textView = this.f125213a.f125189d;
            if (textView == null) {
                h.f.b.l.a("startTextView");
            }
            f fVar2 = this.f125213a;
            textView.setAlpha(fVar2.a(((float) f.a(fVar2).getMeasuredWidth()) - max));
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<CountdownState, CountdownState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f125199a = new d();

        static {
            Covode.recordClassIndex(82212);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CountdownState invoke(CountdownState countdownState) {
            h.f.b.l.d(countdownState, "");
            return countdownState;
        }
    }

    public static final class k implements VolumeTapsView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125207a;

        static {
            Covode.recordClassIndex(82222);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(f fVar) {
            this.f125207a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.a
        public final void a(int i2) {
            f fVar = this.f125207a;
            fVar.withState(fVar.f125193h, new a(this, i2));
        }

        static final class a extends h.f.b.m implements h.f.a.b<CountdownState, z> {
            final /* synthetic */ int $position;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(82223);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, int i2) {
                super(1);
                this.this$0 = kVar;
                this.$position = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(CountdownState countdownState) {
                CountdownState countdownState2 = countdownState;
                h.f.b.l.d(countdownState2, "");
                this.this$0.f125207a.a((long) this.$position, countdownState2.getStartTime(), countdownState2.getMaxDuration());
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.b<CountdownState, z> {
            final /* synthetic */ int $previewEnd;
            final /* synthetic */ int $previewStart;
            final /* synthetic */ k this$0;

            static {
                Covode.recordClassIndex(82224);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(k kVar, int i2, int i3) {
                super(1);
                this.this$0 = kVar;
                this.$previewStart = i2;
                this.$previewEnd = i3;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(CountdownState countdownState) {
                CountdownState countdownState2 = countdownState;
                h.f.b.l.d(countdownState2, "");
                k kVar = this.this$0.f125207a.f125187b;
                if (kVar != null) {
                    kVar.a(countdownState2.getMusicPath(), this.$previewStart, this.$previewEnd);
                }
                this.this$0.f125207a.a((long) this.$previewEnd, countdownState2.getStartTime(), countdownState2.getMaxDuration());
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView.a
        public final void a(int i2, int i3) {
            f fVar = this.f125207a;
            fVar.withState(fVar.f125193h, new b(this, i2, i3));
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125204a;

        static {
            Covode.recordClassIndex(82217);
        }

        g(f fVar) {
            this.f125204a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l lVar = this.f125204a.f125188c;
            if (lVar != null) {
                lVar.b();
            }
        }
    }

    public f(CountdownState countdownState) {
        h.f.b.l.d(countdownState, "");
        this.f125193h = new CountdownViewModel(countdownState);
    }

    public static final /* synthetic */ VolumeTapsView a(f fVar) {
        VolumeTapsView volumeTapsView = fVar.f125186a;
        if (volumeTapsView == null) {
            h.f.b.l.a("volumeTapsView");
        }
        return volumeTapsView;
    }

    public static final /* synthetic */ TextView b(f fVar) {
        TextView textView = fVar.f125190e;
        if (textView == null) {
            h.f.b.l.a("endTextView");
        }
        return textView;
    }

    public static final /* synthetic */ TextView c(f fVar) {
        TextView textView = fVar.f125191f;
        if (textView == null) {
            h.f.b.l.a("anchorTextView");
        }
        return textView;
    }

    public static final /* synthetic */ ViewGroup d(f fVar) {
        ViewGroup viewGroup = fVar.f125196k;
        if (viewGroup == null) {
            h.f.b.l.a("countDownTitleView");
        }
        return viewGroup;
    }

    public static final /* synthetic */ TextView e(f fVar) {
        TextView textView = fVar.f125197l;
        if (textView == null) {
            h.f.b.l.a("countDownTitleTextView");
        }
        return textView;
    }

    public static final /* synthetic */ RadioGroup f(f fVar) {
        RadioGroup radioGroup = fVar.t;
        if (radioGroup == null) {
            h.f.b.l.a("countDownSwitchView");
        }
        return radioGroup;
    }

    public final float a(float f2) {
        VolumeTapsView volumeTapsView = this.f125186a;
        if (volumeTapsView == null) {
            h.f.b.l.a("volumeTapsView");
        }
        float measuredWidth = ((float) volumeTapsView.getMeasuredWidth()) - f2;
        TextView textView = this.f125190e;
        if (textView == null) {
            h.f.b.l.a("endTextView");
        }
        return Math.min(1.0f, (measuredWidth - ((float) textView.getMeasuredWidth())) / 100.0f);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.f$f  reason: collision with other inner class name */
    static final class View$OnClickListenerC3266f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125201a;

        static {
            Covode.recordClassIndex(82214);
        }

        View$OnClickListenerC3266f(f fVar) {
            this.f125201a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f125201a.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(ShortVideoContextViewModel.class);
            h.f.b.l.b(a2, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("countdown_type", this.f125201a.a());
            if (shortVideoContext.C != 0) {
                a3.a("draft_id", shortVideoContext.C);
            }
            String str = shortVideoContext.D;
            h.f.b.l.b(str, "");
            if (str.length() > 0) {
                a3.a("new_draft_id", shortVideoContext.D);
            }
            r.a("count_down_start", a3.f149193a);
            if (this.f125201a.f125187b != null) {
                f fVar = this.f125201a;
                fVar.withState(fVar.f125193h, new h.f.a.b<CountdownState, Boolean>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.countdown.f.View$OnClickListenerC3266f.AnonymousClass1 */
                    final /* synthetic */ View$OnClickListenerC3266f this$0;

                    static {
                        Covode.recordClassIndex(82215);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ Boolean invoke(CountdownState countdownState) {
                        final CountdownState countdownState2 = countdownState;
                        h.f.b.l.d(countdownState2, "");
                        TextView textView = this.this$0.f125201a.f125192g;
                        if (textView == null) {
                            h.f.b.l.a("record");
                        }
                        return Boolean.valueOf(textView.post(new Runnable(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.countdown.f.View$OnClickListenerC3266f.AnonymousClass1.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f125202a;

                            static {
                                Covode.recordClassIndex(82216);
                            }

                            {
                                this.f125202a = r1;
                            }

                            public final void run() {
                                k kVar = this.f125202a.this$0.f125201a.f125187b;
                                if (kVar != null) {
                                    kVar.a(f.a(this.f125202a.this$0.f125201a).getStopPosition() - ((int) countdownState2.getStartTime()), this.f125202a.this$0.f125201a.f125195j);
                                }
                                this.f125202a.this$0.f125201a.f125194i = true;
                                f fVar = this.f125202a.this$0.f125201a;
                                com.bytedance.scene.j jVar = fVar.o;
                                if (!(jVar instanceof com.bytedance.scene.group.b)) {
                                    jVar = null;
                                }
                                com.bytedance.scene.group.b bVar = (com.bytedance.scene.group.b) jVar;
                                if (bVar != null) {
                                    bVar.c(fVar);
                                }
                            }
                        }));
                    }
                });
            }
        }
    }

    public final void a(DmtRadioButton dmtRadioButton) {
        ViewGroup.LayoutParams layoutParams = dmtRadioButton.getLayoutParams();
        if (!(layoutParams instanceof RadioGroup.LayoutParams)) {
            layoutParams = null;
        }
        RadioGroup.LayoutParams layoutParams2 = (RadioGroup.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.width = (int) com.bytedance.common.utility.n.b(this.f42913m, 32.0f);
            dmtRadioButton.setLayoutParams(layoutParams2);
        }
    }

    public final void d(int i2) {
        Activity activity = this.f42913m;
        if (activity != null) {
            h.f.b.l.b(activity, "");
            this.f125195j = i2;
            Activity activity2 = this.f42913m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(ShortVideoContextViewModel.class);
            h.f.b.l.b(a2, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
            r.a("select_countdown_type", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("shoot_way", shortVideoContext.r).a("creation_id", shortVideoContext.q).a("content_type", "video").a("to_status", a()).f149193a);
            SafeHandler safeHandler = this.z;
            if (safeHandler == null) {
                h.f.b.l.a("safeHandler");
            }
            safeHandler.post(new n(this, i2));
            ((IVideoRecordPreferences) new com.bytedance.cukaie.closet.a().a(activity, IVideoRecordPreferences.class)).setCountDownMode(i2);
            b bVar = this.x;
            if (bVar != null) {
                bVar.a(i2);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    static final class j extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, UrlModel, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(82220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, UrlModel urlModel) {
            h.f.b.l.d(iVar, "");
            com.ss.android.ugc.tools.c.a.a(urlModel, new a.b(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.countdown.f.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f125206a;

                static {
                    Covode.recordClassIndex(82221);
                }

                @Override // com.ss.android.ugc.tools.c.a.b
                public final void a(Exception exc) {
                    h.f.b.l.d(exc, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f125206a = r1;
                }

                @Override // com.ss.android.ugc.tools.c.a.b
                public final void a(com.facebook.d.c<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> cVar) {
                    h.f.b.l.d(cVar, "");
                    if (cVar.b()) {
                        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> d2 = cVar.d();
                        Bitmap bitmap = null;
                        if (d2 != null && (d2.a() instanceof com.facebook.imagepipeline.j.b)) {
                            com.facebook.imagepipeline.j.c a2 = d2.a();
                            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableBitmap");
                            bitmap = ((com.facebook.imagepipeline.j.b) a2).d();
                        }
                        try {
                            f.a(this.f125206a.this$0).setWavForm(bitmap);
                        } finally {
                            com.facebook.common.h.a.c(d2);
                        }
                    }
                }
            });
            return z.f158842a;
        }
    }

    static final class e implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f125200a;

        static {
            Covode.recordClassIndex(82213);
        }

        e(f fVar) {
            this.f125200a = fVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
            if (i2 == R.id.dhl) {
                if (this.f125200a.f125195j != 3) {
                    this.f125200a.d(3);
                }
            } else if (i2 == R.id.dhk && this.f125200a.f125195j != 10) {
                this.f125200a.d(10);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, CountdownState, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(82219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, CountdownState countdownState) {
            CountdownState countdownState2 = countdownState;
            h.f.b.l.d(iVar, "");
            h.f.b.l.d(countdownState2, "");
            f.a(this.this$0).a((int) countdownState2.getStartTime(), (int) (countdownState2.getStartTime() + countdownState2.getMaxDuration()));
            f.a(this.this$0).a(countdownState2.getWaveInfo(), com.ss.android.ugc.aweme.port.in.c.f115629h.b(countdownState2.getMusicPath()));
            f.a(this.this$0).setTotalTime(countdownState2.getTotalTime());
            f.a(this.this$0).setPastPosition((int) (Math.max(0L, countdownState2.getSdkRecordTime()) + countdownState2.getStartTime()));
            f.a(this.this$0).setStopPosition((int) (Math.max(0L, countdownState2.getMaxDuration()) + countdownState2.getStartTime()));
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Long, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(82225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(2);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Long l2) {
            long longValue = l2.longValue();
            h.f.b.l.d(iVar, "");
            f.b(this.this$0).setText(new StringBuilder().append(longValue / 1000).append('s').toString());
            f.c(this.this$0).setText(a.a(((float) longValue) / 1000.0f) + 's');
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        this.z = new SafeHandler(this);
        this.f125193h.a_(d.f125199a);
        View a2 = com.a.a(layoutInflater, R.layout.a1l, viewGroup, false);
        h.f.b.l.b(a2, "");
        a2.setMinimumWidth(100000);
        View findViewById = a2.findViewById(R.id.fkp);
        h.f.b.l.b(findViewById, "");
        this.f125186a = (VolumeTapsView) findViewById;
        View findViewById2 = a2.findViewById(R.id.ek0);
        h.f.b.l.b(findViewById2, "");
        this.f125189d = (TextView) findViewById2;
        View findViewById3 = a2.findViewById(R.id.ejh);
        h.f.b.l.b(findViewById3, "");
        this.f125190e = (TextView) findViewById3;
        View findViewById4 = a2.findViewById(R.id.ejt);
        h.f.b.l.b(findViewById4, "");
        this.f125191f = (TextView) findViewById4;
        View findViewById5 = a2.findViewById(R.id.e9v);
        h.f.b.l.b(findViewById5, "");
        this.f125192g = (TextView) findViewById5;
        View findViewById6 = a2.findViewById(R.id.eml);
        h.f.b.l.b(findViewById6, "");
        this.f125196k = (ViewGroup) findViewById6;
        View findViewById7 = a2.findViewById(R.id.eja);
        h.f.b.l.b(findViewById7, "");
        this.f125197l = (TextView) findViewById7;
        View findViewById8 = a2.findViewById(R.id.afn);
        h.f.b.l.b(findViewById8, "");
        this.A = findViewById8;
        View findViewById9 = a2.findViewById(R.id.dmz);
        h.f.b.l.b(findViewById9, "");
        this.t = (RadioGroup) findViewById9;
        View findViewById10 = a2.findViewById(R.id.dhl);
        h.f.b.l.b(findViewById10, "");
        this.u = (DmtRadioButton) findViewById10;
        View findViewById11 = a2.findViewById(R.id.dhk);
        h.f.b.l.b(findViewById11, "");
        this.v = (DmtRadioButton) findViewById11;
        DmtRadioButton dmtRadioButton = this.u;
        if (dmtRadioButton == null) {
            h.f.b.l.a("countDownShortView");
        }
        TextPaint paint = dmtRadioButton.getPaint();
        h.f.b.l.b(paint, "");
        paint.setFakeBoldText(true);
        DmtRadioButton dmtRadioButton2 = this.v;
        if (dmtRadioButton2 == null) {
            h.f.b.l.a("countDownLongView");
        }
        TextPaint paint2 = dmtRadioButton2.getPaint();
        h.f.b.l.b(paint2, "");
        paint2.setFakeBoldText(true);
        if (com.ss.android.ugc.aweme.tools.c.a(this.f42913m)) {
            DmtRadioButton dmtRadioButton3 = this.u;
            if (dmtRadioButton3 == null) {
                h.f.b.l.a("countDownShortView");
            }
            dmtRadioButton3.setBackgroundResource(R.drawable.er);
            DmtRadioButton dmtRadioButton4 = this.v;
            if (dmtRadioButton4 == null) {
                h.f.b.l.a("countDownLongView");
            }
            dmtRadioButton4.setBackgroundResource(R.drawable.eo);
        }
        RadioGroup radioGroup = this.t;
        if (radioGroup == null) {
            h.f.b.l.a("countDownSwitchView");
        }
        radioGroup.setOnCheckedChangeListener(new e(this));
        com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        int countDownMode = ((IVideoRecordPreferences) aVar.a(t2, IVideoRecordPreferences.class)).getCountDownMode(3);
        this.f125195j = countDownMode;
        if (countDownMode == 3) {
            DmtRadioButton dmtRadioButton5 = this.u;
            if (dmtRadioButton5 == null) {
                h.f.b.l.a("countDownShortView");
            }
            dmtRadioButton5.setChecked(true);
        } else {
            DmtRadioButton dmtRadioButton6 = this.v;
            if (dmtRadioButton6 == null) {
                h.f.b.l.a("countDownLongView");
            }
            dmtRadioButton6.setChecked(true);
        }
        TextView textView = this.f125192g;
        if (textView == null) {
            h.f.b.l.a("record");
        }
        textView.setOnClickListener(new View$OnClickListenerC3266f(this));
        a2.findViewById(R.id.afo).setOnClickListener(new g(this));
        View view = this.A;
        if (view == null) {
            h.f.b.l.a("countdownPanel");
        }
        f.a.b.b unused = subscribe(this.f125193h, new ah(), new i(this));
        f.a.b.b unused2 = selectSubscribe(this.f125193h, g.f125217a, new ah(), new j(this));
        VolumeTapsView volumeTapsView = this.f125186a;
        if (volumeTapsView == null) {
            h.f.b.l.a("volumeTapsView");
        }
        volumeTapsView.setOnProgressChangeListener(new k(this));
        TextView textView2 = this.f125189d;
        if (textView2 == null) {
            h.f.b.l.a("startTextView");
        }
        textView2.setText("0s");
        f.a.b.b unused3 = selectSubscribe(this.f125193h, h.f125218a, new ah(), new l(this));
        a2.getViewTreeObserver().addOnGlobalLayoutListener(new m(this, a2, view));
        return a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(long j2, long j3, long j4) {
        SafeHandler safeHandler = this.z;
        if (safeHandler == null) {
            h.f.b.l.a("safeHandler");
        }
        safeHandler.post(new o(this, j2, j3, j4));
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
