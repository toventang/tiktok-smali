package com.ss.android.ugc.aweme.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.h.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class j extends ab {
    private static TimeInterpolator o;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.ViewHolder>> f93253a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    ArrayList<ArrayList<b>> f93254b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<ArrayList<a>> f93255c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f93256d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f93257e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f93258f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    ArrayList<RecyclerView.ViewHolder> f93259g = new ArrayList<>();
    public RecyclerView n;
    private ArrayList<RecyclerView.ViewHolder> p = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> q = new ArrayList<>();
    private ArrayList<b> r = new ArrayList<>();
    private ArrayList<a> s = new ArrayList<>();

    static {
        Covode.recordClassIndex(59136);
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
        public RecyclerView.ViewHolder f93286a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.ViewHolder f93287b;

        /* renamed from: c  reason: collision with root package name */
        public int f93288c;

        /* renamed from: d  reason: collision with root package name */
        public int f93289d;

        /* renamed from: e  reason: collision with root package name */
        public int f93290e;

        /* renamed from: f  reason: collision with root package name */
        public int f93291f;

        static {
            Covode.recordClassIndex(59146);
        }

        public final String toString() {
            return "ChangeInfo{oldHolder=" + this.f93286a + ", newHolder=" + this.f93287b + ", fromX=" + this.f93288c + ", fromY=" + this.f93289d + ", toX=" + this.f93290e + ", toY=" + this.f93291f + '}';
        }

        private a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f93286a = viewHolder;
            this.f93287b = viewHolder2;
        }

        a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
            this(viewHolder, viewHolder2);
            this.f93288c = i2;
            this.f93289d = i3;
            this.f93290e = i4;
            this.f93291f = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final boolean b() {
        if (!this.q.isEmpty() || !this.s.isEmpty() || !this.r.isEmpty() || !this.p.isEmpty() || !this.f93257e.isEmpty() || !this.f93258f.isEmpty() || !this.f93256d.isEmpty() || !this.f93259g.isEmpty() || !this.f93254b.isEmpty() || !this.f93253a.isEmpty() || !this.f93255c.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void d() {
        for (int size = this.r.size() - 1; size >= 0; size--) {
            b bVar = this.r.get(size);
            View view = bVar.f93292a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            f(bVar.f93292a);
            this.r.remove(size);
        }
        for (int size2 = this.p.size() - 1; size2 >= 0; size2--) {
            f(this.p.get(size2));
            this.p.remove(size2);
        }
        for (int size3 = this.q.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.q.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            f(viewHolder);
            this.q.remove(size3);
        }
        for (int size4 = this.s.size() - 1; size4 >= 0; size4--) {
            a(this.s.get(size4));
        }
        this.s.clear();
        if (b()) {
            for (int size5 = this.f93254b.size() - 1; size5 >= 0; size5--) {
                ArrayList<b> arrayList = this.f93254b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.f93292a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    f(bVar2.f93292a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f93254b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f93253a.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.ViewHolder> arrayList2 = this.f93253a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                    viewHolder2.itemView.setAlpha(1.0f);
                    f(viewHolder2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f93253a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f93255c.size() - 1; size9 >= 0; size9--) {
                ArrayList<a> arrayList3 = this.f93255c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    a(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f93255c.remove(arrayList3);
                    }
                }
            }
            a(this.f93258f);
            a(this.f93257e);
            a(this.f93256d);
            a(this.f93259g);
            e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void a() {
        long j2;
        long j3;
        boolean z = !this.p.isEmpty();
        boolean z2 = !this.r.isEmpty();
        boolean z3 = !this.s.isEmpty();
        boolean z4 = !this.q.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.ViewHolder> it = this.p.iterator();
            while (it.hasNext()) {
                final RecyclerView.ViewHolder next = it.next();
                this.f93258f.add(next);
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(59140);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        View view = next.itemView;
                        Float f2 = (Float) valueAnimator.getAnimatedValue();
                        view.setAlpha(1.0f - f2.floatValue());
                        view.setScaleX(1.0f - (f2.floatValue() * 0.5f));
                        view.setScaleY(1.0f - (f2.floatValue() * 0.5f));
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(59141);
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationEnd(Animator animator) {
                        ofFloat.removeAllListeners();
                        j.this.f(next);
                        j.this.f93258f.remove(next);
                        j.this.c();
                    }
                });
                ofFloat.start();
            }
            this.p.clear();
            if (z2) {
                final ArrayList<b> arrayList = new ArrayList<>();
                arrayList.addAll(this.r);
                this.f93254b.add(arrayList);
                this.r.clear();
                AnonymousClass1 r3 = new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(59137);
                    }

                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            j jVar = j.this;
                            RecyclerView.ViewHolder viewHolder = ((b) it.next()).f93292a;
                            jVar.f93257e.add(viewHolder);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            float translationX = viewHolder.itemView.getTranslationX();
                            ofFloat.setDuration(400L);
                            ofFloat.addUpdateListener(new k(jVar, viewHolder, translationX));
                            ofFloat.addListener(new AnimatorListenerAdapter(viewHolder, ofFloat) {
                                /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass7 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ RecyclerView.ViewHolder f93275a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ ValueAnimator f93276b;

                                static {
                                    Covode.recordClassIndex(59143);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f93276b.removeAllListeners();
                                    j.this.f(this.f93275a);
                                    j.this.f93257e.remove(this.f93275a);
                                    j.this.c();
                                }

                                {
                                    this.f93275a = r2;
                                    this.f93276b = r3;
                                }
                            });
                            ofFloat.setStartDelay(100);
                            ofFloat.start();
                        }
                        arrayList.clear();
                        j.this.f93254b.remove(arrayList);
                    }
                };
                if (z) {
                    v.a(arrayList.get(0).f93292a.itemView, r3, this.f3831j);
                } else {
                    r3.run();
                }
            }
            if (z3) {
                final ArrayList<a> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.s);
                this.f93255c.add(arrayList2);
                this.s.clear();
                AnonymousClass2 r32 = new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(59138);
                    }

                    public final void run() {
                        View view;
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            a aVar = (a) it.next();
                            j jVar = j.this;
                            RecyclerView.ViewHolder viewHolder = aVar.f93286a;
                            View view2 = null;
                            if (viewHolder == null) {
                                view = null;
                            } else {
                                view = viewHolder.itemView;
                            }
                            RecyclerView.ViewHolder viewHolder2 = aVar.f93287b;
                            if (viewHolder2 != null) {
                                view2 = viewHolder2.itemView;
                            }
                            if (view != null) {
                                ViewPropertyAnimator duration = view.animate().setDuration(jVar.f3833l);
                                jVar.f93259g.add(aVar.f93286a);
                                duration.translationX((float) (aVar.f93290e - aVar.f93288c));
                                duration.translationY((float) (aVar.f93291f - aVar.f93289d));
                                duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(aVar, duration, view) {
                                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass8 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ a f93278a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ ViewPropertyAnimator f93279b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ View f93280c;

                                    static {
                                        Covode.recordClassIndex(59144);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f93279b.setListener(null);
                                        this.f93280c.setAlpha(1.0f);
                                        this.f93280c.setTranslationX(0.0f);
                                        this.f93280c.setTranslationY(0.0f);
                                        j.this.f(this.f93278a.f93286a);
                                        j.this.f93259g.remove(this.f93278a.f93286a);
                                        j.this.c();
                                    }

                                    {
                                        this.f93278a = r2;
                                        this.f93279b = r3;
                                        this.f93280c = r4;
                                    }
                                }).start();
                            }
                            if (view2 != null) {
                                ViewPropertyAnimator animate = view2.animate();
                                jVar.f93259g.add(aVar.f93287b);
                                animate.translationX(0.0f).translationY(0.0f).setDuration(jVar.f3833l).alpha(1.0f).setListener(new AnimatorListenerAdapter(aVar, animate, view2) {
                                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass9 */

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ a f93282a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ ViewPropertyAnimator f93283b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ View f93284c;

                                    static {
                                        Covode.recordClassIndex(59145);
                                    }

                                    public final void onAnimationStart(Animator animator) {
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        this.f93283b.setListener(null);
                                        this.f93284c.setAlpha(1.0f);
                                        this.f93284c.setTranslationX(0.0f);
                                        this.f93284c.setTranslationY(0.0f);
                                        j.this.f(this.f93282a.f93287b);
                                        j.this.f93259g.remove(this.f93282a.f93287b);
                                        j.this.c();
                                    }

                                    {
                                        this.f93282a = r2;
                                        this.f93283b = r3;
                                        this.f93284c = r4;
                                    }
                                }).start();
                            }
                        }
                        arrayList2.clear();
                        j.this.f93255c.remove(arrayList2);
                    }
                };
                if (z) {
                    v.a(arrayList2.get(0).f93286a.itemView, r32, this.f3831j);
                } else {
                    r32.run();
                }
            }
            if (z4) {
                final ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.q);
                this.f93253a.add(arrayList3);
                this.q.clear();
                AnonymousClass3 r6 = new Runnable() {
                    /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(59139);
                    }

                    public final void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
                            j jVar = j.this;
                            View view = viewHolder.itemView;
                            ViewPropertyAnimator animate = view.animate();
                            jVar.f93256d.add(viewHolder);
                            animate.translationX(0.0f).setDuration(300).setListener(new AnimatorListenerAdapter(viewHolder, view, animate) {
                                /* class com.ss.android.ugc.aweme.feed.guide.j.AnonymousClass6 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ RecyclerView.ViewHolder f93271a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ View f93272b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ ViewPropertyAnimator f93273c;

                                static {
                                    Covode.recordClassIndex(59142);
                                }

                                public final void onAnimationStart(Animator animator) {
                                }

                                public final void onAnimationCancel(Animator animator) {
                                    this.f93272b.setTranslationX(0.0f);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    this.f93273c.setListener(null);
                                    j.this.f(this.f93271a);
                                    j.this.f93256d.remove(this.f93271a);
                                    j.this.c();
                                }

                                {
                                    this.f93271a = r2;
                                    this.f93272b = r3;
                                    this.f93273c = r4;
                                }
                            }).start();
                        }
                        arrayList3.clear();
                        j.this.f93253a.remove(arrayList3);
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

    @Override // androidx.recyclerview.widget.ab
    public final boolean a(RecyclerView.ViewHolder viewHolder) {
        h(viewHolder);
        this.p.add(viewHolder);
        return true;
    }

    private void h(RecyclerView.ViewHolder viewHolder) {
        if (o == null) {
            o = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(o);
        c(viewHolder);
    }

    private void a(a aVar) {
        if (aVar.f93286a != null) {
            a(aVar, aVar.f93286a);
        }
        if (aVar.f93287b != null) {
            a(aVar, aVar.f93287b);
        }
    }

    @Override // androidx.recyclerview.widget.ab
    public final boolean b(RecyclerView.ViewHolder viewHolder) {
        h(viewHolder);
        viewHolder.itemView.setAlpha(0.34f);
        if (viewHolder.getAdapterPosition() > ((GalleryLayoutManager) this.n.getLayoutManager()).f93214b) {
            viewHolder.itemView.setTranslationX((float) this.n.getWidth());
        } else {
            viewHolder.itemView.setTranslationX((float) (-this.n.getWidth()));
        }
        this.q.add(viewHolder);
        return true;
    }

    public j(RecyclerView recyclerView) {
        this.n = recyclerView;
    }

    private static void a(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void c(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.r.size() - 1; size >= 0; size--) {
            if (this.r.get(size).f93292a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                f(viewHolder);
                this.r.remove(size);
            }
        }
        a(this.s, viewHolder);
        if (this.p.remove(viewHolder)) {
            view.setAlpha(1.0f);
            f(viewHolder);
        }
        if (this.q.remove(viewHolder)) {
            view.setAlpha(1.0f);
            f(viewHolder);
        }
        for (int size2 = this.f93255c.size() - 1; size2 >= 0; size2--) {
            ArrayList<a> arrayList = this.f93255c.get(size2);
            a(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.f93255c.remove(size2);
            }
        }
        for (int size3 = this.f93254b.size() - 1; size3 >= 0; size3--) {
            ArrayList<b> arrayList2 = this.f93254b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f93292a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    f(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f93254b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f93253a.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.f93253a.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                f(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.f93253a.remove(size5);
                }
            }
        }
        this.f93258f.remove(viewHolder);
        this.f93256d.remove(viewHolder);
        this.f93259g.remove(viewHolder);
        this.f93257e.remove(viewHolder);
        c();
    }

    static float a(RecyclerView.ViewHolder viewHolder, float f2) {
        if (viewHolder.itemView.getContext() != null) {
            return n.b(viewHolder.itemView.getContext(), f2);
        }
        return 12.0f;
    }

    private void a(List<a> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a aVar = list.get(size);
            if (a(aVar, viewHolder) && aVar.f93286a == null && aVar.f93287b == null) {
                list.remove(aVar);
            }
        }
    }

    private boolean a(a aVar, RecyclerView.ViewHolder viewHolder) {
        if (aVar.f93287b == viewHolder) {
            aVar.f93287b = null;
        } else if (aVar.f93286a != viewHolder) {
            return false;
        } else {
            aVar.f93286a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        f(viewHolder);
        return true;
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.ViewHolder f93292a;

        /* renamed from: b  reason: collision with root package name */
        public int f93293b;

        /* renamed from: c  reason: collision with root package name */
        public int f93294c;

        /* renamed from: d  reason: collision with root package name */
        public int f93295d;

        /* renamed from: e  reason: collision with root package name */
        public int f93296e;

        static {
            Covode.recordClassIndex(59147);
        }

        b(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
            this.f93292a = viewHolder;
            this.f93293b = i2;
            this.f93294c = i3;
            this.f93295d = i4;
            this.f93296e = i5;
        }
    }

    @Override // androidx.recyclerview.widget.ab
    public final boolean a(RecyclerView.ViewHolder viewHolder, int i2, int i3, int i4, int i5) {
        int i6 = i2 - i4;
        viewHolder.itemView.setTranslationX((float) i6);
        viewHolder.itemView.setAlpha(0.34f);
        viewHolder.itemView.setScaleX(0.9f);
        viewHolder.itemView.setScaleY(0.9f);
        viewHolder.itemView.setTranslationY(a(viewHolder, 12.0f));
        if (Math.abs(i6) < viewHolder.itemView.getWidth() / 2) {
            return true;
        }
        this.r.add(new b(viewHolder, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.ab
    public final boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
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
        this.s.add(new a(viewHolder, viewHolder2, i2, i3, i4, i5));
        return true;
    }
}
