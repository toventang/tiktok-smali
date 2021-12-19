package com.bytedance.android.livesdk.toolbar;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.p.o;
import com.bytedance.android.live.p.q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class LiveBroadcastToolbarWidget extends LiveToolbarWidget implements au {

    /* renamed from: c  reason: collision with root package name */
    private List<? extends l> f21662c = new ArrayList();

    static {
        Covode.recordClassIndex(12778);
    }

    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bff;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final LinearLayout a() {
        View view = getView();
        if (view != null) {
            return (LinearLayout) view.findViewById(R.id.c6);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final void b() {
        LinearLayout linearLayout;
        super.b();
        o oVar = o.LEFT;
        DataChannel dataChannel = this.dataChannel;
        View view = getView();
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.c_)) != null) {
            List<? extends l> list = this.f21662c;
            q qVar = this.f21666b;
            h.f.b.l.b(qVar, "");
            oVar.createHolder(dataChannel, linearLayout, list, qVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.toolbar.LiveToolbarWidget
    public final void c() {
        View findViewById;
        View findViewById2;
        View view = getView();
        if (!(view == null || (findViewById2 = view.findViewById(R.id.c_)) == null)) {
            findViewById2.setPadding(y.a(8.0f), 0, 0, 0);
        }
        View view2 = getView();
        if (view2 != null && (findViewById = view2.findViewById(R.id.c6)) != null) {
            findViewById.setPadding(y.a(8.0f), 0, y.a(8.0f), 0);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.android.livesdk.toolbar.LiveToolbarWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        super.onInit(objArr);
        if (objArr != null && objArr.length > 1) {
            Object obj = objArr[1];
            if (!(obj instanceof List)) {
                obj = null;
            }
            List<? extends l> list = (List) obj;
            if (list != null) {
                this.f21662c = list;
            }
        }
    }
}
