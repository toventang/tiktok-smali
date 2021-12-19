package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.feed.aw;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.ss.android.ugc.aweme.commercialize.utils.b.a.c;
import com.ss.android.ugc.aweme.crossplatform.business.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.i18n.language.a;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.ss.android.ugc.aweme.setting.by;
import com.ss.android.ugc.b;
import java.util.Locale;

public class CrossPlatformLegacyServiceImpl implements ICrossPlatformLegacyService {
    static {
        Covode.recordClassIndex(38347);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void a() {
        aw.a();
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String d() {
        return a.b();
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String e() {
        return by.f122128a.f122131d;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final Locale c() {
        return a.a((String) null, (String) null, d.a());
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final int b() {
        AwemeAppData a2 = e.a();
        if (a2.f59950e == 1 || a2.f59950e == 0 || a2.f59950e == 2) {
            return a2.f59950e;
        }
        return 2;
    }

    public static ICrossPlatformLegacyService f() {
        MethodCollector.i(5258);
        Object a2 = b.a(ICrossPlatformLegacyService.class, false);
        if (a2 != null) {
            ICrossPlatformLegacyService iCrossPlatformLegacyService = (ICrossPlatformLegacyService) a2;
            MethodCollector.o(5258);
            return iCrossPlatformLegacyService;
        }
        if (b.o == null) {
            synchronized (ICrossPlatformLegacyService.class) {
                try {
                    if (b.o == null) {
                        b.o = new CrossPlatformLegacyServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5258);
                    throw th;
                }
            }
        }
        CrossPlatformLegacyServiceImpl crossPlatformLegacyServiceImpl = (CrossPlatformLegacyServiceImpl) b.o;
        MethodCollector.o(5258);
        return crossPlatformLegacyServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final String a(String str) {
        return a.C2792a.f108997a.f108996a.appendDeviceId(str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean a(Context context) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean a(Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void a(Activity activity, Uri.Builder builder) {
        com.ss.android.ugc.aweme.compliance.api.a.a().a(activity, builder);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean b(Context context, Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean c(Context context, Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.d(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean f(Context context, Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.b(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean d(Context context, Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean e(Context context, Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final <T> T a(Object obj, Class<T> cls) {
        if (!(obj instanceof com.ss.android.ugc.aweme.crossplatform.business.e)) {
            return null;
        }
        com.ss.android.ugc.aweme.crossplatform.business.e eVar = (com.ss.android.ugc.aweme.crossplatform.business.e) obj;
        if (cls != h.class) {
            return null;
        }
        T t = (T) eVar.a(DownloadBusiness.class);
        if (t instanceof h) {
            return t;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void a(Activity activity, String str) {
        Aweme d2 = AwemeService.b().d(str);
        com.ss.android.ugc.aweme.compliance.api.a.a().a(com.ss.android.ugc.aweme.report.b.a(d2, "homepage_hot"));
        com.ss.android.ugc.aweme.compliance.api.a.a().b(activity, com.ss.android.ugc.aweme.report.b.a(d2, "landing_page", "ad"));
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean a(Context context, Uri uri) {
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.c(context, uri);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final boolean a(Context context, String str) {
        return c.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void b(Context context, Aweme aweme, String str) {
        com.ss.android.ugc.aweme.commercialize.utils.b.a.a(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void c(Context context, Aweme aweme, String str) {
        com.ss.android.ugc.aweme.commercialize.utils.b.a.c(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void a(Context context, Aweme aweme, String str) {
        com.ss.android.ugc.aweme.commercialize.utils.b.a.b(context, aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.ICrossPlatformLegacyService
    public final void a(Activity activity, View view, float f2, String... strArr) {
        HeaderDetailActivity.a(activity, view, f2, null, false, false, strArr);
    }
}
