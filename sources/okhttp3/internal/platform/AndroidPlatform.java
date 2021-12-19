package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* access modifiers changed from: package-private */
public class AndroidPlatform extends Platform {
    private final CloseGuard closeGuard = CloseGuard.get();
    private final OptionalMethod<Socket> getAlpnSelectedProtocol;
    private final OptionalMethod<Socket> setAlpnProtocols;
    private final OptionalMethod<Socket> setHostname;
    private final OptionalMethod<Socket> setUseSessionTickets;
    private final Class<?> sslParametersClass;

    static {
        Covode.recordClassIndex(106301);
    }

    static int getSdkInt() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    static final class AndroidTrustRootIndex implements TrustRootIndex {
        private final Method findByIssuerAndSignatureMethod;
        private final X509TrustManager trustManager;

        static {
            Covode.recordClassIndex(106303);
        }

        private static Object okhttp3_internal_platform_AndroidPlatform$AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_AndroidPlatform$AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_AndroidPlatform$AndroidTrustRootIndex_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        public final int hashCode() {
            return this.trustManager.hashCode() + (this.findByIssuerAndSignatureMethod.hashCode() * 31);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidTrustRootIndex)) {
                return false;
            }
            AndroidTrustRootIndex androidTrustRootIndex = (AndroidTrustRootIndex) obj;
            if (!this.trustManager.equals(androidTrustRootIndex.trustManager) || !this.findByIssuerAndSignatureMethod.equals(androidTrustRootIndex.findByIssuerAndSignatureMethod)) {
                return false;
            }
            return true;
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public final X509Certificate findByIssuerAndSignature(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) okhttp3_internal_platform_AndroidPlatform$AndroidTrustRootIndex_java_lang_reflect_Method_invoke(this.findByIssuerAndSignatureMethod, this.trustManager, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e2) {
                throw Util.assertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.findByIssuerAndSignatureMethod = method;
            this.trustManager = x509TrustManager;
        }
    }

    private static boolean supportsAlpn() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static final class CloseGuard {
        private final Method getMethod;
        private final Method openMethod;
        private final Method warnIfOpenMethod;

        static {
            Covode.recordClassIndex(106304);
        }

        private static Object okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        static CloseGuard get() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = method3;
                method = method2;
            }
            return new CloseGuard(method3, method, method2);
        }

        /* access modifiers changed from: package-private */
        public final boolean warnIfOpen(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(this.warnIfOpenMethod, obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        public final Object createAndOpen(String str) {
            Method method = this.getMethod;
            if (method != null) {
                try {
                    Object okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke = okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(method, null, new Object[0]);
                    okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke(this.openMethod, okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke, new Object[]{str});
                    return okhttp3_internal_platform_AndroidPlatform$CloseGuard_java_lang_reflect_Method_invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        CloseGuard(Method method, Method method2, Method method3) {
            this.getMethod = method;
            this.openMethod = method2;
            this.warnIfOpenMethod = method3;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public SSLContext getSSLContext() {
        boolean z = true;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public static Platform buildIfSupported() {
        Class<?> cls;
        OptionalMethod optionalMethod;
        OptionalMethod optionalMethod2;
        if (!Platform.isAndroid()) {
            return null;
        }
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        OptionalMethod optionalMethod3 = new OptionalMethod(null, "setUseSessionTickets", Boolean.TYPE);
        OptionalMethod optionalMethod4 = new OptionalMethod(null, "setHostname", String.class);
        if (supportsAlpn()) {
            optionalMethod = new OptionalMethod(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            optionalMethod2 = new OptionalMethod(null, "setAlpnProtocols", byte[].class);
        } else {
            optionalMethod = null;
            optionalMethod2 = null;
        }
        return new AndroidPlatform(cls, optionalMethod3, optionalMethod4, optionalMethod, optionalMethod2);
    }

    static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {
        private final Method checkServerTrusted;
        private final Object x509TrustManagerExtensions;

        static {
            Covode.recordClassIndex(106302);
        }

        private static Object okhttp3_internal_platform_AndroidPlatform$AndroidCertificateChainCleaner_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_AndroidPlatform$AndroidCertificateChainCleaner_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_AndroidPlatform$AndroidCertificateChainCleaner_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        public final int hashCode() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        AndroidCertificateChainCleaner(Object obj, Method method) {
            this.x509TrustManagerExtensions = obj;
            this.checkServerTrusted = method;
        }

        @Override // okhttp3.internal.tls.CertificateChainCleaner
        public final List<Certificate> clean(List<Certificate> list, String str) {
            try {
                Object[] array = list.toArray(new X509Certificate[list.size()]);
                return (List) okhttp3_internal_platform_AndroidPlatform$AndroidCertificateChainCleaner_java_lang_reflect_Method_invoke(this.checkServerTrusted, this.x509TrustManagerExtensions, new Object[]{array, "RSA", str});
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public Object getStackTraceForCloseable(String str) {
        return this.closeGuard.createAndOpen(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public TrustRootIndex buildTrustRootIndex(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new AndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.buildTrustRootIndex(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public CertificateChainCleaner buildCertificateChainCleaner(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.buildCertificateChainCleaner(x509TrustManager);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        byte[] bArr;
        OptionalMethod<Socket> optionalMethod = this.getAlpnSelectedProtocol;
        if (optionalMethod == null || !optionalMethod.isSupported(sSLSocket) || (bArr = (byte[]) this.getAlpnSelectedProtocol.invokeWithoutCheckedException(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, Util.UTF_8);
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.isCleartextTrafficPermitted(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return api24IsCleartextTrafficPermitted(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw Util.assertionError("unable to determine cleartext support", e2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // okhttp3.internal.platform.Platform
    public X509TrustManager trustManager(SSLSocketFactory sSLSocketFactory) {
        Object readFieldOrNull = readFieldOrNull(sSLSocketFactory, this.sslParametersClass, "sslParameters");
        if (readFieldOrNull == null) {
            try {
                readFieldOrNull = readFieldOrNull(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.trustManager(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) readFieldOrNull(readFieldOrNull, X509TrustManager.class, "trustManager");
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(String str, Object obj) {
        if (!this.closeGuard.warnIfOpen(obj)) {
            log(5, str, null);
        }
    }

    private boolean api23IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.isCleartextTrafficPermitted(str);
        }
    }

    private boolean api24IsCleartextTrafficPermitted(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return api23IsCleartextTrafficPermitted(str, cls, obj);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.setUseSessionTickets.invokeOptionalWithoutCheckedException(sSLSocket, true);
            this.setHostname.invokeOptionalWithoutCheckedException(sSLSocket, str);
        }
        OptionalMethod<Socket> optionalMethod = this.setAlpnProtocols;
        if (optionalMethod != null && optionalMethod.isSupported(sSLSocket)) {
            this.setAlpnProtocols.invokeWithoutCheckedException(sSLSocket, concatLengthPrefixed(list));
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (Util.isAndroidGetsocknameError(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (SecurityException e3) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e3);
            throw iOException;
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e4);
                throw iOException2;
            }
            throw e4;
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void log(int i2, String str, Throwable th) {
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            do {
                i3 = Math.min(indexOf, i3 + 4000);
            } while (i3 < indexOf);
            i3++;
        }
    }

    AndroidPlatform(Class<?> cls, OptionalMethod<Socket> optionalMethod, OptionalMethod<Socket> optionalMethod2, OptionalMethod<Socket> optionalMethod3, OptionalMethod<Socket> optionalMethod4) {
        this.sslParametersClass = cls;
        this.setUseSessionTickets = optionalMethod;
        this.setHostname = optionalMethod2;
        this.getAlpnSelectedProtocol = optionalMethod3;
        this.setAlpnProtocols = optionalMethod4;
    }
}
