package com.bytedance.android.live.liveinteract.match.ui.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class MatchWinStreaksView extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10927d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.android.livesdkapi.depend.model.live.a.d f10928a;

    /* renamed from: b  reason: collision with root package name */
    final TextView f10929b = ((TextView) findViewById(R.id.fmm));

    /* renamed from: c  reason: collision with root package name */
    final TextView f10930c = ((TextView) findViewById(R.id.fmo));

    /* renamed from: e  reason: collision with root package name */
    private final TextView f10931e = ((TextView) findViewById(R.id.fmn));

    static {
        Covode.recordClassIndex(5846);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5847);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f10938a = new e();

        static {
            Covode.recordClassIndex(5851);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f10939a = new f();

        static {
            Covode.recordClassIndex(5852);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "animation end");
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f10940a = new g();

        static {
            Covode.recordClassIndex(5853);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "animation end");
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.live.a.d $info;
        final /* synthetic */ com.bytedance.android.livesdkapi.depend.model.live.a.d $resultInfo;
        final /* synthetic */ MatchWinStreaksView this$0;

        static {
            Covode.recordClassIndex(5850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MatchWinStreaksView matchWinStreaksView, com.bytedance.android.livesdkapi.depend.model.live.a.d dVar, com.bytedance.android.livesdkapi.depend.model.live.a.d dVar2) {
            super(0);
            this.this$0 = matchWinStreaksView;
            this.$info = dVar;
            this.$resultInfo = dVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            boolean z;
            if (this.$info.f23068c != this.$resultInfo.f23068c) {
                MatchWinStreaksView matchWinStreaksView = this.this$0;
                com.bytedance.android.livesdkapi.depend.model.live.a.d dVar = this.$resultInfo;
                com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "update count");
                com.bytedance.android.livesdkapi.depend.model.live.a.d dVar2 = matchWinStreaksView.f10928a;
                if (dVar2 == null) {
                    l.b();
                }
                if (dVar2.f23068c <= 99) {
                    z = true;
                } else {
                    z = false;
                }
                TextView textView = matchWinStreaksView.f10930c;
                l.b(textView, "");
                com.bytedance.android.livesdkapi.depend.model.live.a.d dVar3 = matchWinStreaksView.f10928a;
                if (dVar3 == null) {
                    l.b();
                }
                textView.setText(String.valueOf(dVar3.f23068c));
                com.bytedance.android.livesdkapi.depend.model.live.a.d dVar4 = matchWinStreaksView.f10928a;
                if (dVar4 == null) {
                    l.b();
                }
                matchWinStreaksView.b(dVar4, dVar);
                matchWinStreaksView.f10928a = dVar;
                matchWinStreaksView.setCountTv(dVar);
                if (!z) {
                    TextView textView2 = matchWinStreaksView.f10929b;
                    l.b(textView2, "");
                    textView2.setVisibility(0);
                    TextView textView3 = matchWinStreaksView.f10930c;
                    l.b(textView3, "");
                    textView3.setVisibility(8);
                } else if (dVar.f23067b == 1) {
                    TextView textView4 = matchWinStreaksView.f10930c;
                    l.b(textView4, "");
                    TextView textView5 = matchWinStreaksView.f10929b;
                    l.b(textView5, "");
                    com.bytedance.android.live.liveinteract.match.a.b.a(textView4, textView5, f.f10939a);
                } else {
                    TextView textView6 = matchWinStreaksView.f10930c;
                    l.b(textView6, "");
                    TextView textView7 = matchWinStreaksView.f10929b;
                    l.b(textView7, "");
                    com.bytedance.android.live.liveinteract.match.a.b.b(textView6, textView7, g.f10940a);
                }
            } else {
                com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "counts haven't change");
            }
            return z.f158842a;
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchWinStreaksView f10932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10934c;

        static {
            Covode.recordClassIndex(5848);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f10932a.setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f10932a.setVisibility(8);
        }

        public final void onAnimationRepeat(Animator animator) {
            this.f10932a.setVisibility(0);
        }

        public final void onAnimationStart(Animator animator) {
            this.f10932a.setVisibility(0);
        }

        b(MatchWinStreaksView matchWinStreaksView, h.f.a.a aVar, h.f.a.a aVar2) {
            this.f10932a = matchWinStreaksView;
            this.f10933b = aVar;
            this.f10934c = aVar2;
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MatchWinStreaksView f10935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10937c;

        static {
            Covode.recordClassIndex(5849);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.a.a aVar = this.f10937c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void onAnimationStart(Animator animator) {
            h.f.a.a aVar = this.f10936b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        c(MatchWinStreaksView matchWinStreaksView, h.f.a.a aVar, h.f.a.a aVar2) {
            this.f10935a = matchWinStreaksView;
            this.f10936b = aVar;
            this.f10937c = aVar2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setCountTv(com.bytedance.android.livesdkapi.depend.model.live.a.d dVar) {
        if (dVar.f23068c > 99) {
            TextView textView = this.f10929b;
            l.b(textView, "");
            textView.setText("99+");
            return;
        }
        TextView textView2 = this.f10929b;
        l.b(textView2, "");
        textView2.setText(String.valueOf(dVar.f23068c));
    }

    /* access modifiers changed from: package-private */
    public final void b(com.bytedance.android.livesdkapi.depend.model.live.a.d dVar, com.bytedance.android.livesdkapi.depend.model.live.a.d dVar2) {
        long j2;
        String str;
        if (dVar.f23068c > dVar2.f23068c) {
            j2 = dVar.f23068c;
        } else {
            j2 = dVar2.f23068c;
        }
        TextView textView = this.f10931e;
        l.b(textView, "");
        if (j2 > 99) {
            str = "99+";
        } else if (j2 > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MatchWinStreaksView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(7932);
        LayoutInflater.from(context).inflate(R.layout.bcj, this);
        setOrientation(0);
        setGravity(17);
        MethodCollector.o(7932);
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.live.a.d dVar, com.bytedance.android.livesdkapi.depend.model.live.a.d dVar2) {
        if (dVar == null || dVar2 == null) {
            setVisibility(8);
            return;
        }
        com.bytedance.android.live.core.c.a.a(3, "MatchWinningStreaksIcon", "set data " + dVar.f23067b);
        if (dVar2.f23067b == 0) {
            setVisibility(8);
            return;
        }
        setAlpha(1.0f);
        this.f10928a = dVar;
        setCountTv(dVar);
        b(dVar, new com.bytedance.android.livesdkapi.depend.model.live.a.d((byte) 0));
        if (dVar2.f23067b == 1) {
            setBackgroundResource(2131234890);
        } else if (dVar2.f23067b == 2) {
            setBackgroundResource(2131234889);
        }
        d dVar3 = new d(this, dVar, dVar2);
        e eVar = e.f10938a;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new b(this, dVar3, eVar));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.SCALE_X, 0.0f, 1.2f, 1.0f);
        ofFloat.setDuration(480L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.SCALE_Y, 0.0f, 1.2f, 1.0f);
        ofFloat2.setDuration(480L);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 100.0f);
        ofFloat3.setDuration(2920L);
        ofFloat3.addListener(new c(this, dVar3, eVar));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, View.ALPHA, 1.0f, 0.0f);
        ofFloat4.setDuration(400L);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat).before(ofFloat3);
        animatorSet.play(ofFloat3).before(ofFloat4);
        animatorSet.start();
    }
}
