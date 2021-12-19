package com.bytedance.android.livesdk.gifttray;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.model.message.aw;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;

public abstract class AbsNormalGiftAnimWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f17979a;

    static {
        Covode.recordClassIndex(9988);
    }

    public abstract void a();

    public abstract void a(aw awVar);

    public abstract void a(y yVar);

    public abstract void b();

    public abstract void b(y yVar);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}
