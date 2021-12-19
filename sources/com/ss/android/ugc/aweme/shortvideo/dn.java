package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.c;
import com.ss.android.ugc.aweme.shortvideo.duet.a;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.i.i;
import com.ss.android.ugc.aweme.shortvideo.i.m;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.b.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.tools.utils.q;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class dn {
    static {
        Covode.recordClassIndex(82960);
    }

    private static ShortVideoContext a(Intent intent) {
        if (g.a().A().a()) {
            return c(intent);
        }
        return b(intent);
    }

    private static void b(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.f124757b.b()) {
            shortVideoContext.a(i.a(shortVideoContext.f124757b.o.f124723d, shortVideoContext.f124757b.o.f124722c));
        } else if (shortVideoContext.f124757b.c()) {
            shortVideoContext.a(i.a(shortVideoContext.f124757b.p.f124739a.wavPath, shortVideoContext.f124757b.p.f124739a.videoPath));
        } else {
            String str = null;
            if (shortVideoContext.f124757b.a()) {
                str = shortVideoContext.f124757b.f124713h.c();
            }
            shortVideoContext.a(m.a(str));
        }
        q.d("maxduration is " + shortVideoContext.f124757b.f124707b);
    }

    public static void a(ShortVideoContext shortVideoContext) {
        String str;
        shortVideoContext.f124765j = null;
        if (shortVideoContext.f124757b.b()) {
            str = shortVideoContext.f124757b.o.f124723d;
        } else if (shortVideoContext.f124757b.c()) {
            str = shortVideoContext.f124757b.p.f124739a.wavPath;
        } else {
            str = null;
        }
        shortVideoContext.a(str);
        if (!TextUtils.isEmpty(shortVideoContext.f124757b.y)) {
            shortVideoContext.f124757b.f124713h.a(shortVideoContext.f124757b.y);
        } else {
            shortVideoContext.f124757b.f124713h.d();
        }
        b(shortVideoContext);
        shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
        shortVideoContext.f124761f = null;
    }

    private static ShortVideoContext c(Intent intent) {
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.E = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.q = a(intent, "creation_id");
        shortVideoContext.r = a(intent, "shoot_way");
        shortVideoContext.t = a(intent, "shoot_from");
        shortVideoContext.x = a(intent, "enter_from");
        shortVideoContext.C = 0;
        shortVideoContext.a(c.a());
        shortVideoContext.Z = intent.getIntExtra("shoot_mode", 0);
        shortVideoContext.a(a(intent, "path"));
        if (!TextUtils.isEmpty(shortVideoContext.f124757b.y)) {
            shortVideoContext.f124757b.f124713h.a(shortVideoContext.f124757b.y);
        }
        shortVideoContext.k();
        intent.getSerializableExtra("music_model");
        shortVideoContext.d(new am().a());
        if (shortVideoContext.Z != 12) {
            shortVideoContext.c(a.a(shortVideoContext));
        }
        b(shortVideoContext);
        shortVideoContext.d(intent.getIntExtra("music_start", 0));
        shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
        shortVideoContext.a(com.ss.android.ugc.aweme.port.in.c.o.getVideoWidth());
        shortVideoContext.b(com.ss.android.ugc.aweme.port.in.c.o.getVideoHeight());
        shortVideoContext.a(new dt());
        shortVideoContext.b(0L);
        shortVideoContext.c(b.a() ? 1 : 0);
        shortVideoContext.e(dp.a().a());
        shortVideoContext.ay = a(intent, "filter_business_sticker");
        shortVideoContext.U = intent.getBooleanExtra("use_preset_sticker_at_first", shortVideoContext.U);
        shortVideoContext.Y = a(intent, "tag_id");
        if (TextUtils.isEmpty(shortVideoContext.T)) {
            shortVideoContext.T = a(intent, "sticker_id");
        }
        if (intent.hasExtra("extra_mention_uid") && intent.hasExtra("extra_mention_user_name")) {
            shortVideoContext.an = ExtraMentionUserModel.Companion.newInstance(a(intent, "extra_mention_uid"), a(intent, "extra_mention_user_name"));
        }
        shortVideoContext.ac = true;
        shortVideoContext.aE = a(intent, "effect_meta_info");
        shortVideoContext.aF = a(intent, "effect_image");
        com.ss.android.ugc.aweme.tools.b.g.a(intent, q.a(shortVideoContext));
        return shortVideoContext;
    }

    private static void a(d dVar) {
        String str;
        if (dVar != null) {
            if (d.MODE_EDIT.equals(dVar.getShoutOutsMode())) {
                str = "video_post_page";
            } else {
                str = "shoutouts_congratulations_page";
            }
            if (d.MODE_SEND.equals(dVar.getShoutOutsMode())) {
                str = "order_detail_page";
            }
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            bVar.a("reviewed", new StringBuilder().append(dVar.getReviewed()).toString());
            bVar.a("enter_from", str);
            bVar.a("shoot_way", d.shootWay);
            if (dVar.getOrderId() != null) {
                bVar.a("order_id", dVar.getOrderId());
            }
            r.a("shoot", bVar.f149193a);
        }
    }

    private static ShortVideoContext b(Intent intent) {
        boolean z;
        boolean z2;
        String a2;
        boolean z3;
        EffectTemplate effectTemplate;
        cr.a().d();
        dv.f126646e = dv.f126645d;
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(0));
        shortVideoContext.E = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.q = a(intent, "creation_id");
        shortVideoContext.r = a(intent, "shoot_way");
        shortVideoContext.t = a(intent, "shoot_from");
        shortVideoContext.x = a(intent, "enter_from");
        shortVideoContext.C = 0;
        shortVideoContext.a(c.a());
        shortVideoContext.Z = intent.getIntExtra("shoot_mode", 0);
        shortVideoContext.y = a(intent, "enter_method");
        shortVideoContext.V = (RecordPresetResource) intent.getParcelableExtra("record_preset_resource");
        shortVideoContext.W = Boolean.valueOf(intent.getBooleanExtra("show_cancel_after_pin_prop", false));
        boolean booleanExtra = intent.getBooleanExtra("publish_with_anim", false);
        if (!"direct_shoot".equals(shortVideoContext.r) || !AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().e() || g.a().A().a() || AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().b()) {
            z = false;
        } else {
            z = true;
        }
        cr.a();
        if (booleanExtra || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        cr.f125294k = Boolean.valueOf(z2);
        String a3 = a(intent, "shoutouts_mode");
        if (d.MODE_CREATE.equals(a3)) {
            cr.a().e();
            shortVideoContext.ab = new d();
            shortVideoContext.ab.setShoutOutsMode(d.MODE_CREATE);
            shortVideoContext.r = d.shootWay;
        }
        shortVideoContext.f124756a.setTag("tag");
        if ("4".equals(a3)) {
            cr.a().e();
            String a4 = a(intent, "shout_out_order_id");
            if (!TextUtils.isEmpty(a4)) {
                shortVideoContext.ab = new d();
                shortVideoContext.ab.setOrderId(a4);
                shortVideoContext.ab.setShoutOutsMode(d.MODE_SEND);
                shortVideoContext.r = d.shootWay;
            }
        }
        if ("3".equals(a3)) {
            cr.a().e();
            shortVideoContext.ab = (d) intent.getSerializableExtra("shout_out_data");
            shortVideoContext.ab.setShoutOutsMode(d.MODE_EDIT);
            shortVideoContext.r = d.shootWay;
        }
        a(shortVideoContext.ab);
        shortVideoContext.f124757b.o.f124722c = a(intent, "duet_video_path");
        shortVideoContext.f124757b.o.f124723d = a(intent, "duet_audio_path");
        shortVideoContext.f124757b.o.f124721b = a(intent, "duet_from");
        shortVideoContext.aL = (User) intent.getSerializableExtra("duet_author");
        shortVideoContext.f124757b.o.f124720a = a(intent, "duet_hash_tag");
        shortVideoContext.f124757b.o.f124727h = intent.getIntExtra("duet_video_width", 0);
        shortVideoContext.f124757b.o.f124728i = intent.getIntExtra("duet_video_height", -1);
        shortVideoContext.f124757b.o.n = intent.getBooleanExtra("duet_from_duet_sticker", false) ? 1 : 0;
        shortVideoContext.aU = intent.getBooleanExtra("duet_from_duet_button", false) ? 1 : 0;
        shortVideoContext.f124757b.o.q = (Effect) intent.getParcelableExtra("duet_layout_effect");
        shortVideoContext.aT = shortVideoContext.f124757b.o.n;
        shortVideoContext.f124757b.o.f124732m = intent.getBooleanExtra("duet_default_mic", false);
        shortVideoContext.aM = (User) intent.getSerializableExtra("reaction_from_author");
        shortVideoContext.f124757b.p.f124739a = (ReactionParams) intent.getParcelableExtra("reaction_params");
        if (shortVideoContext.f124757b.b()) {
            a2 = shortVideoContext.f124757b.o.f124723d;
        } else if (shortVideoContext.f124757b.c()) {
            a2 = shortVideoContext.f124757b.p.f124739a.wavPath;
        } else {
            a2 = a(intent, "path");
        }
        shortVideoContext.a(a2);
        if (shortVideoContext.Z == 12) {
            StitchParams stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            shortVideoContext.a(stitchParams);
            if (!TextUtils.isEmpty(stitchParams.getMusicPath()) && stitchParams.getMusicStart() >= 0) {
                shortVideoContext.a(stitchParams.getMusicPath());
            }
        } else {
            shortVideoContext.k();
        }
        shortVideoContext.v = a(intent, "reuse_giphy_gifs");
        shortVideoContext.f124756a.setShootExtraData((ShootExtraData) intent.getParcelableExtra("extra_shoot_data"));
        if (!TextUtils.isEmpty(shortVideoContext.f124757b.y)) {
            shortVideoContext.f124757b.f124713h.a(shortVideoContext.f124757b.y);
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.am = a(intent, "extra_bind_mv_id");
        }
        intent.getSerializableExtra("music_model");
        shortVideoContext.d(new am().a());
        if (shortVideoContext.Z != 12) {
            shortVideoContext.c(a.a(shortVideoContext));
        }
        shortVideoContext.aH = intent.getIntExtra("extra_video_length", 0);
        b(shortVideoContext);
        shortVideoContext.d(intent.getIntExtra("music_start", 0));
        shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
        shortVideoContext.a(com.ss.android.ugc.aweme.port.in.c.o.getVideoWidth());
        shortVideoContext.b(com.ss.android.ugc.aweme.port.in.c.o.getVideoHeight());
        shortVideoContext.a(new dt());
        shortVideoContext.b(0L);
        shortVideoContext.c(b.a() ? 1 : 0);
        shortVideoContext.e(dp.a().a());
        shortVideoContext.ak = intent.getBooleanExtra("extra_to_status", false);
        List<AVChallenge> list = cr.a().f125298d;
        if (h.b(list) && list.get(0) != null) {
            AVChallenge aVChallenge = list.get(0);
            if (!TextUtils.isEmpty(aVChallenge.getStickerId())) {
                shortVideoContext.T = list.get(0).getStickerId();
                shortVideoContext.X = list.get(0).getStickerId();
                shortVideoContext.U = true;
            } else {
                shortVideoContext.U = intent.getBooleanExtra("use_preset_sticker_at_first", false);
            }
            shortVideoContext.ak = aVChallenge.mStatus.booleanValue();
        }
        if (!h.b(list) || TextUtils.isEmpty(list.get(0).getStickerId())) {
            shortVideoContext.U = intent.getBooleanExtra("use_preset_sticker_at_first", false);
        } else {
            shortVideoContext.T = list.get(0).getStickerId();
            shortVideoContext.X = list.get(0).getStickerId();
            shortVideoContext.U = true;
        }
        shortVideoContext.ay = a(intent, "filter_business_sticker");
        shortVideoContext.U = intent.getBooleanExtra("use_preset_sticker_at_first", shortVideoContext.U);
        shortVideoContext.Y = a(intent, "tag_id");
        if (TextUtils.isEmpty(shortVideoContext.T)) {
            shortVideoContext.T = a(intent, "sticker_id");
            shortVideoContext.X = a(intent, "sticker_id");
        }
        if (TextUtils.isEmpty(shortVideoContext.X) && (effectTemplate = (EffectTemplate) intent.getParcelableExtra("first_sticker")) != null) {
            shortVideoContext.X = effectTemplate.getEffectId();
        }
        shortVideoContext.a((GameDuetResource) intent.getParcelableExtra("duet_sticker_game"));
        shortVideoContext.ah = (t) intent.getSerializableExtra("micro_app_info");
        if (intent.getBooleanExtra("enter_record_from_other_platform", false) || shortVideoContext.ah != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        shortVideoContext.ai = z3;
        shortVideoContext.aj = intent.getBooleanExtra("to_live", false);
        shortVideoContext.o = a(intent, "extra_live_source_params");
        shortVideoContext.al = intent.getBooleanExtra("extra_only_show_live_tab", false);
        if (intent.hasExtra("extra_mention_uid") && intent.hasExtra("extra_mention_user_name")) {
            shortVideoContext.an = ExtraMentionUserModel.Companion.newInstance(a(intent, "extra_mention_uid"), a(intent, "extra_mention_user_name"));
        }
        shortVideoContext.f124767l = (CommentVideoModel) intent.getSerializableExtra("comment_video_model");
        com.ss.android.ugc.aweme.shortvideo.f.a.a(shortVideoContext.f124767l);
        shortVideoContext.f124768m = (QaStruct) intent.getSerializableExtra("question_answer_video_model");
        shortVideoContext.ac = true;
        shortVideoContext.aE = a(intent, "effect_meta_info");
        shortVideoContext.aF = a(intent, "effect_image");
        shortVideoContext.aR = a(intent, "is_west_window_exist");
        shortVideoContext.aW = (com.ss.android.ugc.aweme.common.a) intent.getSerializableExtra("auto_selected_anchor");
        shortVideoContext.aX = a(intent, "open_platform_extra");
        shortVideoContext.aY = a(intent, "open_platform_client_key");
        com.ss.android.ugc.aweme.tools.b.g.a(intent, q.a(shortVideoContext));
        return shortVideoContext;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ShortVideoContext a(Intent intent, Context context) {
        int intExtra = intent.getIntExtra("restore", 0);
        if (intExtra == 0) {
            return a(intent);
        }
        if (intExtra == 1) {
            return b(intent, context);
        }
        if (intExtra != 2) {
            return a(intent);
        }
        return c(intent, context);
    }

    public static void a(Intent intent, ShortVideoContext shortVideoContext) {
        RetakeVideoContext retakeVideoContext = (RetakeVideoContext) intent.getParcelableExtra("retake_video");
        shortVideoContext.c(retakeVideoContext.f124747a);
        shortVideoContext.m();
        shortVideoContext.b(true);
        if (retakeVideoContext.f124751e != null) {
            shortVideoContext.a(new dt(retakeVideoContext.f124751e.editSegments));
        }
        shortVideoContext.f124757b.d().clear();
        shortVideoContext.f124757b.f124713h.b(retakeVideoContext.f124752f);
        shortVideoContext.a(retakeVideoContext);
        if (retakeVideoContext.f124753g != null) {
            shortVideoContext.a(retakeVideoContext.f124753g);
        } else {
            shortVideoContext.k();
        }
        String str = retakeVideoContext.f124751e.curMultiEditVideoRecordData.musicPath;
        boolean isPlaySingleSegmentMusic = retakeVideoContext.f124751e.curMultiEditVideoRecordData.isPlaySingleSegmentMusic();
        if (str == null || !isPlaySingleSegmentMusic) {
            a(shortVideoContext);
            return;
        }
        shortVideoContext.d(retakeVideoContext.f124751e.curMultiEditVideoRecordData.musicTrimIn);
        shortVideoContext.f124757b.f124713h.a(str);
        shortVideoContext.a(str);
    }

    public static void b(Intent intent, ShortVideoContext shortVideoContext) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("original_segments");
        int intExtra = intent.getIntExtra("original_music_start", 0);
        c cVar = cr.a().f125295a;
        shortVideoContext.c(0L);
        shortVideoContext.m();
        shortVideoContext.b(false);
        shortVideoContext.a((RetakeVideoContext) null);
        shortVideoContext.a(new dt(parcelableArrayListExtra));
        shortVideoContext.b((long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f124757b.f124711f));
        shortVideoContext.f124757b.f124713h.b(dj.f126462e);
        if (cVar != null) {
            String b2 = l.f115658a.b().b(cVar);
            shortVideoContext.f124757b.f124713h.a(b2);
            shortVideoContext.a(b2);
            shortVideoContext.d(intExtra);
        } else {
            a(shortVideoContext);
        }
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.k();
        }
    }

    private static void a(MediaMetadataRetriever mediaMetadataRetriever, String str) {
        MethodCollector.i(9722);
        if (str != null) {
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                try {
                    mediaMetadataRetriever.setDataSource(fileInputStream.getFD(), 0, 576460752303423487L);
                    fileInputStream.close();
                    MethodCollector.o(9722);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    MethodCollector.o(9722);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(e2);
                MethodCollector.o(9722);
                throw illegalArgumentException;
            } catch (IOException e3) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(e3);
                MethodCollector.o(9722);
                throw illegalArgumentException2;
            }
        } else {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("path == null");
            MethodCollector.o(9722);
            throw illegalArgumentException3;
        }
    }

    private static void a(ShortVideoContext shortVideoContext, Context context) {
        if (shortVideoContext.f124757b.a()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!com.ss.android.ugc.aweme.shortvideo.af.b.a(shortVideoContext.f124757b.f124713h.c(), context)) {
                shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
                return;
            }
            try {
                if (com.ss.android.ugc.aweme.shortvideo.af.b.a(shortVideoContext.f124757b.f124713h.c())) {
                    a(mediaMetadataRetriever, shortVideoContext.f124757b.f124713h.c());
                } else {
                    mediaMetadataRetriever.setDataSource(context, Uri.parse(shortVideoContext.f124757b.f124713h.c()));
                }
                shortVideoContext.f124764i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
            }
        } else {
            shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
        }
    }

    private static ShortVideoContext b(Intent intent, Context context) {
        int i2;
        int i3;
        boolean z;
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(1));
        shortVideoContext.E = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.r = a(intent, "shoot_way");
        shortVideoContext.t = a(intent, "shoot_from");
        shortVideoContext.a((Workspace) intent.getParcelableExtra("workspace"));
        shortVideoContext.f124758c = intent.getIntExtra("draft_to_edit_from", 0);
        if (shortVideoContext.f124757b.f124713h.c() != null && com.ss.android.ugc.aweme.shortvideo.af.b.a(shortVideoContext.f124757b.f124713h.c(), context)) {
            shortVideoContext.a(shortVideoContext.f124757b.f124713h.c());
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.am = a(intent, "extra_bind_mv_id");
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) intent.getSerializableExtra("video_edit_model");
        int[] recordVideoSize = videoPublishEditModel.getRecordVideoSize();
        if (recordVideoSize.length < 2) {
            shortVideoContext.a(g.a().h().getVideoWidth());
            i3 = g.a().h().getVideoHeight();
        } else {
            if (recordVideoSize[0] == 0) {
                i2 = g.a().h().getVideoWidth();
            } else {
                i2 = recordVideoSize[0];
            }
            shortVideoContext.a(i2);
            if (recordVideoSize[1] == 0) {
                i3 = g.a().h().getVideoHeight();
            } else {
                i3 = recordVideoSize[1];
            }
        }
        shortVideoContext.b(i3);
        shortVideoContext.Z = videoPublishEditModel.mShootMode;
        shortVideoContext.aa = videoPublishEditModel.mShootedShootMode;
        if (videoPublishEditModel.creativeFlowData != null) {
            shortVideoContext.f124756a = videoPublishEditModel.creativeFlowData;
        }
        shortVideoContext.d(videoPublishEditModel.mDurationMode);
        shortVideoContext.c(videoPublishEditModel.isMuted);
        shortVideoContext.q = videoPublishEditModel.creationId;
        shortVideoContext.C = videoPublishEditModel.draftId;
        shortVideoContext.D = videoPublishEditModel.newDraftId;
        shortVideoContext.j().setDraftId(videoPublishEditModel.draftId);
        shortVideoContext.j().setNewDraftId(videoPublishEditModel.newDraftId);
        shortVideoContext.j().setCreationId(videoPublishEditModel.creationId);
        shortVideoContext.aT = videoPublishEditModel.duetFromDuetSticker;
        shortVideoContext.f124757b.o.n = videoPublishEditModel.duetFromDuetSticker;
        DuetExtraInfo duetExtraInfo = (DuetExtraInfo) intent.getParcelableExtra(DuetExtraInfo.class.getName());
        if (duetExtraInfo != null) {
            DuetContext duetContext = shortVideoContext.f124757b.o;
            duetContext.f124722c = duetExtraInfo.getDuetVideoPath();
            duetContext.f124723d = duetExtraInfo.getDuetAudioPath();
            duetContext.f124727h = duetExtraInfo.getDuetVideoWidth();
            duetContext.f124728i = duetExtraInfo.getDuetVideoHeight();
            duetContext.o = duetExtraInfo.getDuetLayoutMode();
            duetContext.p = duetExtraInfo.getDuetLayoutDirection();
            duetContext.f124721b = a(intent, "duet_from");
            duetContext.f124729j = a(intent, "extra_duet_layout");
            shortVideoContext.a(com.ss.android.ugc.aweme.port.in.c.o.getVideoWidth());
            shortVideoContext.b(com.ss.android.ugc.aweme.port.in.c.o.getVideoHeight());
        }
        shortVideoContext.a(new RecordContext(StrArray.from(videoPublishEditModel.mRecordFilterLabels), StrArray.from(videoPublishEditModel.mRecordFilterIds), StrArray.from(videoPublishEditModel.mRecordFilterValues), new StrArray(), new StrArray(), new StrArray()));
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.k();
        }
        RecordScene recordScene = cr.a().r;
        if (recordScene == null || recordScene.isSegmentsNotValid()) {
            shortVideoContext.a(new dt());
            shortVideoContext.b(0L);
            shortVideoContext.c(b.a() ? 1 : 0);
            shortVideoContext.e(true);
            String str = null;
            if (shortVideoContext.f124757b.a() && com.ss.android.ugc.aweme.shortvideo.af.b.a(shortVideoContext.f124757b.f124713h.c(), context)) {
                str = shortVideoContext.f124757b.f124713h.c();
            }
            shortVideoContext.a(m.a(str));
            shortVideoContext.f124764i = (int) shortVideoContext.f124757b.f124707b;
        } else {
            shortVideoContext.a(new dt(recordScene.videoSegments));
            shortVideoContext.b((long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f124757b.f124711f));
            shortVideoContext.d(recordScene.musicStart);
            shortVideoContext.c(recordScene.hardEncode);
            if (recordScene.faceBeauty > 0) {
                z = true;
            } else {
                z = false;
            }
            shortVideoContext.e(z);
            shortVideoContext.a(recordScene.maxDuration);
            a(shortVideoContext, context);
            shortVideoContext.f124761f = recordScene.audioTrack;
        }
        shortVideoContext.H = videoPublishEditModel.title;
        shortVideoContext.I = videoPublishEditModel.chain;
        shortVideoContext.J = videoPublishEditModel.disableDeleteChain;
        shortVideoContext.K = videoPublishEditModel.structList;
        shortVideoContext.f124765j = videoPublishEditModel.mMusicOrigin;
        shortVideoContext.L = videoPublishEditModel.isPrivate;
        shortVideoContext.M = videoPublishEditModel.excludeUserList;
        shortVideoContext.N = videoPublishEditModel.allowRecommend;
        if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            String[] split = videoPublishEditModel.pic2VideoSource.split(",");
            if (split.length > 0) {
                shortVideoContext.aC.addAll(Arrays.asList(split));
            }
        }
        shortVideoContext.aB = 0;
        shortVideoContext.O = true;
        shortVideoContext.s = true;
        com.ss.android.ugc.aweme.tools.b.g.a(q.a(videoPublishEditModel), q.a(shortVideoContext), e.DRAFT, e.RECORD);
        shortVideoContext.a(videoPublishEditModel.extractFramesModel);
        shortVideoContext.av = videoPublishEditModel.draftEditTransferModel;
        shortVideoContext.a(videoPublishEditModel.metadataMap);
        shortVideoContext.f124767l = videoPublishEditModel.commentVideoModel;
        shortVideoContext.f124768m = videoPublishEditModel.qaStruct;
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            shortVideoContext.a((ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param"));
        }
        int intExtra = intent.getIntExtra("retake_shoot_mode", -1);
        if (intExtra == 1) {
            a(intent, shortVideoContext);
        } else if (intExtra == 2) {
            b(intent, shortVideoContext);
        }
        shortVideoContext.ar = videoPublishEditModel.publishStage;
        shortVideoContext.aN = es.h(videoPublishEditModel);
        shortVideoContext.P = videoPublishEditModel.isPhotoMvMusic;
        shortVideoContext.R = videoPublishEditModel.isDraftMusicIllegal;
        shortVideoContext.aJ = videoPublishEditModel.recordBgmDelay;
        shortVideoContext.aR = videoPublishEditModel.isWestWindowExistStr;
        shortVideoContext.as = videoPublishEditModel.loudnessBalanceParam;
        shortVideoContext.aW = (com.ss.android.ugc.aweme.common.a) intent.getSerializableExtra("auto_selected_anchor");
        shortVideoContext.aX = a(intent, "open_platform_extra");
        shortVideoContext.aY = a(intent, "open_platform_client_key");
        return shortVideoContext;
    }

    private static ShortVideoContext c(Intent intent, Context context) {
        boolean z;
        ShortVideoContext shortVideoContext = new ShortVideoContext(new CameraComponentModel(2));
        shortVideoContext.E = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.r = a(intent, "shoot_way");
        shortVideoContext.t = a(intent, "shoot_from");
        shortVideoContext.a(c.a());
        boolean z2 = false;
        shortVideoContext.C = 0;
        shortVideoContext.ar = 50;
        intent.getSerializableExtra("music_model");
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.am = a(intent, "extra_bind_mv_id");
        }
        shortVideoContext.a(com.ss.android.ugc.aweme.port.in.c.o.getVideoWidth());
        shortVideoContext.b(com.ss.android.ugc.aweme.port.in.c.o.getVideoHeight());
        if (!AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().e() || g.a().A().a() || AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().b()) {
            z = false;
        } else {
            z = true;
        }
        cr.a();
        cr.f125294k = Boolean.valueOf(z);
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.k();
        }
        RecordScene b2 = com.ss.android.ugc.aweme.shortvideo.f.a.b();
        shortVideoContext.d(g.a().e().getDurationMode(true));
        if (b2.isSegmentsNotValid()) {
            shortVideoContext.j().setCreationId(UUID.randomUUID().toString());
            shortVideoContext.q = UUID.randomUUID().toString();
            shortVideoContext.a(new dt());
            shortVideoContext.b(0L);
            shortVideoContext.c(b.a() ? 1 : 0);
            shortVideoContext.e(true);
            String str = null;
            if (shortVideoContext.f124757b.a() && com.ss.android.ugc.aweme.shortvideo.af.b.a(shortVideoContext.f124757b.f124713h.c(), context)) {
                str = shortVideoContext.f124757b.f124713h.c();
            }
            shortVideoContext.a(m.a(str));
            a(shortVideoContext, context);
        } else {
            shortVideoContext.j().setCreationId(b2.creationId);
            shortVideoContext.q = b2.creationId;
            shortVideoContext.a(new dt(b2.videoSegments));
            shortVideoContext.b((long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f124757b.f124711f));
            shortVideoContext.a(b2.musicPath);
            if (!TextUtils.isEmpty(b2.musicPath)) {
                shortVideoContext.f124757b.f124713h.a(b2.musicPath);
            }
            shortVideoContext.d(b2.musicStart);
            shortVideoContext.c(b2.hardEncode);
            if (b2.faceBeauty > 0) {
                z2 = true;
            }
            shortVideoContext.e(z2);
            shortVideoContext.a(b2.maxDuration);
            a(shortVideoContext, context);
            shortVideoContext.f124761f = b2.audioTrack;
            cr.a().a(b2.musicModel);
            shortVideoContext.f124757b.p.f124739a = b2.reactionParams;
            shortVideoContext.S = b2.sharedARModel;
            shortVideoContext.F.f124773a = b2.stitchParams;
            shortVideoContext.a(b2.extractFramesModel);
            shortVideoContext.a(new RecordContext(StrArray.from(b2.filterLabels), StrArray.from(b2.filterIds), StrArray.from(b2.filterValues), new StrArray(), new StrArray(), new StrArray(), new StrArray()));
            shortVideoContext.a(b2.cherEffectParam);
            shortVideoContext.a(b2.videoRecordMetadata);
            shortVideoContext.f124767l = b2.commentVideoModel;
            shortVideoContext.aa = b2.shootedShootMode;
            cr.a().a(b2.getChallengeFromStr());
            shortVideoContext.aJ = b2.recordBGMDelay;
            shortVideoContext.as = b2.loudnessBalanceParam;
            shortVideoContext.aW = (com.ss.android.ugc.aweme.common.a) intent.getSerializableExtra("auto_selected_anchor");
            shortVideoContext.aX = a(intent, "open_platform_extra");
            shortVideoContext.aY = a(intent, "open_platform_client_key");
        }
        dv.f126646e = b2.fromItemId;
        return shortVideoContext;
    }
}
