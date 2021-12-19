package com.bytedance.android.live.liveinteract.cohost.ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class LinkCrossTitleLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f10418b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f10419a;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f10420c;

    static {
        Covode.recordClassIndex(5522);
    }

    public LinkCrossTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f10420c == null) {
            this.f10420c = new HashMap();
        }
        View view = (View) this.f10420c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f10420c.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5523);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ LinkCrossTitleLayout this$0;

        static {
            Covode.recordClassIndex(5524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(LinkCrossTitleLayout linkCrossTitleLayout) {
            super(0);
            this.this$0 = linkCrossTitleLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            AnimatorSet animatorSet = this.this$0.f10419a;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.this$0.f10419a;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                }
                AnimatorSet animatorSet3 = this.this$0.f10419a;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
                this.this$0.f10419a = null;
            }
        }
    }

    public static final class i extends m implements h.f.a.a<z> {
        final /* synthetic */ b $clearMvpAnimation$1;
        final /* synthetic */ g $createLastSecondAlphaAnimation$6;
        final /* synthetic */ e $createLastSecondScaleAnimation$4;
        final /* synthetic */ LinkCrossTitleLayout this$0;

        static {
            Covode.recordClassIndex(5531);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(LinkCrossTitleLayout linkCrossTitleLayout, b bVar, e eVar, g gVar) {
            super(0);
            this.this$0 = linkCrossTitleLayout;
            this.$clearMvpAnimation$1 = bVar;
            this.$createLastSecondScaleAnimation$4 = eVar;
            this.$createLastSecondAlphaAnimation$6 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            this.$clearMvpAnimation$1.a();
            this.this$0.f10419a = new AnimatorSet();
            AnimatorSet a2 = this.$createLastSecondScaleAnimation$4.invoke();
            AnimatorSet a3 = this.$createLastSecondAlphaAnimation$6.invoke();
            AnimatorSet animatorSet = this.this$0.f10419a;
            if (animatorSet != null) {
                animatorSet.playTogether(a2, a3);
            }
            AnimatorSet animatorSet2 = this.this$0.f10419a;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    public static final class j extends m implements h.f.a.a<z> {
        final /* synthetic */ b $clearMvpAnimation$1;
        final /* synthetic */ h $createStartAlphaAnimation$7;
        final /* synthetic */ f $createStartScaleAnimation$5;
        final /* synthetic */ LinkCrossTitleLayout this$0;

        static {
            Covode.recordClassIndex(5532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(LinkCrossTitleLayout linkCrossTitleLayout, b bVar, f fVar, h hVar) {
            super(0);
            this.this$0 = linkCrossTitleLayout;
            this.$clearMvpAnimation$1 = bVar;
            this.$createStartScaleAnimation$5 = fVar;
            this.$createStartAlphaAnimation$7 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            this.$clearMvpAnimation$1.a();
            this.this$0.f10419a = new AnimatorSet();
            AnimatorSet a2 = this.$createStartScaleAnimation$5.invoke();
            AnimatorSet a3 = this.$createStartAlphaAnimation$7.invoke();
            AnimatorSet animatorSet = this.this$0.f10419a;
            if (animatorSet != null) {
                animatorSet.playTogether(a2, a3);
            }
            AnimatorSet animatorSet2 = this.this$0.f10419a;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    public static final class f extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ c $generateScaleAnimation$2;

        static {
            Covode.recordClassIndex(5528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(c cVar) {
            super(0);
            this.$generateScaleAnimation$2 = cVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.$generateScaleAnimation$2.a(0.0f, 1.25f, 240), this.$generateScaleAnimation$2.a(1.25f, 0.9f, 200), this.$generateScaleAnimation$2.a(0.9f, 1.0f, 120));
            return animatorSet;
        }
    }

    public static final class g extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ d $generateAlphaAnimation$3;

        static {
            Covode.recordClassIndex(5529);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(d dVar) {
            super(0);
            this.$generateAlphaAnimation$3 = dVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.$generateAlphaAnimation$3.a(0.0f, 1.0f, 120), this.$generateAlphaAnimation$3.a(1.0f, 1.0f, 1320), this.$generateAlphaAnimation$3.a(1.0f, 0.0f, 880));
            return animatorSet;
        }
    }

    public static final class h extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ d $generateAlphaAnimation$3;

        static {
            Covode.recordClassIndex(5530);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(d dVar) {
            super(0);
            this.$generateAlphaAnimation$3 = dVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.$generateAlphaAnimation$3.a(0.0f, 1.0f, 120), this.$generateAlphaAnimation$3.a(1.0f, 1.0f, 680), this.$generateAlphaAnimation$3.a(1.0f, 1.0f, 200));
            return animatorSet;
        }
    }

    public static final class e extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ c $generateScaleAnimation$2;

        static {
            Covode.recordClassIndex(5527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(0);
            this.$generateScaleAnimation$2 = cVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.$generateScaleAnimation$2.a(0.0f, 0.9f, 120), this.$generateScaleAnimation$2.a(0.9f, 1.25f, 520), this.$generateScaleAnimation$2.a(1.25f, 0.6f, 160), this.$generateScaleAnimation$2.a(0.6f, 1.1f, 120), this.$generateScaleAnimation$2.a(1.1f, 0.9f, 120), this.$generateScaleAnimation$2.a(0.9f, 1.0f, 80));
            return animatorSet;
        }
    }

    public final void a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.c4w);
        l.b(constraintLayout, "");
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) a(R.id.c4x);
        l.b(linearLayout, "");
        linearLayout.setVisibility(8);
        HSImageView hSImageView = (HSImageView) a(R.id.by6);
        l.b(hSImageView, "");
        hSImageView.setVisibility(0);
        k.a((HSImageView) a(R.id.by6), "tiktok_live_interaction_resource", "ttlive_icon_in_likmic.webp");
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8568);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8568);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ LinkCrossTitleLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    public static final class c extends m implements q<Float, Float, Long, AnimatorSet> {
        final /* synthetic */ View $countdownView;

        static {
            Covode.recordClassIndex(5525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(3);
            this.$countdownView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ AnimatorSet invoke(Float f2, Float f3, Long l2) {
            return a(f2.floatValue(), f3.floatValue(), l2.longValue());
        }

        public final AnimatorSet a(float f2, float f3, long j2) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.$countdownView, "scaleX", f2, f3), ObjectAnimator.ofFloat(this.$countdownView, "scaleY", f2, f3));
            animatorSet.setDuration(j2);
            return animatorSet;
        }
    }

    public static final class d extends m implements q<Float, Float, Long, AnimatorSet> {
        final /* synthetic */ View $countdownView;

        static {
            Covode.recordClassIndex(5526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(3);
            this.$countdownView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ AnimatorSet invoke(Float f2, Float f3, Long l2) {
            return a(f2.floatValue(), f3.floatValue(), l2.longValue());
        }

        public final AnimatorSet a(float f2, float f3, long j2) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.$countdownView, "alpha", f2, f3));
            animatorSet.setDuration(j2);
            return animatorSet;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LinkCrossTitleLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(8574);
        com.a.a(LayoutInflater.from(context), R.layout.bby, this, true);
        MethodCollector.o(8574);
    }
}
