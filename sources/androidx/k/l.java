package androidx.k;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;

public final class l extends aj {
    private static final TimeInterpolator q = new DecelerateInterpolator();
    private static final TimeInterpolator r = new AccelerateInterpolator();
    private static final a t = new b() {
        /* class androidx.k.l.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1214);
        }

        @Override // androidx.k.l.a
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final a u = new b() {
        /* class androidx.k.l.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1215);
        }

        @Override // androidx.k.l.a
        public final float a(ViewGroup viewGroup, View view) {
            if (v.e(viewGroup) == 1) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    };
    private static final a v = new c() {
        /* class androidx.k.l.AnonymousClass3 */

        static {
            Covode.recordClassIndex(1216);
        }

        @Override // androidx.k.l.a
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    };
    private static final a w = new b() {
        /* class androidx.k.l.AnonymousClass4 */

        static {
            Covode.recordClassIndex(1217);
        }

        @Override // androidx.k.l.a
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private static final a x = new b() {
        /* class androidx.k.l.AnonymousClass5 */

        static {
            Covode.recordClassIndex(1218);
        }

        @Override // androidx.k.l.a
        public final float a(ViewGroup viewGroup, View view) {
            if (v.e(viewGroup) == 1) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    };
    private static final a y = new c() {
        /* class androidx.k.l.AnonymousClass6 */

        static {
            Covode.recordClassIndex(1219);
        }

        @Override // androidx.k.l.a
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f3319a = 80;
    private a s = y;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(1220);
        }

        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    static abstract class b implements a {
        static {
            Covode.recordClassIndex(1221);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // androidx.k.l.a
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    static abstract class c implements a {
        static {
            Covode.recordClassIndex(1222);
        }

        private c() {
        }

        /* synthetic */ c(byte b2) {
            this();
        }

        @Override // androidx.k.l.a
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public l() {
        a(80);
    }

    static {
        Covode.recordClassIndex(1213);
    }

    @Override // androidx.k.m, androidx.k.aj
    public final void a(s sVar) {
        super.a(sVar);
        d(sVar);
    }

    @Override // androidx.k.m, androidx.k.aj
    public final void b(s sVar) {
        super.b(sVar);
        d(sVar);
    }

    private static void d(s sVar) {
        int[] iArr = new int[2];
        sVar.f3356b.getLocationOnScreen(iArr);
        sVar.f3355a.put("android:slide:screenPosition", iArr);
    }

    public final void a(int i2) {
        if (i2 == 3) {
            this.s = t;
        } else if (i2 == 5) {
            this.s = w;
        } else if (i2 == 48) {
            this.s = v;
        } else if (i2 == 80) {
            this.s = y;
        } else if (i2 == 8388611) {
            this.s = u;
        } else if (i2 == 8388613) {
            this.s = x;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f3319a = i2;
        k kVar = new k();
        kVar.f3317a = i2;
        a(kVar);
    }

    @Override // androidx.k.aj
    public final Animator a(ViewGroup viewGroup, View view, s sVar) {
        if (sVar == null) {
            return null;
        }
        int[] iArr = (int[]) sVar.f3355a.get("android:slide:screenPosition");
        return u.a(view, sVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.s.a(viewGroup, view), this.s.b(viewGroup, view), r);
    }

    @Override // androidx.k.aj
    public final Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        if (sVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) sVar2.f3355a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return u.a(view, sVar2, iArr[0], iArr[1], this.s.a(viewGroup, view), this.s.b(viewGroup, view), translationX, translationY, q);
    }
}
