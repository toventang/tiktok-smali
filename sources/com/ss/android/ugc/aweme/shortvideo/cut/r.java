package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.List;

public final class r {
    static {
        Covode.recordClassIndex(82371);
    }

    public static final void a(g gVar, List<? extends VideoSegment> list) {
        String str;
        l.d(list, "");
        if (gVar != null) {
            str = gVar.d("LvMetaInfo");
        } else {
            str = null;
        }
        q.d("fillDescription ".concat(String.valueOf(str)));
        for (VideoSegment videoSegment : list) {
            videoSegment.v = str;
        }
    }
}
