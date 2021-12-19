package com.bytedance.android.livesdk.olddialog.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.model.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;

public final class v extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public w f20177a;

    /* renamed from: b  reason: collision with root package name */
    public LiveTextView f20178b;

    static {
        Covode.recordClassIndex(11905);
    }

    public v(View view) {
        super(view);
        LiveTextView liveTextView = (LiveTextView) view;
        this.f20178b = liveTextView;
        liveTextView.setAlpha(0.9f);
        this.f20178b.setTypeface(b.a().a(d.f33801g));
    }

    public final void a(String str, w wVar) {
        this.f20178b.setText(str);
        this.f20177a = wVar;
    }
}
