package com.ss.android.ugc.aweme.social.widget.card.view;

import android.content.Context;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import h.f.b.l;

public abstract class a extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f133952a;

    /* renamed from: b  reason: collision with root package name */
    public TuxIconView f133953b;

    static {
        Covode.recordClassIndex(87639);
    }

    public final TuxIconView getInfoIconView() {
        TuxIconView tuxIconView = this.f133953b;
        if (tuxIconView == null) {
            l.a("infoIconView");
        }
        return tuxIconView;
    }

    public final TuxTextView getTitleTextView() {
        TuxTextView tuxTextView = this.f133952a;
        if (tuxTextView == null) {
            l.a("titleTextView");
        }
        return tuxTextView;
    }

    private a(Context context) {
        super(context, null, 0);
    }

    public final void setInfoIconView(TuxIconView tuxIconView) {
        l.d(tuxIconView, "");
        this.f133953b = tuxIconView;
    }

    public final void setTitleTextView(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f133952a = tuxTextView;
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
