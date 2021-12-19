package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.SmartRoundImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.SearchEffect;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.k.ba;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.UUID;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: f  reason: collision with root package name */
    public static final a f80629f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TextView f80630a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f80631b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f80632c;

    /* renamed from: d  reason: collision with root package name */
    public final SmartRoundImageView f80633d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f80634e;

    static {
        Covode.recordClassIndex(50151);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50152);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1880b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f80635a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchEffect f80636b;

        static {
            Covode.recordClassIndex(50153);
        }

        public View$OnClickListenerC1880b(b bVar, SearchEffect searchEffect) {
            this.f80635a = bVar;
            this.f80636b = searchEffect;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("enter_prop_detail", new d().a("enter_method", "general_search_aladdin_multiple").a("enter_from", "search_result").a("prop_id", this.f80636b.id()).f66730a);
            View view2 = this.f80635a.itemView;
            l.b(view2, "");
            SmartRouter.buildRoute(view2.getContext(), "//stickers/detail/" + this.f80636b.id()).open();
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f80637a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchEffect f80638b;

        static {
            Covode.recordClassIndex(50154);
        }

        public c(b bVar, SearchEffect searchEffect) {
            this.f80637a = bVar;
            this.f80638b = searchEffect;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            final RecordConfig.Builder enterFrom = new RecordConfig.Builder().sticker(this.f80638b.id()).creationId(uuid).enterFrom("search_result");
            IExternalService a2 = AVExternalServiceImpl.a();
            View view2 = this.f80637a.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            l.b(context, "");
            a2.asyncService(context, "prop_page", new IExternalService.ServiceLoadCallback(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.viewholder.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f80639a;

                static {
                    Covode.recordClassIndex(50155);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                {
                    this.f80639a = r1;
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    l.d(asyncAVService, "");
                    IRecordService recordService = asyncAVService.uiService().recordService();
                    View view = this.f80639a.f80637a.itemView;
                    l.b(view, "");
                    Context context = view.getContext();
                    l.b(context, "");
                    recordService.startRecord(context, enterFrom.build());
                }
            });
            ((ba) new ba().p("click_prop_publish").o("search_result")).t("prop_page").u("prop_page").s(this.f80638b.id()).r(uuid).f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.title);
        l.b(findViewById, "");
        this.f80630a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.fcn);
        l.b(findViewById2, "");
        this.f80631b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ak7);
        l.b(findViewById3, "");
        this.f80632c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.agf);
        l.b(findViewById4, "");
        this.f80633d = (SmartRoundImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.a1j);
        l.b(findViewById5, "");
        this.f80634e = (FrameLayout) findViewById5;
    }
}
