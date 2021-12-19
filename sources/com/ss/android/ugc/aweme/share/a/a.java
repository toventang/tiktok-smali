package com.ss.android.ugc.aweme.share.a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.experiment.gk;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    private final Context f123301b;

    /* renamed from: c  reason: collision with root package name */
    private final SharePanelViewModel f123302c;

    static {
        Covode.recordClassIndex(80993);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b, androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return super.getItemCount();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, SharePanelViewModel sharePanelViewModel) {
        super(sharePanelViewModel);
        l.d(context, "");
        l.d(sharePanelViewModel, "");
        this.f123301b = context;
        this.f123302c = sharePanelViewModel;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b, androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int dimensionPixelOffset;
        l.d(viewHolder, "");
        super.onBindViewHolder(viewHolder, i2);
        int i3 = 0;
        if (!gk.b() || i2 != 0) {
            dimensionPixelOffset = this.f123301b.getResources().getDimensionPixelOffset(R.dimen.sf);
            if (viewHolder instanceof g) {
                i3 = this.f123301b.getResources().getDimensionPixelOffset(R.dimen.sa);
            }
        } else {
            dimensionPixelOffset = this.f123301b.getResources().getDimensionPixelOffset(R.dimen.sc);
        }
        View view = viewHolder.itemView;
        l.b(view, "");
        i.b(view, Integer.valueOf(dimensionPixelOffset), 0, Integer.valueOf(i3), 0, false, 16);
    }
}
