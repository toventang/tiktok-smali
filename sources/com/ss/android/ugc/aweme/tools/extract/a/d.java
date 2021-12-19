package com.ss.android.ugc.aweme.tools.extract.a;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.aweme.tools.extract.z;
import dmt.av.video.aj;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Iterator;
import java.util.List;

public final class d implements e {
    static {
        Covode.recordClassIndex(91490);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a.e
    public final p<Integer, String> a(VideoPublishEditModel videoPublishEditModel, int i2) {
        int i3;
        int i4;
        List<z> uploadFrameInfoList;
        int i5;
        List<Integer> photoDurationList;
        List<Integer> photoDurationList2;
        List<Integer> photoDurationList3;
        l.d(videoPublishEditModel, "");
        VideoFileInfo b2 = aj.b(videoPublishEditModel.mOutputFile);
        if (b2 != null) {
            long duration = b2.getDuration();
            if (duration != 0) {
                j jVar = ab.f140003a;
                int i6 = 0;
                if (jVar == null || (photoDurationList3 = jVar.getPhotoDurationList()) == null) {
                    i3 = 0;
                } else {
                    i3 = photoDurationList3.size();
                }
                j jVar2 = ab.f140003a;
                if (!(jVar2 == null || (photoDurationList2 = jVar2.getPhotoDurationList()) == null)) {
                    photoDurationList2.size();
                }
                j jVar3 = ab.f140003a;
                if (jVar3 == null || (photoDurationList = jVar3.getPhotoDurationList()) == null) {
                    i4 = 0;
                } else {
                    Iterator<T> it = photoDurationList.iterator();
                    i4 = 0;
                    while (it.hasNext()) {
                        i4 += it.next().intValue();
                    }
                }
                j jVar4 = ab.f140003a;
                if (!(jVar4 == null || (uploadFrameInfoList = jVar4.getUploadFrameInfoList()) == null || !(!uploadFrameInfoList.isEmpty()))) {
                    i6 = 0;
                    for (T t : uploadFrameInfoList) {
                        String str = t.f140187a;
                        if (!e.b(str) && !e.c(str)) {
                            j jVar5 = ab.f140003a;
                            if (jVar5 != null && jVar5.getVideoOrigin() == 0) {
                                i5 = ((int) t.f140189c) / 500;
                            } else if (t.f140193g) {
                                i5 = (((int) t.f140189c) / LiveNetAdaptiveHurryTimeSetting.DEFAULT) + 1;
                            } else {
                                i5 = 0;
                            }
                            i6 += i5;
                        }
                    }
                }
                int i7 = i3 + i6;
                if (i7 == 0) {
                    return v.a(9, "concat duration:" + duration + ", photo duration:" + i4);
                }
                if (i2 < 0) {
                    return v.a(9, "concat duration:" + duration + ", photo duration:" + i4 + ", cal count:" + i7);
                }
                if (Math.abs(i2 - i7) > 3) {
                    return v.a(7, "concat duration:" + duration + ", photo duration:" + i4 + ", cal count:" + i7 + ", frame count:" + i2);
                }
                return v.a(-1, "");
            }
        }
        return v.a(5, "concat file path:" + videoPublishEditModel.mOutputFile);
    }
}
