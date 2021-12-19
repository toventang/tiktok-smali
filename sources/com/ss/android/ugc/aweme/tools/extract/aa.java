package com.ss.android.ugc.aweme.tools.extract;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.a;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.c;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.k;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f140002a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(91499);
    }

    public static final ArrayList<z> a(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> a2 = CameraComponentModel.a(videoPublishEditModel != null ? videoPublishEditModel.mVideoSegmentsDesc : null);
        if (k.a(a2)) {
            return null;
        }
        l.b(a2, "");
        ArrayList arrayList = new ArrayList();
        for (T t : a2) {
            T t2 = t;
            l.b(t2, "");
            if (t2.getBackgroundVideo() != null) {
                arrayList.add(t);
            }
        }
        Map<String, Long> a3 = a(videoPublishEditModel, arrayList);
        ArrayList<z> arrayList2 = new ArrayList<>(a2.size());
        for (Map.Entry<String, Long> entry : a3.entrySet()) {
            long longValue = entry.getValue().longValue();
            z zVar = new z();
            zVar.f140187a = entry.getKey();
            zVar.f140189c = longValue;
            arrayList2.add(zVar);
        }
        return arrayList2;
    }

    public static final ArrayList<z> a(List<? extends EditVideoSegment> list) {
        if (k.a(list)) {
            return null;
        }
        if (list == null) {
            l.b();
        }
        ArrayList<z> arrayList = new ArrayList<>(list.size());
        for (EditVideoSegment editVideoSegment : list) {
            z zVar = new z();
            if (editVideoSegment == null) {
                l.b();
            }
            zVar.f140187a = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    l.b();
                }
                zVar.f140188b = videoCutInfo.getStart();
                VideoCutInfo videoCutInfo2 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo2 == null) {
                    l.b();
                }
                long end = videoCutInfo2.getEnd();
                VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo3 == null) {
                    l.b();
                }
                zVar.f140189c = end - videoCutInfo3.getStart();
            } else {
                zVar.f140188b = 0;
                zVar.f140189c = editVideoSegment.getVideoFileInfo().getDuration();
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    private static Map<String, Long> a(VideoPublishEditModel videoPublishEditModel, List<? extends TimeSpeedModelExtension> list) {
        String videoPath;
        String str;
        long j2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : list) {
            a backgroundVideo = t.getBackgroundVideo();
            if (!(backgroundVideo == null || (videoPath = backgroundVideo.getVideoPath()) == null)) {
                if (!i.a(videoPath)) {
                    l.d(videoPath, "");
                    String a2 = c.a(videoPublishEditModel);
                    String str2 = File.separator;
                    l.b(str2, "");
                    videoPath = l.a(a2, n.i(p.c(videoPath, new String[]{str2})));
                }
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                l.b(application, "");
                String a3 = h.a(application, videoPath);
                String str3 = null;
                if (a3 != null) {
                    String str4 = File.separator;
                    l.b(str4, "");
                    Objects.requireNonNull(a3, "null cannot be cast to non-null type java.lang.String");
                    str = a3.substring(p.a((CharSequence) a3, str4) + 1);
                    l.b(str, "");
                } else {
                    str = null;
                }
                if (videoPublishEditModel != null) {
                    str3 = videoPublishEditModel.uniqueVideoSessionDir(dj.f126466i);
                }
                String str5 = str3 + File.separator + str;
                if (e.b(str5)) {
                    a3 = str5;
                }
                if (i.a(a3)) {
                    Long l2 = (Long) linkedHashMap.get(String.valueOf(a3));
                    if (t.getSpeed() > 0.0d) {
                        String valueOf = String.valueOf(a3);
                        if (l2 != null) {
                            j2 = l2.longValue();
                        } else {
                            j2 = 0;
                        }
                        linkedHashMap.put(valueOf, Long.valueOf(j2 + ((long) TimeSpeedModelExtension.calculateRealTime(t.getDuration(), t.getSpeed()))));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00af A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, com.ss.android.ugc.aweme.tools.extract.a.j r11) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.extract.aa.a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.tools.extract.a.j):void");
    }
}
