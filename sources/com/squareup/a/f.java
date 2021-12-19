package com.squareup.a;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f57840a = new f(new a(), (byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Set<i>> f57841b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Set<i>> f57842a = new LinkedHashMap();

        static {
            Covode.recordClassIndex(35999);
        }
    }

    static {
        Covode.recordClassIndex(35998);
    }

    private f(a aVar) {
        this.f57841b = Collections.unmodifiableMap(new LinkedHashMap(aVar.f57842a));
    }

    private static i a(X509Certificate x509Certificate) {
        return j.a(i.of(x509Certificate.getPublicKey().getEncoded()));
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + a((X509Certificate) certificate).base64();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private /* synthetic */ f(a aVar, byte b2) {
        this(aVar);
    }

    public final void a(String str, List<Certificate> list) {
        Set<i> set = this.f57841b.get(str);
        int indexOf = str.indexOf(46);
        Set<i> set2 = null;
        if (indexOf != str.lastIndexOf(46)) {
            set2 = this.f57841b.get("*." + str.substring(indexOf + 1));
        }
        if (set == null) {
            if (set2 == null || (set = set2) == null) {
                return;
            }
        } else if (set2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set);
            linkedHashSet.addAll(set2);
            set = linkedHashSet;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (set.contains(a((X509Certificate) list.get(i2)))) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i3);
            sb.append("\n    ").append(a((Certificate) x509Certificate)).append(": ").append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ").append(str).append(":");
        for (i iVar : set) {
            sb.append("\n    sha1/").append(iVar.base64());
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
