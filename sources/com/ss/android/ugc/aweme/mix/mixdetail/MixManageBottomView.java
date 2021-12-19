package com.ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class MixManageBottomView extends FrameLayout implements u {

    /* renamed from: a  reason: collision with root package name */
    public TuxButton f109976a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f109977b;

    /* renamed from: c  reason: collision with root package name */
    public TuxButton f109978c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f109979d;

    /* renamed from: e  reason: collision with root package name */
    boolean f109980e;

    static {
        Covode.recordClassIndex(70491);
    }

    public final TuxButton getAddVideoView() {
        TuxButton tuxButton = this.f109978c;
        if (tuxButton == null) {
            l.a("addVideoView");
        }
        return tuxButton;
    }

    public final LinearLayout getEditMixLayout() {
        LinearLayout linearLayout = this.f109979d;
        if (linearLayout == null) {
            l.a("editMixLayout");
        }
        return linearLayout;
    }

    public final TextView getRemoveConfirmView() {
        TextView textView = this.f109977b;
        if (textView == null) {
            l.a("removeConfirmView");
        }
        return textView;
    }

    public final TuxButton getRemoveView() {
        TuxButton tuxButton = this.f109976a;
        if (tuxButton == null) {
            l.a("removeView");
        }
        return tuxButton;
    }

    public final void setAddVideoView(TuxButton tuxButton) {
        l.d(tuxButton, "");
        this.f109978c = tuxButton;
    }

    public final void setEditMixLayout(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f109979d = linearLayout;
    }

    public final void setRemoveConfirmView(TextView textView) {
        l.d(textView, "");
        this.f109977b = textView;
    }

    public final void setRemoveView(TuxButton tuxButton) {
        l.d(tuxButton, "");
        this.f109976a = tuxButton;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MixManageBottomView f109981a;

        static {
            Covode.recordClassIndex(70492);
        }

        a(MixManageBottomView mixManageBottomView) {
            this.f109981a = mixManageBottomView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixManageBottomView mixManageBottomView = this.f109981a;
            mixManageBottomView.f109980e = true;
            LinearLayout linearLayout = mixManageBottomView.f109979d;
            if (linearLayout == null) {
                l.a("editMixLayout");
            }
            linearLayout.setVisibility(8);
            TextView textView = mixManageBottomView.f109977b;
            if (textView == null) {
                l.a("removeConfirmView");
            }
            textView.setVisibility(0);
        }
    }

    public final void a(int i2) {
        boolean z;
        TextView textView = this.f109977b;
        if (textView == null) {
            l.a("removeConfirmView");
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        textView.setEnabled(z);
        TextView textView2 = this.f109977b;
        if (textView2 == null) {
            l.a("removeConfirmView");
        }
        textView2.setText(getResources().getQuantityString(R.plurals.fd, i2, Integer.valueOf(i2)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MixManageBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(2312);
        com.a.a(LayoutInflater.from(getContext()), R.layout.al5, this, true);
        View findViewById = findViewById(R.id.cmy);
        l.b(findViewById, "");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f109979d = linearLayout;
        if (linearLayout == null) {
            l.a("editMixLayout");
        }
        linearLayout.setVisibility(0);
        View findViewById2 = findViewById(R.id.ze);
        l.b(findViewById2, "");
        TuxButton tuxButton = (TuxButton) findViewById2;
        this.f109976a = tuxButton;
        if (tuxButton == null) {
            l.a("removeView");
        }
        tuxButton.setOnClickListener(new a(this));
        View findViewById3 = findViewById(R.id.xp);
        l.b(findViewById3, "");
        this.f109978c = (TuxButton) findViewById3;
        View findViewById4 = findViewById(R.id.zf);
        l.b(findViewById4, "");
        TextView textView = (TextView) findViewById4;
        this.f109977b = textView;
        if (textView == null) {
            l.a("removeConfirmView");
        }
        textView.setVisibility(8);
        MethodCollector.o(2312);
    }
}
