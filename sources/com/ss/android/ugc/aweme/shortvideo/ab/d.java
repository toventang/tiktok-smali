package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.f.b.l;
import java.util.List;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final c f124847a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f124848b;

    static {
        Covode.recordClassIndex(82026);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public final DraftFileSaveResult a() {
        DraftFileSaveException draftFileSaveException;
        List<EditVideoSegment> videoList = this.f124848b.getPreviewInfo().getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            return new DraftFileSaveResult(1, new DraftFileSaveException(-600, new RuntimeException("model.previewInfo.videoList.isNullOrEmpty()")));
        }
        List<EditVideoSegment> i2 = com.ss.android.ugc.aweme.draft.model.d.i(this.f124847a);
        if (!this.f124848b.isFastImport || this.f124848b.isMultiVideoEdit() || (i2 != null && !i2.isEmpty())) {
            draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
        } else {
            EditPreviewInfo previewInfo = this.f124848b.getPreviewInfo();
            l.b(previewInfo, "");
            draftFileSaveException = b.a(previewInfo, this.f124847a);
        }
        if (draftFileSaveException.isSuc()) {
            b.a(this.f124847a);
        }
        return new DraftFileSaveResult(1, draftFileSaveException);
    }

    public d(c cVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        this.f124847a = cVar;
        this.f124848b = videoPublishEditModel;
    }
}
