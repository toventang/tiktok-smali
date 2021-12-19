package com.ss.android.ugc.aweme.out;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.external.b.e;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.IUIService;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements AsyncAVService {

    /* renamed from: a  reason: collision with root package name */
    private final h f114573a = i.a((h.f.a.a) a.f114574a);

    static {
        Covode.recordClassIndex(73757);
    }

    static final class a extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f114574a = new a();

        static {
            Covode.recordClassIndex(73758);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.AsyncAVService
    public final IUIService uiService() {
        return (e) this.f114573a.getValue();
    }
}
