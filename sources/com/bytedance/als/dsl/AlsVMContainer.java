package com.bytedance.als.dsl;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class AlsVMContainer extends ac {

    /* renamed from: a  reason: collision with root package name */
    public e f6453a = new e((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public AlsLogicContainer f6454b;

    /* renamed from: c  reason: collision with root package name */
    public OCAdapterViewModel f6455c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<e> f6456d;

    static {
        Covode.recordClassIndex(3105);
    }

    private final void a() {
        this.f6454b = null;
        this.f6455c = null;
    }

    public final void a(e eVar) {
        l.d(eVar, "");
        this.f6453a = eVar;
    }

    public final void a(e eVar) {
        e eVar2;
        l.d(eVar, "");
        WeakReference<e> weakReference = this.f6456d;
        if (weakReference != null) {
            eVar2 = weakReference.get();
        } else {
            eVar2 = null;
        }
        if (!l.a(eVar2, eVar)) {
            this.f6456d = new WeakReference<>(eVar);
            a();
        }
    }
}
