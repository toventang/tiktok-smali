package com.ss.android.ugc.aweme.shortvideo.f;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.df.h;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.du;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModelExtKt;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.p.c;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.ds;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public final class a {
    static {
        Covode.recordClassIndex(84241);
    }

    public static void a(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
            edit.putString("video_record_metadata", ds.a(map));
            com.bytedance.common.utility.e.a.a(edit);
        }
    }

    public static int c() {
        return d.a(i.f115645a, "publish", 0).getInt("shoot_mode", 0);
    }

    public static int d() {
        return d.a(i.f115645a, "publish", 0).getInt("checkpoint_scene", 3);
    }

    public static void a() {
        bj.a("PublishSharedPref reset");
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putString("music_path", "");
        edit.putString("music_model", "");
        edit.putInt("music_start", 0);
        edit.putInt("face_beauty", 0);
        edit.putString("segment_video", "");
        edit.putInt("hard_encode", 0);
        edit.putString("mp4_path", "");
        edit.putString("duet_video_path", "");
        edit.putBoolean("shoutout_params", false);
        edit.putString("duet_audio_path", "");
        edit.putString("creation_id", "");
        edit.putInt("record_mode", 0);
        edit.putString("challenge", "");
        edit.putString("comment_video_moodel", "");
        edit.putString("from_item_id", "");
        edit.putInt("checkpoint_scene", 3);
        com.bytedance.common.utility.e.a.a(edit);
        c.a("normal").d();
    }

    public static RecordScene b() {
        RecordScene recordScene = new RecordScene();
        SharedPreferences a2 = d.a(i.f115645a, "publish", 0);
        recordScene.musicPath = a2.getString("music_path", "");
        recordScene.musicStart = a2.getInt("music_start", 0);
        recordScene.videoSegments = CameraComponentModel.a(a2.getString("segment_video", ""));
        recordScene.faceBeauty = a2.getInt("face_beauty", 0);
        recordScene.hardEncode = a2.getInt("hard_encode", 0);
        recordScene.mp4Path = a2.getString("mp4_path", "");
        recordScene.maxDuration = a2.getLong("max_duration", 15000);
        recordScene.duetAudioPath = a2.getString("duet_audio_path", "");
        recordScene.duetVideoPath = a2.getString("duet_video_path", "");
        recordScene.shootMode = a2.getInt("shoot_mode", 0);
        recordScene.shootedShootMode = a2.getInt("shooted_shoot_mode", -1);
        recordScene.fromItemId = a2.getString("from_item_id", "");
        recordScene.creationId = a2.getString("creation_id", "");
        if (TextUtils.isEmpty(recordScene.creationId)) {
            recordScene.creationId = UUID.randomUUID().toString();
        }
        recordScene.recordBGMDelay = a2.getInt("record_bgm_delay", 0);
        if (recordScene.loudnessBalanceParam != null) {
            recordScene.loudnessBalanceParam.setBgmLoudness((double) a2.getFloat("edit_bgm_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setPeakLoudness((double) a2.getFloat("edit_peak_loudness", 0.0f));
            recordScene.loudnessBalanceParam.setAvgLoudness((double) a2.getFloat("edit_avg_loudness", 0.0f));
        }
        recordScene.recordMode = a2.getInt("record_mode", 0);
        recordScene.filterLabels = a2.getString("filter_labels", "");
        recordScene.filterIds = a2.getString("filter_ids", "");
        recordScene.filterValues = a2.getString("filter_values", "");
        recordScene.challengeStr = a2.getString("challenge", "");
        recordScene.sharedARModel = RecordScene.string2SharedARModel(a2.getString("shared_ar", ""));
        recordScene.commentVideoModel = RecordScene.string2CommentVideoModel(a2.getString("comment_video_moodel", ""));
        recordScene.reactionParams = RecordScene.string2ReactionParams(a2.getString("reaction", ""));
        recordScene.isShoutout = a2.getBoolean("shoutout_params", false);
        recordScene.stitchParams = RecordScene.string2StitchParams(a2.getString("stitch_params", ""));
        recordScene.extractFramesModel = ExtractFramesModelExtKt.string2Model(a2.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(a2.getString("ve_cher_effect_param", ""));
        recordScene.videoRecordMetadata = ds.a(a2.getString("video_record_metadata", ""));
        try {
            recordScene.musicModel = DraftUpdateServiceImpl.createDraftUpdateServicebyMonsterPlugin(false).transformNewAVMusic(a2.getString("music_model", ""));
        } catch (Throwable unused) {
        }
        return recordScene;
    }

    public static void a(int i2) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putInt("hard_encode", i2);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void b(int i2) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putInt("shoot_mode", i2);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void c(int i2) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putInt("shooted_shoot_mode", i2);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void a(CommentVideoModel commentVideoModel) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        if (commentVideoModel != null) {
            edit.putString("comment_video_moodel", g.a().G().b(commentVideoModel));
        } else {
            edit.remove("comment_video_moodel");
        }
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void b(String str) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putString("from_item_id", str);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void d(int i2) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putInt("checkpoint_scene", i2);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void a(ClientCherEffectParam clientCherEffectParam) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        if (clientCherEffectParam != null) {
            edit.putString("ve_cher_effect_param", g.a().G().b(clientCherEffectParam));
        } else {
            edit.remove("ve_cher_effect_param");
        }
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void a(String str) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putString("creation_id", str);
        com.bytedance.common.utility.e.a.a(edit);
    }

    public static void a(ArrayList<TimeSpeedModelExtension> arrayList) {
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putString("segment_video", du.a(arrayList));
        com.bytedance.common.utility.e.a.a(edit);
        c.a("normal").c();
    }

    public static void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar, int i2) {
        String str2;
        SharedPreferences.Editor edit = d.a(i.f115645a, "publish", 0).edit();
        edit.putString("music_path", str);
        if (cVar != null) {
            try {
                str2 = h.a().b(cVar);
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                if (cVar.getMusicWaveData() != null) {
                    float[] musicWaveData = cVar.getMusicWaveData();
                    int length = musicWaveData.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        sb.append(musicWaveData[i3] + ",");
                    }
                }
                bj.a("music id:" + cVar.getMusicId() + "; music name:" + cVar.getName() + "; music wave data:" + sb.toString());
                throw e2;
            }
        } else {
            str2 = "";
        }
        edit.putString("music_model", str2);
        edit.putInt("music_start", i2);
        com.bytedance.common.utility.e.a.a(edit);
    }
}
