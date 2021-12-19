package com.bytedance.android.livesdk.dialogv2.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e extends b<u> {
    static {
        Covode.recordClassIndex(9426);
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final String a() {
        T t = this.f17864b;
        l.b(t, "");
        String str = ((u) t).f19758a;
        l.b(str, "");
        return str;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final String b() {
        T t = this.f17864b;
        l.b(t, "");
        String str = ((u) t).f19760c;
        if (str == null) {
            return "red envelope";
        }
        return str;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final ImageModel c() {
        T t = this.f17864b;
        l.b(t, "");
        ImageModel imageModel = ((u) t).f19759b;
        l.b(imageModel, "");
        return imageModel;
    }

    @Override // com.bytedance.android.livesdk.gift.model.a.b
    public final long d() {
        T t = this.f17864b;
        l.b(t, "");
        return ((u) t).f19761d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(u uVar) {
        super(10, uVar);
        l.d(uVar, "");
    }
}
