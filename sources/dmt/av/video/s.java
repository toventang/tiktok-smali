package dmt.av.video;

import com.bytedance.covode.number.Covode;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public int f156950a;

    /* renamed from: b  reason: collision with root package name */
    public int f156951b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f156952c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f156953d;

    static {
        Covode.recordClassIndex(104248);
    }

    public final String toString() {
        return "VEMusicStartChangeOp{mStartMillis=" + this.f156950a + ", mDuration=" + this.f156951b + ", isSoundLoop=" + this.f156952c + ", isFinishMusicAdjust=" + this.f156953d + '}';
    }

    public static s a(int i2, int i3, boolean z) {
        return new s(i2, i3, z);
    }

    private s(int i2, int i3, boolean z) {
        this.f156950a = i2;
        this.f156951b = i3;
        this.f156952c = z;
    }
}
