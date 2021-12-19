package com.ss.android.ugc.aweme.publish;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.cukaie.closet.a;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.services.external.ui.IDraftService;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.settings.i;
import com.ss.android.ugc.aweme.settings.m;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.utils.q;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static o f118835a = new o();

    private o() {
    }

    public static boolean a(Context context, Class<?> cls) {
        ActivityManager activityManager;
        List<ActivityManager.RunningServiceInfo> runningServices;
        if (context == null || (activityManager = (ActivityManager) a(context, "activity")) == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null) {
            return false;
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    private static void a(String str) {
        r.a("performance_publish", new b().a("creation_id", str).a("content_type", "video").a("retry_publish", 1).a("video_type", 0).a("video_upload_type", 1).f149193a);
        if (i.a()) {
            com.bytedance.apm.b.a("user_publish_success_rate_parallel", -1, new c().a("video_type", (Integer) 0).a("retry_publish", (Integer) 1).a("video_upload_type", (Integer) 1).a());
        }
    }

    static {
        Covode.recordClassIndex(77194);
    }

    private static void a() {
        Keva repo;
        int i2;
        if (m.d() && (i2 = (repo = Keva.getRepo("TOOLS_PUBLISH_PARALLEL_REPO_NAME")).getInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT", 0)) < 3) {
            if (TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - repo.getLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP", 0)) >= 24) {
                new SuperEntranceEvent(4, true).post();
                repo.storeLong("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_TIMESTAMP", System.currentTimeMillis());
                repo.storeInt("PUBLISH_PARALLEL_PREVIOUS_SHOW_TIP_COUNT", i2 + 1);
            }
        }
    }

    public static boolean a(e eVar, Intent intent) {
        return com.ss.android.ugc.aweme.port.in.c.r.a(eVar, intent);
    }

    public static void a(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
        String a2;
        if (cVar != null) {
            Bundle a3 = a((Context) eVar, cVar);
            Intent intent = new Intent();
            intent.putExtra("publish_bundle", a3);
            if (m.a()) {
                a2 = h.a(a3);
                h.a();
            } else {
                a2 = h.a(a3, (String) null);
            }
            if (a2 == null) {
                q.b("Already In publish, can not start new");
                return;
            }
            intent.putExtra("multi_publish_id", a2);
            a(eVar, intent);
        }
    }

    public static Bundle a(Context context, com.ss.android.ugc.aweme.draft.model.c cVar) {
        Bundle bundle = new Bundle();
        new bn("PublishServiceImpl");
        VideoPublishEditModel a2 = bn.a(cVar);
        a2.mIsFromDraft = true;
        a2.userClickPublishTime = SystemClock.uptimeMillis();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", a2);
        bundle.putString("shoot_way", a2.mShootWay);
        bundle.putInt("publish_permission", a2.isPrivate);
        if (es.b(a2)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        a(cVar.f());
        bundle.putBoolean("publish_retry", true);
        if (!com.ss.android.ugc.aweme.settings.o.a()) {
            ((IVideoRecordPreferences) new a((byte) 0).a(context, IVideoRecordPreferences.class)).setUploadRecoverPath("");
        }
        return bundle;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11758);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(11758);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(Context context, IDraftService.OnGetRecoverDraftCallback onGetRecoverDraftCallback) {
        String uploadRecoverPath;
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new a((byte) 0).a(context, IVideoRecordPreferences.class);
        if (m.a()) {
            List<String> a2 = g.a().o().l().a();
            if (a2.size() > 0) {
                uploadRecoverPath = a2.get(0);
            } else {
                uploadRecoverPath = null;
            }
        } else {
            uploadRecoverPath = iVideoRecordPreferences.getUploadRecoverPath("");
        }
        if (TextUtils.isEmpty(uploadRecoverPath)) {
            onGetRecoverDraftCallback.onFail();
        } else {
            b.i.b(new p(uploadRecoverPath), com.ss.android.ugc.aweme.tools.b.f138752a).a(new q(onGetRecoverDraftCallback), b.i.f4826c, null);
        }
    }

    public static void a(e eVar, Bundle bundle, String str) {
        String a2;
        String a3;
        String a4;
        String a5;
        q.d("PublishServiceImpl startPublish publish");
        g.a().d().a();
        boolean z = bundle.getBoolean("enter_record_from_other_platform", false);
        if (bundle.getBoolean("extra_enter_from_live", false)) {
            if (bundle.getBoolean("live_highlight")) {
                Intent intent = new Intent();
                intent.putExtra("publish_bundle", bundle);
                if (bundle.getBoolean("review_video_fast_publish", false)) {
                    intent.putExtra("review_video_fast_publish", true);
                }
                if (m.a()) {
                    a5 = h.a(bundle);
                    h.a();
                } else {
                    a5 = h.a(bundle, str);
                }
                if (a5 == null) {
                    q.b("Already In publish, can not start new");
                    return;
                }
                intent.putExtra("multi_publish_id", a5);
                a();
                a(eVar, intent);
                com.ss.android.ugc.aweme.shortvideo.edit.r rVar = new com.ss.android.ugc.aweme.shortvideo.edit.r();
                rVar.setCode(1);
                rVar.setType("highlight");
                rVar.setStatus("success");
                intent.putExtra("live_highlight_responce", rVar);
                eVar.setResult(9, intent);
                eVar.finish();
                return;
            }
            Intent intent2 = new Intent(eVar, com.ss.android.ugc.aweme.port.in.c.f115624c.e());
            intent2.addFlags(603979776);
            if (!com.ss.android.ugc.aweme.port.in.c.f115624c.g()) {
                intent2.putExtra("enable_optimize_main_not_in_stack", true);
            }
            intent2.putExtra("publish_bundle", bundle);
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent2.putExtra("review_video_fast_publish", true);
            }
            if (m.a()) {
                a4 = h.a(bundle);
                h.a();
            } else {
                a4 = h.a(bundle, str);
            }
            if (a4 == null) {
                q.b("Already In publish, can not start new");
                return;
            }
            intent2.putExtra("multi_publish_id", a4);
            a();
            intent2.putExtra("live_capture_responce", "publish");
            eVar.setResult(9, intent2);
            eVar.finish();
            q.d("PublishServiceImpl startPublish publish fromOtherPlatform:".concat(String.valueOf(z)));
        } else if (z) {
            Intent intent3 = new Intent();
            intent3.putExtra("publish_bundle", bundle);
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent3.putExtra("review_video_fast_publish", true);
            }
            if (m.a()) {
                a3 = h.a(bundle);
                h.a();
            } else {
                a3 = h.a(bundle, str);
            }
            if (a3 == null) {
                q.b("Already In publish, can not start new");
                return;
            }
            intent3.putExtra("multi_publish_id", a3);
            a();
            a(eVar, intent3);
            eVar.setResult(-1, intent3);
            eVar.finish();
        } else {
            Class<? extends e> e2 = com.ss.android.ugc.aweme.port.in.c.f115624c.e();
            q.d("PublishServiceImpl startPublish containerActivityClass:" + e2.getName());
            Intent intent4 = new Intent(eVar, e2);
            intent4.addFlags(603979776);
            boolean g2 = com.ss.android.ugc.aweme.port.in.c.f115624c.g();
            q.d("PublishServiceImpl startPublish isPublishContainerActivityClassAlive:".concat(String.valueOf(g2)));
            if (!g2) {
                q.d("PublishServiceImpl startPublish EXTRA_ENABLE_OPTIMIZE_MAIN_NOT_IN_STACK:");
                intent4.putExtra("enable_optimize_main_not_in_stack", true);
            }
            Publish.isNeedProcessPublish = true;
            if (bundle.getBoolean("review_video_fast_publish", false)) {
                intent4.putExtra("review_video_fast_publish", true);
            }
            if (m.a()) {
                a2 = h.b(bundle);
                if (TextUtils.isEmpty(a2)) {
                    com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel start normal publish task");
                    a2 = h.a(bundle);
                    h.a();
                } else {
                    com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel restart pre publish task");
                }
            } else {
                a2 = h.a(bundle, str);
            }
            if (a2 == null) {
                q.b("Already In publish, can not start new");
                return;
            }
            intent4.putExtra("multi_publish_id", a2);
            a();
            bundle.remove("extra_video_publish_args");
            intent4.putExtra("publish_bundle", bundle);
            intent4.setExtrasClassLoader(e2.getClassLoader());
            com.ss.android.ugc.tiktok.security.a.a.a(intent4, eVar);
            eVar.startActivity(intent4);
        }
    }
}
