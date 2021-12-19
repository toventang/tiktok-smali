package com.ss.android.ugc.aweme.social.widget.card.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends a {
    static {
        Covode.recordClassIndex(87652);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133971a;

        static {
            Covode.recordClassIndex(87653);
        }

        a(c cVar) {
            this.f133971a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f133971a.getContext();
            if (!(context instanceof e)) {
                context = null;
            }
            e eVar = (e) context;
            if (eVar != null) {
                IRecommendUsersServiceImpl.j().a(eVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.social.widget.a aVar) {
        super(aVar.f133712a, (byte) 0);
        l.d(aVar, "");
        setupView(aVar.a());
        getInfoIconView().setOnClickListener(new a(this));
    }

    private final void setupView(Context context) {
        MethodCollector.i(12822);
        LayoutInflater.from(context).inflate(R.layout.b0z, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        Integer valueOf = Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        i.b(this, null, valueOf, null, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics()))), false, 21);
        setGravity(16);
        View findViewById = findViewById(R.id.dil);
        l.b(findViewById, "");
        setTitleTextView((TuxTextView) findViewById);
        View findViewById2 = findViewById(R.id.boc);
        l.b(findViewById2, "");
        setInfoIconView((TuxIconView) findViewById2);
        MethodCollector.o(12822);
    }
}
