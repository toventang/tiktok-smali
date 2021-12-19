package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.b.e;
import h.a.n;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f133533a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f133534b = n.c(new q(), new l(), new u(), new g(), new v(), new i());

    private c() {
    }

    static {
        Covode.recordClassIndex(87356);
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.c
    public final void a(int i2, int i3, e.a aVar) {
        for (b bVar : f133534b) {
            bVar.a(i2, i3, aVar);
        }
        if (aVar != null) {
            Integer.valueOf(aVar.f115348a);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean b(int i2, int i3, e eVar) {
        for (b bVar : f133534b) {
            if (bVar.b(i2, i3, eVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.b
    public final boolean a(int i2, int i3, e eVar) {
        for (b bVar : f133534b) {
            if (bVar.a(i2, i3, eVar)) {
                return true;
            }
        }
        return false;
    }
}
