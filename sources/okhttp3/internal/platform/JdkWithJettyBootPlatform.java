package okhttp3.internal.platform;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.Util;

/* access modifiers changed from: package-private */
public class JdkWithJettyBootPlatform extends Platform {
    private final Class<?> clientProviderClass;
    private final Method getMethod;
    private final Method putMethod;
    private final Method removeMethod;
    private final Class<?> serverProviderClass;

    static {
        Covode.recordClassIndex(106307);
    }

    private static Object okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static Platform buildIfSupported() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider");
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider");
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider");
            return new JdkWithJettyBootPlatform(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    static class JettyNegoProvider implements InvocationHandler {
        private final List<String> protocols;
        String selected;
        boolean unsupported;

        static {
            Covode.recordClassIndex(106308);
        }

        private static Object okhttp3_internal_platform_JdkWithJettyBootPlatform$JettyNegoProvider_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "okhttp3_internal_platform_JdkWithJettyBootPlatform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "okhttp3_internal_platform_JdkWithJettyBootPlatform$JettyNegoProvider_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        JettyNegoProvider(List<String> list) {
            this.protocols = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = Util.EMPTY_STRING_ARRAY;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.unsupported = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.protocols;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.protocols.contains(list.get(i2))) {
                            String str = (String) list.get(i2);
                            this.selected = str;
                            return str;
                        }
                    }
                    String str2 = this.protocols.get(0);
                    this.selected = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return okhttp3_internal_platform_JdkWithJettyBootPlatform$JettyNegoProvider_java_lang_reflect_Method_invoke(method, this, objArr);
                } else {
                    this.selected = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void afterHandshake(SSLSocket sSLSocket) {
        try {
            okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(this.removeMethod, null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to remove alpn", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public String getSelectedProtocol(SSLSocket sSLSocket) {
        try {
            JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(this.getMethod, null, new Object[]{sSLSocket}));
            if (!jettyNegoProvider.unsupported && jettyNegoProvider.selected == null) {
                Platform.get().log(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (jettyNegoProvider.unsupported) {
                return null;
            } else {
                return jettyNegoProvider.selected;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to get selected protocol", e2);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(SSLSocket sSLSocket, String str, List<Protocol> list) {
        List<String> alpnProtocolNames = alpnProtocolNames(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.clientProviderClass, this.serverProviderClass}, new JettyNegoProvider(alpnProtocolNames));
            okhttp3_internal_platform_JdkWithJettyBootPlatform_java_lang_reflect_Method_invoke(this.putMethod, null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw Util.assertionError("unable to set alpn", e2);
        }
    }

    JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.putMethod = method;
        this.getMethod = method2;
        this.removeMethod = method3;
        this.clientProviderClass = cls;
        this.serverProviderClass = cls2;
    }
}
