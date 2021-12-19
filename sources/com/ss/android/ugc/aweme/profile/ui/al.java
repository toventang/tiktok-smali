package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.e;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.an;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.t;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.utils.ho;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public abstract class al extends a implements t {

    /* renamed from: a  reason: collision with root package name */
    public String f116869a;

    /* renamed from: b  reason: collision with root package name */
    public String f116870b;

    /* renamed from: c  reason: collision with root package name */
    public View f116871c;

    /* renamed from: d  reason: collision with root package name */
    protected List<Integer> f116872d;

    /* renamed from: e  reason: collision with root package name */
    public String f116873e;

    /* renamed from: j  reason: collision with root package name */
    protected int f116874j;

    /* renamed from: k  reason: collision with root package name */
    protected int f116875k;

    /* renamed from: l  reason: collision with root package name */
    protected User f116876l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f116877m;
    protected EnterpriseTransformLayout n;
    ViewGroup o;
    protected int p = -1;
    protected AnalysisStayTimeFragmentComponent q;
    protected ProfileViewModel r;
    protected c s;
    protected long t = -1;

    static {
        Covode.recordClassIndex(75475);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return true;
    }

    public void i() {
    }

    public void j() {
    }

    /* access modifiers changed from: protected */
    public abstract int k();

    public abstract boolean l();

    /* access modifiers changed from: protected */
    public final void m() {
        this.t = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.t = System.currentTimeMillis();
    }

    public final c g() {
        if (this.s == null && getView() != null) {
            this.s = c.a.a(this, getView());
        }
        return this.s;
    }

    /* access modifiers changed from: protected */
    public final void n() {
        String str;
        if (this.t > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.t;
            if (currentTimeMillis > 0) {
                if (l()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                i.b(new ao(this, str, currentTimeMillis, this.f116874j), r.a());
            }
            this.t = -1;
        }
    }

    public void b(View view) {
        view.setBackgroundColor(b.c(getContext(), R.color.f159928l));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.r = ProfileViewModel.a.a(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("from");
            this.f116873e = string;
            this.r.c(new ProfileViewModel.f(string));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("profile_cur_pos", this.f116874j);
        bundle.putInt("indicator_scroll_maxx", this.f116875k);
        super.onSaveInstanceState(bundle);
    }

    public void a(View view) {
        this.f116871c = view.findViewById(R.id.e_f);
        int i2 = Build.VERSION.SDK_INT;
        this.f116871c.getLayoutParams().height = e.a(getActivity());
        this.o = (ViewGroup) view.findViewById(R.id.ad7);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this, h());
        this.q = analysisStayTimeFragmentComponent;
        analysisStayTimeFragmentComponent.f68047b = new am(this);
        try {
            view.findViewById(R.id.em8).setOnTouchListener(an.f116879a);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        String str;
        int i2;
        super.onHiddenChanged(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.q;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.a(z);
        }
        if (z) {
            n();
            return;
        }
        this.t = System.currentTimeMillis();
        EnterpriseTransformLayout enterpriseTransformLayout = this.n;
        if (!(enterpriseTransformLayout == null || com.bytedance.common.utility.collection.b.a((Collection) enterpriseTransformLayout.f116753e) || enterpriseTransformLayout.f116756h == null || TextUtils.isEmpty(enterpriseTransformLayout.f116756h.getUid()))) {
            if (enterpriseTransformLayout.b()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            for (int i3 = 0; i3 < enterpriseTransformLayout.f116753e.size(); i3++) {
                String str2 = enterpriseTransformLayout.f116753e.get(i3);
                String str3 = enterpriseTransformLayout.f116754f.get(i3);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    enterpriseTransformLayout.getContext();
                    r.a("show_link", str, enterpriseTransformLayout.f116756h.getUid(), "0", EnterpriseTransformLayout.a(str2));
                    r.a("show_link", new d().a("author_id", enterpriseTransformLayout.f116756h.getUid()).a("enter_from", str).a("link_type", str2).f66730a);
                    if (TextUtils.equals(str2, "micro_app") || TextUtils.equals(str2, "micro_game")) {
                        String queryParameter = Uri.parse(str3).getQueryParameter("app_id");
                        IMiniAppService a2 = c.a.f109704a.a();
                        if (TextUtils.equals(str2, "micro_app")) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        a2.preloadMiniApp(queryParameter, i2);
                        r.a("mp_show", new d().a("mp_id", queryParameter).a("author_id", enterpriseTransformLayout.f116756h.getUid()).a("enter_from", str).a("position", "in_video_tag").a("_param_for_special", str2).f66730a);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (com.bytedance.ies.abmock.b.a().a(true, "is_release_window_background", true)) {
            view.setBackgroundColor(-1);
        }
        if (bundle != null) {
            this.f116874j = bundle.getInt("profile_cur_pos", 0);
            this.f116875k = bundle.getInt("indicator_scroll_maxx", 0);
        }
        a(view);
        b(view);
        i();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.s = null;
        return com.a.b.c.a((Activity) getActivity(), k());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(String str, long j2, int i2) {
        String str2;
        an a2 = new an().a(str);
        a2.f109503a = String.valueOf(j2);
        List<Integer> list = this.f116872d;
        if (list == null || list.size() == 0 || i2 >= this.f116872d.size()) {
            str2 = "";
        } else {
            str2 = ho.a(this.f116872d.get(i2).intValue());
        }
        a2.c(str2).f();
        return null;
    }
}
