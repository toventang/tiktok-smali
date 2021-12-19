package com.ss.android.ugc.aweme.account.login.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.account.login.v2.base.c implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f63391a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f63392b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f63393c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f63394d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f63395e = i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f63396j = i.a((h.f.a.a) new g(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f63397k = i.a((h.f.a.a) new h(this));

    /* renamed from: l  reason: collision with root package name */
    private final h.h f63398l = i.a((h.f.a.a) d.f63403a);

    /* renamed from: m  reason: collision with root package name */
    private HashMap f63399m;

    static {
        Covode.recordClassIndex(39068);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final View c(int i2) {
        if (this.f63399m == null) {
            this.f63399m = new HashMap();
        }
        View view = (View) this.f63399m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63399m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final WeakHandler e() {
        return (WeakHandler) this.f63395e.getValue();
    }

    public final String g() {
        return (String) this.f63396j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void h() {
        HashMap hashMap = this.f63399m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final String i() {
        return (String) this.f63397k.getValue();
    }

    public final HashSet<String> j() {
        return (HashSet) this.f63398l.getValue();
    }

    static final class c extends m implements h.f.a.a<WeakHandler> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHandler invoke() {
            return new WeakHandler(this.this$0);
        }
    }

    static final class d extends m implements h.f.a.a<HashSet<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63403a = new d();

        static {
            Covode.recordClassIndex(39072);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashSet<String> invoke() {
            return new HashSet();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f63392b = true;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final boolean q() {
        if (!this.f63391a) {
            a(false);
            this.f63391a = true;
        }
        return false;
    }

    static final class g extends m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("extra_previous_page")) == null) {
                return "";
            }
            return string;
        }
    }

    static final class h extends m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(39076);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null || (string = arguments.getString("previous_page_location")) == null) {
                return "";
            }
            return string;
        }
    }

    public final void k() {
        m();
        C1409b bVar = new C1409b(this);
        b(bVar);
        a(bVar);
        z().a(c.f63406a, bVar);
    }

    private void m() {
        DmtStatusView dmtStatusView = (DmtStatusView) c(R.id.e_o);
        l.b(dmtStatusView, "");
        if (dmtStatusView.getVisibility() != 0) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) c(R.id.e_o);
            l.b(dmtStatusView2, "");
            dmtStatusView2.setVisibility(0);
        }
        ((DmtStatusView) c(R.id.e_o)).f();
    }

    public final void l() {
        DmtStatusView dmtStatusView = (DmtStatusView) c(R.id.e_o);
        l.b(dmtStatusView, "");
        if (dmtStatusView.getVisibility() != 8) {
            DmtStatusView dmtStatusView2 = (DmtStatusView) c(R.id.e_o);
            l.b(dmtStatusView2, "");
            dmtStatusView2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        boolean z = true;
        this.f63393c = true;
        e().removeMessages(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        super.onDestroyView();
        ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList = this.u;
        if (arrayList == null || arrayList.size() <= 0) {
            z = false;
        }
        this.f63394d = z;
        h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.d.b$b  reason: collision with other inner class name */
    public static final class C1409b extends com.bytedance.sdk.a.a.b.e {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f63402c;

        static {
            Covode.recordClassIndex(39070);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1409b(b bVar) {
            this.f63402c = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.h hVar) {
            com.bytedance.sdk.a.a.d.h hVar2 = hVar;
            l.d(hVar2, "");
            if (!this.f63402c.ab_()) {
                r.a("account_debug_info", new com.ss.android.ugc.aweme.app.f.d().a("info", "GetQRCodeCallback onSuccess" + this.f43069a + ' ' + this.f63402c.a(this)).f66730a);
                return;
            }
            this.f63402c.l();
            String str = hVar2.f43096j;
            l.b(str, "");
            ((ImageView) this.f63402c.c(R.id.bt3)).setImageBitmap(b.b(str));
            b bVar = this.f63402c;
            String str2 = hVar2.f43098l;
            l.b(str2, "");
            bVar.a(str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.h hVar, int i2) {
            String str;
            com.bytedance.sdk.a.a.d.h hVar2 = hVar;
            if (!this.f63402c.ab_()) {
                r.a("account_debug_info", new com.ss.android.ugc.aweme.app.f.d().a("info", "GetQRCodeCallback onError" + this.f43069a + ' ' + this.f63402c.a(this)).f66730a);
                return;
            }
            ((DmtStatusView) this.f63402c.c(R.id.e_o)).h();
            b bVar = this.f63402c;
            if (hVar2 == null || (str = hVar2.f43075f) == null) {
                str = "";
            }
            bVar.a(i2, str);
        }
    }

    public static final class f implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f63405a;

        static {
            Covode.recordClassIndex(39074);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(b bVar) {
            this.f63405a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            androidx.fragment.app.e activity = this.f63405a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void b_(int i2) {
        if (i2 == 1) {
            m();
        } else if (i2 == 0) {
            l();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f63404a;

        static {
            Covode.recordClassIndex(39073);
        }

        e(b bVar) {
            this.f63404a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f63404a.c(R.id.e_o);
            l.b(dmtStatusView, "");
            if (dmtStatusView.l()) {
                this.f63404a.k();
            }
        }
    }

    public static Bitmap b(String str) {
        MethodCollector.i(8985);
        l.d(str, "");
        byte[] decode = Base64.decode(str, 0);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
        l.b(decodeByteArray, "");
        MethodCollector.o(8985);
        return decodeByteArray;
    }

    public final void a(String str) {
        a aVar = new a(this, str);
        b(aVar);
        z().a(str, c.f63406a, aVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 2000) {
            e().removeMessages(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            if (ab_()) {
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                if (com.bytedance.ies.ugc.appcontext.f.f34637l) {
                    WeakHandler e2 = e();
                    Message obtain = Message.obtain();
                    obtain.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                    obtain.obj = str;
                    e2.sendMessageDelayed(obtain, 2300);
                    return;
                }
                a(str);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.a("login_qr_page_show", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", g()).a("previous_page_location", i()).f66730a);
    }

    public final <T extends com.bytedance.sdk.a.a.a.b> String a(com.bytedance.sdk.a.a.a.a<T> aVar) {
        int i2;
        l.d(aVar, "");
        try {
            StringBuilder append = new StringBuilder("hdv:").append(this.f63393c).append(" hd:").append(this.f63392b).append(" callBackList size:");
            ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList = this.u;
            boolean z = false;
            if (arrayList != null) {
                i2 = arrayList.size();
            } else {
                i2 = 0;
            }
            StringBuilder append2 = append.append(i2).append("  contain:");
            ArrayList<com.bytedance.sdk.a.a.a.a<? extends com.bytedance.sdk.a.a.a.b>> arrayList2 = this.u;
            if (arrayList2 != null) {
                z = arrayList2.contains(aVar);
            }
            return append2.append(z).toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    public final void a(boolean z) {
        r.a("login_qr_page_time", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", g()).a("previous_page_location", i()).a("stay_time", System.currentTimeMillis() - this.t).a("is_success", z ? 1 : 0).f66730a);
    }

    public static final class a extends com.bytedance.sdk.a.a.b.c {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f63400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63401d;

        static {
            Covode.recordClassIndex(39069);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void e(com.bytedance.sdk.a.a.d.c cVar) {
            com.bytedance.sdk.a.a.d.c cVar2 = cVar;
            l.d(cVar2, "");
            if (l.a((Object) cVar2.y, (Object) "confirmed")) {
                this.f63400c.a(true);
                this.f63400c.f63391a = true;
                v.a(false, "qr_switch_new_device", (com.ss.android.ugc.aweme.account.login.v2.base.g) this.f63400c, cVar2.f43082j, ag.a(new p("previous_page", this.f63400c.g()), new p("previous_page_location", this.f63400c.i())), false, 32);
                b bVar = this.f63400c;
                j A = bVar.A();
                k V_ = this.f63400c.V_();
                com.bytedance.sdk.a.n.a aVar = cVar2.f43082j;
                l.b(aVar, "");
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(bVar, A, V_, aVar);
                return;
            }
            long j2 = 1500;
            if (!l.a((Object) cVar2.y, (Object) "expired") && !l.a((Object) cVar2.y, (Object) "refuse")) {
                if (l.a((Object) cVar2.y, (Object) "scanned") && !this.f63400c.j().contains(this.f63401d)) {
                    this.f63400c.j().add(this.f63401d);
                    r.a("login_qr_page_scaned", new com.ss.android.ugc.aweme.app.f.d().a("previous_page", this.f63400c.g()).a("previous_page_location", this.f63400c.i()).f66730a);
                }
                WeakHandler e2 = this.f63400c.e();
                Message obtain = Message.obtain();
                obtain.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                obtain.obj = this.f63401d;
                if (!l.a((Object) cVar2.y, (Object) "scanned")) {
                    j2 = 2300;
                }
                e2.sendMessageDelayed(obtain, j2);
            } else if (!this.f63400c.ab_()) {
                r.a("account_debug_info", new com.ss.android.ugc.aweme.app.f.d().a("info", "CheckQRCodeStatusCallback onSuccess" + this.f43069a + ' ' + this.f63400c.a(this)).f66730a);
            } else {
                String str = cVar2.v;
                l.b(str, "");
                ((ImageView) this.f63400c.c(R.id.bt3)).setImageBitmap(b.b(str));
                WeakHandler e3 = this.f63400c.e();
                Message obtain2 = Message.obtain();
                obtain2.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
                obtain2.obj = cVar2.z;
                e3.sendMessageDelayed(obtain2, 1500);
            }
        }

        a(b bVar, String str) {
            this.f63400c = bVar;
            this.f63401d = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.a.c
        public final /* synthetic */ void a(com.bytedance.sdk.a.a.d.c cVar, int i2) {
            String str;
            com.bytedance.sdk.a.a.d.c cVar2 = cVar;
            if (!this.f63400c.ab_()) {
                r.a("account_debug_info", new com.ss.android.ugc.aweme.app.f.d().a("info", "CheckQRCodeStatusCallback onError" + this.f43069a + ' ' + this.f63400c.a(this)).f66730a);
                return;
            }
            b bVar = this.f63400c;
            if (cVar2 == null || (str = cVar2.f43075f) == null) {
                str = "";
            }
            com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(bVar, i2, str, this.f63400c.A(), this.f63400c.V_(), null);
            WeakHandler e2 = this.f63400c.e();
            Message obtain = Message.obtain();
            obtain.what = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
            obtain.obj = this.f63401d;
            e2.sendMessageDelayed(obtain, 1500);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(str).a();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MethodCollector.i(8983);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) c(R.id.em8);
        l.b(buttonTitleBar, "");
        ((com.bytedance.ies.dmt.ui.titlebar.a) c(R.id.em8)).setDividerLineBackground(androidx.core.content.b.c(buttonTitleBar.getContext(), R.color.f159928l));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131231100);
        DmtStatusView dmtStatusView = (DmtStatusView) c(R.id.e_o);
        l.b(dmtStatusView, "");
        ((DmtStatusView) c(R.id.e_o)).setBuilder(DmtStatusView.a.a(dmtStatusView.getContext()).c(imageView));
        ((DmtStatusView) c(R.id.e_o)).setOnClickListener(new e(this));
        ((ButtonTitleBar) c(R.id.em8)).setOnTitleBarClickListener(new f(this));
        int a2 = (int) (((float) com.bytedance.ies.dmt.ui.f.b.a(getContext())) - (n.b(getContext(), 58.0f) * 2.0f));
        ImageView imageView2 = (ImageView) c(R.id.bt3);
        l.b(imageView2, "");
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        layoutParams.height = a2;
        layoutParams.width = a2;
        ImageView imageView3 = (ImageView) c(R.id.bt3);
        l.b(imageView3, "");
        imageView3.setLayoutParams(layoutParams);
        ImageSpan imageSpan = new ImageSpan(view.getContext(), 2131231145);
        String string = getString(R.string.ap6, "placeHolder");
        l.b(string, "");
        int a3 = h.m.p.a((CharSequence) string, "placeHolder", 0, false, 6);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(imageSpan, a3, a3 + 11, 33);
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bg_);
        l.b(tuxTextView, "");
        tuxTextView.setText(spannableString);
        k();
        MethodCollector.o(8983);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.fm, viewGroup, false);
    }
}
