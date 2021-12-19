package com.bytedance.ies.bullet.kit.rn;

import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.e.i;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final i f32379a;

    static {
        Covode.recordClassIndex(19047);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f32379a, ((b) obj).f32379a);
        }
        return true;
    }

    public final int hashCode() {
        i iVar = this.f32379a;
        if (iVar != null) {
            return iVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FrescoConfig(imagePipelineConfig=" + this.f32379a + ")";
    }
}
