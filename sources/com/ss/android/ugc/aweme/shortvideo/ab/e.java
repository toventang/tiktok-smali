package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.h;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.b;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.f.a;
import h.f.b.l;
import h.p;
import java.io.File;
import java.util.List;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final c f124849a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f124850b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f124851c;

    /* renamed from: d  reason: collision with root package name */
    private final Workspace f124852d;

    static {
        Covode.recordClassIndex(82027);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public final DraftFileSaveResult a() {
        boolean z;
        List<MultiEditVideoSegmentRecordData> list = this.f124850b.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(3, new DraftFileSaveException(-600, new RuntimeException("model.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList.isNullOrEmpty()")));
        }
        String str = di.f126462e;
        l.b(str, "");
        String draftDir = this.f124850b.draftDir();
        l.b(draftDir, "");
        DraftFileSaveException a2 = h.a(str, draftDir, null, 6);
        if (a2.isSuc()) {
            String str2 = di.f126462e;
            l.b(str2, "");
            d.a(str2, this.f124850b.draftDir() + File.separator, this.f124849a.W.ax);
            c cVar = this.f124849a;
            com.ss.android.ugc.aweme.shortvideo.edit.model.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.edit.model.c(false);
            MultiEditVideoRecordData multiEditVideoRecordData = cVar.W.ax.curMultiEditVideoRecordData;
            l.b(multiEditVideoRecordData, "");
            EditPreviewInfo editPreviewInfo = cVar.W.ao;
            if (editPreviewInfo == null) {
                l.b();
            }
            cVar.a(cVar2.a(new p<>(multiEditVideoRecordData, editPreviewInfo)));
            a.a();
            b.a(this.f124852d, this.f124851c);
            b.a(this.f124849a);
        }
        return new DraftFileSaveResult(3, a2);
    }

    public e(c cVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        this.f124849a = cVar;
        this.f124850b = videoPublishEditModel;
        this.f124851c = z;
        this.f124852d = b.a(videoPublishEditModel);
    }
}
