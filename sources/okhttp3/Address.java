package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

public final class Address {
    final CertificatePinner certificatePinner;
    final List<ConnectionSpec> connectionSpecs;
    final Dns dns;
    final HostnameVerifier hostnameVerifier;
    final List<Protocol> protocols;
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final HttpUrl url;

    static {
        Covode.recordClassIndex(106109);
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int hashCode = (((((((((((this.url.hashCode() + 527) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31;
        Proxy proxy2 = this.proxy;
        int i5 = 0;
        if (proxy2 != null) {
            i2 = proxy2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 31;
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        if (sSLSocketFactory != null) {
            i3 = sSLSocketFactory.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        HostnameVerifier hostnameVerifier2 = this.hostnameVerifier;
        if (hostnameVerifier2 != null) {
            i4 = hostnameVerifier2.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        CertificatePinner certificatePinner2 = this.certificatePinner;
        if (certificatePinner2 != null) {
            i5 = certificatePinner2.hashCode();
        }
        return i8 + i5;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("Address{").append(this.url.host()).append(":").append(this.url.port());
        if (this.proxy != null) {
            append.append(", proxy=").append(this.proxy);
        } else {
            append.append(", proxySelector=").append(this.proxySelector);
        }
        append.append("}");
        return append.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        if (!this.url.equals(address.url) || !equalsNonHost(address)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean equalsNonHost(Address address) {
        if (!this.dns.equals(address.dns) || !this.proxyAuthenticator.equals(address.proxyAuthenticator) || !this.protocols.equals(address.protocols) || !this.connectionSpecs.equals(address.connectionSpecs) || !this.proxySelector.equals(address.proxySelector) || !Util.equal(this.proxy, address.proxy) || !Util.equal(this.sslSocketFactory, address.sslSocketFactory) || !Util.equal(this.hostnameVerifier, address.hostnameVerifier) || !Util.equal(this.certificatePinner, address.certificatePinner) || url().port() != address.url().port()) {
            return false;
        }
        return true;
    }

    public Address(String str, int i2, Dns dns2, SocketFactory socketFactory2, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier2, CertificatePinner certificatePinner2, Authenticator authenticator, Proxy proxy2, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector2) {
        String str2;
        HttpUrl.Builder builder = new HttpUrl.Builder();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.url = builder.scheme(str2).host(str).port(i2).build();
        Objects.requireNonNull(dns2, "dns == null");
        this.dns = dns2;
        Objects.requireNonNull(socketFactory2, "socketFactory == null");
        this.socketFactory = socketFactory2;
        Objects.requireNonNull(authenticator, "proxyAuthenticator == null");
        this.proxyAuthenticator = authenticator;
        Objects.requireNonNull(list, "protocols == null");
        this.protocols = Util.immutableList(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.connectionSpecs = Util.immutableList(list2);
        Objects.requireNonNull(proxySelector2, "proxySelector == null");
        this.proxySelector = proxySelector2;
        this.proxy = proxy2;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier2;
        this.certificatePinner = certificatePinner2;
    }
}
