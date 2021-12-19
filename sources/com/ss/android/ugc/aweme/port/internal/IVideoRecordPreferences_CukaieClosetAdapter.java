package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.e;
import com.bytedance.cukaie.closet.internal.a;

public final class IVideoRecordPreferences_CukaieClosetAdapter extends a implements IVideoRecordPreferences {
    static {
        Covode.recordClassIndex(74618);
    }

    public final int getResourcesVersion() {
        return super.getStore().a("resources_version", 0);
    }

    public IVideoRecordPreferences_CukaieClosetAdapter(e eVar) {
        super(eVar);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final int getCountDownMode(int i2) {
        return super.getStore().a("count_down_mode", i2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final String getCreativeToolRootDir(String str) {
        return super.getStore().a("creative_tools_root_path", str);
    }

    public final long getMainPlusClickedTime(long j2) {
        return super.getStore().a("main_plus_clicked_time", j2);
    }

    public final long getMainPlusShowBubbleTime(long j2) {
        return super.getStore().a("main_plus_show_bubble_time", j2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final String getPublishParallelUploadRecoverPath(String str) {
        return super.getStore().a("publish_parallel_uploadRecoverPath", str);
    }

    public final float getUlikeBeautyBlushDefault(float f2) {
        return super.getStore().a("ulikebeauty_blush_default", f2);
    }

    public final float getUlikeBeautyBlushMax(float f2) {
        return super.getStore().a("ulikebeauty_blush_max", f2);
    }

    public final String getUlikeBeautyDownloadData(String str) {
        return super.getStore().a("ulikebeauty_download_data", str);
    }

    public final float getUlikeBeautyEyeMax(float f2) {
        return super.getStore().a("ulikebeauty_eye_max", f2);
    }

    public final float getUlikeBeautyLipDefault(float f2) {
        return super.getStore().a("ulikebeauty_lip_default", f2);
    }

    public final float getUlikeBeautyLipMax(float f2) {
        return super.getStore().a("ulikebeauty_lip_max", f2);
    }

    public final float getUlikeBeautyShapeDefault(float f2) {
        return super.getStore().a("ulikebeauty_shape_default", f2);
    }

    public final float getUlikeBeautyShapeMax(float f2) {
        return super.getStore().a("ulikebeauty_shape_max", f2);
    }

    public final float getUlikeBeautySharpDefault(float f2) {
        return super.getStore().a("ulikebeauty_sharp_default", f2);
    }

    public final float getUlikeBeautySharpMax(float f2) {
        return super.getStore().a("ulikebeauty_sharp_max", f2);
    }

    public final float getUlikeBeautySmoothDefault(float f2) {
        return super.getStore().a("ulikebeauty_smooth_default", f2);
    }

    public final float getUlikeBeautySmoothMax(float f2) {
        return super.getStore().a("ulikebeauty_smooth_max", f2);
    }

    public final float getUlikeEyeDefault(float f2) {
        return super.getStore().a("ulikebeauty_eye_default", f2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final String getUploadRecoverPath(String str) {
        return super.getStore().a("uploadRecoverPath", str);
    }

    public final long getZTLastInsertTime(long j2) {
        return super.getStore().a("ZT_Last_Insert_Time", j2);
    }

    public final boolean isBlessingTagClicked(boolean z) {
        return super.getStore().a("has_click_blessing_tag", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final boolean isDurationModeManuallyChange(boolean z) {
        return super.getStore().a("is_duration_mode_manually_change", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final boolean isFirstEnterRecordPage(boolean z) {
        return super.getStore().a("is_first_enter_record_page", z);
    }

    public final void setBlessingTagClicked(boolean z) {
        super.getStore().b("has_click_blessing_tag", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setCountDownMode(int i2) {
        super.getStore().b("count_down_mode", i2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setCreativeToolRootDir(String str) {
        super.getStore().b("creative_tools_root_path", str);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setDurationModeManuallyChange(boolean z) {
        super.getStore().b("is_duration_mode_manually_change", z);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setFirstEnterRecordPage(boolean z) {
        super.getStore().b("is_first_enter_record_page", z);
    }

    public final void setMainPlusClickedTime(long j2) {
        super.getStore().b("main_plus_clicked_time", j2);
    }

    public final void setMainPlusHasShowBubble(long j2) {
        super.getStore().b("main_plus_show_bubble_time", j2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setPublishParallelUploadRecoverPath(String str) {
        super.getStore().b("publish_parallel_uploadRecoverPath", str);
    }

    public final void setResourcesVersion(int i2) {
        super.getStore().b("resources_version", i2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setShouldShowCountDownNewTag(boolean z) {
        super.getStore().b("count_down_new_tag", z);
    }

    public final void setUlikeBeautyBlushDefault(float f2) {
        super.getStore().b("ulikebeauty_blush_default", f2);
    }

    public final void setUlikeBeautyBlushMax(float f2) {
        super.getStore().b("ulikebeauty_blush_max", f2);
    }

    public final void setUlikeBeautyDownloadData(String str) {
        super.getStore().b("ulikebeauty_download_data", str);
    }

    public final void setUlikeBeautyEyeDefault(float f2) {
        super.getStore().b("ulikebeauty_eye_default", f2);
    }

    public final void setUlikeBeautyEyeMax(float f2) {
        super.getStore().b("ulikebeauty_eye_max", f2);
    }

    public final void setUlikeBeautyLipDefault(float f2) {
        super.getStore().b("ulikebeauty_lip_default", f2);
    }

    public final void setUlikeBeautyLipMax(float f2) {
        super.getStore().b("ulikebeauty_lip_max", f2);
    }

    public final void setUlikeBeautyShapeDefault(float f2) {
        super.getStore().b("ulikebeauty_shape_default", f2);
    }

    public final void setUlikeBeautyShapeMax(float f2) {
        super.getStore().b("ulikebeauty_shape_max", f2);
    }

    public final void setUlikeBeautySharpDefault(float f2) {
        super.getStore().b("ulikebeauty_sharp_default", f2);
    }

    public final void setUlikeBeautySharpMax(float f2) {
        super.getStore().b("ulikebeauty_sharp_max", f2);
    }

    public final void setUlikeBeautySmoothDefault(float f2) {
        super.getStore().b("ulikebeauty_smooth_default", f2);
    }

    public final void setUlikeBeautySmoothMax(float f2) {
        super.getStore().b("ulikebeauty_smooth_max", f2);
    }

    @Override // com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences
    public final void setUploadRecoverPath(String str) {
        super.getStore().b("uploadRecoverPath", str);
    }

    public final void setZTLastInsertTime(long j2) {
        super.getStore().b("ZT_Last_Insert_Time", j2);
    }

    public final boolean shouldShowCountDownNewTag(boolean z) {
        return super.getStore().a("count_down_new_tag", z);
    }
}
