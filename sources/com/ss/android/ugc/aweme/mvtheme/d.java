package com.ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class d implements Serializable {
    @c(a = "beat_mv_bit_info")
    public a beatMvInfo;
    @c(a = "birthday_bless_mv_param")
    public b birthdayBlessMvParam;
    @c(a = "mv_contact_video_path")
    public String contactVideoPath;
    @c(a = "enable_mv_origin_audio")
    public boolean enableOriginAudio;
    @c(a = "is_beat_mv")
    public boolean isBeatMv;
    @c(a = "is_mv_rs_1080p")
    public boolean isMVRes1080p;
    @c(a = "is_mixed_template")
    public boolean isMixedTemPlate;
    @c(a = "is_new_year_wish")
    public boolean isNewYearWish = false;
    @c(a = "is_red_packet_mv")
    public boolean isRedPacketMv;
    @c(a = "is_slideshow_mode")
    public boolean isSlideshowMode = false;
    @c(a = "is_upload_sticker")
    public boolean isUploadSticker;
    @c(a = "is_use_rgba_mode")
    public boolean isUseRGBAMode;
    @c(a = "ktv_audio_durations")
    public int[] ktvAudioDurations;
    @c(a = "ktv_audio_paths")
    public String[] ktvAudioPaths;
    @c(a = "local_algorithm_materials")
    public ArrayList<String> localAlgorithmMaterials = new ArrayList<>();
    @c(a = "mask_file_data")
    public ArrayList<Object> maskFileData = new ArrayList<>();
    @c(a = "ktv_mode")
    public int mode;
    @c(a = "mv_video_music_ids")
    public List<String> musicIds;
    @c(a = "mv_auto_save_toast")
    public String mvAutoSaveToast;
    @c(a = "mv_durations")
    public ArrayList<Integer> mvDurations;
    @c(a = "mv_id")
    public String mvId;
    @c(a = "mv_video_res_unzippath")
    public String mvResUnzipPath;
    @c(a = "mv_type")
    public int mvType;
    @c(a = "new_mask_file_data")
    public ArrayList<MvNetFileBean> newMaskFileData = new ArrayList<>();
    @c(a = "photo_to_save")
    public ArrayList<String> photoToSave = new ArrayList<>();
    @c(a = "rgba_mode_res_ratio")
    public int resRatio;
    @c(a = "select_media_list")
    public ArrayList<String> selectMediaList = new ArrayList<>();
    @c(a = "source_item_list")
    public ArrayList<e> sourceItemList = new ArrayList<>();
    @c(a = "select_src_media_list")
    public ArrayList<String> srcSelectMediaList = new ArrayList<>();
    @c(a = "select_src_media_types")
    public ArrayList<String> srcSelectMediaListTypes = new ArrayList<>();
    @c(a = "mv_video_cover")
    public String videoCoverImgPath;
    @c(a = "mv_video_cover_starttime")
    public int videoCoverStartTime;
    @c(a = "voice_record_audio_path")
    public String voiceRecordAudioPath;

    static {
        Covode.recordClassIndex(72099);
    }

    public boolean isBirthdayBlessMv() {
        if (this.birthdayBlessMvParam != null) {
            return true;
        }
        return false;
    }

    public boolean isBeatMvValidate() {
        if (!this.isBeatMv || this.beatMvInfo == null) {
            return false;
        }
        return true;
    }

    public int getImageCount() {
        if (!com.ss.android.ugc.tools.utils.d.a(this.selectMediaList)) {
            return this.selectMediaList.size();
        }
        if (!com.ss.android.ugc.tools.utils.d.a(this.sourceItemList)) {
            return this.sourceItemList.size();
        }
        return 0;
    }
}
