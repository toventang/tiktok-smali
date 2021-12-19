package com.ss.android.ugc.aweme.qainvitation.b.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.b.b;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.f.b.z;
import java.util.List;

public final class a extends RecyclerView.a<com.bytedance.ies.dmt.ui.a.a<IMUser>> {

    /* renamed from: a  reason: collision with root package name */
    public b.a.C3062a f118964a;

    /* renamed from: b  reason: collision with root package name */
    public final b f118965b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends IMUser> f118966c;

    static {
        Covode.recordClassIndex(77305);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.bytedance.ies.dmt.ui.a.a<IMUser> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f118966c.size();
    }

    public /* synthetic */ a(b bVar) {
        this(bVar, z.INSTANCE);
    }

    /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a$a  reason: collision with other inner class name */
    public final class C3054a extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public TextView f118967a;

        /* renamed from: b  reason: collision with root package name */
        public AvatarImageWithVerify f118968b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f118969c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f118970d;

        /* renamed from: e  reason: collision with root package name */
        public TuxIconView f118971e;

        /* renamed from: f  reason: collision with root package name */
        public final View f118972f;

        /* renamed from: g  reason: collision with root package name */
        public final a f118973g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f118974h;

        static {
            Covode.recordClassIndex(77306);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a$a$b */
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3054a f118979a;

            static {
                Covode.recordClassIndex(77308);
            }

            b(C3054a aVar) {
                this.f118979a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                l.b(view, "");
                String string = view.getContext().getString(R.string.f4k, this.f118979a.f118969c.getText());
                l.b(string, "");
                new com.bytedance.tux.g.b(this.f118979a.f118972f).a(string).a(3000L).b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3055a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3054a f118975a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ IMUser f118976b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.e f118977c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f118978d;

            static {
                Covode.recordClassIndex(77307);
            }

            View$OnClickListenerC3055a(C3054a aVar, IMUser iMUser, z.e eVar, int i2) {
                this.f118975a = aVar;
                this.f118976b = iMUser;
                this.f118977c = eVar;
                this.f118978d = i2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f118975a.f118971e.isSelected() || !this.f118975a.f118974h.f118965b.a()) {
                    this.f118975a.f118971e.setSelected(true ^ this.f118975a.f118971e.isSelected());
                    if (this.f118975a.f118971e.isSelected()) {
                        this.f118975a.f118974h.f118965b.a(this.f118976b, this.f118977c.element);
                    } else {
                        this.f118975a.f118974h.f118965b.a(this.f118976b);
                    }
                } else {
                    new com.bytedance.tux.g.b(this.f118975a.f118972f).a(this.f118975a.f118972f.getContext().getString(R.string.f4i, String.valueOf(this.f118975a.f118974h.f118965b.b()))).a(3000L).b();
                }
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
            boolean z = false;
            this.f118967a.setVisibility(0);
            com.ss.android.ugc.aweme.qainvitation.g.a.a(iMUser2, this.f118969c, this.f118970d);
            z.e eVar = new z.e();
            eVar.element = (T) com.ss.android.ugc.aweme.qainvitation.a.a.Recent;
            b.a.C3062a aVar = this.f118973g.f118964a;
            if (aVar != null) {
                int size = aVar.f119035a.size() + aVar.f119036b.size() + aVar.f119037c.size();
                int size2 = aVar.f119035a.size();
                int size3 = aVar.f119035a.size() + aVar.f119036b.size();
                if (i2 >= size2 && (!aVar.f119036b.isEmpty()) && i2 < size3) {
                    eVar.element = (T) com.ss.android.ugc.aweme.qainvitation.a.a.Recent;
                } else if (i2 >= size3 && (!aVar.f119037c.isEmpty()) && i2 < size) {
                    eVar.element = (T) com.ss.android.ugc.aweme.qainvitation.a.a.Friends;
                } else if (i2 >= size && (!aVar.f119038d.isEmpty())) {
                    eVar.element = (T) com.ss.android.ugc.aweme.qainvitation.a.a.Following;
                }
                if (i2 != 0 || !(!aVar.f119035a.isEmpty())) {
                    if (i2 == size2 && (!aVar.f119036b.isEmpty())) {
                        this.f118967a.setText(R.string.ch_);
                    } else if (i2 == size3 && (!aVar.f119037c.isEmpty())) {
                        this.f118967a.setText(R.string.c22);
                        eVar.element = (T) com.ss.android.ugc.aweme.qainvitation.a.a.Friends;
                    } else if (i2 == size && (!aVar.f119038d.isEmpty())) {
                        TextView textView = this.f118967a;
                        View view3 = this.itemView;
                        l.b(view3, "");
                        textView.setText(view3.getContext().getString(R.string.f4z));
                        eVar.element = (T) com.ss.android.ugc.aweme.qainvitation.a.a.Following;
                    }
                }
                this.f118967a.setVisibility(8);
            }
            if (!l.a((Object) iMUser2.isUserEnabledQAInvite(), (Object) false)) {
                FrameLayout frameLayout = (FrameLayout) this.f118972f.findViewById(R.id.fd7);
                l.b(frameLayout, "");
                frameLayout.setAlpha(1.0f);
                ((FrameLayout) this.f118972f.findViewById(R.id.fd7)).setOnClickListener(new View$OnClickListenerC3055a(this, iMUser2, eVar, i2));
            } else {
                FrameLayout frameLayout2 = (FrameLayout) this.f118972f.findViewById(R.id.fd7);
                l.b(frameLayout2, "");
                frameLayout2.setAlpha(0.34f);
                ((FrameLayout) this.f118972f.findViewById(R.id.fd7)).setOnClickListener(new b(this));
            }
            User c2 = com.ss.android.ugc.aweme.qainvitation.g.a.c(iMUser2);
            this.f118968b.setUserData(new UserVerify(c2.getAvatarThumb(), c2.getCustomVerify(), c2.getEnterpriseVerifyReason(), Integer.valueOf(c2.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f118968b;
            View view4 = this.itemView;
            l.b(view4, "");
            com.ss.android.ugc.aweme.qainvitation.g.a.a(avatarImageWithVerify, view4.getContext(), iMUser2.getCustomVerify(), iMUser2.getEnterpriseVerifyReason(), this.f118969c);
            this.f118971e.setImageResource(R.drawable.bar);
            TuxIconView tuxIconView = this.f118971e;
            if (this.f118974h.f118965b.b(iMUser2) != null) {
                z = true;
            }
            tuxIconView.setSelected(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3054a(a aVar, View view, a aVar2) {
            super(view);
            l.d(view, "");
            l.d(aVar2, "");
            this.f118974h = aVar;
            this.f118972f = view;
            this.f118973g = aVar2;
            View findViewById = view.findViewById(R.id.dwp);
            l.b(findViewById, "");
            this.f118967a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.or);
            l.b(findViewById2, "");
            this.f118968b = (AvatarImageWithVerify) findViewById2;
            View findViewById3 = view.findViewById(R.id.cs_);
            l.b(findViewById3, "");
            this.f118969c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ak7);
            l.b(findViewById4, "");
            this.f118970d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.a52);
            l.b(findViewById5, "");
            this.f118971e = (TuxIconView) findViewById5;
        }
    }

    private a(b bVar, List<? extends IMUser> list) {
        l.d(bVar, "");
        l.d(list, "");
        this.f118965b = bVar;
        this.f118966c = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.dmt.ui.a.a<com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.bytedance.ies.dmt.ui.a.a<IMUser> aVar, int i2) {
        com.bytedance.ies.dmt.ui.a.a<IMUser> aVar2 = aVar;
        l.d(aVar2, "");
        aVar2.a(this.f118966c.get(i2), i2);
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5700);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.arw, viewGroup, false);
        l.b(a3, "");
        C3054a aVar2 = new C3054a(aVar, a3, aVar);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(5700);
        return aVar2;
    }
}
