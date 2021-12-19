package com.ss.android.ugc.aweme.dsp.library;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.dd.d;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

public final class l implements IAccountService.b {

    /* renamed from: a  reason: collision with root package name */
    View f83356a;

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f83357b;

    /* renamed from: c  reason: collision with root package name */
    private final float f83358c = 52.0f;

    /* renamed from: d  reason: collision with root package name */
    private View f83359d;

    static {
        Covode.recordClassIndex(52007);
    }

    private void c() {
        View view = this.f83359d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        IAccountUserService g2 = b.g();
        h.f.b.l.b(g2, "");
        if (!g2.isLogin()) {
            b();
        } else {
            c();
        }
    }

    private void b() {
        ViewStub viewStub;
        View inflate;
        int i2;
        int identifier;
        MethodCollector.i(286);
        if (this.f83359d == null) {
            View view = this.f83356a;
            View view2 = null;
            if (!(view == null || (viewStub = (ViewStub) view.findViewById(R.id.c_j)) == null || (inflate = viewStub.inflate()) == null)) {
                h.f.b.l.d(inflate, "");
                View findViewById = inflate.findViewById(R.id.bmk);
                View findViewById2 = inflate.findViewById(R.id.zs);
                if (findViewById != null) {
                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                    if (layoutParams != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i3 = Build.VERSION.SDK_INT;
                        Context context = this.f83357b.getContext();
                        if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                            i2 = 0;
                        } else {
                            i2 = context.getResources().getDimensionPixelSize(identifier);
                        }
                        marginLayoutParams.topMargin = i2 + ((int) n.b(this.f83357b.getContext(), this.f83358c));
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        MethodCollector.o(286);
                        throw nullPointerException;
                    }
                }
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new a(this));
                }
                view2 = inflate;
            }
            this.f83359d = view2;
        }
        View view3 = this.f83359d;
        if (view3 != null) {
            view3.setVisibility(0);
            MethodCollector.o(286);
            return;
        }
        MethodCollector.o(286);
    }

    public l(Fragment fragment) {
        h.f.b.l.d(fragment, "");
        this.f83357b = fragment;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f83360a;

        static {
            Covode.recordClassIndex(52008);
        }

        a(l lVar) {
            this.f83360a = lVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c.a(this.f83360a.f83357b, "my_playlist", "click_mine");
            d.a("my_playlist", "click_mine");
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        a();
    }
}
