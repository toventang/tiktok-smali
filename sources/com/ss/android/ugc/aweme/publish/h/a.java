package com.ss.android.ugc.aweme.publish.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.publish.b;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import h.f.b.l;

final class a implements b {
    static {
        Covode.recordClassIndex(77155);
    }

    @Override // com.ss.android.ugc.aweme.publish.b
    public final void a(VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(videoPublishEditModel, "");
        videoPublishEditModel.setSaveModel(com.ss.android.ugc.aweme.publish.a.a.b.a(videoPublishEditModel.getSaveModel(), i2, false, com.ss.android.ugc.aweme.publish.f.b.f118717a));
    }

    @Override // com.ss.android.ugc.aweme.publish.b
    public final AVUploadSaveModel a(VideoPublishEditModel videoPublishEditModel, int i2, boolean z, com.ss.android.ugc.aweme.publish.f.a aVar) {
        l.d(videoPublishEditModel, "");
        l.d(aVar, "");
        return com.ss.android.ugc.aweme.publish.a.a.b.a(videoPublishEditModel.getSaveModel(), i2, z, aVar);
    }
}
