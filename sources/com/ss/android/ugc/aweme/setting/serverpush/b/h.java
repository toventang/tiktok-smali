package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class h extends c<b<BaseResponse>, a> {
    static {
        Covode.recordClassIndex(80433);
    }

    public h() {
        a(new b<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.b.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80434);
            }

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.h$1$a */
            static final class a<V> implements Callable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Object[] f122585a;

                static {
                    Covode.recordClassIndex(80435);
                }

                a(Object[] objArr) {
                    this.f122585a = objArr;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object[] objArr = this.f122585a;
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    Object obj2 = objArr[1];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    return PushSettingsApiManager.c((String) obj, ((Integer) obj2).intValue());
                }
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                l.d(objArr, "");
                if (objArr.length != 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof Integer)) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(Object... objArr) {
                l.d(objArr, "");
                if (!super.sendRequest(Arrays.copyOf(objArr, objArr.length))) {
                    return false;
                }
                n.a().a(this.mHandler, new a(objArr), 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        a aVar;
        b bVar = this.f76396h;
        if (bVar != null && (aVar = (a) this.f76397i) != null) {
            T t = bVar.mData;
            l.b(t, "");
            aVar.a(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        a aVar = (a) this.f76397i;
        if (aVar != null) {
            aVar.a();
        }
    }
}
