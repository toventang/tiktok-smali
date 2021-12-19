package com.ss.android.ugc.aweme.bi;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.experiment.az;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.BaseOptFirstFrameTask;
import com.ss.android.ugc.aweme.legoImp.task.StorageClearTask;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.power.PowerModeTask;
import com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask;
import com.ss.android.ugc.aweme.requesttask.background.PreCreatePlayerTask;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.e;
import f.a.d.f;
import f.a.t;
import h.f.b.l;

public final class a implements Runnable {

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f68690a = new c();

        static {
            Covode.recordClassIndex(42269);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(42265);
    }

    public final void run() {
        t<f.a> i2 = com.bytedance.ies.ugc.appcontext.f.f34626a.e().i();
        l.b(i2, "");
        i2.d(C1551a.f68686a);
        com.bytedance.ies.ugc.appcontext.f.a().a(b.f68691a).a(new b(this), c.f68690a);
    }

    /* renamed from: com.ss.android.ugc.aweme.bi.a$a  reason: collision with other inner class name */
    static final class C1551a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C1551a f68686a = new C1551a();

        static {
            Covode.recordClassIndex(42266);
        }

        C1551a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Activity activity = ((f.a) obj).f34639a;
            if (activity != null) {
                e h2 = UgCommonServiceImpl.j().h();
                Application application = activity.getApplication();
                String str = "";
                l.b(application, str);
                String canonicalName = activity.getClass().getCanonicalName();
                if (canonicalName != null) {
                    str = canonicalName;
                }
                h2.a(application, str);
            }
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f68687a;

        static {
            Covode.recordClassIndex(42267);
        }

        b(a aVar) {
            this.f68687a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final f.a aVar = (f.a) obj;
            a.b.f109011a.a("method_append_lifecycle_init_runnable", false);
            if (az.f89582b || az.f89583c) {
                g.b().execute(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.bi.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f68688a;

                    static {
                        Covode.recordClassIndex(42268);
                    }

                    {
                        this.f68688a = r1;
                    }

                    public final void run() {
                        a.a(aVar.f34640b);
                    }
                });
            } else {
                a.a(aVar.f34640b);
            }
            a.b.f109011a.b("method_append_lifecycle_init_runnable", false);
        }
    }

    public static void a(Bundle bundle) {
        f.d e2 = com.ss.android.ugc.aweme.lego.f.e();
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin, "");
        r anchorListRequest = createIMainServicebyMonsterPlugin.getAnchorListRequest();
        l.b(anchorListRequest, "");
        f.d a2 = e2.a(anchorListRequest);
        IMainService createIMainServicebyMonsterPlugin2 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin2, "");
        w legoRequestTask = createIMainServicebyMonsterPlugin2.getLegoRequestTask();
        l.b(legoRequestTask, "");
        f.d a3 = a2.a(legoRequestTask);
        IMainService createIMainServicebyMonsterPlugin3 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin3, "");
        w shareCacheRegisterTask = createIMainServicebyMonsterPlugin3.getShareCacheRegisterTask();
        l.b(shareCacheRegisterTask, "");
        f.d a4 = a3.a(shareCacheRegisterTask).a(MSAdaptionService.c().a("MainActivity", bundle));
        IMainService createIMainServicebyMonsterPlugin4 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin4, "");
        w registerStorageTask = createIMainServicebyMonsterPlugin4.getRegisterStorageTask();
        l.b(registerStorageTask, "");
        f.d a5 = a4.a(registerStorageTask).a(IMUnder16ProxyImpl.n().j()).a(new RecommendUserDialogTask());
        IMainService createIMainServicebyMonsterPlugin5 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin5, "");
        w cookieMonitorTask = createIMainServicebyMonsterPlugin5.getCookieMonitorTask();
        l.b(cookieMonitorTask, "");
        a5.a(cookieMonitorTask).a(new StorageClearTask()).a(new PowerModeTask());
        w c2 = CommentServiceImpl.e().c();
        if (c2 != null) {
            e2.a(c2);
        }
        e2.a(new BaseOptFirstFrameTask());
        e2.a(new PreCreatePlayerTask());
        IMainService createIMainServicebyMonsterPlugin6 = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        l.b(createIMainServicebyMonsterPlugin6, "");
        w fetchImUnder16RequestTask = createIMainServicebyMonsterPlugin6.getFetchImUnder16RequestTask();
        l.b(fetchImUnder16RequestTask, "");
        e2.a(fetchImUnder16RequestTask);
        e2.a();
    }
}
