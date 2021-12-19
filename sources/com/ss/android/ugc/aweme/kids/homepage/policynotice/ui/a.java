package com.ss.android.ugc.aweme.kids.homepage.policynotice.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.dialog.p;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.cg;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

public final class a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.dialog.a f106650a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f106651b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f106652c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106653d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f106654e = new Handler();

    static {
        Covode.recordClassIndex(68150);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(89, new org.greenrobot.eventbus.g(a.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(68152);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.ies.dmt.ui.dialog.a aVar = this.this$0.f106650a;
            if (aVar != null) {
                aVar.d();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(68154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.ies.dmt.ui.dialog.a aVar = this.this$0.f106650a;
            if (aVar != null) {
                aVar.d();
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106661a;

        static {
            Covode.recordClassIndex(68161);
        }

        k(a aVar) {
            this.f106661a = aVar;
        }

        public final void run() {
            com.bytedance.ies.dmt.ui.dialog.a aVar = this.f106661a.f106650a;
            if (aVar == null || aVar.a()) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                l.b(O, "");
                if (O.o()) {
                    v.O().B();
                    this.f106661a.f106651b = true;
                    return;
                }
                this.f106661a.b();
            }
        }
    }

    public final void b() {
        com.ss.android.ugc.aweme.video.i O = v.O();
        l.b(O, "");
        if (O.o()) {
            v.O().B();
            this.f106651b = true;
            return;
        }
        this.f106654e.postDelayed(new k(this), 1000);
    }

    public final void a() {
        cg.a(this);
        a.C0731a aVar = new a.C0731a(this.f106652c);
        aVar.f33401a = this.f106653d.getTitle();
        DmtTextView dmtTextView = new DmtTextView(this.f106652c);
        Context context = dmtTextView.getContext();
        l.b(context, "");
        dmtTextView.setText(com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(context, this.f106653d.getBody(), this.f106653d.getPolicyLinkList(), new c(this), new d(this)));
        dmtTextView.setHighlightColor(androidx.core.content.b.c(dmtTextView.getContext(), R.color.c9));
        dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
        dmtTextView.setGravity(17);
        aVar.J = dmtTextView;
        aVar.p = new h(this);
        aVar.M = false;
        aVar.n = new i(this);
        a.C0731a a2 = aVar.a(this.f106653d.getActions().get(0).f106622a, (DialogInterface.OnClickListener) new j(this), true);
        if (l.a((Object) this.f106653d.getFirstButtonHighlight(), (Object) true)) {
            a2.F = true;
            a2.E = true;
        }
        if (!l.a((Object) this.f106653d.isSubPopUp(), (Object) true)) {
            a2.M = false;
        }
        if (this.f106653d.getActions().size() > 1) {
            a2.b(this.f106653d.getActions().get(1).f106622a, (DialogInterface.OnClickListener) new e(this), true);
        }
        if (this.f106653d.getActions().size() > 2) {
            a2.E = true;
            a2.c(this.f106653d.getActions().get(2).f106622a, new f(this), true);
        }
        if (!TextUtils.isEmpty(this.f106653d.getIcon_url())) {
            SmartImageView smartImageView = new SmartImageView(this.f106652c);
            smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(n.a(this.f106653d.getIcon_url()));
            urlModel.setWidth(com.ss.android.ugc.aweme.base.utils.n.a(48.0d));
            urlModel.setHeight(com.ss.android.ugc.aweme.base.utils.n.a(48.0d));
            com.bytedance.lighten.a.v b2 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).b(em.a(201));
            b2.f39907c = true;
            b2.E = smartImageView;
            b2.a(new g(smartImageView));
            a2.a(smartImageView, 48, 48);
        }
        com.bytedance.ies.dmt.ui.dialog.a a3 = a2.a();
        this.f106650a = a3;
        if (a3 != null) {
            a3.c();
        }
    }

    public static final class g extends com.bytedance.lighten.a.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SmartImageView f106657a;

        static {
            Covode.recordClassIndex(68157);
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
        }

        g(SmartImageView smartImageView) {
            this.f106657a = smartImageView;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            this.f106657a.setImageResource(2131232963);
        }
    }

    public static final class h implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106658a;

        static {
            Covode.recordClassIndex(68158);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(a aVar) {
            this.f106658a = aVar;
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.p.a
        public final void a(boolean z) {
            if (z) {
                this.f106658a.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.a$a  reason: collision with other inner class name */
    public static final class C2726a extends m implements h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(68151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2726a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.b(bVar2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(68153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.b(bVar2);
            return z.f158842a;
        }
    }

    public final void b(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(this.f106653d, bVar);
        com.bytedance.ies.dmt.ui.dialog.a aVar = this.f106650a;
        if (aVar != null) {
            aVar.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106659a;

        static {
            Covode.recordClassIndex(68159);
        }

        i(a aVar) {
            this.f106659a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            a aVar = this.f106659a;
            cg.b(aVar);
            if (aVar.f106651b) {
                v.O().y();
                aVar.f106651b = false;
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        l.d(bVar, "");
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(bVar, this.f106652c, new C2726a(this), new b(this));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a aVar) {
        com.bytedance.ies.dmt.ui.dialog.a aVar2;
        l.d(aVar, "");
        if (TextUtils.equals(aVar.f106614b.optString("eventName"), "cancel_post_success") && (aVar2 = this.f106650a) != null) {
            aVar2.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106655a;

        static {
            Covode.recordClassIndex(68155);
        }

        e(a aVar) {
            this.f106655a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            a aVar = this.f106655a;
            aVar.a(aVar.f106653d.getActions().get(1));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106656a;

        static {
            Covode.recordClassIndex(68156);
        }

        f(a aVar) {
            this.f106656a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            a aVar = this.f106656a;
            aVar.a(aVar.f106653d.getActions().get(2));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f106660a;

        static {
            Covode.recordClassIndex(68160);
        }

        j(a aVar) {
            this.f106660a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            a aVar = this.f106660a;
            aVar.a(aVar.f106653d.getActions().get(0));
        }
    }

    public a(Context context, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar) {
        l.d(context, "");
        l.d(aVar, "");
        this.f106652c = context;
        this.f106653d = aVar;
    }
}
