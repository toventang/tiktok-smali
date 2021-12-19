package com.ss.android.ugc.gamora.recorder.k;

import android.view.ScaleGestureDetector;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import h.f.b.l;
import h.p;
import h.u;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final d f147992a;

    /* renamed from: b  reason: collision with root package name */
    public final f f147993b;

    /* renamed from: c  reason: collision with root package name */
    public final m f147994c;

    /* renamed from: d  reason: collision with root package name */
    public final ShortVideoContext f147995d;

    /* renamed from: e  reason: collision with root package name */
    public final h<Long> f147996e;

    /* renamed from: f  reason: collision with root package name */
    public final h<Boolean> f147997f;

    /* renamed from: g  reason: collision with root package name */
    public final h<p<List<TimeSpeedModelExtension>, Long>> f147998g;

    /* renamed from: h  reason: collision with root package name */
    public final h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f147999h;

    /* renamed from: i  reason: collision with root package name */
    public final h<Integer> f148000i;

    /* renamed from: j  reason: collision with root package name */
    public final h<RetakeVideoContext> f148001j;

    /* renamed from: k  reason: collision with root package name */
    public final h<p<List<TimeSpeedModelExtension>, Long>> f148002k;

    /* renamed from: l  reason: collision with root package name */
    public final h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f148003l;

    /* renamed from: m  reason: collision with root package name */
    public final h<Boolean> f148004m;
    public final h<Boolean> n;
    public final h<Boolean> o;
    public final h<ScaleGestureDetector> p;
    public final h<VideoRecordGestureLayout.a> q;

    static {
        Covode.recordClassIndex(97571);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f147992a, jVar.f147992a) && l.a(this.f147993b, jVar.f147993b) && l.a(this.f147994c, jVar.f147994c) && l.a(this.f147995d, jVar.f147995d) && l.a(this.f147996e, jVar.f147996e) && l.a(this.f147997f, jVar.f147997f) && l.a(this.f147998g, jVar.f147998g) && l.a(this.f147999h, jVar.f147999h) && l.a(this.f148000i, jVar.f148000i) && l.a(this.f148001j, jVar.f148001j) && l.a(this.f148002k, jVar.f148002k) && l.a(this.f148003l, jVar.f148003l) && l.a(this.f148004m, jVar.f148004m) && l.a(this.n, jVar.n) && l.a(this.o, jVar.o) && l.a(this.p, jVar.p) && l.a(this.q, jVar.q);
    }

    public final int hashCode() {
        d dVar = this.f147992a;
        int i2 = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        f fVar = this.f147993b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        m mVar = this.f147994c;
        int hashCode3 = (hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        ShortVideoContext shortVideoContext = this.f147995d;
        int hashCode4 = (hashCode3 + (shortVideoContext != null ? shortVideoContext.hashCode() : 0)) * 31;
        h<Long> hVar = this.f147996e;
        int hashCode5 = (hashCode4 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        h<Boolean> hVar2 = this.f147997f;
        int hashCode6 = (hashCode5 + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        h<p<List<TimeSpeedModelExtension>, Long>> hVar3 = this.f147998g;
        int hashCode7 = (hashCode6 + (hVar3 != null ? hVar3.hashCode() : 0)) * 31;
        h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4 = this.f147999h;
        int hashCode8 = (hashCode7 + (hVar4 != null ? hVar4.hashCode() : 0)) * 31;
        h<Integer> hVar5 = this.f148000i;
        int hashCode9 = (hashCode8 + (hVar5 != null ? hVar5.hashCode() : 0)) * 31;
        h<RetakeVideoContext> hVar6 = this.f148001j;
        int hashCode10 = (hashCode9 + (hVar6 != null ? hVar6.hashCode() : 0)) * 31;
        h<p<List<TimeSpeedModelExtension>, Long>> hVar7 = this.f148002k;
        int hashCode11 = (hashCode10 + (hVar7 != null ? hVar7.hashCode() : 0)) * 31;
        h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8 = this.f148003l;
        int hashCode12 = (hashCode11 + (hVar8 != null ? hVar8.hashCode() : 0)) * 31;
        h<Boolean> hVar9 = this.f148004m;
        int hashCode13 = (hashCode12 + (hVar9 != null ? hVar9.hashCode() : 0)) * 31;
        h<Boolean> hVar10 = this.n;
        int hashCode14 = (hashCode13 + (hVar10 != null ? hVar10.hashCode() : 0)) * 31;
        h<Boolean> hVar11 = this.o;
        int hashCode15 = (hashCode14 + (hVar11 != null ? hVar11.hashCode() : 0)) * 31;
        h<ScaleGestureDetector> hVar12 = this.p;
        int hashCode16 = (hashCode15 + (hVar12 != null ? hVar12.hashCode() : 0)) * 31;
        h<VideoRecordGestureLayout.a> hVar13 = this.q;
        if (hVar13 != null) {
            i2 = hVar13.hashCode();
        }
        return hashCode16 + i2;
    }

    public final String toString() {
        return "RecordControlProgressSceneFactoryBuildParam(cameraApiComponent=" + this.f147992a + ", diContainer=" + this.f147993b + ", recordControlApi=" + this.f147994c + ", shortVideoContext=" + this.f147995d + ", progressMaxDuration=" + this.f147996e + ", progressNeedDrawAnchor=" + this.f147997f + ", progressClipAnchors=" + this.f147998g + ", progressClipWithStitch=" + this.f147999h + ", retakeState=" + this.f148000i + ", retakeVideoContext=" + this.f148001j + ", retakeProgressClipAnchors=" + this.f148002k + ", retakeProgressClipWithStitch=" + this.f148003l + ", progressSegmentVisible=" + this.f148004m + ", enableTopMarginEvent=" + this.n + ", relayoutEvent=" + this.o + ", scaleGestureDetector=" + this.p + ", onGestureListener=" + this.q + ")";
    }

    public j(d dVar, f fVar, m mVar, ShortVideoContext shortVideoContext, h<Long> hVar, h<Boolean> hVar2, h<p<List<TimeSpeedModelExtension>, Long>> hVar3, h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar4, h<Integer> hVar5, h<RetakeVideoContext> hVar6, h<p<List<TimeSpeedModelExtension>, Long>> hVar7, h<u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> hVar8, h<Boolean> hVar9, h<Boolean> hVar10, h<Boolean> hVar11, h<ScaleGestureDetector> hVar12, h<VideoRecordGestureLayout.a> hVar13) {
        l.d(dVar, "");
        l.d(fVar, "");
        l.d(mVar, "");
        l.d(shortVideoContext, "");
        l.d(hVar, "");
        l.d(hVar2, "");
        l.d(hVar3, "");
        l.d(hVar4, "");
        l.d(hVar5, "");
        l.d(hVar6, "");
        l.d(hVar7, "");
        l.d(hVar8, "");
        l.d(hVar9, "");
        this.f147992a = dVar;
        this.f147993b = fVar;
        this.f147994c = mVar;
        this.f147995d = shortVideoContext;
        this.f147996e = hVar;
        this.f147997f = hVar2;
        this.f147998g = hVar3;
        this.f147999h = hVar4;
        this.f148000i = hVar5;
        this.f148001j = hVar6;
        this.f148002k = hVar7;
        this.f148003l = hVar8;
        this.f148004m = hVar9;
        this.n = hVar10;
        this.o = hVar11;
        this.p = hVar12;
        this.q = hVar13;
    }
}
