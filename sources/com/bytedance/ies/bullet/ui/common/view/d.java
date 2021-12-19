package com.bytedance.ies.bullet.ui.common.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class d extends FrameLayout implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f33130a;

    static {
        Covode.recordClassIndex(19792);
    }

    private View a(int i2) {
        if (this.f33130a == null) {
            this.f33130a = new HashMap();
        }
        View view = (View) this.f33130a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f33130a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final View getTitleBarRoot() {
        return this;
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final ImageView getBackView() {
        return (ImageView) a(R.id.bu7);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final ImageView getCloseAllView() {
        return (ImageView) a(R.id.bvf);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final ImageView getMoreButtonView() {
        return (ImageView) a(R.id.bz1);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final ImageView getReportView() {
        return (ImageView) a(R.id.c0f);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final ImageView getShareView() {
        return (ImageView) a(R.id.c19);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final TextView getTitleView() {
        return (TextView) a(R.id.f9l);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final void setTitleBarBackgroundColor(int i2) {
        ((FrameLayout) a(R.id.en1)).setBackgroundColor(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.c(context, "");
        MethodCollector.i(10520);
        a.a(LayoutInflater.from(context), R.layout.ll, this, true);
        MethodCollector.o(10520);
    }

    @Override // com.bytedance.ies.bullet.ui.common.k.a
    public final void setDefaultTitle(CharSequence charSequence) {
        l.c(charSequence, "");
        TextView titleView = getTitleView();
        if (titleView != null) {
            CharSequence text = titleView.getText();
            l.a((Object) text, "");
            if (text.length() == 0) {
                titleView.setText(charSequence);
            }
        }
    }
}
