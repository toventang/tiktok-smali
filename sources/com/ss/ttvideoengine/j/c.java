package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f152882a;

    /* renamed from: b  reason: collision with root package name */
    public String f152883b;

    /* renamed from: c  reason: collision with root package name */
    public String f152884c;

    /* renamed from: d  reason: collision with root package name */
    public int f152885d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f152886e;

    /* renamed from: f  reason: collision with root package name */
    public float f152887f;

    /* renamed from: g  reason: collision with root package name */
    public float f152888g;

    /* renamed from: h  reason: collision with root package name */
    public String f152889h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f152890a;

        /* renamed from: b  reason: collision with root package name */
        public String f152891b;

        /* renamed from: c  reason: collision with root package name */
        public String f152892c;

        /* renamed from: d  reason: collision with root package name */
        public int f152893d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f152894e;

        /* renamed from: f  reason: collision with root package name */
        public float f152895f;

        /* renamed from: g  reason: collision with root package name */
        public float f152896g;

        /* renamed from: h  reason: collision with root package name */
        public String f152897h;

        static {
            Covode.recordClassIndex(101658);
        }
    }

    static {
        Covode.recordClassIndex(101657);
    }

    public final JSONObject a() {
        try {
            if (TextUtils.isEmpty(this.f152883b)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("main_url", this.f152883b);
            jSONObject.put("check_info", this.f152884c);
            jSONObject.put("info_id", this.f152885d);
            jSONObject.put("bitrate", this.f152886e);
            jSONObject.put("loudness", (double) this.f152887f);
            jSONObject.put("peak", (double) this.f152888g);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
