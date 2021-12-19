package com.bytedance.frameworks.baselib.network.http.d.a;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class s extends SSLSocketFactory {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f29327b = {"TLSv1.2"};

    /* renamed from: a  reason: collision with root package name */
    final SSLSocketFactory f29328a;

    public final String[] getDefaultCipherSuites() {
        return this.f29328a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f29328a.getSupportedCipherSuites();
    }

    static {
        Covode.recordClassIndex(17098);
    }

    public s(SSLSocketFactory sSLSocketFactory) {
        this.f29328a = sSLSocketFactory;
    }

    private static Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f29327b);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        return a(this.f29328a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a(this.f29328a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return a(this.f29328a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a(this.f29328a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return a(this.f29328a.createSocket(socket, str, i2, z));
    }
}
