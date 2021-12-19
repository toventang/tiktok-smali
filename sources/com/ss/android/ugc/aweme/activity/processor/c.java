package com.ss.android.ugc.aweme.activity.processor;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.foundation.activity.d;
import h.f.b.l;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;

public final class c extends d {
    static {
        Covode.recordClassIndex(40312);
    }

    private final boolean c() {
        T t;
        T t2;
        Iterator<T> it = b().b().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2 instanceof t) {
                break;
            }
        }
        if (t2 instanceof t) {
            t = t2;
        }
        T t3 = t;
        if (t3 != null) {
            return t3.f65554a;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void d(a aVar) {
        l.d(aVar, "");
        super.d(aVar);
        EventBus a2 = EventBus.a();
        if (c() && a2.a(aVar)) {
            a2.b(aVar);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void b(a aVar, Bundle bundle) {
        l.d(aVar, "");
        super.b(aVar, bundle);
        EventBus a2 = EventBus.a();
        if (!a2.a(aVar) && c()) {
            EventBus.a(a2, aVar);
        }
    }
}
