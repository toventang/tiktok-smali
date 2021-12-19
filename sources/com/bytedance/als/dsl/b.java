package com.bytedance.als.dsl;

import androidx.lifecycle.i;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AlsLogicContainer f6461a;

    static {
        Covode.recordClassIndex(3108);
    }

    public final void a() {
        j<?> jVar;
        AlsLogicContainer alsLogicContainer = this.f6461a;
        alsLogicContainer.f6438e = alsLogicContainer.f6437d.a();
        for (T t : alsLogicContainer.f6439f) {
            f fVar = alsLogicContainer.f6438e;
            if (!(fVar == null || (jVar = (j) fVar.a((Class) t)) == null)) {
                l.d(jVar, "");
                if (alsLogicContainer.f6434a.a() == i.b.DESTROYED) {
                    continue;
                } else if (alsLogicContainer.f6435b.add(jVar)) {
                    if ((!l.a(jVar.getApiComponent(), com.bytedance.als.b.class)) && !(jVar.getApiComponent() instanceof com.bytedance.als.f)) {
                        alsLogicContainer.f6440g.a(jVar.getApiComponent());
                    }
                    if (alsLogicContainer.f6434a.a().isAtLeast(i.b.CREATED)) {
                        jVar.onCreate();
                        if (alsLogicContainer.f6434a.a().isAtLeast(i.b.STARTED)) {
                            jVar.onStart();
                            if (alsLogicContainer.f6434a.a().isAtLeast(i.b.RESUMED)) {
                                jVar.onResume();
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("LogicComponent already exists");
                }
            }
        }
    }

    public b(AlsLogicContainer alsLogicContainer) {
        l.d(alsLogicContainer, "");
        this.f6461a = alsLogicContainer;
    }
}
