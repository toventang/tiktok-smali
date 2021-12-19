package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.p;

public interface e {
    static {
        Covode.recordClassIndex(91491);
    }

    p<Integer, String> a(VideoPublishEditModel videoPublishEditModel, int i2);

    public static final class a {
        static {
            Covode.recordClassIndex(91492);
        }

        public static boolean a(VideoPublishEditModel videoPublishEditModel) {
            l.d(videoPublishEditModel, "");
            boolean a2 = i.a(videoPublishEditModel.getOutputFile());
            boolean a3 = i.a(videoPublishEditModel.mParallelUploadOutputFile);
            videoPublishEditModel.getOutputFile();
            if (a2 || a3) {
                return true;
            }
            return false;
        }
    }
}
