package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.search.k.r;
import com.zhiliaoapp.musically.R;

public abstract class bb<T> {

    /* renamed from: a  reason: collision with root package name */
    protected Context f82410a;

    /* renamed from: b  reason: collision with root package name */
    protected View f82411b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f82412c;

    /* renamed from: d  reason: collision with root package name */
    protected TextView f82413d = ((TextView) this.f82411b.findViewById(R.id.dvf));

    /* renamed from: e  reason: collision with root package name */
    protected ViewGroup f82414e;

    /* renamed from: f  reason: collision with root package name */
    protected LinearLayout f82415f = ((LinearLayout) this.f82411b.findViewById(R.id.dv_));

    /* renamed from: g  reason: collision with root package name */
    public r f82416g;

    /* renamed from: h  reason: collision with root package name */
    protected View f82417h;

    /* renamed from: i  reason: collision with root package name */
    protected a f82418i;

    public interface a {
        static {
            Covode.recordClassIndex(51297);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(51295);
    }

    public final View a() {
        return this.f82411b;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        a aVar = this.f82418i;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (z) {
            View view = this.f82417h;
            if (view != null) {
                view.setOnClickListener(new bc(this));
            }
            this.f82414e.setVisibility(0);
            return;
        }
        this.f82414e.setVisibility(8);
    }

    public bb(View view, Context context, a aVar) {
        this.f82411b = view;
        this.f82410a = context;
        this.f82418i = aVar;
        this.f82412c = (TextView) view.findViewById(R.id.dvc);
        ViewGroup viewGroup = (ViewGroup) this.f82411b.findViewById(R.id.dve);
        this.f82414e = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.discover.ui.bb.AnonymousClass1 */

            static {
                Covode.recordClassIndex(51296);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (bb.this.f82418i != null) {
                    bb.this.f82418i.a();
                }
            }
        });
        this.f82417h = this.f82411b.findViewById(R.id.cmz);
        o.a(false, this.f82411b.findViewById(R.id.bst));
    }
}
