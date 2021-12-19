package com.bytedance.lynx.hybrid.resource.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class d extends j {
    public List<String> u;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public int z;

    static {
        Covode.recordClassIndex(25157);
    }

    private /* synthetic */ d() {
        this("");
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.j
    public final String toString() {
        return super.toString() + "\n [fallbackDomains=" + this.u + ",shuffle = " + this.v + ",cdnNoCache=" + this.w + "，maxAttempt=" + this.x + "，isRemote=" + this.y + ",useInteraction = " + this.z + ']';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super(str);
        l.c(str, "");
        this.u = new ArrayList();
    }

    @Override // com.bytedance.lynx.hybrid.resource.config.j
    public final j a(j jVar) {
        l.c(jVar, "");
        if (jVar instanceof d) {
            d dVar = (d) jVar;
            this.u = dVar.u;
            this.v = dVar.v;
            this.w = dVar.w;
            this.x = dVar.x;
            this.z = dVar.z;
        }
        return super.a(jVar);
    }
}
