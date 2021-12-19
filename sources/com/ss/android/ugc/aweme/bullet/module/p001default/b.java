package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.d;
import com.bytedance.ies.bullet.ui.common.g;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.utils.en;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.b  reason: invalid package */
public final class b extends com.bytedance.ies.bullet.kit.lynx.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69503a = new a((byte) 0);

    static {
        Covode.recordClassIndex(42857);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.b$a */
    public static final class a {
        static {
            Covode.recordClassIndex(42858);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.b.a, com.bytedance.ies.bullet.kit.lynx.e
    public final Map<String, Object> a(com.bytedance.ies.bullet.kit.lynx.b bVar, com.bytedance.ies.bullet.c.e.a.b bVar2) {
        int i2;
        int i3;
        String str;
        String str2;
        Activity a2;
        d<?, ?, ?, ?> a3;
        l.d(bVar, "");
        l.d(bVar2, "");
        Context context = (Context) bVar2.c(Context.class);
        int i4 = 0;
        if (context != null) {
            i3 = n.b((double) i.b(context));
            i2 = n.b((double) i.a(context));
        } else {
            i2 = 0;
            i3 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("screenWidth", Integer.valueOf(i3));
        linkedHashMap.put("screenHeight", Integer.valueOf(i2));
        linkedHashMap.put("os", "android");
        String str3 = Build.VERSION.RELEASE;
        l.b(str3, "");
        linkedHashMap.put("osVersion", str3);
        linkedHashMap.put("channel", com.bytedance.ies.ugc.appcontext.d.s);
        String a4 = com.ss.android.ugc.aweme.language.d.a();
        l.b(a4, "");
        linkedHashMap.put("region", a4);
        linkedHashMap.put("appName", com.bytedance.ies.ugc.appcontext.d.b());
        linkedHashMap.put("appVersion", com.bytedance.ies.ugc.appcontext.d.f());
        linkedHashMap.put("updateVersionCode", String.valueOf(com.bytedance.ies.ugc.appcontext.d.d()));
        String locale = en.a().toString();
        l.b(locale, "");
        linkedHashMap.put("language", locale);
        linkedHashMap.put("appLanguage", SettingServiceImpl.v().h());
        String b2 = com.ss.android.ugc.aweme.i18n.language.a.b();
        l.b(b2, "");
        linkedHashMap.put("appLocale", b2);
        com.bytedance.ies.bullet.c.d dVar = (com.bytedance.ies.bullet.c.d) bVar2.c(com.bytedance.ies.bullet.c.d.class);
        if (dVar == null || (a3 = dVar.a(com.bytedance.ies.bullet.service.f.a.b.b.LYNX)) == null || (str = a3.d()) == null) {
            str = "";
        }
        linkedHashMap.put("lynxSdkVersion", str);
        linkedHashMap.put("aid", Integer.valueOf(com.bytedance.ies.ugc.appcontext.d.n));
        String serverDeviceId = AppLog.getServerDeviceId();
        l.b(serverDeviceId, "");
        linkedHashMap.put("deviceId", serverDeviceId);
        int b3 = n.b((double) i.b());
        Rect rect = new Rect();
        g gVar = (g) bVar2.c(g.class);
        if (!(gVar == null || (a2 = gVar.a()) == null)) {
            Window window = a2.getWindow();
            l.b(window, "");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i4 = n.b((double) rect.top) >= b3 ? n.b((double) rect.height()) : n.b((double) rect.height()) - b3;
        }
        linkedHashMap.put("statusBarHeight", Integer.valueOf(b3));
        linkedHashMap.put("safeAreaHeight", Integer.valueOf(i4));
        IBulletHostProxy b4 = BulletHostProxy.b();
        Uri e2 = bVar.e();
        if (e2 == null || (str2 = e2.toString()) == null) {
            str2 = "";
        }
        l.b(str2, "");
        JSONObject a5 = b4.a(str2);
        if (a5 != null) {
            linkedHashMap.put("abParams", JsonExtKt.toMap(a5));
        }
        return linkedHashMap;
    }
}
