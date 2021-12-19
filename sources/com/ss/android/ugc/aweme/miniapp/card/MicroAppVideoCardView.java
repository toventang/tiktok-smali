package com.ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.zhiliaoapp.musically.R;

public class MicroAppVideoCardView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public boolean f109640g;

    /* renamed from: h  reason: collision with root package name */
    a f109641h;

    /* renamed from: i  reason: collision with root package name */
    private View f109642i;

    /* renamed from: j  reason: collision with root package name */
    private AnimatedImageView f109643j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f109644k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f109645l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f109646m;
    private ImageView n;

    interface a {
        static {
            Covode.recordClassIndex(70167);
        }
    }

    static {
        Covode.recordClassIndex(70166);
    }

    public void setOnClickCloseListener(a aVar) {
        this.f109641h = aVar;
    }

    public MicroAppVideoCardView(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        this.f109640g = z;
        setVisibility(8);
    }

    public MicroAppVideoCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MicroAppVideoCardView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7668);
        View inflate = LayoutInflater.from(context).inflate(R.layout.t_, this);
        this.f109642i = inflate;
        this.f109643j = (AnimatedImageView) inflate.findViewById(R.id.cmh);
        this.n = (ImageView) this.f109642i.findViewById(R.id.cmf);
        this.f109645l = (TextView) this.f109642i.findViewById(R.id.cmg);
        this.f109644k = (TextView) this.f109642i.findViewById(R.id.cmi);
        this.f109646m = (TextView) this.f109642i.findViewById(R.id.cme);
        MethodCollector.o(7668);
    }
}
