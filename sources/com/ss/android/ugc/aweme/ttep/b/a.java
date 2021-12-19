package com.ss.android.ugc.aweme.ttep.b;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService;
import com.ss.android.ugc.aweme.ttep.b.b;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApi;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.util.h;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.a.q;
import h.f.b.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class a implements ITTEPAbilityService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141318a = new a();

    public static final class b implements z.a {
        static {
            Covode.recordClassIndex(92284);
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.port.in.z.a
        public final void b() {
        }

        b() {
        }
    }

    private a() {
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f141321a;

        static {
            Covode.recordClassIndex(92285);
        }

        c(h.f.a.b bVar) {
            this.f141321a = bVar;
        }

        public final void run() {
            this.f141321a.invoke(300);
        }
    }

    static {
        Covode.recordClassIndex(92282);
    }

    public static final class d implements IDownloadCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f141322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f141323b;

        static {
            Covode.recordClassIndex(92286);
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$d$a  reason: collision with other inner class name */
        static final class RunnableC3744a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f141324a;

            static {
                Covode.recordClassIndex(92287);
            }

            RunnableC3744a(d dVar) {
                this.f141324a = dVar;
            }

            public final void run() {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.port.in.c.f115622a).a(this.f141324a.f141323b.getString(R.string.s)).a();
            }
        }

        @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
        public final void onSuccess(Effect effect) {
            l.d(effect, "");
            AVExternalServiceImpl.a().asyncService("scan", new b(this, new RecordConfig.Builder().creationId(UUID.randomUUID().toString()).setEnterTTEPPreviewPage(true).setTTEPPreviewEffect(effect).shootWay("scan")));
        }

        public static final class b extends SimpleServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f141325a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ RecordConfig.Builder f141326b;

            static {
                Covode.recordClassIndex(92288);
            }

            b(d dVar, RecordConfig.Builder builder) {
                this.f141325a = dVar;
                this.f141326b = builder;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                l.d(asyncAVService, "");
                this.f141325a.f141322a.invoke(300);
                asyncAVService.uiService().recordService().startRecord(this.f141325a.f141323b, this.f141326b.build());
            }
        }

        d(h.f.a.b bVar, androidx.fragment.app.e eVar) {
            this.f141322a = bVar;
            this.f141323b = eVar;
        }

        @Override // com.ss.android.ugc.aweme.services.ttep.IDownloadCallback
        public final void onFail(int i2, Exception exc) {
            if (i2 != 0) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3744a(this), 500);
            }
            this.f141322a.invoke(300);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$a  reason: collision with other inner class name */
    static final class RunnableC3743a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f141319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f141320b;

        static {
            Covode.recordClassIndex(92283);
        }

        RunnableC3743a(h.f.a.b bVar, androidx.fragment.app.e eVar) {
            this.f141319a = bVar;
            this.f141320b = eVar;
        }

        public final void run() {
            this.f141319a.invoke(0);
            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.port.in.c.f115622a).a(this.f141320b.getString(R.string.r)).a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IDownloadCallback f141327a;

        static {
            Covode.recordClassIndex(92290);
        }

        f(IDownloadCallback iDownloadCallback) {
            this.f141327a = iDownloadCallback;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            boolean z;
            Map<String, List<String>> map;
            boolean z2 = true;
            if (iVar == null || iVar.c() || iVar.b() || iVar.d() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    l.b(iVar, "");
                    if (((com.ss.android.ugc.aweme.ttep.effectapply.a) iVar.d()).f141336c != 0) {
                        this.f141327a.onFail(((com.ss.android.ugc.aweme.ttep.effectapply.a) iVar.d()).f141336c, null);
                    } else {
                        if (com.ss.ugc.effectplatform.c.f153561a == null) {
                            Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                            l.b(application, "");
                            com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
                        }
                        Object a2 = b.a().a(((com.ss.android.ugc.aweme.ttep.effectapply.a) iVar.d()).f141334a, com.ss.ugc.effectplatform.model.Effect.class);
                        l.b(a2, "");
                        final com.ss.ugc.effectplatform.model.Effect effect = (com.ss.ugc.effectplatform.model.Effect) a2;
                        if (effect.getRequirements() == null) {
                            effect.setRequirements(new ArrayList());
                        }
                        DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
                        Object[] array = effect.getRequirements().toArray(new String[0]);
                        if (array != null) {
                            String[] strArr = (String[]) array;
                            String model_names = effect.getModel_names();
                            if (model_names != null) {
                                if (model_names.length() != 0) {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                map = ag.a();
                            } else {
                                Object a3 = b.a().a(model_names, new b.a().type);
                                l.b(a3, "");
                                map = (Map) a3;
                            }
                            instance.fetchResourcesByRequirementsAndModelNames(strArr, map, new IFetchResourceListener(this) {
                                /* class com.ss.android.ugc.aweme.ttep.b.a.f.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ f f141328a;

                                static {
                                    Covode.recordClassIndex(92291);
                                }

                                /* renamed from: com.ss.android.ugc.aweme.ttep.b.a$f$1$a  reason: collision with other inner class name */
                                public static final class C3745a implements IFetchEffectListener {

                                    /* renamed from: a  reason: collision with root package name */
                                    final /* synthetic */ AnonymousClass1 f141330a;

                                    static {
                                        Covode.recordClassIndex(92292);
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                    public final void onStart(Effect effect) {
                                    }

                                    /* JADX WARN: Incorrect args count in method signature: ()V */
                                    C3745a(AnonymousClass1 r1) {
                                        this.f141330a = r1;
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                    public final /* synthetic */ void onSuccess(Effect effect) {
                                        Effect effect2 = effect;
                                        l.d(effect2, "");
                                        effect2.setEffectId("123456");
                                        this.f141330a.f141328a.f141327a.onSuccess(effect2);
                                    }

                                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                                    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                                        l.d(exceptionResult, "");
                                        this.f141330a.f141328a.f141327a.onFail(-10, exceptionResult.getException());
                                    }
                                }

                                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                                public final void onFailure(Exception exc) {
                                    l.d(exc, "");
                                    this.f141328a.f141327a.onFail(-10, exc);
                                }

                                @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                                public final void onSuccess(long j2) {
                                    Effect effect = new Effect(effect);
                                    Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                                    l.b(application, "");
                                    com.ss.android.ugc.aweme.effectplatform.c.a(application, null).a(effect, new C3745a(this));
                                }

                                {
                                    this.f141328a = r1;
                                }
                            });
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } catch (Exception e2) {
                    this.f141327a.onFail(-10, e2);
                }
            } else {
                IDownloadCallback iDownloadCallback = this.f141327a;
                l.b(iVar, "");
                iDownloadCallback.onFail(-10, iVar.e());
            }
            return h.z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResource(String str, String str2, IDownloadCallback iDownloadCallback) {
        l.d(str, "");
        l.d(str2, "");
        l.d(iDownloadCallback, "");
        a(str, str2, iDownloadCallback, new e(com.ss.android.ugc.aweme.ttep.effectapply.b.f141338a));
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadPreviewEffectAndResourceWithoutLogin(String str, String str2, IDownloadCallback iDownloadCallback) {
        l.d(str, "");
        l.d(str2, "");
        l.d(iDownloadCallback, "");
        a(str, str2, iDownloadCallback, new g(com.ss.android.ugc.aweme.ttep.effectapply.b.f141338a));
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class e extends j implements q<String, String, String, i<com.ss.android.ugc.aweme.ttep.effectapply.a>> {
        static {
            Covode.recordClassIndex(92289);
        }

        e(com.ss.android.ugc.aweme.ttep.effectapply.b bVar) {
            super(3, bVar, com.ss.android.ugc.aweme.ttep.effectapply.b.class, "fetch", "fetch(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ i<com.ss.android.ugc.aweme.ttep.effectapply.a> invoke(String str, String str2, String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            return ((EffectFetchApi) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(str4, true, EffectFetchApi.class)).getEffectMeta(str5, str6, "android");
        }
    }

    static final /* synthetic */ class g extends j implements q<String, String, String, i<com.ss.android.ugc.aweme.ttep.effectapply.a>> {
        static {
            Covode.recordClassIndex(92293);
        }

        g(com.ss.android.ugc.aweme.ttep.effectapply.b bVar) {
            super(3, bVar, com.ss.android.ugc.aweme.ttep.effectapply.b.class, "fetchWithoutLogin", "fetchWithoutLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbolts/Task;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ i<com.ss.android.ugc.aweme.ttep.effectapply.a> invoke(String str, String str2, String str3) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            return ((EffectFetchApi) com.ss.android.ugc.aweme.port.in.g.a().C().createRetrofit(str4, true, EffectFetchApi.class)).getEffectMetaWithoutLogin(str5, str6, "android");
        }
    }

    private static void a(String str, String str2, IDownloadCallback iDownloadCallback, q<? super String, ? super String, ? super String, ? extends i<com.ss.android.ugc.aweme.ttep.effectapply.a>> qVar) {
        String str3 = h.f153963a;
        if (str3 == null) {
            l.b();
        }
        ((i) qVar.invoke(str, str2, str3)).a((b.g) new f(iDownloadCallback));
    }

    @Override // com.ss.android.ugc.aweme.services.ttep.ITTEPAbilityService
    public final void downloadEffectAndJumpShootPage(androidx.fragment.app.e eVar, h.f.a.a<Boolean> aVar, String str, h.f.a.b<? super Integer, h.z> bVar, h.f.a.b<? super Boolean, h.z> bVar2) {
        String str2 = "";
        l.d(eVar, str2);
        l.d(aVar, str2);
        l.d(str, str2);
        l.d(bVar, str2);
        l.d(bVar2, str2);
        if (aVar.invoke().booleanValue()) {
            if (!com.ss.android.ugc.aweme.port.in.c.u.b()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3743a(bVar, eVar), 0);
                com.ss.android.ugc.aweme.port.in.c.u.a(eVar, "", "schema_record", null, new b());
            } else if (!com.bytedance.ies.abmock.b.a().a(true, "creator_preview_enable", false)) {
                new Handler(Looper.getMainLooper()).post(new c(bVar));
            } else {
                bVar2.invoke(true);
                try {
                    str2 = Uri.parse(str).getQueryParameter("object_id");
                } catch (Exception unused) {
                }
                if (str2 != null && str2.length() != 0) {
                    downloadPreviewEffectAndResource("https://effecthouse.tiktok.com", str2, new d(bVar, eVar));
                }
            }
        }
    }
}
