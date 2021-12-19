package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;

public final class PreloadEffectModel {
    private final String effect_id;
    private final String md5;

    static {
        Covode.recordClassIndex(102509);
    }

    public final String getEffect_id() {
        return this.effect_id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final int hashCode() {
        return (this.effect_id.hashCode() * 31) + this.md5.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!l.a(ab.a(getClass()), ab.a(obj.getClass())))) {
            return false;
        }
        PreloadEffectModel preloadEffectModel = (PreloadEffectModel) obj;
        if (!(!l.a((Object) this.effect_id, (Object) preloadEffectModel.effect_id)) && !(!l.a((Object) this.md5, (Object) preloadEffectModel.md5))) {
            return true;
        }
        return false;
    }

    public PreloadEffectModel(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.effect_id = str;
        this.md5 = str2;
    }
}
