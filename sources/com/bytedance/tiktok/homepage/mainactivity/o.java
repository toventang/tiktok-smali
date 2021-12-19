package com.bytedance.tiktok.homepage.mainactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.b;
import com.bytedance.tiktok.homepage.a;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.i.aa;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.legoImp.task.CleanEffectsTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.d.a.c;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public e f44178a;

    /* renamed from: b  reason: collision with root package name */
    a f44179b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f44180c;

    /* renamed from: d  reason: collision with root package name */
    private DataCenter f44181d;

    /* renamed from: e  reason: collision with root package name */
    private i f44182e;

    static {
        Covode.recordClassIndex(27071);
    }

    static void a() {
        c.a(new aa());
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(int i2) {
        DataCenter dataCenter = this.f44181d;
        if (dataCenter != null) {
            dataCenter.a("changeTabAfterPublish", Integer.valueOf(i2));
        }
    }

    public o(e eVar, a aVar) {
        this.f44178a = eVar;
        this.f44179b = aVar;
    }

    public final void b(Intent intent, boolean z) {
        if (z) {
            this.f44180c = true;
            Context applicationContext = this.f44178a.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            com.ss.android.common.c.c.a(applicationContext, "protect", "record_on");
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            final RecordConfig recordConfig = (RecordConfig) intent.getSerializableExtra("EXTRA_AV_RECORD_CONFIG");
            if (booleanExtra) {
                b.f34768c = true;
            }
            AVExternalServiceImpl.a().asyncService(this.f44178a, "from_3rd_platform", new SimpleServiceLoadCallback() {
                /* class com.bytedance.tiktok.homepage.mainactivity.o.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(27072);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(o.this.f44178a, recordConfig);
                }
            });
        }
    }

    public final boolean a(Intent intent, boolean z) {
        boolean z2;
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ProcessPublish tryProcessPublish isOnCreate:".concat(String.valueOf(z)));
        if (z) {
            Activity[] activityStack = ActivityStack.getActivityStack();
            for (Activity activity : activityStack) {
                if (!(activity instanceof MainActivity)) {
                    activity.finish();
                    z2 = true;
                } else {
                    z2 = false;
                }
                com.ss.android.ugc.aweme.framework.a.a.b(3, null, "ProcessPublish finishActivity isFinish:" + z2 + " activity:" + activity.getClass().getName());
            }
        }
        com.ss.android.ugc.aweme.framework.a.a.b(3, null, "MainActivity.onNewIntent()" + a(intent) + " isOnCreate:" + z);
        r.a("av_video_memory", new d().a("log", "MainActivity.onNewIntent()" + a(intent)).a("isOnCreate", Boolean.valueOf(z)).f66730a);
        boolean processPublish = AVExternalServiceImpl.a().publishService().processPublish(this.f44178a, intent);
        Publish.isInPublish = processPublish;
        if (!processPublish) {
            return false;
        }
        int followerCount = AccountService.a().e().getCurUser().getFollowerCount();
        if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_LIGHTENING_PUBLISH")) {
            if (intent.hasExtra("multi_publish_id")) {
                a(followerCount);
            }
            return true;
        }
        if (!intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            a(followerCount);
        }
        return true;
    }

    public final void a(Bundle bundle, DataCenter dataCenter, i iVar) {
        new f.c().b((w) new CleanEffectsTask()).a();
        this.f44181d = dataCenter;
        this.f44182e = iVar;
        com.ss.android.ugc.aweme.requesttask.idle.a.a();
        Intent intent = this.f44178a.getIntent();
        boolean hasExtra = intent.hasExtra("enable_optimize_main_not_in_stack");
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "ProcessPublish MainActivityCreate isMainNotInStackPublish:".concat(String.valueOf(hasExtra)));
        if (!this.f44182e.f44169b && ((bundle == null && hasExtra) || Publish.isNeedProcessPublish || Publish.isInPublish)) {
            Publish.isNeedProcessPublish = false;
            a(intent, true);
        }
        new f.c().b(AVExternalServiceImpl.a().initService().initTask(5)).a();
    }
}
