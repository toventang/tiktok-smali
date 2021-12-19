package com.ss.android.ugc.aweme.inbox.g;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.ac;
import com.ss.android.ugc.aweme.inbox.f;
import com.ss.android.ugc.aweme.inbox.widget.b;
import com.ss.android.ugc.aweme.recommend.d;
import h.f.b.l;

public final class e extends g<ac> {

    /* renamed from: g  reason: collision with root package name */
    private final d f104258g;

    static {
        Covode.recordClassIndex(66760);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104259a = new a();

        static {
            Covode.recordClassIndex(66761);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f.a(AnonymousClass1.f104260a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final void b(b bVar) {
        l.d(bVar, "");
        super.b(bVar);
        this.f104258g.a(bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar) {
        super((View) dVar);
        l.d(dVar, "");
        this.f104258g = dVar;
        dVar.setEnterFrom("notification_page");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.inbox.ad] */
    @Override // com.ss.android.ugc.aweme.inbox.g.g
    public final /* synthetic */ void a(ac acVar) {
        ac acVar2 = acVar;
        l.d(acVar2, "");
        this.f104258g.a(acVar2.f104037a, acVar2.f104038b);
        this.f104258g.setOutClickListener(a.f104259a);
    }
}
