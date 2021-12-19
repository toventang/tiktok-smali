package okhttp3.internal.platform;

import com.bytedance.covode.number.Covode;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;

public class ConscryptPlatform extends Platform {
    static {
        Covode.recordClassIndex(106305);
    }

    private ConscryptPlatform() {
    }

    private Provider getProvider() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public static ConscryptPlatform buildIfSupported() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new ConscryptPlatform();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext getSSLContext() {
        try {
            return SSLContext.getInstance("TLSv1.3", getProvider());
        } catch (NoSuchAlgorithmException e2) {
            try {
                return SSLContext.getInstance("TLS", getProvider());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e2);
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.getSelectedProtocol(sSLSocket);
    }

    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.trustManager(sSLSocketFactory);
        }
        try {
            Object readFieldOrNull = readFieldOrNull(sSLSocketFactory, Object.class, "sslParameters");
            if (readFieldOrNull != null) {
                return (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e2) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.alpnProtocolNames(list).toArray(new String[0]));
            return;
        }
        super.configureTlsExtensions(sSLSocket, str, list);
    }
}
