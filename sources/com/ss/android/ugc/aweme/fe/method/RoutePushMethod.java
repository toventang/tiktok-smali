package com.ss.android.ugc.aweme.fe.method;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.e;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.j.g;
import h.j.h;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class RoutePushMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final g f91153c = h.a(50000, 60000);

    /* renamed from: d  reason: collision with root package name */
    public static final a f91154d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, BaseCommonJavaMethod.a> f91155a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f91156b;

    /* renamed from: e  reason: collision with root package name */
    private int f91157e;

    private RoutePushMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57366);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ RoutePushMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    static {
        Covode.recordClassIndex(57365);
    }

    public static final class b implements com.ss.android.ugc.aweme.base.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbsActivityContainer f91158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f91159b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RoutePushMethod f91160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91161d;

        static {
            Covode.recordClassIndex(57367);
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.ss.android.ugc.aweme.base.a.b
        public final boolean a(int i2, int i3, Intent intent) {
            Bundle a2;
            String string;
            if (i3 == 50000) {
                BaseCommonJavaMethod.a remove = this.f91160c.f91155a.remove(Integer.valueOf(i2));
                if (remove != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (!(intent == null || (a2 = a(intent)) == null || (string = a2.getString("serialized_data")) == null)) {
                        try {
                            JSONObject optJSONObject = new JSONObject(string).optJSONObject("data");
                            if (optJSONObject != null) {
                                e.a(jSONObject, optJSONObject);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    remove.a(jSONObject, 1, "push callback succeed");
                }
            } else {
                BaseCommonJavaMethod.a remove2 = this.f91160c.f91155a.remove(Integer.valueOf(i2));
                if (remove2 != null) {
                    remove2.a(-1, "resultCode = ".concat(String.valueOf(i3)));
                }
            }
            this.f91158a.b(this);
            return false;
        }

        b(AbsActivityContainer absActivityContainer, String str, RoutePushMethod routePushMethod, BaseCommonJavaMethod.a aVar) {
            this.f91158a = absActivityContainer;
            this.f91159b = str;
            this.f91160c = routePushMethod;
            this.f91161d = aVar;
        }
    }

    public RoutePushMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91156b = aVar;
        this.f91155a = new LinkedHashMap();
        this.f91157e = f91153c.f158747a;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String optString;
        AbsActivityContainer a2;
        if (jSONObject != null && (optString = jSONObject.optString("schema")) != null && (!TextUtils.isEmpty(optString)) && (a2 = a()) != null) {
            a2.a(new b(a2, optString, this, aVar));
            if (a2.a(optString, this.f91157e)) {
                if (aVar != null) {
                    this.f91155a.put(Integer.valueOf(this.f91157e), aVar);
                }
                int i2 = this.f91157e + 1;
                this.f91157e = i2;
                g gVar = f91153c;
                if (i2 > gVar.f158748b) {
                    this.f91157e = gVar.f158747a;
                }
            } else if (aVar != null) {
                aVar.a(-1, "router not supported");
            }
        } else if (aVar != null) {
            aVar.a(-1, "params not valid");
        }
    }
}
