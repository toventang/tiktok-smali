package com.ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.AccountInitServiceImpl;
import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.app.services.Feed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.IDownloadService;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.IRegionService;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.app.services.PushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.app.services.WebviewService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import h.f.b.l;
import java.util.Objects;

public final class a implements com.ss.android.ugc.aweme.b {
    static {
        Covode.recordClassIndex(40895);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a$a  reason: collision with other inner class name */
    static final class C1490a<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final C1490a f66539a = new C1490a();

        static {
            Covode.recordClassIndex(40896);
        }

        C1490a() {
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new WebviewService();
        }
    }

    static final class b<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final b f66540a = new b();

        static {
            Covode.recordClassIndex(40897);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new RegionService();
        }
    }

    static final class c<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final c f66541a = new c();

        static {
            Covode.recordClassIndex(40898);
        }

        c() {
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new Feed0VVManagerService();
        }
    }

    static final class d<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final d f66542a = new d();

        static {
            Covode.recordClassIndex(40899);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new PushLaunchPageAssistantService();
        }
    }

    static final class e<T> implements ServiceProvider {

        /* renamed from: a  reason: collision with root package name */
        public static final e f66543a = new e();

        static {
            Covode.recordClassIndex(40900);
        }

        e() {
        }

        @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
        public final Object get() {
            return new DownloadService();
        }
    }

    @Override // com.ss.android.ugc.aweme.b
    public final <T> ServiceProvider<T> a(Class<T> cls) {
        l.d(cls, "");
        if (l.a(cls, IWebViewService.class)) {
            C1490a aVar = C1490a.f66539a;
            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return aVar;
        } else if (l.a(cls, IRegionService.class)) {
            b bVar = b.f66540a;
            Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return bVar;
        } else if (l.a(cls, IFeed0VVManagerService.class)) {
            c cVar = c.f66541a;
            Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return cVar;
        } else if (l.a(cls, IPushLaunchPageAssistantService.class)) {
            d dVar = d.f66542a;
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return dVar;
        } else if (!l.a(cls, IDownloadService.class)) {
            return AccountInitServiceImpl.a().a(cls);
        } else {
            e eVar = e.f66543a;
            Objects.requireNonNull(eVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.framework.services.ServiceProvider<T>");
            return eVar;
        }
    }
}
