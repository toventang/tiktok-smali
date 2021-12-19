package com.ss.android.ugc.aweme.find.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;

public final class f extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final View f96074a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f96075b;

    final /* synthetic */ class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ b f96076a;

        static {
            Covode.recordClassIndex(60863);
        }

        a(b bVar) {
            this.f96076a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f96076a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(60862);
    }

    private View a(int i2) {
        if (this.f96075b == null) {
            this.f96075b = new SparseArray();
        }
        View view = (View) this.f96075b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f96075b.put(i2, findViewById);
        return findViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.find.ui.f$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnClickButtonListener(h.f.a.b<? super android.view.View, h.z> r3) {
        /*
            r2 = this;
            android.view.View r1 = r2.f96074a
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r0 = 2131363998(0x7f0a089e, float:1.834782E38)
            android.view.View r1 = r1.findViewById(r0)
            com.bytedance.tux.button.TuxButton r1 = (com.bytedance.tux.button.TuxButton) r1
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.find.ui.f$a r0 = new com.ss.android.ugc.aweme.find.ui.f$a
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.find.ui.f.setOnClickButtonListener(h.f.a.b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(10040);
        this.f96074a = com.a.a(LayoutInflater.from(context), R.layout.a2t, this, true);
        Space space = (Space) a(R.id.ep9);
        l.b(space, "");
        space.setVisibility(8);
        Space space2 = (Space) a(R.id.w9);
        l.b(space2, "");
        space2.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        MethodCollector.o(10040);
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }
}
