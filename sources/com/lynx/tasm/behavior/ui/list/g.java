package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UIComponent;

public final class g extends RecyclerView.n implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public a f56232a;

    /* renamed from: b  reason: collision with root package name */
    b f56233b = new b();

    /* renamed from: c  reason: collision with root package name */
    b f56234c = new b();

    /* renamed from: d  reason: collision with root package name */
    private UIList f56235d;

    /* renamed from: e  reason: collision with root package name */
    private int f56236e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f56237f = -1;

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public UIComponent f56241a;

        /* renamed from: b  reason: collision with root package name */
        public int f56242b = -1;

        static {
            Covode.recordClassIndex(35130);
        }
    }

    static {
        Covode.recordClassIndex(35127);
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void a() {
        h hVar;
        int i2;
        h hVar2;
        int i3 = 0;
        if (this.f56233b.f56242b != -1) {
            int e2 = this.f56235d.f56162c.e(this.f56233b.f56242b + 1);
            if (e2 == -1 || (hVar2 = (h) ((RecyclerView) this.f56235d.mView).f(e2)) == null) {
                i2 = 0;
            } else {
                i2 = Math.min(0, hVar2.itemView.getTop() - ((com.lynx.tasm.behavior.ui.view.a) this.f56233b.f56241a.mView).getBottom());
            }
            ((com.lynx.tasm.behavior.ui.view.a) this.f56233b.f56241a.mView).setTranslationY((float) i2);
        }
        if (this.f56234c.f56242b != -1) {
            int d2 = this.f56235d.f56162c.d(this.f56234c.f56242b - 1);
            if (!(d2 == -1 || (hVar = (h) ((RecyclerView) this.f56235d.mView).f(d2)) == null)) {
                i3 = Math.max(0, hVar.itemView.getBottom() - ((com.lynx.tasm.behavior.ui.view.a) this.f56234c.f56241a.mView).getTop());
            }
            ((com.lynx.tasm.behavior.ui.view.a) this.f56234c.f56241a.mView).setTranslationY((float) i3);
        }
    }

    private static ViewGroup a(View view) {
        MethodCollector.i(12937);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        MethodCollector.o(12937);
        return viewGroup;
    }

    g(UIList uIList) {
        this.f56235d = uIList;
        this.f56232a = new a(uIList.mContext);
        ((RecyclerView) uIList.mView).a(this);
        ((RecyclerView) uIList.mView).addOnAttachStateChangeListener(this);
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        if (UIList.f56161h) {
            LLog.a("UIList", "cleanOldStickyItem position " + bVar.f56242b);
        }
        a(bVar.f56241a.mView);
        if (this.f56235d.f56162c.f56251d) {
            this.f56235d.b(bVar.f56241a);
        } else {
            this.f56235d.a(bVar.f56241a);
        }
        bVar.f56242b = -1;
        bVar.f56241a = null;
    }

    public final void onViewAttachedToWindow(View view) {
        MethodCollector.i(12839);
        if (this.f56232a.indexOfChild(view) >= 0) {
            MethodCollector.o(12839);
            return;
        }
        a aVar = this.f56232a;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeViewAt(indexOfChild);
        aVar.addView(view, new FrameLayout.LayoutParams(-1, -1));
        viewGroup.addView(aVar, indexOfChild);
        MethodCollector.o(12839);
    }

    private void a(RecyclerView recyclerView) {
        int i2;
        int i3;
        RecyclerView.i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] a2 = staggeredGridLayoutManager.a((int[]) null);
            int[] b2 = staggeredGridLayoutManager.b((int[]) null);
            i2 = Integer.MAX_VALUE;
            for (int i4 : a2) {
                i2 = Math.min(i2, i4);
            }
            i3 = Integer.MIN_VALUE;
            for (int i5 : b2) {
                i3 = Math.max(i3, i5);
            }
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.k();
            i3 = linearLayoutManager.m();
        }
        int d2 = this.f56235d.f56162c.d(i2);
        int e2 = this.f56235d.f56162c.e(i3);
        if (!this.f56235d.f56162c.b(d2)) {
            this.f56236e = -1;
        } else if (this.f56236e != d2) {
            this.f56236e = d2;
            if (UIList.f56161h) {
                LLog.a(4, "UIList", com.a.a("new sticky-top position %d", new Object[]{Integer.valueOf(this.f56236e)}));
            }
        }
        if (!this.f56235d.f56162c.c(e2)) {
            this.f56237f = -1;
        } else if (this.f56237f != e2) {
            this.f56237f = e2;
            if (UIList.f56161h) {
                LLog.a(4, "UIList", com.a.a("new sticky-bottom position %d", new Object[]{Integer.valueOf(this.f56237f)}));
            }
        }
        if (!(this.f56233b.f56242b == -1 || this.f56233b.f56242b == this.f56236e)) {
            a(this.f56233b);
        }
        if (!(this.f56234c.f56242b == -1 || this.f56234c.f56242b == this.f56237f)) {
            a(this.f56234c);
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends FrameLayout {
        static {
            Covode.recordClassIndex(35129);
        }

        public a(Context context) {
            super(context);
            MethodCollector.i(13488);
            MethodCollector.o(13488);
        }

        /* access modifiers changed from: protected */
        public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
            if (view instanceof com.lynx.tasm.behavior.ui.view.b) {
                view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                super.measureChildWithMargins(view, i2, i3, i4, i5);
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            MethodCollector.i(13550);
            super.onLayout(z, i2, i3, i4, i5);
            g.this.a();
            MethodCollector.o(13550);
        }
    }

    public final void b(RecyclerView recyclerView, int i2) {
        if (i2 > 0) {
            a(this.f56234c, false);
        } else if (i2 < 0) {
            a(this.f56233b, true);
        }
        a(recyclerView);
        a(this.f56233b, this.f56236e, true);
        a(this.f56234c, this.f56237f, false);
        a();
    }

    private void a(b bVar, boolean z) {
        h hVar;
        if (bVar.f56242b != -1 && (hVar = (h) ((RecyclerView) this.f56235d.mView).f(bVar.f56242b)) != null) {
            if (hVar.f56243a.f56245b != null) {
                if (this.f56235d.f56162c.f56251d) {
                    this.f56235d.b(hVar.f56243a.f56245b);
                }
                hVar.a();
            }
            int top = hVar.f56243a.getTop();
            T t = bVar.f56241a.mView;
            if (z) {
                if (top <= t.getTop()) {
                    return;
                }
            } else if (top >= t.getTop()) {
                return;
            }
            if (UIList.f56161h) {
                LLog.b("UIList", "restoreToHolderIfNeed stickyItem position" + bVar.f56242b);
            }
            a(bVar.f56241a.mView);
            hVar.a(bVar.f56241a);
            bVar.f56242b = -1;
            bVar.f56241a = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void a(final RecyclerView recyclerView, int i2, int i3) {
        if (i3 == 0) {
            recyclerView.post(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.list.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35128);
                }

                public final void run() {
                    g.this.b(recyclerView, 0);
                }
            });
        } else {
            b(recyclerView, i3);
        }
    }

    private void a(b bVar, int i2, boolean z) {
        boolean z2;
        int i3;
        if (i2 != -1 && i2 != bVar.f56242b) {
            RecyclerView recyclerView = (RecyclerView) this.f56235d.mView;
            h hVar = (h) recyclerView.f(i2);
            if (hVar == null) {
                hVar = (h) recyclerView.getAdapter().createViewHolder(recyclerView, recyclerView.getAdapter().getItemViewType(i2));
                if (this.f56235d.f56162c.f56251d) {
                    this.f56235d.f56162c.a(hVar, i2);
                } else {
                    this.f56235d.f56162c.bindViewHolder(hVar, i2);
                }
            } else if (!z) {
                if (z || hVar.f56243a.getBottom() <= this.f56232a.getHeight()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (0 == 0 && !z2) {
                    return;
                }
            } else if (hVar.f56243a.getTop() >= 0) {
                return;
            }
            UIComponent uIComponent = hVar.f56243a.f56245b;
            if (uIComponent != null) {
                hVar.a();
                if (z) {
                    i3 = 48;
                } else {
                    i3 = 80;
                }
                this.f56232a.addView(uIComponent.mView, new FrameLayout.LayoutParams(-2, -2, i3));
                bVar.f56241a = uIComponent;
                bVar.f56242b = i2;
                if (UIList.f56161h) {
                    LLog.b("UIList", "finish moveSticky ".concat(String.valueOf(i2)));
                }
            }
        }
    }
}
