package com.ss.android.ugc.aweme.ug.amplify.ui;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.settingsrequest.d.c;
import com.ss.android.ugc.aweme.ug.amplify.api.AmplifyApi;
import com.ss.android.ugc.aweme.ug.amplify.b;
import com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a extends Dialog implements com.ss.android.ugc.aweme.base.a.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3769a f141730c = new C3769a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final f.a.b.a f141731a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    final com.ss.android.ugc.aweme.settingsrequest.d.c f141732b;

    static {
        Covode.recordClassIndex(92635);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$a  reason: collision with other inner class name */
    public static final class C3769a {
        static {
            Covode.recordClassIndex(92636);
        }

        private C3769a() {
        }

        public /* synthetic */ C3769a(byte b2) {
            this();
        }
    }

    static final class h implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141736a;

        static {
            Covode.recordClassIndex(92643);
        }

        h(a aVar) {
            this.f141736a = aVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f141736a.c("next_time");
            this.f141736a.dismiss();
        }
    }

    static final class j implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f141739b;

        static {
            Covode.recordClassIndex(92645);
        }

        j(a aVar, String str) {
            this.f141738a = aVar;
            this.f141739b = str;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f141738a.a(this.f141739b);
            this.f141738a.dismiss();
        }
    }

    public final void dismiss() {
        super.dismiss();
        this.f141731a.dispose();
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141737a;

        static {
            Covode.recordClassIndex(92644);
        }

        i(a aVar) {
            this.f141737a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f141737a.dismiss();
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141740a;

        static {
            Covode.recordClassIndex(92646);
        }

        k(a aVar) {
            this.f141740a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f141740a.dismiss();
        }
    }

    static final class g extends m implements h.f.a.b<AmplifyApi, f.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f141735a = new g();

        static {
            Covode.recordClassIndex(92642);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f.a.b invoke(AmplifyApi amplifyApi) {
            AmplifyApi amplifyApi2 = amplifyApi;
            l.d(amplifyApi2, "");
            return amplifyApi2.refuseAction();
        }
    }

    static boolean a(c.b bVar) {
        c.a aVar;
        if (bVar == null || (aVar = bVar.f123200c) == null || aVar.f123196a != 3) {
            return false;
        }
        return true;
    }

    static boolean b(c.b bVar) {
        c.a aVar;
        if (bVar == null || (aVar = bVar.f123200c) == null || aVar.f123196a != 5) {
            return false;
        }
        return true;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.b f141734b;

        static {
            Covode.recordClassIndex(92637);
        }

        b(a aVar, c.b bVar) {
            this.f141733a = aVar;
            this.f141734b = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            c.a aVar = this.f141734b.f123200c;
            if (aVar != null && (str = aVar.f123197b) != null) {
                this.f141733a.b(str);
                this.f141733a.dismiss();
                this.f141733a.c("make_selections");
            }
        }
    }

    static final class c extends m implements h.f.a.b<String, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            if (str2 != null) {
                this.this$0.b(str2);
                this.this$0.c("more_item");
            }
            return z.f158842a;
        }
    }

    public final void b(String str) {
        SmartRouter.buildRoute(getContext(), "aweme://webview/").withParam(Uri.parse(str)).open();
    }

    static final class d extends m implements h.f.a.b<View, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92639);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            a aVar = this.this$0;
            if (aVar.f141732b.f123192c == 2) {
                aVar.dismiss();
                aVar.c("next_time");
            } else {
                f.a.b.b a2 = a.a(g.f141735a).a(new h(aVar), new i(aVar));
                l.b(a2, "");
                aVar.f141731a.a(a2);
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.b<AmplifyApi, f.a.b> {
        final /* synthetic */ String $url;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$url = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f.a.b invoke(AmplifyApi amplifyApi) {
            AmplifyApi amplifyApi2 = amplifyApi;
            l.d(amplifyApi2, "");
            if (l.a((Object) this.$url, (Object) "/aweme/v2/ug/ugc/permission/item/perm/submit")) {
                return amplifyApi2.confirmAction(this.$url, "select_period_all");
            }
            return amplifyApi2.confirmAction(this.$url, null);
        }
    }

    static f.a.b a(h.f.a.b<? super AmplifyApi, ? extends f.a.b> bVar) {
        Object a2 = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(AmplifyApi.class);
        l.b(a2, "");
        f.a.b a3 = ((f.a.b) bVar.invoke(a2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(f.a.e.b.a.f157195h);
        l.b(a3, "");
        return a3;
    }

    public final void c(String str) {
        if (this.f141732b.f123192c == 2 && l.a((Object) str, (Object) "next_time")) {
            str = "NO";
        }
        r.a("toast_click", new com.ss.android.ugc.aweme.app.f.d().a("toast_type", "copyright_permission_introduction").a("toast_mode", this.f141732b.f123192c).a("click_position", str).f66730a);
    }

    static final class e extends m implements h.f.a.b<View, z> {
        final /* synthetic */ c.b $confirmButtonStruct;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, c.b bVar) {
            super(1);
            this.this$0 = aVar;
            this.$confirmButtonStruct = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            c.a aVar;
            String str;
            c.a aVar2;
            String str2;
            l.d(view, "");
            a aVar3 = this.this$0;
            c.b bVar = this.$confirmButtonStruct;
            if (a.a(bVar)) {
                if (!(bVar == null || (aVar2 = bVar.f123200c) == null || (str2 = aVar2.f123197b) == null)) {
                    aVar3.b(str2);
                    aVar3.a(str2);
                    aVar3.dismiss();
                }
            } else if (!(!a.b(bVar) || bVar == null || (aVar = bVar.f123200c) == null || (str = aVar.f123197b) == null)) {
                f.a.b.b a2 = a.a(new f(aVar3, str)).a(new j(aVar3, str), new k(aVar3));
                l.b(a2, "");
                aVar3.f141731a.a(a2);
            }
            return z.f158842a;
        }
    }

    public final void a(String str) {
        Boolean bool;
        String str2;
        List<c.b> list;
        boolean z;
        c.C3190c cVar = this.f141732b.f123193d;
        if (cVar == null || (list = cVar.f123203c) == null) {
            bool = null;
        } else {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (a((c.b) it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                bool = Boolean.valueOf(z);
            }
            z = false;
            bool = Boolean.valueOf(z);
        }
        boolean a2 = l.a((Object) str, (Object) "/aweme/v2/ug/ugc/permission/item/perm/submit");
        if (l.a((Object) bool, (Object) true)) {
            str2 = "discover_tiktok_amplify";
        } else if (a2) {
            str2 = "YES";
        } else {
            str2 = "join_project";
        }
        c(str2);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        T t;
        T t2;
        c.b bVar;
        c.a aVar;
        Spanned fromHtml;
        String[] strArr;
        String str2;
        WindowManager.LayoutParams attributes;
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (!(window == null || (attributes = window.getAttributes()) == null)) {
            attributes.gravity = 17;
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
        setContentView(R.layout.x2);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        c.C3190c cVar = this.f141732b.f123193d;
        if (cVar == null) {
            dismiss();
        }
        l.b(cVar, "");
        c.e eVar = cVar.f123205e;
        if (!(eVar == null || (strArr = eVar.f123208b) == null || (str2 = strArr[0]) == null)) {
            com.ss.android.ugc.aweme.base.e.b((RemoteImageView) findViewById(R.id.j_), str2, -1, -1);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.jc);
        l.b(tuxTextView, "");
        tuxTextView.setText(cVar.f123201a);
        TextView textView = (TextView) findViewById(R.id.j9);
        String str3 = cVar.f123202b;
        c cVar2 = new c(this);
        l.d(cVar2, "");
        if (!TextUtils.isEmpty(str3)) {
            if (Build.VERSION.SDK_INT < 24) {
                fromHtml = Html.fromHtml(str3);
            } else {
                fromHtml = Html.fromHtml(str3, 63);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    spannableStringBuilder.setSpan(new b.a(cVar2, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                    spannableStringBuilder.removeSpan(uRLSpan);
                }
            }
            if (textView != null) {
                textView.setHighlightColor(androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.c9));
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        List<c.b> list = cVar.f123203c;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t3 = t;
            if (!a((c.b) t3)) {
                if (b((c.b) t3)) {
                    break;
                }
            } else {
                break;
            }
        }
        T t4 = t;
        List<c.b> list2 = cVar.f123203c;
        l.b(list2, "");
        Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            T t5 = t2;
            if (!(t5 == null || (aVar = t5.f123200c) == null || aVar.f123196a != 4)) {
                break;
            }
        }
        T t6 = t2;
        List<c.b> list3 = cVar.f123204d;
        if (!(list3 == null || (bVar = (c.b) n.h((List) list3)) == null || bVar.f123198a == null)) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ja);
            l.b(linearLayout, "");
            linearLayout.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.jb);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(bVar.f123198a);
            ((LinearLayout) findViewById(R.id.ja)).setOnClickListener(new b(this, bVar));
        }
        NotifyBottomButton notifyBottomButton = (NotifyBottomButton) findViewById(R.id.j8);
        String valueOf = String.valueOf(t6 != null ? t6.f123198a : null);
        d dVar = new d(this);
        if (t4 != null) {
            str = t4.f123198a;
        }
        String valueOf2 = String.valueOf(str);
        e eVar2 = new e(this, t4);
        l.d(valueOf, "");
        l.d(dVar, "");
        l.d(valueOf2, "");
        l.d(eVar2, "");
        notifyBottomButton.post(new NotifyBottomButton.a(notifyBottomButton, valueOf, valueOf2, dVar, eVar2));
        r.a("toast_show", new com.ss.android.ugc.aweme.app.f.d().a("toast_mode", this.f141732b.f123192c).a("toast_type", "copyright_permission_introduction").f66730a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, com.ss.android.ugc.aweme.settingsrequest.d.c cVar) {
        super(activity);
        l.d(activity, "");
        l.d(cVar, "");
        this.f141732b = cVar;
    }
}
