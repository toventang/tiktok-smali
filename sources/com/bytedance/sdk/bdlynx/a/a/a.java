package com.bytedance.sdk.bdlynx.a.a;

import com.bytedance.bdp.bdpbase.manager.BdpManager;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43619a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f43620b = i.a((h.f.a.a) C1054a.f43621a);

    public static com.bytedance.sdk.bdlynx.a.b.a a() {
        return (com.bytedance.sdk.bdlynx.a.b.a) f43620b.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.sdk.bdlynx.a.a.a$a  reason: collision with other inner class name */
    static final class C1054a extends m implements h.f.a.a<com.bytedance.sdk.bdlynx.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1054a f43621a = new C1054a();

        static {
            Covode.recordClassIndex(26700);
        }

        C1054a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.sdk.bdlynx.a.b.a invoke() {
            return BdpManager.getInst().getService(com.bytedance.sdk.bdlynx.a.b.a.class);
        }
    }

    static {
        Covode.recordClassIndex(26699);
    }
}
