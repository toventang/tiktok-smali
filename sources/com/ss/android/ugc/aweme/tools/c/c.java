package com.ss.android.ugc.aweme.tools.c;

import c.d.a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.property.ah;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.bg;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(91061);
    }

    public static final VEUtils.VEVideoFileInfo a(String str) {
        l.d(str, "");
        g.a().u();
        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(str);
        if (!(videoFileInfo == null || videoFileInfo.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0)) {
            int i2 = videoFileInfo.height;
            videoFileInfo.height = videoFileInfo.width;
            videoFileInfo.width = i2;
        }
        return videoFileInfo;
    }

    public static final int a(String str, int[] iArr) {
        l.d(str, "");
        l.d(iArr, "");
        q.d("start getVideoFileInfoWithRotation");
        if (ah.a() && p.b(str, "content://", false)) {
            str = a.a(i.f115645a, h.d(str));
            l.b(str, "");
        }
        g.a().u();
        int videoFileInfo = VEUtils.getVideoFileInfo(str, iArr);
        if (videoFileInfo == 0 && iArr[2] % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            int i2 = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i2;
        }
        q.d("end getVideoFileInfoWithRotation");
        return videoFileInfo;
    }

    public static final void b(bg bgVar, List<? extends VideoSegment> list) {
        l.d(bgVar, "");
        if (!(list == null || list.isEmpty())) {
            int length = bgVar.f151088e.length;
            int size = list.size() + length;
            bgVar.f151088e = Arrays.copyOf(bgVar.f151088e, size);
            bgVar.f151089f = Arrays.copyOf(bgVar.f151089f, size);
            bgVar.f151092i = Arrays.copyOf(bgVar.f151092i, size);
            bgVar.f151093j = Arrays.copyOf(bgVar.f151093j, size);
            bgVar.f151094k = (ROTATE_DEGREE[]) Arrays.copyOf(bgVar.f151094k, size);
            bgVar.f151084a = (String[]) Arrays.copyOf(bgVar.f151084a, size);
            bgVar.f151085b = Arrays.copyOf(bgVar.f151085b, size);
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                int i4 = i2 + length;
                bgVar.f151088e[i4] = (int) t2.d();
                bgVar.f151089f[i4] = (int) t2.e();
                bgVar.f151092i[i4] = (double) com.ss.android.ugc.aweme.tools.i.NORMAL.value();
                bgVar.f151093j[i4] = true;
                bgVar.f151094k[i4] = ROTATE_DEGREE.ROTATE_NONE;
                bgVar.f151084a[i4] = t2.a(false).toString();
                bgVar.f151085b[i4] = t2.f125477a;
                i2 = i3;
            }
        }
    }

    public static final void a(bg bgVar, List<? extends VideoSegment> list) {
        l.d(bgVar, "");
        if (list != null) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                T t2 = t;
                bgVar.f151088e[i2] = (int) t2.d();
                bgVar.f151089f[i2] = (int) t2.e();
                bgVar.f151094k[i2] = v.a.a(t2.f125486j);
                bgVar.f151092i[i2] = (double) t2.f();
                bgVar.f151093j[i2] = !t2.f125485i;
                i2 = i3;
            }
        }
    }

    public static final void a(bg bgVar, int i2, VideoSegment videoSegment) {
        boolean z;
        l.d(bgVar, "");
        l.d(videoSegment, "");
        boolean[] zArr = bgVar.f151093j;
        l.b(zArr, "");
        int length = zArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i4 + 1;
            boolean[] zArr2 = bgVar.f151093j;
            if (i2 == i4) {
                z = true;
            } else {
                z = false;
            }
            zArr2[i4] = z;
            i3++;
            i4 = i5;
        }
        bgVar.f151092i[i2] = (double) videoSegment.f();
        bgVar.f151088e[i2] = 0;
        bgVar.f151089f[i2] = (int) videoSegment.f125478b;
        bgVar.f151094k[i2] = v.a.a(videoSegment.f125486j);
    }

    public static final void a(bg bgVar, List<? extends VideoSegment> list, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        l.d(bgVar, "");
        l.d(iArr, "");
        l.d(iArr2, "");
        l.d(fArr, "");
        l.d(iArr3, "");
        if (list != null && (!list.isEmpty())) {
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                bgVar.f151093j[i2] = !t.f125485i;
                bgVar.f151088e[i2] = iArr[i2];
                bgVar.f151089f[i2] = iArr2[i2];
                bgVar.f151092i[i2] = (double) fArr[i2];
                bgVar.f151094k[i2] = v.a.a(iArr3[i2]);
                i2 = i3;
            }
        }
    }
}
