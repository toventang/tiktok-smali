package com.bytedance.android.live.p;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class i extends a {
    static {
        Covode.recordClassIndex(6674);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.p.a
    public final q a() {
        return q.ICON_TITLE_HORIZONTAL;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.p.a
    public final LinearLayout a(View view) {
        return (LinearLayout) view.findViewById(R.id.ene);
    }

    public i(Context context, List<l> list, DataChannel dataChannel) {
        super(context, list, dataChannel);
    }
}
