package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import h.f.b.l;
import h.p;
import java.util.List;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f126234e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public float f126235a;

    /* renamed from: b  reason: collision with root package name */
    public long f126236b;

    /* renamed from: c  reason: collision with root package name */
    public long f126237c;

    /* renamed from: d  reason: collision with root package name */
    public long f126238d;

    /* renamed from: f  reason: collision with root package name */
    private float f126239f;

    static {
        Covode.recordClassIndex(82872);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82873);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public b(float f2) {
        this.f126239f = f2;
    }

    public final void b(long j2) {
        long min = Math.min(this.f126236b, j2);
        this.f126236b = min;
        this.f126235a = ((float) min) / this.f126239f;
    }

    public final void a(long j2) {
        long min = Math.min(Math.min(this.f126236b, j2), this.f126237c);
        this.f126236b = min;
        this.f126235a = ((float) min) / this.f126239f;
    }

    public static final long a(List<? extends VideoSegment> list, float f2) {
        l.d(list, "");
        if (h.a(list)) {
            return 0;
        }
        float f3 = 0.0f;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f125485i) {
                f3 += ((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * f2);
            }
        }
        return (long) f3;
    }

    public final void a(long j2, float f2) {
        long min = Math.min(Math.min(this.f126236b, (long) (((float) j2) / f2)), this.f126237c);
        this.f126236b = min;
        this.f126235a = ((float) min) / this.f126239f;
    }

    public static final p<Integer, Float> a(long j2, float f2, int i2, List<? extends VideoSegment> list) {
        l.d(list, "");
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        for (VideoSegment videoSegment : list) {
            if (!videoSegment.f125485i) {
                float f5 = (float) j2;
                if (f5 < f3) {
                    break;
                }
                float e2 = ((float) (videoSegment.e() - videoSegment.d())) / videoSegment.f();
                float f6 = f3 + e2;
                if (f5 >= f6) {
                    i3 += h.g.a.a((float) Math.ceil((double) (e2 / f2)));
                } else {
                    float f7 = f5 - f3;
                    int i4 = (int) (f7 / f2);
                    i3 += i4;
                    f4 = ((f7 - (((float) i4) * f2)) / f2) * ((float) i2);
                }
                f3 = f6;
            }
        }
        return new p<>(Integer.valueOf(i3), Float.valueOf(f4));
    }
}
