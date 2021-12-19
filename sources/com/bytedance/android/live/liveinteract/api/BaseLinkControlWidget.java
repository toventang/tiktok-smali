package com.bytedance.android.live.liveinteract.api;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;

public abstract class BaseLinkControlWidget extends LiveWidget implements c, au {

    public interface a {
        static {
            Covode.recordClassIndex(5133);
        }

        LiveWidget a(int i2);

        void a(LiveWidget liveWidget);
    }

    static {
        Covode.recordClassIndex(5132);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}
