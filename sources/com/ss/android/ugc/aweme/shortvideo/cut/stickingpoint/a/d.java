package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cut.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.tools.c.c;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.x;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class d extends c {

    /* renamed from: a  reason: collision with root package name */
    private int f125873a;

    /* renamed from: b  reason: collision with root package name */
    private VideoSegment f125874b;

    /* renamed from: c  reason: collision with root package name */
    private final g f125875c;

    /* renamed from: d  reason: collision with root package name */
    private bg f125876d;

    static {
        Covode.recordClassIndex(82703);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c, com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(boolean z, boolean z2, List<? extends VideoSegment> list) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c, com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list) {
        if (!k.a(list)) {
            c.b(this.f125876d, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c, com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void c(int i2, int i3) {
        this.f125875c.b(i2, i3);
    }

    public d(g gVar, bg bgVar) {
        l.d(gVar, "");
        l.d(bgVar, "");
        this.f125875c = gVar;
        this.f125876d = bgVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c, com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list, boolean z) {
        c.a(this.f125876d, list);
        this.f125875c.a(this.f125876d);
        if (z) {
            this.f125875c.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
        }
        i.a.a(this, 0.0f, 0.0f, 0.0f, 30);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c, com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, VideoSegment videoSegment) {
        l.d(videoSegment, "");
        this.f125874b = videoSegment;
        this.f125873a = i2;
        int i3 = videoSegment.f125486j;
        videoSegment.f125486j = 0;
        c.a(this.f125876d, i2, videoSegment);
        this.f125875c.a(this.f125876d, (int) videoSegment.d(), (int) videoSegment.e());
        videoSegment.f125486j = i3;
        i.a.a(this, (float) videoSegment.f125486j, videoSegment.f125487k, videoSegment.f125488l, 24);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c, com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, int i3, List<? extends VideoSegment> list) {
        List<? extends VideoSegment> list2;
        l.d(list, "");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        int i4 = 0;
        if (list2 != null) {
            int i5 = 0;
            for (T t : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    n.a();
                }
                T t2 = t;
                strArr[i5] = t2.a(false).toString();
                iArr[i5] = (int) t2.d();
                iArr2[i5] = (int) t2.e();
                fArr[i5] = t2.f();
                iArr3[i5] = t2.f125486j;
                i5 = i6;
            }
        }
        bg bgVar = new bg(strArr);
        c.a(bgVar, list, iArr, iArr2, fArr, iArr3);
        this.f125876d = bgVar;
        for (T t3 : list) {
            int i7 = i4 + 1;
            if (i4 < 0) {
                n.a();
            }
            this.f125876d.f151085b[i4] = t3.f125477a;
            i4 = i7;
        }
    }
}
