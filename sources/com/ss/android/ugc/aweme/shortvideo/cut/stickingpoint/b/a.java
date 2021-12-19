package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEUtils;
import h.f.b.l;
import java.io.File;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f125886a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(82712);
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f125898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125899b;

        static {
            Covode.recordClassIndex(82720);
        }

        e(String str, String str2) {
            this.f125898a = str;
            this.f125899b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String str = this.f125898a;
            if (str == null) {
                l.b();
            }
            String str2 = this.f125899b;
            if (str2 == null) {
                l.b();
            }
            if (VEUtils.getMusicDefaultAlgorithm(str, str2) == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a  reason: collision with other inner class name */
    public static final class C3274a implements b.AbstractC3277b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b f125887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f125888b;

        static {
            Covode.recordClassIndex(82713);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a  reason: collision with other inner class name */
        public static final class C3275a extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3274a f125889a;

            static {
                Covode.recordClassIndex(82714);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C3275a(C3274a aVar) {
                this.f125889a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
            public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar = this.f125889a.f125887a;
                if (bVar != null) {
                    bVar.b(cVar, z);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b */
        public static final class b extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3274a f125890a;

            static {
                Covode.recordClassIndex(82715);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            b(C3274a aVar) {
                this.f125890a = aVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
            public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar = this.f125890a.f125887a;
                if (bVar != null) {
                    bVar.b(cVar, z);
                }
            }
        }

        C3274a(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f125887a = bVar;
            this.f125888b = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
            if (r0 == null) goto L_0x000e;
         */
        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.b.AbstractC3277b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.shortvideo.ea r4, boolean r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L_0x002f
                if (r4 == 0) goto L_0x0022
                boolean r0 = r4.existOnSetAlgFile()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                if (r0 != 0) goto L_0x0011
            L_0x000e:
                h.f.b.l.b()
            L_0x0011:
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0024
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b r2 = r3.f125887a
                if (r2 == 0) goto L_0x0021
                com.ss.android.ugc.aweme.shortvideo.c r1 = r3.f125888b
                r0 = 1
                r2.b(r1, r0)
            L_0x0021:
                return
            L_0x0022:
                r0 = 0
                goto L_0x000e
            L_0x0024:
                com.ss.android.ugc.aweme.shortvideo.c r1 = r3.f125888b
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a r0 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a
                r0.<init>(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.a(r1, r0)
                return
            L_0x002f:
                com.ss.android.ugc.aweme.shortvideo.c r1 = r3.f125888b
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b r0 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b
                r0.<init>(r3)
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.a(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a.C3274a.a(com.ss.android.ugc.aweme.shortvideo.ea, boolean):void");
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b f125894a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f125895b;

        static {
            Covode.recordClassIndex(82717);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c$a  reason: collision with other inner class name */
        public static final class C3276a extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f125896a;

            static {
                Covode.recordClassIndex(82718);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C3276a(c cVar) {
                this.f125896a = cVar;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
            public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar = this.f125896a.f125894a;
                if (bVar != null) {
                    bVar.b(cVar, z);
                }
            }
        }

        c(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar, Context context) {
            this.f125894a = bVar;
            this.f125895b = context;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b
        public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, boolean z) {
            if (z) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar = this.f125894a;
                if (bVar != null) {
                    bVar.a(cVar, true);
                }
                Context context = this.f125895b;
                C3276a aVar = new C3276a(this);
                if (context == null || cVar == null || cVar.getStickPointMusicAlg() == null) {
                    aVar.b(cVar, false);
                    return;
                }
                b bVar2 = new b();
                bVar2.f125907e = new C3274a(aVar, cVar);
                ea stickPointMusicAlg = cVar.getStickPointMusicAlg();
                l.d(context, "");
                if (stickPointMusicAlg == null) {
                    b.AbstractC3277b bVar3 = bVar2.f125907e;
                    if (bVar3 != null) {
                        bVar3.a(stickPointMusicAlg, bVar2.f125909g);
                        return;
                    }
                    return;
                }
                bVar2.f125908f = stickPointMusicAlg;
                bVar2.f125903a = context;
                bVar2.f125909g = false;
                bVar2.f125905c.clear();
                bVar2.f125906d.clear();
                bVar2.f125904b = 0;
                if (!TextUtils.isEmpty(stickPointMusicAlg.getVeBeatsUrl())) {
                    bVar2.f125905c.add(stickPointMusicAlg.getVeBeatsUrl());
                    bVar2.f125906d.add(stickPointMusicAlg.getVeBeatsPath());
                    bVar2.f125910h.add("ve-beats");
                }
                if (!TextUtils.isEmpty(stickPointMusicAlg.getDownBeatsUrl())) {
                    bVar2.f125905c.add(stickPointMusicAlg.getDownBeatsUrl());
                    bVar2.f125906d.add(stickPointMusicAlg.getDownBeatsPath());
                    bVar2.f125910h.add("down-beats");
                }
                if (!TextUtils.isEmpty(stickPointMusicAlg.getNoStrengthBeatsUrl())) {
                    bVar2.f125905c.add(stickPointMusicAlg.getNoStrengthBeatsUrl());
                    bVar2.f125906d.add(stickPointMusicAlg.getNoStrengthBeatsPath());
                    bVar2.f125910h.add("no-strength-beats");
                }
                if (!TextUtils.isEmpty(stickPointMusicAlg.getManModeBeatsUrl())) {
                    bVar2.f125905c.add(stickPointMusicAlg.getManModeBeatsUrl());
                    bVar2.f125906d.add(stickPointMusicAlg.getManModeBeatsPath());
                    bVar2.f125910h.add("man_mode");
                }
                if (bVar2.f125905c.size() == 0) {
                    b.AbstractC3277b bVar4 = bVar2.f125907e;
                    if (bVar4 != null) {
                        bVar4.a(stickPointMusicAlg, bVar2.f125909g);
                        return;
                    }
                    return;
                }
                bVar2.a();
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar5 = this.f125894a;
            if (bVar5 != null) {
                bVar5.a(cVar, false);
            }
        }
    }

    public static final class d implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IFoundationAVService.IFetchResourcesListener f125897a;

        static {
            Covode.recordClassIndex(82719);
        }

        d(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
            this.f125897a = iFetchResourcesListener;
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            l.d(exc, "");
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125944c = false;
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f125897a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            l.d(strArr, "");
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125944c = true;
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f125897a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    public static void a(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        if (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d) {
            AVServiceImpl.a().fetchResourcesNeededByRequirements(new String[]{"VideoMontage"}, new d(iFetchResourcesListener));
        } else if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(null);
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f125891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b f125892b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f125893c;

        static {
            Covode.recordClassIndex(82716);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a
        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (!com.ss.android.ugc.aweme.video.e.b(this.f125891a)) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar = this.f125892b;
                if (bVar != null) {
                    bVar.a(this.f125893c, false);
                }
                i.a(false, this.f125893c, (Exception) null);
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar2 = this.f125892b;
            if (bVar2 != null) {
                bVar2.a(this.f125893c, true);
            }
            i.a(true, this.f125893c, (Exception) null);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar = this.f125892b;
            if (bVar != null) {
                bVar.a(this.f125893c, false);
            }
            i.a(false, this.f125893c, (Exception) baseException);
        }

        b(String str, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f125891a = str;
            this.f125892b = bVar;
            this.f125893c = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b f125900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.c f125901b;

        static {
            Covode.recordClassIndex(82721);
        }

        f(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b bVar, com.ss.android.ugc.aweme.shortvideo.c cVar) {
            this.f125900a = bVar;
            this.f125901b = cVar;
        }

        @Override // b.g
        public final Object then(b.i<Boolean> iVar) {
            if (iVar == null || !iVar.d().booleanValue()) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b bVar = this.f125900a;
                if (bVar == null) {
                    return null;
                }
                bVar.b(this.f125901b, false);
                return null;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b bVar2 = this.f125900a;
            if (bVar2 == null) {
                return null;
            }
            bVar2.b(this.f125901b, true);
            return null;
        }
    }

    public static void a(com.ss.android.ugc.aweme.shortvideo.c cVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.b bVar) {
        String c2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(cVar);
        String b2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.b(cVar);
        if (!com.ss.android.ugc.aweme.video.e.b(c2)) {
            bVar.b(cVar, false);
        } else if (TextUtils.isEmpty(b2)) {
            bVar.b(cVar, false);
        } else {
            b.i.b(new e(c2, b2), b.i.f4824a).a(new f(bVar, cVar), b.i.f4826c, null);
        }
    }

    public static void a(Context context, com.ss.android.ugc.aweme.shortvideo.c cVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar) {
        b(context, cVar, new c(bVar, context));
    }

    private static void b(Context context, com.ss.android.ugc.aweme.shortvideo.c cVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b bVar) {
        if (context == null || cVar == null || TextUtils.isEmpty(cVar.getPath())) {
            bVar.a(cVar, false);
            return;
        }
        String c2 = com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.c(cVar);
        Application application = null;
        try {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
            l.b(applicationService, "");
            application = applicationService.c();
        } catch (Exception unused) {
            q.d("ServiceManager fail, no context and local music load fail");
        }
        if (com.ss.android.ugc.aweme.shortvideo.af.b.a(c2, application)) {
            bVar.a(cVar, true);
        } else {
            a(application, fa.a(cVar), c2, new b(c2, bVar, cVar));
        }
    }

    public static void a(Context context, String str, String str2, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.a aVar) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            aVar.onFailed(new DownloadInfo((Cursor) null), new BaseException());
        } else if (com.ss.android.ugc.aweme.video.e.b(str2)) {
            aVar.onSuccessed(new DownloadInfo((Cursor) null));
        } else {
            File file = new File(str2);
            Downloader.with(context).url(str).ignoreDataVerify(true).savePath(file.getParent() + File.separator).name(file.getName()).mainThreadListener(aVar).download();
        }
    }
}
