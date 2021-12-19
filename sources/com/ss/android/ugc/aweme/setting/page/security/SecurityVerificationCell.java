package com.ss.android.ugc.aweme.setting.page.security;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import b.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class SecurityVerificationCell extends RightTextCell<f> {

    /* renamed from: b  reason: collision with root package name */
    private final h f122545b = i.a((h.f.a.a) new c(this));

    static {
        Covode.recordClassIndex(80395);
    }

    private final SecurityViewModel b() {
        return (SecurityViewModel) this.f122545b.getValue();
    }

    static final class c extends m implements h.f.a.a<SecurityViewModel> {
        final /* synthetic */ SecurityVerificationCell this$0;

        static {
            Covode.recordClassIndex(80398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SecurityVerificationCell securityVerificationCell) {
            super(0);
            this.this$0 = securityVerificationCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SecurityViewModel invoke() {
            return PowerCell.b(this.this$0, SecurityViewModel.class);
        }
    }

    static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecurityVerificationCell f122546a;

        static {
            Covode.recordClassIndex(80396);
        }

        a(SecurityVerificationCell securityVerificationCell) {
            this.f122546a = securityVerificationCell;
        }

        @Override // b.g
        public final Object then(b.i<Boolean> iVar) {
            int i2;
            if (!ai.a(iVar)) {
                return null;
            }
            l.b(iVar, "");
            Boolean d2 = iVar.d();
            if (d2 != null) {
                com.ss.android.ugc.aweme.setting.page.base.c cVar = (com.ss.android.ugc.aweme.setting.page.base.c) this.f122546a.f34234d;
                if (cVar != null) {
                    if (l.a((Object) d2, (Object) true)) {
                        i2 = R.string.g6k;
                    } else {
                        i2 = R.string.g6i;
                    }
                    cVar.f122445b = i2;
                }
                this.f122546a.a();
            }
            return null;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecurityVerificationCell f122547a;

        static {
            Covode.recordClassIndex(80397);
        }

        b(SecurityVerificationCell securityVerificationCell) {
            this.f122547a = securityVerificationCell;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                SecurityVerificationCell securityVerificationCell = this.f122547a;
                com.ss.android.ugc.aweme.account.b.a();
                com.ss.android.ugc.aweme.account.b.f62864a.m().getTwoStepVerificationStatusFromNetwork().a(new a(securityVerificationCell), b.i.f4826c, null);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void a(Object obj) {
        SecurityViewModel b2;
        t<Boolean> tVar;
        super.k();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationItem");
        this.f34234d = (f) obj;
        androidx.lifecycle.m i2 = i();
        if (i2 != null && (b2 = b()) != null && (tVar = b2.f122548a) != null) {
            tVar.observe(i2, new b(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        String str;
        int i2;
        l.d(view, "");
        super.onClick(view);
        View view2 = this.itemView;
        String str2 = null;
        if (!(view2 instanceof CommonItemView)) {
            view2 = null;
        }
        CommonItemView commonItemView = (CommonItemView) view2;
        if (commonItemView != null) {
            CharSequence textRight = commonItemView.getTextRight();
            Activity activity = ((RightTextCell) this).f122434a;
            if (activity != null) {
                str = activity.getString(R.string.g6k);
            } else {
                str = null;
            }
            if (l.a((Object) textRight, (Object) str)) {
                i2 = 1;
            } else {
                Activity activity2 = ((RightTextCell) this).f122434a;
                if (activity2 != null) {
                    str2 = activity2.getString(R.string.g6i);
                }
                if (l.a((Object) textRight, (Object) str2)) {
                    i2 = 0;
                } else {
                    i2 = -1;
                }
            }
            r.a("click_2_step_authentication", new d().a("state", i2).f66730a);
            SecurityViewModel b2 = b();
            if (b2 != null) {
                b2.f122549b = true;
            }
            Activity activity3 = ((RightTextCell) this).f122434a;
            if (activity3 != null) {
                com.ss.android.ugc.aweme.account.b.a();
                com.ss.android.ugc.aweme.account.b.f62864a.m().openTwoStepVerificationManageActivity(activity3, "setting_security");
            }
        }
    }
}
