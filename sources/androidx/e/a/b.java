package androidx.e.a;

import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.h.v;
import androidx.e.a.a;
import androidx.e.a.b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final d f2716a = new d("translationX") {
        /* class androidx.e.a.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(942);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getTranslationX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setTranslationX(f2);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final d f2717b = new d("translationY") {
        /* class androidx.e.a.b.AnonymousClass7 */

        static {
            Covode.recordClassIndex(953);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getTranslationY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setTranslationY(f2);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final d f2718c = new d("translationZ") {
        /* class androidx.e.a.b.AnonymousClass8 */

        static {
            Covode.recordClassIndex(954);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            View view2 = view;
            if (Build.VERSION.SDK_INT >= 21) {
                return view2.getTranslationZ();
            }
            return 0.0f;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            v.b(view, f2);
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public static final d f2719d = new d("scaleX") {
        /* class androidx.e.a.b.AnonymousClass9 */

        static {
            Covode.recordClassIndex(955);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getScaleX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setScaleX(f2);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public static final d f2720e = new d("scaleY") {
        /* class androidx.e.a.b.AnonymousClass10 */

        static {
            Covode.recordClassIndex(943);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getScaleY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setScaleY(f2);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public static final d f2721f = new d("rotation") {
        /* class androidx.e.a.b.AnonymousClass11 */

        static {
            Covode.recordClassIndex(944);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getRotation();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setRotation(f2);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final d f2722g = new d("rotationX") {
        /* class androidx.e.a.b.AnonymousClass12 */

        static {
            Covode.recordClassIndex(945);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getRotationX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setRotationX(f2);
        }
    };

    /* renamed from: h  reason: collision with root package name */
    public static final d f2723h = new d("rotationY") {
        /* class androidx.e.a.b.AnonymousClass13 */

        static {
            Covode.recordClassIndex(946);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getRotationY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setRotationY(f2);
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public static final d f2724i = new d("x") {
        /* class androidx.e.a.b.AnonymousClass14 */

        static {
            Covode.recordClassIndex(947);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setX(f2);
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public static final d f2725j = new d("y") {
        /* class androidx.e.a.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(948);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setY(f2);
        }
    };

    /* renamed from: k  reason: collision with root package name */
    public static final d f2726k = new d("z") {
        /* class androidx.e.a.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(949);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return v.w(view);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            v.c(view, f2);
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public static final d f2727l = new d("alpha") {
        /* class androidx.e.a.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(950);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return view.getAlpha();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setAlpha(f2);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    public static final d f2728m = new d("scrollX") {
        /* class androidx.e.a.b.AnonymousClass5 */

        static {
            Covode.recordClassIndex(951);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return (float) view.getScrollX();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setScrollX((int) f2);
        }
    };
    public static final d n = new d("scrollY") {
        /* class androidx.e.a.b.AnonymousClass6 */

        static {
            Covode.recordClassIndex(952);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.e.a.c
        public final /* synthetic */ float a(View view) {
            return (float) view.getScrollY();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, float] */
        @Override // androidx.e.a.c
        public final /* synthetic */ void a(View view, float f2) {
            view.setScrollY((int) f2);
        }
    };
    float o;
    float p = Float.MAX_VALUE;
    boolean q;
    final Object r;
    final c s;
    public boolean t;
    float u = Float.MAX_VALUE;
    float v = (-Float.MAX_VALUE);
    public float w;
    private long x;
    private final ArrayList<AbstractC0041b> y = new ArrayList<>();
    private final ArrayList<c> z = new ArrayList<>();

    /* renamed from: androidx.e.a.b$b  reason: collision with other inner class name */
    public interface AbstractC0041b {
        static {
            Covode.recordClassIndex(957);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(958);
        }

        void a();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(long j2);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        float f2729a;

        /* renamed from: b  reason: collision with root package name */
        float f2730b;

        static {
            Covode.recordClassIndex(956);
        }

        a() {
        }
    }

    public final void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        } else if (this.t) {
            c();
        }
    }

    private void c() {
        this.t = false;
        a.a().a(this);
        this.x = 0;
        this.q = false;
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            if (this.y.get(i2) != null) {
                this.y.get(i2).a();
            }
        }
        a(this.y);
    }

    public void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (!this.t) {
            this.t = true;
            if (!this.q) {
                this.p = this.s.a(this.r);
            }
            float f2 = this.p;
            if (f2 > this.u || f2 < this.v) {
                throw new IllegalArgumentException("Starting value need to be in between min value and max value");
            }
            a a2 = a.a();
            if (a2.f2702c.size() == 0) {
                a2.b().a();
            }
            if (!a2.f2702c.contains(this)) {
                a2.f2702c.add(this);
            }
        }
    }

    static {
        Covode.recordClassIndex(941);
    }

    public static abstract class d extends c<View> {
        static {
            Covode.recordClassIndex(959);
        }

        private d(String str) {
            super(str);
        }

        /* synthetic */ d(String str, byte b2) {
            this(str);
        }
    }

    public final T a(float f2) {
        this.o = f2;
        return this;
    }

    public final T b(float f2) {
        this.u = f2;
        return this;
    }

    public final T c(float f2) {
        this.v = f2;
        return this;
    }

    public final T a(AbstractC0041b bVar) {
        if (!this.y.contains(bVar)) {
            this.y.add(bVar);
        }
        return this;
    }

    private static <T> void a(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void d(float f2) {
        this.s.a(this.r, f2);
        for (int i2 = 0; i2 < this.z.size(); i2++) {
            if (this.z.get(i2) != null) {
                this.z.get(i2).a();
            }
        }
        a(this.z);
    }

    public final T a(c cVar) {
        if (!this.t) {
            if (!this.z.contains(cVar)) {
                this.z.add(cVar);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    @Override // androidx.e.a.a.b
    public final boolean a(long j2) {
        long j3 = this.x;
        if (j3 == 0) {
            this.x = j2;
            d(this.p);
            return false;
        }
        this.x = j2;
        boolean b2 = b(j2 - j3);
        float min = Math.min(this.p, this.u);
        this.p = min;
        float max = Math.max(min, this.v);
        this.p = max;
        d(max);
        if (b2) {
            c();
        }
        return b2;
    }

    <K> b(K k2, c<K> cVar) {
        this.r = k2;
        this.s = cVar;
        if (cVar == f2721f || cVar == f2722g || cVar == f2723h) {
            this.w = 0.1f;
        } else if (cVar == f2727l) {
            this.w = 0.00390625f;
        } else if (cVar == f2719d || cVar == f2720e) {
            this.w = 0.00390625f;
        } else {
            this.w = 1.0f;
        }
    }
}
