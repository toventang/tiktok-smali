package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.extract.a.e;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.p;
import h.v;

public final class h implements e {
    static {
        Covode.recordClassIndex(91495);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a.e
    public final p<Integer, String> a(VideoPublishEditModel videoPublishEditModel, int i2) {
        String str;
        l.d(videoPublishEditModel, "");
        if (ab.f140003a == null) {
            return v.a(1, "");
        }
        j jVar = ab.f140003a;
        if (jVar != null && !jVar.getCheckVideoFrame()) {
            return v.a(2, "");
        }
        ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
        String str2 = null;
        if (extractFramesModel != null) {
            str = extractFramesModel.getExtractFramesDir();
        } else {
            str = null;
        }
        if (!i.a(str)) {
            StringBuilder sb = new StringBuilder("frame dir:");
            ExtractFramesModel extractFramesModel2 = videoPublishEditModel.extractFramesModel;
            if (extractFramesModel2 != null) {
                str2 = extractFramesModel2.getExtractFramesDir();
            }
            return v.a(8, sb.append(str2).toString());
        }
        l.d(videoPublishEditModel, "");
        if (!e.a.a(videoPublishEditModel)) {
            return v.a(3, "output file:" + videoPublishEditModel.mOutputFile);
        }
        return v.a(-2, "");
    }
}
