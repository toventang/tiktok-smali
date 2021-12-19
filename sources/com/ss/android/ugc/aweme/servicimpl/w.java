package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.aweme.ftc.i.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.gamora.PageFactory;
import h.f.b.l;

public final class w implements PageFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final w f121945a = new w();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ PageFactory f121946b;

    @Override // com.ss.android.ugc.gamora.PageFactory
    public final void a(b bVar) {
        l.d(bVar, "");
        this.f121946b.a(bVar);
    }

    static {
        Covode.recordClassIndex(79945);
    }

    private w() {
        PageFactory aVar;
        if (g.a().A().a()) {
            aVar = new a();
        } else {
            aVar = new com.ss.android.ugc.aweme.record.a();
        }
        this.f121946b = aVar;
    }
}
