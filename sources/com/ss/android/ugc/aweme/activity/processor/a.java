package com.ss.android.ugc.aweme.activity.processor;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.d;
import com.ss.android.ugc.aweme.utils.t;
import h.f.b.l;
import java.util.Iterator;

public final class a extends d {

    /* renamed from: d  reason: collision with root package name */
    private t f65531d;

    static {
        Covode.recordClassIndex(40309);
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
            if (t2 instanceof s) {
                break;
            }
        }
        if (t2 instanceof s) {
            t = t2;
        }
        T t3 = t;
        if (t3 != null) {
            return t3.f65553a;
        }
        return false;
    }

    private final t b(Context context) {
        if (this.f65531d == null) {
            this.f65531d = new t(context);
        }
        return this.f65531d;
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void e(com.bytedance.ies.foundation.activity.a aVar) {
        t b2;
        l.d(aVar, "");
        super.e(aVar);
        if (!c() && (b2 = b((Context) aVar)) != null) {
            try {
                if (b2.f143187a == null) {
                    b2.f143187a = (AudioManager) t.a(t.a(aVar), DataType.AUDIO);
                }
                if (!(b2.f143187a == null || b2.f143188b == null)) {
                    b2.f143187a.abandonAudioFocus(b2.f143188b);
                }
                b2.f143187a = null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void f(com.bytedance.ies.foundation.activity.a aVar) {
        t b2;
        l.d(aVar, "");
        super.f(aVar);
        if (!c() && (b2 = b((Context) aVar)) != null) {
            try {
                if (b2.f143187a == null) {
                    b2.f143187a = (AudioManager) t.a(t.a(aVar), DataType.AUDIO);
                }
                if (b2.f143187a != null && b2.f143188b != null) {
                    b2.f143187a.requestAudioFocus(b2.f143188b, 3, 2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(com.bytedance.ies.foundation.activity.a aVar, boolean z) {
        l.d(aVar, "");
        super.a(aVar, z);
        l.d(aVar, "");
        Iterator<T> it = com.ss.android.ugc.aweme.base.utils.a.a().iterator();
        while (it.hasNext()) {
            it.next().a(aVar, z);
        }
    }
}
