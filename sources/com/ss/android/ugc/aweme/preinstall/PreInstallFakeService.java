package com.ss.android.ugc.aweme.preinstall;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService;
import com.ss.android.ugc.aweme.preinstall.brand.TranssonicFakeService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class PreInstallFakeService implements IPreInstallService {
    private final h transsonicFakeService$delegate = i.a((h.f.a.a) a.f115712a);

    static {
        Covode.recordClassIndex(74656);
    }

    private final ITranssonicService getTranssonicFakeService() {
        return (ITranssonicService) this.transsonicFakeService$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.preinstall.IPreInstallService
    public final void initOnAppCreate(Context context, a aVar) {
        l.d(context, "");
        l.d(aVar, "");
    }

    static final class a extends m implements h.f.a.a<TranssonicFakeService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115712a = new a();

        static {
            Covode.recordClassIndex(74657);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TranssonicFakeService invoke() {
            return new TranssonicFakeService();
        }
    }
}
