package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.firstrecharge.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class LiveNewFirstRechargeWidget extends LiveRecyclableWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private View f20102a;

    static {
        Covode.recordClassIndex(11869);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgv;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.f20102a = findViewById(R.id.fie);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view = this.f20102a;
        if (view != null) {
            view.setOnClickListener(new a(this));
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveNewFirstRechargeWidget f20103a;

        static {
            Covode.recordClassIndex(11870);
        }

        a(LiveNewFirstRechargeWidget liveNewFirstRechargeWidget) {
            this.f20103a = liveNewFirstRechargeWidget;
        }

        public final void onClick(View view) {
            d dVar = d.u;
            View view2 = this.f20103a.contentView;
            l.b(view2, "");
            dVar.a(view2.getContext(), "first_recharge");
        }
    }
}
