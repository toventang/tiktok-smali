package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.a.a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.ai;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.lang.reflect.Field;
import org.json.JSONObject;

public final class q extends e<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(8169);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.c
    public final ai getPermissionGroup() {
        return ai.PRIVATE;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(10814);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(10814);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        String optString = jSONObject2.optString("content", "");
        if (optString == null || optString.length() == 0) {
            finishWithFailure();
            return;
        }
        try {
            Object a2 = a(gVar.f35646a, "clipboard");
            if (a2 != null) {
                ClipData newPlainText = ClipData.newPlainText(optString, optString);
                l.b(newPlainText, "");
                a.C0567a.a((ClipboardManager) a2, newPlainText, PrivacyCert.Builder.Companion.with("bpea-593").usage("").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).tag("").build());
                finishWithSuccess();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        } catch (Exception unused) {
            finishWithFailure();
        }
    }
}
