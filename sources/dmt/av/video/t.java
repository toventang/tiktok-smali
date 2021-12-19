package dmt.av.video;

import com.bytedance.covode.number.Covode;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f156954a;

    /* renamed from: b  reason: collision with root package name */
    public final long f156955b;

    static {
        Covode.recordClassIndex(104249);
    }

    public static t a() {
        return new t(0);
    }

    public static t b() {
        return new t(1);
    }

    public final String toString() {
        return "VEPreviewControlOp{mType=" + this.f156954a + ", mSeekTo=" + this.f156955b + '}';
    }

    private t(int i2) {
        this(i2, 0);
    }

    public static t c(long j2) {
        return new t(4, j2);
    }

    public static t a(long j2) {
        return new t(2, j2);
    }

    public static t b(long j2) {
        return new t(3, j2);
    }

    private t(int i2, long j2) {
        this.f156954a = i2;
        this.f156955b = j2;
    }
}
