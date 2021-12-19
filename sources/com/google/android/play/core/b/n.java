package com.google.android.play.core.b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.d.a;
import com.google.android.play.core.d.q;
import com.google.android.play.core.e.z;
import java.util.List;

final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f53167a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f53168b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o f53169c;

    static {
        Covode.recordClassIndex(32853);
    }

    n(o oVar, List list, z zVar) {
        this.f53169c = oVar;
        this.f53167a = list;
        this.f53168b = zVar;
    }

    public final void run() {
        try {
            p pVar = this.f53169c.f53171b;
            for (Intent intent : this.f53167a) {
                if (!pVar.f53175a.a(p.a(intent, "split_id")).exists()) {
                    o oVar = this.f53169c;
                    List<Intent> list = this.f53167a;
                    z zVar = this.f53168b;
                    Integer a2 = oVar.a(list);
                    if (a2 == null) {
                        return;
                    }
                    if (a2.intValue() == 0) {
                        zVar.b();
                        return;
                    } else {
                        zVar.a(a2.intValue());
                        return;
                    }
                }
            }
            o oVar2 = this.f53169c;
            z zVar2 = this.f53168b;
            try {
                if (!a.a(q.a(oVar2.f53170a), true)) {
                    zVar2.a(-12);
                } else {
                    zVar2.a();
                }
            } catch (Exception unused) {
                zVar2.a(-12);
            }
        } catch (Exception unused2) {
            this.f53168b.a(-11);
        }
    }
}
