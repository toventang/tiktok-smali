package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.filterparam.VEImageTransformFilterParam;
import h.e.j;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: d  reason: collision with root package name */
    public static final a f129507d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f129508a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f129509b;

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f129510c = new ArrayList();

    static {
        Covode.recordClassIndex(85003);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85004);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (this.f129508a != null && !k.a(this.f129510c)) {
            int size = this.f129510c.size();
            int[] iArr = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f129510c.get(i2).intValue();
            }
            this.f129510c.clear();
            com.ss.android.ugc.asve.editor.g gVar = this.f129508a;
            if (gVar == null) {
                l.b();
            }
            gVar.a(iArr);
        }
    }

    public static VEImageTransformFilterParam a(int i2) {
        VEImageTransformFilterParam vEImageTransformFilterParam = new VEImageTransformFilterParam();
        if (i2 == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN) {
            vEImageTransformFilterParam.beginScale = 1.0f;
            vEImageTransformFilterParam.endScale = 1.1f;
            return vEImageTransformFilterParam;
        } else if (i2 != VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
            return null;
        } else {
            vEImageTransformFilterParam.beginScale = 1.1f;
            vEImageTransformFilterParam.endScale = 1.0f;
            return vEImageTransformFilterParam;
        }
    }

    private static boolean b(List<? extends VideoSegment> list) {
        if (k.a(list)) {
            return false;
        }
        if (list == null) {
            l.b();
        }
        for (VideoSegment videoSegment : list) {
            if (!(videoSegment.f125485i || h.a(videoSegment.a(false), true))) {
                return true;
            }
        }
        return false;
    }

    public final void a(VideoSegment videoSegment) {
        VEImageTransformFilterParam a2;
        if (f.f125945d && this.f129508a != null && videoSegment != null) {
            a();
            if (this.f129509b && h.a(videoSegment.a(false), false) && (a2 = a(videoSegment.q)) != null) {
                com.ss.android.ugc.asve.editor.g gVar = this.f129508a;
                if (gVar == null) {
                    l.b();
                }
                int a3 = gVar.a(0, a2, (int) videoSegment.d(), (int) (videoSegment.e() - videoSegment.d()));
                com.ss.android.ugc.asve.editor.g gVar2 = this.f129508a;
                if (gVar2 == null) {
                    l.b();
                }
                gVar2.a(a3, a2);
                this.f129510c.add(Integer.valueOf(a3));
            }
        }
    }

    public final void a(List<? extends VideoSegment> list) {
        boolean z;
        String e2;
        if (!(!f.f125945d || this.f129508a == null || k.a(list))) {
            a();
            if (this.f129509b) {
                if (list == null) {
                    l.b();
                }
                if (!b(list)) {
                    for (VideoSegment videoSegment : list) {
                        videoSegment.q = VEClipAlgorithmParam.BINGO_EFFECT_NULL;
                    }
                    return;
                }
                int i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                long j2 = 0;
                for (VideoSegment videoSegment2 : list) {
                    long e3 = videoSegment2.e() - videoSegment2.d();
                    if (!videoSegment2.f125485i) {
                        String a2 = videoSegment2.a(false);
                        if (h.b(a2) || !((e2 = j.e(new File(a2))) == null || e2.length() == 0)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (h.a(a2, z)) {
                            videoSegment2.q = i2;
                            VEImageTransformFilterParam a3 = a(i2);
                            if (a3 != null) {
                                com.ss.android.ugc.asve.editor.g gVar = this.f129508a;
                                if (gVar == null) {
                                    l.b();
                                }
                                int a4 = gVar.a(0, a3, (int) j2, (int) (j2 + e3));
                                com.ss.android.ugc.asve.editor.g gVar2 = this.f129508a;
                                if (gVar2 == null) {
                                    l.b();
                                }
                                gVar2.a(a4, a3);
                                this.f129510c.add(Integer.valueOf(a4));
                            }
                        } else if (i2 == VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT) {
                            i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMIN;
                        } else {
                            i2 = VEClipAlgorithmParam.BINGO_EFFECT_ZOOMOUT;
                        }
                        j2 += e3;
                    }
                }
            }
        }
    }
}
