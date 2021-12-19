package com.squareup.a.a.d;

import com.bytedance.covode.number.Covode;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final f f57742a;

    static {
        Covode.recordClassIndex(35969);
    }

    public b(f fVar) {
        this.f57742a = fVar;
    }

    public final List<Certificate> a(List<Certificate> list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i2 = 0;
        boolean z = false;
        do {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a2 = this.f57742a.a(x509Certificate);
            if (a2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a2)) {
                    arrayList.add(a2);
                }
                if (a(a2, a2)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
            }
            i2++;
        } while (i2 < 9);
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(arrayList)));
    }

    private static boolean a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
