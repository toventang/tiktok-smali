package com.ss.android.ugc.aweme.ad.comment.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public ac f65629a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f65630b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f65631c;

    /* renamed from: d  reason: collision with root package name */
    private AbstractC1465a f65632d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f65633e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f65634f;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.d.a$a  reason: collision with other inner class name */
    public interface AbstractC1465a {
        static {
            Covode.recordClassIndex(40395);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(40394);
    }

    public final void setInnerClick(AbstractC1465a aVar) {
        this.f65632d = aVar;
    }

    public final void onClick(View view) {
        AbstractC1465a aVar;
        ClickAgent.onClick(view);
        l.d(view, "");
        int id = view.getId();
        if (id == R.id.cjc) {
            AbstractC1465a aVar2 = this.f65632d;
            if (aVar2 != null) {
                aVar2.b();
            }
        } else if (id == R.id.cwf) {
            AbstractC1465a aVar3 = this.f65632d;
            if (aVar3 != null) {
                aVar3.a();
            }
        } else if (id == R.id.dlk && (aVar = this.f65632d) != null) {
            aVar.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(1773);
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.ng, this, true);
        this.f65633e = (TextView) a2.findViewById(R.id.cjc);
        this.f65634f = (TextView) a2.findViewById(R.id.cwf);
        this.f65631c = (TextView) a2.findViewById(R.id.dlk);
        TextView textView = this.f65633e;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = this.f65634f;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        TextView textView3 = this.f65631c;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
            MethodCollector.o(1773);
            return;
        }
        MethodCollector.o(1773);
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
