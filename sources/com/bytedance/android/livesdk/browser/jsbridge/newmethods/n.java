package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.d;
import com.bytedance.android.live.core.widget.a;
import com.bytedance.android.livesdk.browser.d;
import com.bytedance.android.livesdk.browser.e;
import com.bytedance.android.livesdk.browser.g;
import com.bytedance.android.livesdk.container.e;
import com.bytedance.android.livesdk.container.k.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n extends f<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    private d f14698a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f14699b;

    /* renamed from: c  reason: collision with root package name */
    private c f14700c;

    static {
        Covode.recordClassIndex(8162);
    }

    public n(Activity activity) {
        this.f14699b = activity;
    }

    public n(d dVar) {
        this.f14698a = dVar;
    }

    public n(c cVar) {
        this.f14700c = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ Object invoke(JSONObject jSONObject, g gVar) {
        Activity activity;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("container_list");
        String optString = jSONObject2.optString("animation_type");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            c cVar = this.f14700c;
            if (cVar != null) {
                cVar.b();
            } else {
                d dVar = this.f14698a;
                if (dVar != null) {
                    dVar.dismissAllowingStateLoss();
                } else {
                    Activity activity2 = this.f14699b;
                    if (activity2 != null) {
                        activity2.finish();
                    } else {
                        terminate();
                    }
                }
            }
        } else {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString2 = optJSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString2)) {
                    View a2 = g.b.f14420a.a(optString2);
                    if (a2 != null) {
                        l.d(a2, "");
                        ((c) a2).b();
                    }
                    a b2 = d.b.f14346a.b(optString2);
                    if (b2 != null) {
                        if (b2 instanceof com.bytedance.android.livesdk.browser.d.a) {
                            com.bytedance.android.livesdk.browser.d.a aVar = (com.bytedance.android.livesdk.browser.d.a) b2;
                            if (!TextUtils.isEmpty(optString)) {
                                aVar.w = optString;
                            }
                        }
                        if (b2 instanceof e) {
                            ((e) b2).a(optString);
                        }
                        View view = b2.getView();
                        if (view != null) {
                            b2.getClass();
                            view.post(new o(b2));
                        } else {
                            b2.dismissAllowingStateLoss();
                        }
                    }
                    com.bytedance.android.livesdk.browser.e eVar = e.b.f14410a;
                    l.d(optString2, "");
                    WeakReference<Activity> weakReference = eVar.f14389a.get(optString2);
                    if (!(weakReference == null || weakReference.get() == null)) {
                        com.bytedance.android.livesdk.browser.e eVar2 = e.b.f14410a;
                        l.d(optString2, "");
                        WeakReference<Activity> weakReference2 = eVar2.f14389a.get(optString2);
                        if (!(weakReference2 == null || (activity = weakReference2.get()) == null)) {
                            activity.finish();
                        }
                    }
                }
            }
        }
        return null;
    }
}
