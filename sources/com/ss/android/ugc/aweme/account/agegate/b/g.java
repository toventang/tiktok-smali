package com.ss.android.ugc.aweme.account.agegate.b;

import android.content.Context;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.AgeGateService;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.app.services.IWebViewService;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

public final class g extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.account.login.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f62685a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private HashMap f62686b;

    static {
        Covode.recordClassIndex(38618);
    }

    private View a(int i2) {
        if (this.f62686b == null) {
            this.f62686b = new HashMap();
        }
        View view = (View) this.f62686b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62686b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38619);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f62686b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(3);
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.account.views.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f62689a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62690b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f62691c;

        static {
            Covode.recordClassIndex(38621);
        }

        public final void onClick(View view) {
            l.d(view, "");
            if (this.f62689a.getContext() != null) {
                IWebViewService iWebViewService = (IWebViewService) com.ss.android.ugc.aweme.a.a(IWebViewService.class);
                Context context = this.f62689a.getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                iWebViewService.a(context, "https://www.tiktok.com/en/privacy-policy-for-younger-users");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, int i2, int i3, int i4, int i5) {
            super(i4, i5);
            this.f62689a = gVar;
            this.f62690b = i2;
            this.f62691c = i3;
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.account.views.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f62692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f62693b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f62694c;

        static {
            Covode.recordClassIndex(38622);
        }

        public final void onClick(View view) {
            l.d(view, "");
            if (this.f62692a.getContext() != null) {
                IWebViewService iWebViewService = (IWebViewService) com.ss.android.ugc.aweme.a.a(IWebViewService.class);
                Context context = this.f62692a.getContext();
                if (context == null) {
                    l.b();
                }
                l.b(context, "");
                iWebViewService.a(context, "https://www.tiktok.com/en/terms-of-use");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, int i2, int i3, int i4, int i5) {
            super(i4, i5);
            this.f62692a = gVar;
            this.f62693b = i2;
            this.f62694c = i3;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f62687a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AgeGateResponse f62688b;

        static {
            Covode.recordClassIndex(38620);
        }

        b(g gVar, AgeGateResponse ageGateResponse) {
            this.f62687a = gVar;
            this.f62688b = ageGateResponse;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "pop_up").a("pass_export", 1);
            AgeGateResponse ageGateResponse = this.f62688b;
            if (ageGateResponse == null || ageGateResponse.getAgeGatePostAction() != 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            r.a("age_gate_complete_click", a2.a("pass_gate", i2).f62575a);
            e activity = this.f62687a.getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            AgeGateResponse ageGateResponse2 = this.f62688b;
            if (ageGateResponse2 == null || ageGateResponse2.getAgeGatePostAction() != 0) {
                Context j2 = f.j();
                if (j2 == null) {
                    j2 = com.bytedance.ies.ugc.appcontext.d.a();
                }
                com.ss.android.ugc.aweme.compliance.api.a.q().a(j2);
                ShareServiceImpl.d().a(com.bytedance.ies.ugc.appcontext.d.a(), true);
            } else {
                AgeGateService c2 = cj.c();
                String str = h.f62842a;
                if (str == null) {
                    str = "";
                }
                c2.a(str, true);
                h.a();
                ShareServiceImpl.d().a(com.bytedance.ies.ugc.appcontext.d.a(), false);
            }
            e activity2 = this.f62687a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        int i2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) serializable;
        if (ageGateResponse != null) {
            if (ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.is_prompt()) {
                ((TuxTextView) a(R.id.ak7)).setText(R.string.c3a);
            } else if (ageGateResponse.getAgeGatePostAction() == 1) {
                String string = getString(R.string.c3c);
                l.b(string, "");
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(getString(R.string.c3b, string));
                newSpannable.setSpan(new ForegroundColorSpan(androidx.core.content.b.c(view.getContext(), R.color.bx)), newSpannable.length() - string.length(), newSpannable.length(), 17);
                TuxTextView tuxTextView = (TuxTextView) a(R.id.ak7);
                l.b(tuxTextView, "");
                tuxTextView.setText(newSpannable);
                ImageView imageView = (ImageView) a(R.id.cj2);
                l.b(imageView, "");
                imageView.getLayoutParams().width = (n.a(getContext()) * 160) / 375;
                ImageView imageView2 = (ImageView) a(R.id.cj2);
                l.b(imageView2, "");
                ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
                ImageView imageView3 = (ImageView) a(R.id.cj2);
                l.b(imageView3, "");
                layoutParams.height = imageView3.getLayoutParams().width;
                Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(getString(R.string.c3d));
                String string2 = getString(R.string.c3e);
                l.b(string2, "");
                String string3 = getString(R.string.c3f);
                l.b(string3, "");
                String string4 = getString(R.string.c3d);
                l.b(string4, "");
                int a2 = p.a((CharSequence) string4, string2, 0, false, 6);
                String string5 = getString(R.string.c3d);
                l.b(string5, "");
                int a3 = p.a((CharSequence) string5, string3, 0, false, 6);
                if (a2 < 0 || a3 < 0) {
                    JSONObject a4 = new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "ftc_complete").a();
                    l.b(a4, "");
                    com.ss.android.ugc.aweme.account.m.b.a("text_highlight_not_match", "", a4);
                }
                int c2 = androidx.core.content.b.c(view.getContext(), R.color.gq);
                int c3 = androidx.core.content.b.c(view.getContext(), R.color.lj);
                c cVar = new c(this, c2, c3, c2, c3);
                d dVar = new d(this, c2, c3, c2, c3);
                newSpannable2.setSpan(cVar, a2, string2.length() + a2, 17);
                newSpannable2.setSpan(dVar, a3, string3.length() + a3, 17);
                TextView textView = (TextView) view.findViewById(R.id.d9e);
                l.b(textView, "");
                textView.setText(newSpannable2);
                textView.setVisibility(0);
                textView.setMovementMethod(com.ss.android.ugc.aweme.account.views.a.a());
                ((TuxTextView) a(R.id.acf)).setOnClickListener(new b(this, ageGateResponse));
                com.ss.android.ugc.aweme.account.a.b.a a5 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "pop_up");
                if (ageGateResponse == null && ageGateResponse.getAgeGatePostAction() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                r.a("age_gate_complete", a5.a("pass_gate", i2).a("pass_export", 1).f62575a);
            }
        }
        ((TuxTextView) a(R.id.acf)).setOnClickListener(new b(this, ageGateResponse));
        com.ss.android.ugc.aweme.account.a.b.a a52 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "pop_up");
        if (ageGateResponse == null) {
        }
        i2 = 0;
        r.a("age_gate_complete", a52.a("pass_gate", i2).a("pass_export", 1).f62575a);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.gb, viewGroup, false);
    }
}
