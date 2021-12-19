package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.tools.utils.h;
import h.f.b.l;
import h.p;
import h.v;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public final c f124853a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f124854b;

    static {
        Covode.recordClassIndex(82028);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public final DraftFileSaveResult a() {
        boolean z;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        String valueOf;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f124853a.W.ax;
        List<MultiEditVideoSegmentRecordData> list2 = (multiEditVideoStatusRecordData == null || (multiEditVideoRecordData2 = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null) ? null : multiEditVideoRecordData2.segmentDataList;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(6, new DraftFileSaveException(-600, new RuntimeException("draft.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList.isNullOrEmpty")));
        }
        String draftDir = this.f124854b.getPreviewInfo().getDraftDir();
        ArrayList<p> arrayList = new ArrayList();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = this.f124853a.W.ax;
        if (!(multiEditVideoStatusRecordData2 == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            for (T t : list) {
                if (t.enable) {
                    String str = t.videoPath;
                    l.b(str, "");
                    l.d(str, "");
                    l.d(draftDir, "");
                    if (h.m.p.e((CharSequence) str, (CharSequence) draftDir)) {
                        continue;
                    } else {
                        if (!h.b(t.videoPath)) {
                            valueOf = new File(t.videoPath).getName();
                        } else {
                            valueOf = String.valueOf(t.videoPath.hashCode());
                        }
                        String str2 = com.ss.android.ugc.aweme.draft.h.a(draftDir) + valueOf;
                        String str3 = t.videoPath;
                        l.b(str3, "");
                        DraftFileSaveException a2 = com.ss.android.ugc.aweme.draft.h.a(str3, str2, true);
                        if (!a2.isSuc()) {
                            return new DraftFileSaveResult(6, a2);
                        }
                        arrayList.add(v.a(t, str2));
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (p pVar : arrayList) {
                ((MultiEditVideoSegmentRecordData) pVar.getFirst()).videoPath = (String) pVar.getSecond();
                ((MultiEditVideoSegmentRecordData) pVar.getFirst()).draftVideoPath = (String) pVar.getSecond();
            }
            this.f124853a.a(new com.ss.android.ugc.aweme.shortvideo.edit.model.c(true).a(new p<>(this.f124853a.W.ax.curMultiEditVideoRecordData, this.f124854b.getPreviewInfo())));
        }
        return new DraftFileSaveResult(6, null, 2, null);
    }

    public f(c cVar, VideoPublishEditModel videoPublishEditModel) {
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        this.f124853a = cVar;
        this.f124854b = videoPublishEditModel;
    }
}
