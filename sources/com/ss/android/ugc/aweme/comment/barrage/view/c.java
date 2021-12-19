package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.anchor.multi.a.b;
import com.ss.android.ugc.aweme.multi.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final SmartImageView f71731a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxTextView f71732b;

    /* renamed from: c  reason: collision with root package name */
    public final View f71733c;

    static {
        Covode.recordClassIndex(44117);
    }

    public static boolean a(d dVar) {
        l.d(dVar, "");
        com.ss.android.ugc.aweme.multi.c cVar = (com.ss.android.ugc.aweme.multi.c) n.h((List) dVar.f110896a);
        if (cVar == null || cVar.d() <= 1) {
            return false;
        }
        return true;
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.multi.c f71734a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f71735b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f71736c;

        static {
            Covode.recordClassIndex(44118);
        }

        public a(com.ss.android.ugc.aweme.multi.c cVar, c cVar2, d dVar) {
            this.f71734a = cVar;
            this.f71735b = cVar2;
            this.f71736c = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.multi.c cVar = this.f71734a;
            d dVar = this.f71736c;
            cVar.c(b.a(dVar, cVar, c.a(dVar)));
            com.ss.android.ugc.aweme.multi.c cVar2 = this.f71734a;
            d dVar2 = this.f71736c;
            cVar2.d(b.b(dVar2, cVar2, c.a(dVar2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(745);
        FrameLayout.inflate(context, R.layout.i1, this);
        View findViewById = findViewById(R.id.kb);
        l.b(findViewById, "");
        this.f71731a = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.kg);
        l.b(findViewById2, "");
        this.f71732b = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.kd);
        l.b(findViewById3, "");
        this.f71733c = findViewById3;
        MethodCollector.o(745);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }
}
