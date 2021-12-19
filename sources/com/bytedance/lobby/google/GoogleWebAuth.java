package com.bytedance.lobby.google;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.bytedance.sdk.a.k.a.b;
import com.bytedance.sdk.a.k.c.b;
import com.bytedance.sdk.a.k.c.c;
import com.bytedance.sdk.a.k.c.f;
import java.util.HashSet;
import net.openid.appauth.e;

public class GoogleWebAuth extends GoogleWebAuthProvider implements d, b {

    /* renamed from: b  reason: collision with root package name */
    private b.a f40205b;

    /* renamed from: d  reason: collision with root package name */
    private LobbyViewModel f40206d;

    static {
        Covode.recordClassIndex(24785);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        return null;
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
        b.a aVar = this.f40205b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.bytedance.lobby.internal.b, com.bytedance.lobby.internal.BaseProvider
    public final boolean t_() {
        if (net.openid.appauth.a.d.a(LobbyCore.getApplication()) != null) {
            return true;
        }
        return false;
    }

    public GoogleWebAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.bytedance.sdk.a.k.c.b
    public final void a(Bundle bundle) {
        AuthResult.a aVar = new AuthResult.a("google_web", 1);
        aVar.f40157a = true;
        aVar.f40161e = bundle.getString("access_token", "");
        aVar.f40162f = bundle.getString("id_token", "");
        this.f40206d.b(aVar.a());
    }

    @Override // com.bytedance.sdk.a.k.c.b
    public final void a(c cVar) {
        String str;
        if (cVar.f43389c != null) {
            boolean z = true;
            AuthResult.a aVar = new AuthResult.a("google_web", 1);
            aVar.f40157a = false;
            if (TextUtils.isEmpty(cVar.f43389c)) {
                str = "-1";
            } else {
                str = cVar.f43389c;
            }
            com.bytedance.lobby.c cVar2 = new com.bytedance.lobby.c(Integer.parseInt(str), cVar.f43390d);
            if (!cVar.f43388b && Integer.parseInt(cVar.f43389c) != e.b.f159617b.code) {
                z = false;
            }
            aVar.f40158b = cVar2.setCancelled(z);
            this.f40206d.b(aVar.a());
        }
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(androidx.fragment.app.e eVar, Bundle bundle) {
        this.f40206d = (LobbyViewModel) ae.a(eVar, (ad.b) null).a(LobbyViewModel.class);
        f fVar = new f();
        fVar.f43396c = "code";
        HashSet hashSet = new HashSet();
        hashSet.add("profile");
        fVar.f43394a = hashSet;
        fVar.f43395b = "app_auth";
        fVar.f43397d = Uri.parse(this.f40228c.f40178d.getString("google_auth_redirect_uri", null));
        this.f40205b = ((com.bytedance.sdk.a.k.a.b) com.bytedance.sdk.a.k.c.d.a(com.bytedance.sdk.a.k.a.b.class)).a(eVar, fVar, this);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(androidx.fragment.app.e eVar, int i2, int i3, Intent intent) {
        b.a aVar = this.f40205b;
        if (aVar != null) {
            aVar.a(i2, intent);
        }
    }
}
