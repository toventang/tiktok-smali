package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxRadio;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.im.service.c.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f extends RecyclerView.ViewHolder {

    /* renamed from: g  reason: collision with root package name */
    public static final a f103473g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TextView f103474a;

    /* renamed from: b  reason: collision with root package name */
    public final AvatarImageView f103475b;

    /* renamed from: c  reason: collision with root package name */
    public IMContact f103476c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f103477d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.c f103478e;

    /* renamed from: f  reason: collision with root package name */
    public final SharePanelViewModel f103479f;

    /* renamed from: h  reason: collision with root package name */
    private final TuxRadio f103480h;

    /* renamed from: i  reason: collision with root package name */
    private final TuxButton f103481i;

    /* renamed from: j  reason: collision with root package name */
    private final ConstraintLayout f103482j;

    /* renamed from: k  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.service.share.a.b f103483k;

    final /* synthetic */ class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f103484a;

        static {
            Covode.recordClassIndex(66307);
        }

        c(h.f.a.b bVar) {
            this.f103484a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f103484a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(66304);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66305);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(boolean z) {
        this.f103480h.setChecked(z);
    }

    public final void b(boolean z) {
        int i2;
        TuxButton tuxButton = this.f103481i;
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        if (z) {
            i2 = R.string.fla;
        } else {
            i2 = R.string.fkv;
        }
        tuxButton.setText(context.getText(i2));
        this.f103481i.setEnabled(!z);
        this.f103481i.setClickable(!z);
        this.f103482j.setClickable(!z);
    }

    static final class b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(66306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy() != null) {
                IIMunder16Proxy under16Proxy = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy();
                if (under16Proxy.c()) {
                    if (under16Proxy != null) {
                        under16Proxy.h();
                    }
                    return z.f158842a;
                }
            }
            IMContact iMContact = this.this$0.f103476c;
            if (iMContact != null) {
                if (!e.c()) {
                    this.this$0.f103478e.a(iMContact);
                } else if (!this.this$0.f103477d) {
                    SharePanelViewModel sharePanelViewModel = this.this$0.f103479f;
                    l.d(iMContact, "");
                    if (!sharePanelViewModel.f103596c) {
                        sharePanelViewModel.a(iMContact, !sharePanelViewModel.b().contains(iMContact));
                    }
                }
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(View view, SharePanelViewModel sharePanelViewModel, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        super(view);
        int i2;
        l.d(view, "");
        l.d(sharePanelViewModel, "");
        this.f103479f = sharePanelViewModel;
        this.f103483k = bVar;
        this.f103478e = new com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.c(sharePanelViewModel, bVar);
        View findViewById = view.findViewById(R.id.dgn);
        l.b(findViewById, "");
        TuxRadio tuxRadio = (TuxRadio) findViewById;
        this.f103480h = tuxRadio;
        View findViewById2 = view.findViewById(R.id.zm);
        l.b(findViewById2, "");
        TuxButton tuxButton = (TuxButton) findViewById2;
        this.f103481i = tuxButton;
        View findViewById3 = view.findViewById(R.id.csg);
        l.b(findViewById3, "");
        this.f103474a = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.pf);
        l.b(findViewById4, "");
        this.f103475b = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.bsp);
        l.b(findViewById5, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
        this.f103482j = constraintLayout;
        int i3 = 8;
        if (e.a()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxButton.setVisibility(i2);
        tuxRadio.setVisibility(e.c() ? 0 : i3);
        b bVar2 = new b(this);
        tuxRadio.setClickable(false);
        tuxButton.setOnClickListener(new c(bVar2));
        constraintLayout.setOnClickListener(new c(bVar2));
    }
}
