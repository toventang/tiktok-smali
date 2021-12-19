package com.ss.android.ugc.aweme.qainvitation.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class b extends RecyclerView.a<com.bytedance.ies.dmt.ui.a.a<IMUser>> {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends IMUser> f119085a;

    static {
        Covode.recordClassIndex(77345);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.bytedance.ies.dmt.ui.a.a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    private /* synthetic */ b() {
        this(z.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f119085a.size();
    }

    public b(List<? extends IMUser> list) {
        l.d(list, "");
        this.f119085a = list;
    }

    public final class a extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public AvatarImageWithVerify f119086a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f119087b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f119088c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f119089d;

        /* renamed from: e  reason: collision with root package name */
        public final View f119090e;

        /* renamed from: f  reason: collision with root package name */
        public final b f119091f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ b f119092g;

        static {
            Covode.recordClassIndex(77346);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.c.b$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3070a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119093a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IMUser f119094b;

            static {
                Covode.recordClassIndex(77347);
            }

            View$OnClickListenerC3070a(a aVar, IMUser iMUser) {
                this.f119093a = aVar;
                this.f119094b = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                View view2 = this.f119093a.itemView;
                l.b(view2, "");
                SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/" + this.f119094b.getUid()).withParam("sec_uid", this.f119094b.getSecUid()).open();
                r.a("enter_personal_detail", new d().a("enter_from", "qa_personal_profile").f66730a);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.bytedance.ies.dmt.ui.a.a
        public final /* synthetic */ void a(IMUser iMUser, int i2) {
            IMUser iMUser2 = iMUser;
            l.d(iMUser2, "");
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            view.setBackground(c.c(view2.getContext()));
            User c2 = com.ss.android.ugc.aweme.qainvitation.g.a.c(iMUser2);
            this.f119086a.setUserData(new UserVerify(c2.getAvatarThumb(), c2.getCustomVerify(), c2.getEnterpriseVerifyReason(), Integer.valueOf(c2.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f119086a;
            View view3 = this.itemView;
            l.b(view3, "");
            com.ss.android.ugc.aweme.qainvitation.g.a.a(avatarImageWithVerify, view3.getContext(), iMUser2.getCustomVerify(), iMUser2.getEnterpriseVerifyReason(), this.f119087b);
            com.ss.android.ugc.aweme.qainvitation.g.a.a(iMUser2, this.f119087b, this.f119088c);
            if (iMUser2.getFollowStatus() == 2) {
                this.f119089d.setVisibility(0);
                StringBuilder sb = new StringBuilder(" · ");
                View view4 = this.itemView;
                l.b(view4, "");
                this.f119089d.setText(sb.append(view4.getContext().getString(R.string.e3h)).toString());
            } else {
                this.f119089d.setVisibility(4);
            }
            this.f119090e.setOnClickListener(new View$OnClickListenerC3070a(this, iMUser2));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view, b bVar2) {
            super(view);
            l.d(view, "");
            l.d(bVar2, "");
            this.f119092g = bVar;
            this.f119090e = view;
            this.f119091f = bVar2;
            View findViewById = view.findViewById(R.id.or);
            l.b(findViewById, "");
            this.f119086a = (AvatarImageWithVerify) findViewById;
            View findViewById2 = view.findViewById(R.id.cs_);
            l.b(findViewById2, "");
            this.f119087b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ak7);
            l.b(findViewById3, "");
            this.f119088c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.fcs);
            l.b(findViewById4, "");
            this.f119089d = (TextView) findViewById4;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.bytedance.ies.dmt.ui.a.a<IMUser> aVar, int i2) {
        com.bytedance.ies.dmt.ui.a.a<IMUser> aVar2 = aVar;
        l.d(aVar2, "");
        aVar2.a(this.f119085a.get(i2), i2);
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5473);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.arr, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(bVar, a3, bVar);
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
        MethodCollector.o(5473);
        return aVar;
    }
}
