package com.ss.ugc.effectplatform.algorithm;

import com.bef.effectsdk.RequirementResourceMapper;
import com.bytedance.covode.number.Covode;
import d.a.e.b;
import h.q;
import h.r;
import h.z;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f153471a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(102332);
    }

    public static final String[] a(String[] strArr) {
        try {
            return RequirementResourceMapper.peekResourcesNeededByRequirements(strArr);
        } catch (UnsatisfiedLinkError unused) {
            b.a("RequirementResourceMapper", "not load effect so", null);
            b.f153449a.loadLibrary("effect");
            q.m223constructorimpl(z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
        return RequirementResourceMapper.peekResourcesNeededByRequirements(strArr);
    }
}
