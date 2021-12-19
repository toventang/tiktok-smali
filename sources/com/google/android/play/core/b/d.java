package com.google.android.play.core.b;

import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    private final l f53147a;

    static {
        Covode.recordClassIndex(32843);
    }

    d(l lVar) {
        this.f53147a = lVar;
    }

    public final void binderDied() {
        l lVar = this.f53147a;
        lVar.f53157b.d("reportBinderDeath", new Object[0]);
        if (lVar.f53163h.get() == null) {
            lVar.f53157b.d("%s : Binder has died.", lVar.f53158c);
            for (c cVar : lVar.f53159d) {
                m<?> mVar = cVar.f53146g;
                if (mVar != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    mVar.b(new RemoteException(String.valueOf(lVar.f53158c).concat(" : Binder has died.")));
                }
            }
            lVar.f53159d.clear();
            return;
        }
        lVar.f53157b.d("calling onBinderDied", new Object[0]);
    }
}
