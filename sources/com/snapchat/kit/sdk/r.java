package com.snapchat.kit.sdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.networking.FirebaseExtensionClient;
import dagger.a.c;
import dagger.a.f;
import javax.a.a;

public final class r implements c<FirebaseExtensionClient> {

    /* renamed from: a  reason: collision with root package name */
    private final n f57388a;

    /* renamed from: b  reason: collision with root package name */
    private final a<com.snapchat.kit.sdk.core.networking.a> f57389b;

    static {
        Covode.recordClassIndex(35866);
    }

    @Override // javax.a.a
    public final /* synthetic */ Object get() {
        Object a2;
        n nVar = this.f57388a;
        this.f57389b.get();
        if (!TextUtils.isEmpty(nVar.f57384h)) {
            if (nVar.f57384h.endsWith("/")) {
                a2 = com.snapchat.kit.sdk.core.networking.a.a(nVar.f57384h, FirebaseExtensionClient.class);
            } else {
                a2 = com.snapchat.kit.sdk.core.networking.a.a(nVar.f57384h.concat("/"), FirebaseExtensionClient.class);
            }
            return f.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new IllegalStateException("Firebase Extension custom token url must be set!");
    }

    r(n nVar, a<com.snapchat.kit.sdk.core.networking.a> aVar) {
        this.f57388a = nVar;
        this.f57389b = aVar;
    }
}
