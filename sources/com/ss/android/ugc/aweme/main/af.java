package com.ss.android.ugc.aweme.main;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.e;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.f;
import com.bytedance.tux.icon.TuxIconView;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ae f109153a;

    static {
        Covode.recordClassIndex(69893);
    }

    af(ae aeVar) {
        this.f109153a = aeVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        TuxIconView tuxIconView;
        ae aeVar = this.f109153a;
        a aVar = (a) obj;
        i.a(aVar.f34874a, aeVar.u);
        e eVar = aeVar.s;
        int i2 = aVar.f34874a;
        if (eVar.f44219a != null) {
            i.a(i2, eVar.f44219a);
        }
        f fVar = aeVar.r;
        int i3 = aVar.f34874a;
        if (fVar.f44223b != null) {
            i.a(i3, fVar.f44223b);
            if (i3 == 4 && (tuxIconView = fVar.f44223b) != null) {
                tuxIconView.setAlpha(1.0f);
            }
        }
    }
}
