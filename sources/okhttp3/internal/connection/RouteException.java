package okhttp3.internal.connection;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import okhttp3.internal.Util;

public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    static {
        Covode.recordClassIndex(106221);
    }

    public final IOException getFirstConnectException() {
        return this.firstException;
    }

    public final IOException getLastConnectException() {
        return this.lastException;
    }

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        Util.addSuppressedIfPossible(this.firstException, iOException);
        this.lastException = iOException;
    }
}
