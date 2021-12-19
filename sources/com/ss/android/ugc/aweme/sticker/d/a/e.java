package com.ss.android.ugc.aweme.sticker.d.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.d.b.a;
import com.ss.android.ugc.aweme.sticker.d.b.b;
import com.ss.android.ugc.aweme.sticker.d.b.c;
import com.ss.android.ugc.aweme.sticker.m.h;
import com.ss.android.ugc.aweme.sticker.m.m;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.a.y;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final o f134762a;

    /* renamed from: b  reason: collision with root package name */
    private final h f134763b;

    static {
        Covode.recordClassIndex(88081);
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.a.d
    public final <T> boolean a(b<T> bVar) {
        Bundle bundle;
        String str;
        boolean z;
        String str2 = "";
        l.d(bVar, str2);
        if ((bVar instanceof c) && (bVar.b() == a.UI_CLICK || bVar.b() == a.UI_GALLERY)) {
            c cVar = (c) bVar;
            Effect effect = cVar.f134767a;
            if (cVar.f134774h != Integer.MIN_VALUE) {
                int i2 = cVar.f134774h;
                o oVar = this.f134762a;
                l.d(oVar, str2);
                l.d(str2, str2);
                y j2 = oVar.c().j();
                int size = com.ss.android.ugc.aweme.sticker.repository.b.a(j2).size();
                if (i2 >= 0 && size > i2) {
                    str = m.a(com.ss.android.ugc.aweme.sticker.repository.b.a(j2).get(i2));
                } else {
                    str = str2;
                }
                bundle = cVar.f134771e;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                if (i2 >= 0) {
                    str2 = String.valueOf(i2);
                }
                bundle.putString("prop_tab_order", str2);
                bundle.putString("prop_tab_name", str);
            } else {
                bundle = cVar.f134771e;
                str = str2;
            }
            h hVar = this.f134763b;
            boolean a2 = com.ss.android.ugc.aweme.sticker.f.c.a(this.f134762a, effect);
            int a3 = bVar.a();
            if (bVar.b() == a.UI_GALLERY) {
                z = true;
            } else {
                z = false;
            }
            hVar.a(effect, a2, str, "click_main_panel", a3, z, bundle);
        }
        return false;
    }

    public e(o oVar, h hVar) {
        l.d(oVar, "");
        l.d(hVar, "");
        this.f134762a = oVar;
        this.f134763b = hVar;
    }
}
