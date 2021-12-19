package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.concurrent.CancellationException;

public final class ca extends CancellationException implements af<ca> {
    public final bz job;

    static {
        Covode.recordClassIndex(105592);
    }

    public final Throwable fillInStackTrace() {
        if (ar.f159022b) {
            return super.fillInStackTrace();
        }
        return this;
    }

    @Override // kotlinx.coroutines.af
    public final ca createCopy() {
        if (!ar.f159022b) {
            return null;
        }
        String message = getMessage();
        if (message == null) {
            l.a();
        }
        return new ca(message, this, this.job);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.job;
    }

    public final int hashCode() {
        int i2;
        String message = getMessage();
        if (message == null) {
            l.a();
        }
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i2 = cause.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        if (!l.a((Object) caVar.getMessage(), (Object) getMessage()) || !l.a(caVar.job, this.job) || !l.a(caVar.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public ca(String str, Throwable th, bz bzVar) {
        super(str);
        this.job = bzVar;
        if (th != null) {
            initCause(th);
        }
    }
}
