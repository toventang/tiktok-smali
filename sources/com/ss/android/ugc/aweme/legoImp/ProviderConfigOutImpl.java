package com.ss.android.ugc.aweme.legoImp;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.musicprovider.e;
import com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;

public final class ProviderConfigOutImpl implements IProviderConfigOut {
    static {
        Covode.recordClassIndex(68873);
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    public final e.a a() {
        return b.f107668a;
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    public final e.a b() {
        return a.f107667a;
    }

    @Override // com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut
    public final Context c() {
        return d.a();
    }

    static final class a implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f107667a = new a();

        static {
            Covode.recordClassIndex(68874);
        }

        a() {
        }

        @Override // com.ss.android.ugc.musicprovider.e.a
        public final String a() {
            return AVExternalServiceImpl.a().configService().cacheConfig().musicDir() + "cache/";
        }
    }

    static final class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107668a = new b();

        static {
            Covode.recordClassIndex(68875);
        }

        b() {
        }

        @Override // com.ss.android.ugc.musicprovider.e.a
        public final String a() {
            return AVExternalServiceImpl.a().configService().cacheConfig().musicDir() + "download/";
        }
    }

    public static IProviderConfigOut d() {
        MethodCollector.i(6020);
        Object a2 = com.ss.android.ugc.b.a(IProviderConfigOut.class, false);
        if (a2 != null) {
            IProviderConfigOut iProviderConfigOut = (IProviderConfigOut) a2;
            MethodCollector.o(6020);
            return iProviderConfigOut;
        }
        if (com.ss.android.ugc.b.cm == null) {
            synchronized (IProviderConfigOut.class) {
                try {
                    if (com.ss.android.ugc.b.cm == null) {
                        com.ss.android.ugc.b.cm = new ProviderConfigOutImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6020);
                    throw th;
                }
            }
        }
        ProviderConfigOutImpl providerConfigOutImpl = (ProviderConfigOutImpl) com.ss.android.ugc.b.cm;
        MethodCollector.o(6020);
        return providerConfigOutImpl;
    }
}
