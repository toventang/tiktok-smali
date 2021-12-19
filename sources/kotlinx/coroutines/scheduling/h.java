package kotlinx.coroutines.scheduling;

import com.bytedance.covode.number.Covode;

public abstract class h implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public long f159202g;

    /* renamed from: h  reason: collision with root package name */
    public i f159203h;

    static {
        Covode.recordClassIndex(105704);
    }

    public h() {
        this(0, g.f159200a);
    }

    public h(long j2, i iVar) {
        this.f159202g = j2;
        this.f159203h = iVar;
    }
}
