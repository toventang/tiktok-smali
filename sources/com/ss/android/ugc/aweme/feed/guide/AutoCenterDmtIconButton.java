package com.ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.d;
import com.bytedance.ies.dmt.ui.widget.a;
import com.zhiliaoapp.musically.R;

public class AutoCenterDmtIconButton extends FrameLayout implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f93190a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f93191b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f93192c;

    /* renamed from: d  reason: collision with root package name */
    private a f93193d;

    /* renamed from: e  reason: collision with root package name */
    private int f93194e;

    static {
        Covode.recordClassIndex(59105);
    }

    private void a() {
        if (this.f93193d == a.SOLID) {
            b();
        } else {
            c();
        }
    }

    private void b() {
        if (this.f93190a == 0) {
            setBackgroundResource(R.drawable.cbm);
        } else {
            setBackgroundResource(R.drawable.cbl);
        }
        this.f93192c.setTextColor(b.c(getContext(), R.color.a9));
        if (this.f93194e != -1) {
            this.f93191b.setVisibility(0);
            com.bytedance.ies.dmt.ui.titlebar.b.a.a(getContext(), this.f93191b, this.f93194e, R.color.a9);
            return;
        }
        this.f93191b.setVisibility(8);
    }

    private void c() {
        if (this.f93190a == 0) {
            setBackgroundResource(R.drawable.cbk);
            this.f93192c.setTextColor(b.c(getContext(), R.color.bx));
            if (this.f93194e != -1) {
                this.f93191b.setVisibility(0);
                com.bytedance.ies.dmt.ui.titlebar.b.a.a(getContext(), this.f93191b, this.f93194e, R.color.bx);
                return;
            }
            this.f93191b.setVisibility(8);
            return;
        }
        setBackgroundResource(R.drawable.cbi);
        this.f93192c.setTextColor(b.c(getContext(), R.color.a_));
        if (this.f93194e != -1) {
            this.f93191b.setVisibility(0);
            com.bytedance.ies.dmt.ui.titlebar.b.a.a(getContext(), this.f93191b, this.f93194e, R.color.a_);
            return;
        }
        this.f93191b.setVisibility(8);
    }

    @Override // com.bytedance.ies.dmt.ui.common.d
    public final void a(int i2) {
        if (this.f93190a != i2) {
            this.f93190a = i2;
            a();
        }
    }

    public AutoCenterDmtIconButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AutoCenterDmtIconButton(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(11744);
        this.f93190a = b.a.f33348a.f33347a;
        this.f93193d = a.SOLID;
        this.f93194e = -1;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.ag1, this, true);
        this.f93191b = (ImageView) a2.findViewById(R.id.by0);
        this.f93192c = (TextView) a2.findViewById(R.id.f9a);
        a();
        MethodCollector.o(11744);
    }

    public final void a(a aVar, int i2, int i3) {
        a(aVar, i2, getContext().getString(i3));
    }

    public final void a(a aVar, int i2, String str) {
        this.f93194e = i2;
        if (aVar == a.BORDER) {
            c();
        } else {
            b();
        }
        this.f93192c.setText(str);
    }
}
