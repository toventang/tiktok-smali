package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.s;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AuthTokenAdapter implements k<a>, s<a> {

    /* renamed from: a  reason: collision with root package name */
    static final Map<String, Class<? extends a>> f155890a;

    /* renamed from: b  reason: collision with root package name */
    private final f f155891b = new f();

    static {
        Covode.recordClassIndex(103579);
        HashMap hashMap = new HashMap();
        f155890a = hashMap;
        hashMap.put("oauth1a", TwitterAuthToken.class);
        hashMap.put("oauth2", OAuth2Token.class);
        hashMap.put("guest", GuestAuthToken.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.gson.s
    public final /* synthetic */ l a(a aVar) {
        String str;
        o oVar = new o();
        Class<?> cls = aVar.getClass();
        Iterator<Map.Entry<String, Class<? extends a>>> it = f155890a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            Map.Entry<String, Class<? extends a>> next = it.next();
            if (next.getValue().equals(cls)) {
                str = next.getKey();
                break;
            }
        }
        oVar.a("auth_type", str);
        oVar.a("auth_token", this.f155891b.a(aVar));
        return oVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* synthetic */ a a(l lVar, Type type, j jVar) {
        o j2 = lVar.j();
        String c2 = j2.d("auth_type").c();
        return this.f155891b.a(j2.c("auth_token"), (Class) f155890a.get(c2));
    }
}
