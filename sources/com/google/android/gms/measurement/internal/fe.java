package com.google.android.gms.measurement.internal;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class fe implements hk {

    /* renamed from: a  reason: collision with root package name */
    private final ff f51594a;

    static {
        Covode.recordClassIndex(32226);
    }

    fe(ff ffVar) {
        this.f51594a = ffVar;
    }

    @Override // com.google.android.gms.measurement.internal.hk
    public final void a(int i2, Throwable th, byte[] bArr) {
        List<ResolveInfo> queryIntentActivities;
        ff ffVar = this.f51594a;
        if ((i2 == 200 || i2 == 204 || i2 == 304) && th == null) {
            ffVar.b().t.a(true);
            if (bArr.length == 0) {
                ffVar.q().f51475j.a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    ffVar.q().f51475j.a("Deferred Deep Link is empty.");
                    return;
                }
                jz e2 = ffVar.e();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = e2.m().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    ffVar.q().f51471f.a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                ffVar.f51603h.a("auto", "_cmp", bundle);
                jz e3 = ffVar.e();
                if (!TextUtils.isEmpty(optString) && e3.a(optString, optDouble)) {
                    e3.m().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                }
            } catch (JSONException e4) {
                ffVar.q().f51468c.a("Failed to parse the Deferred Deep Link response. exception", e4);
            }
        } else {
            ffVar.q().f51471f.a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
    }
}
