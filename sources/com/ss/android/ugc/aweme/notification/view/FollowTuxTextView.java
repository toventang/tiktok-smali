package com.ss.android.ugc.aweme.notification.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.following.ui.view.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class FollowTuxTextView extends TuxTextView implements a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f113913a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f113914b;

    static {
        Covode.recordClassIndex(73252);
    }

    public FollowTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setFollowStatus(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final m getLifeCycleOwner() {
        Activity d2 = o.d(this);
        Objects.requireNonNull(d2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (e) d2;
    }

    public final void setPrefixView(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f113914b = tuxTextView;
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3) {
        StringBuilder append;
        if (i2 == 0) {
            setTextColor(getResources().getColor(R.color.b9));
            if (i3 == 0) {
                append = new StringBuilder().append(getResources().getString(R.string.byp));
            } else {
                append = new StringBuilder().append(getResources().getString(R.string.byt));
            }
            setText(append);
            TuxTextView tuxTextView = this.f113914b;
            if (tuxTextView != null) {
                tuxTextView.setText("+");
            }
            TuxTextView tuxTextView2 = this.f113914b;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(getResources().getColor(R.color.b9));
            }
            setClickable(true);
        } else if (i2 == 1) {
            setText(new StringBuilder().append(getResources().getString(R.string.c0a)));
            TuxTextView tuxTextView3 = this.f113914b;
            if (tuxTextView3 != null) {
                tuxTextView3.setText("·");
            }
            if (!this.f113913a) {
                setClickable(false);
            }
            setTextColor(getResources().getColor(R.color.c5));
            TuxTextView tuxTextView4 = this.f113914b;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColor(getResources().getColor(R.color.c5));
            }
        } else if (i2 == 2) {
            setText(new StringBuilder().append(getResources().getString(R.string.bbg)));
            TuxTextView tuxTextView5 = this.f113914b;
            if (tuxTextView5 != null) {
                tuxTextView5.setText("·");
            }
            if (!this.f113913a) {
                setClickable(false);
            }
            setTextColor(getResources().getColor(R.color.c5));
            TuxTextView tuxTextView6 = this.f113914b;
            if (tuxTextView6 != null) {
                tuxTextView6.setTextColor(getResources().getColor(R.color.c5));
            }
        } else if (i2 == 4) {
            setText(new StringBuilder().append(getResources().getString(R.string.bzw)));
            TuxTextView tuxTextView7 = this.f113914b;
            if (tuxTextView7 != null) {
                tuxTextView7.setText("·");
            }
            if (!this.f113913a) {
                setClickable(false);
            }
            setTextColor(getResources().getColor(R.color.c5));
            TuxTextView tuxTextView8 = this.f113914b;
            if (tuxTextView8 != null) {
                tuxTextView8.setTextColor(getResources().getColor(R.color.c5));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.following.ui.view.a
    public final void a(int i2, int i3, String str) {
        a(i2, i3);
    }

    private /* synthetic */ FollowTuxTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FollowTuxTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
