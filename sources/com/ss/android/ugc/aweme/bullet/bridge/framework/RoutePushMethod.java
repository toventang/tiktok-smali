package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.as;
import com.bytedance.ies.bullet.ui.common.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.e;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ck.t;
import h.f.b.l;
import h.j.g;
import h.j.h;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class RoutePushMethod extends BaseBridgeMethod implements au {

    /* renamed from: c  reason: collision with root package name */
    public static final g f69141c = h.a(50000, 60000);

    /* renamed from: d  reason: collision with root package name */
    public static final a f69142d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, BaseBridgeMethod.a> f69143b = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final String f69144e = "routePush";

    /* renamed from: f  reason: collision with root package name */
    private int f69145f = f69141c.f158747a;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42641);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69144e;
    }

    static {
        Covode.recordClassIndex(42640);
    }

    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.ui.common.g f69146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f69147b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RoutePushMethod f69148c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f69149d;

        static {
            Covode.recordClassIndex(42642);
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        b(com.bytedance.ies.bullet.ui.common.g gVar, String str, RoutePushMethod routePushMethod, BaseBridgeMethod.a aVar) {
            this.f69146a = gVar;
            this.f69147b = str;
            this.f69148c = routePushMethod;
            this.f69149d = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public Void a(Activity activity, int i2, int i3, Intent intent) {
            Bundle a2;
            String string;
            l.d(activity, "");
            if (i3 == 50000) {
                BaseBridgeMethod.a remove = this.f69148c.f69143b.remove(Integer.valueOf(i2));
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
                BaseBridgeMethod.a remove2 = this.f69148c.f69143b.remove(Integer.valueOf(i2));
                if (remove2 != null) {
                    remove2.a(-1, "resultCode = ".concat(String.valueOf(i3)));
                }
            }
            this.f69146a.b(this);
            throw new as("An operation is not implemented");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoutePushMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        com.bytedance.ies.bullet.ui.common.g f2;
        Activity a2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("schema");
        if (optString == null || !(!TextUtils.isEmpty(optString)) || (f2 = f()) == null) {
            aVar.a(-1, "params not valid");
            return;
        }
        f2.a(new b(f2, optString, this, aVar));
        com.bytedance.ies.bullet.ui.common.g f3 = f();
        if (!(f3 == null || (a2 = f3.a()) == null)) {
            if (t.a(t.a(), a2, optString, this.f69145f)) {
                this.f69143b.put(Integer.valueOf(this.f69145f), aVar);
                int i2 = this.f69145f + 1;
                this.f69145f = i2;
                g gVar = f69141c;
                if (i2 > gVar.f158748b) {
                    this.f69145f = gVar.f158747a;
                    return;
                }
                return;
            }
        }
        aVar.a(-1, "router not supported");
    }
}
