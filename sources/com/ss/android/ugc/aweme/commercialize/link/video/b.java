package com.ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public RemoteImageView f74519a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f74520b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f74521c;

    /* renamed from: d  reason: collision with root package name */
    public a f74522d;

    static {
        Covode.recordClassIndex(45956);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        a aVar = this.f74522d;
        if (aVar != null) {
            aVar.b();
        }
    }

    private b(Context context) {
        super(context, null, 0);
        MethodCollector.i(13104);
        a.a(LayoutInflater.from(context), R.layout.sq, this, true);
        setPadding(n.a(5.0d), getTopPaddingOffset(), n.a(5.0d), getBottomPaddingOffset());
        setBackgroundResource(R.drawable.azz);
        setGravity(16);
        View findViewById = findViewById(R.id.caw);
        l.b(findViewById, "");
        this.f74519a = (RemoteImageView) findViewById;
        View findViewById2 = findViewById(R.id.cav);
        l.b(findViewById2, "");
        this.f74520b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.cax);
        l.b(findViewById3, "");
        this.f74521c = (ImageView) findViewById3;
        setOnClickListener(this);
        MethodCollector.o(13104);
    }

    public /* synthetic */ b(Context context, byte b2) {
        this(context);
    }
}
