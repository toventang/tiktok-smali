package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.components.sticker.a;
import com.ss.android.ugc.aweme.tools.e.c;

final /* synthetic */ class ab implements c {

    /* renamed from: a  reason: collision with root package name */
    private final i f98017a;

    static {
        Covode.recordClassIndex(62305);
    }

    ab(i iVar) {
        this.f98017a = iVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.e.c
    public final void a(Object obj) {
        i iVar = this.f98017a;
        a aVar = (a) obj;
        if ((!iVar.a() && !iVar.b()) || iVar.f98069d.f98004k != i.O) {
            return;
        }
        if (iVar.b()) {
            iVar.a(aVar, 1);
        } else {
            iVar.a(aVar, 0);
        }
    }
}
