package com.snapchat.kit.sdk;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.a.b;
import com.snapchat.kit.sdk.core.a.f;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private static String f57323a = "AuthRequestFactory";

    /* renamed from: b  reason: collision with root package name */
    private static int f57324b = 32;

    /* renamed from: c  reason: collision with root package name */
    private static int f57325c = 32;

    static {
        Covode.recordClassIndex(35844);
    }

    private static String a(int i2) {
        byte[] bArr = new byte[i2];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    private static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("US-ASCII"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Exception unused) {
            return str;
        }
    }

    static b a(String str, String str2, List<String> list, f fVar, KitPluginType kitPluginType, boolean z, boolean z2) {
        return a(str, str2, list, a(f57324b), a(f57325c), fVar, kitPluginType, z, z2);
    }

    static b a(String str, String str2, List<String> list, String str3, String str4, f fVar, KitPluginType kitPluginType, boolean z, boolean z2) {
        return new b().withResponseType("code").withClientId(str).withScope(TextUtils.join(" ", list)).withRedirectUri(str2).withCodeChallengeMethod("S256").withCodeVerifier(str4).withCodeChallenge(a(str4)).withState(str3).withFeatures(fVar.a()).withKitPluginType(kitPluginType).withSdkIsFromReactNativePlugin(z).withIsForFirebaseAuthentication(z2);
    }
}
