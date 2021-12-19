package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    a f91236a;

    /* renamed from: b  reason: collision with root package name */
    a f91237b;

    /* renamed from: c  reason: collision with root package name */
    String f91238c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<Context> f91239d;

    static {
        Covode.recordClassIndex(57418);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        hVar.f35538i = false;
        this.f91238c = hVar.f35531b;
        this.f91236a.a(hVar.f35533d);
    }

    public c(WeakReference<Context> weakReference, a aVar) {
        this.f91237b = aVar;
        this.f91239d = weakReference;
        AnonymousClass1 r1 = new a(this.f91239d) {
            /* class com.ss.android.ugc.aweme.fe.method.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(57419);
            }

            @Override // com.ss.android.ugc.aweme.fe.method.m
            public final void a(final JSONArray jSONArray) {
                Activity b2 = com.ss.android.sdk.webview.d.b(c.this.f91239d);
                if (b2 != null) {
                    b2.runOnUiThread(new Runnable() {
                        /* class com.ss.android.ugc.aweme.fe.method.c.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(57420);
                        }

                        public final void run() {
                            c cVar = c.this;
                            JSONArray jSONArray = jSONArray;
                            cVar.f91236a.f91205c.a();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("code", 1);
                                jSONObject.put("msg", "uploadSuccess");
                                jSONObject.put("data", jSONArray);
                                cVar.f91237b.a(cVar.f91238c, jSONObject);
                            } catch (JSONException unused) {
                                cVar.f91237b.a(cVar.f91238c, (JSONObject) null);
                            }
                        }
                    });
                }
            }

            @Override // com.ss.android.ugc.aweme.fe.method.m
            public final void a(final int i2, final String str) {
                Activity b2 = com.ss.android.sdk.webview.d.b(c.this.f91239d);
                if (b2 != null) {
                    b2.runOnUiThread(new Runnable() {
                        /* class com.ss.android.ugc.aweme.fe.method.c.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(57421);
                        }

                        public final void run() {
                            c cVar = c.this;
                            int i2 = i2;
                            String str = str;
                            cVar.f91236a.f91205c.a();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("code", i2);
                                jSONObject.put("msg", str);
                                jSONObject.put("data", new JSONArray());
                                cVar.f91237b.a(cVar.f91238c, jSONObject);
                            } catch (JSONException unused) {
                                cVar.f91237b.a(cVar.f91238c, (JSONObject) null);
                            }
                        }
                    });
                }
            }
        };
        this.f91236a = r1;
        r1.f91208f = false;
    }
}
