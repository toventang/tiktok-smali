package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class DeepLinkDowngradeService implements IDeepLinkService {
    static {
        Covode.recordClassIndex(49311);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(d dVar, c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(String str, boolean z, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean a(Activity activity, String str, boolean z) {
        l.d(activity, "");
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean a(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String b() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String b(String str) {
        l.d(str, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void b(Activity activity, String str, boolean z) {
        l.d(activity, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String c() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean c(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String d() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String e() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String f() {
        return "";
    }
}
