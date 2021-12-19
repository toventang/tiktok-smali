package com.ss.android.ugc.aweme.dd;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.e;
import com.bytedance.analytics.page.d;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class c extends com.ss.android.ugc.aweme.base.f.a implements View.OnClickListener, d, com.bytedance.hox.a.d, i, j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f79380b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f79381a = true;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f79382c;

    /* renamed from: com.ss.android.ugc.aweme.dd.c$c  reason: collision with other inner class name */
    static final class View$OnTouchListenerC1848c implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final View$OnTouchListenerC1848c f79384a = new View$OnTouchListenerC1848c();

        static {
            Covode.recordClassIndex(49299);
        }

        View$OnTouchListenerC1848c() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(49296);
    }

    private View a(int i2) {
        if (this.f79382c == null) {
            this.f79382c = new SparseArray();
        }
        View view = (View) this.f79382c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f79382c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        l.d(bundle, "");
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(196, new g(c.class, "onEvent", a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49297);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return d.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        return d.a.b(this);
    }

    private String e() {
        if (this.f79381a) {
            return "message";
        }
        return "personal_homepage";
    }

    private String g() {
        if (this.f79381a) {
            return "click_message";
        }
        return "click_mine";
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f79382c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f79383a;

        static {
            Covode.recordClassIndex(49298);
        }

        b(c cVar) {
            this.f79383a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.base.component.f
        public final void a() {
            e activity = this.f79383a.getActivity();
            if (activity == null) {
                l.b();
            }
            TabChangeManager.a.a(activity).a("HOME", false);
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("tab");
            if (l.a((Object) "UNLOGIN_NOTIFICATION", (Object) string)) {
                return "3426";
            }
            if (l.a((Object) "UNLOGIN_PROFILE", (Object) string)) {
                return "2706";
            }
            if (string != null) {
                return string;
            }
        }
        String simpleName = getClass().getSimpleName();
        l.b(simpleName, "");
        return simpleName;
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        com.bytedance.analytics.b.a(this);
    }

    @r
    public final void onEvent(a aVar) {
        l.d(aVar, "");
        if (!this.f79381a) {
            e activity = getActivity();
            if (activity == null) {
                l.b();
            }
            TabChangeManager.a.a(activity).a("HOME", false);
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            int id = view.getId();
            if (id == R.id.zs) {
                com.ss.android.ugc.aweme.login.c.a(this, e(), g(), new b(this));
                d.a(e(), g());
            } else if (id == R.id.dzl) {
                e activity = getActivity();
                if (in.d()) {
                    str = "//childrenmode/setting";
                } else {
                    str = "//setting";
                }
                SmartRouter.buildRoute(activity, str).open();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i2;
        int i3;
        int identifier;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        view.setOnTouchListener(View$OnTouchListenerC1848c.f79384a);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("tab");
        } else {
            str = null;
        }
        this.f79381a = TextUtils.equals(str, "UNLOGIN_NOTIFICATION");
        l.d(view, "");
        Context context = getContext();
        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            i2 = 0;
        } else {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i2 > 0) {
            View a2 = a(R.id.b_u);
            l.b(a2, "");
            a2.getLayoutParams().height = i2;
        } else {
            View a3 = a(R.id.b_u);
            l.b(a3, "");
            a3.setVisibility(8);
        }
        if (this.f79381a) {
            DmtTextView dmtTextView = (DmtTextView) a(R.id.f9l);
            l.b(dmtTextView, "");
            Context context2 = view.getContext();
            if (com.ss.android.ugc.aweme.inbox.b.b.b()) {
                i3 = R.string.dkh;
            } else {
                i3 = R.string.apw;
            }
            dmtTextView.setText(context2.getText(i3));
            TuxTextView tuxTextView = (TuxTextView) a(R.id.bg8);
            l.b(tuxTextView, "");
            tuxTextView.setText(view.getContext().getText(R.string.apv));
            ((ImageView) a(R.id.bmk)).setImageResource(2131232136);
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) a(R.id.f9l);
            l.b(dmtTextView2, "");
            dmtTextView2.setText(view.getContext().getText(R.string.ez5));
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.bg8);
            l.b(tuxTextView2, "");
            tuxTextView2.setText(view.getContext().getText(R.string.ez4));
            ((ImageView) a(R.id.bmk)).setImageResource(2131232135);
            TuxIconView tuxIconView = (TuxIconView) a(R.id.dzl);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
        }
        ((TuxButton) a(R.id.zs)).setOnClickListener(this);
        ((TuxIconView) a(R.id.dzl)).setOnClickListener(this);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a3p, viewGroup, false);
    }
}
