package com.ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.b.a;
import com.bytedance.ies.bullet.service.base.o;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.c;

public interface b {
    static {
        Covode.recordClassIndex(42701);
    }

    Activity a();

    <T extends BulletBusinessService.Business> T a(Class<T> cls);

    void a(Activity activity);

    void a(WebView webView);

    void a(a aVar);

    void a(o oVar);

    void a(com.bytedance.ies.bullet.service.f.a.b bVar);

    void a(c cVar);

    com.bytedance.ies.bullet.service.f.a.b b();

    void c();

    boolean d();
}
