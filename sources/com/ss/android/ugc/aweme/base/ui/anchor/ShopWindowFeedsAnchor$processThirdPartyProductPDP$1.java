package com.ss.android.ugc.aweme.base.ui.anchor;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import org.greenrobot.eventbus.EventBus;

public final class ShopWindowFeedsAnchor$processThirdPartyProductPDP$1 implements au {
    static {
        Covode.recordClassIndex(42077);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    ShopWindowFeedsAnchor$processThirdPartyProductPDP$1() {
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }
}
