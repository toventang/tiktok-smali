package com.ss.android.ugc.aweme.compliance.business.banappeal.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    final TuxTextView f76774g;

    /* renamed from: h  reason: collision with root package name */
    private final TuxTextView f76775h;

    /* renamed from: i  reason: collision with root package name */
    private final TuxTextView f76776i;

    /* renamed from: j  reason: collision with root package name */
    private final ViewGroup f76777j;

    final /* synthetic */ class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ b f76778a;

        static {
            Covode.recordClassIndex(47462);
        }

        a(b bVar) {
            this.f76778a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f76778a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(47461);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        ConstraintLayout.inflate(getContext(), R.layout.tw, this);
        View findViewById = findViewById(R.id.alo);
        l.b(findViewById, "");
        this.f76775h = (TuxTextView) findViewById;
        View findViewById2 = findViewById(R.id.alp);
        l.b(findViewById2, "");
        this.f76776i = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.all);
        l.b(findViewById3, "");
        this.f76777j = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(R.id.aln);
        l.b(findViewById4, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.f76774g = tuxTextView;
        tuxTextView.setVisibility(8);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    public final void a(String str, String str2, b<? super View, z> bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        this.f76777j.setVisibility(0);
        this.f76775h.setText(str);
        this.f76776i.setText(str2);
        this.f76776i.setOnClickListener(new a(bVar));
    }
}
