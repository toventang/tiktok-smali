package com.snapchat.kit.sdk.creative.c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final File f57296a;

    /* renamed from: b  reason: collision with root package name */
    public float f57297b;

    /* renamed from: c  reason: collision with root package name */
    public float f57298c;

    /* renamed from: d  reason: collision with root package name */
    public float f57299d;

    /* renamed from: e  reason: collision with root package name */
    public float f57300e;

    /* renamed from: f  reason: collision with root package name */
    public float f57301f;

    /* renamed from: g  reason: collision with root package name */
    public float f57302g;

    /* renamed from: h  reason: collision with root package name */
    public float f57303h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f57304i;

    static {
        Covode.recordClassIndex(35831);
    }

    public final JSONObject a(Uri uri, Context context) {
        float f2 = context.getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uri", uri);
            jSONObject.put("posX", (double) this.f57298c);
            jSONObject.put("posY", (double) this.f57299d);
            jSONObject.put("rotation", (double) this.f57297b);
            float f3 = this.f57302g;
            if (f3 != 0.0f) {
                jSONObject.put("widthDp", (double) f3);
                jSONObject.put("width", (double) (this.f57302g * f2));
            } else {
                jSONObject.put("width", (double) this.f57300e);
            }
            float f4 = this.f57303h;
            if (f4 != 0.0f) {
                jSONObject.put("heightDp", (double) f4);
                jSONObject.put("height", (double) (this.f57303h * f2));
            } else {
                jSONObject.put("height", (double) this.f57301f);
            }
            jSONObject.put("isAnimated", this.f57304i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
