package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.j;
import com.squareup.a.q;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final q f57411a;

    /* renamed from: b  reason: collision with root package name */
    public final n f57412b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f57413c;

    /* renamed from: d  reason: collision with root package name */
    public final b f57414d;

    /* renamed from: e  reason: collision with root package name */
    public final List<u> f57415e;

    /* renamed from: f  reason: collision with root package name */
    public final List<k> f57416f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f57417g;

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f57418h;

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f57419i;

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f57420j;

    /* renamed from: k  reason: collision with root package name */
    public final f f57421k;

    static {
        Covode.recordClassIndex(35875);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int hashCode = (((((((((((this.f57411a.hashCode() + 527) * 31) + this.f57412b.hashCode()) * 31) + this.f57414d.hashCode()) * 31) + this.f57415e.hashCode()) * 31) + this.f57416f.hashCode()) * 31) + this.f57417g.hashCode()) * 31;
        Proxy proxy = this.f57418h;
        int i5 = 0;
        if (proxy != null) {
            i2 = proxy.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 31;
        SSLSocketFactory sSLSocketFactory = this.f57419i;
        if (sSLSocketFactory != null) {
            i3 = sSLSocketFactory.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        HostnameVerifier hostnameVerifier = this.f57420j;
        if (hostnameVerifier != null) {
            i4 = hostnameVerifier.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        f fVar = this.f57421k;
        if (fVar != null) {
            i5 = fVar.hashCode();
        }
        return i8 + i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!this.f57411a.equals(aVar.f57411a) || !this.f57412b.equals(aVar.f57412b) || !this.f57414d.equals(aVar.f57414d) || !this.f57415e.equals(aVar.f57415e) || !this.f57416f.equals(aVar.f57416f) || !this.f57417g.equals(aVar.f57417g) || !j.a(this.f57418h, aVar.f57418h) || !j.a(this.f57419i, aVar.f57419i) || !j.a(this.f57420j, aVar.f57420j) || !j.a(this.f57421k, aVar.f57421k)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public a(String str, int i2, n nVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, f fVar, b bVar, Proxy proxy, List<u> list, List<k> list2, ProxySelector proxySelector) {
        String str2;
        q.a aVar = new q.a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        if (str2.equalsIgnoreCase("http")) {
            aVar.f57888a = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            aVar.f57888a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
        }
        if (str != null) {
            String a2 = q.a.a(str, 0, str.length());
            if (a2 != null) {
                aVar.f57891d = a2;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i2)));
                }
                aVar.f57892e = i2;
                this.f57411a = aVar.b();
                if (nVar != null) {
                    this.f57412b = nVar;
                    if (socketFactory != null) {
                        this.f57413c = socketFactory;
                        if (bVar != null) {
                            this.f57414d = bVar;
                            if (list != null) {
                                this.f57415e = j.a(list);
                                if (list2 != null) {
                                    this.f57416f = j.a(list2);
                                    if (proxySelector != null) {
                                        this.f57417g = proxySelector;
                                        this.f57418h = proxy;
                                        this.f57419i = sSLSocketFactory;
                                        this.f57420j = hostnameVerifier;
                                        this.f57421k = fVar;
                                        return;
                                    }
                                    throw new IllegalArgumentException("proxySelector == null");
                                }
                                throw new IllegalArgumentException("connectionSpecs == null");
                            }
                            throw new IllegalArgumentException("protocols == null");
                        }
                        throw new IllegalArgumentException("authenticator == null");
                    }
                    throw new IllegalArgumentException("socketFactory == null");
                }
                throw new IllegalArgumentException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("host == null");
    }
}
