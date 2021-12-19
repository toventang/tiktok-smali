package net.openid.appauth;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;
import net.openid.appauth.c.a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f159709a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    static {
        Covode.recordClassIndex(106093);
    }

    public static String a() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }

    public static void a(String str) {
        boolean z;
        boolean z2 = true;
        if (43 <= str.length()) {
            z = true;
        } else {
            z = false;
        }
        p.a(z, "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() > 128) {
            z2 = false;
        }
        p.a(z2, "codeVerifier length is longer than allowed by the PKCE specification");
        p.a(f159709a.matcher(str).matches(), "codeVerifier string contains illegal characters");
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e2) {
            a.c("SHA-256 is not supported on this device! Using plain challenge", e2);
            return str;
        } catch (UnsupportedEncodingException e3) {
            a.d("ISO-8859-1 encoding not supported on this device!", e3);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e3);
        }
    }
}
