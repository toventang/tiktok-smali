package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.b;
import com.squareup.a.g;
import com.squareup.a.l;
import com.squareup.a.q;
import com.squareup.a.v;
import com.squareup.a.x;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f57600a = new a();

    static {
        Covode.recordClassIndex(35931);
    }

    private static InetAddress a(Proxy proxy, q qVar) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(qVar.f57882d);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }

    @Override // com.squareup.a.b
    public final v a(Proxy proxy, x xVar) {
        PasswordAuthentication requestPasswordAuthentication;
        List<g> b2 = xVar.b();
        v vVar = xVar.f57931a;
        q qVar = vVar.f57919a;
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = b2.get(i2);
            if ("Basic".equalsIgnoreCase(gVar.f57843a) && (requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(qVar.f57882d, a(proxy, qVar), qVar.f57883e, qVar.f57879a, gVar.f57844b, gVar.f57843a, qVar.a(), Authenticator.RequestorType.SERVER)) != null) {
                return vVar.b().a("Authorization", l.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).a();
            }
        }
        return null;
    }

    @Override // com.squareup.a.b
    public final v b(Proxy proxy, x xVar) {
        List<g> b2 = xVar.b();
        v vVar = xVar.f57931a;
        q qVar = vVar.f57919a;
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = b2.get(i2);
            if ("Basic".equalsIgnoreCase(gVar.f57843a)) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), a(proxy, qVar), inetSocketAddress.getPort(), qVar.f57879a, gVar.f57844b, gVar.f57843a, qVar.a(), Authenticator.RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return vVar.b().a("Proxy-Authorization", l.a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).a();
                }
            }
        }
        return null;
    }
}
