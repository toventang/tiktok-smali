package com.ss.android.ugc.aweme.port.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.a;
import com.bytedance.cukaie.closet.a.b;
import com.bytedance.cukaie.closet.a.c;

@a(a = "VideoRecord")
public interface IVideoRecordPreferences {
    static {
        Covode.recordClassIndex(74617);
    }

    @c(a = "count_down_mode")
    int getCountDownMode(int i2);

    @c(a = "creative_tools_root_path")
    String getCreativeToolRootDir(String str);

    @c(a = "publish_parallel_uploadRecoverPath")
    String getPublishParallelUploadRecoverPath(String str);

    @c(a = "uploadRecoverPath")
    String getUploadRecoverPath(String str);

    @c(a = "is_duration_mode_manually_change")
    boolean isDurationModeManuallyChange(boolean z);

    @c(a = "is_first_enter_record_page")
    boolean isFirstEnterRecordPage(boolean z);

    @b(a = "count_down_mode")
    void setCountDownMode(int i2);

    @b(a = "creative_tools_root_path")
    void setCreativeToolRootDir(String str);

    @b(a = "is_duration_mode_manually_change")
    void setDurationModeManuallyChange(boolean z);

    @b(a = "is_first_enter_record_page")
    void setFirstEnterRecordPage(boolean z);

    @b(a = "publish_parallel_uploadRecoverPath")
    void setPublishParallelUploadRecoverPath(String str);

    @b(a = "count_down_new_tag")
    void setShouldShowCountDownNewTag(boolean z);

    @b(a = "uploadRecoverPath")
    void setUploadRecoverPath(String str);
}
