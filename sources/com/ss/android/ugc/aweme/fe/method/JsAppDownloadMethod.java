package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.app.e.b.b;
import com.ss.android.ugc.aweme.app.e.b.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class JsAppDownloadMethod extends BaseCommonJavaMethod implements c, au {

    /* renamed from: a  reason: collision with root package name */
    private b f91077a;

    static {
        Covode.recordClassIndex(57293);
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        if (this.f91077a != null && this.mContextRef != null && this.mContextRef.get() != null) {
            this.f91077a = null;
        }
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        if (this.f91077a != null && this.mContextRef != null && this.mContextRef.get() != null) {
            this.mContextRef.get();
        }
    }

    public JsAppDownloadMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        return super.attach(weakReference);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (this.mContextRef != null && this.mContextRef.get() != null) {
            if (this.f91077a == null) {
                this.mContextRef.get();
                this.f91077a = new b(this);
            }
            String optString = jSONObject.optString("func");
            if (TextUtils.equals("subscribe_app_ad", optString)) {
                if (this.mContextRef.get() != null) {
                    new com.ss.android.ugc.aweme.app.e.b.a().a(jSONObject.optJSONObject("data"));
                }
            } else if (TextUtils.equals("unsubscribe_app_ad", optString)) {
                if (this.f91077a != null) {
                    new com.ss.android.ugc.aweme.app.e.b.a().a(jSONObject.optJSONObject("data"));
                }
            } else if (TextUtils.equals("download_app_ad", optString)) {
                if (this.f91077a != null && this.mContextRef.get() != null) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    new com.ss.android.ugc.aweme.app.e.b.a().a(optJSONObject);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("extParam");
                    if (optJSONObject2 != null) {
                        optJSONObject2.optString("refer");
                        optJSONObject2.optJSONObject("ad_extra_data");
                    }
                    new AdCardClose(-1).post();
                }
            } else if (TextUtils.equals("cancel_download_app_ad", optString)) {
                b bVar = this.f91077a;
                if (bVar != null && bVar.f66714b != null) {
                    new com.ss.android.ugc.aweme.app.e.b.a().a(jSONObject.optJSONObject("data"));
                }
            } else if (TextUtils.equals("get_download_pause_task", optString)) {
                if (this.f91077a == null) {
                }
            } else if (TextUtils.equals("get_downloading_task", optString)) {
                if (this.f91077a == null) {
                }
            } else if (TextUtils.equals("get_install_status", optString) && this.f91077a != null && jSONObject.length() != 0) {
                jSONObject.optJSONArray("task_list");
            }
        }
    }
}
