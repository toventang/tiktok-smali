package com.bytedance.android.livesdk.dialogv2.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;

public final class b extends a<u> {
    static {
        Covode.recordClassIndex(9423);
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final String a() {
        return ((u) this.f17864b).f19758a;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final String b() {
        return ((u) this.f17864b).f19760c;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final ImageModel c() {
        return ((u) this.f17864b).f19759b;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final long d() {
        return ((u) this.f17864b).f19761d;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.a
    public final int e() {
        return ((u) this.f17864b).f19763f;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final ImageModel f() {
        return ((u) this.f17864b).f19769l;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final boolean g() {
        if (((u) this.f17864b).f19762e == 1 || ((u) this.f17864b).f19762e == 5 || ((u) this.f17864b).f19762e == 10) {
            return false;
        }
        return true;
    }

    public b(u uVar) {
        super(9, uVar);
    }
}
