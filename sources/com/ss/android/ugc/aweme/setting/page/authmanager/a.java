package com.ss.android.ugc.aweme.setting.page.authmanager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.keva.Keva;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import f.a.x;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

public final class a extends com.ss.android.ugc.aweme.base.arch.b {

    /* renamed from: b  reason: collision with root package name */
    public static String f122386b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f122387c = "";

    /* renamed from: d  reason: collision with root package name */
    public static String f122388d = "";

    /* renamed from: e  reason: collision with root package name */
    public static String f122389e;

    /* renamed from: j  reason: collision with root package name */
    public static final b f122390j = new b((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h f122391k;

    /* renamed from: l  reason: collision with root package name */
    private final h f122392l = i.a((h.f.a.a) new g(this));

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f122393m;

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.f122393m == null) {
            this.f122393m = new SparseArray();
        }
        View view = (View) this.f122393m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f122393m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.f122393m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final AuthListViewModel b() {
        return (AuthListViewModel) this.f122391k.getValue();
    }

    public final TuxStatusView c() {
        return (TuxStatusView) this.f122392l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(80251);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static void a(String str) {
            l.d(str, "");
            a.f122387c = str;
        }

        public static void b(String str) {
            l.d(str, "");
            a.f122388d = str;
        }
    }

    static final class g extends m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(80258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.a(R.id.e_o);
        }
    }

    static {
        Covode.recordClassIndex(80249);
    }

    public a() {
        h.k.c a2 = ab.a(AuthListViewModel.class);
        this.f122391k = i.a((h.f.a.a) new C3164a(this, a2, a2));
    }

    public static boolean e() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
            l.b(awemeActivitySetting, "");
            Boolean isNewUser = awemeActivitySetting.getIsNewUser();
            l.b(isNewUser, "");
            return isNewUser.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.a$a  reason: collision with other inner class name */
    public static final class C3164a extends m implements h.f.a.a<AuthListViewModel> {
        final /* synthetic */ Fragment $this_parentFragmentViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(80250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3164a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_parentFragmentViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.$this_parentFragmentViewModel
                androidx.fragment.app.Fragment r1 = r0.getParentFragment()
                if (r1 != 0) goto L_0x000b
                h.f.b.l.a()
            L_0x000b:
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_setting_page_authmanager_AuthAppInfoFragment$$special$$inlined$parentFragmentViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.page.authmanager.a.C3164a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_setting_page_authmanager_AuthAppInfoFragment$$special$$inlined$parentFragmentViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122394a;

        static {
            Covode.recordClassIndex(80252);
        }

        c(a aVar) {
            this.f122394a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f122394a.getParentFragment() != null && (this.f122394a.getParentFragment() instanceof AuthManagementPage)) {
                Fragment parentFragment = this.f122394a.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
                ((AuthManagementPage) parentFragment).e();
            }
        }
    }

    public static final class f implements ae<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f122400a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f122401b;

        static {
            Covode.recordClassIndex(80257);
        }

        @Override // f.a.ae
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.ae
        public final void onError(Throwable th) {
            l.d(th, "");
            new com.bytedance.tux.g.b(this.f122401b).e(R.string.de8).b();
            this.f122401b.c().setVisibility(8);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.ae
        public final /* synthetic */ void onSuccess(BaseResponse baseResponse) {
            Integer num;
            l.d(baseResponse, "");
            this.f122401b.c().setVisibility(8);
            AuthListViewModel b2 = this.f122401b.b();
            String str = this.f122400a;
            l.d(str, "");
            b2.c(new AuthListViewModel.f(str));
            Keva repo = Keva.getRepo("setting_repo_safe_view");
            com.ss.android.ugc.aweme.setting.model.g gVar = AuthListApi.a.a().getAuthAppCount().get().f122316a;
            if (gVar != null) {
                num = gVar.getCount();
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                repo.storeBoolean("authorized_apps_entrance", false);
                androidx.fragment.app.e activity = this.f122401b.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            } else {
                repo.storeBoolean("authorized_apps_entrance", true);
            }
            if (this.f122401b.getParentFragment() != null && (this.f122401b.getParentFragment() instanceof AuthManagementPage)) {
                Fragment parentFragment = this.f122401b.getParentFragment();
                Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.authmanager.AuthManagementPage");
                ((AuthManagementPage) parentFragment).e();
            }
        }

        f(String str, a aVar) {
            this.f122400a = str;
            this.f122401b = aVar;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122395a;

        static {
            Covode.recordClassIndex(80253);
        }

        d(a aVar) {
            this.f122395a = aVar;
        }

        public final void onClick(final View view) {
            ClickAgent.onClick(view);
            r.a("settings_auth_click", new com.ss.android.ugc.aweme.app.f.d().a("auth_app", a.f122386b).a("channel", a.f122389e).f66730a);
            if (this.f122395a.getContext() != null) {
                a.C0731a aVar = new a.C0731a(this.f122395a.getContext());
                aVar.f33401a = a.f122387c;
                aVar.f33402b = a.f122388d;
                aVar.a(R.string.fbo, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.authmanager.a.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f122396a;

                    static {
                        Covode.recordClassIndex(80254);
                    }

                    {
                        this.f122396a = r1;
                    }

                    private static boolean a() {
                        try {
                            return f.a.f68431a.c();
                        } catch (Exception unused) {
                            return false;
                        }
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                        View view = view;
                        l.b(view, "");
                        view.getContext();
                        if (!j.f107229h || !j.b() || j.c()) {
                            j.f107229h = a();
                        }
                        if (!j.f107229h) {
                            new com.bytedance.tux.g.b(this.f122396a.f122395a).e(R.string.de8).b();
                            return;
                        }
                        a aVar = this.f122396a.f122395a;
                        View view2 = view;
                        l.b(view2, "");
                        l.b(view2.getContext(), "");
                        String str = a.f122389e;
                        if (str != null) {
                            AuthListViewModel b2 = aVar.b();
                            l.d(str, "");
                            com.ss.android.ugc.aweme.setting.m.c cVar = b2.f123057a;
                            l.d(str, "");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("client_key", str);
                            f.a.ab a2 = f.a.ab.a((x) cVar.f122288c.c(linkedHashMap));
                            l.b(a2, "");
                            a2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new f(str, aVar));
                        }
                        r.a("auth_out", new com.ss.android.ugc.aweme.app.f.d().a("auth_app", a.f122386b).a("channel", a.f122389e).a("is_register", a.e() ? 1 : 0).f66730a);
                    }
                }, false).b(R.string.a9e, (DialogInterface.OnClickListener) AnonymousClass2.f122398a, false).a().c();
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122399a;

        static {
            Covode.recordClassIndex(80256);
        }

        e(a aVar) {
            this.f122399a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            MethodCollector.i(6989);
            com.ss.android.ugc.aweme.setting.model.c cVar = (com.ss.android.ugc.aweme.setting.model.c) obj;
            a.f122389e = cVar.getClientKey();
            TuxTextView tuxTextView = (TuxTextView) this.f122399a.a(R.id.no);
            l.b(tuxTextView, "");
            tuxTextView.setText(cVar.getName());
            TuxTextView tuxTextView2 = (TuxTextView) this.f122399a.a(R.id.title_tv);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(cVar.getName());
            TuxTextView tuxTextView3 = (TuxTextView) this.f122399a.a(R.id.nl);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(cVar.getDesc());
            TuxTextView tuxTextView4 = (TuxTextView) this.f122399a.a(R.id.nk);
            l.b(tuxTextView4, "");
            tuxTextView4.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView5 = (TuxTextView) this.f122399a.a(R.id.nk);
            l.b(tuxTextView5, "");
            String accessMsg = cVar.getAccessMsg();
            if (accessMsg == null) {
                accessMsg = "";
            }
            tuxTextView5.setText(new SpannableStringBuilder(Html.fromHtml(accessMsg)));
            com.ss.android.ugc.aweme.base.e.b((RemoteImageView) this.f122399a.a(R.id.nn), cVar.getIcon(), -1, -1);
            TuxTextView tuxTextView6 = (TuxTextView) this.f122399a.a(R.id.lh);
            l.b(tuxTextView6, "");
            tuxTextView6.setText(cVar.getAuthorizedTimeText());
            if (!TextUtils.isEmpty(cVar.getStatus())) {
                TuxTextView tuxTextView7 = (TuxTextView) this.f122399a.a(R.id.nm);
                l.b(tuxTextView7, "");
                tuxTextView7.setText(cVar.getStatus());
                TuxTextView tuxTextView8 = (TuxTextView) this.f122399a.a(R.id.nm);
                l.b(tuxTextView8, "");
                tuxTextView8.setVisibility(0);
            } else {
                TuxTextView tuxTextView9 = (TuxTextView) this.f122399a.a(R.id.nm);
                l.b(tuxTextView9, "");
                tuxTextView9.setVisibility(8);
            }
            List<String> scopeNames = cVar.getScopeNames();
            if (scopeNames != null) {
                Iterator<T> it = scopeNames.iterator();
                while (it.hasNext()) {
                    View inflate = LayoutInflater.from(this.f122399a.getContext()).inflate(R.layout.ayy, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.evr);
                    l.b(textView, "");
                    textView.setText(it.next());
                    ((LinearLayout) this.f122399a.a(R.id.dsz)).addView(inflate);
                }
            }
            String name = cVar.getName();
            if (name != null) {
                l.d(name, "");
                a.f122386b = name;
            }
            String string = this.f122399a.getString(R.string.ws, cVar.getName());
            l.b(string, "");
            b.b(string);
            String removalPopupContent = cVar.getRemovalPopupContent();
            if (removalPopupContent != null && !TextUtils.isEmpty(removalPopupContent)) {
                b.b(removalPopupContent);
            }
            String string2 = this.f122399a.getString(R.string.wq, cVar.getName());
            l.b(string2, "");
            b.a(string2);
            String removalPopupTitle = cVar.getRemovalPopupTitle();
            if (removalPopupTitle != null) {
                if (!TextUtils.isEmpty(removalPopupTitle)) {
                    b.a(removalPopupTitle);
                }
                MethodCollector.o(6989);
                return;
            }
            MethodCollector.o(6989);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((AutoRTLImageView) a(R.id.qb)).setOnClickListener(new c(this));
        ((DmtButton) a(R.id.xm)).setOnClickListener(new d(this));
        b().f123058b.observe(this, new e(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ayr, viewGroup, false);
    }
}
