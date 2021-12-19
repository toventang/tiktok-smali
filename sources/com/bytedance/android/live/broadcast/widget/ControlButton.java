package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class ControlButton extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8682a;

    /* renamed from: b  reason: collision with root package name */
    public a f8683b;

    /* renamed from: c  reason: collision with root package name */
    private View f8684c = findViewById(R.id.ade);

    /* renamed from: d  reason: collision with root package name */
    private int f8685d;

    /* renamed from: e  reason: collision with root package name */
    private int f8686e;

    /* renamed from: f  reason: collision with root package name */
    private int f8687f;

    /* renamed from: g  reason: collision with root package name */
    private int f8688g;

    /* renamed from: h  reason: collision with root package name */
    private int f8689h;

    /* renamed from: i  reason: collision with root package name */
    private int f8690i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f8691j = ((ImageView) findViewById(R.id.by0));

    /* renamed from: k  reason: collision with root package name */
    private TextView f8692k = ((TextView) findViewById(R.id.eyc));

    public interface a {
        static {
            Covode.recordClassIndex(4451);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(4449);
    }

    private int getLayoutId() {
        return R.layout.bet;
    }

    public final void a() {
        if (this.f8682a) {
            this.f8691j.setImageResource(this.f8686e);
            if (this.f8688g != -1) {
                this.f8692k.setTextColor(getResources().getColor(this.f8688g));
            }
            int i2 = this.f8690i;
            if (i2 != -1) {
                this.f8692k.setText(i2);
                return;
            }
            return;
        }
        this.f8691j.setImageResource(this.f8685d);
        if (this.f8687f != -1) {
            this.f8692k.setTextColor(getResources().getColor(this.f8687f));
        }
        int i3 = this.f8689h;
        if (i3 != -1) {
            this.f8692k.setText(i3);
        }
    }

    public void setOnViewClickListener(a aVar) {
        this.f8683b = aVar;
    }

    public void setChecked(boolean z) {
        this.f8682a = z;
        a();
    }

    public void setDescVisibility(int i2) {
        this.f8692k.setVisibility(i2);
    }

    public ControlButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(8072);
        inflate(getContext(), getLayoutId(), this);
        this.f8684c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.live.broadcast.widget.ControlButton.AnonymousClass1 */

            static {
                Covode.recordClassIndex(4450);
            }

            public final void onClick(View view) {
                ControlButton controlButton = ControlButton.this;
                controlButton.f8682a = !controlButton.f8682a;
                ControlButton.this.a();
                if (ControlButton.this.f8683b != null) {
                    ControlButton.this.f8683b.a();
                }
            }
        });
        MethodCollector.o(8072);
    }

    public final void a(int i2, int i3, int i4, int i5, boolean z) {
        this.f8685d = i2;
        this.f8686e = i3;
        this.f8687f = R.color.xh;
        this.f8688g = R.color.xh;
        this.f8689h = i4;
        this.f8690i = i5;
        this.f8682a = z;
        a();
    }
}
