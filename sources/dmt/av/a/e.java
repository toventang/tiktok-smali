package dmt.av.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(104077);
    }

    public static final List<EditVideoSegment> a(EditPreviewInfo editPreviewInfo) {
        l.d(editPreviewInfo, "");
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        ArrayList arrayList = new ArrayList();
        for (T t : videoList) {
            if (!com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.b(t.getVideoPath())) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
