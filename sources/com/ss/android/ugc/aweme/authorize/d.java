package com.ss.android.ugc.aweme.authorize;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.a.b.b.a;
import com.bytedance.sdk.a.c.a.c;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.authorize.viewmodel.AuthCommonViewModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.openauthorize.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Arrays;

public final class d extends Fragment implements h {

    /* renamed from: c  reason: collision with root package name */
    public static final a f67165c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AuthCommonViewModel f67166a;

    /* renamed from: b  reason: collision with root package name */
    public c.a f67167b;

    /* renamed from: d  reason: collision with root package name */
    private AwemeAuthorizePlatformDepend f67168d;

    /* renamed from: e  reason: collision with root package name */
    private a.AbstractC1045a f67169e;

    /* renamed from: f  reason: collision with root package name */
    private String f67170f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f67171g;

    static {
        Covode.recordClassIndex(41377);
    }

    private View a(int i2) {
        if (this.f67171g == null) {
            this.f67171g = new SparseArray();
        }
        View view = (View) this.f67171g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f67171g.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41378);
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
        SparseArray sparseArray = this.f67171g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67173a;

        static {
            Covode.recordClassIndex(41380);
        }

        c(d dVar) {
            this.f67173a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d.a(this.f67173a).a(false, true);
        }
    }

    public static final /* synthetic */ AuthCommonViewModel a(d dVar) {
        AuthCommonViewModel authCommonViewModel = dVar.f67166a;
        if (authCommonViewModel == null) {
            l.a("viewModel");
        }
        return authCommonViewModel;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f67172a;

        static {
            Covode.recordClassIndex(41379);
        }

        b(d dVar) {
            this.f67172a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AuthCommonViewModel a2 = d.a(this.f67172a);
            c.a aVar = this.f67172a.f67167b;
            if (aVar == null) {
                l.a("request");
            }
            a2.a(aVar);
            d.a(this.f67172a).a(true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        this.f67167b = new c.a(getArguments());
        this.f67168d = new AwemeAuthorizePlatformDepend(this);
        Context context = getContext();
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend = this.f67168d;
        if (awemeAuthorizePlatformDepend == null) {
            l.a("depend");
        }
        this.f67169e = new com.bytedance.sdk.a.b.c.a.b(context, awemeAuthorizePlatformDepend);
        AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend2 = this.f67168d;
        if (awemeAuthorizePlatformDepend2 == null) {
            l.a("depend");
        }
        a.AbstractC1045a aVar = this.f67169e;
        if (aVar == null) {
            l.a("model");
        }
        c.a aVar2 = this.f67167b;
        if (aVar2 == null) {
            l.a("request");
        }
        com.ss.android.ugc.aweme.authorize.viewmodel.a aVar3 = new com.ss.android.ugc.aweme.authorize.viewmodel.a(awemeAuthorizePlatformDepend2, aVar, aVar2);
        e activity = getActivity();
        if (activity == null) {
            l.b();
        }
        ac a2 = ae.a(activity, aVar3).a(AuthCommonViewModel.class);
        String str = "";
        l.b(a2, str);
        this.f67166a = (AuthCommonViewModel) a2;
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("ticket_response")) == null)) {
            str = string;
        }
        this.f67170f = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            if (curUser != null) {
                com.ss.android.ugc.aweme.base.e.a((RemoteImageView) a(R.id.cbn), curUser.getAvatarThumb());
                TuxTextView tuxTextView = (TuxTextView) a(R.id.cbo);
                l.b(tuxTextView, "");
                tuxTextView.setText(curUser.getNickname());
                String uniqueId = curUser.getUniqueId();
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.cbq);
                l.b(tuxTextView2, "");
                tuxTextView2.setText("@".concat(String.valueOf(uniqueId)));
                io.a(getContext(), curUser.getCustomVerify(), curUser.getEnterpriseVerifyReason(), (TextView) a(R.id.cbq));
                TuxTextView tuxTextView3 = (TuxTextView) a(R.id.cbm);
                l.b(tuxTextView3, "");
                String string = getResources().getString(R.string.gfm);
                l.b(string, "");
                String a2 = com.a.a(string, Arrays.copyOf(new Object[]{curUser.getUniqueId()}, 1));
                l.b(a2, "");
                tuxTextView3.setText(a2);
                ((TuxTextView) a(R.id.cbm)).setOnClickListener(new b(this));
                ((TuxTextView) a(R.id.cbl)).setOnClickListener(new c(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(9795);
        l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.bi, (ViewGroup) null);
        MethodCollector.o(9795);
        return inflate;
    }
}
