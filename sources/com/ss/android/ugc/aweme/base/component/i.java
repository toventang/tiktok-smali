package com.ss.android.ugc.aweme.base.component;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final User f68085a;

    /* renamed from: b  reason: collision with root package name */
    public final int f68086b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f68087c = h.i.a((h.f.a.a) new f(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f68088d = h.i.a((h.f.a.a) new g(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f68089e = h.i.a((h.f.a.a) new h(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f68090f = h.i.a((h.f.a.a) new d(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f68091g = h.i.a((h.f.a.a) new e(this));

    static {
        Covode.recordClassIndex(41940);
    }

    private final TextView b() {
        return (TextView) this.f68090f.getValue();
    }

    static final class d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41944);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.xz);
        }
    }

    static final class e extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.ewp);
        }
    }

    static final class f extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.bv1);
        }
    }

    static final class g extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.bv2);
        }
    }

    static final class h extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(41948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.ewr);
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f68092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f68093b;

        static {
            Covode.recordClassIndex(41941);
        }

        a(i iVar, TextView textView) {
            this.f68092a = iVar;
            this.f68093b = textView;
        }

        public final void run() {
            float a2 = n.a(this.f68092a.getContext(), 12.0f);
            float a3 = n.a(this.f68092a.getContext(), 1.0f);
            int width = (this.f68093b.getWidth() - this.f68093b.getPaddingLeft()) - this.f68093b.getPaddingRight();
            float measureText = this.f68093b.getPaint().measureText(this.f68093b.getText().toString());
            float textSize = this.f68093b.getTextSize();
            while (measureText > ((float) width) && textSize > a2) {
                this.f68093b.setTextSize(0, textSize - a3);
                textSize = this.f68093b.getTextSize();
                measureText = this.f68093b.getPaint().measureText(this.f68093b.getText().toString());
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f68094a;

        static {
            Covode.recordClassIndex(41942);
        }

        b(i iVar) {
            this.f68094a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f68094a.dismiss();
            r.a("close_modify_username", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "modify_username_notify").a("click_method", "button").f66730a);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f68095a;

        static {
            Covode.recordClassIndex(41943);
        }

        c(i iVar) {
            this.f68095a = iVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f68095a.dismiss();
            Context context = this.f68095a.getContext();
            l.b(context, "");
            ProfileEditActivity.a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), new ap().a("need_focus_id_input", 2).f142646a);
            r.a("click_modify_username", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "modify_username_notify").f66730a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        UrlModel urlModel;
        super.onCreate(bundle);
        setContentView(R.layout.afv);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        User user = this.f68085a;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        v a2 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
        e.a aVar = new e.a();
        aVar.f39827a = true;
        a2.w = aVar.a();
        a2.E = (SmartImageView) this.f68087c.getValue();
        a2.c();
        ((TextView) this.f68089e.getValue()).setText("@" + in.b(user));
        ((ImageView) this.f68088d.getValue()).setOnClickListener(new b(this));
        TextView b2 = b();
        b2.post(new a(this, b2));
        b().setOnClickListener(new c(this));
        if (this.f68086b == 1) {
            ((TextView) this.f68091g.getValue()).setText(getContext().getString(R.string.aax));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, User user) {
        super(context, R.style.fk, true, false, false);
        l.d(context, "");
        this.f68085a = user;
    }
}
