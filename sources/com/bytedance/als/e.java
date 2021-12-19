package com.bytedance.als;

import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import h.f.b.l;

public abstract class e<T extends b> extends j<T> implements ag {

    /* renamed from: a  reason: collision with root package name */
    public af f6463a;

    /* renamed from: b  reason: collision with root package name */
    public final f f6464b;

    static {
        Covode.recordClassIndex(3114);
    }

    @Override // com.bytedance.als.j
    public void onDestroy() {
        super.onDestroy();
        if (this.f6463a != null) {
            af afVar = this.f6463a;
            if (afVar == null) {
                l.a("viewModelStore");
            }
            afVar.a();
        }
    }

    @Override // androidx.lifecycle.ag
    public af getViewModelStore() {
        i.b a2 = getLifecycle().a();
        l.b(a2, "");
        if (a2.isAtLeast(i.b.INITIALIZED)) {
            if (this.f6463a == null) {
                this.f6463a = new af();
            }
            af afVar = this.f6463a;
            if (afVar == null) {
                l.a("viewModelStore");
            }
            return afVar;
        }
        throw new IllegalStateException("can't access ViewModels when component is destroyed");
    }

    public e(f fVar) {
        l.d(fVar, "");
        this.f6464b = fVar;
    }
}
