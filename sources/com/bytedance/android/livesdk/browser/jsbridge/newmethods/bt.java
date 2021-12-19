package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

final /* synthetic */ class bt implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bs f14645a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f14646b;

    /* renamed from: c  reason: collision with root package name */
    private final long f14647c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14648d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14649e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f14650f;

    static {
        Covode.recordClassIndex(8133);
    }

    bt(bs bsVar, JSONObject jSONObject, long j2, String str, String str2, Context context) {
        this.f14645a = bsVar;
        this.f14646b = jSONObject;
        this.f14647c = j2;
        this.f14648d = str;
        this.f14649e = str2;
        this.f14650f = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3;
        bs bsVar = this.f14645a;
        JSONObject jSONObject = this.f14646b;
        long j2 = this.f14647c;
        String str = this.f14648d;
        String str2 = this.f14649e;
        Context context = this.f14650f;
        try {
            i3 = jSONObject.getInt("follow_status");
        } catch (Throwable unused) {
            i3 = 0;
        }
        a aVar = new a();
        aVar.f23023e = i3;
        aVar.f23024f = a.EnumC0505a.FromWeb;
        aVar.f23019a = j2;
        aVar.f23022d = str;
        aVar.f23021c = str2;
        bsVar.a(aVar, context);
    }
}
