package com.ss.android.ugc.aweme.shortvideo.record.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import h.f.b.l;
import h.p;
import h.u;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130088a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(85354);
    }

    public static final boolean b(StitchParams stitchParams) {
        if (stitchParams == null || stitchParams.getMusic() == null || !stitchParams.isPGCMusic() || stitchParams.getMusicStart() < 0) {
            return false;
        }
        return true;
    }

    public static final int a(StitchParams stitchParams) {
        int i2;
        VideoFileInfo videoFileInfo;
        if (stitchParams == null) {
            return 0;
        }
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment == null || (videoFileInfo = videoSegment.getVideoFileInfo()) == null) {
            i2 = 0;
        } else {
            i2 = (int) videoFileInfo.getDuration();
        }
        return i2 + Math.max(stitchParams.getMusicStart(), 0);
    }

    private static p<Long, Long> a(StitchParams stitchParams, long j2, long j3, long j4) {
        long j5;
        long musicStart;
        VideoFileInfo videoFileInfo;
        l.d(stitchParams, "");
        EditVideoSegment videoSegment = stitchParams.getVideoSegment();
        if (videoSegment == null || (videoFileInfo = videoSegment.getVideoFileInfo()) == null) {
            j5 = 0;
        } else {
            j5 = videoFileInfo.getDuration();
        }
        long j6 = j2 - j5;
        if (j4 > 0) {
            musicStart = Math.min((j3 - ((long) stitchParams.getMusicStart())) - j5, j4 - j5);
        } else {
            musicStart = (j3 - ((long) stitchParams.getMusicStart())) - j5;
        }
        if (musicStart >= 3000) {
            j6 = Math.min(j6, musicStart);
        }
        return new p<>(Long.valueOf(j6), Long.valueOf(j6 + j5));
    }

    public static final u<Long, Long, Long> a(StitchParams stitchParams, String str, c cVar, long j2) {
        long j3;
        l.d(stitchParams, "");
        long b2 = (long) com.ss.android.ugc.aweme.port.in.c.f115629h.b(str);
        if (cVar != null) {
            j3 = (long) cVar.getShootDuration();
        } else {
            j3 = b2;
        }
        p<Long, Long> a2 = a(stitchParams, j2, b2, j3);
        return new u<>(Long.valueOf(b2), Long.valueOf(a2.component1().longValue()), Long.valueOf(a2.component2().longValue()));
    }
}
