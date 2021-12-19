package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public OptionDescItemLayout f94940a;

    /* renamed from: b  reason: collision with root package name */
    public f f94941b;

    /* renamed from: c  reason: collision with root package name */
    public f f94942c;

    /* renamed from: d  reason: collision with root package name */
    private LinearLayout f94943d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f94944e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f94945f;

    static {
        Covode.recordClassIndex(60218);
    }

    public final View a() {
        if (this.f94945f == null) {
            this.f94945f = new SparseArray();
        }
        View view = (View) this.f94945f.get(R.id.wh);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.wh);
        this.f94945f.put(R.id.wh, findViewById);
        return findViewById;
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(10012);
        View.inflate(getContext(), R.layout.sf, this);
        View findViewById = findViewById(R.id.aki);
        l.b(findViewById, "");
        this.f94940a = (OptionDescItemLayout) findViewById;
        View findViewById2 = findViewById(R.id.co7);
        l.b(findViewById2, "");
        this.f94943d = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.f2y);
        l.b(findViewById3, "");
        this.f94944e = (TextView) findViewById3;
        this.f94940a.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f94946a;

            static {
                Covode.recordClassIndex(60219);
            }

            {
                this.f94946a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                f fVar = this.f94946a.f94941b;
                if (fVar != null) {
                    l.b(view, "");
                    fVar.b(view);
                }
            }
        });
        this.f94943d.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.a.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f94947a;

            static {
                Covode.recordClassIndex(60220);
            }

            {
                this.f94947a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                f fVar = this.f94947a.f94942c;
                if (fVar != null) {
                    l.b(view, "");
                    fVar.b(view);
                }
            }
        });
        MethodCollector.o(10012);
    }
}
