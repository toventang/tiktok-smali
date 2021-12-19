package com.bytedance.ies.xbridge.platform.lynx.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import h.f.b.l;

public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final com.lynx.react.bridge.a f36407a;

    static {
        Covode.recordClassIndex(21813);
    }

    @Override // com.bytedance.ies.xbridge.k
    public final boolean b() {
        return this.f36407a.b();
    }

    @Override // com.bytedance.ies.xbridge.k
    public final double c() {
        return this.f36407a.c();
    }

    @Override // com.bytedance.ies.xbridge.k
    public final int d() {
        return this.f36407a.d();
    }

    @Override // com.bytedance.ies.xbridge.k
    public final String e() {
        String e2 = this.f36407a.e();
        l.a((Object) e2, "");
        return e2;
    }

    @Override // com.bytedance.ies.xbridge.k
    public final m f() {
        ReadableArray f2 = this.f36407a.f();
        if (f2 == null) {
            return null;
        }
        return new e(f2);
    }

    @Override // com.bytedance.ies.xbridge.k
    public final n g() {
        ReadableMap g2 = this.f36407a.g();
        if (g2 == null) {
            return null;
        }
        return new g(g2);
    }

    @Override // com.bytedance.ies.xbridge.k
    public final o a() {
        ReadableType h2 = this.f36407a.h();
        if (h2 != null) {
            switch (b.f36408a[h2.ordinal()]) {
                case 1:
                    return o.Null;
                case 2:
                    return o.Array;
                case 3:
                    return o.Boolean;
                case 4:
                    return o.Map;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    return o.Number;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    return o.String;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    return o.Int;
            }
        }
        return o.Null;
    }

    public a(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        this.f36407a = aVar;
    }
}
