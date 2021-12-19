package okhttp3;

import com.bytedance.covode.number.Covode;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.i;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;

public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        static {
            Covode.recordClassIndex(106126);
        }

        public final CertificatePinner build() {
            return new CertificatePinner(new LinkedHashSet(this.pins), null);
        }

        public final Builder add(String str, String... strArr) {
            Objects.requireNonNull(str, "pattern == null");
            for (String str2 : strArr) {
                this.pins.add(new Pin(str, str2));
            }
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Pin {
        final String canonicalHostname;
        final i hash;
        final String hashAlgorithm;
        final String pattern;

        static {
            Covode.recordClassIndex(106127);
        }

        public final int hashCode() {
            return ((((this.pattern.hashCode() + 527) * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final String toString() {
            return this.hashAlgorithm + this.hash.base64();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (!this.pattern.equals(pin.pattern) || !this.hashAlgorithm.equals(pin.hashAlgorithm) || !this.hash.equals(pin.hash)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final boolean matches(String str) {
            if (!this.pattern.startsWith("*.")) {
                return str.equals(this.canonicalHostname);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 != this.canonicalHostname.length()) {
                return false;
            }
            String str2 = this.canonicalHostname;
            if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                return true;
            }
            return false;
        }

        Pin(String str, String str2) {
            String host;
            this.pattern = str;
            if (str.startsWith("*.")) {
                host = HttpUrl.get("http://" + str.substring(2)).host();
            } else {
                host = HttpUrl.get("http://".concat(String.valueOf(str))).host();
            }
            this.canonicalHostname = host;
            if (str2.startsWith("sha1/")) {
                this.hashAlgorithm = "sha1/";
                this.hash = i.decodeBase64(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.hashAlgorithm = "sha256/";
                this.hash = i.decodeBase64(str2.substring(7));
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(String.valueOf(str2)));
            }
            if (this.hash == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(String.valueOf(str2)));
            }
        }
    }

    static {
        Covode.recordClassIndex(106125);
    }

    public final int hashCode() {
        int i2;
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        if (certificateChainCleaner2 != null) {
            i2 = certificateChainCleaner2.hashCode();
        } else {
            i2 = 0;
        }
        return (i2 * 31) + this.pins.hashCode();
    }

    static i sha1(X509Certificate x509Certificate) {
        return i.of(x509Certificate.getPublicKey().getEncoded()).sha1();
    }

    static i sha256(X509Certificate x509Certificate) {
        return i.of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* access modifiers changed from: package-private */
    public final CertificatePinner withCertificateChainCleaner(CertificateChainCleaner certificateChainCleaner2) {
        if (Util.equal(this.certificateChainCleaner, certificateChainCleaner2)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public static String pin(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + sha256((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        if (!Util.equal(this.certificateChainCleaner, certificatePinner.certificateChainCleaner) || !this.pins.equals(certificatePinner.pins)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final List<Pin> findMatchingPins(String str) {
        List<Pin> emptyList = Collections.emptyList();
        for (Pin pin : this.pins) {
            if (pin.matches(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(pin);
            }
        }
        return emptyList;
    }

    CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public final void check(String str, Certificate... certificateArr) {
        check(str, Arrays.asList(certificateArr));
    }

    public final void check(String str, List<Certificate> list) {
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (!findMatchingPins.isEmpty()) {
            CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
            if (certificateChainCleaner2 != null) {
                list = certificateChainCleaner2.clean(list, str);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                int size2 = findMatchingPins.size();
                i iVar = null;
                i iVar2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    Pin pin = findMatchingPins.get(i3);
                    if (pin.hashAlgorithm.equals("sha256/")) {
                        if (iVar == null) {
                            iVar = sha256(x509Certificate);
                        }
                        if (pin.hash.equals(iVar)) {
                            return;
                        }
                    } else if (pin.hashAlgorithm.equals("sha1/")) {
                        if (iVar2 == null) {
                            iVar2 = sha1(x509Certificate);
                        }
                        if (pin.hash.equals(iVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.hashAlgorithm);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i4);
                sb.append("\n    ").append(pin(x509Certificate2)).append(": ").append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ").append(str).append(":");
            int size4 = findMatchingPins.size();
            for (int i5 = 0; i5 < size4; i5++) {
                sb.append("\n    ").append(findMatchingPins.get(i5));
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }
}
