package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.qrcode.l;
import com.zhiliaoapp.musically.R;

public class SearchScanView extends FrameLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f82167a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f82168b;

    /* renamed from: c  reason: collision with root package name */
    private TuxIconView f82169c;

    /* renamed from: d  reason: collision with root package name */
    private a f82170d;

    public interface a {
        static {
            Covode.recordClassIndex(51131);
        }

        void a(View view);

        void b(View view);
    }

    static {
        Covode.recordClassIndex(51130);
    }

    public final void a() {
        if (!l.a.f119757a.a().booleanValue()) {
            this.f82169c.setVisibility(0);
            this.f82168b.setVisibility(8);
            this.f82167a = true;
        }
    }

    public void setOnInternalClickListener(a aVar) {
        this.f82170d = aVar;
    }

    public SearchScanView(Context context) {
        this(context, null);
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        if (this.f82170d != null) {
            int id = view.getId();
            if (id == R.id.f6h) {
                this.f82170d.a(view);
            } else if (id == R.id.dsd) {
                this.f82170d.b(view);
            }
        }
    }

    public SearchScanView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SearchScanView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(7712);
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.ax6, this, true);
        this.f82168b = (TextView) a2.findViewById(R.id.f6h);
        TuxIconView tuxIconView = (TuxIconView) a2.findViewById(R.id.dsd);
        this.f82169c = tuxIconView;
        com.ss.android.ugc.aweme.notification.g.a.a(tuxIconView);
        this.f82169c.setOnClickListener(this);
        this.f82168b.setOnClickListener(this);
        MethodCollector.o(7712);
    }
}
