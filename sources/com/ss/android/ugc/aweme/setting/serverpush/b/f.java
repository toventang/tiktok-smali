package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.m;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import h.f.b.l;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class f extends c<b<BaseResponse>, b> {
    static {
        Covode.recordClassIndex(80427);
    }

    public f() {
        a(new b<BaseResponse>() {
            /* class com.ss.android.ugc.aweme.setting.serverpush.b.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80428);
            }

            /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.b.f$1$a */
            static final class a<V> implements Callable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Object[] f122579a;

                static {
                    Covode.recordClassIndex(80429);
                }

                a(Object[] objArr) {
                    this.f122579a = objArr;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object obj = this.f122579a[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
                    return PushSettingsApiManager.b(((Integer) obj).intValue());
                }
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                l.d(objArr, "");
                if (objArr.length == 1) {
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
                n.a().a(this.mHandler, new a(objArr), 0);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        if (this.f76396h != null) {
            b bVar = this.f76396h;
            if (bVar == null) {
                l.b();
            }
            if (bVar.mData != null && this.f76397i != null) {
                m mVar = this.f76397i;
                if (mVar == null) {
                    l.b();
                }
                ((b) mVar).av_();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        l.d(exc, "");
        if (this.f76397i != null) {
            m mVar = this.f76397i;
            if (mVar == null) {
                l.b();
            }
            ((b) mVar).cf_();
        }
    }
}
