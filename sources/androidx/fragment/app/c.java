package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class c extends n implements i.a, j.h {

    /* renamed from: a  reason: collision with root package name */
    final j f2903a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<a> f2904b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    int f2905c;

    /* renamed from: d  reason: collision with root package name */
    int f2906d;

    /* renamed from: e  reason: collision with root package name */
    int f2907e;

    /* renamed from: f  reason: collision with root package name */
    int f2908f;

    /* renamed from: g  reason: collision with root package name */
    public int f2909g;

    /* renamed from: h  reason: collision with root package name */
    public int f2910h;

    /* renamed from: i  reason: collision with root package name */
    boolean f2911i;

    /* renamed from: j  reason: collision with root package name */
    boolean f2912j = true;

    /* renamed from: k  reason: collision with root package name */
    String f2913k;

    /* renamed from: l  reason: collision with root package name */
    boolean f2914l;

    /* renamed from: m  reason: collision with root package name */
    int f2915m = -1;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList<String> r;
    ArrayList<String> s;
    boolean t = false;
    ArrayList<Runnable> u;

    static {
        Covode.recordClassIndex(1035);
    }

    @Override // androidx.fragment.app.n
    public final n f() {
        this.t = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f2916a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f2917b;

        /* renamed from: c  reason: collision with root package name */
        int f2918c;

        /* renamed from: d  reason: collision with root package name */
        int f2919d;

        /* renamed from: e  reason: collision with root package name */
        int f2920e;

        /* renamed from: f  reason: collision with root package name */
        int f2921f;

        static {
            Covode.recordClassIndex(1036);
        }

        a() {
        }

        a(int i2, Fragment fragment) {
            this.f2916a = i2;
            this.f2917b = fragment;
        }
    }

    @Override // androidx.fragment.app.i.a
    public final String h() {
        return this.f2913k;
    }

    public final void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public final void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2913k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2915m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2914l);
            if (this.f2909g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2909g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f2910h));
            }
            if (!(this.f2905c == 0 && this.f2906d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2905c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2906d));
            }
            if (!(this.f2907e == 0 && this.f2908f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2907e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2908f));
            }
            if (!(this.n == 0 && this.o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        if (!this.f2904b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2904b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.f2904b.get(i2);
                switch (aVar.f2916a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        str2 = "SHOW";
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        str2 = "DETACH";
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        str2 = "ATTACH";
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f2916a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2917b);
                if (z) {
                    if (!(aVar.f2918c == 0 && aVar.f2919d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2918c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2919d));
                    }
                    if (aVar.f2920e != 0 || aVar.f2921f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2920e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2921f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        this.f2904b.add(aVar);
        aVar.f2918c = this.f2905c;
        aVar.f2919d = this.f2906d;
        aVar.f2920e = this.f2907e;
        aVar.f2921f = this.f2908f;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f2911i) {
            int size = this.f2904b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar = this.f2904b.get(i3);
                if (aVar.f2917b != null) {
                    aVar.f2917b.mBackStackNesting += i2;
                }
            }
        }
    }

    public final void a() {
        ArrayList<Runnable> arrayList = this.u;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.u.get(i2).run();
            }
            this.u = null;
        }
    }

    @Override // androidx.fragment.app.j.h
    public final boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f2911i) {
            return true;
        }
        j jVar = this.f2903a;
        if (jVar.f2939g == null) {
            jVar.f2939g = new ArrayList<>();
        }
        jVar.f2939g.add(this);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ArrayList<c> arrayList, int i2, int i3) {
        int i4;
        if (i3 == i2) {
            return false;
        }
        int size = this.f2904b.size();
        int i5 = -1;
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = this.f2904b.get(i6);
            if (!(aVar.f2917b == null || (i4 = aVar.f2917b.mContainerId) == 0 || i4 == i5)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    c cVar = arrayList.get(i7);
                    int size2 = cVar.f2904b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        a aVar2 = cVar.f2904b.get(i8);
                        if (aVar2.f2917b != null && aVar2.f2917b.mContainerId == i4) {
                            return true;
                        }
                    }
                }
                i5 = i4;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        for (int size = this.f2904b.size() - 1; size >= 0; size--) {
            a aVar = this.f2904b.get(size);
            Fragment fragment = aVar.f2917b;
            if (fragment != null) {
                int i2 = this.f2909g;
                int i3 = 8194;
                if (i2 != 4097) {
                    i3 = i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099;
                }
                fragment.setNextTransition(i3, this.f2910h);
            }
            switch (aVar.f2916a) {
                case 1:
                    fragment.setNextAnim(aVar.f2921f);
                    this.f2903a.e(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2916a);
                case 3:
                    fragment.setNextAnim(aVar.f2920e);
                    this.f2903a.a(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2920e);
                    j.g(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    fragment.setNextAnim(aVar.f2921f);
                    j.f(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    fragment.setNextAnim(aVar.f2920e);
                    this.f2903a.i(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    fragment.setNextAnim(aVar.f2921f);
                    this.f2903a.h(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    this.f2903a.j(null);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    this.f2903a.j(fragment);
                    break;
            }
            if (!(this.t || aVar.f2916a == 3 || fragment == null)) {
                this.f2903a.c(fragment);
            }
        }
        if (!this.t && z) {
            j jVar = this.f2903a;
            jVar.a(jVar.f2944l, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Fragment.c cVar) {
        for (int i2 = 0; i2 < this.f2904b.size(); i2++) {
            a aVar = this.f2904b.get(i2);
            if (b(aVar)) {
                aVar.f2917b.setOnStartEnterTransitionListener(cVar);
            }
        }
    }

    @Override // androidx.fragment.app.n
    public final int b() {
        return b(false);
    }

    @Override // androidx.fragment.app.n
    public final int c() {
        return b(true);
    }

    private n i() {
        if (!this.f2911i) {
            this.f2912j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // androidx.fragment.app.n
    public final void d() {
        i();
        this.f2903a.b((j.h) this, false);
    }

    @Override // androidx.fragment.app.n
    public final void e() {
        i();
        this.f2903a.b((j.h) this, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2915m >= 0) {
            sb.append(" #");
            sb.append(this.f2915m);
        }
        if (this.f2913k != null) {
            sb.append(" ");
            sb.append(this.f2913k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        int size = this.f2904b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.f2904b.get(i2);
            Fragment fragment = aVar.f2917b;
            if (fragment != null) {
                fragment.setNextTransition(this.f2909g, this.f2910h);
            }
            switch (aVar.f2916a) {
                case 1:
                    fragment.setNextAnim(aVar.f2918c);
                    this.f2903a.a(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f2916a);
                case 3:
                    fragment.setNextAnim(aVar.f2919d);
                    this.f2903a.e(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f2919d);
                    j.f(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    fragment.setNextAnim(aVar.f2918c);
                    j.g(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    fragment.setNextAnim(aVar.f2919d);
                    this.f2903a.h(fragment);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    fragment.setNextAnim(aVar.f2918c);
                    this.f2903a.i(fragment);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    this.f2903a.j(fragment);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    this.f2903a.j(null);
                    break;
            }
            if (!(this.t || aVar.f2916a == 1 || fragment == null)) {
                this.f2903a.c(fragment);
            }
        }
        if (!this.t) {
            j jVar = this.f2903a;
            jVar.a(jVar.f2944l, true);
        }
    }

    @Override // androidx.fragment.app.n
    public final n c(Fragment fragment) {
        a(new a(5, fragment));
        return this;
    }

    @Override // androidx.fragment.app.n
    public final n d(Fragment fragment) {
        a(new a(6, fragment));
        return this;
    }

    @Override // androidx.fragment.app.n
    public final n e(Fragment fragment) {
        a(new a(7, fragment));
        return this;
    }

    public c(j jVar) {
        this.f2903a = jVar;
    }

    static boolean b(a aVar) {
        Fragment fragment = aVar.f2917b;
        if (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) {
            return false;
        }
        return true;
    }

    private int b(boolean z) {
        if (!this.f2914l) {
            if (j.f2933a) {
                PrintWriter printWriter = new PrintWriter(new androidx.core.g.c("FragmentManager"));
                a("  ", printWriter);
                printWriter.close();
            }
            this.f2914l = true;
            if (this.f2911i) {
                this.f2915m = this.f2903a.a(this);
            } else {
                this.f2915m = -1;
            }
            this.f2903a.a(this, z);
            return this.f2915m;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.n
    public final n a(Fragment fragment) {
        a(new a(3, fragment));
        return this;
    }

    @Override // androidx.fragment.app.n
    public final n b(Fragment fragment) {
        a(new a(4, fragment));
        return this;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2) {
        int i3;
        int size = this.f2904b.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = this.f2904b.get(i4);
            if (!(aVar.f2917b == null || (i3 = aVar.f2917b.mContainerId) == 0 || i3 != i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.n
    public final n a(String str) {
        if (this.f2912j) {
            this.f2911i = true;
            this.f2913k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    @Override // androidx.fragment.app.n
    public final n a(int i2, int i3) {
        return a(i2, i3, 0, 0);
    }

    @Override // androidx.fragment.app.n
    public final n b(int i2, Fragment fragment) {
        return b(i2, fragment, null);
    }

    @Override // androidx.fragment.app.n
    public final n a(int i2, Fragment fragment) {
        a(i2, fragment, (String) null, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final Fragment b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i2 = 0; i2 < this.f2904b.size(); i2++) {
            a aVar = this.f2904b.get(i2);
            int i3 = aVar.f2916a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                            fragment = null;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                            fragment = aVar.f2917b;
                            break;
                    }
                }
                arrayList.add(aVar.f2917b);
            }
            arrayList.remove(aVar.f2917b);
        }
        return fragment;
    }

    /* access modifiers changed from: package-private */
    public final Fragment a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.f2904b.size()) {
            a aVar = this.f2904b.get(i2);
            int i3 = aVar.f2916a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.f2917b;
                    int i4 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2904b.add(i2, new a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                a aVar2 = new a(3, fragment4);
                                aVar2.f2918c = aVar.f2918c;
                                aVar2.f2920e = aVar.f2920e;
                                aVar2.f2919d = aVar.f2919d;
                                aVar2.f2921f = aVar.f2921f;
                                this.f2904b.add(i2, aVar2);
                                arrayList.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.f2904b.remove(i2);
                        i2--;
                    } else {
                        aVar.f2916a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f2917b);
                    if (aVar.f2917b == fragment2) {
                        this.f2904b.add(i2, new a(9, aVar.f2917b));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f2904b.add(i2, new a(9, fragment2));
                        i2++;
                        fragment2 = aVar.f2917b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f2917b);
            i2++;
        }
        return fragment2;
    }

    @Override // androidx.fragment.app.n
    public final n a(Fragment fragment, String str) {
        a(0, fragment, str, 1);
        return this;
    }

    @Override // androidx.fragment.app.n
    public final n a(int i2, Fragment fragment, String str) {
        a(i2, fragment, str, 1);
        return this;
    }

    @Override // androidx.fragment.app.n
    public final n b(int i2, Fragment fragment, String str) {
        if (i2 != 0) {
            a(i2, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    @Override // androidx.fragment.app.n
    public final n a(int i2, int i3, int i4, int i5) {
        this.f2905c = i2;
        this.f2906d = i3;
        this.f2907e = i4;
        this.f2908f = i5;
        return this;
    }

    private void a(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        fragment.mFragmentManager = this.f2903a;
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i2) {
                fragment.mFragmentId = i2;
                fragment.mContainerId = i2;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
        }
        a(new a(i3, fragment));
    }
}
