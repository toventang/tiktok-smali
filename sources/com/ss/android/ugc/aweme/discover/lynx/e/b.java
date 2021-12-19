package com.ss.android.ugc.aweme.discover.lynx.e;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.page.c;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import h.f.b.l;

public final class b extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public static final a f81554b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f81555a;

    static {
        Covode.recordClassIndex(50678);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50679);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getHybirdType() {
        return this.f81555a;
    }

    public final boolean b() {
        if (getHybirdType() == 1) {
            return true;
        }
        return false;
    }

    private void d() {
        View childAt = getChildAt(1);
        if (!(childAt instanceof c)) {
            childAt = null;
        }
        c cVar = (c) childAt;
        if (cVar != null) {
            cVar.e();
        }
        removeViewAt(1);
    }

    public final boolean c() {
        View childAt;
        if (b()) {
            childAt = getChildAt(1);
        } else {
            childAt = getChildAt(0);
        }
        if (childAt != null) {
            return true;
        }
        return false;
    }

    public final BulletContainerView getBulletContainerView() {
        BulletContainerView bulletContainerView = null;
        if (getChildCount() <= 0) {
            return null;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof BulletContainerView) {
            bulletContainerView = childAt;
        }
        return bulletContainerView;
    }

    public final View getHybirdContainerView() {
        if (b()) {
            return getChildAt(1);
        }
        return getChildAt(0);
    }

    public final void a() {
        View childAt = getChildAt(1);
        View childAt2 = getChildAt(0);
        if (childAt != null && childAt2 != null) {
            if (b()) {
                childAt2.setVisibility(8);
                childAt.setVisibility(0);
                return;
            }
            childAt2.setVisibility(0);
            childAt.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(3299);
        addView(com.ss.android.ugc.aweme.discover.lynx.a.a(context));
        addView(com.ss.android.ugc.aweme.discover.lynx.a.b(context));
        MethodCollector.o(3299);
    }

    public final void a(View view) {
        MethodCollector.i(3270);
        l.d(view, "");
        d();
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(3270);
                throw nullPointerException;
            }
        }
        addView(view, 1);
        MethodCollector.o(3270);
    }

    public final void a(BulletContainerView bulletContainerView) {
        MethodCollector.i(3240);
        l.d(bulletContainerView, "");
        BulletContainerView bulletContainerView2 = getBulletContainerView();
        if (bulletContainerView2 != null) {
            bulletContainerView2.a();
        }
        removeView(getBulletContainerView());
        if (bulletContainerView.getParent() != null) {
            ViewParent parent = bulletContainerView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(bulletContainerView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(3240);
                throw nullPointerException;
            }
        }
        addView(bulletContainerView, 0);
        MethodCollector.o(3240);
    }
}
