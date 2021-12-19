package com.bytedance.jedi.ext.adapter.a.a;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<View> f39599a = new SparseArray<>();

    static {
        Covode.recordClassIndex(24384);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        int size = this.f39599a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View valueAt = this.f39599a.valueAt(i2);
            l.a((Object) valueAt, "");
            valueAt.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i2) {
        int i3;
        int size = this.f39599a.size();
        for (int i4 = 0; i4 < size; i4++) {
            int keyAt = this.f39599a.keyAt(i4);
            View valueAt = this.f39599a.valueAt(i4);
            l.a((Object) valueAt, "");
            if (keyAt == i2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            valueAt.setVisibility(i3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view, int... iArr) {
        l.c(view, "");
        l.c(iArr, "");
        for (int i2 : iArr) {
            a(i2, view);
        }
    }

    /* access modifiers changed from: protected */
    public final <T extends View> T a(int i2, View view) {
        l.c(view, "");
        View view2 = this.f39599a.get(i2);
        if (!(view2 instanceof View)) {
            view2 = null;
        }
        T t = (T) view2;
        if (t != null) {
            return t;
        }
        T t2 = (T) view.findViewById(i2);
        this.f39599a.put(i2, t2);
        l.a((Object) t2, "");
        return t2;
    }
}
