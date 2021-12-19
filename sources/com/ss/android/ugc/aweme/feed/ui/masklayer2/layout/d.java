package com.ss.android.ugc.aweme.feed.ui.masklayer2.layout;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public OptionDescItemLayout f94954a;

    /* renamed from: b  reason: collision with root package name */
    public f f94955b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f94956c;

    static {
        Covode.recordClassIndex(60224);
    }

    private View a() {
        if (this.f94956c == null) {
            this.f94956c = new SparseArray();
        }
        View view = (View) this.f94956c.get(R.id.wh);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.wh);
        this.f94956c.put(R.id.wh, findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context);
        l.d(context, "");
        MethodCollector.i(8071);
        View.inflate(getContext(), R.layout.sh, this);
        View findViewById = findViewById(R.id.aki);
        l.b(findViewById, "");
        this.f94954a = (OptionDescItemLayout) findViewById;
        setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f94957a;

            static {
                Covode.recordClassIndex(60225);
            }

            {
                this.f94957a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                f fVar = this.f94957a.f94955b;
                if (fVar != null) {
                    l.b(view, "");
                    fVar.b(view);
                }
            }
        });
        MethodCollector.o(8071);
    }

    public final void a(k kVar, boolean z) {
        l.d(kVar, "");
        this.f94955b = kVar.f94935b;
        this.f94954a.a(kVar.f94934a);
        if (z) {
            View a2 = a();
            l.b(a2, "");
            a2.setVisibility(4);
            return;
        }
        View a3 = a();
        l.b(a3, "");
        a3.setVisibility(0);
    }
}
