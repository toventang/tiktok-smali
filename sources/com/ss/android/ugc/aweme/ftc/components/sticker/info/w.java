package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import androidx.core.g.a;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ftc.components.sticker.a.a;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f98096a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f98097b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f98098c;

    static {
        Covode.recordClassIndex(62356);
    }

    w(i iVar, boolean z, boolean z2) {
        this.f98096a = iVar;
        this.f98097b = z;
        this.f98098c = z2;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        am amVar;
        i iVar = this.f98096a;
        boolean z = this.f98097b;
        boolean z2 = this.f98098c;
        boolean z3 = !z;
        iVar.f98069d.setVisibility(z3 ? 0 : 4);
        if (z3) {
            iVar.f98069d.b();
        }
        if (z) {
            iVar.f98069d.f98004k = i.O;
            iVar.r.a(true);
            return;
        }
        iVar.f98069d.f98004k = 0;
        if (z2) {
            com.ss.android.ugc.aweme.ftc.components.sticker.a.a aVar = iVar.N;
            e eVar = iVar.f98068c;
            if (eVar != null) {
                if (aVar.f97912h == null) {
                    aVar.f97912h = new am(eVar);
                }
                am amVar2 = aVar.f97912h;
                if ((amVar2 == null || !amVar2.isShowing()) && (amVar = aVar.f97912h) != null) {
                    amVar.show();
                }
            }
            AVServiceImpl.a().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new a.e(iVar.N));
            return;
        }
        iVar.r.a(true);
        iVar.s.a().setValue(t.a());
    }
}
