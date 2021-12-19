package com.ss.android.ugc.aweme.dsp.playpage.playview.b;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.b.c;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import com.ss.android.ugc.aweme.dsp.widget.MDMarqueeView;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public b f83836a;

    /* renamed from: b  reason: collision with root package name */
    public c f83837b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f83838c;

    /* renamed from: d  reason: collision with root package name */
    public MDMarqueeView f83839d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f83840e;

    /* renamed from: f  reason: collision with root package name */
    public final View f83841f;

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f83842a = new a();

        static {
            Covode.recordClassIndex(52283);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(52282);
    }

    public d(View view) {
        l.d(view, "");
        this.f83841f = view;
    }
}
