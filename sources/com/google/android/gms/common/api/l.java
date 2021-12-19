package com.google.android.gms.common.api;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.r;

public final class l {
    static {
        Covode.recordClassIndex(31333);
    }

    public static final class a<R extends p> extends BasePendingResult<R> {

        /* renamed from: a  reason: collision with root package name */
        private final R f50287a;

        static {
            Covode.recordClassIndex(31334);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        public final R a(Status status) {
            return this.f50287a;
        }

        public a(R r) {
            super(null);
            this.f50287a = r;
        }
    }

    public static k<Status> a(Status status, i iVar) {
        r.a(status, "Result must not be null");
        com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(iVar);
        rVar.a((p) status);
        return rVar;
    }
}
