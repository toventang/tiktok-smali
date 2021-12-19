package androidx.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.k.a;
import androidx.k.m;
import com.bytedance.covode.number.Covode;

public abstract class aj extends m {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f3244a = {"android:visibility:visibility", "android:visibility:parent"};
    public int p = 3;

    public Animator a(ViewGroup viewGroup, View view, s sVar) {
        return null;
    }

    public Animator a(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f3254a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3255b;

        /* renamed from: c  reason: collision with root package name */
        int f3256c;

        /* renamed from: d  reason: collision with root package name */
        int f3257d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f3258e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f3259f;

        static {
            Covode.recordClassIndex(1181);
        }

        b() {
        }
    }

    static {
        Covode.recordClassIndex(1178);
    }

    static class a extends AnimatorListenerAdapter implements a.AbstractC0048a, m.c {

        /* renamed from: a  reason: collision with root package name */
        boolean f3248a;

        /* renamed from: b  reason: collision with root package name */
        private final View f3249b;

        /* renamed from: c  reason: collision with root package name */
        private final int f3250c;

        /* renamed from: d  reason: collision with root package name */
        private final ViewGroup f3251d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f3252e = true;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3253f;

        static {
            Covode.recordClassIndex(1180);
        }

        @Override // androidx.k.m.c
        public final void d(m mVar) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        private void a() {
            if (!this.f3248a) {
                ae.a(this.f3249b, this.f3250c);
                ViewGroup viewGroup = this.f3251d;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        public final void onAnimationCancel(Animator animator) {
            this.f3248a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // androidx.k.m.c
        public final void a(m mVar) {
            a();
            mVar.b(this);
        }

        @Override // androidx.k.m.c
        public final void b(m mVar) {
            a(false);
        }

        @Override // androidx.k.m.c
        public final void c(m mVar) {
            a(true);
        }

        @Override // androidx.k.a.AbstractC0048a
        public final void onAnimationPause(Animator animator) {
            if (!this.f3248a) {
                ae.a(this.f3249b, this.f3250c);
            }
        }

        @Override // androidx.k.a.AbstractC0048a
        public final void onAnimationResume(Animator animator) {
            if (!this.f3248a) {
                ae.a(this.f3249b, 0);
            }
        }

        private void a(boolean z) {
            ViewGroup viewGroup;
            if (this.f3252e && this.f3253f != z && (viewGroup = this.f3251d) != null) {
                this.f3253f = z;
                y.a(viewGroup, z);
            }
        }

        a(View view, int i2) {
            this.f3249b = view;
            this.f3250c = i2;
            this.f3251d = (ViewGroup) view.getParent();
            a(true);
        }
    }

    @Override // androidx.k.m
    public final String[] a() {
        return f3244a;
    }

    @Override // androidx.k.m
    public void b(s sVar) {
        d(sVar);
    }

    @Override // androidx.k.m
    public void a(s sVar) {
        d(sVar);
    }

    public final void c(int i2) {
        if ((i2 & -4) == 0) {
            this.p = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    private static void d(s sVar) {
        sVar.f3355a.put("android:visibility:visibility", Integer.valueOf(sVar.f3356b.getVisibility()));
        sVar.f3355a.put("android:visibility:parent", sVar.f3356b.getParent());
        int[] iArr = new int[2];
        sVar.f3356b.getLocationOnScreen(iArr);
        sVar.f3355a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.k.m
    public final boolean a(s sVar, s sVar2) {
        if (sVar == null) {
            if (sVar2 == null) {
                return false;
            }
        } else if (!(sVar2 == null || sVar2.f3355a.containsKey("android:visibility:visibility") == sVar.f3355a.containsKey("android:visibility:visibility"))) {
            return false;
        }
        b b2 = b(sVar, sVar2);
        if (!b2.f3254a || (b2.f3256c != 0 && b2.f3257d != 0)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r8 == null) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.k.aj.b b(androidx.k.s r7, androidx.k.s r8) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.k.aj.b(androidx.k.s, androidx.k.s):androidx.k.aj$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (0 != 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        if (r9.f3330k != false) goto L_0x005a;
     */
    @Override // androidx.k.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator a(android.view.ViewGroup r10, androidx.k.s r11, androidx.k.s r12) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.k.aj.a(android.view.ViewGroup, androidx.k.s, androidx.k.s):android.animation.Animator");
    }
}
