package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f127827a;

    static {
        Covode.recordClassIndex(83799);
    }

    public c(boolean z) {
        this.f127827a = z;
    }

    public final EditPreviewInfo a(p<? extends MultiEditVideoRecordData, EditPreviewInfo> pVar) {
        VideoFileInfo videoFileInfo;
        l.d(pVar, "");
        EditPreviewInfo second = pVar.getSecond();
        e eVar = new e(second.getPreviewWidth(), second.getPreviewHeight(), second.getSceneIn(), second.getSceneOut(), second.getDraftDir());
        List<MultiEditVideoSegmentRecordData> list = ((MultiEditVideoRecordData) pVar.getFirst()).segmentDataList;
        l.b(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        ArrayList<MultiEditVideoSegmentRecordData> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList2) {
            if (this.f127827a) {
                videoFileInfo = new VideoFileInfo(multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, multiEditVideoSegmentRecordData.videoLength / 1000, -100, 0, 0, 0, 0, 240, null);
            } else {
                videoFileInfo = new VideoFileInfo(pVar.getSecond().getPreviewWidth(), pVar.getSecond().getPreviewHeight(), multiEditVideoSegmentRecordData.videoLength / 1000, -100, 0, 0, 0, 0, 240, null);
            }
            EditVideoSegment editVideoSegment = new EditVideoSegment(multiEditVideoSegmentRecordData.draftVideoPath.toString(), multiEditVideoSegmentRecordData.draftAudioPath, videoFileInfo);
            l.b(multiEditVideoSegmentRecordData, "");
            editVideoSegment.setVideoCutInfo(new VideoCutInfo(multiEditVideoSegmentRecordData.getStartTime(), multiEditVideoSegmentRecordData.getEndTime(), multiEditVideoSegmentRecordData.getVideoSpeed(), multiEditVideoSegmentRecordData.rotate));
            arrayList3.add(editVideoSegment);
        }
        EditPreviewInfo a2 = eVar.a(n.g((Collection) arrayList3));
        a2.setReverseAudioArray(pVar.getSecond().getReverseAudioArray());
        a2.setReverseVideoArray(pVar.getSecond().getReverseVideoArray());
        return a2;
    }
}
