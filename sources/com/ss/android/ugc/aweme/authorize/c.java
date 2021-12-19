package com.ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.authorize.a.a;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.openauthorize.a.f;
import com.ss.android.ugc.aweme.openauthorize.a.g;
import com.ss.android.ugc.aweme.openauthorize.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.ab;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c extends Fragment implements h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f67148g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f67149a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f67150b;

    /* renamed from: c  reason: collision with root package name */
    public AuthCommonViewModel f67151c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.openauthorize.a.d f67152d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f67153e;

    /* renamed from: f  reason: collision with root package name */
    public String f67154f = "";

    /* renamed from: h  reason: collision with root package name */
    private int f67155h;

    /* renamed from: i  reason: collision with root package name */
    private AwemeAuthorizePlatformDepend f67156i;

    /* renamed from: j  reason: collision with root package name */
    private a.AbstractC1045a f67157j;

    /* renamed from: k  reason: collision with root package name */
    private String f67158k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f67159l;

    static {
        Covode.recordClassIndex(41370);
    }

    private View a(int i2) {
        if (this.f67159l == null) {
            this.f67159l = new SparseArray();
        }
        View view = (View) this.f67159l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f67159l.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41371);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(Bundle bundle, String str) {
            c cVar = new c();
            if (bundle != null) {
                bundle.putString("caller_signature_key", str);
            }
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f67159l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final String a() {
        c.a aVar = this.f67150b;
        if (aVar == null) {
            l.a("request");
        }
        return aVar.f43134c;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67163a;

        static {
            Covode.recordClassIndex(41374);
        }

        d(c cVar) {
            this.f67163a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c.a(this.f67163a).a(false, true);
        }
    }

    public static final /* synthetic */ AuthCommonViewModel a(c cVar) {
        AuthCommonViewModel authCommonViewModel = cVar.f67151c;
        if (authCommonViewModel == null) {
            l.a("viewModel");
        }
        return authCommonViewModel;
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ URLSpan f67161b;

        static {
            Covode.recordClassIndex(41372);
        }

        public final void onClick(View view) {
            l.d(view, "");
            Context context = this.f67160a.getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            String url = this.f67161b.getURL();
            l.b(url, "");
            com.ss.android.ugc.aweme.authorize.b.a.a(context, url);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            Context context = this.f67160a.getContext();
            if (context == null) {
                l.b();
            }
            textPaint.setColor(androidx.core.content.b.c(context, R.color.bx));
            textPaint.setUnderlineText(false);
        }

        b(c cVar, URLSpan uRLSpan) {
            this.f67160a = cVar;
            this.f67161b = uRLSpan;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67164a;

        static {
            Covode.recordClassIndex(41375);
        }

        e(c cVar) {
            this.f67164a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f67164a.getParentFragment() instanceof b) {
                Fragment parentFragment = this.f67164a.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment");
                b bVar = (b) parentFragment;
                r.a("edit_auth_access", new com.ss.android.ugc.aweme.app.f.d().a("channel", bVar.a()).a("enter_from", "authorize_screen").a("auth_app", bVar.f67127j).f66730a);
                Bundle arguments = bVar.getArguments();
                e eVar = new e();
                eVar.setArguments(arguments);
                b.q = eVar;
                n a2 = bVar.getChildFragmentManager().a();
                Fragment fragment = b.q;
                if (fragment == null) {
                    l.b();
                }
                a2.b(R.id.b9i, fragment).b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.authorize.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1513c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67162a;

        static {
            Covode.recordClassIndex(41373);
        }

        View$OnClickListenerC1513c(c cVar) {
            this.f67162a = cVar;
        }

        public final void onClick(View view) {
            List<g> list;
            com.ss.android.ugc.aweme.openauthorize.a.e pageDetail;
            ClickAgent.onClick(view);
            r.a("auth_submit", new com.ss.android.ugc.aweme.app.f.d().a("auth_app", this.f67162a.f67149a).a("channel", this.f67162a.a()).f66730a);
            c.a(this.f67162a).a(true, false);
            if (this.f67162a.f67153e) {
                com.ss.android.ugc.aweme.openauthorize.a.d dVar = this.f67162a.f67152d;
                if (dVar == null || (pageDetail = dVar.getPageDetail()) == null) {
                    list = null;
                } else {
                    list = pageDetail.getScopeList();
                }
                StringBuilder sb = new StringBuilder();
                if (list == null) {
                    l.b();
                }
                for (g gVar : list) {
                    if (gVar.isEnabled() == null || l.a((Object) gVar.isEnabled(), (Object) true)) {
                        sb.append(gVar.getScopeName());
                        sb.append(",");
                    }
                }
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                AuthCommonViewModel a2 = c.a(this.f67162a);
                String str = this.f67162a.f67154f;
                String sb2 = sb.toString();
                l.b(sb2, "");
                l.d(str, "");
                l.d(sb2, "");
                AuthCommonViewModel.b bVar = new AuthCommonViewModel.b(a2);
                l.d(str, "");
                l.d(sb2, "");
                l.d(bVar, "");
                l.d(str, "");
                l.d(sb2, "");
                com.ss.android.ugc.aweme.authorize.network.a.f67207a.confirmQroceAuthorize(str, sb2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new a.c(bVar));
                return;
            }
            AuthCommonViewModel a3 = c.a(this.f67162a);
            c.a aVar = this.f67162a.f67150b;
            if (aVar == null) {
                l.a("request");
            }
            a3.a(aVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        int i2;
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("auth_page_info");
        }
        this.f67152d = (com.ss.android.ugc.aweme.openauthorize.a.d) serializable;
        this.f67150b = new c.a(getArguments());
        this.f67156i = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f67156i;
        if (awemeAuthorizePlatformDepend == null) {
            l.a("depend");
        }
        this.f67157j = new com.bytedance.sdk.a.b.c.a.b(context, awemeAuthorizePlatformDepend);
        boolean z = false;
        if (bundle2 != null) {
            i2 = bundle2.getInt("authType");
        } else {
            i2 = 0;
        }
        this.f67155h = i2;
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f67156i;
        if (awemeAuthorizePlatformDepend2 == null) {
            l.a("depend");
        }
        a.AbstractC1045a aVar = this.f67157j;
        if (aVar == null) {
            l.a("model");
        }
        c.a aVar2 = this.f67150b;
        if (aVar2 == null) {
            l.a("request");
        }
        com.ss.android.ugc.aweme.authorize.viewmodel.a aVar3 = new com.ss.android.ugc.aweme.authorize.viewmodel.a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        ac a2 = ae.a(activity, aVar3).a(AuthCommonViewModel.class);
        String str2 = "";
        l.b(a2, str2);
        this.f67151c = (AuthCommonViewModel) a2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("key_qrcode_auth", false);
        }
        this.f67153e = z;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str = arguments4.getString("key_qrcode_token")) == null) {
            str = str2;
        }
        this.f67154f = str;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("ticket_response")) == null)) {
            str2 = string;
        }
        this.f67158k = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        List<f> list;
        String str2;
        com.ss.android.ugc.aweme.openauthorize.a.e pageDetail;
        List<g> scopeList;
        String str3;
        String textContent;
        String textContent2;
        String textContent3;
        String textContent4;
        String textContent5;
        String textContent6;
        com.ss.android.ugc.aweme.openauthorize.a.e pageDetail2;
        com.ss.android.ugc.aweme.openauthorize.a.c clientInfo;
        com.ss.android.ugc.aweme.openauthorize.a.e pageDetail3;
        com.ss.android.ugc.aweme.openauthorize.a.e pageDetail4;
        com.ss.android.ugc.aweme.openauthorize.a.c clientInfo2;
        MethodCollector.i(9406);
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.openauthorize.a.d dVar = this.f67152d;
        RelativeLayout relativeLayout = (RelativeLayout) a(R.id.adx);
        l.b(relativeLayout, "");
        relativeLayout.setVisibility(0);
        com.ss.android.ugc.aweme.base.e.a((RemoteImageView) a(R.id.ekt), (int) R.drawable.status_icon);
        RemoteImageView remoteImageView = (RemoteImageView) a(R.id.bii);
        if (dVar == null || (pageDetail4 = dVar.getPageDetail()) == null || (clientInfo2 = pageDetail4.getClientInfo()) == null) {
            str = null;
        } else {
            str = clientInfo2.getClientIcon();
        }
        com.ss.android.ugc.aweme.base.e.b(remoteImageView, str, -1, -1);
        if (dVar == null || (pageDetail3 = dVar.getPageDetail()) == null) {
            list = null;
        } else {
            list = pageDetail3.getTextList();
        }
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        if (curUser.getUniqueId() == null) {
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g3, "");
            User curUser2 = g3.getCurUser();
            l.b(curUser2, "");
            curUser2.getShortId();
        }
        if (dVar == null || (pageDetail2 = dVar.getPageDetail()) == null || (clientInfo = pageDetail2.getClientInfo()) == null) {
            str2 = null;
        } else {
            str2 = clientInfo.getClientName();
        }
        this.f67149a = str2;
        r.a("auth_notify", new com.ss.android.ugc.aweme.app.f.d().a("auth_app", this.f67149a).a("channel", a()).a("enter_from", "developer").f66730a);
        int i2 = R.id.faz;
        TuxTextView tuxTextView = (TuxTextView) a(R.id.faz);
        l.b(tuxTextView, "");
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        int i3 = R.id.xx;
        if (list != null) {
            for (f fVar : list) {
                if (TextUtils.equals(fVar.getTextKey(), "key_authorized_pattern_desc")) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(fVar.getTextContent()));
                    TuxTextView tuxTextView2 = (TuxTextView) a(R.id.far);
                    l.b(tuxTextView2, "");
                    tuxTextView2.setText(spannableStringBuilder);
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_policy_title") && (textContent6 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView3 = (TuxTextView) a(R.id.fay);
                    l.b(tuxTextView3, "");
                    tuxTextView3.setText(textContent6);
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_authorized_scope_title") && (textContent5 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView4 = (TuxTextView) a(i2);
                    l.b(tuxTextView4, "");
                    tuxTextView4.setText(new SpannableStringBuilder(Html.fromHtml(textContent5)));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_edit_access_desc") && (textContent4 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView5 = (TuxTextView) a(R.id.faf);
                    l.b(tuxTextView5, "");
                    tuxTextView5.setText(new SpannableStringBuilder(textContent4));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_authorize_confirm") && (textContent3 = fVar.getTextContent()) != null) {
                    DmtButton dmtButton = (DmtButton) a(R.id.z2);
                    l.b(dmtButton, "");
                    dmtButton.setText(new SpannableStringBuilder(textContent3));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_authorize_cancel") && (textContent2 = fVar.getTextContent()) != null) {
                    TuxTextView tuxTextView6 = (TuxTextView) a(i3);
                    l.b(tuxTextView6, "");
                    tuxTextView6.setText(new SpannableStringBuilder(textContent2));
                }
                if (TextUtils.equals(fVar.getTextKey(), "key_policy_authorized_desc") && (textContent = fVar.getTextContent()) != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(Html.fromHtml(textContent));
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder2.getSpans(0, textContent.length(), URLSpan.class);
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        l.b(uRLSpan, "");
                        spannableStringBuilder2.setSpan(new b(this, uRLSpan), spannableStringBuilder2.getSpanStart(uRLSpan), spannableStringBuilder2.getSpanEnd(uRLSpan), spannableStringBuilder2.getSpanFlags(uRLSpan));
                        spannableStringBuilder2.removeSpan(uRLSpan);
                    }
                    TuxTextView tuxTextView7 = (TuxTextView) a(R.id.fb5);
                    l.b(tuxTextView7, "");
                    Context context = getContext();
                    if (context == null) {
                        l.b();
                    }
                    tuxTextView7.setHighlightColor(androidx.core.content.b.c(context, R.color.c9));
                    TuxTextView tuxTextView8 = (TuxTextView) a(R.id.fb5);
                    l.b(tuxTextView8, "");
                    tuxTextView8.setText(spannableStringBuilder2);
                    TuxTextView tuxTextView9 = (TuxTextView) a(R.id.fb5);
                    l.b(tuxTextView9, "");
                    tuxTextView9.setMovementMethod(LinkMovementMethod.getInstance());
                }
                i2 = R.id.faz;
                i3 = R.id.xx;
            }
        }
        if (!(dVar == null || (pageDetail = dVar.getPageDetail()) == null || (scopeList = pageDetail.getScopeList()) == null)) {
            for (g gVar : scopeList) {
                String scopeName = gVar.getScopeName();
                String scopeDesc = gVar.getScopeDesc();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str3 = arguments.getString("_bytedance_params_scope");
                } else {
                    str3 = null;
                }
                Iterable iterable = ab.INSTANCE;
                if (str3 != null) {
                    List<String> c2 = p.c(str3, new String[]{","});
                    ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) c2, 10));
                    for (String str4 : c2) {
                        if (str4 != null) {
                            arrayList.add(p.b((CharSequence) str4).toString());
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            MethodCollector.o(9406);
                            throw nullPointerException;
                        }
                    }
                    iterable = h.a.n.m(arrayList);
                }
                if (!TextUtils.isEmpty(scopeName) && !TextUtils.isEmpty(scopeDesc) && h.a.n.a(iterable, scopeName)) {
                    View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.aaw, (ViewGroup) a(R.id.dt1), false);
                    TextView textView = (TextView) a2.findViewById(R.id.evr);
                    l.b(textView, "");
                    textView.setText(scopeDesc);
                    ((LinearLayout) a(R.id.dt1)).addView(a2);
                }
            }
        }
        ((DmtButton) a(R.id.z2)).setOnClickListener(new View$OnClickListenerC1513c(this));
        ((TuxTextView) a(R.id.xx)).setOnClickListener(new d(this));
        ((LinearLayout) a(R.id.art)).setOnClickListener(new e(this));
        MethodCollector.o(9406);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(9198);
        l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b1, (ViewGroup) null);
        MethodCollector.o(9198);
        return inflate;
    }
}
