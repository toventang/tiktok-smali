package com.ss.android.ugc.aweme.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.z;

public final class PrivacyServiceImpl implements IPrivacyService {
    static {
        Covode.recordClassIndex(67183);
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean b() {
        return in.d();
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final boolean a() {
        return b.g().getCurUser().isSecret();
    }

    public static IPrivacyService c() {
        MethodCollector.i(9523);
        Object a2 = com.ss.android.ugc.b.a(IPrivacyService.class, false);
        if (a2 != null) {
            IPrivacyService iPrivacyService = (IPrivacyService) a2;
            MethodCollector.o(9523);
            return iPrivacyService;
        }
        if (com.ss.android.ugc.b.bM == null) {
            synchronized (IPrivacyService.class) {
                try {
                    if (com.ss.android.ugc.b.bM == null) {
                        com.ss.android.ugc.b.bM = new PrivacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9523);
                    throw th;
                }
            }
        }
        PrivacyServiceImpl privacyServiceImpl = (PrivacyServiceImpl) com.ss.android.ugc.b.bM;
        MethodCollector.o(9523);
        return privacyServiceImpl;
    }

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f104773a;

        static {
            Covode.recordClassIndex(67184);
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
        public final void a(Exception exc) {
        }

        a(h.f.a.b bVar) {
            this.f104773a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
        public final void a(f fVar) {
            if (fVar != null) {
                this.f104773a.invoke(fVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.internal.IPrivacyService
    public final void a(h.f.a.b<? super f, z> bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<f>, c> providePushSettingFetchPresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();
        providePushSettingFetchPresenter.a_(new a(bVar));
        providePushSettingFetchPresenter.a(new Object[0]);
    }
}
