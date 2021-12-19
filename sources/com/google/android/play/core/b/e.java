package com.google.android.play.core.b;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;
import com.ss.android.ugc.aweme.push.downgrade.d;

/* access modifiers changed from: package-private */
public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f53148a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f53149b;

    static {
        Covode.recordClassIndex(32844);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    e(l lVar, m mVar, c cVar) {
        super(mVar);
        this.f53149b = lVar;
        this.f53148a = cVar;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        boolean z;
        l lVar = this.f53149b;
        c cVar = this.f53148a;
        if (lVar.f53166k == null && !lVar.f53160e) {
            lVar.f53157b.d("Initiate binding to the service.", new Object[0]);
            lVar.f53159d.add(cVar);
            lVar.f53165j = new k(lVar);
            lVar.f53160e = true;
            Context context = lVar.f53156a;
            Intent intent = lVar.f53161f;
            ServiceConnection serviceConnection = lVar.f53165j;
            if (context == null || !(context instanceof Context)) {
                z = context.bindService(intent, serviceConnection, 1);
            } else if (!d.a(context, intent)) {
                z = context.bindService(intent, serviceConnection, 1);
            } else {
                return;
            }
            if (!z) {
                lVar.f53157b.d("Failed to bind to the service.", new Object[0]);
                lVar.f53160e = false;
                for (c cVar2 : lVar.f53159d) {
                    m<?> mVar = cVar2.f53146g;
                    if (mVar != null) {
                        mVar.b(new m());
                    }
                }
                lVar.f53159d.clear();
            }
        } else if (lVar.f53160e) {
            lVar.f53157b.d("Waiting to bind to the service.", new Object[0]);
            lVar.f53159d.add(cVar);
        } else {
            cVar.run();
        }
    }
}
