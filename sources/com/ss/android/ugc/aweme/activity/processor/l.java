package com.ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.ies.foundation.activity.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public final class l extends d {

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f65546d;

    static {
        Covode.recordClassIndex(40326);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a() {
        a aVar;
        super.a();
        WeakReference<a> weakReference = this.f33849a;
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            com.ss.android.ugc.aweme.base.a.d.a(aVar, c(), false);
        }
    }

    private final int c() {
        Intent intent;
        T t;
        Integer valueOf;
        a aVar;
        WeakReference<a> weakReference = this.f33849a;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            intent = null;
        } else {
            intent = aVar.getIntent();
        }
        Iterator<T> it = b().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t instanceof aa) {
                break;
            }
        }
        if (!(t instanceof aa)) {
            t = null;
        }
        T t2 = t;
        if (t2 != null) {
            valueOf = Integer.valueOf(t2.f65532a);
        } else {
            if (intent != null) {
                valueOf = Integer.valueOf(intent.getIntExtra("activity_translation_type", -1));
            }
            return -1;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void f(a aVar) {
        a aVar2;
        h.f.b.l.d(aVar, "");
        super.f(aVar);
        if (!this.f65546d) {
            WeakReference<a> weakReference = this.f33849a;
            if (!(weakReference == null || (aVar2 = weakReference.get()) == null)) {
                com.ss.android.ugc.aweme.base.a.d.a(aVar2, c(), true);
            }
            this.f65546d = true;
        }
    }
}
