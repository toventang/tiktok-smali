package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.g;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.List;

public final class b extends LinearLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final a f103431d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public IMContact f103432a;

    /* renamed from: b  reason: collision with root package name */
    final SharePanelViewModel f103433b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.a.b f103434c;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f103435e;

    /* renamed from: f  reason: collision with root package name */
    private final SmartAvatarImageView f103436f;

    /* renamed from: g  reason: collision with root package name */
    private final LinearLayout f103437g;

    final /* synthetic */ class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f103442a;

        static {
            Covode.recordClassIndex(66287);
        }

        d(h.f.a.b bVar) {
            this.f103442a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f103442a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(66283);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66284);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b$b  reason: collision with other inner class name */
    static final class C2629b implements com.ss.android.ugc.aweme.im.sdk.share.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f103438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SharePackage f103440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f103441d;

        static {
            Covode.recordClassIndex(66285);
        }

        C2629b(b bVar, String str, SharePackage sharePackage, List list) {
            this.f103438a = bVar;
            this.f103439b = str;
            this.f103440c = sharePackage;
            this.f103441d = list;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.a
        public final void a() {
            g.a(this.f103439b, this.f103440c, this.f103441d);
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = this.f103438a.f103434c;
            if (bVar != null) {
                SharePackage sharePackage = this.f103440c;
                this.f103441d.size();
                bVar.c(sharePackage);
            }
            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(this.f103440c, "", n.g((Collection) this.f103441d));
        }
    }

    private final void setName(IMContact iMContact) {
        TextView textView = this.f103435e;
        String displayName = iMContact.getDisplayName();
        if (displayName == null) {
            displayName = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.d.a("");
        }
        textView.setText(displayName);
    }

    public final void a(IMContact iMContact) {
        l.d(iMContact, "");
        this.f103432a = iMContact;
        setName(iMContact);
        v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(iMContact.getDisplayAvatar()));
        a2.K = true;
        a2.f39916l = R.color.f159922f;
        a2.E = this.f103436f;
        a2.c();
    }

    static final class c extends m implements h.f.a.b<View, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(66286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            if (r1 == null) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
            if (r8 == null) goto L_0x005d;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(android.view.View r18) {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, SharePanelViewModel sharePanelViewModel, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        super(context);
        l.d(context, "");
        MethodCollector.i(7208);
        this.f103433b = sharePanelViewModel;
        this.f103434c = bVar;
        View.inflate(context, R.layout.a8l, this);
        View findViewById = findViewById(R.id.bsp);
        l.b(findViewById, "");
        this.f103437g = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.csg);
        l.b(findViewById2, "");
        this.f103435e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.pf);
        l.b(findViewById3, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById3;
        this.f103436f = smartAvatarImageView;
        smartAvatarImageView.setOnClickListener(new d(new c(this)));
        MethodCollector.o(7208);
    }
}
