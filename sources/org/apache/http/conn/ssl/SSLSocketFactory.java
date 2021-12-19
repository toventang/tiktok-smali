package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.LayeredSchemeSocketFactory;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SchemeLayeredSocketFactory;

public class SSLSocketFactory implements LayeredSchemeSocketFactory, LayeredSocketFactory, SchemeLayeredSocketFactory {
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new AllowAllHostnameVerifier();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    private static final char[] EMPTY_PASSWORD = "".toCharArray();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    private volatile X509HostnameVerifier hostnameVerifier;
    private final HostNameResolver nameResolver;
    private final javax.net.ssl.SSLSocketFactory socketfactory;

    public static SSLSocketFactory getSocketFactory() {
        return new SSLSocketFactory(createDefaultSSLContext());
    }

    private static SSLContext createDefaultSSLContext() {
        try {
            return createSSLContext("TLS", null, null, null, null, null);
        } catch (Exception e2) {
            throw new SSLInitializationException("Failure initializing default SSL context", e2);
        }
    }

    static {
        Covode.recordClassIndex(106407);
    }

    public SSLSocketFactory(SSLContext sSLContext) {
        this(sSLContext, BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }

    public SSLSocketFactory(SSLContext sSLContext, X509HostnameVerifier x509HostnameVerifier) {
        if (sSLContext != null) {
            this.socketfactory = sSLContext.getSocketFactory();
            this.hostnameVerifier = x509HostnameVerifier;
            this.nameResolver = null;
            return;
        }
        throw new IllegalArgumentException("SSL context may not be null");
    }

    private static SSLContext createSSLContext(String str, KeyStore keyStore, String str2, KeyStore keyStore2, SecureRandom secureRandom, TrustStrategy trustStrategy) {
        char[] cArr;
        if (str == null) {
            str = "TLS";
        }
        KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        if (str2 != null) {
            cArr = str2.toCharArray();
        } else {
            cArr = null;
        }
        instance.init(keyStore, cArr);
        KeyManager[] keyManagers = instance.getKeyManagers();
        TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance2.init(keyStore2);
        TrustManager[] trustManagers = instance2.getTrustManagers();
        if (!(trustManagers == null || trustStrategy == null)) {
            for (int i2 = 0; i2 < trustManagers.length; i2++) {
                TrustManager trustManager = trustManagers[i2];
                if (trustManager instanceof X509TrustManager) {
                    trustManagers[i2] = new TrustManagerDecorator((X509TrustManager) trustManager, trustStrategy);
                }
            }
        }
        SSLContext instance3 = SSLContext.getInstance(str);
        instance3.init(keyManagers, trustManagers, secureRandom);
        return instance3;
    }
}
