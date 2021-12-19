package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import h.c.f;
import kotlinx.coroutines.ax;
import kotlinx.coroutines.bh;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.m;

/* access modifiers changed from: package-private */
public final class q extends ci implements ax {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f159152a;

    /* renamed from: c  reason: collision with root package name */
    private final String f159153c;

    static {
        Covode.recordClassIndex(105669);
    }

    private final Void a() {
        String str;
        if (this.f159152a != null) {
            StringBuilder sb = new StringBuilder("Module with the Main dispatcher had failed to initialize");
            String str2 = this.f159153c;
            if (str2 == null || (str = ". ".concat(String.valueOf(str2))) == null) {
                str = "";
            }
            throw new IllegalStateException(sb.append((Object) str).toString(), this.f159152a);
        }
        p.a();
        throw null;
    }

    @Override // kotlinx.coroutines.ah
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Main[missing");
        if (this.f159152a != null) {
            str = ", cause=" + this.f159152a;
        } else {
            str = "";
        }
        return sb.append(str).append(']').toString();
    }

    @Override // kotlinx.coroutines.ah
    public final boolean isDispatchNeeded(f fVar) {
        a();
        throw null;
    }

    public q(Throwable th, String str) {
        this.f159152a = th;
        this.f159153c = str;
    }

    @Override // kotlinx.coroutines.ah
    public final /* synthetic */ void dispatch(f fVar, Runnable runnable) {
        a();
        throw null;
    }

    @Override // kotlinx.coroutines.ax
    public final bh invokeOnTimeout(long j2, Runnable runnable) {
        a();
        throw null;
    }

    @Override // kotlinx.coroutines.ax
    public final /* synthetic */ void scheduleResumeAfterDelay(long j2, m mVar) {
        a();
        throw null;
    }
}
