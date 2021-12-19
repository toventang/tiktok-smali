package com.ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.ac.a;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import h.f.b.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class b {
    @c(a = "selectedFilterId")
    public String A;
    @c(a = "selectedFilterLabel")
    public String B;
    @c(a = "selectedFilterValue")
    public String C;
    @c(a = "uploadSaveModel")
    public AVUploadSaveModel D;
    @c(a = "infoStickerModel")
    public InfoStickerModel E;
    @c(a = "micro_app_info")
    public t F;
    @c(a = "video_type")
    public int G;
    @c(a = "texts")
    public List<String> H;
    @c(a = "usePaint")
    public boolean I;
    @c(a = "commentSetting")
    public int J;
    @c(a = "socialModel", b = {"E"})
    public SocialModel K;
    @c(a = "firstStickerMusicIds")
    public String L;
    @c(a = "mv_theme_create_video")
    public d M;
    @c(a = "status_create_video")
    public StatusCreateVideoData N;
    @c(a = "creative_flow_data")
    public CreativeFlowData O;
    @c(a = "av_upload_misc_struct")
    public i P;
    @c(a = "is_fast_import")
    public boolean Q;
    @c(a = "fast_import_resolution")
    public String R;
    @c(a = "draft_video_path")
    public String S;
    @c(a = "videoCoverPath")
    public String T;
    @c(a = "cher_effect_param")
    public e U;
    @c(a = "videoOutWidth")
    public int V;
    @c(a = "videoOutHeight")
    public int W;
    @c(a = "videoCanvasWidth")
    public int X;
    @c(a = "videoCanvasHeight")
    public int Y;
    public int Z;
    @c(a = "shootMode")

    /* renamed from: a  reason: collision with root package name */
    public int f83167a;
    @c(a = "backGroundVideoDraftDir")
    public String aA;
    @c(a = "sticker_info")
    public StickerInfo aB;
    @c(a = "comment_sticker_model")
    public CommentVideoModel aC;
    @c(a = "beauty_metadata")
    public ArrayList<BeautyMetadata> aD;
    @c(a = "update_info_stickers")
    public boolean aE;
    @c(a = "autoEnhanceOn")
    public boolean aF;
    @c(a = "autoEnhanceType")
    public int aG;
    @c(a = "stick_point_type")
    public int aH;
    @c(a = "duet_layout")
    public String aI;
    @c(a = "stitch_params")
    public StitchParams aJ;
    @c(a = "is_commerce_music")
    public boolean aK;
    @c(a = "green_screen_material_list")
    public ArrayList<GreenScreenMaterial> aL;
    @c(a = "camera_lens_info")
    public ArrayList<String> aM;
    @c(a = "is_photo_mv_mode")
    public boolean aN;
    @c(a = "is_duet_green_srceen")
    public boolean aO;
    @c(a = "is_sound_loop")
    public String aP;
    @c(a = "cutsame_data")
    public CutSameEditData aQ;
    @c(a = "cover_publish_model")
    public CoverPublishModel aR;
    @c(a = "geofencing_info")
    public List<String> aS;
    @c(a = "exclude_user_list")
    public List<? extends User> aT;
    @c(a = "shout_outs_data")
    public com.ss.android.ugc.aweme.shoutouts.d aU;
    @c(a = "allow_recommend")
    public int aV;
    @c(a = "shared_ar_model")
    public SharedARModel aW;
    @c(a = "message_bubble_texts")
    public List<String> aX;
    @c(a = "is_photo_mv_music")
    public boolean aY;
    @c(a = "is_photo_mv_mode_1080p")
    public boolean aZ;
    @c(a = "draft_ve_audio_effect_param")
    public i aa;
    @c(a = "draft_time_effect_start_point")
    public Integer ab;
    @c(a = "filter_local_path")
    public String ac;
    @c(a = "camera_ids")
    public String ad;
    @c(a = "beauty_type")
    public int ae;
    @c(a = "import_video_infos")
    public ArrayList<ImportVideoInfo> af;
    @c(a = "sticker_challenge")
    public StickerChallenge ag;
    @c(a = "text_sticker_challenge")
    public TextStickerChallenges ah;
    @c(a = "video_part_metadata")
    public Map<String, ? extends Object> ai;
    @c(a = "audio_recorder_param")
    public AudioRecorderParam aj;
    @c(a = "is_stickpoint_mode")
    public boolean ak;
    @c(a = "upload_path")
    public String al;
    @c(a = "draft_preview_configure")
    public g am;
    @c(a = "video_segments_copy")
    public List<DraftVideoSegment> an;
    @c(a = "preview_info")
    public EditPreviewInfo ao;
    @c(a = "preview_video_list_copy")
    public List<? extends EditVideoSegment> ap;
    @c(a = "videoCount")
    public int aq;
    @c(a = "photoCount")
    public int ar;
    @c(a = "filter_intensity")
    public float as;
    @c(a = "pic2VideoSource")
    public String at;
    @c(a = "downloadSetting")
    public int au;
    @c(a = "useMusicBeforeEdit")
    public boolean av;
    @c(a = "support_retake")
    public boolean aw;
    @c(a = "multi_edit_video_data")
    public MultiEditVideoStatusRecordData ax;
    @c(a = "containBackgroundVideo")
    public boolean ay;
    @c(a = "stick_point_data")
    public a az;
    @c(a = "from")

    /* renamed from: b  reason: collision with root package name */
    public int f83168b;
    @c(a = "edit_music_sync_mode")
    public boolean bA;
    @c(a = "cut_2_edit_transfer_model")
    public Cut2EditTransferModel bB;
    @c(a = "is_file_length_fixed")
    public boolean bC;
    @c(a = "session_id")
    public String bD;
    @c(a = "tt_story_upload_model")
    public TTStoryUploadModel bE;
    @c(a = "last_output_video_path")
    public String bF;
    @c(a = "is_story_draft")
    public boolean bG;
    @c(a = "from_item_id")
    public String bH;
    @c(a = "uploadMethod")
    public String bI;
    @c(a = "is_draft_music_illegal")
    public boolean ba;
    @c(a = "publish_stage")
    public int bb;
    @c(a = "audio_aec_delay_time")
    public long bc;
    @c(a = "current_zoom_value")
    public float bd;
    @c(a = "multi_edit_video_size")
    public Map<String, Long> be;
    @c(a = "mention_sticker_texts")
    public List<String> bf;
    @c(a = "hashtag_sticker_texts")
    public List<String> bg;
    @c(a = "shooted_shoot_mode")
    public int bh;
    @c(a = "duet_from_duet_sticker")
    public int bi;
    @c(a = "duet_from_duet_button")
    public int bj;
    @c(a = "enable_auto_caption")
    public int bk;
    @c(a = "duet_extra_info")
    public DuetExtraInfo bl;
    @c(a = "record_bgm_delay")
    public Integer bm;
    @c(a = "selectedFilterResId")
    public String bn;
    @c(a = "canvas_video_info")
    public CanvasVideoData bo;
    @c(a = "lightening_extra_info")
    public LighteningExtraInfo bp;
    @c(a = "loudness_param")
    public LoudnessBalanceParam bq;
    @c(a = "shootFrom")
    public String br;
    @c(a = "save_draft_app_version")
    public long bs;
    @c(a = "is_west_window_exist_str")
    public String bt;
    @c(a = "qa_video_model")
    public QaStruct bu;
    @c(a = "tag_user_list")
    public ArrayList<InteractionTagUserInfo> bv;
    @c(a = "auto_attached_anchor")
    public com.ss.android.ugc.aweme.common.a bw;
    @c(a = "open_platform_extra")
    public String bx;
    @c(a = "open_platform_client_key")
    public String by;
    @c(a = "is_audio_enhance")
    public boolean bz;
    @c(a = "creationId")

    /* renamed from: c  reason: collision with root package name */
    public String f83169c;
    @c(a = "shootWay")

    /* renamed from: d  reason: collision with root package name */
    public String f83170d;
    @c(a = "draftId")

    /* renamed from: e  reason: collision with root package name */
    public int f83171e;
    @c(a = "newDraftId")

    /* renamed from: f  reason: collision with root package name */
    public String f83172f;
    @c(a = "isMultiVideo")

    /* renamed from: g  reason: collision with root package name */
    public boolean f83173g;
    @c(a = "durationMode")

    /* renamed from: h  reason: collision with root package name */
    public boolean f83174h;
    @c(a = "recordMode")

    /* renamed from: i  reason: collision with root package name */
    public int f83175i;
    @c(a = "gameScore")

    /* renamed from: j  reason: collision with root package name */
    public int f83176j;
    @c(a = "reactionParams")

    /* renamed from: k  reason: collision with root package name */
    public ReactionParams f83177k;
    @c(a = "microAppId")

    /* renamed from: l  reason: collision with root package name */
    public String f83178l;
    @c(a = "isMuted")

    /* renamed from: m  reason: collision with root package name */
    public boolean f83179m;
    @c(a = "musicOrigin")
    public String n;
    @c(a = "mainBusinessData")
    public String o;
    @c(a = "socialData")
    public String p;
    @c(a = "commerceData")
    public String q;
    @c(a = "ugData")
    public String r;
    @c(a = "techData")
    public String s;
    @c(a = "globalData")
    public String t;
    @c(a = "extractFramesModel")
    public ExtractFramesModel u;
    @c(a = "filterId")
    public String v;
    @c(a = "record_filter_ids")
    public String w;
    @c(a = "record_filter_names")
    public String x;
    @c(a = "record_filter_values")
    public String y;
    @c(a = "record_beauty_mob_param")
    public BeautyMobParam z;

    static {
        Covode.recordClassIndex(51868);
    }

    public b() {
        this(null, null, null, null, null, false, false, null, false, null, null, null, false, null, null, -1, -1, -1, -1, 2047, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f83167a == bVar.f83167a && this.f83168b == bVar.f83168b && l.a(this.f83169c, bVar.f83169c) && l.a(this.f83170d, bVar.f83170d) && this.f83171e == bVar.f83171e && l.a(this.f83172f, bVar.f83172f) && this.f83173g == bVar.f83173g && this.f83174h == bVar.f83174h && this.f83175i == bVar.f83175i && this.f83176j == bVar.f83176j && l.a(this.f83177k, bVar.f83177k) && l.a(this.f83178l, bVar.f83178l) && this.f83179m == bVar.f83179m && l.a(this.n, bVar.n) && l.a(this.o, bVar.o) && l.a(this.p, bVar.p) && l.a(this.q, bVar.q) && l.a(this.r, bVar.r) && l.a(this.s, bVar.s) && l.a(this.t, bVar.t) && l.a(this.u, bVar.u) && l.a(this.v, bVar.v) && l.a(this.w, bVar.w) && l.a(this.x, bVar.x) && l.a(this.y, bVar.y) && l.a(this.z, bVar.z) && l.a(this.A, bVar.A) && l.a(this.B, bVar.B) && l.a(this.C, bVar.C) && l.a(this.D, bVar.D) && l.a(this.E, bVar.E) && l.a(this.F, bVar.F) && this.G == bVar.G && l.a(this.H, bVar.H) && this.I == bVar.I && this.J == bVar.J && l.a(this.K, bVar.K) && l.a(this.L, bVar.L) && l.a(this.M, bVar.M) && l.a(this.N, bVar.N) && l.a(this.O, bVar.O) && l.a(this.P, bVar.P) && this.Q == bVar.Q && l.a(this.R, bVar.R) && l.a(this.S, bVar.S) && l.a(this.T, bVar.T) && l.a(this.U, bVar.U) && this.V == bVar.V && this.W == bVar.W && this.X == bVar.X && this.Y == bVar.Y && this.Z == bVar.Z && l.a(this.aa, bVar.aa) && l.a(this.ab, bVar.ab) && l.a(this.ac, bVar.ac) && l.a(this.ad, bVar.ad) && this.ae == bVar.ae && l.a(this.af, bVar.af) && l.a(this.ag, bVar.ag) && l.a(this.ah, bVar.ah) && l.a(this.ai, bVar.ai) && l.a(this.aj, bVar.aj) && this.ak == bVar.ak && l.a(this.al, bVar.al) && l.a(this.am, bVar.am) && l.a(this.an, bVar.an) && l.a(this.ao, bVar.ao) && l.a(this.ap, bVar.ap) && this.aq == bVar.aq && this.ar == bVar.ar && Float.compare(this.as, bVar.as) == 0 && l.a(this.at, bVar.at) && this.au == bVar.au && this.av == bVar.av && this.aw == bVar.aw && l.a(this.ax, bVar.ax) && this.ay == bVar.ay && l.a(this.az, bVar.az) && l.a(this.aA, bVar.aA) && l.a(this.aB, bVar.aB) && l.a(this.aC, bVar.aC) && l.a(this.aD, bVar.aD) && this.aE == bVar.aE && this.aF == bVar.aF && this.aG == bVar.aG && this.aH == bVar.aH && l.a(this.aI, bVar.aI) && l.a(this.aJ, bVar.aJ) && this.aK == bVar.aK && l.a(this.aL, bVar.aL) && l.a(this.aM, bVar.aM) && this.aN == bVar.aN && this.aO == bVar.aO && l.a(this.aP, bVar.aP) && l.a(this.aQ, bVar.aQ) && l.a(this.aR, bVar.aR) && l.a(this.aS, bVar.aS) && l.a(this.aT, bVar.aT) && l.a(this.aU, bVar.aU) && this.aV == bVar.aV && l.a(this.aW, bVar.aW) && l.a(this.aX, bVar.aX) && this.aY == bVar.aY && this.aZ == bVar.aZ && this.ba == bVar.ba && this.bb == bVar.bb && this.bc == bVar.bc && Float.compare(this.bd, bVar.bd) == 0 && l.a(this.be, bVar.be) && l.a(this.bf, bVar.bf) && l.a(this.bg, bVar.bg) && this.bh == bVar.bh && this.bi == bVar.bi && this.bj == bVar.bj && this.bk == bVar.bk && l.a(this.bl, bVar.bl) && l.a(this.bm, bVar.bm) && l.a(this.bn, bVar.bn) && l.a(this.bo, bVar.bo) && l.a(this.bp, bVar.bp) && l.a(this.bq, bVar.bq) && l.a(this.br, bVar.br) && this.bs == bVar.bs && l.a(this.bt, bVar.bt) && l.a(this.bu, bVar.bu) && l.a(this.bv, bVar.bv) && l.a(this.bw, bVar.bw) && l.a(this.bx, bVar.bx) && l.a(this.by, bVar.by) && this.bz == bVar.bz && this.bA == bVar.bA && l.a(this.bB, bVar.bB) && this.bC == bVar.bC && l.a(this.bD, bVar.bD) && l.a(this.bE, bVar.bE) && l.a(this.bF, bVar.bF) && this.bG == bVar.bG && l.a(this.bH, bVar.bH) && l.a(this.bI, bVar.bI);
    }

    public final String toString() {
        return "AVDraftExtras(shootMode=" + this.f83167a + ", from=" + this.f83168b + ", creationId=" + this.f83169c + ", shootWay=" + this.f83170d + ", draftId=" + this.f83171e + ", newDraftId=" + this.f83172f + ", isMultiVideo=" + this.f83173g + ", durationMode=" + this.f83174h + ", recordMode=" + this.f83175i + ", gameScore=" + this.f83176j + ", reactionParams=" + this.f83177k + ", microAppId=" + this.f83178l + ", isMuted=" + this.f83179m + ", musicOrigin=" + this.n + ", mainBusinessData=" + this.o + ", socialData=" + this.p + ", commerceData=" + this.q + ", ugData=" + this.r + ", techData=" + this.s + ", globalData=" + this.t + ", extractFramesModel=" + this.u + ", filterId=" + this.v + ", recordFilterIds=" + this.w + ", recordFilterNames=" + this.x + ", recordFilterValues=" + this.y + ", recordBeautyMobParam=" + this.z + ", selectedFilterId=" + this.A + ", selectedFilterLabel=" + this.B + ", selectedFilterValue=" + this.C + ", uploadSaveModel=" + this.D + ", infoStickerModel=" + this.E + ", microAppInfo=" + this.F + ", videoType=" + this.G + ", texts=" + this.H + ", usePaint=" + this.I + ", commentSetting=" + this.J + ", socialModel=" + this.K + ", firstStickerMusicIds=" + this.L + ", mvCreateVideoData=" + this.M + ", statusCreateVideoData=" + this.N + ", creativeFlowData=" + this.O + ", avUploadMiscInfoStruct=" + this.P + ", isFastImport=" + this.Q + ", fastImportResolution=" + this.R + ", draftVideoPath=" + this.S + ", videoCoverPath=" + this.T + ", draftCherEffectParam=" + this.U + ", videoOutWidth=" + this.V + ", videoOutHeight=" + this.W + ", videoCanvasWidth=" + this.X + ", videoCanvasHeight=" + this.Y + ", musicEnd=" + this.Z + ", draftVEAudioEffectParam=" + this.aa + ", timeEffectStartPoint=" + this.ab + ", filterLocalPath=" + this.ac + ", cameraIds=" + this.ad + ", beautyType=" + this.ae + ", importVideoInfos=" + this.af + ", stickerChallenge=" + this.ag + ", textStickerChallenges=" + this.ah + ", videoPartMetadata=" + this.ai + ", audioRecorderParam=" + this.aj + ", isStickPointMode=" + this.ak + ", uploadPath=" + this.al + ", previewConfigure=" + this.am + ", videoSegmentsCopy=" + this.an + ", previewInfo=" + this.ao + ", previewVideoListCopy=" + this.ap + ", videoCount=" + this.aq + ", photoCount=" + this.ar + ", filterIntensity=" + this.as + ", pic2VideoSource=" + this.at + ", downloadSetting=" + this.au + ", useMusicBeforeEdit=" + this.av + ", supportRetake=" + this.aw + ", multiEditVideoData=" + this.ax + ", containBackgroundVideo=" + this.ay + ", stickPointData=" + this.az + ", backgroundVideoDraftDir=" + this.aA + ", stickerInfo=" + this.aB + ", commentVideoModel=" + this.aC + ", beautyMetadata=" + this.aD + ", isUpdateInfoStickers=" + this.aE + ", autoEnhanceOn=" + this.aF + ", autoEnhanceType=" + this.aG + ", stickPointType=" + this.aH + ", duetLayout=" + this.aI + ", stitchParams=" + this.aJ + ", commerceMusic=" + this.aK + ", greenScreenMaterials=" + this.aL + ", cameraLensInfo=" + this.aM + ", isPhotoMvMode=" + this.aN + ", isDuetGreenSrceen=" + this.aO + ", isSoundLoop=" + this.aP + ", cutSameData=" + this.aQ + ", coverPublishModel=" + this.aR + ", geoFencingData=" + this.aS + ", excludeUserList=" + this.aT + ", shoutOutsData=" + this.aU + ", allowRecommend=" + this.aV + ", sharedARModel=" + this.aW + ", messageBubbleTexts=" + this.aX + ", isPhotoMvMusic=" + this.aY + ", isPhotoMvMode1080p=" + this.aZ + ", isDraftMusicIllegal=" + this.ba + ", publishStage=" + this.bb + ", audioAecDelayTime=" + this.bc + ", currentZoomValue=" + this.bd + ", multiEditVideoSize=" + this.be + ", mentionTextList=" + this.bf + ", hashTagTextList=" + this.bg + ", shootedShootMode=" + this.bh + ", duetFromDuetSticker=" + this.bi + ", duetFromDuetButton=" + this.bj + ", enableAutoCaption=" + this.bk + ", duetExtraInfo=" + this.bl + ", recordBgmDelay=" + this.bm + ", selectedFilterResId=" + this.bn + ", canvasVideoData=" + this.bo + ", lighteningExtraInfo=" + this.bp + ", loudnessParam=" + this.bq + ", shootFrom=" + this.br + ", saveDraftAppVersion=" + this.bs + ", isWestWindowExistStr=" + this.bt + ", qaStruct=" + this.bu + ", tagUserList=" + this.bv + ", autoAttachedAnchor=" + this.bw + ", openplatformExtra=" + this.bx + ", openplatformClientKey=" + this.by + ", isAudioEnhance=" + this.bz + ", editMusicSyncMode=" + this.bA + ", cut2EditTransferModel=" + this.bB + ", fileLengthFixed=" + this.bC + ", sessionId=" + this.bD + ", storyUploadModel=" + this.bE + ", lastOutputVideoPath=" + this.bF + ", isStoryDraft=" + this.bG + ", fromItemId=" + this.bH + ", uploadMethod=" + this.bI + ")";
    }

    private b(String str, String str2, String str3, String str4, String str5, Integer num, String str6, g gVar, List<DraftVideoSegment> list, EditPreviewInfo editPreviewInfo, List<? extends EditVideoSegment> list2, int i2, int i3, float f2, String str7, int i4, boolean z2, boolean z3, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z4, a aVar, String str8, StickerInfo stickerInfo, CommentVideoModel commentVideoModel, ArrayList<BeautyMetadata> arrayList, boolean z5, boolean z6, int i5, int i6, String str9, StitchParams stitchParams, boolean z7, ArrayList<GreenScreenMaterial> arrayList2, ArrayList<String> arrayList3, boolean z8, boolean z9, String str10, CutSameEditData cutSameEditData, CoverPublishModel coverPublishModel, List<String> list3, List<? extends User> list4, com.ss.android.ugc.aweme.shoutouts.d dVar, int i7, SharedARModel sharedARModel, List<String> list5, boolean z10, boolean z11, boolean z12, int i8, long j2, float f3, Map<String, Long> map, List<String> list6, List<String> list7, int i9, int i10, int i11, int i12, DuetExtraInfo duetExtraInfo, Integer num2, String str11, CanvasVideoData canvasVideoData, LighteningExtraInfo lighteningExtraInfo, LoudnessBalanceParam loudnessBalanceParam, String str12, long j3, String str13, QaStruct qaStruct, ArrayList<InteractionTagUserInfo> arrayList4, com.ss.android.ugc.aweme.common.a aVar2, String str14, String str15, boolean z13, boolean z14, Cut2EditTransferModel cut2EditTransferModel, boolean z15, String str16, TTStoryUploadModel tTStoryUploadModel, String str17, boolean z16, String str18, String str19) {
        l.d(str3, "");
        l.d(str7, "");
        l.d(duetExtraInfo, "");
        l.d(str13, "");
        this.f83167a = 0;
        this.f83168b = 3;
        this.f83169c = str;
        this.f83170d = str2;
        this.f83171e = 0;
        this.f83172f = str3;
        this.f83173g = false;
        this.f83174h = false;
        this.f83175i = 0;
        this.f83176j = 0;
        this.f83177k = null;
        this.f83178l = null;
        this.f83179m = false;
        this.n = str4;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = 0;
        this.H = null;
        this.I = false;
        this.J = 0;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.R = str5;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = null;
        this.ab = num;
        this.ac = null;
        this.ad = null;
        this.ae = -1;
        this.af = null;
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = false;
        this.al = null;
        this.am = null;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.aq = 0;
        this.ar = 0;
        this.as = -1.0f;
        this.at = str7;
        this.au = 0;
        this.av = false;
        this.aw = true;
        this.ax = null;
        this.ay = false;
        this.az = null;
        this.aA = null;
        this.aB = null;
        this.aC = null;
        this.aD = null;
        this.aE = true;
        this.aF = false;
        this.aG = 0;
        this.aH = 0;
        this.aI = null;
        this.aJ = null;
        this.aK = false;
        this.aL = null;
        this.aM = null;
        this.aN = false;
        this.aO = false;
        this.aP = null;
        this.aQ = null;
        this.aR = null;
        this.aS = null;
        this.aT = null;
        this.aU = null;
        this.aV = 0;
        this.aW = null;
        this.aX = null;
        this.aY = false;
        this.aZ = false;
        this.ba = false;
        this.bb = 0;
        this.bc = 0;
        this.bd = -1.0f;
        this.be = null;
        this.bf = null;
        this.bg = null;
        this.bh = -1;
        this.bi = 0;
        this.bj = 0;
        this.bk = 0;
        this.bl = duetExtraInfo;
        this.bm = num2;
        this.bn = null;
        this.bo = null;
        this.bp = null;
        this.bq = loudnessBalanceParam;
        this.br = str12;
        this.bs = 0;
        this.bt = str13;
        this.bu = null;
        this.bv = null;
        this.bw = null;
        this.bx = str14;
        this.by = str15;
        this.bz = false;
        this.bA = false;
        this.bB = null;
        this.bC = false;
        this.bD = null;
        this.bE = null;
        this.bF = null;
        this.bG = false;
        this.bH = str18;
        this.bI = str19;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        int i68;
        int i69;
        int i70;
        int i71;
        int i72;
        int i73;
        int i74;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        int i86;
        int i87;
        int i88;
        int i89;
        int i90;
        int i91 = ((this.f83167a * 31) + this.f83168b) * 31;
        String str = this.f83169c;
        int i92 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i93 = (i91 + i2) * 31;
        String str2 = this.f83170d;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i94 = (((i93 + i3) * 31) + this.f83171e) * 31;
        String str3 = this.f83172f;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i95 = (i94 + i4) * 31;
        boolean z2 = this.f83173g;
        int i96 = 1;
        if (z2) {
            z2 = true;
        }
        int i97 = z2 ? 1 : 0;
        int i98 = z2 ? 1 : 0;
        int i99 = z2 ? 1 : 0;
        int i100 = (i95 + i97) * 31;
        boolean z3 = this.f83174h;
        if (z3) {
            z3 = true;
        }
        int i101 = z3 ? 1 : 0;
        int i102 = z3 ? 1 : 0;
        int i103 = z3 ? 1 : 0;
        int i104 = (((((i100 + i101) * 31) + this.f83175i) * 31) + this.f83176j) * 31;
        ReactionParams reactionParams = this.f83177k;
        if (reactionParams != null) {
            i5 = reactionParams.hashCode();
        } else {
            i5 = 0;
        }
        int i105 = (i104 + i5) * 31;
        String str4 = this.f83178l;
        if (str4 != null) {
            i6 = str4.hashCode();
        } else {
            i6 = 0;
        }
        int i106 = (i105 + i6) * 31;
        boolean z4 = this.f83179m;
        if (z4) {
            z4 = true;
        }
        int i107 = z4 ? 1 : 0;
        int i108 = z4 ? 1 : 0;
        int i109 = z4 ? 1 : 0;
        int i110 = (i106 + i107) * 31;
        String str5 = this.n;
        if (str5 != null) {
            i7 = str5.hashCode();
        } else {
            i7 = 0;
        }
        int i111 = (i110 + i7) * 31;
        String str6 = this.o;
        if (str6 != null) {
            i8 = str6.hashCode();
        } else {
            i8 = 0;
        }
        int i112 = (i111 + i8) * 31;
        String str7 = this.p;
        if (str7 != null) {
            i9 = str7.hashCode();
        } else {
            i9 = 0;
        }
        int i113 = (i112 + i9) * 31;
        String str8 = this.q;
        if (str8 != null) {
            i10 = str8.hashCode();
        } else {
            i10 = 0;
        }
        int i114 = (i113 + i10) * 31;
        String str9 = this.r;
        if (str9 != null) {
            i11 = str9.hashCode();
        } else {
            i11 = 0;
        }
        int i115 = (i114 + i11) * 31;
        String str10 = this.s;
        if (str10 != null) {
            i12 = str10.hashCode();
        } else {
            i12 = 0;
        }
        int i116 = (i115 + i12) * 31;
        String str11 = this.t;
        if (str11 != null) {
            i13 = str11.hashCode();
        } else {
            i13 = 0;
        }
        int i117 = (i116 + i13) * 31;
        ExtractFramesModel extractFramesModel = this.u;
        if (extractFramesModel != null) {
            i14 = extractFramesModel.hashCode();
        } else {
            i14 = 0;
        }
        int i118 = (i117 + i14) * 31;
        String str12 = this.v;
        if (str12 != null) {
            i15 = str12.hashCode();
        } else {
            i15 = 0;
        }
        int i119 = (i118 + i15) * 31;
        String str13 = this.w;
        if (str13 != null) {
            i16 = str13.hashCode();
        } else {
            i16 = 0;
        }
        int i120 = (i119 + i16) * 31;
        String str14 = this.x;
        if (str14 != null) {
            i17 = str14.hashCode();
        } else {
            i17 = 0;
        }
        int i121 = (i120 + i17) * 31;
        String str15 = this.y;
        if (str15 != null) {
            i18 = str15.hashCode();
        } else {
            i18 = 0;
        }
        int i122 = (i121 + i18) * 31;
        BeautyMobParam beautyMobParam = this.z;
        if (beautyMobParam != null) {
            i19 = beautyMobParam.hashCode();
        } else {
            i19 = 0;
        }
        int i123 = (i122 + i19) * 31;
        String str16 = this.A;
        if (str16 != null) {
            i20 = str16.hashCode();
        } else {
            i20 = 0;
        }
        int i124 = (i123 + i20) * 31;
        String str17 = this.B;
        if (str17 != null) {
            i21 = str17.hashCode();
        } else {
            i21 = 0;
        }
        int i125 = (i124 + i21) * 31;
        String str18 = this.C;
        if (str18 != null) {
            i22 = str18.hashCode();
        } else {
            i22 = 0;
        }
        int i126 = (i125 + i22) * 31;
        AVUploadSaveModel aVUploadSaveModel = this.D;
        if (aVUploadSaveModel != null) {
            i23 = aVUploadSaveModel.hashCode();
        } else {
            i23 = 0;
        }
        int i127 = (i126 + i23) * 31;
        InfoStickerModel infoStickerModel = this.E;
        if (infoStickerModel != null) {
            i24 = infoStickerModel.hashCode();
        } else {
            i24 = 0;
        }
        int i128 = (i127 + i24) * 31;
        t tVar = this.F;
        if (tVar != null) {
            i25 = tVar.hashCode();
        } else {
            i25 = 0;
        }
        int i129 = (((i128 + i25) * 31) + this.G) * 31;
        List<String> list = this.H;
        if (list != null) {
            i26 = list.hashCode();
        } else {
            i26 = 0;
        }
        int i130 = (i129 + i26) * 31;
        boolean z5 = this.I;
        if (z5) {
            z5 = true;
        }
        int i131 = z5 ? 1 : 0;
        int i132 = z5 ? 1 : 0;
        int i133 = z5 ? 1 : 0;
        int i134 = (((i130 + i131) * 31) + this.J) * 31;
        SocialModel socialModel = this.K;
        if (socialModel != null) {
            i27 = socialModel.hashCode();
        } else {
            i27 = 0;
        }
        int i135 = (i134 + i27) * 31;
        String str19 = this.L;
        if (str19 != null) {
            i28 = str19.hashCode();
        } else {
            i28 = 0;
        }
        int i136 = (i135 + i28) * 31;
        d dVar = this.M;
        if (dVar != null) {
            i29 = dVar.hashCode();
        } else {
            i29 = 0;
        }
        int i137 = (i136 + i29) * 31;
        StatusCreateVideoData statusCreateVideoData = this.N;
        if (statusCreateVideoData != null) {
            i30 = statusCreateVideoData.hashCode();
        } else {
            i30 = 0;
        }
        int i138 = (i137 + i30) * 31;
        CreativeFlowData creativeFlowData = this.O;
        if (creativeFlowData != null) {
            i31 = creativeFlowData.hashCode();
        } else {
            i31 = 0;
        }
        int i139 = (i138 + i31) * 31;
        i iVar = this.P;
        if (iVar != null) {
            i32 = iVar.hashCode();
        } else {
            i32 = 0;
        }
        int i140 = (i139 + i32) * 31;
        boolean z6 = this.Q;
        if (z6) {
            z6 = true;
        }
        int i141 = z6 ? 1 : 0;
        int i142 = z6 ? 1 : 0;
        int i143 = z6 ? 1 : 0;
        int i144 = (i140 + i141) * 31;
        String str20 = this.R;
        if (str20 != null) {
            i33 = str20.hashCode();
        } else {
            i33 = 0;
        }
        int i145 = (i144 + i33) * 31;
        String str21 = this.S;
        if (str21 != null) {
            i34 = str21.hashCode();
        } else {
            i34 = 0;
        }
        int i146 = (i145 + i34) * 31;
        String str22 = this.T;
        if (str22 != null) {
            i35 = str22.hashCode();
        } else {
            i35 = 0;
        }
        int i147 = (i146 + i35) * 31;
        e eVar = this.U;
        if (eVar != null) {
            i36 = eVar.hashCode();
        } else {
            i36 = 0;
        }
        int i148 = (((((((((((i147 + i36) * 31) + this.V) * 31) + this.W) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31;
        i iVar2 = this.aa;
        if (iVar2 != null) {
            i37 = iVar2.hashCode();
        } else {
            i37 = 0;
        }
        int i149 = (i148 + i37) * 31;
        Integer num = this.ab;
        if (num != null) {
            i38 = num.hashCode();
        } else {
            i38 = 0;
        }
        int i150 = (i149 + i38) * 31;
        String str23 = this.ac;
        if (str23 != null) {
            i39 = str23.hashCode();
        } else {
            i39 = 0;
        }
        int i151 = (i150 + i39) * 31;
        String str24 = this.ad;
        if (str24 != null) {
            i40 = str24.hashCode();
        } else {
            i40 = 0;
        }
        int i152 = (((i151 + i40) * 31) + this.ae) * 31;
        ArrayList<ImportVideoInfo> arrayList = this.af;
        if (arrayList != null) {
            i41 = arrayList.hashCode();
        } else {
            i41 = 0;
        }
        int i153 = (i152 + i41) * 31;
        StickerChallenge stickerChallenge = this.ag;
        if (stickerChallenge != null) {
            i42 = stickerChallenge.hashCode();
        } else {
            i42 = 0;
        }
        int i154 = (i153 + i42) * 31;
        TextStickerChallenges textStickerChallenges = this.ah;
        if (textStickerChallenges != null) {
            i43 = textStickerChallenges.hashCode();
        } else {
            i43 = 0;
        }
        int i155 = (i154 + i43) * 31;
        Map<String, ? extends Object> map = this.ai;
        if (map != null) {
            i44 = map.hashCode();
        } else {
            i44 = 0;
        }
        int i156 = (i155 + i44) * 31;
        AudioRecorderParam audioRecorderParam = this.aj;
        if (audioRecorderParam != null) {
            i45 = audioRecorderParam.hashCode();
        } else {
            i45 = 0;
        }
        int i157 = (i156 + i45) * 31;
        boolean z7 = this.ak;
        if (z7) {
            z7 = true;
        }
        int i158 = z7 ? 1 : 0;
        int i159 = z7 ? 1 : 0;
        int i160 = z7 ? 1 : 0;
        int i161 = (i157 + i158) * 31;
        String str25 = this.al;
        if (str25 != null) {
            i46 = str25.hashCode();
        } else {
            i46 = 0;
        }
        int i162 = (i161 + i46) * 31;
        g gVar = this.am;
        if (gVar != null) {
            i47 = gVar.hashCode();
        } else {
            i47 = 0;
        }
        int i163 = (i162 + i47) * 31;
        List<DraftVideoSegment> list2 = this.an;
        if (list2 != null) {
            i48 = list2.hashCode();
        } else {
            i48 = 0;
        }
        int i164 = (i163 + i48) * 31;
        EditPreviewInfo editPreviewInfo = this.ao;
        if (editPreviewInfo != null) {
            i49 = editPreviewInfo.hashCode();
        } else {
            i49 = 0;
        }
        int i165 = (i164 + i49) * 31;
        List<? extends EditVideoSegment> list3 = this.ap;
        if (list3 != null) {
            i50 = list3.hashCode();
        } else {
            i50 = 0;
        }
        int floatToIntBits = (((((((i165 + i50) * 31) + this.aq) * 31) + this.ar) * 31) + Float.floatToIntBits(this.as)) * 31;
        String str26 = this.at;
        if (str26 != null) {
            i51 = str26.hashCode();
        } else {
            i51 = 0;
        }
        int i166 = (((floatToIntBits + i51) * 31) + this.au) * 31;
        boolean z8 = this.av;
        if (z8) {
            z8 = true;
        }
        int i167 = z8 ? 1 : 0;
        int i168 = z8 ? 1 : 0;
        int i169 = z8 ? 1 : 0;
        int i170 = (i166 + i167) * 31;
        boolean z9 = this.aw;
        if (z9) {
            z9 = true;
        }
        int i171 = z9 ? 1 : 0;
        int i172 = z9 ? 1 : 0;
        int i173 = z9 ? 1 : 0;
        int i174 = (i170 + i171) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.ax;
        if (multiEditVideoStatusRecordData != null) {
            i52 = multiEditVideoStatusRecordData.hashCode();
        } else {
            i52 = 0;
        }
        int i175 = (i174 + i52) * 31;
        boolean z10 = this.ay;
        if (z10) {
            z10 = true;
        }
        int i176 = z10 ? 1 : 0;
        int i177 = z10 ? 1 : 0;
        int i178 = z10 ? 1 : 0;
        int i179 = (i175 + i176) * 31;
        a aVar = this.az;
        if (aVar != null) {
            i53 = aVar.hashCode();
        } else {
            i53 = 0;
        }
        int i180 = (i179 + i53) * 31;
        String str27 = this.aA;
        if (str27 != null) {
            i54 = str27.hashCode();
        } else {
            i54 = 0;
        }
        int i181 = (i180 + i54) * 31;
        StickerInfo stickerInfo = this.aB;
        if (stickerInfo != null) {
            i55 = stickerInfo.hashCode();
        } else {
            i55 = 0;
        }
        int i182 = (i181 + i55) * 31;
        CommentVideoModel commentVideoModel = this.aC;
        if (commentVideoModel != null) {
            i56 = commentVideoModel.hashCode();
        } else {
            i56 = 0;
        }
        int i183 = (i182 + i56) * 31;
        ArrayList<BeautyMetadata> arrayList2 = this.aD;
        if (arrayList2 != null) {
            i57 = arrayList2.hashCode();
        } else {
            i57 = 0;
        }
        int i184 = (i183 + i57) * 31;
        boolean z11 = this.aE;
        if (z11) {
            z11 = true;
        }
        int i185 = z11 ? 1 : 0;
        int i186 = z11 ? 1 : 0;
        int i187 = z11 ? 1 : 0;
        int i188 = (i184 + i185) * 31;
        boolean z12 = this.aF;
        if (z12) {
            z12 = true;
        }
        int i189 = z12 ? 1 : 0;
        int i190 = z12 ? 1 : 0;
        int i191 = z12 ? 1 : 0;
        int i192 = (((((i188 + i189) * 31) + this.aG) * 31) + this.aH) * 31;
        String str28 = this.aI;
        if (str28 != null) {
            i58 = str28.hashCode();
        } else {
            i58 = 0;
        }
        int i193 = (i192 + i58) * 31;
        StitchParams stitchParams = this.aJ;
        if (stitchParams != null) {
            i59 = stitchParams.hashCode();
        } else {
            i59 = 0;
        }
        int i194 = (i193 + i59) * 31;
        boolean z13 = this.aK;
        if (z13) {
            z13 = true;
        }
        int i195 = z13 ? 1 : 0;
        int i196 = z13 ? 1 : 0;
        int i197 = z13 ? 1 : 0;
        int i198 = (i194 + i195) * 31;
        ArrayList<GreenScreenMaterial> arrayList3 = this.aL;
        if (arrayList3 != null) {
            i60 = arrayList3.hashCode();
        } else {
            i60 = 0;
        }
        int i199 = (i198 + i60) * 31;
        ArrayList<String> arrayList4 = this.aM;
        if (arrayList4 != null) {
            i61 = arrayList4.hashCode();
        } else {
            i61 = 0;
        }
        int i200 = (i199 + i61) * 31;
        boolean z14 = this.aN;
        if (z14) {
            z14 = true;
        }
        int i201 = z14 ? 1 : 0;
        int i202 = z14 ? 1 : 0;
        int i203 = z14 ? 1 : 0;
        int i204 = (i200 + i201) * 31;
        boolean z15 = this.aO;
        if (z15) {
            z15 = true;
        }
        int i205 = z15 ? 1 : 0;
        int i206 = z15 ? 1 : 0;
        int i207 = z15 ? 1 : 0;
        int i208 = (i204 + i205) * 31;
        String str29 = this.aP;
        if (str29 != null) {
            i62 = str29.hashCode();
        } else {
            i62 = 0;
        }
        int i209 = (i208 + i62) * 31;
        CutSameEditData cutSameEditData = this.aQ;
        if (cutSameEditData != null) {
            i63 = cutSameEditData.hashCode();
        } else {
            i63 = 0;
        }
        int i210 = (i209 + i63) * 31;
        CoverPublishModel coverPublishModel = this.aR;
        if (coverPublishModel != null) {
            i64 = coverPublishModel.hashCode();
        } else {
            i64 = 0;
        }
        int i211 = (i210 + i64) * 31;
        List<String> list4 = this.aS;
        if (list4 != null) {
            i65 = list4.hashCode();
        } else {
            i65 = 0;
        }
        int i212 = (i211 + i65) * 31;
        List<? extends User> list5 = this.aT;
        if (list5 != null) {
            i66 = list5.hashCode();
        } else {
            i66 = 0;
        }
        int i213 = (i212 + i66) * 31;
        com.ss.android.ugc.aweme.shoutouts.d dVar2 = this.aU;
        if (dVar2 != null) {
            i67 = dVar2.hashCode();
        } else {
            i67 = 0;
        }
        int i214 = (((i213 + i67) * 31) + this.aV) * 31;
        SharedARModel sharedARModel = this.aW;
        if (sharedARModel != null) {
            i68 = sharedARModel.hashCode();
        } else {
            i68 = 0;
        }
        int i215 = (i214 + i68) * 31;
        List<String> list6 = this.aX;
        if (list6 != null) {
            i69 = list6.hashCode();
        } else {
            i69 = 0;
        }
        int i216 = (i215 + i69) * 31;
        boolean z16 = this.aY;
        if (z16) {
            z16 = true;
        }
        int i217 = z16 ? 1 : 0;
        int i218 = z16 ? 1 : 0;
        int i219 = z16 ? 1 : 0;
        int i220 = (i216 + i217) * 31;
        boolean z17 = this.aZ;
        if (z17) {
            z17 = true;
        }
        int i221 = z17 ? 1 : 0;
        int i222 = z17 ? 1 : 0;
        int i223 = z17 ? 1 : 0;
        int i224 = (i220 + i221) * 31;
        boolean z18 = this.ba;
        if (z18) {
            z18 = true;
        }
        int i225 = z18 ? 1 : 0;
        int i226 = z18 ? 1 : 0;
        int i227 = z18 ? 1 : 0;
        long j2 = this.bc;
        int floatToIntBits2 = (((((((i224 + i225) * 31) + this.bb) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.bd)) * 31;
        Map<String, Long> map2 = this.be;
        if (map2 != null) {
            i70 = map2.hashCode();
        } else {
            i70 = 0;
        }
        int i228 = (floatToIntBits2 + i70) * 31;
        List<String> list7 = this.bf;
        if (list7 != null) {
            i71 = list7.hashCode();
        } else {
            i71 = 0;
        }
        int i229 = (i228 + i71) * 31;
        List<String> list8 = this.bg;
        if (list8 != null) {
            i72 = list8.hashCode();
        } else {
            i72 = 0;
        }
        int i230 = (((((((((i229 + i72) * 31) + this.bh) * 31) + this.bi) * 31) + this.bj) * 31) + this.bk) * 31;
        DuetExtraInfo duetExtraInfo = this.bl;
        if (duetExtraInfo != null) {
            i73 = duetExtraInfo.hashCode();
        } else {
            i73 = 0;
        }
        int i231 = (i230 + i73) * 31;
        Integer num2 = this.bm;
        if (num2 != null) {
            i74 = num2.hashCode();
        } else {
            i74 = 0;
        }
        int i232 = (i231 + i74) * 31;
        String str30 = this.bn;
        if (str30 != null) {
            i75 = str30.hashCode();
        } else {
            i75 = 0;
        }
        int i233 = (i232 + i75) * 31;
        CanvasVideoData canvasVideoData = this.bo;
        if (canvasVideoData != null) {
            i76 = canvasVideoData.hashCode();
        } else {
            i76 = 0;
        }
        int i234 = (i233 + i76) * 31;
        LighteningExtraInfo lighteningExtraInfo = this.bp;
        if (lighteningExtraInfo != null) {
            i77 = lighteningExtraInfo.hashCode();
        } else {
            i77 = 0;
        }
        int i235 = (i234 + i77) * 31;
        LoudnessBalanceParam loudnessBalanceParam = this.bq;
        if (loudnessBalanceParam != null) {
            i78 = loudnessBalanceParam.hashCode();
        } else {
            i78 = 0;
        }
        int i236 = (i235 + i78) * 31;
        String str31 = this.br;
        if (str31 != null) {
            i79 = str31.hashCode();
        } else {
            i79 = 0;
        }
        long j3 = this.bs;
        int i237 = (((i236 + i79) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str32 = this.bt;
        if (str32 != null) {
            i80 = str32.hashCode();
        } else {
            i80 = 0;
        }
        int i238 = (i237 + i80) * 31;
        QaStruct qaStruct = this.bu;
        if (qaStruct != null) {
            i81 = qaStruct.hashCode();
        } else {
            i81 = 0;
        }
        int i239 = (i238 + i81) * 31;
        ArrayList<InteractionTagUserInfo> arrayList5 = this.bv;
        if (arrayList5 != null) {
            i82 = arrayList5.hashCode();
        } else {
            i82 = 0;
        }
        int i240 = (i239 + i82) * 31;
        com.ss.android.ugc.aweme.common.a aVar2 = this.bw;
        if (aVar2 != null) {
            i83 = aVar2.hashCode();
        } else {
            i83 = 0;
        }
        int i241 = (i240 + i83) * 31;
        String str33 = this.bx;
        if (str33 != null) {
            i84 = str33.hashCode();
        } else {
            i84 = 0;
        }
        int i242 = (i241 + i84) * 31;
        String str34 = this.by;
        if (str34 != null) {
            i85 = str34.hashCode();
        } else {
            i85 = 0;
        }
        int i243 = (i242 + i85) * 31;
        boolean z19 = this.bz;
        if (z19) {
            z19 = true;
        }
        int i244 = z19 ? 1 : 0;
        int i245 = z19 ? 1 : 0;
        int i246 = z19 ? 1 : 0;
        int i247 = (i243 + i244) * 31;
        boolean z20 = this.bA;
        if (z20) {
            z20 = true;
        }
        int i248 = z20 ? 1 : 0;
        int i249 = z20 ? 1 : 0;
        int i250 = z20 ? 1 : 0;
        int i251 = (i247 + i248) * 31;
        Cut2EditTransferModel cut2EditTransferModel = this.bB;
        if (cut2EditTransferModel != null) {
            i86 = cut2EditTransferModel.hashCode();
        } else {
            i86 = 0;
        }
        int i252 = (i251 + i86) * 31;
        boolean z21 = this.bC;
        if (z21) {
            z21 = true;
        }
        int i253 = z21 ? 1 : 0;
        int i254 = z21 ? 1 : 0;
        int i255 = z21 ? 1 : 0;
        int i256 = (i252 + i253) * 31;
        String str35 = this.bD;
        if (str35 != null) {
            i87 = str35.hashCode();
        } else {
            i87 = 0;
        }
        int i257 = (i256 + i87) * 31;
        TTStoryUploadModel tTStoryUploadModel = this.bE;
        if (tTStoryUploadModel != null) {
            i88 = tTStoryUploadModel.hashCode();
        } else {
            i88 = 0;
        }
        int i258 = (i257 + i88) * 31;
        String str36 = this.bF;
        if (str36 != null) {
            i89 = str36.hashCode();
        } else {
            i89 = 0;
        }
        int i259 = (i258 + i89) * 31;
        if (!this.bG) {
            i96 = 0;
        }
        int i260 = (i259 + i96) * 31;
        String str37 = this.bH;
        if (str37 != null) {
            i90 = str37.hashCode();
        } else {
            i90 = 0;
        }
        int i261 = (i260 + i90) * 31;
        String str38 = this.bI;
        if (str38 != null) {
            i92 = str38.hashCode();
        }
        return i261 + i92;
    }

    public final void a(DuetExtraInfo duetExtraInfo) {
        l.d(duetExtraInfo, "");
        this.bl = duetExtraInfo;
    }

    public /* synthetic */ b(QaStruct qaStruct, ArrayList arrayList, com.ss.android.ugc.aweme.common.a aVar, String str, String str2, boolean z2, boolean z3, Cut2EditTransferModel cut2EditTransferModel, boolean z4, String str3, TTStoryUploadModel tTStoryUploadModel, String str4, boolean z5, String str5, String str6, int i2, int i3, int i4, int i5, int i6, g gVar) {
        this(UUID.randomUUID().toString(), "", "", "original", "720*1280", 0, null, null, null, null, null, 0, 0, -1.0f, "", 0, false, true, null, false, null, null, null, null, null, true, false, 0, 0, null, null, false, null, null, false, false, null, null, null, null, null, null, 0, null, null, false, false, false, 0, 0, -1.0f, null, null, null, -1, 0, 0, 0, new DuetExtraInfo(null, null, 0, 0, null, 0, 63, null), 0, null, null, null, new LoudnessBalanceParam(0.0d, 0.0d, 0.0d, 7, null), "", 0, "", null, null, null, "", "", false, false, null, false, null, null, null, false, "", "");
    }
}
