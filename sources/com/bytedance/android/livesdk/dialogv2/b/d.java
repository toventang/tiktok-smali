package com.bytedance.android.livesdk.dialogv2.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.covode.number.Covode;

public final class d extends a<Prop> {
    static {
        Covode.recordClassIndex(9425);
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final String a() {
        return ((Prop) this.f17864b).name;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final String b() {
        return ((Prop) this.f17864b).description;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final ImageModel c() {
        return ((Prop) this.f17864b).icon;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final long d() {
        return ((Prop) this.f17864b).id;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.a
    public final int e() {
        return ((Prop) this.f17864b).diamond;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final ImageModel f() {
        return ((Prop) this.f17864b).labelIcon;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final boolean g() {
        if (((Prop) this.f17864b).gift == null || (((Prop) this.f17864b).gift.f19762e != 1 && ((Prop) this.f17864b).gift.f19762e != 5)) {
            return true;
        }
        return false;
    }

    public d(Prop prop) {
        super(2, prop);
    }
}
