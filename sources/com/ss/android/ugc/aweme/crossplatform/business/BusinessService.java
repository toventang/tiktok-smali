package com.ss.android.ugc.aweme.crossplatform.business;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.a.c;
import com.ss.android.ugc.aweme.crossplatform.d.a.a;
import java.util.HashMap;

public final class BusinessService {

    /* renamed from: a  reason: collision with root package name */
    private final e f78613a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<Class, Business> f78614b = new HashMap<>();

    static {
        Covode.recordClassIndex(48808);
    }

    BusinessService(e eVar) {
        this.f78613a = eVar;
    }

    public static abstract class Business {

        /* renamed from: i  reason: collision with root package name */
        protected final c f78615i;

        /* renamed from: j  reason: collision with root package name */
        protected final e f78616j;

        /* renamed from: k  reason: collision with root package name */
        protected final a f78617k;

        /* renamed from: l  reason: collision with root package name */
        protected final Context f78618l;

        static {
            Covode.recordClassIndex(48809);
        }

        public Business(e eVar) {
            this.f78616j = eVar;
            c cVar = eVar.f78674a;
            this.f78615i = cVar;
            this.f78617k = cVar.getCrossPlatformParams();
            this.f78618l = cVar.getContext();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends com.ss.android.ugc.aweme.crossplatform.business.BusinessService.Business> T a(java.lang.Class<T> r7) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.business.BusinessService.a(java.lang.Class):com.ss.android.ugc.aweme.crossplatform.business.BusinessService$Business");
    }
}
