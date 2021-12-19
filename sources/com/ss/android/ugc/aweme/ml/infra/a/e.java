package com.ss.android.ugc.aweme.ml.infra.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.l;
import com.ss.android.ml.m;
import com.ss.android.ml.o;
import com.ss.android.ml.p;
import com.ss.android.ugc.aweme.ml.a.a;
import com.ss.android.ugc.aweme.ml.ab.f;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.Map;
import org.json.JSONObject;

public abstract class e extends f {

    /* renamed from: a  reason: collision with root package name */
    public m f110613a;

    /* renamed from: b  reason: collision with root package name */
    public long f110614b;

    /* renamed from: c  reason: collision with root package name */
    public int f110615c;

    static {
        Covode.recordClassIndex(71012);
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.a.f
    public final void c() {
        m mVar = this.f110613a;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.a.f
    public final boolean b() {
        m mVar = this.f110613a;
        if (mVar != null) {
            return mVar.c();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.a.f
    public final boolean a() {
        boolean z;
        boolean z2;
        l lVar;
        m mVar = this.f110613a;
        if (mVar != null) {
            z = mVar.c();
        } else {
            z = false;
        }
        m mVar2 = this.f110613a;
        if (mVar2 == null || (lVar = mVar2.f59875b) == null) {
            z2 = false;
        } else {
            z2 = lVar.a();
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.a.f
    public final boolean d() {
        m mVar;
        if (!super.d() || (mVar = this.f110613a) == null || !mVar.c()) {
            return false;
        }
        return true;
    }

    public e(SmartSceneConfig smartSceneConfig) {
        super(smartSceneConfig);
        if (smartSceneConfig != null && !smartSceneConfig.getDisable()) {
            m mVar = new m(new b(smartSceneConfig));
            this.f110613a = mVar;
            mVar.f59880g = this.f110617e;
            if (mVar.f59875b != null) {
                mVar.f59875b.a(mVar.f59880g);
            }
            o a2 = p.a(this.f110616d);
            if (a2 != null) {
                a2.f59888a = f.a(this.f110616d);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.infra.a.f
    public final void a(boolean z, JSONObject jSONObject) {
        h.f.b.l.d(jSONObject, "");
        if (!z) {
            jSONObject.put("sdk_duration", this.f110614b);
            jSONObject.put("sdk_success", this.f110615c);
            o a2 = p.a(this.f110616d);
            if (a2 != null) {
                o.a aVar = a2.f59899l;
                if (aVar != null && aVar.a() >= 0.0f) {
                    jSONObject.put("pre_cost", Float.valueOf(aVar.a()));
                }
                o.a aVar2 = a2.f59900m;
                if (aVar2 != null && aVar2.a() >= 0.0f) {
                    jSONObject.put("infer_cost", Float.valueOf(aVar2.a()));
                }
                o.a aVar3 = a2.n;
                if (aVar3 != null && aVar3.a() >= 0.0f) {
                    jSONObject.put("post_cost", Float.valueOf(aVar3.a()));
                }
                a2.a();
                return;
            }
            return;
        }
        o a3 = p.a(this.f110616d);
        if (a3 != null) {
            o.a aVar4 = a3.f59893f;
            if (aVar4 != null && aVar4.a() >= 0.0f) {
                jSONObject.put("download_cost", Float.valueOf(aVar4.a()));
                aVar4.b();
            }
            o.a aVar5 = a3.f59894g;
            if (aVar5 != null && aVar5.a() >= 0.0f) {
                jSONObject.put("model_cost", Float.valueOf(aVar5.a()));
                aVar5.b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(m mVar, g gVar, a aVar) {
        Map<String, Object> map;
        this.f110614b = -1;
        this.f110615c = -100;
        if (mVar == null || !d()) {
            if (a.f110297a) {
                d();
            }
            if (aVar != null) {
                aVar.a(false, -1, null);
            }
            return false;
        } else if (gVar == null || (map = gVar.f110620a) == null || map.isEmpty()) {
            if (aVar != null) {
                aVar.a(false, -3, null);
            }
            return false;
        } else if (!mVar.b()) {
            this.f110615c = -2;
            if (aVar != null) {
                aVar.a(false, -2, null);
            }
            return false;
        } else if (mVar.f59875b != null) {
            return true;
        } else {
            this.f110615c = -4;
            if (aVar != null) {
                aVar.a(false, -4, null);
            }
            return false;
        }
    }
}
