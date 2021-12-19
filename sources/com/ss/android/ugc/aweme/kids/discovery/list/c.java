package com.ss.android.ugc.aweme.kids.discovery.list;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.common.c.f;
import com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    static final IReportAwemeManager f106502d = ReportAwemeManager.a();

    /* renamed from: e  reason: collision with root package name */
    public static final a f106503e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f106504a;

    /* renamed from: b  reason: collision with root package name */
    final Context f106505b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f106506c = true;

    public static final class a {
        static {
            Covode.recordClassIndex(68053);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(68052);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.discovery.c.c f106508b;

        static {
            Covode.recordClassIndex(68054);
        }

        b(c cVar, com.ss.android.ugc.aweme.kids.discovery.c.c cVar2) {
            this.f106507a = cVar;
            this.f106508b = cVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f106508b.f106433a != null) {
                c cVar = this.f106507a;
                com.ss.android.ugc.aweme.kids.discovery.c.c cVar2 = this.f106508b;
                f.a("click_view_more_category", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "discovery").a("exit_method", "click_see_more").a("category_id", cVar2.f106433a).a());
                View view2 = cVar.itemView;
                l.b(view2, "");
                SmartRouter.buildRoute(view2.getContext(), "//kids/discovery/gallery").withParam("title", cVar2.f106434b).withParam("challenge_id", cVar2.f106433a).withParam("feed_type", cVar2.f106435c).withParam("mob_enter_from", "click_see_more").open();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(view);
        l.d(view, "");
        View view2 = this.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        l.b(context, "");
        this.f106505b = context;
        View view3 = this.itemView;
        l.b(view3, "");
        Context context2 = view3.getContext();
        l.b(context2, "");
        int color = context2.getResources().getColor(R.color.f159928l);
        View view4 = this.itemView;
        l.b(view4, "");
        RecyclerView recyclerView = (RecyclerView) view4.findViewById(R.id.drj);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        View view5 = this.itemView;
        l.b(view5, "");
        View view6 = this.itemView;
        l.b(view6, "");
        ((RecyclerView) view5.findViewById(R.id.drj)).a(new com.ss.android.ugc.aweme.kids.discovery.a.b(color, (int) n.b(view6.getContext(), 1.0f)));
    }
}
