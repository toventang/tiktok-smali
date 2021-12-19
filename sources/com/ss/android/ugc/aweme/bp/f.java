package com.ss.android.ugc.aweme.bp;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.hb;
import f.a.a.a.a;
import f.a.g.b;
import f.a.t;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final e f68754a;

    /* renamed from: b  reason: collision with root package name */
    private final hb f68755b;

    static {
        Covode.recordClassIndex(42337);
    }

    f(e eVar, hb hbVar) {
        this.f68754a = eVar;
        this.f68755b = hbVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        e eVar = this.f68754a;
        hb hbVar = this.f68755b;
        Activity activity = (Activity) obj;
        if ((activity.getComponentName().getClassName().contains(hbVar.f90196b) || activity.getComponentName().getClassName().contains(hbVar.f90197c) || activity.getComponentName().getClassName().contains(hbVar.f90198d)) && !e.f68748c) {
            activity.getComponentName().getClassName();
            if (hbVar.f90200f > 0) {
                long j2 = hbVar.f90200f;
                if (eVar.f68750b != null) {
                    eVar.f68750b.dispose();
                    eVar.f68750b = null;
                }
                eVar.f68750b = (b) t.b(j2, TimeUnit.MILLISECONDS).a(a.a(f.a.a.b.a.f157156a)).c(new b<Long>() {
                    /* class com.ss.android.ugc.aweme.bp.e.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(42335);
                    }

                    @Override // f.a.z
                    public final void onError(Throwable th) {
                    }

                    @Override // f.a.z
                    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                    }

                    @Override // f.a.z
                    public final void onComplete() {
                        e.this.c();
                    }
                });
                return;
            }
            eVar.c();
        } else if (eVar.f68750b != null) {
            eVar.f68750b.dispose();
            eVar.f68750b = null;
        }
    }
}
