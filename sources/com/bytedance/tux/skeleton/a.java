package com.bytedance.tux.skeleton;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.h.x;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.f.b.r;
import h.k.i;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f45315a = {new r(ab.a(a.class), "radius", "getRadius()F"), new r(ab.a(a.class), "placeholderColor", "getPlaceholderColor()I"), new r(ab.a(a.class), "pulsingColor", "getPulsingColor()I"), new r(ab.a(a.class), "isLoading", "isLoading()Z"), new r(ab.a(a.class), "animator", "getAnimator()Landroid/animation/ValueAnimator;")};

    /* renamed from: b  reason: collision with root package name */
    public static final ValueAnimator f45316b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1113a f45317c = new C1113a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f45318d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f45319e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Object> f45320f;

    /* renamed from: g  reason: collision with root package name */
    private final b f45321g;

    /* renamed from: h  reason: collision with root package name */
    private final b f45322h;

    /* renamed from: i  reason: collision with root package name */
    private final b f45323i;

    /* renamed from: j  reason: collision with root package name */
    private final b f45324j;

    /* renamed from: k  reason: collision with root package name */
    private final b f45325k;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final boolean a() {
        return ((Boolean) this.f45324j.a(this, f45315a[3])).booleanValue();
    }

    public final ValueAnimator getAnimator() {
        return (ValueAnimator) this.f45325k.a(this, f45315a[4]);
    }

    public final int getPlaceholderColor() {
        return ((Number) this.f45322h.a(this, f45315a[1])).intValue();
    }

    public final int getPulsingColor() {
        return ((Number) this.f45323i.a(this, f45315a[2])).intValue();
    }

    public final float getRadius() {
        return ((Number) this.f45321g.a(this, f45315a[0])).floatValue();
    }

    public final h getThemeConfig() {
        return (h) this.f45318d.getValue();
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        l.c(valueAnimator, "");
        this.f45325k.a(this, f45315a[4], valueAnimator);
    }

    public final void setLoading(boolean z) {
        this.f45324j.a(this, f45315a[3], Boolean.valueOf(z));
    }

    public final void setPlaceholderColor(int i2) {
        this.f45322h.a(this, f45315a[1], Integer.valueOf(i2));
    }

    public final void setPulsingColor(int i2) {
        this.f45323i.a(this, f45315a[2], Integer.valueOf(i2));
    }

    public final void setRadius(float f2) {
        this.f45321g.a(this, f45315a[0], Float.valueOf(f2));
    }

    /* renamed from: com.bytedance.tux.skeleton.a$a  reason: collision with other inner class name */
    public static final class C1113a {
        static {
            Covode.recordClassIndex(27605);
        }

        private C1113a() {
        }

        public /* synthetic */ C1113a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<ValueAnimator> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f45332a = new c();

        static {
            Covode.recordClassIndex(27607);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ ValueAnimator invoke() {
            return a.f45316b;
        }
    }

    static final class d extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.getThemeConfig().f45339d);
        }
    }

    static final class e extends m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.getThemeConfig().f45337b);
        }
    }

    static final class f extends m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.getThemeConfig().f45338c);
        }
    }

    static final class g extends m implements h.f.a.a<Float> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(27611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf((float) this.this$0.getThemeConfig().f45336a);
        }
    }

    static final class h extends m implements h.f.a.a<h> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(27612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            Context context = this.$context;
            l.c(context, "");
            return new h(context, (byte) 0);
        }
    }

    public final long getAnimationDuration() {
        return getAnimator().getDuration();
    }

    static {
        Covode.recordClassIndex(27600);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
        ofInt.setDuration(600L);
        ofInt.setRepeatCount(-1);
        ofInt.setRepeatMode(2);
        f45316b = ofInt;
    }

    public final void setAnimationDuration(long j2) {
        getAnimator().setDuration(j2);
    }

    /* access modifiers changed from: protected */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final h.f.a.a<T> f45329a;

        static {
            Covode.recordClassIndex(27606);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(h.f.a.a<? extends T> aVar) {
            l.c(aVar, "");
            this.f45329a = aVar;
        }

        public final T a(a aVar, i<?> iVar) {
            l.c(aVar, "");
            l.c(iVar, "");
            return (T) aVar.a(iVar.getName(), this.f45329a);
        }

        public final void a(a aVar, i<?> iVar, T t) {
            l.c(aVar, "");
            l.c(iVar, "");
            aVar.a(iVar.getName(), t, this.f45329a);
        }
    }

    /* access modifiers changed from: protected */
    public final <T> void a(i<? extends T> iVar, h.f.a.m<? super T, ? super T, z> mVar) {
        l.c(iVar, "");
        this.f45320f.put(iVar.getName(), mVar);
    }

    /* access modifiers changed from: protected */
    public final <T> T a(String str, h.f.a.a<? extends T> aVar) {
        T t;
        l.c(str, "");
        l.c(aVar, "");
        View view = this;
        while (view != null) {
            if ((view instanceof a) && (t = (T) ((a) view).f45319e.get(str)) != null) {
                return t;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            view = (View) parent;
        }
        return (T) aVar.invoke();
    }

    private /* synthetic */ a(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        this.f45318d = h.i.a((h.f.a.a) new h(context));
        this.f45319e = new LinkedHashMap();
        this.f45320f = new LinkedHashMap();
        this.f45321g = new b(new g(this));
        this.f45322h = new b(new e(this));
        this.f45323i = new b(new f(this));
        this.f45324j = new b(new d(this));
        this.f45325k = new b(c.f45332a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqt, R.attr.aqv, R.attr.aqx, R.attr.aqy}, i2, 0);
        if (obtainStyledAttributes.hasValue(3)) {
            l.c(obtainStyledAttributes, "");
            androidx.core.content.a.g.a(obtainStyledAttributes, 3);
            setRadius((float) obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setPlaceholderColor(androidx.core.content.a.g.b(obtainStyledAttributes, 1));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            setPulsingColor(androidx.core.content.a.g.b(obtainStyledAttributes, 2));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setLoading(androidx.core.content.a.g.a(obtainStyledAttributes));
        }
        obtainStyledAttributes.recycle();
        a(new b(this), new h.f.a.m<Float, Float, z>(this) {
            /* class com.bytedance.tux.skeleton.a.AnonymousClass1 */
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(27601);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Float f2, Float f3) {
                f3.floatValue();
                this.this$0.invalidate();
                return z.f158842a;
            }
        });
        a(new c(this), new h.f.a.m<Integer, Integer, z>(this) {
            /* class com.bytedance.tux.skeleton.a.AnonymousClass2 */
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(27602);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Integer num, Integer num2) {
                num2.intValue();
                this.this$0.invalidate();
                return z.f158842a;
            }
        });
        a(new d(this), new h.f.a.m<Integer, Integer, z>(this) {
            /* class com.bytedance.tux.skeleton.a.AnonymousClass3 */
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(27603);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Integer num, Integer num2) {
                num2.intValue();
                this.this$0.invalidate();
                return z.f158842a;
            }
        });
        a(new e(this), new h.f.a.m<Boolean, Boolean, z>(this) {
            /* class com.bytedance.tux.skeleton.a.AnonymousClass4 */
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(27604);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Boolean bool, Boolean bool2) {
                bool2.booleanValue();
                this.this$0.requestLayout();
                return z.f158842a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.tux.skeleton.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public final <T> void a(String str, T t, h.f.a.a<? extends T> aVar) {
        l.c(str, "");
        l.c(aVar, "");
        Object a2 = a(str, aVar);
        this.f45319e.put(str, t);
        Object a3 = a(str, aVar);
        if (!l.a(a2, a3)) {
            Object obj = this.f45320f.get(str);
            if (!ad.a(obj, 2)) {
                obj = null;
            }
            h.f.a.m mVar = (h.f.a.m) obj;
            if (mVar != null) {
                mVar.invoke(a2, a3);
            }
            Iterator<View> a4 = x.a(this).a();
            while (a4.hasNext()) {
                a(a4.next(), str, a2, a3);
            }
        }
    }

    private final <T> void a(View view, String str, T t, T t2) {
        if (view != null) {
            boolean z = true;
            if (view instanceof a) {
                a aVar = (a) view;
                if (aVar.f45319e.get(str) == null) {
                    Object obj = aVar.f45320f.get(str);
                    if (!ad.a(obj, 2)) {
                        obj = null;
                    }
                    h.f.a.m mVar = (h.f.a.m) obj;
                    if (mVar != null) {
                        mVar.invoke(t, t2);
                    }
                } else {
                    z = false;
                }
            }
            if ((view instanceof ViewGroup) && z) {
                Iterator<View> a2 = x.a((ViewGroup) view).a();
                while (a2.hasNext()) {
                    a(a2.next(), str, t, t2);
                }
            }
        }
    }
}
