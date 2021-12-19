package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f127828a;

    /* renamed from: b  reason: collision with root package name */
    private final int f127829b;

    /* renamed from: c  reason: collision with root package name */
    private final long f127830c;

    /* renamed from: d  reason: collision with root package name */
    private final long f127831d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f127832e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f127833f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f127834g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f127835h;

    /* renamed from: i  reason: collision with root package name */
    private final String f127836i;

    static {
        Covode.recordClassIndex(83800);
    }

    public d() {
        this(0, 0, false, null, null, false, null, 511);
    }

    public d(int i2, int i3) {
        this(i2, i3, false, null, null, false, null, 508);
    }

    public final EditPreviewInfo a(MultiEditVideoRecordData multiEditVideoRecordData) {
        String str;
        String str2;
        l.d(multiEditVideoRecordData, "");
        e eVar = new e(this.f127828a, this.f127829b, this.f127830c, this.f127831d, this.f127836i);
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
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
            if (this.f127835h) {
                str = multiEditVideoSegmentRecordData.draftVideoPath;
            } else {
                str = multiEditVideoSegmentRecordData.videoPath;
            }
            if (this.f127835h) {
                str2 = multiEditVideoSegmentRecordData.draftAudioPath;
            } else {
                str2 = multiEditVideoSegmentRecordData.audioPath;
            }
            l.b(str, "");
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, str2, new VideoFileInfo(multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, multiEditVideoSegmentRecordData.videoLength / 1000, -100, 0, 0, 0, 0, 240, null));
            if (this.f127832e) {
                l.b(multiEditVideoSegmentRecordData, "");
                editVideoSegment.setVideoCutInfo(new VideoCutInfo(multiEditVideoSegmentRecordData.getStartTime(), multiEditVideoSegmentRecordData.getEndTime(), multiEditVideoSegmentRecordData.getVideoSpeed(), multiEditVideoSegmentRecordData.rotate));
            }
            arrayList3.add(editVideoSegment);
        }
        EditPreviewInfo a2 = eVar.a(n.g((Collection) arrayList3));
        a2.setReverseAudioArray(this.f127833f);
        a2.setReverseVideoArray(this.f127834g);
        return a2;
    }

    private d(int i2, int i3, boolean z, String[] strArr, String[] strArr2, boolean z2, String str) {
        this.f127828a = i2;
        this.f127829b = i3;
        this.f127830c = 0;
        this.f127831d = 0;
        this.f127832e = z;
        this.f127833f = strArr;
        this.f127834g = strArr2;
        this.f127835h = z2;
        this.f127836i = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3, boolean z, String[] strArr, String[] strArr2, boolean z2, String str, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? null : strArr, (i4 & 64) != 0 ? null : strArr2, (i4 & 128) == 0 ? z2 : false, (i4 & 256) == 0 ? str : null);
    }
}
