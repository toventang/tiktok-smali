package com.ss.android.ugc.aweme.account;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.framework.services.IWebViewTweaker;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.main.service.II18nService;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.services.WebViewTweakerService;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.aweme.setting.services.I18nService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;
import com.ss.android.ugc.aweme.setting.services.LanguageService;
import h.f.b.l;
import java.util.Objects;

public final class AccountInitServiceImpl implements IAccountInitService {
    static {
        Covode.recordClassIndex(38494);
    }

    static final class a<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final a f62562a = new a();

        static {
            Covode.recordClassIndex(38495);
        }

        a() {
        }

        private static ILanguageService a() {
            MethodCollector.i(4817);
            if (com.ss.android.ugc.b.dN == null) {
                synchronized (ILanguageService.class) {
                    try {
                        if (com.ss.android.ugc.b.dN == null) {
                            com.ss.android.ugc.b.dN = new LanguageService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(4817);
                        throw th;
                    }
                }
            }
            LanguageService languageService = (LanguageService) com.ss.android.ugc.b.dN;
            MethodCollector.o(4817);
            return languageService;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return a();
        }
    }

    static final class b<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62563a = new b();

        static {
            Covode.recordClassIndex(38496);
        }

        b() {
        }

        private static IAccountHelperService a() {
            MethodCollector.i(4815);
            if (com.ss.android.ugc.b.dm == null) {
                synchronized (IAccountHelperService.class) {
                    try {
                        if (com.ss.android.ugc.b.dm == null) {
                            com.ss.android.ugc.b.dm = new AccountHelperService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(4815);
                        throw th;
                    }
                }
            }
            AccountHelperService accountHelperService = (AccountHelperService) com.ss.android.ugc.b.dm;
            MethodCollector.o(4815);
            return accountHelperService;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return a();
        }
    }

    static final class c<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final c f62564a = new c();

        static {
            Covode.recordClassIndex(38497);
        }

        c() {
        }

        private static IWebViewTweaker a() {
            MethodCollector.i(2968);
            if (com.ss.android.ugc.b.dC == null) {
                synchronized (IWebViewTweaker.class) {
                    try {
                        if (com.ss.android.ugc.b.dC == null) {
                            com.ss.android.ugc.b.dC = new WebViewTweakerService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2968);
                        throw th;
                    }
                }
            }
            WebViewTweakerService webViewTweakerService = (WebViewTweakerService) com.ss.android.ugc.b.dC;
            MethodCollector.o(2968);
            return webViewTweakerService;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return a();
        }
    }

    static final class d<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final d f62565a = new d();

        static {
            Covode.recordClassIndex(38498);
        }

        d() {
        }

        private static IAppUpdateService a() {
            MethodCollector.i(2983);
            if (com.ss.android.ugc.b.dL == null) {
                synchronized (IAppUpdateService.class) {
                    try {
                        if (com.ss.android.ugc.b.dL == null) {
                            com.ss.android.ugc.b.dL = new AppUpdateService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2983);
                        throw th;
                    }
                }
            }
            AppUpdateService appUpdateService = (AppUpdateService) com.ss.android.ugc.b.dL;
            MethodCollector.o(2983);
            return appUpdateService;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return a();
        }
    }

    static final class e<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final e f62566a = new e();

        static {
            Covode.recordClassIndex(38499);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new com.ss.android.ugc.aweme.app.services.a();
        }
    }

    static final class f<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final f f62567a = new f();

        static {
            Covode.recordClassIndex(38500);
        }

        f() {
        }

        private static II18nService a() {
            MethodCollector.i(4770);
            if (com.ss.android.ugc.b.dM == null) {
                synchronized (II18nService.class) {
                    try {
                        if (com.ss.android.ugc.b.dM == null) {
                            com.ss.android.ugc.b.dM = new I18nService();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(4770);
                        throw th;
                    }
                }
            }
            I18nService i18nService = (I18nService) com.ss.android.ugc.b.dM;
            MethodCollector.o(4770);
            return i18nService;
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return a();
        }
    }

    public static IAccountInitService a() {
        MethodCollector.i(4788);
        Object a2 = com.ss.android.ugc.b.a(IAccountInitService.class, false);
        if (a2 != null) {
            IAccountInitService iAccountInitService = (IAccountInitService) a2;
            MethodCollector.o(4788);
            return iAccountInitService;
        }
        if (com.ss.android.ugc.b.x == null) {
            synchronized (IAccountInitService.class) {
                try {
                    if (com.ss.android.ugc.b.x == null) {
                        com.ss.android.ugc.b.x = new AccountInitServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4788);
                    throw th;
                }
            }
        }
        AccountInitServiceImpl accountInitServiceImpl = (AccountInitServiceImpl) com.ss.android.ugc.b.x;
        MethodCollector.o(4788);
        return accountInitServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.account.IAccountInitService
    public final <T> ServiceProvider<T> a(Class<T> cls) {
        l.d(cls, "");
        if (l.a(cls, ILanguageService.class)) {
            a aVar = a.f62562a;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return aVar;
        } else if (l.a(cls, IAccountHelperService.class)) {
            b bVar = b.f62563a;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return bVar;
        } else if (l.a(cls, IWebViewTweaker.class)) {
            c cVar = c.f62564a;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return cVar;
        } else if (l.a(cls, IAppUpdateService.class)) {
            d dVar = d.f62565a;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return dVar;
        } else if (l.a(cls, bf.class)) {
            e eVar = e.f62566a;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return eVar;
        } else if (!l.a(cls, II18nService.class)) {
            return null;
        } else {
            f fVar = f.f62567a;
            Objects.requireNonNull(fVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return fVar;
        }
    }
}
