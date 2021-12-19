package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class jy extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f51970a;

    static {
        Covode.recordClassIndex(32355);
    }

    jy() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    public final String[] getDefaultCipherSuites() {
        return this.f51970a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f51970a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a((SSLSocket) this.f51970a.createSocket());
    }

    private static SSLSocket a(SSLSocket sSLSocket) {
        return new ka(sSLSocket);
    }

    private jy(SSLSocketFactory sSLSocketFactory) {
        this.f51970a = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        return a((SSLSocket) this.f51970a.createSocket(str, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a((SSLSocket) this.f51970a.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        return a((SSLSocket) this.f51970a.createSocket(str, i2, inetAddress, i3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a((SSLSocket) this.f51970a.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        return a((SSLSocket) this.f51970a.createSocket(socket, str, i2, z));
    }
}
