package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.f.b.l;
import java.util.List;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.draft.model.c f124845a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f124846b;

    static {
        Covode.recordClassIndex(82025);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public final DraftFileSaveResult a() {
        boolean z;
        List<EditVideoSegment> videoList = this.f124846b.getPreviewInfo().getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(2, new DraftFileSaveException(-600, new RuntimeException("model.previewInfo.videoList.isNullOrEmpty()")));
        }
        EditPreviewInfo previewInfo = this.f124846b.getPreviewInfo();
        l.b(previewInfo, "");
        DraftFileSaveException a2 = b.a(previewInfo, this.f124845a);
        if (a2.isSuc()) {
            b.a(this.f124845a);
        }
        return new DraftFileSaveResult(2, a2);
    }

    public c(com.ss.android.ugc.aweme.draft.model.c cVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        this.f124845a = cVar;
        this.f124846b = videoPublishEditModel;
    }
}
