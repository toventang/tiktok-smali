package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.core.g.a;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.d.a;
import dmt.av.video.t;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f127789a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f127790b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f127791c;

    static {
        Covode.recordClassIndex(83767);
    }

    w(i iVar, boolean z, boolean z2) {
        this.f127789a = iVar;
        this.f127790b = z;
        this.f127791c = z2;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        an anVar;
        i iVar = this.f127789a;
        boolean z = this.f127790b;
        boolean z2 = this.f127791c;
        boolean z3 = !z;
        iVar.f127155d.setVisibility(z3 ? 0 : 4);
        if (z3) {
            iVar.f127155d.c();
        }
        if (z) {
            iVar.f127155d.f127078l = InfoStickerEditView.f127066m;
            iVar.s.a(true);
            return;
        }
        iVar.f127155d.f127078l = 0;
        if (z2) {
            com.ss.android.ugc.aweme.shortvideo.edit.d.a aVar = iVar.O;
            e eVar = iVar.f127154c;
            if (eVar != null) {
                if (aVar.f127008h == null) {
                    aVar.f127008h = new an(eVar);
                }
                an anVar2 = aVar.f127008h;
                if ((anVar2 == null || !anVar2.isShowing()) && (anVar = aVar.f127008h) != null) {
                    anVar.show();
                }
            }
            AVServiceImpl.a().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, new a.e(iVar.O));
            return;
        }
        iVar.s.a(true);
        iVar.t.a().setValue(t.a());
    }
}
