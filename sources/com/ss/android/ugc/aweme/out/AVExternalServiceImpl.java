package com.ss.android.ugc.aweme.out;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.dg;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.br;
import com.ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IAVFilterService;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.ss.android.ugc.aweme.services.badge.IBadgeService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.ss.android.ugc.aweme.services.external.IAbnormalExitLogService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.services.external.IEnterFromService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import com.ss.android.ugc.aweme.services.external.ILargeTransactionService;
import com.ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.ss.android.ugc.aweme.services.external.ability.IOpenPhotoNextService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.story.IStoryService;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.services.ttuploader.IExternalUploaderService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.specialplus.e;
import com.ss.android.ugc.aweme.utils.iq;
import com.ss.android.vesdk.ba;
import dmt.av.video.e.b;

public final class AVExternalServiceImpl implements IExternalService {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f114535a = h.i.a((h.f.a.a) h.f114555a);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f114536b = h.i.a((h.f.a.a) j.f114557a);

    /* renamed from: c  reason: collision with root package name */
    private final h.h f114537c = h.i.a((h.f.a.a) a.f114548a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f114538d = h.i.a((h.f.a.a) f.f114553a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f114539e = h.i.a((h.f.a.a) l.f114559a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f114540f = h.i.a((h.f.a.a) b.f114549a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f114541g = h.i.a((h.f.a.a) e.f114552a);

    /* renamed from: h  reason: collision with root package name */
    private final h.h f114542h = h.i.a((h.f.a.a) p.f114563a);

    /* renamed from: i  reason: collision with root package name */
    private final h.h f114543i = h.i.a((h.f.a.a) d.f114551a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f114544j = h.i.a((h.f.a.a) n.f114561a);

    /* renamed from: k  reason: collision with root package name */
    private final h.h f114545k = h.i.a((h.f.a.a) g.f114554a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f114546l = h.i.a((h.f.a.a) i.f114556a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f114547m = h.i.a((h.f.a.a) c.f114550a);
    private final h.h n = h.i.a((h.f.a.a) q.f114564a);
    private final h.h o = h.i.a((h.f.a.a) k.f114558a);
    private final h.h p = h.i.a((h.f.a.a) o.f114562a);
    private final h.h q = h.i.a((h.f.a.a) m.f114560a);

    public static final class r implements IAVTypeFaceService {
        static {
            Covode.recordClassIndex(73752);
        }

        public static final class a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f114565a;

            static {
                Covode.recordClassIndex(73753);
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

            a(Context context) {
                this.f114565a = context;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                h.f.b.l.d(asyncAVService, "");
                com.ss.android.ugc.aweme.sticker.i.a.a().a(this.f114565a);
            }
        }

        r() {
        }

        @Override // com.ss.android.ugc.aweme.services.external.IAVTypeFaceService
        public final void prefetch(Context context) {
            h.f.b.l.d(context, "");
            AVExternalServiceImpl.a().asyncServiceWithOutPanel("WaterMark", new a(context));
        }

        @Override // com.ss.android.ugc.aweme.services.external.IAVTypeFaceService
        public final Typeface getTypefaceByFontName(String str) {
            h.f.b.l.d(str, "");
            com.ss.android.ugc.aweme.sticker.i.a a2 = com.ss.android.ugc.aweme.sticker.i.a.a();
            if (TextUtils.isEmpty(str) || a2.f134907b.size() == 0) {
                return null;
            }
            for (com.ss.android.ugc.aweme.editSticker.text.a.c cVar : a2.f134907b.values()) {
                if (str.equals(cVar.f88293a)) {
                    String str2 = cVar.f88297e;
                    if (TextUtils.isEmpty(str2) || a2.f134908c.size() == 0) {
                        return null;
                    }
                    Typeface typeface = a2.f134908c.get(str2);
                    if (!(typeface != null || a2.f134907b.get(str2) == null || (typeface = com.ss.android.ugc.aweme.sticker.i.a.a(a2.f134907b.get(str2).f88299g)) == null)) {
                        a2.f134908c.put(str2, typeface);
                    }
                    return typeface;
                }
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(73733);
    }

    private final b b() {
        return (b) this.f114540f.getValue();
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.util.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114551a = new d();

        static {
            Covode.recordClassIndex(73737);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.shortvideo.util.b invoke() {
            return b.a.f132249a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.a<dg> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f114564a = new q();

        static {
            Covode.recordClassIndex(73751);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ dg invoke() {
            return dg.f80070a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAbnormalExitLogService abnormalExitLogService() {
        return a.f114572a;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IEnterFromService enterFromService() {
        return com.ss.android.ugc.aweme.external.g.f90394a;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ITTEPAbilityService ttepAbilityService() {
        return com.ss.android.ugc.aweme.ttep.b.a.f141318a;
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.a.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f114548a = new a();

        static {
            Covode.recordClassIndex(73734);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.a.e invoke() {
            return new com.ss.android.ugc.aweme.external.a.e();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114549a = new b();

        static {
            Covode.recordClassIndex(73735);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.servicimpl.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114550a = new c();

        static {
            Covode.recordClassIndex(73736);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.servicimpl.a invoke() {
            return new com.ss.android.ugc.aweme.servicimpl.a();
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.badge.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114552a = new e();

        static {
            Covode.recordClassIndex(73738);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.badge.a invoke() {
            return new com.ss.android.ugc.aweme.badge.a();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f114553a = new f();

        static {
            Covode.recordClassIndex(73739);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.e invoke() {
            return new com.ss.android.ugc.aweme.external.e();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f114554a = new g();

        static {
            Covode.recordClassIndex(73740);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.a invoke() {
            return new com.ss.android.ugc.aweme.external.a();
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.servicimpl.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f114555a = new h();

        static {
            Covode.recordClassIndex(73741);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.servicimpl.e invoke() {
            return new com.ss.android.ugc.aweme.servicimpl.e();
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f114556a = new i();

        static {
            Covode.recordClassIndex(73742);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.f invoke() {
            return new com.ss.android.ugc.aweme.external.f();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f114557a = new j();

        static {
            Covode.recordClassIndex(73743);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.b invoke() {
            return new com.ss.android.ugc.aweme.external.b();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f114558a = new k();

        static {
            Covode.recordClassIndex(73744);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new IAVFilterService() {
                /* class com.ss.android.ugc.aweme.out.AVExternalServiceImpl.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(73745);
                }

                @Override // com.ss.android.ugc.aweme.services.IAVFilterService
                public final String getFilterFolder(FilterBean filterBean) {
                    h.f.b.l.d(filterBean, "");
                    String filterFolder = filterBean.getFilterFolder();
                    h.f.b.l.b(filterFolder, "");
                    return filterFolder;
                }

                @Override // com.ss.android.ugc.aweme.services.IAVFilterService
                public final void setFilterFolder(FilterBean filterBean, String str) {
                    h.f.b.l.d(filterBean, "");
                    h.f.b.l.d(str, "");
                    filterBean.setFilterFolder(str);
                }
            };
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.j> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f114559a = new l();

        static {
            Covode.recordClassIndex(73746);
        }

        l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.j invoke() {
            return new com.ss.android.ugc.aweme.external.j();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.l> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f114560a = new m();

        static {
            Covode.recordClassIndex(73747);
        }

        m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.l invoke() {
            return new com.ss.android.ugc.aweme.external.l();
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.a.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f114561a = new n();

        static {
            Covode.recordClassIndex(73748);
        }

        n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.a.f invoke() {
            return new com.ss.android.ugc.aweme.external.a.f();
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.external.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f114562a = new o();

        static {
            Covode.recordClassIndex(73749);
        }

        o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.external.c invoke() {
            return new com.ss.android.ugc.aweme.external.c();
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shoutouts.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f114563a = new p();

        static {
            Covode.recordClassIndex(73750);
        }

        p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shoutouts.e invoke() {
            return new com.ss.android.ugc.aweme.shoutouts.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IExternalUploaderService externalUploaderService() {
        return new com.ss.android.ugc.aweme.external.h();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void initASVE() {
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IInitTaskService initService() {
        return new com.ss.android.ugc.aweme.external.k();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ISpecialPlusService specialPlusService() {
        return e.a.a();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IStoryService storyService() {
        return new com.ss.android.ugc.aweme.story.base.f();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ISuperEntranceService superEntranceService() {
        return b.a.a();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVTypeFaceService typeFaceService() {
        return new r();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAbilityService abilityService() {
        return (com.ss.android.ugc.aweme.external.a.e) this.f114537c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IActivityNameService classnameService() {
        return (com.ss.android.ugc.aweme.external.d) com.ss.android.ugc.aweme.external.d.f90375a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IConfigService configService() {
        return (com.ss.android.ugc.aweme.external.e) this.f114538d.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IDonationService donationService() {
        return (com.ss.android.ugc.aweme.external.f) this.f114546l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVDraftService draftService() {
        return (com.ss.android.ugc.aweme.external.b) this.f114536b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVFilterService filterService() {
        return (k.AnonymousClass1) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVMobService getAVMobService() {
        return (com.ss.android.ugc.aweme.servicimpl.a) this.f114547m.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IBadgeService getBadgeService() {
        return (com.ss.android.ugc.aweme.badge.a) this.f114541g.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IInfoService infoService() {
        return (com.ss.android.ugc.aweme.external.j) this.f114539e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ILargeTransactionService largeTransactionService() {
        return (com.ss.android.ugc.aweme.external.l) this.q.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IOpenPhotoNextService openGotoNextService() {
        return (com.ss.android.ugc.aweme.external.a.f) this.f114544j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICreativePerformanceMonitorService performanceMonitorService() {
        return (com.ss.android.ugc.aweme.servicimpl.e) this.f114535a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPerformance provideAVPerformance() {
        com.ss.android.ugc.aweme.shortvideo.util.b bVar = (com.ss.android.ugc.aweme.shortvideo.util.b) this.f114543i.getValue();
        h.f.b.l.b(bVar, "");
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ICrashReportService provideErrorReporter() {
        return (com.ss.android.ugc.aweme.external.a) this.f114545k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final ITakeInSameOptimize provideTakeInSameOptimize() {
        return (ITakeInSameOptimize) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVPublishService publishService() {
        AVPublishServiceImpl instance = AVPublishServiceImpl.getInstance();
        h.f.b.l.b(instance, "");
        return instance;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IAVScreenAdaptService screenAdaptService() {
        return (com.ss.android.ugc.aweme.external.c) this.p.getValue();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final IShoutOutsService shoutOutsService() {
        return (com.ss.android.ugc.aweme.shoutouts.e) this.f114542h.getValue();
    }

    public static IExternalService a() {
        MethodCollector.i(9872);
        Object a2 = com.ss.android.ugc.b.a(IExternalService.class, false);
        if (a2 != null) {
            IExternalService iExternalService = (IExternalService) a2;
            MethodCollector.o(9872);
            return iExternalService;
        }
        if (com.ss.android.ugc.b.cZ == null) {
            synchronized (IExternalService.class) {
                try {
                    if (com.ss.android.ugc.b.cZ == null) {
                        com.ss.android.ugc.b.cZ = new AVExternalServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9872);
                    throw th;
                }
            }
        }
        AVExternalServiceImpl aVExternalServiceImpl = (AVExternalServiceImpl) com.ss.android.ugc.b.cZ;
        MethodCollector.o(9872);
        return aVExternalServiceImpl;
    }

    public AVExternalServiceImpl() {
        iq.b();
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void setVideoIdParam(String str) {
        h.f.b.l.d(str, "");
        dv.f126642a = str;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void attachApplication(Application application) {
        h.f.b.l.d(application, "");
        h.f.b.l.d(application, "");
        com.ss.android.ugc.asve.a.f61924b = application;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void updateVESDKDeviceId(String str) {
        h.f.b.l.d(str, "");
        if (br.f115615a) {
            com.ss.android.vesdk.k m2 = com.ss.android.ugc.asve.a.a().m();
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            m2.f151346c = str;
            ba.a(com.ss.android.ugc.asve.a.a().m());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithOutPanel(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(b(), 100);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(b(), 100);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(b(), 100);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceForMainRecordService(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(b(), 100);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService
    public final void asyncServiceWithActivity(Context context, String str, IExternalService.ServiceLoadCallback serviceLoadCallback) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(serviceLoadCallback, "");
        serviceLoadCallback.onLoad(b(), 100);
    }
}
