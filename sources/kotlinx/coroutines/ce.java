package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.w;
import kotlinx.coroutines.bz;

public abstract class ce<J extends bz> extends ad implements bh, bu {

    /* renamed from: c  reason: collision with root package name */
    public final J f159084c;

    static {
        Covode.recordClassIndex(105596);
    }

    @Override // kotlinx.coroutines.bu
    public cj getList() {
        return null;
    }

    @Override // kotlinx.coroutines.bu
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.bh
    public final void cJ_() {
        Object p;
        J j2 = this.f159084c;
        if (j2 != null) {
            JobSupport jobSupport = (JobSupport) j2;
            do {
                p = jobSupport.p();
                if (p instanceof ce) {
                    if (p != this) {
                        return;
                    }
                } else if ((p instanceof bu) && ((bu) p).getList() != null) {
                    cK_();
                    return;
                } else {
                    return;
                }
            } while (!JobSupport.f158935d.compareAndSet(jobSupport, p, cf.f159091g));
            return;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public ce(J j2) {
        this.f159084c = j2;
    }
}
