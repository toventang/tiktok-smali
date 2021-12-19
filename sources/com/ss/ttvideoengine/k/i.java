package com.ss.ttvideoengine.k;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class i extends SSLSocketFactory {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f153041b = {"TLSv1", "TLSv1.1", "TLSv1.2", "TLSv1.3"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f153042c = {"TLSv1", "TLSv1.1", "TLSv1.2"};

    /* renamed from: a  reason: collision with root package name */
    final SSLSocketFactory f153043a;

    public final String[] getDefaultCipherSuites() {
        return this.f153043a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f153043a.getSupportedCipherSuites();
    }

    static {
        Covode.recordClassIndex(101700);
    }

    public i(SSLSocketFactory sSLSocketFactory) {
        this.f153043a = sSLSocketFactory;
    }

    private static Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            if (Build.VERSION.SDK_INT >= 29) {
                ((SSLSocket) socket).setEnabledProtocols(f153041b);
            } else {
                ((SSLSocket) socket).setEnabledProtocols(f153042c);
            }
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        return a(this.f153043a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a(this.f153043a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return a(this.f153043a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a(this.f153043a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return a(this.f153043a.createSocket(socket, str, i2, z));
    }
}
