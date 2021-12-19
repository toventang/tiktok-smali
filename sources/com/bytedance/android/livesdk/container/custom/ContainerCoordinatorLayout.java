package com.bytedance.android.livesdk.container.custom;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.container.custom.a.a;
import com.bytedance.android.livesdk.container.custom.a.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ContainerCoordinatorLayout extends CoordinatorLayout implements a {

    /* renamed from: h  reason: collision with root package name */
    private final List<b> f16773h;

    /* renamed from: i  reason: collision with root package name */
    private final int f16774i;

    /* renamed from: j  reason: collision with root package name */
    private final int f16775j;

    /* renamed from: k  reason: collision with root package name */
    private int f16776k;

    /* renamed from: l  reason: collision with root package name */
    private int f16777l;

    /* renamed from: m  reason: collision with root package name */
    private final int f16778m;
    private Rect n;
    private Window o;

    static {
        Covode.recordClassIndex(9301);
    }

    public ContainerCoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getLastHeightMeasureSpec() {
        return this.f16777l;
    }

    public final Rect getRect() {
        return this.n;
    }

    @Override // com.bytedance.android.livesdk.container.custom.a.a
    public final void a() {
        this.f16773h.clear();
    }

    public final void setLastHeightMeasureSpec(int i2) {
        this.f16777l = i2;
    }

    public final void setOwnerWindow(Window window) {
        this.o = window;
    }

    public final void setRect(Rect rect) {
        l.d(rect, "");
        this.n = rect;
    }

    @Override // com.bytedance.android.livesdk.container.custom.a.a
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f16773h.add(bVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final void onMeasure(int i2, int i3) {
        int i4;
        this.f16777l = i3;
        Window window = this.o;
        if (window == null) {
            super.onMeasure(i2, i3);
            return;
        }
        View decorView = window.getDecorView();
        l.b(decorView, "");
        boolean z = false;
        this.n.set(0, 0, 0, 0);
        decorView.getWindowVisibleDisplayFrame(this.n);
        int i5 = this.n.bottom;
        int i6 = this.f16778m;
        if (i6 - i5 > i6 / 6) {
            z = true;
            i4 = this.f16775j;
        } else {
            i4 = this.f16774i;
        }
        if (i4 != this.f16776k) {
            if (z) {
                Iterator<T> it = this.f16773h.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
            } else {
                Iterator<T> it2 = this.f16773h.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this);
                }
            }
            this.f16776k = i4;
        }
        super.onMeasure(i2, i3);
    }

    private /* synthetic */ ContainerCoordinatorLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ContainerCoordinatorLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.f16773h = new ArrayList();
        this.f16774i = 2;
        this.f16775j = 1;
        this.f16776k = 2;
        this.f16778m = y.b() - y.d();
        this.n = new Rect();
    }
}
