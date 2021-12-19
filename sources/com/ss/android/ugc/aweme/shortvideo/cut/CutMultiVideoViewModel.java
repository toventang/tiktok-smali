package com.ss.android.ugc.aweme.shortvideo.cut;

import androidx.core.g.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CutMultiVideoViewModel extends ac implements au {

    /* renamed from: a  reason: collision with root package name */
    public t<e<Integer, Integer>> f125326a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public t<Long> f125327b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public t<Long> f125328c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public t<Float> f125329d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public t<Void> f125330e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public t<VideoSegment> f125331f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public t<e<Integer, Integer>> f125332g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public t<Void> f125333h = new t<>();

    /* renamed from: i  reason: collision with root package name */
    public t<Void> f125334i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public t<f> f125335j = new t<>();

    /* renamed from: k  reason: collision with root package name */
    public boolean f125336k;

    /* renamed from: l  reason: collision with root package name */
    public int f125337l;

    /* renamed from: m  reason: collision with root package name */
    public long f125338m;
    private HashMap<String, Integer> n = new HashMap<>();

    static {
        Covode.recordClassIndex(82277);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public final void b() {
        this.f125330e.setValue(null);
    }

    public final void c() {
        this.f125333h.setValue(null);
    }

    public final void d() {
        this.f125334i.setValue(null);
    }

    public final void a() {
        this.f125326a.setValue(e.a(0, 0));
    }

    public final void a(VideoSegment videoSegment) {
        this.f125331f.setValue(videoSegment);
    }

    public final void a(f fVar) {
        this.f125335j.setValue(fVar);
    }

    public final void a(String str) {
        this.n.put(str, 1);
    }

    public final void a(int i2, int i3) {
        this.f125332g.setValue(e.a(Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public final void a(long j2, List<VideoSegment> list, float f2) {
        int i2;
        this.f125328c.setValue(Long.valueOf(j2));
        if (this.f125326a.getValue() != null) {
            i2 = this.f125326a.getValue().f2398b.intValue();
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!list.get(i3).f125485i) {
                arrayList.add(list.get(i3));
            }
        }
        long j3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i4);
            j3 = (long) (((float) j3) + (((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * f2)));
            if (j3 > j2) {
                this.f125326a.setValue(e.a(Integer.valueOf(i2), Integer.valueOf(i4)));
                return;
            }
        }
    }
}
