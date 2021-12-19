package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.a.e;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.hh;
import h.f.b.l;
import org.json.JSONObject;

public final class SetStatusBarMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69154b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69155c = "setStatusBar";

    static {
        Covode.recordClassIndex(42647);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42648);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69155c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetStatusBarMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("style");
        boolean optBoolean = jSONObject.optBoolean("hidden", false);
        if (optString == null || optString.length() == 0 || ((!l.a((Object) optString, (Object) "dark")) && (!l.a((Object) optString, (Object) "light")))) {
            aVar.a(-1, "Style must be light or dark!");
            return;
        }
        Context context = (Context) this.f32005a.c(Context.class);
        if (context == null) {
            aVar.a(-2, "Missing activity context [1]");
            return;
        }
        Activity a2 = e.a(context);
        if (a2 == null) {
            aVar.a(-2, "Missing activity context [2]");
            return;
        }
        int hashCode = optString.hashCode();
        if (hashCode != 3075958) {
            if (hashCode == 102970646 && optString.equals("light")) {
                hh.a(a2, false);
            }
        } else if (optString.equals("dark")) {
            hh.a(a2, true);
        }
        if (optBoolean) {
            hh.a(a2);
        }
        aVar.a(new JSONObject());
    }
}
