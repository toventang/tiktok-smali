package com.bytedance.lobby.facebook;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.facebook.AccessToken;
import com.facebook.b;
import com.facebook.e;
import com.facebook.h;
import com.facebook.internal.e;
import com.facebook.j;
import com.facebook.login.g;

public class FacebookAuth extends FacebookProvider<AuthResult> implements d, h<g> {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f40183b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    private e f40184d;

    /* renamed from: e  reason: collision with root package name */
    private LobbyViewModel f40185e;

    /* renamed from: f  reason: collision with root package name */
    private a f40186f;

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    static {
        Covode.recordClassIndex(24772);
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        if (b.a().f46926b != null) {
            return b.a().f46926b.f46498e;
        }
        return null;
    }

    @Override // com.facebook.h
    public final void c() {
        AuthResult.a aVar = new AuthResult.a("facebook", 1);
        aVar.f40157a = false;
        aVar.f40158b = new c(4, "Facebook login cancelled");
        this.f40185e.b(aVar.a());
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
        a aVar = this.f40186f;
        if (aVar != null) {
            e eVar = this.f40184d;
            aVar.getLoginManager();
            if (eVar instanceof com.facebook.internal.e) {
                ((com.facebook.internal.e) eVar).f48601a.remove(Integer.valueOf(e.b.Login.toRequestCode()));
                this.f40186f.onDetachedFromWindow();
                this.f40186f = null;
                return;
            }
            throw new j("Unexpected CallbackManager, please use the provided Factory.");
        }
    }

    public FacebookAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.facebook.h
    public final void a(j jVar) {
        AuthResult.a aVar = new AuthResult.a("facebook", 1);
        aVar.f40157a = false;
        aVar.f40158b = new c(jVar);
        this.f40185e.b(aVar.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.h
    public final /* synthetic */ void a(g gVar) {
        g gVar2 = gVar;
        AccessToken accessToken = gVar2.f48912a;
        String str = accessToken.f46498e;
        Bundle bundle = new Bundle();
        bundle.putStringArray("fb_granted_permissions", (String[]) accessToken.f46495b.toArray(new String[0]));
        AuthResult.a aVar = new AuthResult.a("facebook", 1);
        aVar.f40157a = true;
        aVar.f40161e = str;
        aVar.f40163g = gVar2.f48912a.f46494a.getTime();
        aVar.f40160d = gVar2.f48912a.f46502i;
        aVar.f40165i = bundle;
        this.f40185e.b(aVar.a());
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(androidx.fragment.app.e eVar, Bundle bundle) {
        com.bytedance.lobby.auth.b.a(this.f40185e, this.f40228c.f40176b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L_0x003c;
     */
    @Override // com.bytedance.lobby.auth.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.fragment.app.e r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.facebook.FacebookAuth.a(androidx.fragment.app.e, android.os.Bundle):void");
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(androidx.fragment.app.e eVar, int i2, int i3, Intent intent) {
        com.facebook.e eVar2 = this.f40184d;
        if (eVar2 != null) {
            eVar2.a(i2, i3, intent);
            return;
        }
        AuthResult.a aVar = new AuthResult.a("facebook", 1);
        aVar.f40157a = false;
        aVar.f40158b = new c(3, "Facebook CallbackManager is null");
        this.f40185e.b(aVar.a());
    }
}
