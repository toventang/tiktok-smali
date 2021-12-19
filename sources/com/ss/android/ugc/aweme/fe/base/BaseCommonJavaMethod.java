package com.ss.android.ugc.aweme.fe.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.sdk.webview.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.crossplatform.a.d;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseCommonJavaMethod implements d, au {
    public WeakReference<Context> mContextRef;
    public com.bytedance.ies.web.a.a mJsBridge;
    protected WeakReference<c> mProviderFactoryRef;

    public interface a {
        static {
            Covode.recordClassIndex(57241);
        }

        void a(int i2, String str);

        void a(Object obj);

        void a(Object obj, int i2, String str);

        void a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(57239);
    }

    public abstract void handle(JSONObject jSONObject, a aVar);

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }

    public BaseCommonJavaMethod() {
    }

    private c c() {
        WeakReference<c> weakReference = this.mProviderFactoryRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final AbsActivityContainer a() {
        c c2 = c();
        if (c2 != null) {
            return (AbsActivityContainer) c2.a(AbsActivityContainer.class);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final k b() {
        c c2 = c();
        if (c2 != null) {
            return (k) c2.a(k.class);
        }
        return null;
    }

    public Context getActContext() {
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference == null) {
            return null;
        }
        Activity a2 = o.a(weakReference.get());
        if (a2 == null) {
            return this.mContextRef.get();
        }
        return a2;
    }

    public BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
        return this;
    }

    public BaseCommonJavaMethod(com.bytedance.ies.web.a.a aVar) {
        this.mJsBridge = aVar;
    }

    public BaseCommonJavaMethod attach(c cVar) {
        if (cVar != null) {
            this.mProviderFactoryRef = new WeakReference<>(cVar);
        }
        return this;
    }

    public Context getActContext(WeakReference<Context> weakReference) {
        if (weakReference == null) {
            return null;
        }
        Activity a2 = o.a(weakReference.get());
        if (a2 == null) {
            return weakReference.get();
        }
        return a2;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        try {
            d.a.f78490a.a();
            JSONObject jSONObject2 = hVar.f35533d;
            if (jSONObject2 != null) {
                jSONObject2.put("func", hVar.f35532c);
                jSONObject2.put("permissionGroup", hVar.f35537h);
            }
            final String str = hVar.f35531b;
            hVar.f35538i = false;
            final String str2 = hVar.f35536g;
            handle(jSONObject2, new a() {
                /* class com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(57240);
                }

                @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a
                public final void a(Object obj) {
                    if (BaseCommonJavaMethod.this.mJsBridge != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 1);
                            jSONObject.put("data", obj);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.mJsBridge.a(str2, str, jSONObject);
                        } else {
                            BaseCommonJavaMethod.this.mJsBridge.a(str, jSONObject);
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a
                public final void a(JSONObject jSONObject) {
                    if (BaseCommonJavaMethod.this.mJsBridge == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        BaseCommonJavaMethod.this.mJsBridge.a(str2, str, jSONObject);
                    } else {
                        BaseCommonJavaMethod.this.mJsBridge.a(str, jSONObject);
                    }
                }

                @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a
                public final void a(int i2, String str) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("code", i2);
                        jSONObject.put("msg", str);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        BaseCommonJavaMethod.this.mJsBridge.a(str2, str, jSONObject);
                    } else {
                        BaseCommonJavaMethod.this.mJsBridge.a(str, jSONObject);
                    }
                }

                @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a
                public final void a(Object obj, int i2, String str) {
                    if (BaseCommonJavaMethod.this.mJsBridge != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", i2);
                            jSONObject.put("msg", str);
                            jSONObject.put("data", obj);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            BaseCommonJavaMethod.this.mJsBridge.a(str2, str, jSONObject);
                        } else {
                            BaseCommonJavaMethod.this.mJsBridge.a(str, jSONObject);
                        }
                    }
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void sendEvent(String str, JSONObject jSONObject, int i2) {
        com.bytedance.ies.web.a.a aVar;
        if ((i2 == 1 || i2 == 3) && (aVar = this.mJsBridge) != null) {
            aVar.b(str, jSONObject);
        }
    }
}
