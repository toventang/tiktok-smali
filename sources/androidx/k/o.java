package androidx.k;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    static ArrayList<ViewGroup> f3341a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static m f3342b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static ThreadLocal<WeakReference<androidx.c.a<ViewGroup, ArrayList<m>>>> f3343c = new ThreadLocal<>();

    /* access modifiers changed from: package-private */
    public static class a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        m f3344a;

        /* renamed from: b  reason: collision with root package name */
        ViewGroup f3345b;

        static {
            Covode.recordClassIndex(1232);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        private void a() {
            this.f3345b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3345b.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            a();
            if (!o.f3341a.remove(this.f3345b)) {
                return true;
            }
            final androidx.c.a<ViewGroup, ArrayList<m>> a2 = o.a();
            ArrayList<m> arrayList = a2.get(this.f3345b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a2.put(this.f3345b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3344a);
            this.f3344a.a(new n() {
                /* class androidx.k.o.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1233);
                }

                @Override // androidx.k.n, androidx.k.m.c
                public final void a(m mVar) {
                    ((ArrayList) a2.get(a.this.f3345b)).remove(mVar);
                }
            });
            this.f3344a.a(this.f3345b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).e(this.f3345b);
                }
            }
            this.f3344a.a(this.f3345b);
            return true;
        }

        public final void onViewDetachedFromWindow(View view) {
            a();
            o.f3341a.remove(this.f3345b);
            ArrayList<m> arrayList = o.a().get(this.f3345b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e(this.f3345b);
                }
            }
            this.f3344a.a(true);
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f3344a = mVar;
            this.f3345b = viewGroup;
        }
    }

    static {
        Covode.recordClassIndex(1231);
    }

    static androidx.c.a<ViewGroup, ArrayList<m>> a() {
        androidx.c.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<androidx.c.a<ViewGroup, ArrayList<m>>> weakReference = f3343c.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        androidx.c.a<ViewGroup, ArrayList<m>> aVar2 = new androidx.c.a<>();
        f3343c.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void a(ViewGroup viewGroup) {
        a(viewGroup, null);
    }

    private static void b(ViewGroup viewGroup, m mVar) {
        if (mVar != null && viewGroup != null) {
            a aVar = new a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (!f3341a.contains(viewGroup) && v.v(viewGroup)) {
            f3341a.add(viewGroup);
            if (mVar == null) {
                mVar = f3342b;
            }
            m e2 = mVar.clone();
            c(viewGroup, e2);
            viewGroup.setTag(R.id.eqb, null);
            b(viewGroup, e2);
        }
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().d(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.a(viewGroup, true);
        }
        j a2 = j.a(viewGroup);
        if (a2 != null && j.a(a2.f3315a) == a2 && a2.f3316b != null) {
            a2.f3316b.run();
        }
    }
}
