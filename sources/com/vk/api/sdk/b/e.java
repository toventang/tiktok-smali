package com.vk.api.sdk.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.c.a;
import com.vk.api.sdk.d.b;
import com.vk.api.sdk.d.d;
import com.vk.api.sdk.internal.c;
import h.a.ag;
import h.a.i;
import h.f.b.l;
import h.m.p;
import h.v;
import h.w;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e<T> extends b<T> {

    /* renamed from: b  reason: collision with root package name */
    public final b f156254b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f156255c;

    /* renamed from: d  reason: collision with root package name */
    public String f156256d;

    /* renamed from: e  reason: collision with root package name */
    public final String f156257e;

    /* renamed from: f  reason: collision with root package name */
    public final com.vk.api.sdk.e<T> f156258f;

    static {
        Covode.recordClassIndex(103769);
    }

    @Override // com.vk.api.sdk.b.b
    public final T a(a aVar) {
        boolean z;
        String str;
        Map map;
        List<String> queryParameters;
        String str2 = "";
        l.c(aVar, str2);
        if (aVar.f156247a.length() > 0 && aVar.f156248b.length() > 0) {
            this.f156255c.a("captcha_sid", aVar.f156247a).a("captcha_key", aVar.f156248b);
        }
        if (aVar.f156249c) {
            this.f156255c.a("confirm", "1");
        }
        String a2 = this.f156255c.a("device_id");
        if (a2 == null) {
            a2 = str2;
        }
        if (p.a((CharSequence) a2)) {
            a2 = this.f156256d;
        }
        d.a aVar2 = this.f156255c;
        if (a2 != null) {
            String lowerCase = a2.toLowerCase();
            l.a((Object) lowerCase, str2);
            aVar2.a("device_id", lowerCase);
            String a3 = this.f156255c.a("lang");
            if (a3 == null) {
                a3 = str2;
            }
            if (p.a((CharSequence) a3)) {
                a3 = this.f156257e;
            }
            d.a aVar3 = this.f156255c;
            if (a3 != null) {
                String lowerCase2 = a3.toLowerCase();
                l.a((Object) lowerCase2, str2);
                aVar3.a("lang", lowerCase2);
                d a4 = this.f156255c.a();
                l.c(a4, str2);
                b bVar = this.f156254b;
                l.c(a4, str2);
                l.c(a4, str2);
                String str3 = bVar.f156282d;
                l.c(a4, str2);
                String str4 = bVar.f156283e;
                int i2 = bVar.f156284f.f156289a.f156229b;
                l.c(a4, str2);
                String str5 = a4.f156290a;
                String str6 = a4.f156291b;
                Map<String, String> map2 = a4.f156292c;
                l.c(str5, str2);
                l.c(str6, str2);
                l.c(map2, str2);
                if (str4 == null || str4.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str = c.a(str6, map2, str3, i2, true);
                } else {
                    String str7 = "/method/" + str5 + '?' + c.a(str6, map2, str3, i2, false) + str4;
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    Charset charset = h.m.d.f158808a;
                    if (str7 != null) {
                        byte[] bytes = str7.getBytes(charset);
                        l.a((Object) bytes, str2);
                        byte[] digest = instance.digest(bytes);
                        l.a((Object) digest, str2);
                        c.a aVar4 = c.a.f156347a;
                        str2 = str2;
                        l.d(digest, str2);
                        l.d(str2, str2);
                        l.d(str2, str2);
                        l.d(str2, str2);
                        l.d("...", str2);
                        String sb = ((StringBuilder) i.a(digest, new StringBuilder(), str2, str2, str2, "...", aVar4)).toString();
                        l.b(sb, str2);
                        str = c.a(str6, map2, str3, i2, true) + "&sig=" + sb;
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                }
                MediaType parse = MediaType.parse("application/x-www-form-urlencoded; charset=utf-8");
                l.c(a4, str2);
                l.c(str, str2);
                if (p.b(a4.f156290a, "execute.", false)) {
                    Uri parse2 = Uri.parse("https://vk.com/?".concat(String.valueOf(str)));
                    if (parse2.getQueryParameters("method").contains("execute") && (queryParameters = parse2.getQueryParameters("code")) != null && !queryParameters.isEmpty()) {
                        throw new com.vk.api.sdk.c.b(15, a4.f156290a, false, "Hey dude don't execute your hacky code ;)", null, null, null, 112, null);
                    }
                }
                Request.Builder cacheControl = new Request.Builder().post(RequestBody.create(parse, str)).url("https://" + bVar.f156281c + "/method/" + a4.f156290a).cacheControl(CacheControl.FORCE_NETWORK);
                com.vk.api.sdk.d.e eVar = a4.f156293d;
                if (eVar != null) {
                    map = ag.b(v.a("UID", eVar.f156298a), v.a("AWAIT_NETWORK", eVar.f156299b), v.a("REASON", eVar.f156300c), v.a("RETRY_COUNT", eVar.f156301d));
                } else {
                    map = null;
                }
                Request build = cacheControl.tag(Map.class, map).build();
                l.a((Object) build, str2);
                l.c(build, str2);
                long j2 = bVar.f156284f.f156289a.f156234g;
                l.c(build, str2);
                Response execute = bVar.a(j2).newCall(build).execute();
                l.a((Object) execute, str2);
                String a5 = b.a(execute);
                String str8 = a4.f156290a;
                l.c(str8, str2);
                if (a5 != null) {
                    l.c(a5, str2);
                    l.c(a5, str2);
                    if (!com.vk.api.sdk.internal.b.a(a5, "error")) {
                        l.c(a5, str2);
                        l.c(a5, str2);
                        if (!com.vk.api.sdk.internal.b.a(a5, "execute_errors")) {
                            com.vk.api.sdk.e<T> eVar2 = this.f156258f;
                            if (eVar2 != null) {
                                return eVar2.a(a5);
                            }
                            return null;
                        }
                        l.c(a5, str2);
                        l.c(str8, str2);
                        l.c(a5, str2);
                        l.c(str8, str2);
                        JSONArray jSONArray = new JSONObject(a5).getJSONArray("execute_errors");
                        l.a((Object) jSONArray, str2);
                        throw com.vk.api.sdk.internal.d.a(jSONArray, str8);
                    }
                    l.c(a5, str2);
                    l.c(a5, str2);
                    JSONObject optJSONObject = new JSONObject(a5).optJSONObject("error");
                    l.a((Object) optJSONObject, str2);
                    throw com.vk.api.sdk.internal.d.a(optJSONObject, str8);
                }
                throw new a("Response returned null instead of valid string response");
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.vk.api.sdk.d dVar, b bVar, d.a aVar, String str, String str2, com.vk.api.sdk.e<T> eVar) {
        super(dVar);
        l.c(dVar, "");
        l.c(bVar, "");
        l.c(aVar, "");
        l.c(str, "");
        l.c(str2, "");
        this.f156254b = bVar;
        this.f156255c = aVar;
        this.f156256d = str;
        this.f156257e = str2;
        this.f156258f = eVar;
    }
}
