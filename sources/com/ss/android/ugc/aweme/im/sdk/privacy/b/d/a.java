package com.ss.android.ugc.aweme.im.sdk.privacy.b.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.table.b;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import h.f.b.l;
import java.util.Objects;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final TuxTextCell f102934a;

    static {
        Covode.recordClassIndex(65985);
    }

    public final void a(boolean z) {
        c.b accessory = this.f102934a.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Radio");
        ((c.e) accessory).c(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view;
        this.f102934a = tuxTextCell;
        tuxTextCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tuxTextCell.setInset(b.PADDING_16);
        Context context = tuxTextCell.getContext();
        l.b(context, "");
        tuxTextCell.setAccessory(new c.i(context));
    }
}
