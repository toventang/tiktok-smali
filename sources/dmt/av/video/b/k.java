package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import dmt.av.video.VEPreviewParams;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class k extends j {
    private boolean H;
    private boolean I;

    static {
        Covode.recordClassIndex(104179);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.aweme.cw.g.d()
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.k.<init>(dmt.av.video.b.s):void");
    }

    private static boolean a(VEPreviewParams vEPreviewParams) {
        if (vEPreviewParams.isStoryEditMode || !vEPreviewParams.mIsFromDraft) {
            return false;
        }
        if (vEPreviewParams.recordData == null || !vEPreviewParams.recordData.isSupportMultiEdit || vEPreviewParams.recordData.curMultiEditVideoRecordData == null) {
            return true;
        }
        return false;
    }

    private static int a(MultiEditVideoRecordData multiEditVideoRecordData) {
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        l.b(list, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        int i2 = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList) {
            l.b(multiEditVideoSegmentRecordData, "");
            i2 += (int) (((float) (multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime())) / multiEditVideoSegmentRecordData.getVideoSpeed());
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
    @Override // dmt.av.video.b.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(android.content.Context r15, com.bytedance.creativex.editor.preview.a r16, android.view.SurfaceView r17, androidx.lifecycle.m r18) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.k.a(android.content.Context, com.bytedance.creativex.editor.preview.a, android.view.SurfaceView, androidx.lifecycle.m):int");
    }
}
