package com.snapchat.kit.sdk.core.networking;

import com.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snapchat.kit.sdk.core.a.c;
import java.io.IOException;
import java.util.LinkedHashMap;
import l.b;
import l.d;
import okhttp3.ResponseBody;

public final class l {

    /* renamed from: b  reason: collision with root package name */
    private static final String f57268b = l.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    final f f57269a;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseExtensionClient f57270c;

    static {
        Covode.recordClassIndex(35798);
    }

    public l(FirebaseExtensionClient firebaseExtensionClient, f fVar) {
        this.f57270c = firebaseExtensionClient;
        this.f57269a = fVar;
    }

    /* access modifiers changed from: package-private */
    public final String a(b<String> bVar, l.l<String> lVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("throws", a.a("HTTP %s error when hitting %s", new Object[]{Integer.valueOf(lVar.f159305a.code()), bVar.d().url()}));
        linkedHashMap.put("isNetworkError", Boolean.FALSE);
        String message = lVar.f159305a.message();
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("responseMsg", message);
        T t = lVar.f159306b;
        if (t == null) {
            t = "";
        }
        linkedHashMap.put("responseBody", t);
        ResponseBody responseBody = lVar.f159307c;
        if (responseBody != null) {
            try {
                linkedHashMap.put("errorBody", responseBody.string());
            } catch (IOException e2) {
                linkedHashMap.put("errorBody", e2.getMessage());
            }
        } else {
            linkedHashMap.put("errorBody", "");
        }
        return this.f57269a.b(linkedHashMap);
    }

    public final void a(String str, String str2, String str3, final CompletionCallback<String> completionCallback) {
        this.f57270c.getCustomToken(new c(str, str2, str3)).a(new d<String>() {
            /* class com.snapchat.kit.sdk.core.networking.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35799);
            }

            @Override // l.d
            public final void a(b<String> bVar, Throwable th) {
                CompletionCallback completionCallback = completionCallback;
                boolean z = th instanceof IOException;
                l lVar = l.this;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("throws", a.a("%s when hitting %s", new Object[]{th.getMessage(), bVar.d().url()}));
                linkedHashMap.put("isNetworkError", Boolean.valueOf(z));
                completionCallback.onFailure(z, 408, lVar.f57269a.b(linkedHashMap));
            }

            @Override // l.d
            public final void a(b<String> bVar, l.l<String> lVar) {
                if (lVar.f159305a.isSuccessful()) {
                    completionCallback.onSuccess(lVar.f159306b);
                } else {
                    completionCallback.onFailure(false, lVar.f159305a.code(), l.this.a(bVar, lVar));
                }
            }
        });
    }
}
