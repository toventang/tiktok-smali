package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class i extends ab {
    private static TimeInterpolator n;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.ViewHolder>> f4043a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<ArrayList<b>> f4044b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<ArrayList<a>> f4045c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f4046d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f4047e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f4048f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f4049g = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> o = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> p = new ArrayList<>();
    private ArrayList<b> q = new ArrayList<>();
    private ArrayList<a> r = new ArrayList<>();

    static {
        Covode.recordClassIndex(1572);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean a(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.a(viewHolder, list);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (!b()) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f4078a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.ViewHolder f4079b;

        /* renamed from: c  reason: collision with root package name */
        public int f4080c;

        /* renamed from: d  reason: collision with root package name */
        public int f4081d;

        /* renamed from: e  reason: collision with root package name */
        public int f4082e;

        /* renamed from: f  reason: collision with root package name */
        public int f4083f;

        static {
            Covode.recordClassIndex(1581);
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f4078a + ", newHolder=" + this.f4079b + ", fromX=" + this.f4080c + ", fromY=" + this.f4081d + ", toX=" + this.f4082e + ", toY=" + this.f4083f + '}';
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f4078a = viewHolder;
            this.f4079b = viewHolder2;
        }

        a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
            this(viewHolder, viewHolder2);
            this.f4080c = i2;
            this.f4081d = i3;
            this.f4082e = i4;
            this.f4083f = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean b() {
        if (!this.p.isEmpty() || !this.r.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.f4047e.isEmpty() || !this.f4048f.isEmpty() || !this.f4046d.isEmpty() || !this.f4049g.isEmpty() || !this.f4044b.isEmpty() || !this.f4043a.isEmpty() || !this.f4045c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void a() {
        long j2;
        long j3;
        boolean z = !this.o.isEmpty();
        boolean z2 = !this.q.isEmpty();
        boolean z3 = !this.r.isEmpty();
        boolean z4 = !this.p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.o.iterator();
            while (it.hasNext()) {
                final RecyclerView.ViewHolder next = it.next();
                final View view = next.itemView;
                final ViewPropertyAnimator animate = view.animate();
                this.f4048f.add(next);
                animate.setDuration(this.f3831j).alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                    /* class androidx.recyclerview.widget.i.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(1576);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        animate.setListener(null);
                        view.setAlpha(1.0f);
                        i.this.f(next);
                        i.this.f4048f.remove(next);
                        i.this.c();
                    }
                }).start();
            }
            this.o.clear();
            if (z2) {
                final ArrayList<b> arrayList = new ArrayList<>();
                arrayList.addAll(this.q);
                this.f4044b.add(arrayList);
                this.q.clear();
                AnonymousClass1 r3 = new Runnable() {
                    /* class androidx.recyclerview.widget.i.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(1573);
                    }

                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            b bVar = (b) it.next();
                            i iVar = i.this;
                            RecyclerView.ViewHolder viewHolder = bVar.f4084a;
                            int i2 = bVar.f4085b;
                            int i3 = bVar.f4086c;
                            int i4 = bVar.f4087d;
                            int i5 = bVar.f4088e;
                            View view = viewHolder.itemView;
                            int i6 = i4 - i2;
                            int i7 = i5 - i3;
                            if (i6 != 0) {
                                view.animate().translationX(0.0f);
                            }
                            if (i7 != 0) {
                                view.animate().translationY(0.0f);
                            }
                            ViewPropertyAnimator animate = view.animate();
                            iVar.f4047e.add(viewHolder);
                            animate.setDuration(iVar.f3832k).setListener(new AnimatorListenerAdapter(viewHolder, i6, view, i7, animate) {
                                /* class androidx.recyclerview.widget.i.AnonymousClass6 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ RecyclerView.ViewHolder f4064a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ int f4065b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ View f4066c;

                                /* renamed from: d  reason: collision with root package name */
                                final /* synthetic */ int f4067d;

                                /* renamed from: e  reason: collision with root package name */
                                final /* synthetic */ ViewPropertyAnimator f4068e;

                                static {
                                    Covode.recordClassIndex(1578);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    if (this.f4065b != 0) {
                                        this.f4066c.setTranslationX(0.0f);
                                    }
                                    if (this.f4067d != 0) {
                                        this.f4066c.setTranslationY(0.0f);
                                    }
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f4068e.setListener(null);
                                    i.this.f(this.f4064a);
                                    i.this.f4047e.remove(this.f4064a);
                                    i.this.c();
                                }

                                {
                                    this.f4064a = r2;
                                    this.f4065b = r3;
                                    this.f4066c = r4;
                                    this.f4067d = r5;
                                    this.f4068e = r6;
                                }
                            }).start();
                        }
                        arrayList.clear();
                        i.this.f4044b.remove(arrayList);
                    }
                };
                if (z) {
                    v.a(arrayList.get(0).f4084a.itemView, r3, this.f3831j);
                } else {
                    r3.run();
                }
            }
            if (z3) {
                final ArrayList<a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.r);
                this.f4045c.add(arrayList2);
                this.r.clear();
                AnonymousClass2 r32 = new Runnable() {
                    /* class androidx.recyclerview.widget.i.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(1574);
                    }

                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            i iVar = i.this;
                            RecyclerView.ViewHolder viewHolder = aVar.f4078a;
                            View view2 = null;
                            if (viewHolder == null) {
                                view = null;
                            } else {
                                view = viewHolder.itemView;
                            }
                            RecyclerView.ViewHolder viewHolder2 = aVar.f4079b;
                            if (viewHolder2 != null) {
                                view2 = viewHolder2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(iVar.f3833l);
                                iVar.f4049g.add(aVar.f4078a);
                                duration.translationX((float) (aVar.f4082e - aVar.f4080c));
                                duration.translationY((float) (aVar.f4083f - aVar.f4081d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {
                                    /* class androidx.recyclerview.widget.i.AnonymousClass7 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ a f4070a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ ViewPropertyAnimator f4071b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ View f4072c;

                                    static {
                                        Covode.recordClassIndex(1579);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f4071b.setListener(null);
                                        this.f4072c.setAlpha(1.0f);
                                        this.f4072c.setTranslationX(0.0f);
                                        this.f4072c.setTranslationY(0.0f);
                                        i.this.f(this.f4070a.f4078a);
                                        i.this.f4049g.remove(this.f4070a.f4078a);
                                        i.this.c();
                                    }

                                    {
                                        this.f4070a = r2;
                                        this.f4071b = r3;
                                        this.f4072c = r4;
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                iVar.f4049g.add(aVar.f4079b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(iVar.f3833l).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {
                                    /* class androidx.recyclerview.widget.i.AnonymousClass8 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ a f4074a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ ViewPropertyAnimator f4075b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ View f4076c;

                                    static {
                                        Covode.recordClassIndex(1580);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f4075b.setListener(null);
                                        this.f4076c.setAlpha(1.0f);
                                        this.f4076c.setTranslationX(0.0f);
                                        this.f4076c.setTranslationY(0.0f);
                                        i.this.f(this.f4074a.f4079b);
                                        i.this.f4049g.remove(this.f4074a.f4079b);
                                        i.this.c();
                                    }

                                    {
                                        this.f4074a = r2;
                                        this.f4075b = r3;
                                        this.f4076c = r4;
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        i.this.f4045c.remove(arrayList2);
                    }
                };
                if (z) {
                    v.a(arrayList2.get(0).f4078a.itemView, r32, this.f3831j);
                } else {
                    r32.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.p);
                this.f4043a.add(arrayList3);
                this.p.clear();
                AnonymousClass3 r6 = new Runnable() {
                    /* class androidx.recyclerview.widget.i.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(1575);
                    }

                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                            i iVar = i.this;
                            View view = viewHolder.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            iVar.f4046d.add(viewHolder);
                            animate.alpha(1.0f).setDuration(iVar.f3830i).setListener(new AnimatorListenerAdapter(viewHolder, view, animate) {
                                /* class androidx.recyclerview.widget.i.AnonymousClass5 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ RecyclerView.ViewHolder f4060a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ View f4061b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ ViewPropertyAnimator f4062c;

                                static {
                                    Covode.recordClassIndex(1577);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.f4061b.setAlpha(1.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f4062c.setListener(null);
                                    i.this.f(this.f4060a);
                                    i.this.f4046d.remove(this.f4060a);
                                    i.this.c();
                                }

                                {
                                    this.f4060a = r2;
                                    this.f4061b = r3;
                                    this.f4062c = r4;
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        i.this.f4043a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    long j4 = 0;
                    if (z) {
                        j2 = this.f3831j;
                    } else {
                        j2 = 0;
                    }
                    if (z2) {
                        j3 = this.f3832k;
                    } else {
                        j3 = 0;
                    }
                    if (z3) {
                        j4 = this.f3833l;
                    }
                    v.a(arrayList3.get(0).itemView, r6, j2 + Math.max(j3, j4));
                    return;
                }
                r6.run();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void d() {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            b bVar = this.q.get(size);
            View view = bVar.f4084a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            f(bVar.f4084a);
            this.q.remove(size);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            f(this.o.get(size2));
            this.o.remove(size2);
        }
        for (int size3 = this.p.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.p.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            f(viewHolder);
            this.p.remove(size3);
        }
        for (int size4 = this.r.size() - 1; size4 >= 0; size4--) {
            a(this.r.get(size4));
        }
        this.r.clear();
        if (b()) {
            for (int size5 = this.f4044b.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList = this.f4044b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f4084a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    f(bVar2.f4084a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4044b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4043a.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f4043a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    f(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4043a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4045c.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList3 = this.f4045c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4045c.remove(arrayList3);
                    }
                }
            }
            a(this.f4048f);
            a(this.f4047e);
            a(this.f4046d);
            a(this.f4049g);
            e();
        }
    }

    @Override // androidx.recyclerview.widget.ab
    public boolean a(RecyclerView.ViewHolder viewHolder) {
        h(viewHolder);
        this.o.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.ab
    public boolean b(RecyclerView.ViewHolder viewHolder) {
        h(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.p.add(viewHolder);
        return true;
    }

    private void a(a aVar) {
        if (aVar.f4078a != null) {
            a(aVar, aVar.f4078a);
        }
        if (aVar.f4079b != null) {
            a(aVar, aVar.f4079b);
        }
    }

    private void h(RecyclerView.ViewHolder viewHolder) {
        if (n == null) {
            n = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(n);
        c(viewHolder);
    }

    private static void a(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void c(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (this.q.get(size).f4084a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                f(viewHolder);
                this.q.remove(size);
            }
        }
        a(this.r, viewHolder);
        if (this.o.remove(viewHolder)) {
            view.setAlpha(1.0f);
            f(viewHolder);
        }
        if (this.p.remove(viewHolder)) {
            view.setAlpha(1.0f);
            f(viewHolder);
        }
        for (int size2 = this.f4045c.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList = this.f4045c.get(size2);
            a(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f4045c.remove(size2);
            }
        }
        for (int size3 = this.f4044b.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList2 = this.f4044b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4084a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    f(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4044b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4043a.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f4043a.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                f(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f4043a.remove(size5);
                }
            }
        }
        this.f4048f.remove(viewHolder);
        this.f4046d.remove(viewHolder);
        this.f4049g.remove(viewHolder);
        this.f4047e.remove(viewHolder);
        c();
    }

    private void a(List<a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (a(aVar, viewHolder) && aVar.f4078a == null && aVar.f4079b == null) {
                list.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, RecyclerView.ViewHolder viewHolder) {
        if (aVar.f4079b == viewHolder) {
            aVar.f4079b = null;
        } else if (aVar.f4078a != viewHolder) {
            return false;
        } else {
            aVar.f4078a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        f(viewHolder);
        return true;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f4084a;

        /* renamed from: b  reason: collision with root package name */
        public int f4085b;

        /* renamed from: c  reason: collision with root package name */
        public int f4086c;

        /* renamed from: d  reason: collision with root package name */
        public int f4087d;

        /* renamed from: e  reason: collision with root package name */
        public int f4088e;

        static {
            Covode.recordClassIndex(1582);
        }

        b(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
            this.f4084a = viewHolder;
            this.f4085b = i2;
            this.f4086c = i3;
            this.f4087d = i4;
            this.f4088e = i5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r1 != 0) goto L_0x002e;
     */
    @Override // androidx.recyclerview.widget.ab
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r4 = r10
            r5 = r11
            r3 = r9
            android.view.View r2 = r3.itemView
            android.view.View r0 = r3.itemView
            float r0 = r0.getTranslationX()
            int r0 = (int) r0
            int r4 = r4 + r0
            android.view.View r0 = r3.itemView
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r5 = r5 + r0
            r8.h(r3)
            r6 = r12
            int r0 = r6 - r4
            r7 = r13
            int r1 = r7 - r5
            if (r0 != 0) goto L_0x0027
            if (r1 != 0) goto L_0x002e
            r8.f(r3)
            r0 = 0
            return r0
        L_0x0027:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x0033
        L_0x002e:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x0033:
            java.util.ArrayList<androidx.recyclerview.widget.i$b> r0 = r8.q
            androidx.recyclerview.widget.i$b r2 = new androidx.recyclerview.widget.i$b
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.i.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.ab
    public boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
        if (viewHolder == viewHolder2) {
            return a(viewHolder, i2, i3, i4, i5);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        h(viewHolder);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            h(viewHolder2);
            viewHolder2.itemView.setTranslationX((float) (-i6));
            viewHolder2.itemView.setTranslationY((float) (-i7));
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.r.add(new a(viewHolder, viewHolder2, i2, i3, i4, i5));
        return true;
    }
}
