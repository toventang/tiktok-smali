package com.linecorp.a.a;

import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class a extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f54910a = {"RC4", "DES", "PSK", "_DHE_"};

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocketFactory f54911b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54912c;

    /* renamed from: d  reason: collision with root package name */
    private Class<?> f54913d;

    /* renamed from: e  reason: collision with root package name */
    private Method f54914e;

    /* renamed from: com.linecorp.a.a.a$a  reason: collision with other inner class name */
    static class C1248a extends SSLSocket {

        /* renamed from: a  reason: collision with root package name */
        protected final SSLSocket f54915a;

        static {
            Covode.recordClassIndex(34494);
        }

        public SocketChannel getChannel() {
            return this.f54915a.getChannel();
        }

        public boolean getEnableSessionCreation() {
            return this.f54915a.getEnableSessionCreation();
        }

        public String[] getEnabledCipherSuites() {
            return this.f54915a.getEnabledCipherSuites();
        }

        public String[] getEnabledProtocols() {
            return this.f54915a.getEnabledProtocols();
        }

        public InetAddress getInetAddress() {
            return this.f54915a.getInetAddress();
        }

        @Override // java.net.Socket
        public InputStream getInputStream() {
            return this.f54915a.getInputStream();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() {
            return this.f54915a.getKeepAlive();
        }

        public InetAddress getLocalAddress() {
            return this.f54915a.getLocalAddress();
        }

        public int getLocalPort() {
            return this.f54915a.getLocalPort();
        }

        public SocketAddress getLocalSocketAddress() {
            return this.f54915a.getLocalSocketAddress();
        }

        public boolean getNeedClientAuth() {
            return this.f54915a.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() {
            return this.f54915a.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() {
            return this.f54915a.getOutputStream();
        }

        public int getPort() {
            return this.f54915a.getPort();
        }

        public SocketAddress getRemoteSocketAddress() {
            return this.f54915a.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() {
            return this.f54915a.getReuseAddress();
        }

        public SSLSession getSession() {
            return this.f54915a.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() {
            return this.f54915a.getSoLinger();
        }

        public String[] getSupportedCipherSuites() {
            return this.f54915a.getSupportedCipherSuites();
        }

        public String[] getSupportedProtocols() {
            return this.f54915a.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() {
            return this.f54915a.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() {
            return this.f54915a.getTrafficClass();
        }

        public boolean getUseClientMode() {
            return this.f54915a.getUseClientMode();
        }

        public boolean getWantClientAuth() {
            return this.f54915a.getWantClientAuth();
        }

        public boolean isBound() {
            return this.f54915a.isBound();
        }

        public boolean isClosed() {
            return this.f54915a.isClosed();
        }

        public boolean isConnected() {
            return this.f54915a.isConnected();
        }

        public boolean isInputShutdown() {
            return this.f54915a.isInputShutdown();
        }

        public boolean isOutputShutdown() {
            return this.f54915a.isOutputShutdown();
        }

        @Override // java.net.Socket
        public void shutdownInput() {
            this.f54915a.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() {
            this.f54915a.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() {
            this.f54915a.startHandshake();
        }

        public String toString() {
            return this.f54915a.toString();
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            MethodCollector.i(11950);
            this.f54915a.close();
            MethodCollector.o(11950);
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() {
            int receiveBufferSize;
            MethodCollector.i(11954);
            receiveBufferSize = this.f54915a.getReceiveBufferSize();
            MethodCollector.o(11954);
            return receiveBufferSize;
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() {
            int sendBufferSize;
            MethodCollector.i(11956);
            sendBufferSize = this.f54915a.getSendBufferSize();
            MethodCollector.o(11956);
            return sendBufferSize;
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() {
            int soTimeout;
            MethodCollector.i(12094);
            soTimeout = this.f54915a.getSoTimeout();
            MethodCollector.o(12094);
            return soTimeout;
        }

        C1248a(SSLSocket sSLSocket) {
            this.f54915a = sSLSocket;
        }

        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f54915a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) {
            this.f54915a.bind(socketAddress);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) {
            this.f54915a.connect(socketAddress);
        }

        public boolean equals(Object obj) {
            return this.f54915a.equals(obj);
        }

        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f54915a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i2) {
            this.f54915a.sendUrgentData(i2);
        }

        public void setEnableSessionCreation(boolean z) {
            this.f54915a.setEnableSessionCreation(z);
        }

        public void setEnabledCipherSuites(String[] strArr) {
            this.f54915a.setEnabledCipherSuites(strArr);
        }

        public void setEnabledProtocols(String[] strArr) {
            this.f54915a.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z) {
            this.f54915a.setKeepAlive(z);
        }

        public void setNeedClientAuth(boolean z) {
            this.f54915a.setNeedClientAuth(z);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z) {
            this.f54915a.setOOBInline(z);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z) {
            this.f54915a.setReuseAddress(z);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z) {
            this.f54915a.setTcpNoDelay(z);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i2) {
            this.f54915a.setTrafficClass(i2);
        }

        public void setUseClientMode(boolean z) {
            this.f54915a.setUseClientMode(z);
        }

        public void setWantClientAuth(boolean z) {
            this.f54915a.setWantClientAuth(z);
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i2) {
            MethodCollector.i(12254);
            this.f54915a.setReceiveBufferSize(i2);
            MethodCollector.o(12254);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i2) {
            MethodCollector.i(12398);
            this.f54915a.setSendBufferSize(i2);
            MethodCollector.o(12398);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i2) {
            MethodCollector.i(12534);
            this.f54915a.setSoTimeout(i2);
            MethodCollector.o(12534);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z, int i2) {
            this.f54915a.setSoLinger(z, i2);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i2) {
            this.f54915a.connect(socketAddress, i2);
        }

        public void setPerformancePreferences(int i2, int i3, int i4) {
            this.f54915a.setPerformancePreferences(i2, i3, i4);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a(this.f54911b.createSocket());
    }

    static {
        Covode.recordClassIndex(34493);
    }

    public final String[] getDefaultCipherSuites() {
        if (this.f54912c) {
            return a(this.f54911b.getDefaultCipherSuites());
        }
        return this.f54911b.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        if (this.f54912c) {
            return a(this.f54911b.getSupportedCipherSuites());
        }
        return this.f54911b.getSupportedCipherSuites();
    }

    /* access modifiers changed from: package-private */
    public static class b extends C1248a {
        static {
            Covode.recordClassIndex(34495);
        }

        private b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        @Override // com.linecorp.a.a.a.C1248a
        public final void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f54915a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }

        /* synthetic */ b(SSLSocket sSLSocket, byte b2) {
            this(sSLSocket);
        }
    }

    public a(SSLSocketFactory sSLSocketFactory) {
        this(sSLSocketFactory, (byte) 0);
    }

    private Socket a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            return socket;
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        int i2 = Build.VERSION.SDK_INT;
        sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        if (this.f54912c) {
            sSLSocket.setEnabledCipherSuites(a(sSLSocket.getEnabledCipherSuites()));
        }
        return new b(sSLSocket, (byte) 0);
    }

    private static String[] a(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        for (String str : strArr) {
            for (String str2 : f54910a) {
                if (str.contains(str2)) {
                    arrayList.remove(str);
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2) {
        Socket createSocket = this.f54911b.createSocket(str, i2);
        a(createSocket, str);
        return a(createSocket);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:5:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private a(javax.net.ssl.SSLSocketFactory r6, byte r7) {
        /*
            r5 = this;
            r5.<init>()
            r1 = 1
            r5.f54912c = r1
            r5.f54911b = r6
            r5.f54912c = r1
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0013 }
            r5.f54913d = r0     // Catch:{ ClassNotFoundException -> 0x0013 }
            goto L_0x001b
        L_0x0013:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            r5.f54913d = r0     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
        L_0x001b:
            java.lang.Class<?> r4 = r5.f54913d     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            java.lang.String r3 = "setHostname"
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            r1 = 0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r1] = r0     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            java.lang.reflect.Method r0 = r4.getMethod(r3, r2)     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
            r5.f54914e = r0     // Catch:{ NoSuchMethodException -> 0x002c, NoSuchMethodException -> 0x002c }
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.a.a.a.<init>(javax.net.ssl.SSLSocketFactory, byte):void");
    }

    private void a(Socket socket, String str) {
        Method method;
        if (this.f54913d.isInstance(socket) && (method = this.f54914e) != null) {
            try {
                Object[] objArr = {str};
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{socket, objArr}, 110000, "java.lang.Object", true, "com_linecorp_a_a_a_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                } else {
                    com.bytedance.helios.sdk.a.a(method.invoke(socket, objArr), method, new Object[]{socket, objArr}, "com_linecorp_a_a_a_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2) {
        return a(this.f54911b.createSocket(inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) {
        Socket createSocket = this.f54911b.createSocket(str, i2, inetAddress, i3);
        a(createSocket, str);
        return a(createSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) {
        return a(this.f54911b.createSocket(inetAddress, i2, inetAddress2, i3));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i2, boolean z) {
        Socket createSocket = this.f54911b.createSocket(socket, str, i2, z);
        a(createSocket, str);
        return a(createSocket);
    }
}
