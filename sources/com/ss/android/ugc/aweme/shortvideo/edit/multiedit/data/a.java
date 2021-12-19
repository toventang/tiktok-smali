package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.e;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.bg;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(83884);
    }

    public static final void a(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, long j2, long j3) {
        l.d(multiEditVideoStatusRecordData, "");
        ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.editSegments;
        int i2 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<TimeSpeedModelExtension> it = multiEditVideoStatusRecordData.editSegments.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                TimeSpeedModelExtension next = it.next();
                arrayList2.add(Integer.valueOf(i3));
                l.b(next, "");
                i3 += next.getDuration();
                arrayList3.add(Integer.valueOf(i3));
            }
            int size = arrayList3.size();
            int size2 = arrayList3.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    break;
                } else if (((Number) arrayList3.get(i4)).longValue() >= j2) {
                    i2 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            int size3 = arrayList2.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    if (((Number) arrayList2.get(size3)).longValue() <= j3) {
                        size = size3;
                        break;
                    }
                } else {
                    break;
                }
            }
            ArrayList<TimeSpeedModelExtension> arrayList4 = multiEditVideoStatusRecordData.editSegments;
            if (arrayList4 == null) {
                l.b();
            }
            if (size <= arrayList4.size() - 1) {
                size++;
            }
            ArrayList<TimeSpeedModelExtension> arrayList5 = multiEditVideoStatusRecordData.editSegments;
            if (arrayList5 == null) {
                l.b();
            }
            multiEditVideoStatusRecordData.editCutSegments = new ArrayList<>(arrayList5.subList(i2, size));
        }
    }

    public static final void a(MultiEditVideoRecordData multiEditVideoRecordData, List<? extends VideoSegment> list) {
        l.d(multiEditVideoRecordData, "");
        l.d(list, "");
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        l.b(list2, "");
        int i2 = 0;
        for (T t : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            l.b(t2, "");
            a(t2, (VideoSegment) list.get(i2));
            i2 = i3;
        }
    }

    public static final void a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, VideoSegment videoSegment) {
        e eVar;
        l.d(multiEditVideoSegmentRecordData, "");
        l.d(videoSegment, "");
        MusicSyncData musicSyncData = null;
        if (videoSegment.g() && (eVar = videoSegment.n) != null) {
            musicSyncData = new MusicSyncData(eVar.getVideoStart(), eVar.getVideoEnd(), eVar.getVideoDuration());
        }
        multiEditVideoSegmentRecordData.musicSyncData = musicSyncData;
        multiEditVideoSegmentRecordData.enable = !videoSegment.f125485i;
        multiEditVideoSegmentRecordData.setStartTime(videoSegment.d());
        multiEditVideoSegmentRecordData.setEndTime(videoSegment.e());
    }

    private static VERecordData.VERecordSegmentData a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        l.d(multiEditVideoSegmentRecordData, "");
        VERecordData.VERecordSegmentData vERecordSegmentData = new VERecordData.VERecordSegmentData(a(multiEditVideoSegmentRecordData.videoPath, multiEditVideoSegmentRecordData.draftVideoPath), multiEditVideoSegmentRecordData.videoLength, a(multiEditVideoSegmentRecordData.audioPath, multiEditVideoSegmentRecordData.draftAudioPath), multiEditVideoSegmentRecordData.audioLength, multiEditVideoSegmentRecordData.audioSpeed, multiEditVideoSegmentRecordData.getStartTime() * 1000, multiEditVideoSegmentRecordData.getEndTime() * 1000, multiEditVideoSegmentRecordData.enable);
        vERecordSegmentData.f150800g = v.a.a(multiEditVideoSegmentRecordData.rotate);
        vERecordSegmentData.f150799f = multiEditVideoSegmentRecordData.getVideoSpeed();
        return vERecordSegmentData;
    }

    public static final List<MultiEditVideoSegmentRecordData> d(MultiEditVideoRecordData multiEditVideoRecordData) {
        l.d(multiEditVideoRecordData, "");
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        l.b(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final bg b(MultiEditVideoRecordData multiEditVideoRecordData) {
        l.d(multiEditVideoRecordData, "");
        int size = multiEditVideoRecordData.segmentDataList.size();
        String[] strArr = new String[size];
        double[] dArr = new double[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            zArr[i3] = true;
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        l.b(list, "");
        for (T t : list) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            strArr[i2] = t2.videoPath.toString();
            l.b(t2, "");
            dArr[i2] = (double) t2.getVideoSpeed();
            rotate_degreeArr[i2] = v.a.a(t2.rotate);
            zArr[i2] = t2.enable;
            iArr[i2] = (int) t2.getStartTime();
            iArr2[i2] = (int) t2.getEndTime();
            i2 = i4;
        }
        bg bgVar = new bg(strArr);
        bgVar.f151092i = dArr;
        bgVar.f151094k = rotate_degreeArr;
        bgVar.f151093j = zArr;
        bgVar.f151088e = iArr;
        bgVar.f151089f = iArr2;
        return bgVar;
    }

    private static MultiEditVideoSegmentRecordData a(VERecordData.VERecordSegmentData vERecordSegmentData) {
        if (vERecordSegmentData == null) {
            return null;
        }
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = vERecordSegmentData.f150794a;
        multiEditVideoSegmentRecordData.audioPath = vERecordSegmentData.f150795b;
        multiEditVideoSegmentRecordData.setStartTime(vERecordSegmentData.f150801h / 1000);
        multiEditVideoSegmentRecordData.setEndTime(vERecordSegmentData.f150802i / 1000);
        if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
            multiEditVideoSegmentRecordData.draftVideoPath = vERecordSegmentData.f150794a;
        }
        if (TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
            multiEditVideoSegmentRecordData.draftAudioPath = vERecordSegmentData.f150795b;
        }
        multiEditVideoSegmentRecordData.videoLength = vERecordSegmentData.f150796c;
        multiEditVideoSegmentRecordData.audioLength = vERecordSegmentData.f150797d;
        multiEditVideoSegmentRecordData.setVideoSpeed(vERecordSegmentData.f150799f);
        multiEditVideoSegmentRecordData.audioSpeed = vERecordSegmentData.f150798e;
        multiEditVideoSegmentRecordData.rotate = v.a.a(vERecordSegmentData.f150800g);
        return multiEditVideoSegmentRecordData;
    }

    public static final List<VideoSegment> c(MultiEditVideoRecordData multiEditVideoRecordData) {
        long originStartTime;
        long originEndTime;
        boolean z;
        boolean z2;
        l.d(multiEditVideoRecordData, "");
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return z.INSTANCE;
        }
        List<MultiEditVideoSegmentRecordData> list2 = multiEditVideoRecordData.segmentDataList;
        l.b(list2, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list2, 10));
        for (T t : list2) {
            l.b(t, "");
            l.d(t, "");
            VideoSegment videoSegment = new VideoSegment(t.videoPath, t.width, t.height, (int) (t.videoLength / 1000));
            videoSegment.a(t.getVideoSpeed());
            videoSegment.f125486j = t.rotate;
            MultiEditTrimState multiEditTrimState = t.multiEditTrimState;
            if (multiEditTrimState != null) {
                originStartTime = multiEditTrimState.getStartTime();
            } else {
                originStartTime = t.getOriginStartTime();
            }
            videoSegment.a(originStartTime);
            MultiEditTrimState multiEditTrimState2 = t.multiEditTrimState;
            if (multiEditTrimState2 != null) {
                originEndTime = multiEditTrimState2.getEndTime();
            } else {
                originEndTime = t.getOriginEndTime();
            }
            videoSegment.b(originEndTime);
            MultiEditTrimState multiEditTrimState3 = t.multiEditTrimState;
            if (multiEditTrimState3 != null) {
                z = multiEditTrimState3.getEnable();
            } else {
                z = t.enable;
            }
            videoSegment.f125485i = !z;
            videoSegment.f125477a = t.videoKey;
            if (t.musicSyncData != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            videoSegment.o = z2;
            MusicSyncData musicSyncData = t.musicSyncData;
            if (musicSyncData != null) {
                videoSegment.n = new e(t.videoKey, musicSyncData.getVideoStart(), musicSyncData.getVideoEnd() - musicSyncData.getVideoStart(), t.videoLength / 1000);
            }
            arrayList.add(videoSegment);
        }
        ArrayList arrayList2 = arrayList;
        for (Object obj : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            ((VideoSegment) obj).f125477a = i2;
            i2 = i3;
        }
        return arrayList2;
    }

    public static final VERecordData a(MultiEditVideoRecordData multiEditVideoRecordData) {
        l.d(multiEditVideoRecordData, "");
        ArrayList arrayList = new ArrayList();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        l.b(list, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList2 = new ArrayList();
        for (T t : list) {
            if (t.enable) {
                arrayList2.add(t);
            }
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList2) {
            l.b(multiEditVideoSegmentRecordData, "");
            arrayList.add(a(multiEditVideoSegmentRecordData));
        }
        VERecordData vERecordData = new VERecordData(arrayList, multiEditVideoRecordData.useMusic);
        vERecordData.f150792d = multiEditVideoRecordData.concatVideo;
        vERecordData.f150793e = multiEditVideoRecordData.concatAudio;
        return vERecordData;
    }

    public static final MultiEditVideoRecordData a(VERecordData vERecordData, String str) {
        l.d(str, "");
        if (vERecordData == null) {
            return null;
        }
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.useMusic = vERecordData.f150791c;
        multiEditVideoRecordData.concatAudio = vERecordData.f150793e;
        multiEditVideoRecordData.concatVideo = vERecordData.f150792d;
        multiEditVideoRecordData.startTime = 0;
        if (vERecordData.f150790b != null && !vERecordData.f150790b.isEmpty()) {
            multiEditVideoRecordData.segmentDataList = new ArrayList(vERecordData.f150790b.size());
            for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f150790b) {
                multiEditVideoRecordData.segmentDataList.add(a(vERecordSegmentData));
                multiEditVideoRecordData.endTime += vERecordSegmentData.f150796c / 1000;
            }
        }
        multiEditVideoRecordData.curRecordingDir = str;
        return multiEditVideoRecordData;
    }

    private static String a(String str, String str2) {
        q.a("record path:" + str + ", draft path:" + str2);
        if (!i.a(str2)) {
            q.b("draft video path:".concat(String.valueOf(str2)));
            return str;
        }
        long length = new File(str2).length();
        long length2 = new File(str).length();
        q.a("record length:" + length2 + ", draft length" + length);
        if (length2 < length) {
            return str2;
        }
        return str;
    }

    public static final void a(MultiEditVideoRecordData multiEditVideoRecordData, long j2, long j3) {
        l.d(multiEditVideoRecordData, "");
        if (j3 > j2) {
            long j4 = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
                if (multiEditVideoSegmentRecordData.enable) {
                    boolean z = multiEditVideoSegmentRecordData.enable;
                    l.b(multiEditVideoSegmentRecordData, "");
                    multiEditVideoSegmentRecordData.multiEditTrimState = new MultiEditTrimState(z, multiEditVideoSegmentRecordData.getOriginStartTime(), multiEditVideoSegmentRecordData.getOriginEndTime());
                    long endTime = multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
                    if (j4 < j2 || j4 + endTime > j3) {
                        if (j4 + endTime <= j2 || j4 >= j3) {
                            multiEditVideoSegmentRecordData.enable = false;
                        } else {
                            long startTime = (j2 - j4) + multiEditVideoSegmentRecordData.getStartTime();
                            long startTime2 = (j3 - j4) + multiEditVideoSegmentRecordData.getStartTime();
                            if (startTime <= multiEditVideoSegmentRecordData.getStartTime()) {
                                startTime = multiEditVideoSegmentRecordData.getStartTime();
                            }
                            multiEditVideoSegmentRecordData.setStartTime(startTime);
                            if (startTime2 > multiEditVideoSegmentRecordData.getEndTime()) {
                                startTime2 = multiEditVideoSegmentRecordData.getEndTime();
                            }
                            multiEditVideoSegmentRecordData.setEndTime(startTime2);
                        }
                    }
                    j4 += endTime;
                }
            }
        }
    }
}
