package com.squareup.a.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.squareup.a.a.d.e;
import com.squareup.a.a.d.f;
import com.squareup.a.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f57757a = a();

    public X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<u> list) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    static {
        Covode.recordClassIndex(35977);
    }

    private static h a() {
        Class<?> cls;
        g gVar;
        Method method;
        Method method2;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                try {
                    Class<?> cls2 = Class.forName("sun.security.ssl.SSLContextImpl");
                    try {
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
                        return new c(cls2, cls3.getMethod("put", SSLSocket.class, cls4), cls3.getMethod("get", SSLSocket.class), cls3.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider"));
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        return new b(cls2);
                    }
                } catch (ClassNotFoundException unused4) {
                    return new h();
                }
            }
        }
        g gVar2 = null;
        g gVar3 = new g(null, "setUseSessionTickets", Boolean.TYPE);
        g gVar4 = new g(null, "setHostname", String.class);
        try {
            Class<?> cls5 = Class.forName("android.net.TrafficStats");
            method2 = cls5.getMethod("tagSocket", Socket.class);
            try {
                method = cls5.getMethod("untagSocket", Socket.class);
                try {
                    Class.forName("android.net.Network");
                    gVar = new g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                    try {
                        gVar2 = new g(null, "setAlpnProtocols", byte[].class);
                    } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused6) {
                    gVar = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                method = null;
                gVar = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused8) {
            method = null;
            method2 = null;
            gVar = null;
        }
        return new a(cls, gVar3, gVar4, method2, method, gVar, gVar2);
    }

    /* access modifiers changed from: package-private */
    public static class b extends h {

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f57765b;

        static {
            Covode.recordClassIndex(35979);
        }

        public b(Class<?> cls) {
            this.f57765b = cls;
        }

        @Override // com.squareup.a.a.h
        public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
            Object a2 = a(sSLSocketFactory, this.f57765b, "context");
            if (a2 == null) {
                return null;
            }
            return (X509TrustManager) a(a2, X509TrustManager.class, "trustManager");
        }
    }

    static class d implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f57771a;

        /* renamed from: b  reason: collision with root package name */
        public String f57772b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f57773c;

        static {
            Covode.recordClassIndex(35981);
        }

        public d(List<String> list) {
            this.f57773c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = j.f57776b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f57771a = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f57773c;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f57773c.contains(list.get(i2))) {
                            String str = (String) list.get(i2);
                            this.f57772b = str;
                            return str;
                        }
                    }
                    String str2 = this.f57773c.get(0);
                    this.f57772b = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f57772b = (String) objArr[0];
                    return null;
                } else {
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_Platform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return a2.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{this, objArr}, "com_squareup_okhttp_internal_Platform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends h {

        /* renamed from: b  reason: collision with root package name */
        private final Class<?> f57758b;

        /* renamed from: c  reason: collision with root package name */
        private final g<Socket> f57759c;

        /* renamed from: d  reason: collision with root package name */
        private final g<Socket> f57760d;

        /* renamed from: e  reason: collision with root package name */
        private final Method f57761e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f57762f;

        /* renamed from: g  reason: collision with root package name */
        private final g<Socket> f57763g;

        /* renamed from: h  reason: collision with root package name */
        private final g<Socket> f57764h;

        static {
            Covode.recordClassIndex(35978);
        }

        @Override // com.squareup.a.a.h
        public final f a(X509TrustManager x509TrustManager) {
            f a2 = com.squareup.a.a.d.a.a(x509TrustManager);
            if (a2 != null) {
                return a2;
            }
            return h.super.a(x509TrustManager);
        }

        @Override // com.squareup.a.a.h
        public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
            Object a2 = a(sSLSocketFactory, this.f57758b, "sslParameters");
            if (a2 == null) {
                try {
                    a2 = a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) a(a2, X509TrustManager.class, "x509TrustManager");
            if (x509TrustManager != null) {
                return x509TrustManager;
            }
            return (X509TrustManager) a(a2, X509TrustManager.class, "trustManager");
        }

        @Override // com.squareup.a.a.h
        public final String b(SSLSocket sSLSocket) {
            byte[] bArr;
            g<Socket> gVar = this.f57763g;
            if (gVar == null || !gVar.a(sSLSocket) || (bArr = (byte[]) this.f57763g.b(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, j.f57777c);
        }

        @Override // com.squareup.a.a.h
        public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
            try {
                socket.connect(inetSocketAddress, i2);
            } catch (AssertionError e2) {
                if (j.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            } catch (SecurityException e3) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e3);
                throw iOException;
            }
        }

        @Override // com.squareup.a.a.h
        public final void a(SSLSocket sSLSocket, String str, List<u> list) {
            if (str != null) {
                this.f57759c.a(sSLSocket, true);
                this.f57760d.a(sSLSocket, str);
            }
            g<Socket> gVar = this.f57764h;
            if (gVar != null && gVar.a(sSLSocket)) {
                Object[] objArr = new Object[1];
                k.f fVar = new k.f();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    u uVar = list.get(i2);
                    if (uVar != u.HTTP_1_0) {
                        fVar.a(uVar.toString().length());
                        fVar.a(uVar.toString());
                    }
                }
                objArr[0] = fVar.u();
                this.f57764h.b(sSLSocket, objArr);
            }
        }

        public a(Class<?> cls, g<Socket> gVar, g<Socket> gVar2, Method method, Method method2, g<Socket> gVar3, g<Socket> gVar4) {
            this.f57758b = cls;
            this.f57759c = gVar;
            this.f57760d = gVar2;
            this.f57761e = method;
            this.f57762f = method2;
            this.f57763g = gVar3;
            this.f57764h = gVar4;
        }
    }

    public f a(X509TrustManager x509TrustManager) {
        return new e(x509TrustManager.getAcceptedIssuers());
    }

    /* access modifiers changed from: package-private */
    public static class c extends b {

        /* renamed from: b  reason: collision with root package name */
        private final Method f57766b;

        /* renamed from: c  reason: collision with root package name */
        private final Method f57767c;

        /* renamed from: d  reason: collision with root package name */
        private final Method f57768d;

        /* renamed from: e  reason: collision with root package name */
        private final Class<?> f57769e;

        /* renamed from: f  reason: collision with root package name */
        private final Class<?> f57770f;

        static {
            Covode.recordClassIndex(35980);
        }

        private static Object a(Method method, Object[] objArr) {
            Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{null, objArr}, 110000, "java.lang.Object", true, "com_squareup_okhttp_internal_Platform$JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(null, objArr);
            com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{null, objArr}, "com_squareup_okhttp_internal_Platform$JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        @Override // com.squareup.a.a.h
        public final void a(SSLSocket sSLSocket) {
            try {
                a(this.f57768d, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // com.squareup.a.a.h
        public final String b(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(a(this.f57767c, new Object[]{sSLSocket}));
                if (!dVar.f57771a && dVar.f57772b == null) {
                    d.f57738a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (dVar.f57771a) {
                    return null;
                } else {
                    return dVar.f57772b;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // com.squareup.a.a.h
        public final void a(SSLSocket sSLSocket, String str, List<u> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                u uVar = list.get(i2);
                if (uVar != u.HTTP_1_0) {
                    arrayList.add(uVar.toString());
                }
            }
            try {
                Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f57769e, this.f57770f}, new d(arrayList));
                a(this.f57766b, new Object[]{sSLSocket, newProxyInstance});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        public c(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.f57766b = method;
            this.f57767c = method2;
            this.f57768d = method3;
            this.f57769e = cls2;
            this.f57770f = cls3;
        }
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    static <T> T a(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        if (cls.isInstance(obj2)) {
                            return cls.cast(obj2);
                        }
                    }
                    return null;
                } catch (NoSuchFieldException unused) {
                } catch (IllegalAccessException unused2) {
                    throw new AssertionError();
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = a(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }
}
