package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a;
import com.squareup.a.a.i;
import com.squareup.a.z;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    final a f57704a;

    /* renamed from: b  reason: collision with root package name */
    final i f57705b;

    /* renamed from: c  reason: collision with root package name */
    private Proxy f57706c;

    /* renamed from: d  reason: collision with root package name */
    private InetSocketAddress f57707d;

    /* renamed from: e  reason: collision with root package name */
    private List<Proxy> f57708e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private int f57709f;

    /* renamed from: g  reason: collision with root package name */
    private List<InetSocketAddress> f57710g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    private int f57711h;

    /* renamed from: i  reason: collision with root package name */
    private final List<z> f57712i = new ArrayList();

    static {
        Covode.recordClassIndex(35960);
    }

    private boolean c() {
        if (this.f57709f < this.f57708e.size()) {
            return true;
        }
        return false;
    }

    private boolean d() {
        if (this.f57711h < this.f57710g.size()) {
            return true;
        }
        return false;
    }

    private boolean e() {
        if (!this.f57712i.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (d() || c() || e()) {
            return true;
        }
        return false;
    }

    public final z b() {
        while (true) {
            if (!d()) {
                if (!c()) {
                    if (e()) {
                        return this.f57712i.remove(0);
                    }
                    throw new NoSuchElementException();
                } else if (c()) {
                    List<Proxy> list = this.f57708e;
                    int i2 = this.f57709f;
                    this.f57709f = i2 + 1;
                    Proxy proxy = list.get(i2);
                    a(proxy);
                    this.f57706c = proxy;
                } else {
                    throw new SocketException("No route to " + this.f57704a.f57411a.f57882d + "; exhausted proxy configurations: " + this.f57708e);
                }
            }
            if (d()) {
                List<InetSocketAddress> list2 = this.f57710g;
                int i3 = this.f57711h;
                this.f57711h = i3 + 1;
                this.f57707d = list2.get(i3);
                z zVar = new z(this.f57704a, this.f57706c, this.f57707d);
                if (!this.f57705b.c(zVar)) {
                    return zVar;
                }
                this.f57712i.add(zVar);
            } else {
                throw new SocketException("No route to " + this.f57704a.f57411a.f57882d + "; exhausted inet socket addresses: " + this.f57710g);
            }
        }
    }

    private void a(Proxy proxy) {
        int i2;
        String str;
        this.f57710g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f57704a.f57411a.f57882d;
            i2 = this.f57704a.f57411a.f57883e;
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                } else {
                    str = address2.getHostAddress();
                }
                i2 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
        }
        if (i2 <= 0 || i2 > 65535) {
            throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f57710g.add(InetSocketAddress.createUnresolved(str, i2));
        } else {
            List<InetAddress> a2 = this.f57704a.f57412b.a(str);
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f57710g.add(new InetSocketAddress(a2.get(i3), i2));
            }
        }
        this.f57711h = 0;
    }

    public q(a aVar, i iVar) {
        this.f57704a = aVar;
        this.f57705b = iVar;
        com.squareup.a.q qVar = aVar.f57411a;
        Proxy proxy = aVar.f57418h;
        if (proxy != null) {
            this.f57708e = Collections.singletonList(proxy);
        } else {
            this.f57708e = new ArrayList();
            List<Proxy> select = aVar.f57417g.select(qVar.b());
            if (select != null) {
                this.f57708e.addAll(select);
            }
            this.f57708e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f57708e.add(Proxy.NO_PROXY);
        }
        this.f57709f = 0;
    }
}
