package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.ss.android.ugc.aweme.watermark.a.h;
import h.f.b.l;

public final class WaterMarkServiceImpl implements IWaterMarkService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144713a = new a((byte) 0);

    static {
        Covode.recordClassIndex(94664);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94665);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WaterMarkServiceImpl f144714a;

        static {
            Covode.recordClassIndex(94666);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(WaterMarkServiceImpl waterMarkServiceImpl) {
            this.f144714a = waterMarkServiceImpl;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            WaterMarkServiceImpl.a().a();
        }
    }

    public static final class c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WaterMarkServiceImpl f144715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f144716b;

        static {
            Covode.recordClassIndex(94667);
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
            s sVar = this.f144716b.f144824g;
            if (sVar != null) {
                sVar.b(-114);
            }
        }

        c(WaterMarkServiceImpl waterMarkServiceImpl, p pVar) {
            this.f144715a = waterMarkServiceImpl;
            this.f144716b = pVar;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            WaterMarkServiceImpl.a().b(this.f144716b);
            WaterMarkServiceImpl.a().b();
        }
    }

    public static final class d implements IExternalService.ServiceLoadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WaterMarkServiceImpl f144717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f144718b;

        static {
            Covode.recordClassIndex(94668);
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
            s sVar = this.f144718b.f144824g;
            if (sVar != null) {
                sVar.b(-114);
            }
        }

        d(WaterMarkServiceImpl waterMarkServiceImpl, p pVar) {
            this.f144717a = waterMarkServiceImpl;
            this.f144718b = pVar;
        }

        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j2) {
            l.d(asyncAVService, "");
            WaterMarkServiceImpl.a().a(this.f144718b);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final void cancelWaterMark() {
        AVExternalServiceImpl.a().asyncServiceWithOutPanel("WaterMark", new b(this));
    }

    public static com.ss.android.ugc.aweme.watermark.a.a a() {
        if (g.a().p().d()) {
            return (com.ss.android.ugc.aweme.watermark.a.d) h.f144768b.getValue();
        }
        return (com.ss.android.ugc.aweme.watermark.a.b) h.f144767a.getValue();
    }

    public static IWaterMarkService b() {
        MethodCollector.i(10563);
        Object a2 = com.ss.android.ugc.b.a(IWaterMarkService.class, false);
        if (a2 != null) {
            IWaterMarkService iWaterMarkService = (IWaterMarkService) a2;
            MethodCollector.o(10563);
            return iWaterMarkService;
        }
        if (com.ss.android.ugc.b.eE == null) {
            synchronized (IWaterMarkService.class) {
                try {
                    if (com.ss.android.ugc.b.eE == null) {
                        com.ss.android.ugc.b.eE = new WaterMarkServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10563);
                    throw th;
                }
            }
        }
        WaterMarkServiceImpl waterMarkServiceImpl = (WaterMarkServiceImpl) com.ss.android.ugc.b.eE;
        MethodCollector.o(10563);
        return waterMarkServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void prepareDataForI18n(p pVar) {
        MethodCollector.i(10409);
        l.d(pVar, "");
        AVExternalServiceImpl.a().asyncServiceWithOutPanel("WaterMark", new c(this, pVar));
        MethodCollector.o(10409);
    }

    @Override // com.ss.android.ugc.aweme.services.watermark.IWaterMarkService
    public final synchronized void waterMark(p pVar) {
        MethodCollector.i(10246);
        l.d(pVar, "");
        AVExternalServiceImpl.a().asyncServiceWithOutPanel("WaterMark", new d(this, pVar));
        MethodCollector.o(10246);
    }
}
