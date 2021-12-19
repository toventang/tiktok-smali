package com.bytedance.android.live.liveinteract.cohost.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f10453a;

    /* renamed from: b  reason: collision with root package name */
    private final h f10454b;

    /* renamed from: c  reason: collision with root package name */
    private final h f10455c;

    /* renamed from: d  reason: collision with root package name */
    private final h f10456d;

    /* renamed from: e  reason: collision with root package name */
    private final h f10457e;

    /* renamed from: f  reason: collision with root package name */
    private final h f10458f;

    static {
        Covode.recordClassIndex(5552);
    }

    private final Animation getMAnimation1() {
        return (Animation) this.f10457e.getValue();
    }

    private final Animation getMAnimation2() {
        return (Animation) this.f10458f.getValue();
    }

    public final View getMAnimView1() {
        return (View) this.f10454b.getValue();
    }

    public final View getMAnimView2() {
        return (View) this.f10455c.getValue();
    }

    public final VHeadView getMUserAvatar() {
        return (VHeadView) this.f10456d.getValue();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$a  reason: collision with other inner class name */
    static final class C0184a extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0184a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.fjc);
        }
    }

    static final class b extends m implements h.f.a.a<View> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.fjd);
        }
    }

    static final class e extends m implements h.f.a.a<VHeadView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ VHeadView invoke() {
            return this.this$0.findViewById(R.id.c09);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f.a.b.b bVar = this.f10453a;
        if (bVar != null) {
            bVar.dispose();
        }
        getMAnimation1().cancel();
        getMAnimation2().cancel();
    }

    static final class c extends m implements h.f.a.a<Animation> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Animation invoke() {
            MethodCollector.i(8319);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.ej);
            loadAnimation.setDuration(1300);
            loadAnimation.setRepeatCount(1);
            loadAnimation.setInterpolator(new LinearInterpolator());
            loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0185a(this));
            MethodCollector.o(8319);
            return loadAnimation;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$c$a  reason: collision with other inner class name */
        public static final class animation.Animation$AnimationListenerC0185a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f10459a;

            static {
                Covode.recordClassIndex(5556);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            animation.Animation$AnimationListenerC0185a(c cVar) {
                this.f10459a = cVar;
            }

            public final void onAnimationEnd(Animation animation) {
                n.a(this.f10459a.this$0.getMAnimView1(), 4);
                this.f10459a.this$0.getMAnimView2().setAlpha(1.0f);
                this.f10459a.this$0.getMAnimView2().setScaleX(1.0f);
                this.f10459a.this$0.getMAnimView2().setScaleY(1.0f);
            }
        }
    }

    static final class d extends m implements h.f.a.a<Animation> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Animation invoke() {
            MethodCollector.i(8883);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.this$0.getContext(), R.anim.ej);
            loadAnimation.setDuration(1300);
            loadAnimation.setStartOffset(700);
            loadAnimation.setRepeatCount(1);
            loadAnimation.setInterpolator(new LinearInterpolator());
            loadAnimation.setAnimationListener(new animation.Animation$AnimationListenerC0186a(this));
            MethodCollector.o(8883);
            return loadAnimation;
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.a$d$a  reason: collision with other inner class name */
        public static final class animation.Animation$AnimationListenerC0186a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f10460a;

            static {
                Covode.recordClassIndex(5558);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            animation.Animation$AnimationListenerC0186a(d dVar) {
                this.f10460a = dVar;
            }

            public final void onAnimationEnd(Animation animation) {
                n.a(this.f10460a.this$0.getMAnimView2(), 4);
                this.f10460a.this$0.getMAnimView2().setAlpha(1.0f);
                this.f10460a.this$0.getMAnimView2().setScaleX(1.0f);
                this.f10460a.this$0.getMAnimView2().setScaleY(1.0f);
            }
        }
    }

    public final void a() {
        n.a(getMAnimView1(), 0);
        getMAnimView1().startAnimation(getMAnimation1());
        n.a(getMAnimView2(), 0);
        getMAnimView2().startAnimation(getMAnimation2());
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10461a;

        static {
            Covode.recordClassIndex(5560);
        }

        public f(a aVar) {
            this.f10461a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f10461a.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(9096);
        this.f10454b = i.a((h.f.a.a) new C0184a(this));
        this.f10455c = i.a((h.f.a.a) new b(this));
        this.f10456d = i.a((h.f.a.a) new e(this));
        this.f10457e = i.a((h.f.a.a) new c(this));
        this.f10458f = i.a((h.f.a.a) new d(this));
        LayoutInflater.from(getContext()).inflate(R.layout.bfn, this);
        MethodCollector.o(9096);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
