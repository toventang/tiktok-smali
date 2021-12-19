package net.openid.appauth.a;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f159575a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<String> f159576b;

    /* renamed from: c  reason: collision with root package name */
    public final String f159577c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f159578d;

    static {
        Covode.recordClassIndex(106060);
    }

    public final int hashCode() {
        int hashCode = (((this.f159575a.hashCode() * 92821) + this.f159577c.hashCode()) * 92821) + (this.f159578d.booleanValue() ? 1 : 0);
        for (String str : this.f159576b) {
            hashCode = (hashCode * 92821) + str.hashCode();
        }
        return hashCode;
    }

    private static String a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    private static Set<String> a(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(a(signature));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (!this.f159575a.equals(bVar.f159575a) || !this.f159577c.equals(bVar.f159577c) || this.f159578d != bVar.f159578d || !this.f159576b.equals(bVar.f159576b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public b(PackageInfo packageInfo, boolean z) {
        this(packageInfo.packageName, a(packageInfo.signatures), packageInfo.versionName, z);
    }

    private b(String str, Set<String> set, String str2, boolean z) {
        this.f159575a = str;
        this.f159576b = set;
        this.f159577c = str2;
        this.f159578d = Boolean.valueOf(z);
    }
}
