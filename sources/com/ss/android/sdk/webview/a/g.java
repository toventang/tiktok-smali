package com.ss.android.sdk.webview.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.activity.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONObject;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f60177a;

    static {
        Covode.recordClassIndex(37170);
    }

    public g(WeakReference<Context> weakReference) {
        this.f60177a = weakReference;
    }

    protected static Activity a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public void a(JSONObject jSONObject) {
        Activity activity;
        try {
            WeakReference<Context> weakReference = this.f60177a;
            Context context = null;
            if (weakReference != null) {
                context = weakReference.get();
            }
            if ((((context instanceof Activity) && (activity = (Activity) context) != null) || (activity = a(context)) != null) && a.a(activity, true)) {
                String optString = jSONObject.optString(StringSet.type);
                if (!m.a(optString) && optString.indexOf(58) < 0) {
                    com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(com.ss.android.sdk.webview.di.a.a().f60182a.getSSLocalScheme() + "://" + optString);
                    a(jSONObject.optJSONObject("args"), gVar);
                    com.ss.android.sdk.webview.di.a.a().f60182a.startAdsAppActivity(activity, gVar.a());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.ies.web.a.d
    public void call(h hVar, JSONObject jSONObject) {
        a(hVar.f35533d);
        jSONObject.put("code", 1);
    }

    private void a(JSONObject jSONObject, com.ss.android.common.util.g gVar) {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    gVar.a(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    gVar.a(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    gVar.a(next, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    gVar.a(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    gVar.a(next, obj.toString());
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj, gVar);
                }
            }
        }
    }
}
