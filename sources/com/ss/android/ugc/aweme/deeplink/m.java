package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class m implements IDeepLinkService {

    /* renamed from: a  reason: collision with root package name */
    public static final m f79501a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IDeepLinkService f79502b;

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a() {
        this.f79502b.a();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(d dVar, c cVar) {
        l.d(dVar, "");
        l.d(cVar, "");
        this.f79502b.a(dVar, cVar);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f79502b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void a(String str, boolean z, String str2) {
        this.f79502b.a(str, z, str2);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean a(Activity activity, String str, boolean z) {
        l.d(activity, "");
        l.d(str, "");
        return this.f79502b.a(activity, str, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean a(String str) {
        l.d(str, "");
        return this.f79502b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String b() {
        return this.f79502b.b();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String b(String str) {
        l.d(str, "");
        return this.f79502b.b(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final void b(Activity activity, String str, boolean z) {
        l.d(activity, "");
        l.d(str, "");
        this.f79502b.b(activity, str, z);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String c() {
        return this.f79502b.c();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final boolean c(String str) {
        return this.f79502b.c(str);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String d() {
        return this.f79502b.d();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String e() {
        return this.f79502b.e();
    }

    @Override // com.ss.android.ugc.aweme.deeplink.IDeepLinkService
    public final String f() {
        return this.f79502b.f();
    }

    static {
        Covode.recordClassIndex(49386);
    }

    private m() {
        IDeepLinkService g2 = DeepLinkServiceImpl.g();
        l.b(g2, "");
        this.f79502b = g2;
    }
}
