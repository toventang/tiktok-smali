package com.ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import b.j;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.google.c.a.o;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.ugc.asve.f.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.IInternalCommerceService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.services.effect.EffectService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cx;
import com.ss.android.ugc.aweme.shortvideo.cy;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.MissionUser;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity;
import com.ss.android.ugc.aweme.ttep.ac;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static o f132287a;

    static {
        Covode.recordClassIndex(86642);
    }

    public static void a(Activity activity, Intent intent) {
        if (intent == null || activity == null || b(intent)) {
            q.d("unable to start activity,isAppBackground " + c.C1870c.f80046a.a());
            return;
        }
        cz a2 = cz.a.a();
        intent.putExtra("sdk_load_ve_so_status", bf.a(d.f61343a));
        intent.putExtra("preload_ve_so_task_status", a2.getPreLoadVESoStatus().toStatusCode());
        intent.putExtra("preload_ve_so_cost_time", a2.getPreLoadVESoCostTime());
        b.a.f132249a.recordPerformanceLog("pre_enter_record_page", new g(a2));
        if (intent.getBooleanExtra("need_refresh_filter_data", false)) {
            com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.d());
        }
        gr.a("camera_start");
        e.f62086a = System.currentTimeMillis();
        if (intent.getLongExtra("extra_start_record_time", 0) == 0) {
            intent.putExtra("extra_start_record_time", System.currentTimeMillis());
        }
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        boolean booleanExtra = intent.getBooleanExtra("extra_need_permission_activity", false);
        if (!com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.c.a(intent).a(activity) || booleanExtra) {
            intent.setClass(activity, VideoRecordPermissionActivity.class);
            b(activity, intent);
            return;
        }
        b.a.f132249a.step("av_video_record_init", "startToolPermissionActivity");
        boolean booleanExtra2 = intent.getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra3 = intent.getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra2) {
            gr.a("camera_error", "2");
        } else if (VideoRecordPermissionActivity.b(intent) && com.ss.android.ugc.aweme.port.in.c.a()) {
            gr.a("camera_error", "2", "recording");
        } else if (intent.getBooleanExtra("extra_allow_multiple_entrance", false) || VideoRecordPermissionActivity.a(intent) || VideoRecordPermissionActivity.b(intent) || !com.ss.android.ugc.aweme.port.in.c.a() || booleanExtra3) {
            if (g.a().o().c()) {
                if (StoryPublishServiceImpl.a().isStoryPublishing()) {
                    AVExternalServiceImpl.a().storyService().showPublishingToast(activity);
                    com.ss.android.ugc.aweme.df.q.a("record", new ar().a("event", "isPublishing").a());
                    gr.a("camera_error", "2", "publishing");
                    return;
                }
            } else if (StoryPublishServiceImpl.a().isPublishing(activity)) {
                AVExternalServiceImpl.a().storyService().showPublishingToast(activity);
                com.ss.android.ugc.aweme.df.q.a("record", new ar().a("event", "isPublishing").a());
                gr.a("camera_error", "2", "publishing");
                return;
            }
            r.a("av_memory_log", new com.ss.android.ugc.tools.f.b().a("scene", "entering_record").a("shoot_way", a(intent, "shoot_way")).a("creation_id", a(intent, "creation_id")).a("enter_from", a(intent, "enter_from")).a("dalvikPss", ar.f132216a.f132218c).a("nativePss", ar.f132216a.f132219d).a("otherPss", ar.f132216a.f132221f).a("totalPss", ar.f132216a.f132220e).f149193a);
            c(activity, intent);
        } else {
            q.a("Recording status:" + com.ss.android.ugc.aweme.port.in.c.b() + " recreatedSupport: " + booleanExtra3);
            com.ss.android.ugc.aweme.df.q.a("record", new ar().a("event", "isRecording").a("user_info", com.ss.android.ugc.aweme.port.in.c.b()).a());
            new a(a(activity)).a(R.string.c0q).a();
            gr.a("camera_error", "2", "recording");
        }
    }

    public static void a(Intent intent) {
        if (TextUtils.isEmpty(a(intent, "creation_id"))) {
            intent.putExtra("creation_id", UUID.randomUUID().toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(final android.app.Activity r15, final android.content.Intent r16, h.f.a.b<java.util.List<android.os.Bundle>, h.z> r17) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.f.a(android.app.Activity, android.content.Intent, h.f.a.b):void");
    }

    public static void a(Activity activity, Intent intent, List<Bundle> list) {
        boolean z;
        Object valueOf;
        if (!intent.getBooleanExtra("MUSIC_ID_INVALID", false)) {
            long a2 = f132287a.a(TimeUnit.MILLISECONDS);
            b.a.f132249a.step("av_video_record_init", "goRecordActivity");
            Intent intent2 = new Intent();
            if (!d(intent) && intent.hasExtra("record_preset_resource")) {
                intent.removeExtra("record_preset_resource");
            }
            boolean booleanExtra = intent.getBooleanExtra("show_no_splash_ad", false);
            boolean booleanExtra2 = intent.getBooleanExtra("sticker_pannel_show", false);
            boolean booleanExtra3 = intent.getBooleanExtra("enter_record_from_other_platform", false);
            String a3 = a(intent, "shoot_way");
            String a4 = a(intent, "creation_id");
            String a5 = a(intent, "enter_from");
            int intExtra = intent.getIntExtra("draft_to_edit_from", 0);
            int intExtra2 = intent.getIntExtra("extra_video_length", 0);
            if (booleanExtra3) {
                cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
                cr.a().g();
            }
            if (booleanExtra) {
                com.ss.android.ugc.aweme.port.in.c.f115624c.l();
            }
            String a6 = a(intent, "mission_data");
            if (TextUtils.equals(a3, "mission") && !TextUtils.isEmpty(a6)) {
                Mission mission = (Mission) new com.google.gson.f().a(a6, Mission.class);
                if (!TextUtils.isEmpty(mission.getStickerId())) {
                    z = false;
                    mission.setStickerToasted(false);
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(mission.getMusicId())) {
                    z = z;
                    mission.setMusicToasted(z);
                }
                if (mission.getChallengeNames() != null && !mission.getChallengeNames().isEmpty()) {
                    mission.setChallengeToasted(z);
                }
                if (mission.getMentionedUsers() != null && !mission.getMentionedUsers().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (MissionUser missionUser : mission.getMentionedUsers()) {
                        missionUser.setNickname(missionUser.getNickname().toLowerCase(Locale.getDefault()));
                        arrayList.add(missionUser);
                    }
                    mission.setMentionedUsers(arrayList);
                    mission.setUserToasted(false);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    mission = mission;
                    jSONObject.put("mission", new JSONObject(new com.google.gson.f().b(mission)));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                intent2.putExtra("commerce_data_in_tools_line", jSONObject.toString());
                com.ss.android.ugc.aweme.account.model.a e3 = com.ss.android.ugc.aweme.port.in.c.u.e();
                com.ss.android.ugc.tools.f.b a7 = new com.ss.android.ugc.tools.f.b().a("creation_id", a4).a("shoot_way", a3).a("mission_id", mission.getMissionId()).a("page_source", mission.getEnterFrom());
                String str = "0";
                if (e3 == null) {
                    valueOf = str;
                } else {
                    valueOf = Integer.valueOf(e3.m());
                }
                com.ss.android.ugc.tools.f.b a8 = a7.a("creator_followers", valueOf);
                if (!l.f115658a.z().j()) {
                    str = "1";
                }
                r.a("shoot", a8.a("creator_type", str).f149193a);
            }
            intent2.putExtra("sticker_pannel_show", booleanExtra2);
            intent2.putExtra("enter_record_from_other_platform", booleanExtra3);
            intent2.putExtra("draft_to_edit_from", intExtra);
            intent2.putExtra("star_atlas_object", a(intent, "star_atlas_object"));
            intent2.putExtra("extra_video_length", intExtra2);
            if (!TextUtils.isEmpty(a5)) {
                intent2.putExtra("enter_from", a5);
            }
            RecordPresetResource recordPresetResource = (RecordPresetResource) intent.getParcelableExtra("record_preset_resource");
            if (list != null) {
                for (Bundle bundle : list) {
                    intent2.putExtras(bundle);
                    if (recordPresetResource != null) {
                        recordPresetResource = a(recordPresetResource, bundle);
                    }
                }
            }
            if (recordPresetResource != null) {
                intent2.putExtra("record_preset_resource", (Parcelable) recordPresetResource);
            }
            Bundle c2 = c(intent);
            if (c2 != null) {
                intent2.putExtras(c2);
            }
            if (!TextUtils.isEmpty(a(intent, "micro_app_class"))) {
                intent2.putExtra("micro_app_class", a(intent, "micro_app_class"));
            }
            if (TextUtils.isEmpty(a3)) {
                intent2.putExtra("shoot_way", "no_shoot_way");
            }
            if (TextUtils.isEmpty(a4)) {
                a4 = UUID.randomUUID().toString();
                intent2.putExtra("creation_id", a4);
            }
            if (intent2.getLongExtra("extra_start_record_time", 0) == 0) {
                intent2.putExtra("extra_start_record_time", System.currentTimeMillis());
            }
            cy.a(new cx(a3, a4, a5));
            com.ss.android.ugc.aweme.shortvideo.upload.r.a(a4);
            com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.g());
            intent2.putExtra("extra_start_record_download_res_time", a2);
            if (!intent.hasExtra("stitch_params")) {
                b.a.f132249a.step("av_video_record_init", "real start activity");
                activity.runOnUiThread(new p(activity, intent2));
            } else if (!"draft_again".equals(a3)) {
                com.ss.android.ugc.aweme.shortvideo.r.a.a().a(activity, (StitchParams) intent.getParcelableExtra("stitch_params"), a4);
            } else {
                intent2.putExtra("stitch_params", intent.getParcelableExtra("stitch_params"));
                b.a.f132249a.step("av_video_record_init", "real start activity");
                activity.runOnUiThread(new o(activity, intent2));
            }
        }
    }

    static final /* synthetic */ Void a(String str, Intent intent, Context context, j jVar) {
        try {
            AVChallenge a2 = com.ss.android.ugc.aweme.port.in.c.f115625d.a(str);
            cr.a().a(a2);
            String challenge2str = RecordScene.challenge2str(a2);
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(i.f115645a, "publish", 0).edit();
            edit.putString("challenge", challenge2str);
            com.bytedance.common.utility.e.a.a(edit);
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge", a2);
            if (a2 == null || a2.getStickerId() == null) {
                jVar.a(bundle);
                return null;
            } else if (!d(intent)) {
                a(context, a2.getStickerId(), bundle, jVar, false);
                return null;
            } else {
                a(context, a2.getStickerId(), bundle, jVar);
                return null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            jVar.a(e2);
            return null;
        }
    }

    private static void a(Context context, String str, Bundle bundle, j<Bundle> jVar, boolean z) {
        com.ss.android.ugc.asve.f.g.a(new r(context, z, str, bundle, jVar));
    }

    private static void a(Context context, String str, Bundle bundle, j<Bundle> jVar) {
        com.ss.android.ugc.asve.f.g.a(new s(context, str, jVar, bundle));
    }

    public static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Bundle c(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    private static Context a(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static boolean b(Intent intent) {
        if (!c.C1870c.f80046a.a() || !intent.getBooleanExtra("intercept_background", true)) {
            return false;
        }
        return true;
    }

    private static boolean d(Intent intent) {
        boolean z;
        boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
        String a2 = a(intent, "shoot_way");
        String a3 = a(intent, "mission_data");
        if (!TextUtils.equals(a2, "mission") || TextUtils.isEmpty(a3)) {
            z = false;
        } else {
            z = true;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("record_preset_resource");
        if (!downloadEffectOrMusicAfterEnterCamera || parcelableExtra == null || z) {
            return false;
        }
        return true;
    }

    private static b.i<Bundle> a(String str) {
        String str2;
        Bundle bundle = new Bundle();
        try {
            str2 = com.ss.android.ugc.aweme.port.in.c.u.a(str, null).i();
        } catch (Exception unused) {
            str2 = "";
        }
        j jVar = new j();
        if (!str2.isEmpty()) {
            bundle.putString("host_name", str2);
        }
        jVar.a(bundle);
        return jVar.f4869a;
    }

    private static b.i<Bundle> a(Context context, String str) {
        return a(context, str, "", false);
    }

    private static void b(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    private static b.i<Bundle> b(Context context, final String str) {
        final j jVar = new j();
        if (TextUtils.isEmpty(str)) {
            jVar.a(new Bundle());
            return jVar.f4869a;
        }
        EffectService.getInstance().createMvEffectPlatform(context).a(str, (Map<String, String>) null, new IFetchEffectListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.util.f.AnonymousClass3 */

            static {
                Covode.recordClassIndex(86645);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("reuse_mvtheme_enter", true);
                bundle.putString("extra_bind_mv_id", str);
                bundle.putParcelable("extra_mv_effect", effect);
                jVar.a(bundle);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                Exception exception = exceptionResult.getException();
                if (exception == null) {
                    exception = new Exception("downloadBindMovieEffect Failed");
                }
                exception.printStackTrace();
                jVar.a(exception);
            }
        });
        return jVar.f4869a;
    }

    private static b.i<Bundle> c(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        j jVar = new j();
        com.ss.android.ugc.tools.view.e.b b2 = com.ss.android.ugc.tools.view.e.b.b(context, context.getResources().getString(R.string.g4k));
        b2.setIndeterminate(true);
        b.i.b(new l(context, str, b2, jVar, arrayList), b.i.f4824a);
        return jVar.f4869a;
    }

    private static b.i<Bundle> b(String str, Intent intent) {
        boolean z;
        Music music = (Music) intent.getSerializableExtra("sticker_music");
        String a2 = a(intent, "sticker_with_music_file_path");
        j jVar = new j();
        Bundle bundle = new Bundle();
        IInternalCommerceService h2 = AVCommerceServiceImpl.h();
        if (!h2.a() || !h2.a(music)) {
            z = true;
        } else {
            z = false;
        }
        if (music != null && z) {
            com.ss.android.ugc.aweme.shortvideo.c b2 = com.ss.android.ugc.aweme.port.in.c.f115629h.b(music.convertToMusicModel());
            com.ss.android.ugc.aweme.sticker.p.e.a(str, a2);
            b2.setMusicPriority(2);
            cr.a().a(b2);
            bundle.putString("path", a2);
        }
        jVar.a(bundle);
        return jVar.f4869a;
    }

    private static void c(Activity activity, Intent intent) {
        b.a.f132249a.step("av_video_record_init", "startVideoRecordActivity");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.i());
        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
        a(activity, intent, new h(activity, intent));
    }

    public static boolean b(Context context, Intent intent) {
        if (!com.ss.android.ugc.aweme.port.in.c.a() || !intent.getBooleanExtra("extra_clear_dialog_show_needed", true)) {
            return false;
        }
        a.C0731a a2 = new a.C0731a(context).a(R.string.fkc);
        a2.b(R.string.fkb);
        a2.b(R.string.a9e, i.f132322a, false).a(R.string.asg, (DialogInterface.OnClickListener) new j(context, intent), false).a().b();
        return true;
    }

    public static void c(Context context, Intent intent) {
        if (intent != null) {
            if (g.a().A().a()) {
                intent.setClass(context, FTCVideoRecordNewActivity.class);
            } else if (ac.a(intent)) {
                intent.setClass(context, TTEPEffectPreviewActivity.class);
            } else {
                intent.setClass(context, VideoRecordNewActivity.class);
            }
        }
    }

    private static b.i<Bundle> a(String str, Intent intent) {
        j jVar = new j();
        ArrayList<String> a2 = com.ss.android.ugc.aweme.sticker.p.g.a(str);
        Bundle bundle = new Bundle();
        if (!h.a(a2)) {
            bundle.putStringArrayList("reuse_sticker_ids", a2);
            bundle.putString("event_shoot_event_track", "");
            com.ss.ugc.effectplatform.model.Effect effect = (com.ss.ugc.effectplatform.model.Effect) intent.getParcelableExtra("music_with_sticker_effect");
            if (effect != null) {
                bundle.putParcelable("first_sticker", effect);
                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                    String a3 = com.ss.android.ugc.aweme.sticker.p.e.a(effect.getMusic().get(0));
                    if (!TextUtils.isEmpty(a3)) {
                        bundle.putString("path", a3);
                    }
                }
            }
        }
        jVar.a(bundle);
        return jVar.f4869a;
    }

    private static RecordPresetResource a(RecordPresetResource recordPresetResource, Bundle bundle) {
        MusicModel a2;
        Effect effect;
        ArrayList<String> stringArrayList;
        if (recordPresetResource == null) {
            return null;
        }
        if (bundle == null) {
            return recordPresetResource;
        }
        if (bundle.containsKey("reuse_sticker_ids") && (stringArrayList = bundle.getStringArrayList("reuse_sticker_ids")) != null && !stringArrayList.isEmpty()) {
            recordPresetResource.setEffectId(stringArrayList.get(0));
        }
        if (bundle.containsKey("first_sticker") && (effect = (Effect) bundle.getParcelable("first_sticker")) != null) {
            recordPresetResource.setEffect(effect);
        }
        if (!(cr.a().f125295a == null || (a2 = g.a().s().a(cr.a().f125295a)) == null)) {
            recordPresetResource.setMusicId(a2.getMusicId());
            recordPresetResource.setMusicModel(a2);
        }
        return recordPresetResource;
    }

    private static b.i<Bundle> a(Context context, String str, Intent intent) {
        j jVar = new j();
        b.i.b(new q(str, intent, context, jVar), b.i.f4824a);
        return jVar.f4869a;
    }

    private static b.i<Bundle> a(Context context, String str, String str2) {
        j jVar = new j();
        ArrayList<String> a2 = com.ss.android.ugc.aweme.sticker.p.g.a(str);
        if (h.a(a2)) {
            jVar.a(new Bundle());
            return jVar.f4869a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("reuse_sticker_ids", a2);
        bundle.putString("event_shoot_event_track", str2);
        a(context, a2.get(0), bundle, jVar);
        return jVar.f4869a;
    }

    private static b.i<Bundle> a(Context context, String str, boolean z) {
        j jVar = new j();
        com.ss.android.ugc.tools.view.e.b b2 = com.ss.android.ugc.tools.view.e.b.b(context, context.getResources().getString(R.string.g4k));
        b2.setIndeterminate(true);
        b.i.b(new k(context, str, z, b2, jVar), b.i.f4824a);
        return jVar.f4869a;
    }

    private static b.i<Bundle> a(Context context, String str, String str2, boolean z) {
        j jVar = new j();
        ArrayList<String> a2 = com.ss.android.ugc.aweme.sticker.p.g.a(str);
        if (h.a(a2)) {
            jVar.a(new Bundle());
            return jVar.f4869a;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("reuse_sticker_ids", a2);
        bundle.putString("event_shoot_event_track", str2);
        a(context, a2.get(0), bundle, jVar, z);
        return jVar.f4869a;
    }
}
