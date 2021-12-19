package k;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public final class z extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Logger f158924a = Logger.getLogger("okio.Okio");

    /* renamed from: b  reason: collision with root package name */
    private final Socket f158925b;

    static {
        Covode.recordClassIndex(105454);
    }

    /* access modifiers changed from: protected */
    @Override // k.d
    public final void timedOut() {
        try {
            this.f158925b.close();
        } catch (Exception e2) {
            this.f158924a.log(Level.WARNING, "Failed to close timed out socket " + this.f158925b, (Throwable) e2);
        } catch (AssertionError e3) {
            if (q.a(e3)) {
                this.f158924a.log(Level.WARNING, "Failed to close timed out socket " + this.f158925b, (Throwable) e3);
                return;
            }
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    @Override // k.d
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public z(Socket socket) {
        l.c(socket, "");
        this.f158925b = socket;
    }
}
