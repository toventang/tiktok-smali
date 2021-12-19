package com.bytedance.lobby.vk;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.a;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.d;
import com.bytedance.lobby.c;
import com.bytedance.lobby.internal.LobbyViewModel;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.a.a;
import com.vk.api.sdk.a.b;
import com.vk.api.sdk.a.f;
import com.vk.api.sdk.f.g;
import com.vk.api.sdk.ui.VKWebViewAuthActivity;
import h.a.n;
import h.f.b.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VkAuth extends VkProvider<AuthResult> implements d, b {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f40272b = a.f40144a;

    /* renamed from: d  reason: collision with root package name */
    private static final f[] f40273d = {f.OFFLINE, f.FRIENDS};

    /* renamed from: e  reason: collision with root package name */
    private LobbyViewModel f40274e;

    /* renamed from: f  reason: collision with root package name */
    private final Application f40275f;

    @Override // com.bytedance.lobby.auth.d
    public final void a() {
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(int i2) {
    }

    static {
        Covode.recordClassIndex(24821);
    }

    @Override // com.bytedance.lobby.auth.d
    public final String b() {
        if (VK.a() && i() != null) {
            return i().f2397a;
        }
        return null;
    }

    private e<String, String> i() {
        Application application = this.f40275f;
        if (application == null) {
            return null;
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(application, "com.bytedance.lobby.vk", 0);
        try {
            String string = a2.getString("accessToken", null);
            String string2 = a2.getString("uid", null);
            if (!(string == null || TextUtils.isEmpty(string) || string2 == null)) {
                if (!TextUtils.isEmpty(string2)) {
                    return new e<>(string, string2);
                }
            }
        } catch (ClassCastException unused) {
        }
        return null;
    }

    @Override // com.vk.api.sdk.a.b
    public final void h() {
        AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
        aVar.f40157a = false;
        aVar.f40158b = new c(3, new StringBuilder("Error code: 1. See vk.com/dev/errors").toString());
        this.f40274e.b(aVar.a());
    }

    private boolean a(f[] fVarArr) {
        if (!VK.a()) {
            return false;
        }
        try {
            Application application = this.f40275f;
            if (application == null) {
                return false;
            }
            String string = com.ss.android.ugc.aweme.bf.d.a(application, "com.bytedance.lobby.vk", 0).getString("VkScopes", "");
            if (string == null) {
                return false;
            }
            if (string.length() == 0) {
                return false;
            }
            for (f fVar : fVarArr) {
                if (!string.contains(fVar.name())) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.vk.api.sdk.a.b
    public final void a(com.vk.api.sdk.a.a aVar) {
        if (TextUtils.isEmpty(aVar.f156210b)) {
            AuthResult.a aVar2 = new AuthResult.a(this.f40228c.f40176b, 1);
            aVar2.f40157a = false;
            aVar2.f40158b = new c(3, "accessToken == null");
            this.f40274e.b(aVar2.a());
            return;
        }
        Application application = this.f40275f;
        int i2 = aVar.f156209a;
        String str = aVar.f156210b;
        String str2 = aVar.f156211c;
        l.c(application, "");
        l.c(str, "");
        l.c(application, "");
        l.c(str, "");
        com.vk.api.sdk.a.a aVar3 = new com.vk.api.sdk.a.a(i2, str, str2);
        com.vk.api.sdk.b bVar = VK.f156195a;
        if (bVar == null) {
            l.a("config");
        }
        aVar3.a(bVar.q);
        com.vk.api.sdk.d dVar = VK.f156196b;
        if (dVar == null) {
            l.a("apiManager");
        }
        dVar.a(str, str2);
        if (this.f40275f != null) {
            StringBuilder sb = new StringBuilder();
            for (f fVar : f40273d) {
                sb.append(fVar.name());
            }
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(this.f40275f, "com.bytedance.lobby.vk", 0).edit();
            edit.putString("VkScopes", sb.toString());
            edit.apply();
        }
        Application application2 = this.f40275f;
        if (application2 != null) {
            SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.bf.d.a(application2, "com.bytedance.lobby.vk", 0).edit();
            edit2.putString("accessToken", aVar.f156210b);
            edit2.putString("uid", new StringBuilder().append(aVar.f156209a).toString());
            edit2.apply();
        }
        a(aVar.f156210b, new StringBuilder().append(aVar.f156209a).toString());
    }

    public VkAuth(com.bytedance.lobby.d dVar, Application application) {
        super(dVar);
        this.f40275f = application;
    }

    private void a(String str, String str2) {
        AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 1);
        aVar.f40157a = true;
        aVar.f40161e = str;
        aVar.f40160d = str2;
        this.f40274e.b(aVar.a());
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(androidx.fragment.app.e eVar, Bundle bundle) {
        List<ResolveInfo> queryIntentActivities;
        this.f40274e = LobbyViewModel.a(eVar);
        if (!t_()) {
            com.bytedance.lobby.auth.b.a(this.f40274e, this.f40228c.f40176b, 1);
            return;
        }
        e<String, String> i2 = i();
        f[] fVarArr = f40273d;
        if (!a(fVarArr) || i2 == null) {
            List asList = Arrays.asList(fVarArr);
            l.c(eVar, "");
            l.c(asList, "");
            if (VK.f156197c == null) {
                l.a("authManager");
            }
            l.c(eVar, "");
            l.c(asList, "");
            com.vk.api.sdk.a.d dVar = new com.vk.api.sdk.a.d(VK.b(eVar), asList);
            if (g.a(eVar, "com.vkontakte.android")) {
                l.c(eVar, "");
                l.c("com.vkontakte.android.action.SDK_AUTH", "");
                PackageManager packageManager = eVar.getPackageManager();
                if (!(packageManager == null || (queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH"), 65536)) == null)) {
                    l.d(queryIntentActivities, "");
                    if (!(queryIntentActivities instanceof Collection) ? queryIntentActivities.iterator().hasNext() : !queryIntentActivities.isEmpty()) {
                        Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
                        intent.setPackage("com.vkontakte.android");
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("client_id", dVar.f156223b);
                        bundle2.putBoolean("revoke", true);
                        bundle2.putString("scope", n.a(dVar.f156222a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
                        bundle2.putString("redirect_url", dVar.f156224c);
                        intent.putExtras(bundle2);
                        eVar.startActivityForResult(intent, 282);
                        return;
                    }
                }
            }
            l.c(eVar, "");
            l.c(dVar, "");
            Intent putExtra = new Intent(eVar, VKWebViewAuthActivity.class).putExtra("vk_auth_params", dVar.a());
            l.a((Object) putExtra, "");
            eVar.startActivityForResult(putExtra, 282);
            return;
        }
        a((String) i2.f2397a, (String) i2.f2398b);
    }

    @Override // com.bytedance.lobby.auth.d
    public final void b(androidx.fragment.app.e eVar, Bundle bundle) {
        Application application = this.f40275f;
        if (application != null) {
            com.ss.android.ugc.aweme.bf.d.a(application, "com.bytedance.lobby.vk", 0).edit().remove("accessToken").remove("uid").remove("VkScopes").apply();
        }
        l.c(this.f40275f, "");
        com.vk.api.sdk.a.c cVar = VK.f156197c;
        if (cVar == null) {
            l.a("authManager");
        }
        a.C4121a.a(cVar.f156220a);
        com.vk.api.sdk.a.c cVar2 = VK.f156197c;
        if (cVar2 == null) {
            l.a("authManager");
        }
        a.C4121a.a(cVar2.f156220a);
        com.vk.api.sdk.b bVar = VK.f156195a;
        if (bVar == null) {
            l.a("config");
        }
        Context context = bVar.f156228a;
        l.c(context, "");
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            instance.removeAllCookies(null);
        } else {
            CookieSyncManager createInstance = CookieSyncManager.createInstance(context);
            createInstance.startSync();
            instance.removeAllCookie();
            createInstance.stopSync();
        }
        AuthResult.a aVar = new AuthResult.a(this.f40228c.f40176b, 2);
        aVar.f40157a = true;
        this.f40274e.b(aVar.a());
    }

    @Override // com.bytedance.lobby.auth.d
    public final void a(androidx.fragment.app.e eVar, int i2, int i3, Intent intent) {
        l.c(this, "");
        com.vk.api.sdk.a.c cVar = VK.f156197c;
        if (cVar == null) {
            l.a("authManager");
        }
        l.c(this, "");
        if (i2 == 282) {
            if (intent == null) {
                h();
            } else {
                com.vk.api.sdk.a.e a2 = com.vk.api.sdk.a.c.a(intent);
                if (i3 == -1 && a2 != null && a2.f156226b == 0) {
                    com.vk.api.sdk.a.a aVar = a2.f156225a;
                    if (aVar == null) {
                        l.a();
                    }
                    aVar.a(cVar.f156220a);
                    com.vk.api.sdk.d dVar = VK.f156196b;
                    if (dVar == null) {
                        l.a("apiManager");
                    }
                    dVar.a(a2.f156225a.f156210b, a2.f156225a.f156211c);
                    a(a2.f156225a);
                } else {
                    h();
                }
            }
            if (VK.a()) {
                VK.b();
            }
        }
    }
}
