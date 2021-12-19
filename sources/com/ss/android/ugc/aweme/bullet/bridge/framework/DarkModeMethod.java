package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.hg;
import h.f.b.l;
import org.json.JSONObject;

public final class DarkModeMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69081b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69082c = "darkMode";

    static {
        Covode.recordClassIndex(42598);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42599);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69082c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkModeMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("enable");
        try {
            Context e2 = e();
            Window window = null;
            if (!(e2 instanceof Activity)) {
                e2 = null;
            }
            Activity activity = (Activity) e2;
            if (activity != null) {
                window = activity.getWindow();
            }
            hg.a(activity, window, TextUtils.equals(optString, "true"));
            aVar.a(new o());
        } catch (Exception unused) {
            aVar.a(0, "");
        }
    }
}
