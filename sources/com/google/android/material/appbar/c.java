package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;

public class c<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    private d f52209a;

    /* renamed from: b  reason: collision with root package name */
    private int f52210b;

    /* renamed from: c  reason: collision with root package name */
    private int f52211c;

    static {
        Covode.recordClassIndex(32440);
    }

    public c() {
    }

    public int c() {
        d dVar = this.f52209a;
        if (dVar != null) {
            return dVar.f52214c;
        }
        return 0;
    }

    public boolean b(int i2) {
        d dVar = this.f52209a;
        if (dVar != null) {
            return dVar.a(i2);
        }
        this.f52210b = i2;
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void a_(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.a(v, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
        a_(coordinatorLayout, v, i2);
        if (this.f52209a == null) {
            this.f52209a = new d(v);
        }
        this.f52209a.a();
        int i3 = this.f52210b;
        if (i3 != 0) {
            this.f52209a.a(i3);
            this.f52210b = 0;
        }
        int i4 = this.f52211c;
        if (i4 == 0) {
            return true;
        }
        d dVar = this.f52209a;
        if (dVar.f52215d != i4) {
            dVar.f52215d = i4;
            dVar.b();
        }
        this.f52211c = 0;
        return true;
    }
}
