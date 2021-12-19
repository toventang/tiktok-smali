package com.squareup.a.a.d;

import com.bytedance.covode.number.Covode;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f57750a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f57751b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private d() {
    }

    static {
        Covode.recordClassIndex(35971);
    }

    public static List<String> a(X509Certificate x509Certificate, int i2) {
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

    private static boolean a(String str, String str2) {
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

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            if (f57751b.matcher(str).matches()) {
                List<String> a2 = a(x509Certificate, 7);
                int size = a2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equalsIgnoreCase(a2.get(i2))) {
                        return true;
                    }
                }
                return false;
            }
            String lowerCase = str.toLowerCase(Locale.US);
            List<String> a3 = a(x509Certificate, 2);
            int size2 = a3.size();
            int i3 = 0;
            boolean z = false;
            while (i3 < size2) {
                if (a(lowerCase, a3.get(i3))) {
                    return true;
                }
                i3++;
                z = true;
            }
            if (!z) {
                c cVar = new c(x509Certificate.getSubjectX500Principal());
                cVar.f57745c = 0;
                cVar.f57746d = 0;
                cVar.f57747e = 0;
                cVar.f57748f = 0;
                cVar.f57749g = cVar.f57743a.toCharArray();
                String a4 = cVar.a();
                if (a4 != null) {
                    do {
                        String str2 = "";
                        if (cVar.f57745c != cVar.f57744b) {
                            char c2 = cVar.f57749g[cVar.f57745c];
                            if (c2 == '\"') {
                                cVar.f57745c++;
                                cVar.f57746d = cVar.f57745c;
                                cVar.f57747e = cVar.f57746d;
                                while (cVar.f57745c != cVar.f57744b) {
                                    if (cVar.f57749g[cVar.f57745c] == '\"') {
                                        cVar.f57745c++;
                                        while (cVar.f57745c < cVar.f57744b && cVar.f57749g[cVar.f57745c] == ' ') {
                                            cVar.f57745c++;
                                        }
                                        str2 = new String(cVar.f57749g, cVar.f57746d, cVar.f57747e - cVar.f57746d);
                                    } else {
                                        if (cVar.f57749g[cVar.f57745c] == '\\') {
                                            cVar.f57749g[cVar.f57747e] = cVar.d();
                                        } else {
                                            cVar.f57749g[cVar.f57747e] = cVar.f57749g[cVar.f57745c];
                                        }
                                        cVar.f57745c++;
                                        cVar.f57747e++;
                                    }
                                }
                                throw new IllegalStateException("Unexpected end of DN: " + cVar.f57743a);
                            } else if (c2 == '#') {
                                str2 = cVar.b();
                            } else if (!(c2 == '+' || c2 == ',' || c2 == ';')) {
                                str2 = cVar.c();
                            }
                            if ("cn".equalsIgnoreCase(a4)) {
                                if (str2 != null) {
                                    return a(lowerCase, str2);
                                }
                            } else if (cVar.f57745c < cVar.f57744b) {
                                if (cVar.f57749g[cVar.f57745c] == ',' || cVar.f57749g[cVar.f57745c] == ';' || cVar.f57749g[cVar.f57745c] == '+') {
                                    cVar.f57745c++;
                                    a4 = cVar.a();
                                } else {
                                    throw new IllegalStateException("Malformed DN: " + cVar.f57743a);
                                }
                            }
                        }
                    } while (a4 != null);
                    throw new IllegalStateException("Malformed DN: " + cVar.f57743a);
                }
            }
            return false;
        } catch (SSLException unused) {
        }
    }
}
