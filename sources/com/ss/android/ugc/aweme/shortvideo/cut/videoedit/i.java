package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.u;
import com.ss.android.vesdk.VEUtils;
import h.a.ag;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i {

    /* renamed from: a */
    public static final i f126180a = new i();

    public static final ArrayList<VideoSegment> a(List<? extends MediaModel> list) {
        return a(list, false, null, 6);
    }

    private i() {
    }

    static {
        Covode.recordClassIndex(82835);
    }

    public static /* synthetic */ ArrayList a(List list, boolean z, Map map, int i2) {
        VEUtils.VEVideoFileInfo a2;
        int i3 = 0;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            map = ag.a();
        }
        l.d(list, "");
        l.d(map, "");
        ArrayList arrayList = new ArrayList();
        if (h.b(list)) {
            if (list.size() != 1) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    VideoSegment videoSegment = new VideoSegment((MediaModel) it.next());
                    videoSegment.f125477a = i3;
                    arrayList.add(videoSegment);
                    i3++;
                }
            } else if (z || com.ss.android.ugc.tools.utils.h.a((MediaModel) list.get(0))) {
                arrayList.add(new VideoSegment((MediaModel) list.get(0)));
            } else {
                MediaModel mediaModel = (MediaModel) list.get(0);
                VideoSegment videoSegment2 = new VideoSegment(mediaModel);
                if (map.get(mediaModel.f109390b) != null) {
                    a2 = (VEUtils.VEVideoFileInfo) map.get(mediaModel.f109390b);
                } else {
                    String str = mediaModel.f109390b;
                    l.b(str, "");
                    a2 = u.a(str);
                }
                if (a2 != null) {
                    videoSegment2.f125482f = a2.width;
                    videoSegment2.f125483g = a2.height;
                    videoSegment2.f125478b = (long) a2.duration;
                    if (videoSegment2.e() > videoSegment2.f125478b) {
                        videoSegment2.b(videoSegment2.f125478b);
                    }
                    videoSegment2.r = a2.fps;
                    videoSegment2.s = a2.bitrate;
                    videoSegment2.t = a2.keyFrameCount;
                    videoSegment2.u = a2.codec;
                }
                arrayList.add(videoSegment2);
            }
        }
        return arrayList;
    }
}
