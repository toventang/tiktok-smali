package com.ss.android.ugc.aweme.shortvideo.cut.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.m;
import com.ss.android.ugc.tools.a;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.d;
import com.ss.android.ugc.tools.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, Float> f125490a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Float> f125491b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public long f125492c;

    /* renamed from: d  reason: collision with root package name */
    public long f125493d;

    /* renamed from: e  reason: collision with root package name */
    public float f125494e;

    /* renamed from: f  reason: collision with root package name */
    public long f125495f;

    /* renamed from: g  reason: collision with root package name */
    public float f125496g;

    /* renamed from: h  reason: collision with root package name */
    public long f125497h;

    /* renamed from: i  reason: collision with root package name */
    public long f125498i;

    /* renamed from: j  reason: collision with root package name */
    private float f125499j;

    static {
        Covode.recordClassIndex(82361);
    }

    public final void a(String str, float f2) {
        this.f125490a.put(str, Float.valueOf(f2));
    }

    public b(List<VideoSegment> list, float f2) {
        this.f125499j = f2;
        for (VideoSegment videoSegment : list) {
            this.f125490a.put(videoSegment.a(true), Float.valueOf(videoSegment.f()));
        }
    }

    public final void a(List<VideoSegment> list, float f2) {
        long j2;
        int size;
        if (d.a(list)) {
            c.f149151f.c("videoSegmentList is empty");
            j2 = 0;
        } else {
            float f3 = 0.0f;
            for (VideoSegment videoSegment : list) {
                if (!videoSegment.f125485i) {
                    f3 += ((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * f2);
                }
            }
            j2 = (long) f3;
        }
        this.f125492c = j2;
        this.f125495f = m.a(j2);
        j jVar = c.f149151f;
        StringBuilder append = new StringBuilder("videoMultiDur: ").append(this.f125492c).append(" maxCutDuration is ").append(this.f125495f).append(" videoSize is ");
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        jVar.c(append.append(size).toString());
        long j3 = this.f125497h;
        if (j3 > 0) {
            this.f125495f = Math.min(this.f125492c, j3);
        }
        float f4 = ((float) this.f125495f) / this.f125499j;
        this.f125494e = f4;
        this.f125496g = (((float) a.f149054l.f149063h) * 1.0f) / f4;
        long j4 = this.f125498i;
        if (j4 > 0) {
            this.f125496g = ((float) j4) / this.f125494e;
        }
        for (Map.Entry<String, Float> entry : this.f125490a.entrySet()) {
            this.f125491b.put(entry.getKey(), Float.valueOf(this.f125494e * entry.getValue().floatValue() * f2));
        }
    }

    public static long a(List<VideoSegment> list, float f2, float f3) {
        float d2;
        float f4;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!list.get(i3).f125485i) {
                arrayList.add(list.get(i3));
            }
        }
        long j2 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            VideoSegment videoSegment = (VideoSegment) arrayList.get(i4);
            long e2 = (long) (((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * f3));
            float f5 = (float) e2;
            if (f2 <= f5) {
                i2 = i4;
                break;
            }
            j2 += e2;
            f2 -= f5;
            i4++;
        }
        if (i4 == arrayList.size()) {
            return j2;
        }
        if (i2 != 0 || ((VideoSegment) arrayList.get(i2)).f() == 0.0f) {
            d2 = (float) (j2 + ((VideoSegment) arrayList.get(i2)).d());
            f4 = ((VideoSegment) arrayList.get(i2)).f();
        } else {
            d2 = (float) j2;
            f4 = ((VideoSegment) arrayList.get(i2)).f();
        }
        return (long) (d2 + (f2 * f4 * f3));
    }

    public final void a(long j2, String str, float f2, int i2) {
        long j3 = (long) (((float) j2) / f2);
        this.f125493d = j3;
        this.f125495f = m.a(j3);
        c.f149151f.c("path: " + str + " maxCutDuration is " + this.f125495f);
        long j4 = this.f125497h;
        if (j4 > 0) {
            this.f125495f = Math.min(j4, this.f125493d);
        }
        float f3 = ((float) this.f125495f) / this.f125499j;
        this.f125494e = f3;
        if (i2 == 0) {
            this.f125496g = (((float) a.f149054l.f149063h) * 1.0f) / f3;
        } else {
            this.f125496g = 500.0f / f3;
        }
        long j5 = this.f125498i;
        if (j5 > 0) {
            this.f125496g = ((float) j5) / this.f125494e;
        }
        this.f125491b.put(str, Float.valueOf(this.f125494e * f2));
    }
}
