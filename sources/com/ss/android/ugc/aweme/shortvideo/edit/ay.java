package com.ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import f.a.d.g;
import h.f.b.l;
import java.io.File;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ay implements g {

    /* renamed from: a  reason: collision with root package name */
    static final g f126937a = new ay();

    static {
        Covode.recordClassIndex(83277);
    }

    private ay() {
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String str = videoPublishEditModel.draftDir() + File.separator;
        String str2 = di.f126462e;
        l.d(str, "");
        l.d(str2, "");
        if (videoPublishEditModel.multiEditVideoRecordData == null) {
            return "success";
        }
        String str3 = videoPublishEditModel.creationId;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData == null) {
            k.a("[copyDirMultiRecordData]: multiEditVideoRecordData is empty");
            return "success";
        } else if (com.ss.android.ugc.tools.utils.k.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            k.a("[copyDirMultiRecordData]: segmentDataList is empty");
            return "success";
        } else {
            k.a("[copyDirMultiRecordData]: start copy srcDir = " + str + " destDir = " + str2);
            com.ss.android.ugc.aweme.draft.g.c(str, str3);
            String a2 = com.ss.android.ugc.aweme.draft.g.a(str, str2);
            com.ss.android.ugc.aweme.draft.g.c(str2, str3);
            k.a("[copyDirMultiRecordData]: end copy srcDir = " + str + " destDir = " + str2 + " ret  = " + a2);
            return a2;
        }
    }
}
