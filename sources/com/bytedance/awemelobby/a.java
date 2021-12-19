package com.bytedance.awemelobby;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.b;
import com.bytedance.lobby.d;
import com.ss.android.ugc.aweme.lego.d;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f25817a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f25818b = new a();

    private a() {
    }

    /* renamed from: com.bytedance.awemelobby.a$a  reason: collision with other inner class name */
    public static final class C0551a implements b {
        static {
            Covode.recordClassIndex(15073);
        }

        @Override // com.bytedance.lobby.b
        public final boolean a() {
            if (!d.d()) {
                return true;
            }
            return false;
        }

        @Override // com.bytedance.lobby.b
        public final List<com.bytedance.lobby.d> b() {
            com.bytedance.lobby.d b2 = new d.c(com.ss.android.ugc.aweme.buildconfigdiff.b.b()).a().b();
            l.a((Object) b2, "");
            com.bytedance.lobby.d b3 = new d.e(com.ss.android.ugc.aweme.buildconfigdiff.b.j()).a().a(new com.bytedance.lobby.b.a().a("google_auth_redirect_uri", com.ss.android.ugc.aweme.buildconfigdiff.b.l()).b()).b();
            l.a((Object) b3, "");
            com.bytedance.lobby.d b4 = new d.C0983d(com.ss.android.ugc.aweme.buildconfigdiff.b.k()).a().b();
            l.a((Object) b4, "");
            com.bytedance.lobby.d b5 = new d.b(com.ss.android.ugc.aweme.buildconfigdiff.b.c()).a().b();
            l.a((Object) b5, "");
            com.bytedance.lobby.d b6 = new d.h(com.ss.android.ugc.aweme.buildconfigdiff.b.a()).a().b();
            l.a((Object) b6, "");
            d.a a2 = new d.f(com.ss.android.ugc.aweme.buildconfigdiff.b.d()).a();
            Bundle bundle = new Bundle();
            bundle.putString("ig_scope", "user_profile");
            bundle.putString("ig_redirect_url", com.ss.android.ugc.aweme.buildconfigdiff.b.e());
            bundle.putString("ig_login_auth_url", "https://api.instagram.com/oauth/authorize/");
            com.bytedance.lobby.d b7 = a2.a(bundle).b();
            l.a((Object) b7, "");
            d.a a3 = new d.i(com.ss.android.ugc.aweme.buildconfigdiff.b.f()).a();
            Bundle bundle2 = new Bundle();
            bundle2.putString("twitter_consumer_secret", com.ss.android.ugc.aweme.buildconfigdiff.b.g());
            com.bytedance.lobby.d b8 = a3.a(bundle2).b();
            l.a((Object) b8, "");
            com.bytedance.lobby.d b9 = new d.g(com.ss.android.ugc.aweme.buildconfigdiff.b.h()).a().b();
            l.a((Object) b9, "");
            com.bytedance.lobby.d b10 = new d.j(com.ss.android.ugc.aweme.buildconfigdiff.b.i()).a().b();
            l.a((Object) b10, "");
            return n.c(b2, b3, b4, b5, b6, b7, b8, b9, b10);
        }
    }

    static {
        Covode.recordClassIndex(15072);
    }
}
