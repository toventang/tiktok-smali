package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class ka extends SSLSocket {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocket f51979a;

    static {
        Covode.recordClassIndex(32358);
    }

    public final SocketChannel getChannel() {
        return this.f51979a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f51979a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f51979a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f51979a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f51979a.getInetAddress();
    }

    @Override // java.net.Socket
    public final InputStream getInputStream() {
        return this.f51979a.getInputStream();
    }

    @Override // java.net.Socket
    public final boolean getKeepAlive() {
        return this.f51979a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f51979a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f51979a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f51979a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f51979a.getNeedClientAuth();
    }

    @Override // java.net.Socket
    public final boolean getOOBInline() {
        return this.f51979a.getOOBInline();
    }

    @Override // java.net.Socket
    public final OutputStream getOutputStream() {
        return this.f51979a.getOutputStream();
    }

    public final int getPort() {
        return this.f51979a.getPort();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f51979a.getRemoteSocketAddress();
    }

    @Override // java.net.Socket
    public final boolean getReuseAddress() {
        return this.f51979a.getReuseAddress();
    }

    public final SSLSession getSession() {
        return this.f51979a.getSession();
    }

    @Override // java.net.Socket
    public final int getSoLinger() {
        return this.f51979a.getSoLinger();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f51979a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f51979a.getSupportedProtocols();
    }

    @Override // java.net.Socket
    public final boolean getTcpNoDelay() {
        return this.f51979a.getTcpNoDelay();
    }

    @Override // java.net.Socket
    public final int getTrafficClass() {
        return this.f51979a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f51979a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f51979a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f51979a.isBound();
    }

    public final boolean isClosed() {
        return this.f51979a.isClosed();
    }

    public final boolean isConnected() {
        return this.f51979a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f51979a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f51979a.isOutputShutdown();
    }

    @Override // java.net.Socket
    public final void shutdownInput() {
        this.f51979a.shutdownInput();
    }

    @Override // java.net.Socket
    public final void shutdownOutput() {
        this.f51979a.shutdownOutput();
    }

    @Override // javax.net.ssl.SSLSocket
    public final void startHandshake() {
        this.f51979a.startHandshake();
    }

    public final String toString() {
        return this.f51979a.toString();
    }

    @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(7948);
        this.f51979a.close();
        MethodCollector.o(7948);
    }

    @Override // java.net.Socket
    public final synchronized int getReceiveBufferSize() {
        int receiveBufferSize;
        MethodCollector.i(8081);
        receiveBufferSize = this.f51979a.getReceiveBufferSize();
        MethodCollector.o(8081);
        return receiveBufferSize;
    }

    @Override // java.net.Socket
    public final synchronized int getSendBufferSize() {
        int sendBufferSize;
        MethodCollector.i(8160);
        sendBufferSize = this.f51979a.getSendBufferSize();
        MethodCollector.o(8160);
        return sendBufferSize;
    }

    @Override // java.net.Socket
    public final synchronized int getSoTimeout() {
        int soTimeout;
        MethodCollector.i(8231);
        soTimeout = this.f51979a.getSoTimeout();
        MethodCollector.o(8231);
        return soTimeout;
    }

    ka(SSLSocket sSLSocket) {
        this.f51979a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f51979a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void bind(SocketAddress socketAddress) {
        this.f51979a.bind(socketAddress);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress) {
        this.f51979a.connect(socketAddress);
    }

    public final boolean equals(Object obj) {
        return this.f51979a.equals(obj);
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f51979a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // java.net.Socket
    public final void sendUrgentData(int i2) {
        this.f51979a.sendUrgentData(i2);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f51979a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f51979a.setEnabledCipherSuites(strArr);
    }

    @Override // java.net.Socket
    public final void setKeepAlive(boolean z) {
        this.f51979a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f51979a.setNeedClientAuth(z);
    }

    @Override // java.net.Socket
    public final void setOOBInline(boolean z) {
        this.f51979a.setOOBInline(z);
    }

    @Override // java.net.Socket
    public final void setReuseAddress(boolean z) {
        this.f51979a.setReuseAddress(z);
    }

    @Override // java.net.Socket
    public final void setTcpNoDelay(boolean z) {
        this.f51979a.setTcpNoDelay(z);
    }

    @Override // java.net.Socket
    public final void setTrafficClass(int i2) {
        this.f51979a.setTrafficClass(i2);
    }

    public final void setUseClientMode(boolean z) {
        this.f51979a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f51979a.setWantClientAuth(z);
    }

    @Override // java.net.Socket
    public final synchronized void setReceiveBufferSize(int i2) {
        MethodCollector.i(8291);
        this.f51979a.setReceiveBufferSize(i2);
        MethodCollector.o(8291);
    }

    @Override // java.net.Socket
    public final synchronized void setSendBufferSize(int i2) {
        MethodCollector.i(8296);
        this.f51979a.setSendBufferSize(i2);
        MethodCollector.o(8296);
    }

    @Override // java.net.Socket
    public final synchronized void setSoTimeout(int i2) {
        MethodCollector.i(8299);
        this.f51979a.setSoTimeout(i2);
        MethodCollector.o(8299);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f51979a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f51979a.setEnabledProtocols(strArr);
    }

    @Override // java.net.Socket
    public final void setSoLinger(boolean z, int i2) {
        this.f51979a.setSoLinger(z, i2);
    }

    @Override // java.net.Socket
    public final void connect(SocketAddress socketAddress, int i2) {
        this.f51979a.connect(socketAddress, i2);
    }

    public final void setPerformancePreferences(int i2, int i3, int i4) {
        this.f51979a.setPerformancePreferences(i2, i3, i4);
    }
}
