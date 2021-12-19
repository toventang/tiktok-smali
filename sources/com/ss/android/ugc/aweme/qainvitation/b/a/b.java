package com.ss.android.ugc.aweme.qainvitation.b.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class b extends RecyclerView.a<com.bytedance.ies.dmt.ui.a.a<IMUser>> {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.qainvitation.b.b f118980a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends IMUser> f118981b;

    static {
        Covode.recordClassIndex(77309);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.bytedance.ies.dmt.ui.a.a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f118981b.size();
    }

    public /* synthetic */ b(com.ss.android.ugc.aweme.qainvitation.b.b bVar) {
        this(bVar, z.INSTANCE);
    }

    public final void a(List<? extends IMUser> list) {
        l.d(list, "");
        this.f118981b = list;
    }

    public final class a extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public final View f118982a;

        /* renamed from: b  reason: collision with root package name */
        public final h.f.a.b<IMUser, h.z> f118983b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f118984c;

        static {
            Covode.recordClassIndex(77310);
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.b$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3056a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f118985a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IMUser f118986b;

            static {
                Covode.recordClassIndex(77311);
            }

            View$OnClickListenerC3056a(a aVar, IMUser iMUser) {
                this.f118985a = aVar;
                this.f118986b = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f118985a.f118983b.invoke(this.f118986b);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.ies.dmt.ui.a.a
        public final /* synthetic */ void a(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            if (iMUser2 != null) {
                View view = this.itemView;
                l.b(view, "");
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.csg);
                l.b(tuxTextView, "");
                tuxTextView.setText(com.ss.android.ugc.aweme.qainvitation.g.a.a(iMUser2));
                this.itemView.setOnClickListener(new View$OnClickListenerC3056a(this, iMUser2));
                View view2 = this.itemView;
                l.b(view2, "");
                e.a((RemoteImageView) view2.findViewById(R.id.p4), iMUser2.getDisplayAvatar());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.IMUser, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view, h.f.a.b<? super IMUser, h.z> bVar2) {
            super(view);
            l.d(view, "");
            l.d(bVar2, "");
            this.f118984c = bVar;
            this.f118982a = view;
            this.f118983b = bVar2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.b$b  reason: collision with other inner class name */
    public static final class C3057b extends m implements h.f.a.b<IMUser, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(77312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3057b(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            l.d(iMUser2, "");
            this.this$0.f118980a.f119031j.f119040f.indexOf(iMUser2);
            this.this$0.f118980a.a(iMUser2);
            return h.z.f158842a;
        }
    }

    private b(com.ss.android.ugc.aweme.qainvitation.b.b bVar, List<? extends IMUser> list) {
        l.d(bVar, "");
        l.d(list, "");
        this.f118980a = bVar;
        this.f118981b = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.bytedance.ies.dmt.ui.a.a<IMUser> aVar, int i2) {
        com.bytedance.ies.dmt.ui.a.a<IMUser> aVar2 = aVar;
        l.d(aVar2, "");
        aVar2.a(this.f118981b.get(i2));
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5442);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.arv, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(bVar, a3, new C3057b(bVar));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(5442);
        return aVar;
    }
}
