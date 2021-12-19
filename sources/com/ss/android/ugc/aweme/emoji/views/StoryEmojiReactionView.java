package com.ss.android.ugc.aweme.emoji.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class StoryEmojiReactionView extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f89471c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public v<p<View, String>> f89472a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f89473b;

    /* renamed from: d  reason: collision with root package name */
    private final t<p<View, String>> f89474d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f89475e;

    /* renamed from: f  reason: collision with root package name */
    private final DecelerateInterpolator f89476f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f89477g;

    /* renamed from: h  reason: collision with root package name */
    private d f89478h;

    public interface d {
        static {
            Covode.recordClassIndex(56233);
        }

        void a(c cVar, Aweme aweme);
    }

    static {
        Covode.recordClassIndex(56225);
    }

    public StoryEmojiReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final com.bytedance.tux.h.g getVibrationHelper() {
        return (com.bytedance.tux.h.g) this.f89477g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56230);
        }

        public static String a(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : "😂" : "😍" : "👏";
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Aweme getBindAweme() {
        return this.f89473b;
    }

    static final class j extends m implements h.f.a.a<com.bytedance.tux.h.g> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(56239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.h.g invoke() {
            return new com.bytedance.tux.h.g(this.$context);
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f89493a = new i();

        static {
            Covode.recordClassIndex(56238);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((Throwable) obj).getMessage();
        }
    }

    public final void setStoryEmojiReactionListener(d dVar) {
        l.d(dVar, "");
        this.f89478h = dVar;
    }

    public final synchronized void a(Aweme aweme) {
        MethodCollector.i(544);
        this.f89473b = aweme;
        MethodCollector.o(544);
    }

    /* access modifiers changed from: package-private */
    public static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f89488a;

        static {
            Covode.recordClassIndex(56234);
        }

        e(View view) {
            this.f89488a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type android.graphics.PointF");
            PointF pointF = (PointF) animatedValue;
            this.f89488a.setX(pointF.x);
            this.f89488a.setY(pointF.y);
        }
    }

    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f89489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f89490b;

        static {
            Covode.recordClassIndex(56235);
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.i(89);
            super.onAnimationEnd(animator);
            this.f89489a.removeView(this.f89490b);
            MethodCollector.o(89);
        }

        f(ViewGroup viewGroup, View view) {
            this.f89489a = viewGroup;
            this.f89490b = view;
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f89491a;

        static {
            Covode.recordClassIndex(56236);
        }

        g(List list) {
            this.f89491a = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((Animator) this.f89491a.get((int) ((Long) obj).longValue())).start();
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryEmojiReactionView f89492a;

        static {
            Covode.recordClassIndex(56237);
        }

        h(StoryEmojiReactionView storyEmojiReactionView) {
            this.f89492a = storyEmojiReactionView;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            int i2;
            MethodCollector.i(1507);
            p pVar = (p) obj;
            if (Build.VERSION.SDK_INT >= 29) {
                com.bytedance.tux.h.g vibrationHelper = this.f89492a.getVibrationHelper();
                if (vibrationHelper != null) {
                    vibrationHelper.b();
                }
            } else {
                com.bytedance.tux.h.g vibrationHelper2 = this.f89492a.getVibrationHelper();
                if (vibrationHelper2 != null) {
                    vibrationHelper2.a();
                }
            }
            StoryEmojiReactionView storyEmojiReactionView = this.f89492a;
            View view = (View) pVar.getFirst();
            String str = (String) pVar.getSecond();
            Context context = view.getContext();
            l.b(context, "");
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        Activity activity = (Activity) context;
                        if (activity != null) {
                            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
                            Rect rect = new Rect();
                            Rect rect2 = new Rect();
                            view.getGlobalVisibleRect(rect);
                            viewGroup.getGlobalVisibleRect(rect2);
                            int i3 = rect.left;
                            int i4 = rect.top;
                            int i5 = rect.right;
                            int i6 = rect.bottom;
                            int i7 = rect2.left;
                            int i8 = rect2.top;
                            int i9 = rect2.right;
                            int i10 = rect2.bottom;
                            com.bytedance.ies.dmt.ui.f.b.a(activity);
                            if (com.bytedance.tux.h.i.a(activity)) {
                                i2 = (rect2.right - rect.left) - (rect.right - rect.left);
                            } else {
                                i2 = rect.left;
                            }
                            Point point = new Point(i2, rect.top - rect2.top);
                            Point point2 = new Point(rect.left, rect.top - rect2.top);
                            View a2 = storyEmojiReactionView.a(point, str);
                            View a3 = storyEmojiReactionView.a(point, str);
                            View a4 = storyEmojiReactionView.a(point, str);
                            l.b(viewGroup, "");
                            Animator a5 = storyEmojiReactionView.a(viewGroup, a2, point2, 0.71f);
                            Animator a6 = storyEmojiReactionView.a(viewGroup, a3, point2, 1.14f);
                            Animator a7 = storyEmojiReactionView.a(viewGroup, a4, point2, 1.85f);
                            viewGroup.addView(a2);
                            viewGroup.addView(a3);
                            viewGroup.addView(a4);
                            ArrayList d2 = n.d(a5, a6, a7);
                            if (d2 != null) {
                                t.a(0, (long) d2.size(), 0, 100, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new g(d2));
                                MethodCollector.o(1507);
                                return;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            MethodCollector.o(1507);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f89486a;

        /* renamed from: b  reason: collision with root package name */
        public final String f89487b;

        static {
            Covode.recordClassIndex(56232);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f89486a == cVar.f89486a && l.a(this.f89487b, cVar.f89487b);
        }

        public final int hashCode() {
            int i2 = this.f89486a * 31;
            String str = this.f89487b;
            return i2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "EmojiReaction(emojiId=" + this.f89486a + ", emojiText=" + this.f89487b + ")";
        }

        public c(int i2, String str) {
            l.d(str, "");
            this.f89486a = i2;
            this.f89487b = str;
        }
    }

    public final void a(TextView textView, c cVar) {
        d dVar = this.f89478h;
        if (dVar != null) {
            dVar.a(cVar, this.f89473b);
        }
        v<p<View, String>> vVar = this.f89472a;
        if (vVar != null) {
            vVar.a(new p<>(textView, cVar.f89487b));
        }
    }

    /* access modifiers changed from: package-private */
    public final View a(Point point, String str) {
        Context context = getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(11);
        tuxTextView.setTextColor(-16777216);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setGravity(17);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        tuxTextView.setLayoutParams(new FrameLayout.LayoutParams(a2, h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics()))));
        tuxTextView.setX((float) point.x);
        tuxTextView.setY((float) point.y);
        return tuxTextView;
    }

    private /* synthetic */ StoryEmojiReactionView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    public static final class b implements TypeEvaluator<PointF> {
        static {
            Covode.recordClassIndex(56231);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ PointF evaluate(float f2, PointF pointF, PointF pointF2) {
            PointF pointF3 = pointF;
            PointF pointF4 = pointF2;
            l.d(pointF3, "");
            l.d(pointF4, "");
            PointF pointF5 = new PointF();
            pointF5.x = ((pointF4.x - pointF3.x) * f2) + pointF3.x;
            pointF5.y = ((pointF4.y - pointF3.y) * f2) + pointF3.y;
            return pointF5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryEmojiReactionView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(553);
        this.f89475e = new Random();
        this.f89476f = new DecelerateInterpolator();
        this.f89477g = h.i.a((h.f.a.a) new j(context));
        t<p<View, String>> a2 = t.a(new w(this) {
            /* class com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ StoryEmojiReactionView f89479a;

            static {
                Covode.recordClassIndex(56226);
            }

            {
                this.f89479a = r1;
            }

            @Override // f.a.w
            public final void subscribe(v<p<View, String>> vVar) {
                l.d(vVar, "");
                this.f89479a.f89472a = vVar;
            }
        });
        l.b(a2, "");
        this.f89474d = a2;
        a2.g(300, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), i.f89493a);
        LayoutInflater.from(context).inflate(R.layout.z6, this);
        final TextView textView = (TextView) findViewById(R.id.ez3);
        final TextView textView2 = (TextView) findViewById(R.id.ets);
        final TextView textView3 = (TextView) findViewById(R.id.ett);
        textView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ StoryEmojiReactionView f89480a;

            static {
                Covode.recordClassIndex(56227);
            }

            {
                this.f89480a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                StoryEmojiReactionView storyEmojiReactionView = this.f89480a;
                TextView textView = textView;
                l.b(textView, "");
                storyEmojiReactionView.a(textView, new c(1, "👏"));
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ StoryEmojiReactionView f89482a;

            static {
                Covode.recordClassIndex(56228);
            }

            {
                this.f89482a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                StoryEmojiReactionView storyEmojiReactionView = this.f89482a;
                TextView textView = textView2;
                l.b(textView, "");
                storyEmojiReactionView.a(textView, new c(2, "😍"));
            }
        });
        textView3.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ StoryEmojiReactionView f89484a;

            static {
                Covode.recordClassIndex(56229);
            }

            {
                this.f89484a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                StoryEmojiReactionView storyEmojiReactionView = this.f89484a;
                TextView textView = textView3;
                l.b(textView, "");
                storyEmojiReactionView.a(textView, new c(3, "😂"));
            }
        });
        MethodCollector.o(553);
    }

    /* access modifiers changed from: package-private */
    public final Animator a(ViewGroup viewGroup, View view, Point point, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f, f2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f, f2);
        PointF pointF = new PointF();
        int i2 = point.x;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a2 = i2 - h.g.a.a(TypedValue.applyDimension(1, 60.0f, system.getDisplayMetrics()));
        int i3 = point.x;
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        int a3 = i3 + h.g.a.a(TypedValue.applyDimension(1, 60.0f, system2.getDisplayMetrics()));
        int i4 = point.y;
        Resources system3 = Resources.getSystem();
        l.a((Object) system3, "");
        int a4 = i4 - h.g.a.a(TypedValue.applyDimension(1, 180.0f, system3.getDisplayMetrics()));
        int i5 = point.y;
        Resources system4 = Resources.getSystem();
        l.a((Object) system4, "");
        int a5 = i5 - h.g.a.a(TypedValue.applyDimension(1, 60.0f, system4.getDisplayMetrics()));
        pointF.x = (float) (this.f89475e.nextInt((a3 - a2) + 1) + a2);
        pointF.y = (float) (this.f89475e.nextInt((a5 - a4) + 1) + a4);
        ValueAnimator ofObject = ValueAnimator.ofObject(new b(), new PointF(point), pointF);
        ofObject.addUpdateListener(new e(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofObject);
        animatorSet.setInterpolator(this.f89476f);
        animatorSet.setDuration(1400L);
        animatorSet.setTarget(view);
        animatorSet.addListener(new f(viewGroup, view));
        return animatorSet;
    }
}
