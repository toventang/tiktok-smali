package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final a f57952a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f57953b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f57954c;

    static {
        Covode.recordClassIndex(36029);
    }

    public final int hashCode() {
        return ((((this.f57952a.hashCode() + 527) * 31) + this.f57953b.hashCode()) * 31) + this.f57954c.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (!this.f57952a.equals(zVar.f57952a) || !this.f57953b.equals(zVar.f57953b) || !this.f57954c.equals(zVar.f57954c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public z(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f57952a = aVar;
        this.f57953b = proxy;
        this.f57954c = inetSocketAddress;
    }
}
