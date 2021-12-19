package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;

public class cc extends JobSupport implements z {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f159083a;

    static {
        Covode.recordClassIndex(105594);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean cH_() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean cI_() {
        return this.f159083a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cc(bz bzVar) {
        super(true);
        JobSupport jobSupport;
        boolean z = true;
        a(bzVar);
        s sVar = (s) this._parentHandle;
        t tVar = (t) (!(sVar instanceof t) ? null : sVar);
        if (tVar != null && (jobSupport = (JobSupport) tVar.f159084c) != null) {
            while (true) {
                if (!jobSupport.cI_()) {
                    s sVar2 = (s) jobSupport._parentHandle;
                    t tVar2 = (t) (!(sVar2 instanceof t) ? null : sVar2);
                    if (tVar2 != null) {
                        jobSupport = (JobSupport) tVar2.f159084c;
                        if (jobSupport == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        this.f159083a = z;
    }
}
