package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.livesdk.chatroom.c.ao;
import com.bytedance.android.livesdk.gift.d.h;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f22784a;

    static {
        Covode.recordClassIndex(13426);
    }

    g(b bVar) {
        this.f22784a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f22784a;
        if ((obj instanceof ao) && bVar.f22767a != null && bVar.a() && bVar.f22768b != null) {
            h hVar = new h();
            ao aoVar = (ao) obj;
            hVar.f17852c = aoVar.f15102a;
            hVar.f17854e = aoVar.f15103b;
            hVar.f17851b = aoVar.f15104c == null ? "jsb" : aoVar.f15104c;
            bVar.f22768b.a(hVar);
        }
    }
}
