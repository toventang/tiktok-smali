package com.ss.android.ugc.aweme.search.middlepage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.helper.ah;
import com.ss.android.ugc.aweme.search.view.UsernameWithVerifyAndRelation;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VisitedAccountCell extends PowerCell<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121460a = new a((byte) 0);

    static {
        Covode.recordClassIndex(79131);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79132);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void l() {
        super.l();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void m() {
        super.m();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f121461a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VisitedAccountCell f121462b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f121463c;

        static {
            Covode.recordClassIndex(79133);
        }

        b(d dVar, VisitedAccountCell visitedAccountCell, d dVar2) {
            this.f121461a = dVar;
            this.f121462b = visitedAccountCell;
            this.f121463c = dVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121463c.f121487c.a(this.f121461a.f121485a, this.f121461a.f121486b, this.f121462b.getAdapterPosition());
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f121464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VisitedAccountCell f121465b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f121466c;

        static {
            Covode.recordClassIndex(79134);
        }

        c(d dVar, VisitedAccountCell visitedAccountCell, d dVar2) {
            this.f121464a = dVar;
            this.f121465b = visitedAccountCell;
            this.f121466c = dVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121466c.f121487c.a(this.f121464a.f121485a, this.f121465b.getAdapterPosition());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.awc, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(d dVar) {
        boolean z;
        d dVar2 = dVar;
        l.d(dVar2, "");
        getAdapterPosition();
        UserVerify userVerify = new UserVerify(null, dVar2.f121485a.getCustomVerify(), dVar2.f121485a.getEnterpriseVerifyReason(), null);
        View view = this.itemView;
        l.b(view, "");
        UsernameWithVerifyAndRelation usernameWithVerifyAndRelation = (UsernameWithVerifyAndRelation) view.findViewById(R.id.bt);
        View view2 = this.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        String nickname = dVar2.f121485a.getNickname();
        String relationShip = dVar2.f121485a.getRelationShip();
        if (!(context == null || nickname == null)) {
            TuxTextView tuxTextView = (TuxTextView) usernameWithVerifyAndRelation.b(R.id.f_d);
            l.b(tuxTextView, "");
            tuxTextView.setText(nickname);
            TextView textView = (TextView) usernameWithVerifyAndRelation.b(R.id.f_d);
            if (textView != null) {
                io.a(context, textView, io.a(userVerify));
            }
            String a2 = ah.a(context, relationShip);
            if (a2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) " • ");
                spannableStringBuilder.append((CharSequence) a2);
                TuxTextView tuxTextView2 = (TuxTextView) usernameWithVerifyAndRelation.b(R.id.f5p);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) usernameWithVerifyAndRelation.b(R.id.f5p);
                l.b(tuxTextView3, "");
                tuxTextView3.setText(spannableStringBuilder);
            } else {
                TuxTextView tuxTextView4 = (TuxTextView) usernameWithVerifyAndRelation.b(R.id.f5p);
                l.b(tuxTextView4, "");
                tuxTextView4.setText("");
                TuxTextView tuxTextView5 = (TuxTextView) usernameWithVerifyAndRelation.b(R.id.f5p);
                l.b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
            }
        }
        UrlModel avatarUrl = dVar2.f121485a.getAvatarUrl();
        if (avatarUrl != null) {
            v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(avatarUrl));
            View view3 = this.itemView;
            l.b(view3, "");
            a3.E = (SmartImageView) view3.findViewById(R.id.bo);
            a3.a("VisitedAccountCell").c();
        }
        this.itemView.setOnClickListener(new b(dVar2, this, dVar2));
        View view4 = this.itemView;
        l.b(view4, "");
        ((TuxIconView) view4.findViewById(R.id.bp)).setOnClickListener(new c(dVar2, this, dVar2));
    }
}
