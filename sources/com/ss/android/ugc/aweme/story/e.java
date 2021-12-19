package com.ss.android.ugc.aweme.story;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.c.a;
import com.ss.android.ugc.aweme.c.b;
import com.ss.android.ugc.aweme.c.c;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {
    static {
        Covode.recordClassIndex(89591);
    }

    public static final String a(int i2, EditPreviewInfo editPreviewInfo, ShortVideoContext shortVideoContext) {
        com.ss.android.ugc.aweme.c.e eVar;
        long j2;
        long j3;
        l.d(editPreviewInfo, "");
        l.d(shortVideoContext, "");
        if (i2 == 2) {
            List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
            ArrayList arrayList = new ArrayList(n.a((Iterable) videoList, 10));
            Iterator<T> it = videoList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getVideoPath());
            }
            eVar = new c(arrayList);
        } else {
            EditVideoSegment editVideoSegment = (EditVideoSegment) n.g((List) editPreviewInfo.getVideoList());
            String videoPath = editVideoSegment.getVideoPath();
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                j2 = videoCutInfo.getStart();
            } else {
                j2 = 0;
            }
            VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo2 != null) {
                j3 = videoCutInfo2.getEnd();
            } else {
                j3 = -1;
            }
            eVar = new b(videoPath, j2, j3);
        }
        aa.c k2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b().k();
        String str = shortVideoContext.q;
        l.b(str, "");
        return k2.a(new a(eVar, 0, str, null, false, false, 122));
    }
}
