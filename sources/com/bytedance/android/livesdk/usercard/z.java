package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.usercard.y;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements f {

    /* renamed from: a  reason: collision with root package name */
    private final y f21899a;

    static {
        Covode.recordClassIndex(12894);
    }

    z(y yVar) {
        this.f21899a = yVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        y yVar = this.f21899a;
        User user = (User) obj;
        if (yVar.y != null) {
            ((y.b) yVar.y).a(user);
        }
    }
}
