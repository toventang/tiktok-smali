package dmt.av.video.b;

import android.content.Context;
import android.util.Pair;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.x;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import dmt.av.video.VEPreviewMusicParams;
import dmt.av.video.VEPreviewParams;
import h.f.b.l;
import java.util.List;

public final class n extends j {
    private boolean H;

    static {
        Covode.recordClassIndex(104184);
    }

    public static final class a implements SurfaceHolder.Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f156861a;

        static {
            Covode.recordClassIndex(104185);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            l.d(surfaceHolder, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(n nVar) {
            this.f156861a = nVar;
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            l.d(surfaceHolder, "");
            VESize a2 = this.f156861a.c().a(i3, i4);
            c.a(i3, i4, a2.width, a2.height);
            n.a(this.f156861a.c());
            n.b(this.f156861a.c());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(dmt.av.video.b.s r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            java.util.concurrent.ScheduledExecutorService r0 = com.ss.android.ugc.aweme.cw.g.d()
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.b.n.<init>(dmt.av.video.b.s):void");
    }

    public static void a(g gVar) {
        gVar.a(x.e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        if (c.a()) {
            gVar.c(b.f127976e, b.f127977f);
        }
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

    public static void b(g gVar) {
        boolean z;
        if (b.f127978g <= 0 || b.f127979h <= 0 || b.f127980i <= 0 || b.f127981j <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (c.b() && z) {
            gVar.a(((float) b.f127974c) / ((float) b.f127980i), ((float) b.f127975d) / ((float) b.f127981j), 0.0f, -(((b.f127978g / 2) - (b.f127974c / 2)) - b.f127972a), ((b.f127979h / 2) - (b.f127975d / 2)) - b.f127973b);
        }
    }

    @Override // dmt.av.video.b.j
    public final void a(SurfaceView surfaceView) {
        super.a(surfaceView);
        if (surfaceView != null) {
            surfaceView.getHolder().addCallback(new a(this));
        }
    }

    @Override // dmt.av.video.b.j
    public final boolean a(VEPreviewMusicParams vEPreviewMusicParams) {
        l.d(vEPreviewMusicParams, "");
        if (!this.H) {
            return super.a(vEPreviewMusicParams);
        }
        this.H = false;
        return true;
    }

    private final void a(g gVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null && com.ss.android.ugc.aweme.shortvideo.af.b.a(multiEditVideoRecordData.musicPath, i.f115645a)) {
            if (multiEditVideoRecordData.musicDuration <= 0) {
                multiEditVideoRecordData.musicDuration = fa.a(multiEditVideoRecordData.musicPath);
            }
            String str = multiEditVideoRecordData.musicPath;
            l.b(str, "");
            int a2 = gVar.a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, false);
            gVar.a(a2, 1, multiEditVideoRecordData.musicVolume);
            multiEditVideoRecordData.musicIndex = a2;
            this.f156782i = a2;
        }
    }

    @Override // dmt.av.video.b.j
    public final int a(Context context, com.bytedance.creativex.editor.preview.a aVar, SurfaceView surfaceView, m mVar) {
        l.d(aVar, "");
        super.a(context, aVar, surfaceView, mVar);
        VEPreviewParams vEPreviewParams = (VEPreviewParams) aVar;
        if (vEPreviewParams.recordData.isMultiEditRetake) {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.f156778e;
            if (vEEditorAutoStartStopArbiter != null) {
                vEEditorAutoStartStopArbiter.f156722b = true;
            }
            if (vEPreviewParams.recordData.segmentSizeChange) {
                g c2 = c();
                MultiEditVideoRecordData multiEditVideoRecordData = vEPreviewParams.recordData.curMultiEditVideoRecordData;
                l.b(multiEditVideoRecordData, "");
                int i2 = vEPreviewParams.recordData.currentEditIndex;
                Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
                Integer num = (Integer) playInOutTime.first;
                Integer num2 = (Integer) playInOutTime.second;
                List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
                l.b(list, "");
                int i3 = 0;
                int i4 = 0;
                for (T t : list) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        h.a.n.a();
                    }
                    T t2 = t;
                    if (i4 < i2) {
                        l.b(t2, "");
                        i3 += (int) (t2.getEndTime() - t2.getStartTime());
                    }
                    i4 = i5;
                }
                VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData);
                a2.a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
                int unused = c2.a(a2, false, true);
                a(c2, multiEditVideoRecordData);
                c2.a(true);
                a(c2);
                c2.p();
                b(c2);
                c2.a(i3, x.f.EDITOR_SEEK_FLAG_LastSeek);
            } else {
                g c3 = c();
                MultiEditVideoRecordData multiEditVideoRecordData2 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
                l.b(multiEditVideoRecordData2, "");
                int i6 = vEPreviewParams.recordData.currentEditIndex;
                if (!k.a(multiEditVideoRecordData2.segmentDataList)) {
                    MultiEditVideoRecordData a3 = d.a(multiEditVideoRecordData2, (MultiEditVideoRecordData) null);
                    a3.resetTimeData();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = a3.segmentDataList.get(i6);
                    a3.segmentDataList.clear();
                    a3.segmentDataList.add(multiEditVideoSegmentRecordData);
                    List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData2.segmentDataList;
                    l.b(list2, "");
                    int i7 = 0;
                    int i8 = 0;
                    for (T t3 : list2) {
                        int i9 = i7 + 1;
                        if (i7 < 0) {
                            h.a.n.a();
                        }
                        T t4 = t3;
                        if (i7 < i6) {
                            l.b(t4, "");
                            i8 += (int) (t4.getEndTime() - t4.getStartTime());
                        }
                        i7 = i9;
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = multiEditVideoRecordData2.segmentDataList.get(i6);
                    l.b(multiEditVideoSegmentRecordData2, "");
                    long startTime = multiEditVideoSegmentRecordData2.getStartTime();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData3 = multiEditVideoRecordData2.segmentDataList.get(i6);
                    l.b(multiEditVideoSegmentRecordData3, "");
                    long endTime = multiEditVideoSegmentRecordData3.getEndTime();
                    c3.r();
                    int unused2 = c3.a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(a3), false, true);
                    if (multiEditVideoRecordData2.isPlaySingleSegmentMusic()) {
                        a(c3, multiEditVideoRecordData2);
                        int i10 = (int) (endTime - startTime);
                        if (multiEditVideoRecordData2.musicIndex != -1) {
                            int i11 = i8 + multiEditVideoRecordData2.musicTrimIn;
                            if (i11 > multiEditVideoRecordData2.musicDuration) {
                                i11 %= multiEditVideoRecordData2.musicDuration;
                            }
                            c3.a(multiEditVideoRecordData2.musicIndex, i11, i10 + i11, false);
                        }
                    }
                    c3.a(true);
                    a(c3);
                    c3.p();
                    b(c3);
                    int i12 = (int) startTime;
                    c3.b(i12, (int) endTime);
                    c3.a(i12, x.f.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
            if (vEPreviewParams.recordData.curMultiEditVideoRecordData.musicIndex == -1) {
                return 0;
            }
            this.H = true;
            return 0;
        }
        MultiEditVideoRecordData multiEditVideoRecordData3 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
        l.b(multiEditVideoRecordData3, "");
        Pair<Integer, Integer> playInOutTime2 = multiEditVideoRecordData3.getPlayInOutTime();
        MultiEditVideoRecordData multiEditVideoRecordData4 = vEPreviewParams.recordData.curMultiEditVideoRecordData;
        l.b(multiEditVideoRecordData4, "");
        VERecordData a4 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData4);
        a4.a(((long) ((Integer) playInOutTime2.first).intValue()) * 1000, ((long) ((Integer) playInOutTime2.second).intValue()) * 1000);
        if (this.r == 1) {
            return c().a(a4, a(vEPreviewParams), false);
        }
        return c().a(a4, a(vEPreviewParams), true);
    }
}
