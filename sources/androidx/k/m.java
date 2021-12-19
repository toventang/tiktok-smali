package androidx.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.c.d;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class m implements Cloneable {
    private static ThreadLocal<androidx.c.a<Animator, a>> C = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f3320a = {2, 1, 3, 4};
    private static final g p = new g() {
        /* class androidx.k.m.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1224);
        }

        @Override // androidx.k.g
        public final Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    };
    private ArrayList<s> A;
    private ArrayList<s> B;
    private ViewGroup D = null;
    private int E = 0;
    private boolean F = false;
    private boolean G = false;
    private ArrayList<c> H = null;
    private ArrayList<Animator> I = new ArrayList<>();
    private androidx.c.a<String, String> J;

    /* renamed from: b  reason: collision with root package name */
    public String f3321b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    public long f3322c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f3323d = -1;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f3324e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Integer> f3325f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<View> f3326g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<String> f3327h = null;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<Class> f3328i = null;

    /* renamed from: j  reason: collision with root package name */
    q f3329j = null;

    /* renamed from: k  reason: collision with root package name */
    boolean f3330k = false;

    /* renamed from: l  reason: collision with root package name */
    ArrayList<Animator> f3331l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public p f3332m;
    public b n;
    public g o = p;
    private ArrayList<Integer> q = null;
    private ArrayList<View> r = null;
    private ArrayList<Class> s = null;
    private ArrayList<String> t = null;
    private ArrayList<Integer> u = null;
    private ArrayList<View> v = null;
    private ArrayList<Class> w = null;
    private t x = new t();
    private t y = new t();
    private int[] z = f3320a;

    public static abstract class b {
        static {
            Covode.recordClassIndex(1228);
        }

        public abstract Rect a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(1229);
        }

        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);
    }

    public Animator a(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public abstract void a(s sVar);

    public String[] a() {
        return null;
    }

    public abstract void b(s sVar);

    /* access modifiers changed from: protected */
    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        s sVar;
        View view;
        androidx.c.a<Animator, a> f2 = f();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            s sVar2 = arrayList.get(i2);
            s sVar3 = arrayList2.get(i2);
            if (sVar2 != null && !sVar2.f3357c.contains(this)) {
                sVar2 = null;
            }
            if (sVar3 != null && !sVar3.f3357c.contains(this)) {
                sVar3 = null;
            }
            if (sVar2 == null) {
                if (sVar3 == null) {
                }
            } else if (sVar3 != null && !a(sVar2, sVar3)) {
            }
            Animator a2 = a(viewGroup, sVar2, sVar3);
            if (a2 != null) {
                if (sVar3 != null) {
                    view = sVar3.f3356b;
                    String[] a3 = a();
                    if (view == null || a3 == null || a3.length <= 0) {
                        sVar = null;
                    } else {
                        sVar = new s();
                        sVar.f3356b = view;
                        s sVar4 = tVar2.f3358a.get(view);
                        if (sVar4 != null) {
                            for (int i3 = 0; i3 < a3.length; i3++) {
                                sVar.f3355a.put(a3[i3], sVar4.f3355a.get(a3[i3]));
                            }
                        }
                        int size2 = f2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                break;
                            }
                            a aVar = f2.get(f2.b(i4));
                            if (aVar.f3338c != null && aVar.f3336a == view && aVar.f3337b.equals(this.f3321b) && aVar.f3338c.equals(sVar)) {
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    view = sVar2.f3356b;
                    sVar = null;
                }
                p pVar = this.f3332m;
                if (pVar != null) {
                    long a4 = pVar.a(viewGroup, this, sVar2, sVar3);
                    sparseIntArray.put(this.I.size(), (int) a4);
                    j2 = Math.min(a4, j2);
                }
                f2.put(a2, new a(view, this.f3321b, this, ae.b(viewGroup), sVar));
                this.I.add(a2);
            }
        }
        if (j2 != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator = this.I.get(sparseIntArray.keyAt(i5));
                animator.setStartDelay((((long) sparseIntArray.valueAt(i5)) - j2) + animator.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.q;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.r;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.s;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.s.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (!(this.t == null || v.l(view) == null || !this.t.contains(v.l(view)))) {
            return false;
        }
        if ((this.f3325f.size() == 0 && this.f3326g.size() == 0 && (((arrayList = this.f3328i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3327h) == null || arrayList2.isEmpty()))) || this.f3325f.contains(Integer.valueOf(id)) || this.f3326g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f3327h;
        if (arrayList6 != null && arrayList6.contains(v.l(view))) {
            return true;
        }
        if (this.f3328i != null) {
            for (int i3 = 0; i3 < this.f3328i.size(); i3++) {
                if (this.f3328i.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewGroup viewGroup, boolean z2) {
        androidx.c.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        a(z2);
        if ((this.f3325f.size() > 0 || this.f3326g.size() > 0) && (((arrayList = this.f3327h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3328i) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f3325f.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f3325f.get(i2).intValue());
                if (findViewById != null) {
                    s sVar = new s();
                    sVar.f3356b = findViewById;
                    if (z2) {
                        a(sVar);
                    } else {
                        b(sVar);
                    }
                    sVar.f3357c.add(this);
                    c(sVar);
                    if (z2) {
                        a(this.x, findViewById, sVar);
                    } else {
                        a(this.y, findViewById, sVar);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f3326g.size(); i3++) {
                View view = this.f3326g.get(i3);
                s sVar2 = new s();
                sVar2.f3356b = view;
                if (z2) {
                    a(sVar2);
                } else {
                    b(sVar2);
                }
                sVar2.f3357c.add(this);
                c(sVar2);
                if (z2) {
                    a(this.x, view, sVar2);
                } else {
                    a(this.y, view, sVar2);
                }
            }
        } else {
            c(viewGroup, z2);
        }
        if (!(z2 || (aVar = this.J) == null)) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList3.add(this.x.f3361d.remove(this.J.b(i4)));
            }
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = arrayList3.get(i5);
                if (obj != null) {
                    this.x.f3361d.put(this.J.c(i5), obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        if (z2) {
            this.x.f3358a.clear();
            this.x.f3359b.clear();
            this.x.f3360c.c();
            return;
        }
        this.y.f3358a.clear();
        this.y.f3359b.clear();
        this.y.f3360c.c();
    }

    public boolean a(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] a2 = a();
        if (a2 != null) {
            for (String str : a2) {
                if (!a(sVar, sVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : sVar.f3355a.keySet()) {
            if (a(sVar, sVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public void a(g gVar) {
        if (gVar == null) {
            this.o = p;
        } else {
            this.o = gVar;
        }
    }

    public void a(b bVar) {
        this.n = bVar;
    }

    public void a(p pVar) {
        this.f3332m = pVar;
    }

    public String toString() {
        return a("");
    }

    private static androidx.c.a<Animator, a> f() {
        androidx.c.a<Animator, a> aVar = C.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.c.a<Animator, a> aVar2 = new androidx.c.a<>();
        C.set(aVar2);
        return aVar2;
    }

    static {
        Covode.recordClassIndex(1223);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (this.E == 0) {
            ArrayList<c> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((c) arrayList2.get(i2)).d(this);
                }
            }
            this.G = false;
        }
        this.E++;
    }

    /* renamed from: e */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.I = new ArrayList<>();
            mVar.x = new t();
            mVar.y = new t();
            mVar.A = null;
            mVar.B = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        c();
        final androidx.c.a<Animator, a> f2 = f();
        Iterator<Animator> it = this.I.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (f2.containsKey(next)) {
                c();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() {
                        /* class androidx.k.m.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(1225);
                        }

                        public final void onAnimationStart(Animator animator) {
                            m.this.f3331l.add(animator);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            f2.remove(animator);
                            m.this.f3331l.remove(animator);
                        }
                    });
                    long j2 = this.f3323d;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f3322c;
                    if (j3 >= 0) {
                        next.setStartDelay(j3);
                    }
                    TimeInterpolator timeInterpolator = this.f3324e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new AnimatorListenerAdapter() {
                        /* class androidx.k.m.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(1226);
                        }

                        public final void onAnimationEnd(Animator animator) {
                            m.this.d();
                            animator.removeListener(this);
                        }
                    });
                    next.start();
                }
            }
        }
        this.I.clear();
        d();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        int i2 = this.E - 1;
        this.E = i2;
        if (i2 == 0) {
            ArrayList<c> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((c) arrayList2.get(i3)).a(this);
                }
            }
            for (int i4 = 0; i4 < this.x.f3360c.b(); i4++) {
                View c2 = this.x.f3360c.c(i4);
                if (c2 != null) {
                    v.a(c2, false);
                }
            }
            for (int i5 = 0; i5 < this.y.f3360c.b(); i5++) {
                View c3 = this.y.f3360c.c(i5);
                if (c3 != null) {
                    v.a(c3, false);
                }
            }
            this.G = true;
        }
    }

    public m b(long j2) {
        this.f3322c = j2;
        return this;
    }

    public m a(long j2) {
        this.f3323d = j2;
        return this;
    }

    public m b(View view) {
        this.f3326g.add(view);
        return this;
    }

    public m c(View view) {
        this.f3326g.remove(view);
        return this;
    }

    public m a(TimeInterpolator timeInterpolator) {
        this.f3324e = timeInterpolator;
        return this;
    }

    public m b(int i2) {
        if (i2 != 0) {
            this.f3325f.add(Integer.valueOf(i2));
        }
        return this;
    }

    public m b(c cVar) {
        ArrayList<c> arrayList = this.H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(cVar);
        if (this.H.size() == 0) {
            this.H = null;
        }
        return this;
    }

    public m a(c cVar) {
        if (this.H == null) {
            this.H = new ArrayList<>();
        }
        this.H.add(cVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void c(s sVar) {
        String[] a2;
        if (!(this.f3332m == null || sVar.f3355a.isEmpty() || (a2 = this.f3332m.a()) == null)) {
            for (String str : a2) {
                if (!sVar.f3355a.containsKey(str)) {
                    this.f3332m.a(sVar);
                    return;
                }
            }
        }
    }

    public void e(View view) {
        if (this.F) {
            if (!this.G) {
                androidx.c.a<Animator, a> f2 = f();
                int size = f2.size();
                an b2 = ae.b(view);
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    a c2 = f2.c(i2);
                    if (c2.f3336a != null && b2.equals(c2.f3339d)) {
                        int i3 = Build.VERSION.SDK_INT;
                        f2.b(i2).resume();
                    }
                }
                ArrayList<c> arrayList = this.H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.H.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((c) arrayList2.get(i4)).c(this);
                    }
                }
            }
            this.F = false;
        }
    }

    public void d(View view) {
        int i2;
        if (!this.G) {
            androidx.c.a<Animator, a> f2 = f();
            int size = f2.size();
            an b2 = ae.b(view);
            int i3 = size - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                a c2 = f2.c(i3);
                if (c2.f3336a != null && b2.equals(c2.f3339d)) {
                    int i4 = Build.VERSION.SDK_INT;
                    f2.b(i3).pause();
                }
                i3--;
            }
            ArrayList<c> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    ((c) arrayList2.get(i2)).b(this);
                }
            }
            this.F = true;
        }
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3323d != -1) {
            str2 = str2 + "dur(" + this.f3323d + ") ";
        }
        if (this.f3322c != -1) {
            str2 = str2 + "dly(" + this.f3322c + ") ";
        }
        if (this.f3324e != null) {
            str2 = str2 + "interp(" + this.f3324e + ") ";
        }
        if (this.f3325f.size() <= 0 && this.f3326g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f3325f.size() > 0) {
            for (int i2 = 0; i2 < this.f3325f.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3325f.get(i2);
            }
        }
        if (this.f3326g.size() > 0) {
            for (int i3 = 0; i3 < this.f3326g.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3326g.get(i3);
            }
        }
        return str3 + ")";
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewGroup viewGroup) {
        a aVar;
        this.A = new ArrayList<>();
        this.B = new ArrayList<>();
        a(this.x, this.y);
        androidx.c.a<Animator, a> f2 = f();
        int size = f2.size();
        an b2 = ae.b(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator b3 = f2.b(i2);
            if (!(b3 == null || (aVar = f2.get(b3)) == null || aVar.f3336a == null || !b2.equals(aVar.f3339d))) {
                s sVar = aVar.f3338c;
                View view = aVar.f3336a;
                s a2 = a(view, true);
                s b4 = b(view, true);
                if (!(a2 == null && b4 == null) && aVar.f3340e.a(sVar, b4)) {
                    if (b3.isRunning() || b3.isStarted()) {
                        b3.cancel();
                    } else {
                        f2.remove(b3);
                    }
                }
            }
        }
        a(viewGroup, this.x, this.y, this.A, this.B);
        b();
    }

    /* access modifiers changed from: package-private */
    public final s b(View view, boolean z2) {
        ArrayList<s> arrayList;
        ArrayList<s> arrayList2;
        q qVar = this;
        while (true) {
            q qVar2 = qVar.f3329j;
            if (qVar2 == null) {
                break;
            }
            qVar = qVar2;
        }
        if (z2) {
            arrayList = qVar.A;
        } else {
            arrayList = qVar.B;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f3356b == view) {
                if (i2 < 0) {
                    return null;
                } else {
                    if (z2) {
                        arrayList2 = qVar.B;
                    } else {
                        arrayList2 = qVar.A;
                    }
                    return arrayList2.get(i2);
                }
            }
        }
        return null;
    }

    private void c(View view, boolean z2) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.q;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.r;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.s;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (this.s.get(i2).isInstance(view)) {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        s sVar = new s();
                        sVar.f3356b = view;
                        if (z2) {
                            a(sVar);
                        } else {
                            b(sVar);
                        }
                        sVar.f3357c.add(this);
                        c(sVar);
                        if (z2) {
                            a(this.x, view, sVar);
                        } else {
                            a(this.y, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.u;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.v;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.w;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        if (this.w.get(i3).isInstance(view)) {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                    c(viewGroup.getChildAt(i4), z2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final s a(View view, boolean z2) {
        t tVar;
        q qVar = this;
        while (true) {
            q qVar2 = qVar.f3329j;
            if (qVar2 == null) {
                break;
            }
            qVar = qVar2;
        }
        if (z2) {
            tVar = qVar.x;
        } else {
            tVar = qVar.y;
        }
        return tVar.f3358a.get(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: java.util.ArrayList<androidx.k.s> */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(t tVar, t tVar2) {
        s sVar;
        View view;
        View view2;
        View a2;
        androidx.c.a aVar = new androidx.c.a(tVar.f3358a);
        androidx.c.a aVar2 = new androidx.c.a(tVar2.f3358a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.z;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                for (int size = aVar.size() - 1; size >= 0; size--) {
                    View view3 = (View) aVar.b(size);
                    if (!(view3 == null || !a(view3) || (sVar = (s) aVar2.remove(view3)) == null || sVar.f3356b == null || !a(sVar.f3356b))) {
                        this.A.add(aVar.d(size));
                        this.B.add(sVar);
                    }
                }
            } else if (i3 == 2) {
                androidx.c.a<String, View> aVar3 = tVar.f3361d;
                androidx.c.a<String, View> aVar4 = tVar2.f3361d;
                int size2 = aVar3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    View c2 = aVar3.c(i4);
                    if (c2 != null && a(c2) && (view = aVar4.get(aVar3.b(i4))) != null && a(view)) {
                        Object obj = aVar.get(c2);
                        Object obj2 = aVar2.get(view);
                        if (!(obj == null || obj2 == null)) {
                            this.A.add(obj);
                            this.B.add(obj2);
                            aVar.remove(c2);
                            aVar2.remove(view);
                        }
                    }
                }
            } else if (i3 == 3) {
                SparseArray<View> sparseArray = tVar.f3359b;
                SparseArray<View> sparseArray2 = tVar2.f3359b;
                int size3 = sparseArray.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    View valueAt = sparseArray.valueAt(i5);
                    if (valueAt != null && a(valueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i5))) != null && a(view2)) {
                        Object obj3 = aVar.get(valueAt);
                        Object obj4 = aVar2.get(view2);
                        if (!(obj3 == null || obj4 == null)) {
                            this.A.add(obj3);
                            this.B.add(obj4);
                            aVar.remove(valueAt);
                            aVar2.remove(view2);
                        }
                    }
                }
            } else if (i3 == 4) {
                d<View> dVar = tVar.f3360c;
                d<View> dVar2 = tVar2.f3360c;
                int b2 = dVar.b();
                for (int i6 = 0; i6 < b2; i6++) {
                    View c3 = dVar.c(i6);
                    if (c3 != null && a(c3) && (a2 = dVar2.a(dVar.b(i6), null)) != null && a(a2)) {
                        Object obj5 = aVar.get(c3);
                        Object obj6 = aVar2.get(a2);
                        if (!(obj5 == null || obj6 == null)) {
                            this.A.add(obj5);
                            this.B.add(obj6);
                            aVar.remove(c3);
                            aVar2.remove(a2);
                        }
                    }
                }
            }
            i2++;
        }
        for (int i7 = 0; i7 < aVar.size(); i7++) {
            s sVar2 = (s) aVar.c(i7);
            if (a(sVar2.f3356b)) {
                this.A.add(sVar2);
                this.B.add(null);
            }
        }
        for (int i8 = 0; i8 < aVar2.size(); i8++) {
            s sVar3 = (s) aVar2.c(i8);
            if (a(sVar3.f3356b)) {
                this.B.add(sVar3);
                this.A.add(null);
            }
        }
    }

    private static boolean a(s sVar, s sVar2, String str) {
        Object obj = sVar.f3355a.get(str);
        Object obj2 = sVar2.f3355a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null || !obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    private static void a(t tVar, View view, s sVar) {
        tVar.f3358a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f3359b.indexOfKey(id) >= 0) {
                tVar.f3359b.put(id, null);
            } else {
                tVar.f3359b.put(id, view);
            }
        }
        String l2 = v.l(view);
        if (l2 != null) {
            if (tVar.f3361d.containsKey(l2)) {
                tVar.f3361d.put(l2, null);
            } else {
                tVar.f3361d.put(l2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f3360c.c(itemIdAtPosition) >= 0) {
                    View a2 = tVar.f3360c.a(itemIdAtPosition, null);
                    if (a2 != null) {
                        v.a(a2, false);
                        tVar.f3360c.b(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                v.a(view, true);
                tVar.f3360c.b(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        View f3336a;

        /* renamed from: b  reason: collision with root package name */
        String f3337b;

        /* renamed from: c  reason: collision with root package name */
        s f3338c;

        /* renamed from: d  reason: collision with root package name */
        an f3339d;

        /* renamed from: e  reason: collision with root package name */
        m f3340e;

        static {
            Covode.recordClassIndex(1227);
        }

        a(View view, String str, m mVar, an anVar, s sVar) {
            this.f3336a = view;
            this.f3337b = str;
            this.f3338c = sVar;
            this.f3339d = anVar;
            this.f3340e = mVar;
        }
    }
}
