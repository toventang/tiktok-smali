package com.bytedance.android.livesdk.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.d.f;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f22116a;

    static {
        Covode.recordClassIndex(13027);
        HashMap hashMap = new HashMap();
        f22116a = hashMap;
        hashMap.put("en", "en");
        hashMap.put("af", "af-ZA");
        hashMap.put(f.f30878a, f.f30878a);
        hashMap.put("bn", "bn-IN");
        hashMap.put("ceb", "ceb-PH");
        hashMap.put("cs", "cs-CZ");
        hashMap.put("de", "de-DE");
        hashMap.put("el", "el-GR");
        hashMap.put("es", "es");
        hashMap.put("fi", "fi-FI");
        hashMap.put("fil", "fil-PH");
        hashMap.put("fr", "fr");
        hashMap.put("gu", "gu-IN");
        hashMap.put("iw", "he-IL");
        hashMap.put("hi", "hi-IN");
        hashMap.put("hu", "hu-HU");
        hashMap.put("in", "id-ID");
        hashMap.put("it", "it-IT");
        hashMap.put("ja", "ja-JP");
        hashMap.put("jv", "jv-ID");
        hashMap.put("km", "km-KH");
        hashMap.put("kn", "kn-IN");
        hashMap.put("ko", "ko-KR");
        hashMap.put("ml", "ml-IN");
        hashMap.put("mr", "mr-IN");
        hashMap.put("ms", "ms-MY");
        hashMap.put("my", "my-MM");
        hashMap.put("nl", "nl-NL");
        hashMap.put("or", "or-IN");
        hashMap.put("pa", "pa-IN");
        hashMap.put("pl", "pl-PL");
        hashMap.put("pt", "pt-BR");
        hashMap.put("ro", "ro-RO");
        hashMap.put("ru", "ru-RU");
        hashMap.put("sv", "sv-SE");
        hashMap.put("sw", "sw");
        hashMap.put("ta", "ta-IN");
        hashMap.put("te", "te-IN");
        hashMap.put("th", "th-TH");
        hashMap.put("tr", "tr-TR");
        hashMap.put("ur", "ur");
        hashMap.put("uk", "uk-UA");
        hashMap.put("vi", "vi-VN");
        hashMap.put("tw", "zh-Hant-TW");
        hashMap.put("zh", "zh-Hans");
        hashMap.put("zu", "zu-ZA");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.util.Locale r4) {
        /*
            java.lang.String r3 = "en"
            if (r4 == 0) goto L_0x0039
            java.lang.String r0 = r4.getLanguage()
            if (r0 == 0) goto L_0x0039
            java.lang.String r2 = r4.getLanguage()
        L_0x000e:
            java.lang.String r0 = r4.getCountry()
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = r4.getCountry()
        L_0x0018:
            java.lang.String r0 = "zh"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "TW"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = "tw"
        L_0x002a:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.bytedance.android.livesdk.util.d.f22116a
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r1.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0039:
            r2 = r3
            if (r4 == 0) goto L_0x003d
            goto L_0x000e
        L_0x003d:
            java.lang.String r1 = ""
            goto L_0x0018
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.d.a(java.util.Locale):java.lang.String");
    }
}
