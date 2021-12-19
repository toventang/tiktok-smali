package com.ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.a;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

public class SimpleDMTDefaultView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    AutoCenterDmtIconButton f93238a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f93239b;

    /* renamed from: c  reason: collision with root package name */
    private TuxTextView f93240c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f93241d;

    static {
        Covode.recordClassIndex(59121);
    }

    public final SimpleDMTDefaultView c() {
        this.f93240c.setTuxFont(22);
        return this;
    }

    public final SimpleDMTDefaultView a() {
        this.f93239b.setImageResource(2131232665);
        this.f93239b.setVisibility(0);
        return this;
    }

    public final SimpleDMTDefaultView b() {
        this.f93238a.a(a.SOLID, -1, "");
        this.f93238a.setVisibility(8);
        return this;
    }

    public final SimpleDMTDefaultView a(int i2) {
        this.f93238a.setMinimumWidth(i2);
        return this;
    }

    public final SimpleDMTDefaultView b(int i2) {
        this.f93240c.setText(i2);
        return this;
    }

    public final SimpleDMTDefaultView d(int i2) {
        setPadding(0, i2, 0, 0);
        return this;
    }

    public final SimpleDMTDefaultView c(int i2) {
        this.f93241d.setText(i2);
        return this;
    }

    public final SimpleDMTDefaultView e(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f93241d.getLayoutParams();
        marginLayoutParams.topMargin = i2;
        this.f93241d.setLayoutParams(marginLayoutParams);
        return this;
    }

    public final SimpleDMTDefaultView a(View.OnClickListener onClickListener) {
        this.f93238a.setOnClickListener(onClickListener);
        return this;
    }

    public final SimpleDMTDefaultView a(String str) {
        this.f93240c.setText(str);
        return this;
    }

    public SimpleDMTDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final SimpleDMTDefaultView a(a aVar, int i2, int i3) {
        this.f93238a.setVisibility(0);
        this.f93238a.a(aVar, i2, i3);
        return this;
    }

    private SimpleDMTDefaultView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(12604);
        com.a.a(LayoutInflater.from(getContext()), R.layout.aho, this, true);
        this.f93240c = (TuxTextView) findViewById(R.id.f9l);
        this.f93241d = (TextView) findViewById(R.id.eyc);
        this.f93238a = (AutoCenterDmtIconButton) findViewById(R.id.bhk);
        this.f93239b = (ImageView) findViewById(R.id.bn2);
        MethodCollector.o(12604);
    }
}
