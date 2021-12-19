package com.bytedance.android.live.broadcast.bgbroadcast.a.a;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.widget.ControlButton;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    ControlButton f7605a;

    /* renamed from: b  reason: collision with root package name */
    AbstractC0106a f7606b;

    /* renamed from: c  reason: collision with root package name */
    public View f7607c = findViewById(R.id.add);

    /* renamed from: d  reason: collision with root package name */
    private ControlButton f7608d;

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0106a {
        static {
            Covode.recordClassIndex(3750);
        }

        void a();

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(3749);
    }

    private int getLayoutId() {
        return R.layout.bf9;
    }

    public final int getIconWidth() {
        return y.a(36.0f);
    }

    public final boolean a() {
        if (this.f7607c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void setOnViewClickListener(AbstractC0106a aVar) {
        this.f7606b = aVar;
    }

    public final void setMsgBtnActive(boolean z) {
        this.f7605a.setChecked(z);
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(7214);
        inflate(getContext(), getLayoutId(), this);
        ControlButton controlButton = (ControlButton) findViewById(R.id.z4);
        this.f7605a = controlButton;
        controlButton.a(2131234510, 2131234511, R.string.ekb, R.string.ekb, true);
        this.f7605a.setDescVisibility(0);
        ControlButton controlButton2 = (ControlButton) findViewById(R.id.zj);
        this.f7608d = controlButton2;
        controlButton2.a(2131234558, 2131234558, R.string.eka, R.string.eka, false);
        this.f7608d.setDescVisibility(0);
        this.f7605a.setOnViewClickListener(new b(this));
        this.f7608d.setOnViewClickListener(new c(this));
        MethodCollector.o(7214);
    }
}
