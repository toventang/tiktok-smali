package com.ss.android.ugc.aweme.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.f.a;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;

public interface b {
    static {
        Covode.recordClassIndex(77033);
    }

    AVUploadSaveModel a(VideoPublishEditModel videoPublishEditModel, int i2, boolean z, a aVar);

    void a(VideoPublishEditModel videoPublishEditModel, int i2);
}
