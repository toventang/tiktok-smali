package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final TextView f139578a;

    static {
        Covode.recordClassIndex(91250);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        TextView textView = (TextView) view.findViewById(R.id.f9k);
        this.f139578a = textView;
        b.a().a(textView, d.f33801g);
    }
}
