package okhttp3.internal.tls;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.Util;

public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    static {
        Covode.recordClassIndex(106317);
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        List<String> subjectAltNames2 = getSubjectAltNames(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(subjectAltNames.size() + subjectAltNames2.size());
        arrayList.addAll(subjectAltNames);
        arrayList.addAll(subjectAltNames2);
        return arrayList;
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        if (Util.verifyAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostname(str, x509Certificate);
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        int size = subjectAltNames.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(subjectAltNames.get(i2))) {
                return true;
            }
        }
        return false;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    private boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str2 : getSubjectAltNames(x509Certificate, 2)) {
            if (verifyHostname(lowerCase, str2)) {
                return true;
            }
        }
        return false;
    }

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i2) {
        Integer num;
        Object obj;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (!(list == null || list.size() < 2 || (num = (Integer) list.get(0)) == null || num.intValue() != i2 || (obj = list.get(1)) == null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    public final boolean verifyHostname(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
