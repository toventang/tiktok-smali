package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.b;
import com.bytedance.cukaie.closet.a.c;

@com.bytedance.cukaie.closet.a.a(a = "av_settings.xml")
public interface AVPreferences {

    public static final class a {
        static {
            Covode.recordClassIndex(76833);
        }
    }

    static {
        Covode.recordClassIndex(76832);
    }

    @c(a = "back_camera_filter")
    int getBackCameraFilter(int i2);

    @c(a = "back_camera_filter_v2")
    int getBackCameraFilterV2(int i2);

    @c(a = "beautification_mode")
    int getBeautificationMode(int i2);

    @c(a = "setting_bubble_guide_shown")
    boolean getBubbleGuideShown(boolean z);

    @c(a = "camera_position")
    int getCameraPosition(int i2);

    @c(a = "show_combine_shoot_mode_tip")
    boolean getCombinedShootModeTipShown(boolean z);

    @c(a = "disable_filter")
    boolean getDisableFilter(boolean z);

    @c(a = "duration_mode")
    boolean getDurationMode(boolean z);

    @c(a = "show_commerce_unlock_sticker_collect_tips")
    boolean getEnableCommerceUnlockStickerCollectTips(boolean z);

    @c(a = "enable_pre_upload")
    boolean getEnablePreUpload(boolean z);

    @c(a = "enable_pre_upload_by_user")
    boolean getEnablePreUploadByUser(boolean z);

    @c(a = "front_camera_filter")
    int getFrontCameraFilter(int i2);

    @c(a = "front_camera_filter_v2")
    int getFrontCameraFilterV2(int i2);

    @c(a = "male_prob_threshold")
    float getMaleProbThreshold(float f2);

    @c(a = "pre_upload_encryption_mode")
    int getPreUploadEncryptionMode(int i2);

    @c(a = "publish_permission_dialog_friend")
    boolean getPublishPermissionDialogFriend(boolean z);

    @c(a = "publish_permission_dialog_private")
    boolean getPublishPermissionDialogPrivate(boolean z);

    @c(a = "publish_permission_dialog_public_qna")
    boolean getPublishPermissionDialogPublicQNA(boolean z);

    @c(a = "user_changed_setting")
    boolean getReactDuetSettingChanged(boolean z);

    @c(a = "react_duet_setting")
    int getReactDuetSettingCurrent(int i2);

    @c(a = "reaction_tip_show")
    boolean getReactionTipShow(boolean z);

    @c(a = "record_use_success_camera_type")
    int getRecordUseSuccessCameraType(int i2);

    @c(a = "record_use_success_hardware_profile")
    int getRecordUseSuccessRecordProfile(int i2);

    @c(a = "sdk_v4_auth_key")
    String getSdkV4AuthKey(String str);

    @c(a = "speed_panel_open")
    boolean getSpeedPanelOpen(boolean z);

    @c(a = "user_changed_stitch_setting")
    boolean getStitchSettingChanged(boolean z);

    @c(a = "stitch_setting")
    int getStitchSettingCurrent(int i2);

    @c(a = "storage_monitor_local_switch")
    boolean getStorageMonitorLocalSwitch(boolean z);

    @c(a = "ulike_beauty_model_copied")
    boolean getUlikeBeautyCopied(boolean z);

    @c(a = "user_big_eye_level")
    int getUserBigEyeLevel(int i2);

    @c(a = "user_blush_level")
    int getUserBlushLevel(int i2);

    @c(a = "user_lip_level")
    int getUserLipLevel(int i2);

    @c(a = "user_shape_level")
    int getUserShapeLevel(int i2);

    @c(a = "user_smooth_skin_level")
    int getUserSmoothSkinLevel(int i2);

    @c(a = "use_watermark_hardcode")
    boolean getWatermarkHardcode(boolean z);

    @b(a = "back_camera_filter")
    void setBackCameraFilter(int i2);

    @b(a = "back_camera_filter_v2")
    void setBackCameraFilterV2(int i2);

    @b(a = "beautification_mode")
    void setBeautificationMode(int i2);

    @b(a = "setting_bubble_guide_shown")
    void setBubbleGuideShown(boolean z);

    @b(a = "camera_position")
    void setCameraPosition(int i2);

    @b(a = "disable_filter")
    void setDisableFilter(boolean z);

    @b(a = "duration_mode")
    void setDurationMode(boolean z);

    @b(a = "show_commerce_unlock_sticker_collect_tips")
    void setEnableCommerceUnlockStickerCollectTips(boolean z);

    @b(a = "enable_pre_upload")
    void setEnablePreUpload(boolean z);

    @b(a = "enable_pre_upload_by_user")
    void setEnablePreUploadByUser(boolean z);

    @b(a = "front_camera_filter")
    void setFrontCameraFilter(int i2);

    @b(a = "front_camera_filter_v2")
    void setFrontCameraFilterV2(int i2);

    @b(a = "pre_upload_encryption_mode")
    void setPreUploadEncryptionMode(int i2);

    @b(a = "publish_permission_dialog_friend")
    void setPublishPermissionDialogFriend(boolean z);

    @b(a = "publish_permission_dialog_private")
    void setPublishPermissionDialogPrivate(boolean z);

    @b(a = "publish_permission_dialog_public_qna")
    void setPublishPermissionDialogPublicQNA(boolean z);

    @b(a = "user_changed_setting")
    void setReactDuetSettingChanged(boolean z);

    @b(a = "react_duet_setting")
    void setReactDuetSettingCurrent(int i2);

    @b(a = "reaction_tip_show")
    void setReactionTipShow(boolean z);

    @b(a = "record_use_success_camera_type")
    void setRecordUseSuccessCameraType(int i2);

    @b(a = "record_use_success_hardware_profile")
    void setRecordUseSuccessRecordProfile(int i2);

    @b(a = "sdk_v4_auth_key")
    void setSdkV4AuthKey(String str);

    @b(a = "speed_panel_open")
    void setSpeedPanelOpen(boolean z);

    @b(a = "user_changed_stitch_setting")
    void setStitchSettingChanged(boolean z);

    @b(a = "stitch_setting")
    void setStitchSettingCurrent(int i2);

    @b(a = "storage_monitor_local_switch")
    void setStorageMonitorLocalSwitch(boolean z);

    @b(a = "ulike_beauty_model_copied")
    void setUlikeBeautyCopied(boolean z);

    @b(a = "use_watermark_hardcode")
    void setWatermarkHardcode(boolean z);
}
