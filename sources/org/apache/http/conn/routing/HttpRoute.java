package org.apache.http.conn.routing;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.LangUtils;

public final class HttpRoute implements Cloneable, RouteInfo {
    private static final HttpHost[] EMPTY_HTTP_HOST_ARRAY = new HttpHost[0];
    private final RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private final HttpHost[] proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final RouteInfo.TunnelType tunnelled;

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int getHopCount() {
        return this.proxyChain.length + 1;
    }

    static {
        Covode.recordClassIndex(106386);
    }

    public final int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.targetHost), this.localAddress);
        int i2 = 0;
        while (true) {
            HttpHost[] httpHostArr = this.proxyChain;
            if (i2 >= httpHostArr.length) {
                return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(hashCode, this.secure), this.tunnelled), this.layered);
            }
            hashCode = LangUtils.hashCode(hashCode, httpHostArr[i2]);
            i2++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        for (HttpHost httpHost : this.proxyChain) {
            sb.append(httpHost);
            sb.append("->");
        }
        sb.append(this.targetHost);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpRoute) {
            HttpRoute httpRoute = (HttpRoute) obj;
            if (this.secure != httpRoute.secure || this.tunnelled != httpRoute.tunnelled || this.layered != httpRoute.layered || !LangUtils.equals(this.targetHost, httpRoute.targetHost) || !LangUtils.equals(this.localAddress, httpRoute.localAddress) || !LangUtils.equals((Object[]) this.proxyChain, (Object[]) httpRoute.proxyChain)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
