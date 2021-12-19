package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.core.h.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.af;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class j extends i implements LayoutInflater.Factory2 {
    static final Interpolator F = new DecelerateInterpolator(2.5f);
    static final Interpolator G = new DecelerateInterpolator(1.5f);
    static final Interpolator H = new AccelerateInterpolator(2.5f);
    static final Interpolator I = new AccelerateInterpolator(1.5f);

    /* renamed from: a  reason: collision with root package name */
    static boolean f2933a;
    static Field q;
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    ArrayList<C0044j> C;
    k D;
    Runnable E = new Runnable() {
        /* class androidx.fragment.app.j.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1050);
        }

        public final void run() {
            j.this.j();
        }
    };
    private final CopyOnWriteArrayList<f> J = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<h> f2934b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2935c;

    /* renamed from: d  reason: collision with root package name */
    int f2936d;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<Fragment> f2937e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    SparseArray<Fragment> f2938f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<c> f2939g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<Fragment> f2940h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<c> f2941i;

    /* renamed from: j  reason: collision with root package name */
    ArrayList<Integer> f2942j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList<i.c> f2943k;

    /* renamed from: l  reason: collision with root package name */
    int f2944l = 0;

    /* renamed from: m  reason: collision with root package name */
    h f2945m;
    f n;
    Fragment o;
    Fragment p;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    ArrayList<c> x;
    ArrayList<Boolean> y;
    ArrayList<Fragment> z;

    /* access modifiers changed from: package-private */
    public interface h {
        static {
            Covode.recordClassIndex(1063);
        }

        boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2);
    }

    @Override // androidx.fragment.app.i
    public final boolean g() {
        return this.u;
    }

    private static boolean a(Animator animator) {
        PropertyValuesHolder[] values;
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new androidx.core.g.c("FragmentManager"));
        h hVar = this.f2945m;
        if (hVar != null) {
            try {
                hVar.a("  ", printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    @Override // androidx.fragment.app.i
    public final void a(i.c cVar) {
        if (this.f2943k == null) {
            this.f2943k = new ArrayList<>();
        }
        this.f2943k.add(cVar);
    }

    @Override // androidx.fragment.app.i
    public final void a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mIndex < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, fragment.mIndex);
    }

    @Override // androidx.fragment.app.i
    public final Fragment a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        Fragment fragment = this.f2938f.get(i2);
        if (fragment == null) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        }
        return fragment;
    }

    @Override // androidx.fragment.app.i
    public final Fragment.SavedState a(Fragment fragment) {
        Bundle q2;
        if (fragment.mIndex < 0) {
            a(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (fragment.mState <= 0 || (q2 = q(fragment)) == null) {
            return null;
        }
        return new Fragment.SavedState(q2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0103 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
        // Method dump skipped, instructions count: 522
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void b(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.f2935c) {
            this.w = true;
            return;
        }
        fragment.mDeferStart = false;
        a(this, fragment, this.f2944l, 0, 0, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r6 != 3) goto L_0x0286;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.fragment.app.Fragment r14, int r15, int r16, int r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 873
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    private void a(final Fragment fragment, c cVar, int i2) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i2);
        if (cVar.f2962a != null) {
            e eVar = new e(cVar.f2962a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(a(eVar)) {
                /* class androidx.fragment.app.j.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(1051);
                }

                @Override // androidx.fragment.app.j.b
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() {
                        /* class androidx.fragment.app.j.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(1052);
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:19:0x00bc  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                            // Method dump skipped, instructions count: 202
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.AnonymousClass2.AnonymousClass1.run():void");
                        }
                    });
                }
            });
            a(view, cVar);
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f2963b;
        fragment.setAnimator(cVar.f2963b);
        animator.addListener(new AnimatorListenerAdapter() {
            /* class androidx.fragment.app.j.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1053);
            }

            public final void onAnimationEnd(Animator animator) {
                String str;
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    j jVar = j.this;
                    Fragment fragment = fragment;
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    try {
                        jVar.a(fragment, stateAfterAnimating, 0, 0, false);
                    } catch (Exception e2) {
                        try {
                            String name = fragment.getClass().getName();
                            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
                            if (j2 != null) {
                                str = j2.getClass().getName();
                            } else {
                                str = "";
                            }
                            n.a("fragment_crash_log", "", new com.ss.android.ugc.aweme.app.f.c().a("errorDesc", new com.ss.android.ugc.aweme.app.f.c().a("fragmentname", name).a("newState", Integer.valueOf(stateAfterAnimating)).a("transit", (Integer) 0).a("transitionStyle", (Integer) 0).a("keepActive", (Boolean) false).a("currentActivity", str).a("errorMsg", Log.getStackTraceString(e2)).a().toString()).a("fragment_name", name).a());
                        } catch (Exception unused) {
                        }
                        for (Class cls : MainServiceImpl.createIMainServicebyMonsterPlugin(false).getFixFragmentManagerWhiteList()) {
                            if (cls.isInstance(fragment)) {
                                return;
                            }
                        }
                        throw e2;
                    }
                }
            }
        });
        animator.setTarget(fragment.mView);
        a(fragment.mView, cVar);
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2) {
        h hVar;
        if (this.f2945m == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f2944l) {
            this.f2944l = i2;
            if (this.f2938f != null) {
                int size = this.f2937e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c(this.f2937e.get(i3));
                }
                int size2 = this.f2938f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Fragment valueAt = this.f2938f.valueAt(i4);
                    if (valueAt != null && ((valueAt.mRemoving || valueAt.mDetached) && !valueAt.mIsNewlyAdded)) {
                        c(valueAt);
                    }
                }
                u();
                if (this.r && (hVar = this.f2945m) != null && this.f2944l == 4) {
                    hVar.d();
                    this.r = false;
                }
            }
        }
    }

    public final void a(Fragment fragment, boolean z2) {
        d(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f2937e.contains(fragment)) {
            synchronized (this.f2937e) {
                this.f2937e.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.r = true;
            }
            if (z2) {
                k(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
    }

    @Override // androidx.fragment.app.i
    public final Fragment a(int i2) {
        for (int size = this.f2937e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2937e.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        SparseArray<Fragment> sparseArray = this.f2938f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f2938f.valueAt(size2);
            if (valueAt != null && valueAt.mFragmentId == i2) {
                return valueAt;
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.i
    public final Fragment a(String str) {
        if (str != null) {
            for (int size = this.f2937e.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2937e.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        SparseArray<Fragment> sparseArray = this.f2938f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            Fragment valueAt = this.f2938f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.mTag)) {
                return valueAt;
            }
        }
        return null;
    }

    public final Fragment b(String str) {
        Fragment findFragmentByWho;
        SparseArray<Fragment> sparseArray = this.f2938f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            Fragment valueAt = this.f2938f.valueAt(size);
            if (!(valueAt == null || (findFragmentByWho = valueAt.findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final void a(h hVar, boolean z2) {
        if (!z2) {
            v();
        }
        synchronized (this) {
            if (!this.u) {
                if (this.f2945m != null) {
                    if (this.f2934b == null) {
                        this.f2934b = new ArrayList<>();
                    }
                    this.f2934b.add(hVar);
                    i();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final int a(c cVar) {
        synchronized (this) {
            ArrayList<Integer> arrayList = this.f2942j;
            if (arrayList == null || arrayList.size() <= 0) {
                if (this.f2941i == null) {
                    this.f2941i = new ArrayList<>();
                }
                int size = this.f2941i.size();
                this.f2941i.add(cVar);
                return size;
            }
            ArrayList<Integer> arrayList2 = this.f2942j;
            int intValue = arrayList2.remove(arrayList2.size() - 1).intValue();
            this.f2941i.set(intValue, cVar);
            return intValue;
        }
    }

    public final void b(h hVar, boolean z2) {
        if (!z2 || (this.f2945m != null && !this.u)) {
            c(z2);
            if (hVar.a(this.x, this.y)) {
                this.f2935c = true;
                try {
                    b(this.x, this.y);
                } finally {
                    w();
                }
            }
            z();
            C();
        }
    }

    private void a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C0044j> arrayList3 = this.C;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                C0044j jVar = this.C.get(i2);
                if (arrayList != null && !jVar.f2977a && (indexOf2 = arrayList.indexOf(jVar.f2978b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                    jVar.d();
                } else if (jVar.f2979c == 0 || (arrayList != null && jVar.f2978b.a(arrayList, 0, arrayList.size()))) {
                    this.C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || jVar.f2977a || (indexOf = arrayList.indexOf(jVar.f2978b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.c();
                    } else {
                        jVar.d();
                    }
                }
                i2++;
            }
        }
    }

    private void a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5 = i2;
        boolean z2 = arrayList.get(i5).t;
        ArrayList<Fragment> arrayList3 = this.z;
        if (arrayList3 == null) {
            this.z = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.z.addAll(this.f2937e);
        Fragment fragment = this.p;
        boolean z3 = false;
        for (int i6 = i5; i6 < i3; i6++) {
            c cVar = arrayList.get(i6);
            if (!arrayList2.get(i6).booleanValue()) {
                fragment = cVar.a(this.z, fragment);
            } else {
                fragment = cVar.b(this.z, fragment);
            }
            z3 = z3 || cVar.f2911i;
        }
        this.z.clear();
        if (!z2) {
            o.a(this, arrayList, arrayList2, i5, i3, false);
        }
        b(arrayList, arrayList2, i5, i3);
        if (z2) {
            androidx.c.b<Fragment> bVar = new androidx.c.b<>();
            b(bVar);
            i4 = a(arrayList, arrayList2, i5, i3, bVar);
            a(bVar);
        } else {
            i4 = i3;
        }
        if (i4 != i5 && z2) {
            o.a(this, arrayList, arrayList2, i5, i4, true);
            a(this.f2944l, true);
        }
        while (i5 < i3) {
            c cVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && cVar2.f2915m >= 0) {
                int i7 = cVar2.f2915m;
                synchronized (this) {
                    this.f2941i.set(i7, null);
                    if (this.f2942j == null) {
                        this.f2942j = new ArrayList<>();
                    }
                    this.f2942j.add(Integer.valueOf(i7));
                }
                cVar2.f2915m = -1;
            }
            cVar2.a();
            i5++;
        }
        if (z3) {
            A();
        }
    }

    private static void a(androidx.c.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = (Fragment) bVar.f1798a[i2];
            if (!fragment.mAdded) {
                View view = fragment.getView();
                fragment.mPostponedAlpha = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(c cVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            cVar.a(z4);
        } else {
            cVar.g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            o.a(this, (ArrayList<c>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z4) {
            a(this.f2944l, true);
        }
        SparseArray<Fragment> sparseArray = this.f2938f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment valueAt = this.f2938f.valueAt(i2);
                if (valueAt != null && valueAt.mView != null && valueAt.mIsNewlyAdded && cVar.b(valueAt.mContainerId)) {
                    if (valueAt.mPostponedAlpha > 0.0f) {
                        valueAt.mView.setAlpha(valueAt.mPostponedAlpha);
                    }
                    if (z4) {
                        valueAt.mPostponedAlpha = 0.0f;
                    } else {
                        valueAt.mPostponedAlpha = -1.0f;
                        valueAt.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<c> arrayList3 = this.f2939g;
        if (arrayList3 == null) {
            return false;
        }
        if (str != null || i2 >= 0) {
            i4 = arrayList3.size() - 1;
            while (i4 >= 0) {
                c cVar = this.f2939g.get(i4);
                if ((str == null || !str.equals(cVar.f2913k)) && (i2 < 0 || i2 != cVar.f2915m)) {
                    i4--;
                } else if ((i3 & 1) != 0) {
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        c cVar2 = this.f2939g.get(i4);
                        if ((str == null || !str.equals(cVar2.f2913k)) && (i2 < 0 || i2 != cVar2.f2915m)) {
                            break;
                        }
                    }
                }
            }
            return false;
        } else if ((i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2939g.remove(size));
            arrayList2.add(true);
            return true;
        } else {
            i4 = -1;
        }
        if (i4 == this.f2939g.size() - 1) {
            return false;
        }
        for (int size2 = this.f2939g.size() - 1; size2 > i4; size2--) {
            arrayList.add(this.f2939g.remove(size2));
            arrayList2.add(true);
        }
        return true;
    }

    static void a(k kVar) {
        if (kVar != null) {
            List<Fragment> list = kVar.f2980a;
            if (list != null) {
                for (Fragment fragment : list) {
                    fragment.mRetaining = true;
                }
            }
            List<k> list2 = kVar.f2981b;
            if (list2 != null) {
                for (k kVar2 : list2) {
                    a(kVar2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Parcelable parcelable, k kVar) {
        List<k> list;
        List<af> list2;
        List<Fragment> list3;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f2885a != null) {
                if (kVar != null) {
                    List<Fragment> list4 = kVar.f2980a;
                    list = kVar.f2981b;
                    list2 = kVar.f2982c;
                    if (list4 != null) {
                        int size = list4.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            Fragment fragment = list4.get(i2);
                            int i3 = 0;
                            while (i3 < fragmentManagerState.f2885a.length && fragmentManagerState.f2885a[i3].f2891b != fragment.mIndex) {
                                i3++;
                            }
                            if (i3 == fragmentManagerState.f2885a.length) {
                                a(new IllegalStateException("Could not find active fragment with index " + fragment.mIndex));
                            }
                            FragmentState fragmentState = fragmentManagerState.f2885a[i3];
                            fragmentState.f2901l = fragment;
                            fragment.mSavedViewState = null;
                            fragment.mBackStackNesting = 0;
                            fragment.mInLayout = false;
                            fragment.mAdded = false;
                            fragment.mTarget = null;
                            if (fragmentState.f2900k != null) {
                                fragmentState.f2900k.setClassLoader(this.f2945m.f2930c.getClassLoader());
                                fragment.mSavedViewState = fragmentState.f2900k.getSparseParcelableArray("android:view_state");
                                fragment.mSavedFragmentState = fragmentState.f2900k;
                            }
                        }
                    }
                } else {
                    list = null;
                    list2 = null;
                }
                this.f2938f = new SparseArray<>(fragmentManagerState.f2885a.length);
                int i4 = 0;
                while (i4 < fragmentManagerState.f2885a.length) {
                    FragmentState fragmentState2 = fragmentManagerState.f2885a[i4];
                    if (fragmentState2 != null) {
                        Fragment a2 = fragmentState2.a(this.f2945m, this.n, this.o, (list == null || i4 >= list.size()) ? null : list.get(i4), (list2 == null || i4 >= list2.size()) ? null : list2.get(i4));
                        this.f2938f.put(a2.mIndex, a2);
                        fragmentState2.f2901l = null;
                    }
                    i4++;
                }
                if (!(kVar == null || (list3 = kVar.f2980a) == null)) {
                    int size2 = list3.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Fragment fragment2 = list3.get(i5);
                        if (fragment2.mTargetIndex >= 0) {
                            fragment2.mTarget = this.f2938f.get(fragment2.mTargetIndex);
                        }
                    }
                }
                this.f2937e.clear();
                if (fragmentManagerState.f2886b != null) {
                    for (int i6 = 0; i6 < fragmentManagerState.f2886b.length; i6++) {
                        Fragment fragment3 = this.f2938f.get(fragmentManagerState.f2886b[i6]);
                        if (fragment3 == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.f2886b[i6]));
                        }
                        fragment3.mAdded = true;
                        if (!this.f2937e.contains(fragment3)) {
                            synchronized (this.f2937e) {
                                this.f2937e.add(fragment3);
                            }
                        } else {
                            throw new IllegalStateException("Already added!");
                        }
                    }
                }
                if (fragmentManagerState.f2887c != null) {
                    this.f2939g = new ArrayList<>(fragmentManagerState.f2887c.length);
                    for (int i7 = 0; i7 < fragmentManagerState.f2887c.length; i7++) {
                        c a3 = fragmentManagerState.f2887c[i7].a(this);
                        if (f2933a) {
                            PrintWriter printWriter = new PrintWriter(new androidx.core.g.c("FragmentManager"));
                            a3.a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2939g.add(a3);
                        if (a3.f2915m >= 0) {
                            a(a3.f2915m, a3);
                        }
                    }
                } else {
                    this.f2939g = null;
                }
                if (fragmentManagerState.f2888d >= 0) {
                    this.p = this.f2938f.get(fragmentManagerState.f2888d);
                }
                this.f2936d = fragmentManagerState.f2889e;
            }
        }
    }

    public final void a(h hVar, f fVar, Fragment fragment) {
        if (this.f2945m == null) {
            this.f2945m = hVar;
            this.n = fVar;
            this.o = fragment;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void a(boolean z2) {
        for (int size = this.f2937e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2937e.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
            }
        }
    }

    public final void b(boolean z2) {
        for (int size = this.f2937e.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2937e.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
            }
        }
    }

    public final void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public final boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.f2944l <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f2940h != null) {
            for (int i3 = 0; i3 < this.f2940h.size(); i3++) {
                Fragment fragment2 = this.f2940h.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f2940h = arrayList;
        return z2;
    }

    public final boolean a(Menu menu) {
        if (this.f2944l <= 0) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean a(MenuItem menuItem) {
        if (this.f2944l <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(MenuItem menuItem) {
        if (this.f2944l <= 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Menu menu) {
        if (this.f2944l > 0) {
            for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
                Fragment fragment = this.f2937e.get(i2);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    @Override // androidx.fragment.app.i
    public final void a(i.b bVar) {
        synchronized (this.J) {
            int i2 = 0;
            int size = this.J.size();
            while (true) {
                if (i2 >= size) {
                    break;
                } else if (this.J.get(i2).f2970a == bVar) {
                    this.J.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
    }

    private void a(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).a(fragment, context, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentPreAttached(this, fragment, context);
            }
        }
    }

    private void a(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).a(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentPreCreated(this, fragment, bundle);
            }
        }
    }

    private void a(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).a(fragment, view, bundle, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentViewCreated(this, fragment, view, bundle);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(androidx.fragment.app.j r6, androidx.fragment.app.Fragment r7, int r8, int r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(androidx.fragment.app.j, androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$j  reason: collision with other inner class name */
    public static class C0044j implements Fragment.c {

        /* renamed from: a  reason: collision with root package name */
        final boolean f2977a;

        /* renamed from: b  reason: collision with root package name */
        final c f2978b;

        /* renamed from: c  reason: collision with root package name */
        int f2979c;

        static {
            Covode.recordClassIndex(1065);
        }

        @Override // androidx.fragment.app.Fragment.c
        public final void b() {
            this.f2979c++;
        }

        public final void d() {
            this.f2978b.f2903a.a(this.f2978b, this.f2977a, false, false);
        }

        @Override // androidx.fragment.app.Fragment.c
        public final void a() {
            int i2 = this.f2979c - 1;
            this.f2979c = i2;
            if (i2 == 0) {
                this.f2978b.f2903a.i();
            }
        }

        public final void c() {
            boolean z;
            if (this.f2979c > 0) {
                z = true;
            } else {
                z = false;
            }
            j jVar = this.f2978b.f2903a;
            int size = jVar.f2937e.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = jVar.f2937e.get(i2);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            this.f2978b.f2903a.a(this.f2978b, this.f2977a, !z, true);
        }

        C0044j(c cVar, boolean z) {
            this.f2977a = z;
            this.f2978b = cVar;
        }
    }

    @Override // androidx.fragment.app.i
    public final n a() {
        return new c(this);
    }

    @Override // androidx.fragment.app.i
    public final boolean d() {
        v();
        return t();
    }

    public final void q() {
        this.t = true;
        d(2);
    }

    private void w() {
        this.f2935c = false;
        this.y.clear();
        this.x.clear();
    }

    private void z() {
        if (this.w) {
            this.w = false;
            u();
        }
    }

    @Override // androidx.fragment.app.i
    public final boolean b() {
        boolean j2 = j();
        x();
        return j2;
    }

    @Override // androidx.fragment.app.i
    public final int e() {
        ArrayList<c> arrayList = this.f2939g;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.fragment.app.i
    public final boolean h() {
        if (this.s || this.t) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.s = false;
        this.t = false;
        d(1);
    }

    public final void n() {
        this.s = false;
        this.t = false;
        d(2);
    }

    public final void o() {
        this.s = false;
        this.t = false;
        d(3);
    }

    public final void p() {
        this.s = false;
        this.t = false;
        d(4);
    }

    /* access modifiers changed from: package-private */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f2965a;

        /* renamed from: b  reason: collision with root package name */
        private final View f2966b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f2967c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2968d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f2969e = true;

        static {
            Covode.recordClassIndex(1060);
        }

        public final void run() {
            if (this.f2967c || !this.f2969e) {
                this.f2965a.endViewTransition(this.f2966b);
                this.f2968d = true;
                return;
            }
            this.f2969e = false;
            this.f2965a.post(this);
        }

        public final boolean getTransformation(long j2, Transformation transformation) {
            this.f2969e = true;
            if (!this.f2967c) {
                if (!super.getTransformation(j2, transformation)) {
                    this.f2967c = true;
                    r.a(this.f2965a, this);
                }
                return true;
            } else if (!this.f2968d) {
                return true;
            } else {
                return false;
            }
        }

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2965a = viewGroup;
            this.f2966b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f2969e = true;
            if (!this.f2967c) {
                if (!super.getTransformation(j2, transformation, f2)) {
                    this.f2967c = true;
                    r.a(this.f2965a, this);
                }
                return true;
            } else if (!this.f2968d) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f2972a = {16842755, 16842960, 16842961};

        static {
            Covode.recordClassIndex(1062);
        }
    }

    private void A() {
        if (this.f2943k != null) {
            for (int i2 = 0; i2 < this.f2943k.size(); i2++) {
                this.f2943k.get(i2).a();
            }
        }
    }

    private void u() {
        if (this.f2938f != null) {
            for (int i2 = 0; i2 < this.f2938f.size(); i2++) {
                Fragment valueAt = this.f2938f.valueAt(i2);
                if (valueAt != null) {
                    b(valueAt);
                }
            }
        }
    }

    private void x() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).c();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public final void c() {
        a((h) new i(-1, 0), false);
    }

    @Override // androidx.fragment.app.i
    public final List<Fragment> f() {
        List<Fragment> list;
        if (this.f2937e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2937e) {
            list = (List) this.f2937e.clone();
        }
        return list;
    }

    public final void r() {
        this.u = true;
        j();
        d(0);
        this.f2945m = null;
        this.n = null;
        this.o = null;
    }

    public final void s() {
        for (int i2 = 0; i2 < this.f2937e.size(); i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    static {
        Covode.recordClassIndex(1049);
    }

    j() {
    }

    private void C() {
        SparseArray<Fragment> sparseArray = this.f2938f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f2938f.valueAt(size) == null) {
                    SparseArray<Fragment> sparseArray2 = this.f2938f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    private boolean t() {
        i peekChildFragmentManager;
        j();
        c(true);
        Fragment fragment = this.p;
        if (fragment != null && (peekChildFragmentManager = fragment.peekChildFragmentManager()) != null && peekChildFragmentManager.d()) {
            return true;
        }
        boolean a2 = a(this.x, this.y, (String) null, -1, 0);
        if (a2) {
            this.f2935c = true;
            try {
                b(this.x, this.y);
            } finally {
                w();
            }
        }
        z();
        C();
        return a2;
    }

    private void v() {
        if (h()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.v);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        boolean z2;
        synchronized (this) {
            ArrayList<C0044j> arrayList = this.C;
            boolean z3 = false;
            if (arrayList == null || arrayList.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            ArrayList<h> arrayList2 = this.f2934b;
            if (arrayList2 != null && arrayList2.size() == 1) {
                z3 = true;
            }
            if (z2 || z3) {
                this.f2945m.f2931d.removeCallbacks(this.E);
                this.f2945m.f2931d.post(this.E);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.o;
        if (fragment != null) {
            androidx.core.g.b.a(fragment, sb);
        } else {
            androidx.core.g.b.a(this.f2945m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    private void y() {
        SparseArray<Fragment> sparseArray = this.f2938f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment valueAt = this.f2938f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.getAnimatingAway() != null) {
                        int stateAfterAnimating = valueAt.getStateAfterAnimating();
                        View animatingAway = valueAt.getAnimatingAway();
                        Animation animation = animatingAway.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                            animatingAway.clearAnimation();
                        }
                        valueAt.setAnimatingAway(null);
                        a(this, valueAt, stateAfterAnimating, 0, 0, false);
                    } else if (valueAt.getAnimator() != null) {
                        valueAt.getAnimator().end();
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean j() {
        c(true);
        boolean z2 = false;
        while (c(this.x, this.y)) {
            this.f2935c = true;
            try {
                b(this.x, this.y);
                w();
                z2 = true;
            } catch (Throwable th) {
                w();
                throw th;
            }
        }
        z();
        C();
        return z2;
    }

    public final void l() {
        this.D = null;
        this.s = false;
        this.t = false;
        int size = this.f2937e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f2937e.get(i2);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B() {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.B():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable k() {
        /*
        // Method dump skipped, instructions count: 347
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.k():android.os.Parcelable");
    }

    static class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f2961a;

        static {
            Covode.recordClassIndex(1057);
        }

        b(Animation.AnimationListener animationListener) {
            this.f2961a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f2961a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f2961a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f2961a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f2964a;

        static {
            Covode.recordClassIndex(1059);
        }

        d(View view) {
            this.f2964a = view;
        }

        public final void onAnimationStart(Animator animator) {
            this.f2964a.setLayerType(2, null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f2964a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    @Override // androidx.fragment.app.i
    public final void b(i.c cVar) {
        ArrayList<i.c> arrayList = this.f2943k;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2962a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2963b;

        static {
            Covode.recordClassIndex(1058);
        }

        c(Animator animator) {
            this.f2963b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        c(Animation animation) {
            this.f2962a = animation;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static void f(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public static void g(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    private void k(Fragment fragment) {
        a(this, fragment, this.f2944l, 0, 0, false);
    }

    @Override // androidx.fragment.app.i
    public final i.a c(int i2) {
        return this.f2939g.get(i2);
    }

    private static Animation.AnimationListener a(Animation animation) {
        try {
            if (q == null) {
                Field declaredField = Animation.class.getDeclaredField("mListener");
                q = declaredField;
                declaredField.setAccessible(true);
            }
            return (Animation.AnimationListener) q.get(animation);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    private void n(Fragment fragment) {
        if (fragment.mIndex >= 0) {
            this.f2938f.put(fragment.mIndex, null);
            fragment.initState();
        }
    }

    @Override // androidx.fragment.app.i
    public final void b(int i2) {
        if (i2 >= 0) {
            a((h) new i(i2, 1), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: ".concat(String.valueOf(i2)));
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        try {
            this.f2935c = true;
            a(i2, false);
            this.f2935c = false;
            j();
        } catch (Throwable th) {
            this.f2935c = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        View f2959a;

        static {
            Covode.recordClassIndex(1055);
        }

        @Override // androidx.fragment.app.j.b
        public final void onAnimationEnd(Animation animation) {
            if (v.y(this.f2959a) || Build.VERSION.SDK_INT >= 24) {
                this.f2959a.post(new Runnable() {
                    /* class androidx.fragment.app.j.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(1056);
                    }

                    public final void run() {
                        a.this.f2959a.setLayerType(0, null);
                    }
                });
            } else {
                this.f2959a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }

        a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f2959a = view;
        }
    }

    private void b(androidx.c.b<Fragment> bVar) {
        int i2 = this.f2944l;
        if (i2 > 0) {
            int min = Math.min(i2, 3);
            int size = this.f2937e.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.f2937e.get(i3);
                if (fragment.mState < min) {
                    a(this, fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    private void l(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            if (fragment.mView != null) {
                fragment.mInnerView = fragment.mView;
                fragment.mView.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                a(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    private Fragment o(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f2937e.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f2937e.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void p(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.B;
            if (sparseArray == null) {
                this.B = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.B);
            if (this.B.size() > 0) {
                fragment.mSavedViewState = this.B;
                this.B = null;
            }
        }
    }

    public final void j(Fragment fragment) {
        if (fragment == null || (this.f2938f.get(fragment.mIndex) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            this.p = fragment;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    private Bundle q(Fragment fragment) {
        if (this.A == null) {
            this.A = new Bundle();
        }
        fragment.performSaveInstanceState(this.A);
        d(fragment, this.A, false);
        Bundle bundle = null;
        if (!this.A.isEmpty()) {
            Bundle bundle2 = this.A;
            this.A = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            p(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void e(Fragment fragment) {
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            synchronized (this.f2937e) {
                this.f2937e.remove(fragment);
            }
            if (fragment.mHasMenu && fragment.mMenuVisible) {
                this.r = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public final void h(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                synchronized (this.f2937e) {
                    this.f2937e.remove(fragment);
                }
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.r = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public final void i(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f2937e.contains(fragment)) {
                synchronized (this.f2937e) {
                    this.f2937e.add(fragment);
                }
                fragment.mAdded = true;
                if (fragment.mHasMenu && fragment.mMenuVisible) {
                    this.r = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
        }
    }

    private void c(boolean z2) {
        if (this.f2935c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2945m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f2945m.f2931d.getLooper()) {
            if (!z2) {
                v();
            }
            if (this.x == null) {
                this.x = new ArrayList<>();
                this.y = new ArrayList<>();
            }
            this.f2935c = true;
            try {
                a((ArrayList<c>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2935c = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void m(final Fragment fragment) {
        int i2;
        if (fragment.mView != null) {
            c a2 = a(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (a2 != null) {
                if (a2.f2963b != null) {
                    a2.f2963b.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        final ViewGroup viewGroup = fragment.mContainer;
                        final View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        a2.f2963b.addListener(new AnimatorListenerAdapter() {
                            /* class androidx.fragment.app.j.AnonymousClass4 */

                            static {
                                Covode.recordClassIndex(1054);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                viewGroup.endViewTransition(view);
                                animator.removeListener(this);
                                if (fragment.mView != null) {
                                    fragment.mView.setVisibility(8);
                                }
                            }
                        });
                    }
                    a(fragment.mView, a2);
                    a2.f2963b.start();
                } else {
                    a(fragment.mView, a2);
                    fragment.mView.startAnimation(a2.f2962a);
                    a2.f2962a.start();
                }
            }
            if (!fragment.mHidden || fragment.isHideReplaced()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            fragment.mView.setVisibility(i2);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && fragment.mHasMenu && fragment.mMenuVisible) {
            this.r = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* access modifiers changed from: package-private */
    public final void d(Fragment fragment) {
        if (fragment.mIndex < 0) {
            int i2 = this.f2936d;
            this.f2936d = i2 + 1;
            fragment.setIndex(i2, this.o);
            if (this.f2938f == null) {
                this.f2938f = new SparseArray<>();
            }
            this.f2938f.put(fragment.mIndex, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null) {
            int i2 = this.f2944l;
            if (fragment.mRemoving) {
                if (fragment.isInBackStack()) {
                    i2 = Math.min(i2, 1);
                } else {
                    i2 = Math.min(i2, 0);
                }
            }
            a(this, fragment, i2, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
            if (fragment.mView != null) {
                Fragment o2 = o(fragment);
                if (o2 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.mView)) < (indexOfChild = (viewGroup = fragment.mContainer).indexOfChild(o2.mView))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
                if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                    if (fragment.mPostponedAlpha > 0.0f) {
                        fragment.mView.setAlpha(fragment.mPostponedAlpha);
                    }
                    fragment.mPostponedAlpha = 0.0f;
                    fragment.mIsNewlyAdded = false;
                    c a2 = a(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                    if (a2 != null) {
                        a(fragment.mView, a2);
                        if (a2.f2962a != null) {
                            fragment.mView.startAnimation(a2.f2962a);
                        } else {
                            a2.f2963b.setTarget(fragment.mView);
                            a2.f2963b.start();
                        }
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                m(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        final i.b f2970a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f2971b;

        static {
            Covode.recordClassIndex(1061);
        }

        f(i.b bVar, boolean z) {
            this.f2970a = bVar;
            this.f2971b = z;
        }
    }

    @Override // androidx.fragment.app.i
    public final void a(i.b bVar, boolean z2) {
        this.J.add(new f(bVar, z2));
    }

    class i implements h {

        /* renamed from: a  reason: collision with root package name */
        final String f2973a = null;

        /* renamed from: b  reason: collision with root package name */
        final int f2974b;

        /* renamed from: c  reason: collision with root package name */
        final int f2975c;

        static {
            Covode.recordClassIndex(1064);
        }

        @Override // androidx.fragment.app.j.h
        public final boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
            i peekChildFragmentManager;
            if (j.this.p == null || this.f2974b >= 0 || this.f2973a != null || (peekChildFragmentManager = j.this.p.peekChildFragmentManager()) == null || !peekChildFragmentManager.d()) {
                return j.this.a(arrayList, arrayList2, this.f2973a, this.f2974b, this.f2975c);
            }
            return false;
        }

        i(int i2, int i3) {
            this.f2974b = i2;
            this.f2975c = i3;
        }
    }

    private static c a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(G);
        alphaAnimation.setDuration(220);
        return new c(alphaAnimation);
    }

    private void e(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).e(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentStopped(this, fragment);
            }
        }
    }

    private void f(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).f(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentViewDestroyed(this, fragment);
            }
        }
    }

    private void g(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).g(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentDestroyed(this, fragment);
            }
        }
    }

    private void h(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).h(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentDetached(this, fragment);
            }
        }
    }

    private void c(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).c(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentResumed(this, fragment);
            }
        }
    }

    private void d(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).d(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentPaused(this, fragment);
            }
        }
    }

    private void b(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).b(fragment, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentStarted(this, fragment);
            }
        }
    }

    private boolean c(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            ArrayList<h> arrayList3 = this.f2934b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                return false;
            }
            int size = this.f2934b.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.f2934b.get(i2).a(arrayList, arrayList2);
            }
            this.f2934b.clear();
            this.f2945m.f2931d.removeCallbacks(this.E);
            return z2;
        }
    }

    private void a(int i2, c cVar) {
        synchronized (this) {
            if (this.f2941i == null) {
                this.f2941i = new ArrayList<>();
            }
            int size = this.f2941i.size();
            if (i2 < size) {
                this.f2941i.set(i2, cVar);
            } else {
                while (size < i2) {
                    this.f2941i.add(null);
                    if (this.f2942j == null) {
                        this.f2942j = new ArrayList<>();
                    }
                    this.f2942j.add(Integer.valueOf(size));
                    size++;
                }
                this.f2941i.add(cVar);
            }
        }
    }

    private void b(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).t) {
                    if (i3 != i2) {
                        a(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).t) {
                            i3++;
                        }
                    }
                    a(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                a(arrayList, arrayList2, i3, size);
            }
        }
    }

    private static void a(View view, c cVar) {
        if (!(view == null || cVar == null)) {
            int i2 = Build.VERSION.SDK_INT;
            if (view.getLayerType() == 0 && v.p(view)) {
                if (!(cVar.f2962a instanceof AlphaAnimation)) {
                    if (cVar.f2962a instanceof AnimationSet) {
                        List<Animation> animations = ((AnimationSet) cVar.f2962a).getAnimations();
                        for (int i3 = 0; i3 < animations.size(); i3++) {
                            if (!(animations.get(i3) instanceof AlphaAnimation)) {
                            }
                        }
                        return;
                    } else if (!a(cVar.f2963b)) {
                        return;
                    }
                }
                if (cVar.f2963b != null) {
                    cVar.f2963b.addListener(new d(view));
                    return;
                }
                Animation.AnimationListener a2 = a(cVar.f2962a);
                view.setLayerType(2, null);
                cVar.f2962a.setAnimationListener(new a(view, a2));
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private void c(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).c(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentActivityCreated(this, fragment, bundle);
            }
        }
    }

    private void d(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).d(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentSaveInstanceState(this, fragment, bundle);
            }
        }
    }

    private void b(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).b(fragment, context, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentAttached(this, fragment, context);
            }
        }
    }

    private void b(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.o;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).b(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.J.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z2 || next.f2971b) {
                next.f2970a.onFragmentCreated(this, fragment, bundle);
            }
        }
    }

    private static c a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(F);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(G);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new c(animationSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (0 != 0) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.fragment.app.j.c a(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.a(androidx.fragment.app.Fragment, int, boolean, int):androidx.fragment.app.j$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r10 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r5 == -1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        r10 = a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (androidx.fragment.app.j.f2933a == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        java.lang.Integer.toHexString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r10 != null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r10 = r15.n.a(r18, r3, null);
        r10.mFromLayout = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r6 == 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r10.mFragmentId = r0;
        r10.mContainerId = r5;
        r10.mTag = r4;
        r10.mInLayout = true;
        r10.mFragmentManager = r15;
        r10.mHost = r15.f2945m;
        r10.onInflate(r15.f2945m.f2930c, r19, r10.mSavedFragmentState);
        a(r10, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        if (r15.f2944l > 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
        if (r10.mFromLayout == false) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        a(r15, r10, 1, 0, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (r10.mView == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0096, code lost:
        if (r6 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r10.mView.setId(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a3, code lost:
        if (r10.mView.getTag() != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a5, code lost:
        r10.mView.setTag(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        return r10.mView;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        k(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r0 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r10.mInLayout != false) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r10.mInLayout = true;
        r10.mHost = r15.f2945m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r10.mRetaining != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c1, code lost:
        r10.onInflate(r15.f2945m.f2930c, r19, r10.mSavedFragmentState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d1, code lost:
        if (r10 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d3, code lost:
        if (r4 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f3, code lost:
        throw new java.lang.IllegalStateException("Fragment " + r3 + " did not create a view.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        throw new java.lang.IllegalArgumentException(r19.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(r6) + ", tag " + r4 + ", or parent id 0x" + java.lang.Integer.toHexString(r5) + " with another fragment for " + r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r16, java.lang.String r17, android.content.Context r18, android.util.AttributeSet r19) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private static void b(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            c cVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                cVar.a(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                cVar.a(z2);
            } else {
                cVar.a(1);
                cVar.g();
            }
            i2++;
        }
    }

    private int a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, androidx.c.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            c cVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            int i6 = 0;
            while (true) {
                if (i6 >= cVar.f2904b.size()) {
                    break;
                } else if (!c.b(cVar.f2904b.get(i6))) {
                    i6++;
                } else if (!cVar.a(arrayList, i5 + 1, i3)) {
                    if (this.C == null) {
                        this.C = new ArrayList<>();
                    }
                    C0044j jVar = new C0044j(cVar, booleanValue);
                    this.C.add(jVar);
                    cVar.a(jVar);
                    if (booleanValue) {
                        cVar.g();
                    } else {
                        cVar.a(false);
                    }
                    i4--;
                    if (i5 != i4) {
                        arrayList.remove(i5);
                        arrayList.add(i4, cVar);
                    }
                    b(bVar);
                }
            }
        }
        return i4;
    }
}
