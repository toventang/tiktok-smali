package okhttp3.internal.connection;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.ConnectionSpec;
import okhttp3.internal.Internal;

public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    static {
        Covode.recordClassIndex(106217);
    }

    public ConnectionSpecSelector(List<ConnectionSpec> list) {
        this.connectionSpecs = list;
    }

    private boolean isFallbackPossible(SSLSocket sSLSocket) {
        for (int i2 = this.nextModeIndex; i2 < this.connectionSpecs.size(); i2++) {
            if (this.connectionSpecs.get(i2).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final boolean connectionFailed(IOException iOException) {
        this.isFallback = true;
        if (!this.isFallbackPossible || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }

    public final ConnectionSpec configureSecureSocket(SSLSocket sSLSocket) {
        int size = this.connectionSpecs.size();
        for (int i2 = this.nextModeIndex; i2 < size; i2++) {
            ConnectionSpec connectionSpec = this.connectionSpecs.get(i2);
            if (connectionSpec.isCompatible(sSLSocket)) {
                this.nextModeIndex = i2 + 1;
                this.isFallbackPossible = isFallbackPossible(sSLSocket);
                Internal.instance.apply(connectionSpec, sSLSocket, this.isFallback);
                return connectionSpec;
            }
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.isFallback + ", modes=" + this.connectionSpecs + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
