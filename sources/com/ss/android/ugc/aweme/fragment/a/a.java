package com.ss.android.ugc.aweme.fragment.a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.d;
import com.ss.android.ugc.aweme.activity.processor.t;
import h.f.b.l;
import java.util.Iterator;
import org.greenrobot.eventbus.EventBus;

public final class a extends d {
    static {
        Covode.recordClassIndex(61331);
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

    @Override // com.bytedance.ies.foundation.base.c, com.bytedance.ies.foundation.fragment.c
    public final void j(i iVar, com.bytedance.ies.foundation.fragment.a aVar) {
        l.d(iVar, "");
        l.d(aVar, "");
        super.j(iVar, aVar);
        EventBus a2 = EventBus.a();
        if (c() && a2.a(this)) {
            a2.b(aVar);
        }
    }

    @Override // com.bytedance.ies.foundation.base.c, com.bytedance.ies.foundation.fragment.c
    public final void a(i iVar, com.bytedance.ies.foundation.fragment.a aVar, View view, Bundle bundle) {
        l.d(iVar, "");
        l.d(aVar, "");
        l.d(view, "");
        super.a(iVar, aVar, view, bundle);
        EventBus a2 = EventBus.a();
        if (!a2.a(this) && c()) {
            EventBus.a(a2, aVar);
        }
    }
}
