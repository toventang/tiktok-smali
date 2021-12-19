package androidx.k;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public final class c extends m {
    private static final String[] p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> q = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {
        /* class androidx.k.c.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        private Rect f3264a = new Rect();

        static {
            Covode.recordClassIndex(1188);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3264a);
            return new PointF((float) this.f3264a.left, (float) this.f3264a.top);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f3264a);
            this.f3264a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f3264a);
        }
    };
    private static final Property<a, PointF> r = new Property<a, PointF>(PointF.class, "topLeft") {
        /* class androidx.k.c.AnonymousClass3 */

        static {
            Covode.recordClassIndex(1191);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, PointF pointF) {
            a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.f3283a = Math.round(pointF2.x);
            aVar2.f3284b = Math.round(pointF2.y);
            aVar2.f3287e++;
            if (aVar2.f3287e == aVar2.f3288f) {
                aVar2.a();
            }
        }
    };
    private static final Property<a, PointF> s = new Property<a, PointF>(PointF.class, "bottomRight") {
        /* class androidx.k.c.AnonymousClass4 */

        static {
            Covode.recordClassIndex(1192);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(a aVar) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(a aVar, PointF pointF) {
            a aVar2 = aVar;
            PointF pointF2 = pointF;
            aVar2.f3285c = Math.round(pointF2.x);
            aVar2.f3286d = Math.round(pointF2.y);
            aVar2.f3288f++;
            if (aVar2.f3287e == aVar2.f3288f) {
                aVar2.a();
            }
        }
    };
    private static final Property<View, PointF> t = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* class androidx.k.c.AnonymousClass5 */

        static {
            Covode.recordClassIndex(1193);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ae.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    };
    private static final Property<View, PointF> u = new Property<View, PointF>(PointF.class, "topLeft") {
        /* class androidx.k.c.AnonymousClass6 */

        static {
            Covode.recordClassIndex(1194);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            ae.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    };
    private static final Property<View, PointF> v = new Property<View, PointF>(PointF.class, "position") {
        /* class androidx.k.c.AnonymousClass7 */

        static {
            Covode.recordClassIndex(1195);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            ae.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    };
    private static i y = new i();

    /* renamed from: a  reason: collision with root package name */
    public boolean f3263a;
    private int[] w = new int[2];
    private boolean x;

    @Override // androidx.k.m
    public final String[] a() {
        return p;
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f3283a;

        /* renamed from: b  reason: collision with root package name */
        int f3284b;

        /* renamed from: c  reason: collision with root package name */
        int f3285c;

        /* renamed from: d  reason: collision with root package name */
        int f3286d;

        /* renamed from: e  reason: collision with root package name */
        int f3287e;

        /* renamed from: f  reason: collision with root package name */
        int f3288f;

        /* renamed from: g  reason: collision with root package name */
        private View f3289g;

        static {
            Covode.recordClassIndex(1198);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            ae.a(this.f3289g, this.f3283a, this.f3284b, this.f3285c, this.f3286d);
            this.f3287e = 0;
            this.f3288f = 0;
        }

        a(View view) {
            this.f3289g = view;
        }
    }

    static {
        Covode.recordClassIndex(1187);
    }

    @Override // androidx.k.m
    public final void a(s sVar) {
        d(sVar);
    }

    @Override // androidx.k.m
    public final void b(s sVar) {
        d(sVar);
    }

    private void d(s sVar) {
        View view = sVar.f3356b;
        if (v.v(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f3355a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f3355a.put("android:changeBounds:parent", sVar.f3356b.getParent());
            if (this.x) {
                sVar.f3356b.getLocationInWindow(this.w);
                sVar.f3355a.put("android:changeBounds:windowX", Integer.valueOf(this.w[0]));
                sVar.f3355a.put("android:changeBounds:windowY", Integer.valueOf(this.w[1]));
            }
            if (this.f3263a) {
                sVar.f3355a.put("android:changeBounds:clip", v.x(view));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    @Override // androidx.k.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(final android.view.ViewGroup r24, androidx.k.s r25, androidx.k.s r26) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.k.c.a(android.view.ViewGroup, androidx.k.s, androidx.k.s):android.animation.Animator");
    }
}
