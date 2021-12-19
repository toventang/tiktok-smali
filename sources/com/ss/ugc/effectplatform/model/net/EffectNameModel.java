package com.ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class EffectNameModel {
    private String name;

    static {
        Covode.recordClassIndex(102495);
    }

    public EffectNameModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ EffectNameModel copy$default(EffectNameModel effectNameModel, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = effectNameModel.name;
        }
        return effectNameModel.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final EffectNameModel copy(String str) {
        return new EffectNameModel(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EffectNameModel) && l.a(this.name, ((EffectNameModel) obj).name);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.name;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EffectNameModel(name=" + this.name + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public EffectNameModel(String str) {
        this.name = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectNameModel(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str);
    }
}
