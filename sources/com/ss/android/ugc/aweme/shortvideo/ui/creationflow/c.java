package com.ss.android.ugc.aweme.shortvideo.ui.creationflow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.w.f;
import com.ss.android.ugc.aweme.tools.b.e;
import com.ss.android.ugc.aweme.tools.b.g;
import com.ss.android.ugc.aweme.utils.ds;
import com.ss.android.ugc.aweme.utils.gr;
import h.f.b.l;
import h.f.b.m;
import h.n;
import h.z;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c extends com.ss.android.ugc.aweme.ar.a {
    static {
        Covode.recordClassIndex(86218);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $intent;

        static {
            Covode.recordClassIndex(86219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity, Intent intent) {
            super(0);
            this.$activity = activity;
            this.$intent = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.shortvideo.r.a.a().e(this.$activity, this.$intent);
            this.$activity.overridePendingTransition(0, 0);
            return z.f158842a;
        }
    }

    private static boolean a(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (arrayList == null) {
            return true;
        }
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            TimeSpeedModelExtension next = it.next();
            l.b(next, "");
            if (!next.isSupportRetake()) {
                return false;
            }
        }
        return true;
    }

    public final <RETURN_VALUE> RETURN_VALUE a(b<RETURN_VALUE> bVar) {
        List<MultiEditVideoSegmentRecordData> list;
        l.d(bVar, "");
        if (bVar instanceof b.a) {
            a aVar = ((b.a) bVar).f131656a;
            Activity activity = aVar.f131647a;
            ShortVideoContext shortVideoContext = aVar.f131650d;
            Intent a2 = a(aVar, shortVideoContext);
            if (gr.f143025c && !gr.f143023a) {
                gr.f143025c = false;
                gr.b("record_success");
            }
            b.a.f132249a.step("av_video_edit", "startVideoEditActivity");
            if (shortVideoContext.ai) {
                com.ss.android.ugc.aweme.shortvideo.r.a.a().e(activity, a2);
            } else if (shortVideoContext.Z == 15) {
                a2.putExtra("extra_request_code", 12345);
                a(activity, new a(activity, a2));
            } else {
                a2.putExtra("extra_request_code", 12344);
                com.ss.android.ugc.aweme.shortvideo.r.a.a().e(activity, a2);
            }
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.C3421b) {
            b.C3421b bVar2 = (b.C3421b) bVar;
            ShortVideoContext shortVideoContext2 = bVar2.f131659c;
            Activity activity2 = bVar2.f131657a;
            Intent a3 = a(bVar2.f131659c, bVar2.f131658b, bVar2.f131660d);
            Workspace workspace = shortVideoContext2.f124757b.f124713h;
            l.b(workspace, "");
            File a4 = workspace.a();
            l.b(a4, "");
            String absolutePath = a4.getAbsolutePath();
            l.b(absolutePath, "");
            Workspace workspace2 = shortVideoContext2.f124757b.f124713h;
            l.b(workspace2, "");
            File b2 = workspace2.b();
            l.b(b2, "");
            String absolutePath2 = b2.getAbsolutePath();
            l.b(absolutePath2, "");
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = shortVideoContext2.n().f124751e;
            EditPreviewInfo a5 = av.a(shortVideoContext2, multiEditVideoStatusRecordData, absolutePath, absolutePath2);
            l.b(a5, "");
            a3.putExtra("extra_edit_preview_info", (Parcelable) a5);
            if (multiEditVideoStatusRecordData != null) {
                a3.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                if (!(multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
                    a3.putExtra("extra_video_count", list.size());
                }
            }
            com.ss.android.ugc.aweme.shortvideo.r.a.a().c((Context) activity2, a3);
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.c) {
            ((b.c) bVar).f131661a.finish();
            return (RETURN_VALUE) z.f158842a;
        } else if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            if (dVar.f131663b) {
                dVar.f131662a.setResult(-1);
            }
            dVar.f131662a.finish();
            return (RETURN_VALUE) z.f158842a;
        } else {
            throw new n();
        }
    }

    private static void a(Context context, h.f.a.a<z> aVar) {
        if (context instanceof androidx.lifecycle.m) {
            androidx.lifecycle.m mVar = (androidx.lifecycle.m) context;
            i lifecycle = mVar.getLifecycle();
            l.b(lifecycle, "");
            if (lifecycle.a().isAtLeast(i.b.RESUMED)) {
                aVar.invoke();
            } else {
                mVar.getLifecycle().a(new RecordStage$startActivitySafely$1(context, aVar));
            }
        } else {
            aVar.invoke();
        }
    }

    public static Intent a(a aVar, ShortVideoContext shortVideoContext) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        l.d(aVar, "");
        l.d(shortVideoContext, "");
        d dVar = aVar.f131652f;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = aVar.f131653g;
        long j2 = aVar.f131649c;
        int i2 = aVar.f131651e;
        String str = aVar.f131654h;
        String str2 = aVar.f131655i;
        f fVar = aVar.f131648b;
        k.a("RecordPageAction video path = ".concat(String.valueOf(str)));
        Intent a2 = a(shortVideoContext, fVar, i2);
        if (!(multiEditVideoStatusRecordData == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            a2.putExtra("extra_video_count", list.size());
        }
        q.a("type_av_record_concat_time", new ar().a("duration", Long.valueOf(System.currentTimeMillis() - j2)).a(StringSet.type, "record").a("abParam", (Boolean) true).a());
        if (dVar != null) {
            a2.putExtra("music_wave_data", dVar);
        }
        if (multiEditVideoStatusRecordData != null) {
            dt j3 = shortVideoContext.f124757b.j();
            l.b(j3, "");
            if (shortVideoContext.f124757b.f124714i) {
                multiEditVideoStatusRecordData.editSegments = j3;
                multiEditVideoStatusRecordData.isMultiEditRetake = true;
            } else {
                multiEditVideoStatusRecordData.originalSegments = j3;
                multiEditVideoStatusRecordData.isMultiEditRetake = false;
                multiEditVideoStatusRecordData.recordMusic = cr.a().f125295a;
                multiEditVideoStatusRecordData.originalMusicStart = shortVideoContext.f124757b.q;
            }
            a2.putExtra("extra_multi_edit_video_data", (Parcelable) multiEditVideoStatusRecordData);
        }
        if (!TextUtils.isEmpty(shortVideoContext.f124763h)) {
            a2.putExtra("share_id", shortVideoContext.f124763h);
        }
        if (!TextUtils.isEmpty(shortVideoContext.B)) {
            a2.putExtra("channel", shortVideoContext.B);
        }
        EditPreviewInfo a3 = av.a(shortVideoContext, multiEditVideoStatusRecordData, str, str2);
        Objects.requireNonNull(a3, "null cannot be cast to non-null type android.os.Parcelable");
        a2.putExtra("extra_edit_preview_info", (Parcelable) a3);
        return a2;
    }

    private static Intent a(ShortVideoContext shortVideoContext, f fVar, int i2) {
        boolean z;
        String contentType;
        Workspace workspace = shortVideoContext.f124757b.f124713h;
        dt j2 = shortVideoContext.f124757b.j();
        Intent intent = new Intent();
        intent.putExtra("workspace", workspace);
        if (shortVideoContext.f124757b.a()) {
            intent.putExtra("music_start", shortVideoContext.f124757b.q);
        }
        intent.putExtra("draft_from_shoot", shortVideoContext.s);
        intent.putExtra("face_beauty", com.ss.android.ugc.aweme.property.f.a());
        intent.putExtra("extra_publish_stage", shortVideoContext.ar);
        intent.putExtra("filter_id", 0);
        intent.putExtra("selected_filter_id", "");
        intent.putExtra("extra_record_video_selected_filter_index", shortVideoContext.az);
        intent.putExtra("extra_record_video_selected_filter_intensity", shortVideoContext.aA);
        boolean z2 = true;
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", true);
        intent.putExtra("video_segment", ShortVideoContext.a((ArrayList<TimeSpeedModelExtension>) j2));
        intent.putExtra("hard_encode", shortVideoContext.f124757b.f124710e);
        intent.putExtra("restore", shortVideoContext.f124757b.f124706a);
        intent.putExtra("camera", i2);
        intent.putExtra("record_filter_names", shortVideoContext.f124757b.G.f124740a.toString());
        intent.putExtra("record_filter_ids", shortVideoContext.f124757b.G.f124741b.toString());
        intent.putExtra("record_filter_values", shortVideoContext.f124757b.G.f124742c.toString());
        intent.putExtra("record_beauty_mob_param", (Parcelable) shortVideoContext.aZ);
        intent.putExtra("filter_lables", shortVideoContext.f124757b.G.f124740a.toString());
        intent.putExtra("filter_ids", shortVideoContext.f124757b.G.f124741b.toString());
        intent.putExtra("smooth_skin_labels", shortVideoContext.f124757b.G.f124743d.toString());
        intent.putExtra("smooth_reshape_labels", shortVideoContext.f124757b.G.f124744e.toString());
        intent.putExtra("smooth_tanning_labels", shortVideoContext.f124757b.G.f124746g.toString());
        intent.putExtra("smooth_eyes_labels", shortVideoContext.f124757b.G.f124745f.toString());
        intent.putExtra("extra_aweme_speed", RecordScene.getSpeedStringByModel(j2));
        intent.putExtra("extra_av_camera_ids", RecordScene.getCameraIdsStringByModel(j2));
        intent.putExtra("extra_beauty_type", shortVideoContext.f124757b.C);
        intent.putParcelableArrayListExtra("extra_beauty_data", RecordScene.getBeautyMetadatas(j2));
        intent.putExtra("extra_video_record_metadata", ds.a(shortVideoContext.f124757b.E));
        intent.putExtra("extra_is_change_speed", RecordScene.isChangeSpeed(j2));
        intent.putExtra("sticker_id", RecordScene.getStickerIdsByModel(j2));
        intent.putExtra("sticker_info", RecordScene.getStickerInfo(j2));
        intent.putExtra("first_sticker_music_ids", RecordScene.getFirstStickerMusicIds(j2));
        intent.putExtra("shoot_way", shortVideoContext.r);
        intent.putExtra("shoot_from", shortVideoContext.t);
        intent.putExtra("creation_id", shortVideoContext.q);
        g.a(intent, com.ss.android.ugc.aweme.shortvideo.q.b(shortVideoContext), e.RECORD, e.EDIT);
        intent.putExtra("draft_to_edit_from", shortVideoContext.f124758c);
        intent.putExtra("draft_id", shortVideoContext.C);
        intent.putExtra("new_draft_id", shortVideoContext.D);
        intent.putExtra("max_duration", shortVideoContext.f124757b.f124707b);
        intent.putExtra("wav_form", shortVideoContext.f124761f);
        intent.putExtra("origin", 1);
        intent.putExtra("challenge", (Serializable) av.a(j2, shortVideoContext.O));
        intent.putExtra("tag_id", shortVideoContext.Y);
        intent.putExtra("video_title", shortVideoContext.H);
        intent.putExtra("video_title_chain", shortVideoContext.I);
        intent.putExtra("duet_from_duet_sticker", shortVideoContext.f124757b.o.n);
        intent.putExtra("duet_from_duet_button", shortVideoContext.aU);
        intent.putExtra("disable_delete_title_chain", shortVideoContext.J);
        List<AVTextExtraStruct> list = shortVideoContext.K;
        if (!(list instanceof Serializable)) {
            list = null;
        }
        intent.putExtra("struct_list", (Serializable) list);
        intent.putExtra("is_rivate", shortVideoContext.L);
        intent.putExtra("duet_from", shortVideoContext.f124757b.o.f124721b);
        intent.putExtra("original_designer_uid_list", shortVideoContext.g());
        intent.putExtra("original_sticker_count", shortVideoContext.f());
        intent.putExtra("duet_author", shortVideoContext.aL);
        intent.putExtra("duet_hash_tag", shortVideoContext.f124757b.o.f124720a);
        intent.putExtra("record_bgm_delay", shortVideoContext.aJ);
        intent.putExtra("edit_loudness_param", (Parcelable) shortVideoContext.as);
        if (shortVideoContext.f124757b.b()) {
            DuetContext duetContext = shortVideoContext.f124757b.o;
            l.b(duetContext, "");
            String str = duetContext.f124722c;
            if (str == null) {
                l.b();
            }
            String str2 = duetContext.f124723d;
            if (str2 == null) {
                l.b();
            }
            intent.putExtra(DuetExtraInfo.class.getName(), (Parcelable) new DuetExtraInfo(str, str2, duetContext.f124727h, duetContext.f124728i, duetContext.o, duetContext.p));
        }
        intent.putExtra("shout_out_data", shortVideoContext.ab);
        intent.putExtra("creative_flow_data", (Parcelable) shortVideoContext.f124756a);
        intent.putExtra("shoot_mode", shortVideoContext.Z);
        intent.putExtra("shooted_shoot_mode", shortVideoContext.aa);
        intent.putExtra("duration_mode", shortVideoContext.f124757b.t);
        intent.putExtra("record_mode", shortVideoContext.f124757b.u);
        intent.putExtra("record_game_score", shortVideoContext.ae);
        intent.putExtra("duet_green_srceen", shortVideoContext.Q);
        ReactionParams reactionParams = shortVideoContext.f124757b.p.f124739a;
        if (!(reactionParams instanceof Parcelable)) {
            reactionParams = null;
        }
        intent.putExtra("reaction_params", (Parcelable) reactionParams);
        if (!shortVideoContext.f124757b.f124717l || shortVideoContext.f124757b.u == 1) {
            z = false;
        } else {
            z = true;
        }
        intent.putExtra("is_muted", z);
        intent.putExtra("music_origin", shortVideoContext.f124765j);
        intent.putExtra("extract_model", shortVideoContext.f124757b.w);
        intent.putExtra("micro_app_info", shortVideoContext.ah);
        intent.putExtra("enter_record_from_other_platform", shortVideoContext.ai);
        if (shortVideoContext.ah != null) {
            z2 = false;
        }
        intent.putExtra("back_to_main_after_publish", z2);
        intent.putExtra("extra_import_compile_cost_time", fVar.f132676a.f132748a - fVar.f132676a.f132749b);
        intent.putExtra("extra_start_enter_edit_page", fVar.f132676a.f132749b);
        intent.putExtra("extra_start_enter_edit_reason", fVar.f132676a.f132750c);
        av.b(shortVideoContext);
        if (!com.ss.android.ugc.tools.utils.k.a(shortVideoContext.aq)) {
            intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.aq);
        }
        if (!com.ss.android.ugc.tools.utils.k.a(shortVideoContext.at)) {
            intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.at);
        }
        if (!com.ss.android.ugc.tools.utils.k.a(shortVideoContext.ax)) {
            intent.putIntegerArrayListExtra("extra_countdown_mode", shortVideoContext.ax);
        }
        AVETParameter j3 = shortVideoContext.j();
        if (j3 != null) {
            if (l.a((Object) j3.getContentType(), (Object) "photo_canvas")) {
                contentType = "video";
            } else {
                contentType = j3.getContentType();
            }
            j3.setContentType(contentType);
        } else {
            j3 = null;
        }
        intent.putExtra("av_et_parameter", j3);
        if (shortVideoContext.an != null) {
            intent.putExtra("extra_mention_user_model", shortVideoContext.an);
        }
        intent.putExtra("enter_from", shortVideoContext.x);
        intent.putExtra("send_to_user_head", shortVideoContext.ao);
        if (shortVideoContext.av != null) {
            DraftEditTransferModel draftEditTransferModel = shortVideoContext.av;
            Objects.requireNonNull(draftEditTransferModel, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_draft_transform_model", (Parcelable) draftEditTransferModel);
        }
        if (shortVideoContext.f124757b.n != null) {
            ClientCherEffectParam clientCherEffectParam = shortVideoContext.f124757b.n;
            Objects.requireNonNull(clientCherEffectParam, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_ve_cher_effect_param", (Parcelable) clientCherEffectParam);
        }
        StringBuilder sb = new StringBuilder();
        if (!com.ss.android.ugc.tools.utils.k.a(shortVideoContext.aC)) {
            Iterator<String> it = shortVideoContext.aC.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(",");
                }
                sb.append(next);
            }
        }
        intent.putExtra("picture_source", sb.toString());
        intent.putExtra("contain_backgroundvideo", shortVideoContext.l());
        shortVideoContext.aB = 0;
        intent.putExtra("use_music_before_edit", shortVideoContext.f124757b.a());
        intent.putExtra("support_retake", a(j2));
        intent.putExtra("extra_duet_layout", shortVideoContext.f124757b.o.f124729j);
        intent.putExtra("extra_success_enable_aec", shortVideoContext.f124757b.o.f124726g);
        intent.putExtra("comment_video_model", shortVideoContext.f124767l);
        intent.putExtra("question_answer_video_model", shortVideoContext.f124768m);
        intent.putExtra("auto_selected_anchor", shortVideoContext.aW);
        intent.putExtra("open_platform_client_key", shortVideoContext.aY);
        intent.putExtra("open_platform_extra", shortVideoContext.aX);
        intent.putStringArrayListExtra("extra_camera_lens_info", RecordScene.getCameraLensInfoList(j2));
        if (shortVideoContext.c()) {
            StitchParams stitchParams = shortVideoContext.F.f124773a;
            if (!(stitchParams instanceof Parcelable)) {
                stitchParams = null;
            }
            intent.putExtra("stitch_params", (Parcelable) stitchParams);
            StitchParams stitchParams2 = shortVideoContext.F.f124773a;
            if (!(stitchParams2 == null || stitchParams2.getMusic() == null)) {
                long j4 = (long) shortVideoContext.f124757b.q;
                StitchParams stitchParams3 = shortVideoContext.F.f124773a;
                if (stitchParams3 == null) {
                    l.b();
                }
                intent.putExtra("music_start", (int) Math.max(0L, j4 - stitchParams3.getDuration()));
            }
        }
        SharedARModel sharedARModel = shortVideoContext.S;
        if (sharedARModel != null) {
            Objects.requireNonNull(sharedARModel, "null cannot be cast to non-null type android.os.Parcelable");
            intent.putExtra("extra_shared_ar_effect", (Parcelable) sharedARModel);
        }
        if (com.ss.android.ugc.tools.utils.k.b(j2)) {
            intent.putParcelableArrayListExtra("green_screen_material_list", RecordScene.getGreenScreenMaterials(j2));
        }
        intent.putExtra("draft_music_legal_param", shortVideoContext.R);
        intent.putExtra("from_prop_id", shortVideoContext.X);
        Boolean isDefaultProp = RecordScene.isDefaultProp(shortVideoContext.f124757b.f124711f, shortVideoContext.X);
        l.b(isDefaultProp, "");
        intent.putExtra("is_default_prop", isDefaultProp.booleanValue());
        intent.putExtra("extra_audio_aec_delay_time", shortVideoContext.aI);
        intent.putExtra("extra_current_zoom_value", shortVideoContext.aO);
        intent.putExtra("enter_method", shortVideoContext.y);
        dm.a(intent, shortVideoContext);
        return intent;
    }
}
