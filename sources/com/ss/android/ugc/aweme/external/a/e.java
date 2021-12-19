package com.ss.android.ugc.aweme.external.a;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import dmt.av.video.c.b;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class e implements IAbilityService {

    /* renamed from: a  reason: collision with root package name */
    private final h f90295a = i.a((h.f.a.a) c.f90307a);

    /* renamed from: b  reason: collision with root package name */
    private final h f90296b = i.a((h.f.a.a) d.f90308a);

    /* renamed from: c  reason: collision with root package name */
    private final h f90297c = i.a((h.f.a.a) g.f90310a);

    /* renamed from: d  reason: collision with root package name */
    private final h f90298d = i.a((h.f.a.a) f.f90309a);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.a<z> f90299a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.a<z> f90300b;

        /* renamed from: c  reason: collision with root package name */
        boolean f90301c;

        /* renamed from: d  reason: collision with root package name */
        public final String f90302d = "So decompress: AbilityServiceImpl";

        static {
            Covode.recordClassIndex(56675);
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$a$a  reason: collision with other inner class name */
        public static final class C2173a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f90303a;

            static {
                Covode.recordClassIndex(56676);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                h.f.a.a<z> aVar = this.f90303a.f90299a;
                if (aVar != null) {
                    aVar.invoke();
                }
                RuntimeException runtimeException = new RuntimeException("AbilityService, decompress fail");
                bj.a(this.f90303a.f90302d + ", " + runtimeException.getMessage() + ", " + Log.getStackTraceString(runtimeException));
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C2173a(a aVar) {
                this.f90303a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                l.d(asyncAVService, "");
                h.f.a.a<z> aVar = this.f90303a.f90300b;
                if (aVar != null) {
                    aVar.invoke();
                }
                RuntimeException runtimeException = new RuntimeException("AbilityService, decompress success");
                bj.a(this.f90303a.f90302d + ", " + runtimeException.getMessage() + ", " + Log.getStackTraceString(runtimeException));
            }
        }

        public final void a() {
            C2173a aVar = new C2173a(this);
            if (this.f90301c) {
                AVExternalServiceImpl.a().asyncService("AbilityService", aVar);
            } else {
                AVExternalServiceImpl.a().asyncServiceWithOutPanel("AbilityService", aVar);
            }
        }

        public final a a(h.f.a.a<z> aVar) {
            l.d(aVar, "");
            this.f90300b = aVar;
            return this;
        }
    }

    public static final class b implements IAVCameraService {
        static {
            Covode.recordClassIndex(56677);
        }

        public static final class a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f90304a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SurfaceHolder f90305b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ IAVCameraService.IAVCameraReadyCallback f90306c;

            static {
                Covode.recordClassIndex(56678);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                this.f90306c.finish(null);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                l.d(asyncAVService, "");
                b.a aVar = dmt.av.video.c.b.f156874d;
                Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                l.b(application, "");
                aVar.a(application).b();
                this.f90306c.finish(new dt(this.f90304a, this.f90305b));
            }

            a(Context context, SurfaceHolder surfaceHolder, IAVCameraService.IAVCameraReadyCallback iAVCameraReadyCallback) {
                this.f90304a = context;
                this.f90305b = surfaceHolder;
                this.f90306c = iAVCameraReadyCallback;
            }
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVCameraService
        public final void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraService.IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback) {
            l.d(context, "");
            l.d(surfaceHolder, "");
            l.d(iAVCameraReadyCallback, "");
            AVExternalServiceImpl.a().asyncServiceWithOutPanel("scaner", new a(context, surfaceHolder, iAVCameraReadyCallback));
        }
    }

    static {
        Covode.recordClassIndex(56674);
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$e  reason: collision with other inner class name */
    public static final class C2174e implements IAVLoaderService {
        static {
            Covode.recordClassIndex(56681);
        }

        C2174e() {
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$e$b */
        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ IAVLoaderService.ILoaderCallback $callback;

            static {
                Covode.recordClassIndex(56683);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(IAVLoaderService.ILoaderCallback iLoaderCallback) {
                super(0);
                this.$callback = iLoaderCallback;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.$callback.finish(false);
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$e$a */
        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ IAVLoaderService.ILoaderCallback $callback;

            static {
                Covode.recordClassIndex(56682);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(IAVLoaderService.ILoaderCallback iLoaderCallback) {
                super(0);
                this.$callback = iLoaderCallback;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                b.a aVar = dmt.av.video.c.b.f156874d;
                Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                l.b(application, "");
                aVar.a(application).b();
                this.$callback.finish(true);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService
        public final void setLoaderOnly() {
            b.a aVar = dmt.av.video.c.b.f156874d;
            Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
            l.b(application, "");
            aVar.a(application).b();
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVLoaderService
        public final void setLoader(IAVLoaderService.ILoaderCallback<Boolean> iLoaderCallback) {
            l.d(iLoaderCallback, "");
            a aVar = new a();
            aVar.f90301c = false;
            a a2 = aVar.a(new a(iLoaderCallback));
            a2.f90299a = new b(iLoaderCallback);
            a2.a();
        }
    }

    static final class c extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f90307a = new c();

        static {
            Covode.recordClassIndex(56679);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    static final class d extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f90308a = new d();

        static {
            Covode.recordClassIndex(56680);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class f extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f90309a = new f();

        static {
            Covode.recordClassIndex(56684);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    static final class g extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f90310a = new g();

        static {
            Covode.recordClassIndex(56685);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVCameraService cameraService() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVLoaderService libraryLoaderService() {
        return new C2174e();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVEffectService effectService() {
        return (a) this.f90295a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVInfoService infoService() {
        return (b) this.f90296b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVProcessService processService() {
        return (c) this.f90298d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAbilityService
    public final IAVTransformService transformService() {
        return (d) this.f90297c.getValue();
    }
}
