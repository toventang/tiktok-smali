package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class as extends p {

    /* renamed from: b  reason: collision with root package name */
    public static final a f113575b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f113576a;

    /* renamed from: c  reason: collision with root package name */
    private final DmtStatusView f113577c;

    public interface b {
        static {
            Covode.recordClassIndex(73011);
        }

        void x();
    }

    static {
        Covode.recordClassIndex(73009);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73010);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ as f113578a;

        static {
            Covode.recordClassIndex(73012);
        }

        c(as asVar) {
            this.f113578a = asVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f113578a.f113576a;
            if (bVar != null) {
                bVar.x();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public as(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.aw_);
        l.b(findViewById, "");
        this.f113577c = (DmtStatusView) findViewById;
    }

    public final void a(int i2, int i3, int i4) {
        Context context = this.f113647i;
        if (context == null) {
            l.b();
        }
        MtEmptyView a2 = MtEmptyView.a(context);
        d.a c2 = new d.a(this.f113647i).a(i4).b(i2).c(i3);
        l.b(c2, "");
        if (i2 == R.string.ct && QnaService.a().enablePublicQna()) {
            c2.a(com.bytedance.ies.dmt.ui.widget.a.SOLID, R.string.cr, new c(this));
        }
        a2.setStatus(c2.f33648a);
        int c3 = androidx.core.content.b.c(this.f113647i, R.color.bx);
        Context context2 = this.f113647i;
        l.b(context2, "");
        a2.a(c3, context2.getResources().getDrawable(R.drawable.nb), (int) n.b(this.f113647i, 30.0f), 0);
        Context context3 = this.f113647i;
        if (context3 == null) {
            l.b();
        }
        d dVar = new d.a(context3).b(R.string.cso).b("").f33648a;
        DmtStatusView.a a3 = DmtStatusView.a.a(this.f113647i).a();
        if (!com.ss.android.ugc.aweme.notification.utils.l.a()) {
            a3.b(a2);
        } else {
            a3.a(dVar);
        }
        this.f113577c.setBuilder(a3);
        this.f113577c.d();
        DmtStatusView dmtStatusView = this.f113577c;
        dmtStatusView.g();
        dmtStatusView.setFocusable(false);
        dmtStatusView.setFocusableInTouchMode(false);
    }
}
