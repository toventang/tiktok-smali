package com.ss.avframework.transport;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

class AndroidNetworkLibrary {
    private static final Set<String> sAutoDohDotServers;
    private static final Set<InetAddress> sAutoDohServers;
    private static Boolean sHaveAccessNetworkState;
    private static Boolean sHaveAccessWifiState;

    public static boolean haveOnlyLoopbackAddresses() {
        return false;
    }

    static class SetFileDescriptor {
        private static final Method sFileDescriptorSetInt;

        private static Object com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        private SetFileDescriptor() {
        }

        static {
            Covode.recordClassIndex(100565);
            try {
                sFileDescriptorSetInt = FileDescriptor.class.getMethod("setInt$", Integer.TYPE);
            } catch (NoSuchMethodException | SecurityException e2) {
                throw new RuntimeException("Unable to get FileDescriptor.setInt$", e2);
            }
        }

        public static FileDescriptor createWithFd(int i2) {
            try {
                FileDescriptor fileDescriptor = new FileDescriptor();
                com_ss_avframework_transport_AndroidNetworkLibrary$SetFileDescriptor_java_lang_reflect_Method_invoke(sFileDescriptorSetInt, fileDescriptor, new Object[]{Integer.valueOf(i2)});
                return fileDescriptor;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("FileDescriptor.setInt$() failed", e3);
            }
        }
    }

    AndroidNetworkLibrary() {
    }

    static {
        Covode.recordClassIndex(100564);
        HashSet hashSet = new HashSet();
        sAutoDohServers = hashSet;
        HashSet hashSet2 = new HashSet();
        sAutoDohDotServers = hashSet2;
        try {
            hashSet.add(InetAddress.getByName("8.8.8.8"));
            hashSet.add(InetAddress.getByName("8.8.4.4"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8888"));
            hashSet.add(InetAddress.getByName("2001:4860:4860::8844"));
            hashSet.add(InetAddress.getByName("1.1.1.1"));
            hashSet.add(InetAddress.getByName("1.0.0.1"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1111"));
            hashSet.add(InetAddress.getByName("2606:4700:4700::1001"));
            hashSet.add(InetAddress.getByName("9.9.9.9"));
            hashSet.add(InetAddress.getByName("149.112.112.112"));
            hashSet.add(InetAddress.getByName("2620:fe::fe"));
            hashSet.add(InetAddress.getByName("2620:fe::9"));
            hashSet2.add("dns.google");
            hashSet2.add("1dot1dot1dot1.cloudflare-dns.com");
            hashSet2.add("cloudflare-dns.com");
            hashSet2.add("dns.quad9.net");
        } catch (UnknownHostException e2) {
            throw new RuntimeException("Failed to parse IP addresses", e2);
        }
    }

    public static String getMimeTypeFromExtension(String str) {
        return URLConnection.guessContentTypeFromName("foo.".concat(String.valueOf(str)));
    }

    public static AndroidCertVerifyResult verifyServerCertificates(byte[][] bArr, String str, String str2) {
        try {
            return X509Util.verifyServerCertificates(bArr, str, str2);
        } catch (KeyStoreException unused) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (NoSuchAlgorithmException unused2) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        } catch (IllegalArgumentException unused3) {
            return new AndroidCertVerifyResult(CertVerifyStatusAndroid.FAILED);
        }
    }
}
