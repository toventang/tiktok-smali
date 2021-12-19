package com.ss.android.ugc.aweme.g.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class d implements f {

    /* renamed from: g  reason: collision with root package name */
    public static final h.f.a.b<View, h.f.a.m<g, g, z>> f98956g = e.f98977a;

    /* renamed from: h  reason: collision with root package name */
    public static final h.f.a.b<View, h.f.a.m<Integer, Integer, z>> f98957h = C2410d.f98976a;

    /* renamed from: i  reason: collision with root package name */
    public static final c f98958i = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f98959a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f98960b;

    /* renamed from: c  reason: collision with root package name */
    public final b f98961c = new b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final h.k.e<Integer> f98962d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f98963e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f98964f;

    /* renamed from: j  reason: collision with root package name */
    private ValueAnimator f98965j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f98966k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f98967l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f98968m;

    static final class c {
        static {
            Covode.recordClassIndex(62919);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<h.f.a.m<Float, Float, z>> f98973a;

        /* renamed from: b  reason: collision with root package name */
        public float f98974b;

        /* renamed from: c  reason: collision with root package name */
        public final float f98975c;

        static {
            Covode.recordClassIndex(62918);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && Float.compare(this.f98975c, ((b) obj).f98975c) == 0;
            }
            return true;
        }

        public final String toString() {
            return "AnimationTracker(defaultCursor=" + this.f98975c + ")";
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f98975c);
        }

        private b() {
            this.f98975c = 0.0f;
            this.f98973a = new ArrayList();
            this.f98974b = 0.0f;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(float f2) {
            Iterator<T> it = this.f98973a.iterator();
            while (it.hasNext()) {
                it.next().invoke(Float.valueOf(this.f98974b), Float.valueOf(f2));
            }
            this.f98974b = f2;
        }
    }

    static {
        Covode.recordClassIndex(62916);
    }

    static final class m extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            ViewGroup.LayoutParams layoutParams = this.this$0.f98964f.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return new f(((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((Number) ((h.f.a.b) this.this$0.f98962d).invoke(Integer.valueOf((int) R.dimen.ij))).intValue(), d.f98957h.invoke(this.this$0.f98964f), this.this$0.f98961c);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<h> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            g gVar = new g(this.this$0.f98959a.getMeasuredWidth(), this.this$0.f98959a.getMeasuredHeight());
            Integer valueOf = Integer.valueOf((int) R.dimen.ie);
            return new h(gVar, new g(((Number) ((h.f.a.b) this.this$0.f98962d).invoke(valueOf)).intValue(), ((Number) ((h.f.a.b) this.this$0.f98962d).invoke(valueOf)).intValue()), d.f98956g.invoke(this.this$0.f98959a), this.this$0.f98961c);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<h> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(62934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h(new g(this.this$0.f98964f.getMeasuredWidth(), this.this$0.f98964f.getMeasuredHeight()), new g(((Number) ((h.f.a.b) this.this$0.f98962d).invoke(Integer.valueOf((int) R.dimen.ik))).intValue(), ((Number) ((h.f.a.b) this.this$0.f98962d).invoke(Integer.valueOf((int) R.dimen.ii))).intValue()), d.f98956g.invoke(this.this$0.f98964f), this.this$0.f98961c);
        }
    }

    static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public T f98969a;

        /* renamed from: b  reason: collision with root package name */
        public final T f98970b;

        /* renamed from: c  reason: collision with root package name */
        public final T f98971c;

        /* renamed from: d  reason: collision with root package name */
        public h.f.a.m<? super T, ? super T, z> f98972d;

        static {
            Covode.recordClassIndex(62917);
        }

        public final void a(T t) {
            this.f98972d.invoke(this.f98969a, t);
            this.f98969a = t;
        }

        public a(T t, T t2, h.f.a.m<? super T, ? super T, z> mVar, T t3) {
            h.f.b.l.d(mVar, "");
            this.f98970b = t;
            this.f98971c = t2;
            this.f98972d = mVar;
            this.f98969a = t3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.g.a.d$d  reason: collision with other inner class name */
    static final class C2410d extends h.f.b.m implements h.f.a.b<View, h.f.a.m<? super Integer, ? super Integer, ? extends z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2410d f98976a = new C2410d();

        static {
            Covode.recordClassIndex(62920);
        }

        C2410d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.f.a.m<? super Integer, ? super Integer, ? extends z> invoke(View view) {
            final View view2 = view;
            h.f.b.l.d(view2, "");
            return new h.f.a.m<Integer, Integer, z>() {
                /* class com.ss.android.ugc.aweme.g.a.d.C2410d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(62921);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(Integer num, Integer num2) {
                    num.intValue();
                    int intValue = num2.intValue();
                    View view = view2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = intValue;
                    view.setLayoutParams(marginLayoutParams);
                    return z.f158842a;
                }
            };
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<View, h.f.a.m<? super g, ? super g, ? extends z>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f98977a = new e();

        static {
            Covode.recordClassIndex(62922);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.f.a.m<? super g, ? super g, ? extends z> invoke(View view) {
            final View view2 = view;
            h.f.b.l.d(view2, "");
            return new h.f.a.m<g, g, z>() {
                /* class com.ss.android.ugc.aweme.g.a.d.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(62923);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(g gVar, g gVar2) {
                    g gVar3 = gVar2;
                    h.f.b.l.d(gVar, "");
                    h.f.b.l.d(gVar3, "");
                    View view = view2;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = gVar3.f98978a;
                    layoutParams.height = gVar3.f98979b;
                    view.setLayoutParams(layoutParams);
                    return z.f158842a;
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.g.a.e
    public final void a(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        a(1.0f, aVar);
    }

    @Override // com.ss.android.ugc.aweme.g.a.f
    public final void c(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        a(0.0f, aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f98980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98981b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f98982c;

        static {
            Covode.recordClassIndex(62929);
        }

        i(d dVar, h.f.a.a aVar, float f2) {
            this.f98980a = dVar;
            this.f98981b = aVar;
            this.f98982c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b bVar = this.f98980a.f98961c;
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            bVar.a(((Float) animatedValue).floatValue());
        }
    }

    public static final class j implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public TextUtils.TruncateAt f98983a = TextUtils.TruncateAt.END;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ValueAnimator f98984b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f98985c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98986d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f98987e;

        static {
            Covode.recordClassIndex(62930);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f98985c.f98960b.setEllipsize(this.f98983a);
            this.f98984b.removeAllUpdateListeners();
            this.f98984b.removeListener(this);
            this.f98986d.invoke();
        }

        public final void onAnimationStart(Animator animator) {
            TextUtils.TruncateAt ellipsize = this.f98985c.f98960b.getEllipsize();
            h.f.b.l.b(ellipsize, "");
            this.f98983a = ellipsize;
            this.f98985c.f98960b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f98985c.f98960b.setEllipsize(this.f98983a);
            this.f98984b.removeAllUpdateListeners();
            this.f98984b.removeListener(this);
            this.f98985c.f98961c.a(this.f98987e);
            this.f98986d.invoke();
        }

        j(ValueAnimator valueAnimator, d dVar, h.f.a.a aVar, float f2) {
            this.f98984b = valueAnimator;
            this.f98985c = dVar;
            this.f98986d = aVar;
            this.f98987e = f2;
        }
    }

    static final /* synthetic */ class k extends h.f.b.j implements h.f.a.b<Integer, Integer> {
        static {
            Covode.recordClassIndex(62931);
        }

        k(Resources resources) {
            super(1, resources, Resources.class, "getDimensionPixelSize", "getDimensionPixelSize(I)I", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(((Resources) this.receiver).getDimensionPixelSize(num.intValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.g.a.e
    public final void b(h.f.a.a<z> aVar) {
        h.f.b.l.d(aVar, "");
        ValueAnimator valueAnimator = this.f98965j;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            int i2 = Build.VERSION.SDK_INT;
            valueAnimator.pause();
        }
        aVar.invoke();
    }

    static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f98978a;

        /* renamed from: b  reason: collision with root package name */
        public final int f98979b;

        static {
            Covode.recordClassIndex(62926);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f98978a == gVar.f98978a && this.f98979b == gVar.f98979b;
        }

        public final int hashCode() {
            return (this.f98978a * 31) + this.f98979b;
        }

        public final String toString() {
            return "Size(width=" + this.f98978a + ", height=" + this.f98979b + ")";
        }

        public g(int i2, int i3) {
            this.f98978a = i2;
            this.f98979b = i3;
        }
    }

    public d(Context context, ViewGroup viewGroup) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(viewGroup, "");
        this.f98963e = context;
        this.f98964f = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e_2);
        h.f.b.l.b(findViewById, "");
        this.f98959a = (ImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.e_1);
        h.f.b.l.b(findViewById2, "");
        this.f98960b = (TextView) findViewById2;
        this.f98962d = new k(context.getResources());
        this.f98966k = h.i.a((h.f.a.a) new n(this));
        this.f98967l = h.i.a((h.f.a.a) new m(this));
        this.f98968m = h.i.a((h.f.a.a) new l(this));
    }

    private final void a(float f2, h.f.a.a<z> aVar) {
        float f3 = this.f98961c.f98974b;
        if (f3 != f2) {
            ValueAnimator valueAnimator = this.f98965j;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                this.f98966k.getValue();
                this.f98968m.getValue();
                this.f98967l.getValue();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f2);
                this.f98965j = ofFloat;
                if (ofFloat != null) {
                    ofFloat.setRepeatCount(0);
                    ofFloat.setDuration(300L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new i(this, aVar, f2));
                    ofFloat.addListener(new j(ofFloat, this, aVar, f2));
                    ofFloat.start();
                }
            }
        }
    }

    static final class h extends a<g> {
        static {
            Covode.recordClassIndex(62927);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(g gVar, g gVar2, h.f.a.m<? super g, ? super g, z> mVar, b bVar) {
            super(gVar, gVar2, mVar, gVar);
            h.f.b.l.d(gVar, "");
            h.f.b.l.d(gVar2, "");
            h.f.b.l.d(mVar, "");
            h.f.b.l.d(bVar, "");
            bVar.f98973a.add(new h.f.a.m<Float, Float, z>(this) {
                /* class com.ss.android.ugc.aweme.g.a.d.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(62928);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(Float f2, Float f3) {
                    f2.floatValue();
                    float floatValue = f3.floatValue();
                    h hVar = this.this$0;
                    T t = hVar.f98971c;
                    T t2 = this.this$0.f98970b;
                    h.f.b.l.d(t2, "");
                    g gVar = new g(t.f98978a - t2.f98978a, t.f98979b - t2.f98979b);
                    g gVar2 = new g((int) (((float) gVar.f98978a) * floatValue), (int) (((float) gVar.f98979b) * floatValue));
                    T t3 = this.this$0.f98970b;
                    h.f.b.l.d(t3, "");
                    hVar.a(new g(gVar2.f98978a + t3.f98978a, gVar2.f98979b + t3.f98979b));
                    return z.f158842a;
                }
            });
        }
    }

    static final class f extends a<Integer> {
        static {
            Covode.recordClassIndex(62924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(int i2, int i3, h.f.a.m<? super Integer, ? super Integer, z> mVar, b bVar) {
            super(Integer.valueOf(i2), Integer.valueOf(i3), mVar, Integer.valueOf(i2));
            h.f.b.l.d(mVar, "");
            h.f.b.l.d(bVar, "");
            bVar.f98973a.add(new h.f.a.m<Float, Float, z>(this) {
                /* class com.ss.android.ugc.aweme.g.a.d.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(62925);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // h.f.a.m
                public final /* synthetic */ z invoke(Float f2, Float f3) {
                    f2.floatValue();
                    float floatValue = f3.floatValue();
                    f fVar = this.this$0;
                    fVar.a(Integer.valueOf(((int) (((float) (fVar.f98971c.intValue() - this.this$0.f98970b.intValue())) * floatValue)) + this.this$0.f98970b.intValue()));
                    return z.f158842a;
                }
            });
        }
    }
}
