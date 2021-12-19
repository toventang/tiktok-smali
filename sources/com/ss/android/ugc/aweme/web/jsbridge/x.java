package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class x implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f145053a;

    /* renamed from: b  reason: collision with root package name */
    private a f145054b;

    static {
        Covode.recordClassIndex(94846);
    }

    public x(WeakReference<Context> weakReference, a aVar) {
        this.f145053a = weakReference;
        this.f145054b = aVar;
    }

    public final void a(h hVar, boolean z) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        try {
            jSONObject.put("code", i2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.f145054b.a(hVar.f35531b, jSONObject);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(final h hVar, JSONObject jSONObject) {
        Context a2;
        String str;
        WeakReference<Context> weakReference = this.f145053a;
        if (weakReference != null && weakReference.get() != null && (a2 = com.ss.android.sdk.webview.d.a(this.f145053a.get())) != null) {
            hVar.f35538i = false;
            String optString = hVar.f35533d.optString("content");
            String optString2 = hVar.f35533d.optString("title");
            String optString3 = hVar.f35533d.optString("confirm_text");
            String optString4 = hVar.f35533d.optString("cancel_text");
            final boolean optBoolean = hVar.f35533d.optBoolean("swap");
            a.C0731a aVar = new a.C0731a(a2);
            aVar.f33401a = optString2;
            aVar.f33402b = optString;
            if (optBoolean) {
                str = optString4;
            } else {
                str = optString3;
            }
            a.C0731a a3 = aVar.a(str, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.aweme.web.jsbridge.x.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(94848);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    x.this.a(hVar, !optBoolean);
                }
            }, false);
            if (!optBoolean) {
                optString3 = optString4;
            }
            a3.b(optString3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.aweme.web.jsbridge.x.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(94847);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    x.this.a(hVar, optBoolean);
                }
            }, false);
            aVar.a().b().setCancelable(false);
        }
    }
}
