package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.setting.serverpush.a.d;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import h.f.b.l;
import java.util.Arrays;
import java.util.concurrent.Callable;

public final class k extends c<b<d>, d> {
    static {
        Covode.recordClassIndex(80442);
    }

    public k() {
        a(new b<d>() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.b.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80443);
            }

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.k$1$a */
            static final class a<V> implements Callable {

                /* renamed from: a  reason: collision with root package name */
                public static final a f122592a = new a();

                static {
                    Covode.recordClassIndex(80444);
                }

                a() {
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return PushSettingsApiManager.b();
                }
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                l.d(objArr, "");
                if (objArr.length == 0) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                l.d(objArr, "");
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                n.a().a(this.mHandler, a.f122592a, 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        b bVar = this.f76396h;
        if (bVar != null && (t = bVar.mData) != null) {
            ((d) this.f76397i).a(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        d dVar = (d) this.f76397i;
        if (dVar != null) {
            dVar.b();
        }
    }
}
