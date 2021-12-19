package androidx.recyclerview.widget;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.h.a.d;
import androidx.core.h.a.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;

public class z extends androidx.core.h.a {

    /* renamed from: b  reason: collision with root package name */
    final RecyclerView f4224b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4225c;

    static {
        Covode.recordClassIndex(1634);
    }

    public static class a extends androidx.core.h.a {

        /* renamed from: b  reason: collision with root package name */
        final z f4226b;

        /* renamed from: c  reason: collision with root package name */
        Map<View, androidx.core.h.a> f4227c = new WeakHashMap();

        static {
            Covode.recordClassIndex(1635);
        }

        public a(z zVar) {
            this.f4226b = zVar;
        }

        /* access modifiers changed from: package-private */
        public final androidx.core.h.a c(View view) {
            return this.f4227c.remove(view);
        }

        @Override // androidx.core.h.a
        public final e a(View view) {
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                return aVar.a(view);
            }
            return super.a(view);
        }

        @Override // androidx.core.h.a
        public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                return aVar.b(view, accessibilityEvent);
            }
            return super.b(view, accessibilityEvent);
        }

        @Override // androidx.core.h.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                aVar.d(view, accessibilityEvent);
            } else {
                super.d(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.h.a
        public final void a(View view, int i2) {
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                aVar.a(view, i2);
            } else {
                super.a(view, i2);
            }
        }

        @Override // androidx.core.h.a
        public final void a(View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                aVar.a(view, accessibilityEvent);
            } else {
                super.a(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.h.a
        public final void a(View view, d dVar) {
            if (this.f4226b.f4224b.p() || this.f4226b.f4224b.getLayoutManager() == null) {
                super.a(view, dVar);
                return;
            }
            this.f4226b.f4224b.getLayoutManager().a(view, dVar);
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                aVar.a(view, dVar);
            } else {
                super.a(view, dVar);
            }
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (this.f4226b.f4224b.p() || this.f4226b.f4224b.getLayoutManager() == null) {
                return super.a(view, i2, bundle);
            }
            androidx.core.h.a aVar = this.f4227c.get(view);
            if (aVar != null) {
                if (aVar.a(view, i2, bundle)) {
                    return true;
                }
            } else if (super.a(view, i2, bundle)) {
                return true;
            }
            this.f4226b.f4224b.getLayoutManager();
            return false;
        }

        @Override // androidx.core.h.a
        public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            androidx.core.h.a aVar = this.f4227c.get(viewGroup);
            if (aVar != null) {
                return aVar.a(viewGroup, view, accessibilityEvent);
            }
            return super.a(viewGroup, view, accessibilityEvent);
        }
    }

    public z(RecyclerView recyclerView) {
        this.f4224b = recyclerView;
        a aVar = this.f4225c;
        if (aVar == null || !(aVar instanceof a)) {
            this.f4225c = new a(this);
        } else {
            this.f4225c = aVar;
        }
    }

    @Override // androidx.core.h.a
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.f4224b.p()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    @Override // androidx.core.h.a
    public final void a(View view, d dVar) {
        d.b bVar;
        super.a(view, dVar);
        if (!this.f4224b.p() && this.f4224b.getLayoutManager() != null) {
            RecyclerView.i layoutManager = this.f4224b.getLayoutManager();
            RecyclerView.o oVar = layoutManager.w.f3811e;
            RecyclerView.s sVar = layoutManager.w.G;
            if (layoutManager.w.canScrollVertically(-1) || layoutManager.w.canScrollHorizontally(-1)) {
                dVar.a(8192);
                dVar.d(true);
            }
            if (layoutManager.w.canScrollVertically(1) || layoutManager.w.canScrollHorizontally(1)) {
                dVar.a(4096);
                dVar.d(true);
            }
            int a2 = layoutManager.a(oVar, sVar);
            int b2 = layoutManager.b(oVar, sVar);
            if (Build.VERSION.SDK_INT >= 21) {
                bVar = new d.b(AccessibilityNodeInfo.CollectionInfo.obtain(a2, b2, false, 0));
            } else {
                int i2 = Build.VERSION.SDK_INT;
                bVar = new d.b(AccessibilityNodeInfo.CollectionInfo.obtain(a2, b2, false));
            }
            int i3 = Build.VERSION.SDK_INT;
            dVar.f2484a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) bVar.f2500a);
        }
    }

    @Override // androidx.core.h.a
    public final boolean a(View view, int i2, Bundle bundle) {
        int i3;
        int i4;
        if (super.a(view, i2, bundle)) {
            return true;
        }
        if (this.f4224b.p() || this.f4224b.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.i layoutManager = this.f4224b.getLayoutManager();
        if (layoutManager.w == null) {
            return false;
        }
        if (i2 == 4096) {
            if (layoutManager.w.canScrollVertically(1)) {
                i3 = (layoutManager.K - layoutManager.u()) - layoutManager.w();
            } else {
                i3 = 0;
            }
            if (layoutManager.w.canScrollHorizontally(1)) {
                i4 = (layoutManager.J - layoutManager.t()) - layoutManager.v();
                layoutManager.w.a(i4, i3, true);
                return true;
            }
            i4 = 0;
            layoutManager.w.a(i4, i3, true);
            return true;
        } else if (i2 == 8192) {
            if (layoutManager.w.canScrollVertically(-1)) {
                i3 = -((layoutManager.K - layoutManager.u()) - layoutManager.w());
            } else {
                i3 = 0;
            }
            if (layoutManager.w.canScrollHorizontally(-1)) {
                i4 = -((layoutManager.J - layoutManager.t()) - layoutManager.v());
                if (!(i3 == 0 && i4 == 0)) {
                    layoutManager.w.a(i4, i3, true);
                    return true;
                }
            }
            i4 = 0;
            layoutManager.w.a(i4, i3, true);
            return true;
        }
        return false;
    }
}
