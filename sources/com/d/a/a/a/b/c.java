package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.e.b;
import com.d.a.a.a.e.d;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final i f46332a;

    /* renamed from: b  reason: collision with root package name */
    public final i f46333b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f46334c;

    /* renamed from: d  reason: collision with root package name */
    private final f f46335d;

    /* renamed from: e  reason: collision with root package name */
    private final h f46336e;

    static {
        Covode.recordClassIndex(28300);
    }

    private c(f fVar, h hVar, i iVar, i iVar2) {
        this.f46335d = fVar;
        this.f46336e = hVar;
        this.f46332a = iVar;
        if (iVar2 == null) {
            this.f46333b = i.NONE;
        } else {
            this.f46333b = iVar2;
        }
        this.f46334c = false;
    }

    public final JSONObject a() {
        Object obj;
        String str;
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "impressionOwner", this.f46332a);
        if (this.f46335d == null || this.f46336e == null) {
            obj = this.f46333b;
            str = "videoEventsOwner";
        } else {
            b.a(jSONObject, "mediaEventsOwner", this.f46333b);
            b.a(jSONObject, "creativeType", this.f46335d);
            obj = this.f46336e;
            str = "impressionType";
        }
        b.a(jSONObject, str, obj);
        b.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f46334c));
        return jSONObject;
    }

    public static c a(f fVar, h hVar, i iVar, i iVar2) {
        d.a(fVar, "CreativeType is null");
        d.a(hVar, "ImpressionType is null");
        d.a(iVar, "Impression owner is null");
        if (iVar == i.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (fVar == f.DEFINED_BY_JAVASCRIPT && iVar == i.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (hVar != h.DEFINED_BY_JAVASCRIPT || iVar != i.NATIVE) {
            return new c(fVar, hVar, iVar, iVar2);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }
}
