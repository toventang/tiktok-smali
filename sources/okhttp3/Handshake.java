package okhttp3;

import com.bytedance.covode.number.Covode;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.Util;

public final class Handshake {
    private final CipherSuite cipherSuite;
    private final List<Certificate> localCertificates;
    private final List<Certificate> peerCertificates;
    private final TlsVersion tlsVersion;

    static {
        Covode.recordClassIndex(106150);
    }

    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    public final List<Certificate> peerCertificates() {
        return this.peerCertificates;
    }

    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    public final Principal localPrincipal() {
        if (!this.localCertificates.isEmpty()) {
            return ((X509Certificate) this.localCertificates.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final Principal peerPrincipal() {
        if (!this.peerCertificates.isEmpty()) {
            return ((X509Certificate) this.peerCertificates.get(0)).getSubjectX500Principal();
        }
        return null;
    }

    public final int hashCode() {
        return ((((((this.tlsVersion.hashCode() + 527) * 31) + this.cipherSuite.hashCode()) * 31) + this.peerCertificates.hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Handshake)) {
            return false;
        }
        Handshake handshake = (Handshake) obj;
        if (!this.tlsVersion.equals(handshake.tlsVersion) || !this.cipherSuite.equals(handshake.cipherSuite) || !this.peerCertificates.equals(handshake.peerCertificates) || !this.localCertificates.equals(handshake.localCertificates)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Handshake get(javax.net.ssl.SSLSession r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Handshake.get(javax.net.ssl.SSLSession):okhttp3.Handshake");
    }

    private Handshake(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<Certificate> list, List<Certificate> list2) {
        this.tlsVersion = tlsVersion2;
        this.cipherSuite = cipherSuite2;
        this.peerCertificates = list;
        this.localCertificates = list2;
    }

    public static Handshake get(TlsVersion tlsVersion2, CipherSuite cipherSuite2, List<Certificate> list, List<Certificate> list2) {
        Objects.requireNonNull(tlsVersion2, "tlsVersion == null");
        Objects.requireNonNull(cipherSuite2, "cipherSuite == null");
        return new Handshake(tlsVersion2, cipherSuite2, Util.immutableList(list), Util.immutableList(list2));
    }
}
