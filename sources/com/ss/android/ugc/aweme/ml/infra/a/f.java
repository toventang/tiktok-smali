package com.ss.android.ugc.aweme.ml.infra.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.k;
import h.f.b.l;
import org.json.JSONObject;

public abstract class f {

    /* renamed from: d  reason: collision with root package name */
    public String f110616d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f110617e = "";

    /* renamed from: f  reason: collision with root package name */
    public k f110618f;

    /* renamed from: g  reason: collision with root package name */
    public final SmartSceneConfig f110619g;

    static {
        Covode.recordClassIndex(71013);
    }

    public abstract void a(g gVar, a aVar);

    public void a(boolean z, JSONObject jSONObject) {
        l.d(jSONObject, "");
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c();

    public boolean d() {
        SmartSceneConfig smartSceneConfig = this.f110619g;
        if (smartSceneConfig == null || smartSceneConfig.getDisable()) {
            return false;
        }
        return true;
    }

    public f(SmartSceneConfig smartSceneConfig) {
        String str;
        this.f110619g = smartSceneConfig;
        this.f110616d = (smartSceneConfig == null || (str = smartSceneConfig.getScene()) == null) ? "default" : str;
        this.f110617e = "ml#" + this.f110616d;
    }
}
