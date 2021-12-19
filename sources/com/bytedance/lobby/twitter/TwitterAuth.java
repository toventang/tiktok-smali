package com.bytedance.lobby.twitter;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.b;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import com.twitter.sdk.android.core.identity.h;
import com.twitter.sdk.android.core.j;
import com.twitter.sdk.android.core.k;
import com.twitter.sdk.android.core.q;
import com.twitter.sdk.android.core.s;
import com.twitter.sdk.android.core.u;
import java.util.Arrays;

public class TwitterAuth extends TwitterProvider<AuthResult> implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f40265b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    public LobbyViewModel f40266d;

    /* renamed from: e  reason: collision with root package name */
    private h f40267e;

    /* renamed from: f  reason: collision with root package name */
    private b<u> f40268f;

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
        this.f40267e = null;
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    static {
        Covode.recordClassIndex(24818);
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        u a2;
        TwitterAuthToken twitterAuthToken;
        j<u> jVar = q.a().f156176b;
        if (jVar == null || jVar.a() == null || (a2 = jVar.a()) == null || a2.f155913a == null || (twitterAuthToken = (TwitterAuthToken) a2.f155913a) == null) {
            return null;
        }
        return twitterAuthToken.f155894b;
    }

    public TwitterAuth(com.bytedance.lobby.d dVar) {
        super(LobbyCore.getApplication(), dVar);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(e eVar, Bundle bundle) {
        com.bytedance.lobby.auth.b.a(this.f40266d, this.f40228c.f40176b);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, Bundle bundle) {
        this.f40266d = LobbyViewModel.a(eVar);
        if (!t_()) {
            com.bytedance.lobby.auth.b.a(this.f40266d, this.f40228c.f40176b, 1);
            return;
        }
        this.f40267e = new h(eVar);
        AnonymousClass1 r1 = new b<u>() {
            /* class com.bytedance.lobby.twitter.TwitterAuth.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24819);
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(com.twitter.sdk.android.core.h<u> hVar) {
                TwitterAuth twitterAuth = TwitterAuth.this;
                T t = hVar.f155911a;
                String str = ((TwitterAuthToken) t.f155913a).f155894b;
                String str2 = ((TwitterAuthToken) t.f155913a).f155895c;
                AuthResult.a aVar = new AuthResult.a(twitterAuth.f40228c.f40176b, 1);
                aVar.f40157a = true;
                aVar.f40161e = str;
                aVar.f40162f = str2;
                aVar.f40160d = String.valueOf(t.f155914b);
                aVar.f40165i = new com.bytedance.lobby.b.a().a("username", t.f156193c).a();
                twitterAuth.f40266d.b(aVar.a());
            }

            @Override // com.twitter.sdk.android.core.b
            public final void a(s sVar) {
                String message = sVar.getMessage();
                AuthResult.a aVar = new AuthResult.a(TwitterAuth.this.f40228c.f40176b, 1);
                if (Arrays.asList("Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete").contains(message)) {
                    aVar.f40157a = false;
                    aVar.f40158b = new c(4, message, "redirect_and_get_token");
                } else {
                    aVar.f40157a = false;
                    aVar.f40158b = new c(sVar);
                }
                TwitterAuth.this.f40266d.b(aVar.a());
            }
        };
        this.f40268f = r1;
        this.f40267e.setCallback(r1);
        this.f40267e.performClick();
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(e eVar, int i2, int i3, Intent intent) {
        h hVar = this.f40267e;
        if (hVar != null) {
            hVar.getTwitterAuthClient();
            if (i2 == 140) {
                TwitterAuthClient twitterAuthClient = hVar.getTwitterAuthClient();
                k.c().b();
                if (!twitterAuthClient.f155919b.a()) {
                    k.c().a();
                    return;
                }
                com.twitter.sdk.android.core.identity.a aVar = twitterAuthClient.f155919b.f155928a.get();
                if (aVar != null && aVar.a(i2, i3, intent)) {
                    twitterAuthClient.f155919b.f155928a.set(null);
                }
            }
        }
    }
}
