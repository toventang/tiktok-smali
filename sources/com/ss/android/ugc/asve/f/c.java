package com.ss.android.ugc.asve.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.vesdk.ROTATE_DEGREE;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class c {
    static {
        Covode.recordClassIndex(38159);
    }

    public static final ROTATE_DEGREE[] a(EditPreviewInfo editPreviewInfo) {
        ROTATE_DEGREE rotate_degree;
        l.d(editPreviewInfo, "");
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        ArrayList arrayList = new ArrayList(n.a((Iterable) videoList, 10));
        Iterator<T> it = videoList.iterator();
        while (it.hasNext()) {
            VideoCutInfo videoCutInfo = it.next().getVideoCutInfo();
            if (videoCutInfo != null) {
                int rotate = videoCutInfo.getRotate();
                if (rotate == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (rotate == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (rotate != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                if (rotate_degree != null) {
                    arrayList.add(rotate_degree);
                }
            }
            rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
            arrayList.add(rotate_degree);
        }
        Object[] array = arrayList.toArray(new ROTATE_DEGREE[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (ROTATE_DEGREE[]) array;
    }
}
