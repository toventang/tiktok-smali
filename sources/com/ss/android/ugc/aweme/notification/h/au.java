package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class au extends p {

    /* renamed from: a  reason: collision with root package name */
    private TuxTextView f113582a;

    /* renamed from: b  reason: collision with root package name */
    private TuxIconView f113583b;

    static {
        Covode.recordClassIndex(73016);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f113582a.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public au(View view, final BaseNotificationVM baseNotificationVM) {
        super(view);
        l.d(view, "");
        l.d(baseNotificationVM, "");
        View findViewById = view.findViewById(R.id.f3c);
        l.b(findViewById, "");
        this.f113582a = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.f0k);
        l.b(findViewById2, "");
        TuxIconView tuxIconView = (TuxIconView) findViewById2;
        this.f113583b = tuxIconView;
        tuxIconView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.notification.h.au.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ au f113584a;

            static {
                Covode.recordClassIndex(73017);
            }

            {
                this.f113584a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                IRecommendUsersService j2 = IRecommendUsersServiceImpl.j();
                Context context = this.f113584a.f113647i;
                Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                j2.a((e) context);
                String b2 = baseNotificationVM.b();
                l.d(b2, "");
                r.a("click_suggested_account_information", new d().a("enter_from", "notification_page").a("tab_name", b2).f66730a);
            }
        });
    }
}
