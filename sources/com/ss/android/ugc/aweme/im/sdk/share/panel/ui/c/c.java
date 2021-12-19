package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.IIMunder16Proxy;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public IMContact f103443a;

    /* renamed from: b  reason: collision with root package name */
    public final SharePanelViewModel f103444b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f103445c;

    /* renamed from: d  reason: collision with root package name */
    private final AvatarImageView f103446d;

    /* renamed from: e  reason: collision with root package name */
    private final LinearLayout f103447e;

    final /* synthetic */ class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f103448a;

        static {
            Covode.recordClassIndex(66290);
        }

        b(h.f.a.b bVar) {
            this.f103448a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f103448a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(66288);
    }

    public final void a(IMContact iMContact) {
        l.d(iMContact, "");
        this.f103443a = iMContact;
        this.f103446d.setImageDrawable(d.a().getResources().getDrawable(2131232793));
    }

    static final class a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(66289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            if (!(com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b() == null || com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy() == null)) {
                IIMunder16Proxy under16Proxy = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b().getUnder16Proxy();
                if (under16Proxy.c() && under16Proxy != null) {
                    under16Proxy.h();
                }
            }
            SharePanelViewModel sharePanelViewModel = this.this$0.f103444b;
            if (sharePanelViewModel != null) {
                IMContact iMContact = this.this$0.f103443a;
                if (iMContact == null) {
                    l.b();
                }
                sharePanelViewModel.a(iMContact, true);
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, SharePanelViewModel sharePanelViewModel) {
        super(context);
        l.d(context, "");
        MethodCollector.i(6950);
        this.f103444b = sharePanelViewModel;
        View.inflate(context, R.layout.a8m, this);
        View findViewById = findViewById(R.id.bsp);
        l.b(findViewById, "");
        this.f103447e = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.csg);
        l.b(findViewById2, "");
        this.f103445c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.pf);
        l.b(findViewById3, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById3;
        this.f103446d = avatarImageView;
        avatarImageView.setOnClickListener(new b(new a(this)));
        MethodCollector.o(6950);
    }
}
