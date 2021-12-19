package com.ss.android.ugc.aweme.ml.infra;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig;
import com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictRealConfig;
import org.json.JSONObject;

public final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    public int f110664a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f110665b;

    /* renamed from: c  reason: collision with root package name */
    public long f110666c;

    /* renamed from: d  reason: collision with root package name */
    public int f110667d;

    /* renamed from: e  reason: collision with root package name */
    public int f110668e;

    /* renamed from: f  reason: collision with root package name */
    public String f110669f;

    /* renamed from: g  reason: collision with root package name */
    public OnePlaytimePredictConfig f110670g;

    static {
        Covode.recordClassIndex(71028);
    }

    public final String toString() {
        return "(scene='" + this.f110669f + "', isRunning=" + this.f110665b + ", runCount:" + this.f110668e + ", skipFeedCount=" + this.f110667d + ", skipTimes=" + this.f110664a + ", lastRunTime=" + this.f110666c + ", config:" + this.f110670g + ')';
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.c
    public final boolean a(JSONObject jSONObject) {
        OnePlaytimePredictRealConfig realConfig;
        if (jSONObject == null || (realConfig = this.f110670g.getRealConfig()) == null) {
            return false;
        }
        h.f.b.l.d(jSONObject, "");
        h.f.b.l.d(realConfig, "");
        if (g.f110623c.size() > 64) {
            g.f110623c.clear();
        }
        g.f110623c.addLast(new g(jSONObject, realConfig));
        return true;
    }

    public l(String str, OnePlaytimePredictConfig onePlaytimePredictConfig) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(onePlaytimePredictConfig, "");
        this.f110669f = str;
        this.f110670g = onePlaytimePredictConfig;
    }
}
