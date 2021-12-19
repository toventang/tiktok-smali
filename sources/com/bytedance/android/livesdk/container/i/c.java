package com.bytedance.android.livesdk.container.i;

import android.view.View;
import com.bytedance.android.monitor.lynx.b;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import org.json.JSONObject;

public final class c extends a<LynxView> {

    /* renamed from: b  reason: collision with root package name */
    public static final c f16799b = new c();

    private c() {
        super("lynx");
    }

    static {
        Covode.recordClassIndex(9322);
    }

    @Override // com.bytedance.android.livesdk.container.i.b
    public final /* synthetic */ void a(View view, String str, JSONObject jSONObject) {
        b bVar = b.f23580f;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("virtual_aid", "99999");
        bVar.a((LynxView) view, str, null, jSONObject, null, null, jSONObject2, false);
    }
}
