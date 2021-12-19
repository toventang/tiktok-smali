package com.squareup.a.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.k;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f57422a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f57423b;

    /* renamed from: c  reason: collision with root package name */
    private final List<k> f57424c;

    /* renamed from: d  reason: collision with root package name */
    private int f57425d;

    static {
        Covode.recordClassIndex(35876);
    }

    public a(List<k> list) {
        this.f57424c = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i2 = this.f57425d; i2 < this.f57424c.size(); i2++) {
            if (this.f57424c.get(i2).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final k a(SSLSocket sSLSocket) {
        int size = this.f57424c.size();
        for (int i2 = this.f57425d; i2 < size; i2++) {
            k kVar = this.f57424c.get(i2);
            if (kVar.a(sSLSocket)) {
                this.f57425d = i2 + 1;
                this.f57422a = b(sSLSocket);
                d.f57739b.a(kVar, sSLSocket, this.f57423b);
                return kVar;
            }
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f57423b + ", modes=" + this.f57424c + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
