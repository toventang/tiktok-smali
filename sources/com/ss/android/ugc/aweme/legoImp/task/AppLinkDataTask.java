package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.applinks.a;
import com.facebook.j;
import com.facebook.m;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.ActivityRouterServiceImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.money.growth.e;
import com.ss.android.ugc.aweme.net.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class AppLinkDataTask implements w {
    static {
        Covode.recordClassIndex(68921);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    private void b(final Context context) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        a.a(context, new a.AbstractC1163a() {
            /* class com.ss.android.ugc.aweme.legoImp.task.AppLinkDataTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(68922);
            }

            @Override // com.facebook.applinks.a.AbstractC1163a
            public final void a(a aVar) {
                Bundle bundle;
                String uri;
                if (aVar != null && (bundle = aVar.f46918d) != null) {
                    String string = bundle.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                    if (!TextUtils.isEmpty(string) && !e.f110853g.a(string)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("channel", "facebook");
                            jSONObject.put("url", string);
                            if (aVar.f46916b == null) {
                                uri = "";
                            } else {
                                uri = aVar.f46916b.toString();
                            }
                            jSONObject.put("target", uri);
                            jSONObject.put("total_time", SystemClock.uptimeMillis() - a.b.f109011a.f109007h);
                            jSONObject.put("fetch_time", SystemClock.uptimeMillis() - uptimeMillis);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        b.a("deep_link", jSONObject);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new d("facebook_code_start_url", string));
                        new com.ss.android.ugc.aweme.net.b(com.ss.android.ugc.trill.b.a.f150472a, i.POST, arrayList, String.class).a(com.bytedance.ies.ugc.appcontext.d.a());
                        Intent intent = new Intent(context, ActivityRouterServiceImpl.b().a());
                        intent.setAction("android.intent.action.VIEW");
                        intent.setData(aVar.f46916b);
                        intent.putExtra("dl_from", "facebook");
                        intent.addFlags(268435456);
                        intent.putExtra("from_notification", false);
                        intent.putExtra("from_task", true);
                        Context context = context;
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                        context.startActivity(intent);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        if (SettingsManager.a().a("fb_ddl_switch", true)) {
            try {
                b(context);
            } catch (j | NoSuchMethodError | NullPointerException e2) {
                com.bytedance.c.a.a.a.b.a(e2, "fetchDeferredAppLinkData first failed");
                try {
                    m.f48915a = "597615686992125";
                    b(context);
                } catch (j | NoSuchMethodError | NullPointerException e3) {
                    com.bytedance.c.a.a.a.b.a(e3, "fetchDeferredAppLinkData retry failed");
                }
            }
        }
    }
}
