package com.ss.android.ugc.aweme.preinstall;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.preinstall.brand.ITranssonicService;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b implements IPreInstallService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f115714a = i.a((h.f.a.a) C2955b.f115718a);

    /* renamed from: b  reason: collision with root package name */
    public static final b f115715b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final h f115716c = i.a((h.f.a.a) a.f115717a);

    private b() {
    }

    static final class a extends m implements h.f.a.a<IPreInstallService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115717a = new a();

        static {
            Covode.recordClassIndex(74660);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IPreInstallService invoke() {
            Object service = ServiceManager.get().getService(IPreInstallService.class);
            l.b(service, "");
            return service;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preinstall.b$b  reason: collision with other inner class name */
    static final class C2955b extends m implements h.f.a.a<ITranssonicService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2955b f115718a = new C2955b();

        static {
            Covode.recordClassIndex(74661);
        }

        C2955b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ITranssonicService invoke() {
            Object service = ServiceManager.get().getService(ITranssonicService.class);
            l.b(service, "");
            return service;
        }
    }

    static {
        Covode.recordClassIndex(74659);
    }

    @Override // com.ss.android.ugc.aweme.preinstall.IPreInstallService
    public final void initOnAppCreate(Context context, a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        ((IPreInstallService) f115716c.getValue()).initOnAppCreate(context, aVar);
    }
}
