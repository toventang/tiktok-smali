package com.bytedance.lobby.instagram;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.b;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;

public class InstagramAuth extends InstagramProvider<AuthResult> implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f40215b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    private LobbyViewModel f40216d;

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        return null;
    }

    static {
        Covode.recordClassIndex(24791);
    }

    public InstagramAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
        b.a(this.f40216d, this.f40228c.f40176b);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, Bundle bundle) {
        this.f40216d = LobbyViewModel.a(eVar);
        if (!t_()) {
            b.a(this.f40216d, "instagram", 1);
            return;
        }
        String str = this.f40228c.f40177c;
        String string = this.f40228c.f40178d.getString("ig_login_auth_url");
        String string2 = this.f40228c.f40178d.getString("ig_redirect_url");
        String string3 = this.f40228c.f40178d.getString("ig_scope", "basic");
        String string4 = this.f40228c.f40178d.getString("ig_response_type", "code");
        Intent intent = new Intent(eVar, InstagramAuthActivity.class);
        intent.putExtra("client_id", str);
        intent.putExtra("login_auth_url", string);
        intent.putExtra("redirect_url", string2);
        intent.putExtra("response_type", string4);
        intent.putExtra("scope", string3);
        eVar.startActivityForResult(intent, 458);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, int i2, int i3, Intent intent) {
        AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
        if (intent == null) {
            aVar.f40157a = false;
            aVar.f40158b = new c(1, "No intent data received after launching InstagramAuthActivity", "redirect_and_get_token");
            this.f40216d.b(aVar.a());
            return;
        }
        if (i3 == -1) {
            String a2 = a(intent, "ig_result_error_info");
            String a3 = a(intent, "error_stage");
            aVar.f40157a = false;
            aVar.f40158b = new c(4, a2, a3);
        } else if (i3 == 0) {
            String a4 = a(intent, "ig_result_error_info");
            String a5 = a(intent, "error_stage");
            aVar.f40157a = false;
            aVar.f40158b = new c(3, a4, a5);
        } else if (i3 != 1) {
            aVar.f40157a = false;
            aVar.f40158b = new c(7, "Unidentified result code in InstagramAuthActivity", "redirect_and_get_token");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("code", a(intent, "ig_result_code"));
            aVar.f40157a = true;
            aVar.f40165i = bundle;
        }
        this.f40216d.b(aVar.a());
    }
}
