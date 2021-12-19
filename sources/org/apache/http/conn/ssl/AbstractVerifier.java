package org.apache.http.conn.ssl;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.apache.http.conn.util.InetAddressUtils;

public abstract class AbstractVerifier implements X509HostnameVerifier {
    private static final String[] BAD_COUNTRY_2LDS;

    static {
        Covode.recordClassIndex(106403);
        String[] strArr = {"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"};
        BAD_COUNTRY_2LDS = strArr;
        Arrays.sort(strArr);
    }

    public static int countDots(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == '.') {
                i2++;
            }
        }
        return i2;
    }

    private static boolean isIPAddress(String str) {
        if (str == null) {
            return false;
        }
        if (InetAddressUtils.isIPv4Address(str) || InetAddressUtils.isIPv6Address(str)) {
            return true;
        }
        return false;
    }

    public static boolean acceptableCountryWildcard(String str) {
        String[] split = str.split("\\.");
        if (split.length == 3 && split[2].length() == 2 && Arrays.binarySearch(BAD_COUNTRY_2LDS, split[1]) >= 0) {
            return false;
        }
        return true;
    }

    public static String[] getCNs(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (trim.length() > 3 && trim.substring(0, 3).equalsIgnoreCase("CN=")) {
                linkedList.add(trim.substring(3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public final void verify(String str, X509Certificate x509Certificate) {
        verify(str, getCNs(x509Certificate), getSubjectAlts(x509Certificate, str));
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    private static String[] getSubjectAlts(X509Certificate x509Certificate, String str) {
        int i2;
        Collection<List<?>> collection;
        if (isIPAddress(str)) {
            i2 = 7;
        } else {
            i2 = 2;
        }
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
            collection = null;
        }
        if (collection != null) {
            for (List<?> list : collection) {
                if (((Integer) list.get(0)).intValue() == i2) {
                    linkedList.add(list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z) {
        boolean z2;
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String lowerCase = str.trim().toLowerCase(Locale.US);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.US);
                sb.append(" <");
                sb.append(lowerCase2);
                sb.append('>');
                if (it.hasNext()) {
                    sb.append(" OR");
                }
                String[] split = lowerCase2.split("\\.");
                if (split.length < 3 || !split[0].endsWith("*") || !acceptableCountryWildcard(lowerCase2) || isIPAddress(str)) {
                    z2 = lowerCase.equals(lowerCase2);
                    continue;
                } else {
                    String str3 = split[0];
                    if (str3.length() > 1) {
                        String substring = str3.substring(0, str3.length() - 1);
                        String substring2 = lowerCase2.substring(str3.length());
                        String substring3 = lowerCase.substring(substring.length());
                        if (!lowerCase.startsWith(substring) || !substring3.endsWith(substring2)) {
                            z2 = false;
                            continue;
                        }
                    } else {
                        z2 = lowerCase.endsWith(lowerCase2.substring(1));
                        if (!z2) {
                            continue;
                        }
                    }
                    if (z && countDots(lowerCase) != countDots(lowerCase2)) {
                        z2 = false;
                        continue;
                    } else {
                        return;
                    }
                }
                if (z2) {
                    return;
                }
            }
            throw new SSLException("hostname in certificate didn't match: <" + str + "> !=" + ((Object) sb));
        }
        throw new SSLException("Certificate for <" + str + "> doesn't contain CN or DNS subjectAlt");
    }
}
