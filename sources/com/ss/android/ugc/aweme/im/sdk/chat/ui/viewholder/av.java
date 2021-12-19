package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class av extends a<BaseContent> {
    public View A;

    /* renamed from: a  reason: collision with root package name */
    public RemoteImageView f101379a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f101380b;
    public TuxTextView x;
    public TextView y;
    public LinearLayout z;

    static {
        Covode.recordClassIndex(64828);
    }

    public final RemoteImageView i() {
        RemoteImageView remoteImageView = this.f101379a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        return remoteImageView;
    }

    public final TuxTextView j() {
        TuxTextView tuxTextView = this.f101380b;
        if (tuxTextView == null) {
            l.a("titleView");
        }
        return tuxTextView;
    }

    public final TuxTextView k() {
        TuxTextView tuxTextView = this.x;
        if (tuxTextView == null) {
            l.a("descView");
        }
        return tuxTextView;
    }

    public final TextView l() {
        TextView textView = this.y;
        if (textView == null) {
            l.a("tagView");
        }
        return textView;
    }

    public final void m() {
        RemoteImageView remoteImageView = this.f101379a;
        if (remoteImageView == null) {
            l.a("iconView");
        }
        e.a(remoteImageView, 2131232828);
        TuxTextView tuxTextView = this.x;
        if (tuxTextView == null) {
            l.a("descView");
        }
        tuxTextView.setVisibility(8);
        TuxTextView tuxTextView2 = this.f101380b;
        if (tuxTextView2 == null) {
            l.a("titleView");
        }
        tuxTextView2.setText(R.string.co7);
        this.o.a(150994945, true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.o = a.C2518a.a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.icon_iv);
        l.b(findViewById2, "");
        this.f101379a = (RemoteImageView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.title_tv);
        l.b(findViewById3, "");
        this.f101380b = (TuxTextView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.akl);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.ei7);
        l.b(findViewById5, "");
        this.y = (TextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.a2q);
        l.b(findViewById6, "");
        this.A = findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.vf);
        l.b(findViewById7, "");
        this.z = (LinearLayout) findViewById7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a(ai aiVar, ai aiVar2, BaseContent baseContent, int i2) {
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, baseContent, i2);
        this.o.a(150994945, false);
    }
}
