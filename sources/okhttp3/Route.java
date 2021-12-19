package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

public final class Route {
    final Address address;
    final InetSocketAddress inetSocketAddress;
    final Proxy proxy;

    static {
        Covode.recordClassIndex(106183);
    }

    public final Address address() {
        return this.address;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final InetSocketAddress socketAddress() {
        return this.inetSocketAddress;
    }

    public final int hashCode() {
        return ((((this.address.hashCode() + 527) * 31) + this.proxy.hashCode()) * 31) + this.inetSocketAddress.hashCode();
    }

    public final boolean requiresTunnel() {
        if (this.address.sslSocketFactory == null || this.proxy.type() != Proxy.Type.HTTP) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Route{" + this.inetSocketAddress + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        if (!route.address.equals(this.address) || !route.proxy.equals(this.proxy) || !route.inetSocketAddress.equals(this.inetSocketAddress)) {
            return false;
        }
        return true;
    }

    public Route(Address address2, Proxy proxy2, InetSocketAddress inetSocketAddress2) {
        Objects.requireNonNull(address2, "address == null");
        Objects.requireNonNull(proxy2, "proxy == null");
        Objects.requireNonNull(inetSocketAddress2, "inetSocketAddress == null");
        this.address = address2;
        this.proxy = proxy2;
        this.inetSocketAddress = inetSocketAddress2;
    }
}
