package com.ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.ss.android.ugc.aweme.authorize.a.a;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.openauthorize.a.e;
import com.ss.android.ugc.aweme.openauthorize.a.g;
import com.ss.android.ugc.aweme.openauthorize.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class f extends Fragment implements h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f67184f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f67185a;

    /* renamed from: b  reason: collision with root package name */
    public AuthCommonViewModel f67186b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.openauthorize.a.d f67187c;

    /* renamed from: d  reason: collision with root package name */
    public String f67188d;

    /* renamed from: e  reason: collision with root package name */
    public String f67189e;

    /* renamed from: g  reason: collision with root package name */
    private c.a f67190g;

    /* renamed from: h  reason: collision with root package name */
    private int f67191h;

    /* renamed from: i  reason: collision with root package name */
    private AwemeAuthorizePlatformDepend f67192i;

    /* renamed from: j  reason: collision with root package name */
    private a.AbstractC1045a f67193j;

    /* renamed from: k  reason: collision with root package name */
    private String f67194k;

    /* renamed from: l  reason: collision with root package name */
    private SparseArray f67195l;

    static {
        Covode.recordClassIndex(41386);
    }

    private View a(int i2) {
        if (this.f67195l == null) {
            this.f67195l = new SparseArray();
        }
        View view = (View) this.f67195l.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f67195l.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41387);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f67195l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final String a() {
        c.a aVar = this.f67190g;
        if (aVar == null) {
            l.a("request");
        }
        return aVar.f43134c;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67199a;

        static {
            Covode.recordClassIndex(41390);
        }

        d(f fVar) {
            this.f67199a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            f.a(this.f67199a).a(false, true);
        }
    }

    public static final /* synthetic */ AuthCommonViewModel a(f fVar) {
        AuthCommonViewModel authCommonViewModel = fVar.f67186b;
        if (authCommonViewModel == null) {
            l.a("viewModel");
        }
        return authCommonViewModel;
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67196a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ URLSpan f67197b;

        static {
            Covode.recordClassIndex(41388);
        }

        public final void onClick(View view) {
            l.d(view, "");
            Context context = this.f67196a.getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            String url = this.f67197b.getURL();
            l.b(url, "");
            com.ss.android.ugc.aweme.authorize.b.a.a(context, url);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            Context context = this.f67196a.getContext();
            if (context == null) {
                l.b();
            }
            textPaint.setColor(androidx.core.content.b.c(context, R.color.bx));
            textPaint.setUnderlineText(false);
        }

        b(f fVar, URLSpan uRLSpan) {
            this.f67196a = fVar;
            this.f67197b = uRLSpan;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f67198a;

        static {
            Covode.recordClassIndex(41389);
        }

        c(f fVar) {
            this.f67198a = fVar;
        }

        public final void onClick(View view) {
            List<g> list;
            e pageDetail;
            ClickAgent.onClick(view);
            r.a("auth_submit", new com.ss.android.ugc.aweme.app.f.d().a("auth_app", this.f67198a.f67185a).a("channel", this.f67198a.a()).f66730a);
            f.a(this.f67198a).a(true, false);
            com.ss.android.ugc.aweme.openauthorize.a.d dVar = this.f67198a.f67187c;
            if (dVar == null || (pageDetail = dVar.getPageDetail()) == null) {
                list = null;
            } else {
                list = pageDetail.getScopeList();
            }
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                for (g gVar : list) {
                    if (gVar.isEnabled() == null || l.a((Object) gVar.isEnabled(), (Object) true)) {
                        sb.append(gVar.getScopeName());
                        sb.append(",");
                    }
                }
                sb.setLength(sb.length() - 1);
            }
            AuthCommonViewModel a2 = f.a(this.f67198a);
            String str = this.f67198a.f67188d;
            if (str == null) {
                l.a("clientKey");
            }
            String sb2 = sb.toString();
            l.b(sb2, "");
            String str2 = this.f67198a.f67189e;
            l.d(str, "");
            l.d(sb2, "");
            l.d("web", "");
            AuthCommonViewModel.a aVar = new AuthCommonViewModel.a(a2);
            l.d(str, "");
            l.d(sb2, "");
            l.d("web", "");
            l.d(aVar, "");
            l.d(str, "");
            l.d(sb2, "");
            l.d("web", "");
            com.ss.android.ugc.aweme.authorize.network.a.f67207a.confirmBCAuthorize(str, sb2, "web", str2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new a.b(aVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        Serializable serializable;
        int i2;
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            bundle2 = arguments.getBundle("_bytedance_params_extra");
        } else {
            bundle2 = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("auth_page_info");
        } else {
            serializable = null;
        }
        this.f67187c = (com.ss.android.ugc.aweme.openauthorize.a.d) serializable;
        this.f67190g = new c.a(getArguments());
        this.f67192i = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f67192i;
        if (awemeAuthorizePlatformDepend == null) {
            l.a("depend");
        }
        this.f67193j = new com.bytedance.sdk.a.b.c.a.b(context, awemeAuthorizePlatformDepend);
        if (bundle2 != null) {
            i2 = bundle2.getInt("authType");
        } else {
            i2 = 0;
        }
        this.f67191h = i2;
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f67192i;
        if (awemeAuthorizePlatformDepend2 == null) {
            l.a("depend");
        }
        a.AbstractC1045a aVar = this.f67193j;
        if (aVar == null) {
            l.a("model");
        }
        c.a aVar2 = this.f67190g;
        if (aVar2 == null) {
            l.a("request");
        }
        com.ss.android.ugc.aweme.authorize.viewmodel.a aVar3 = new com.ss.android.ugc.aweme.authorize.viewmodel.a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        androidx.fragment.app.e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        ac a2 = ae.a(activity, aVar3).a(AuthCommonViewModel.class);
        String str3 = "";
        l.b(a2, str3);
        this.f67186b = (AuthCommonViewModel) a2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("ticket_response")) == null) {
            str = str3;
        }
        this.f67194k = str;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str2 = arguments4.getString("key_qrcode_redirect_uri");
        }
        this.f67189e = str2;
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("client_key")) == null)) {
            str3 = string;
        }
        this.f67188d = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0274, code lost:
        if (r6 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0296  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
        // Method dump skipped, instructions count: 886
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.authorize.f.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(10995);
        l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.b1, (ViewGroup) null);
        MethodCollector.o(10995);
        return inflate;
    }
}
