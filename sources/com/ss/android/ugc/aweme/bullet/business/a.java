package com.ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.f.a.b;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.c;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public b f69252a;

    /* renamed from: b  reason: collision with root package name */
    c f69253b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.ies.bullet.kit.web.b.a f69254c;

    /* renamed from: d  reason: collision with root package name */
    WebView f69255d;

    /* renamed from: e  reason: collision with root package name */
    o f69256e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Activity> f69257f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f69258g = true;

    /* renamed from: h  reason: collision with root package name */
    private final BulletBusinessService f69259h = new BulletBusinessService(this);

    static {
        Covode.recordClassIndex(42699);
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void c() {
        this.f69258g = false;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final b b() {
        return this.f69252a;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final boolean d() {
        return this.f69258g;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final Activity a() {
        WeakReference<Activity> weakReference = this.f69257f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void a(WebView webView) {
        this.f69255d = webView;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void a(Activity activity) {
        this.f69257f = new WeakReference<>(activity);
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final <T extends BulletBusinessService.Business> T a(Class<T> cls) {
        l.d(cls, "");
        return (T) this.f69259h.a(cls);
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void a(com.bytedance.ies.bullet.kit.web.b.a aVar) {
        this.f69254c = aVar;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void a(o oVar) {
        this.f69256e = oVar;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f69252a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.bullet.business.b
    public final void a(c cVar) {
        this.f69253b = cVar;
    }
}
