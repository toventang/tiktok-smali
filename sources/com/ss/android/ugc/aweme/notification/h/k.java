package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.app.d;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.e.c;
import com.ss.android.ugc.aweme.notification.utils.f;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;

public abstract class k extends a implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final u<Boolean> f113646a = new l(this);

    /* renamed from: i  reason: collision with root package name */
    public Context f113647i;

    /* renamed from: j  reason: collision with root package name */
    public BaseNotice f113648j;

    /* renamed from: k  reason: collision with root package name */
    protected int f113649k;

    /* renamed from: l  reason: collision with root package name */
    protected String f113650l;

    static {
        Covode.recordClassIndex(73066);
    }

    /* access modifiers changed from: protected */
    public abstract int bX_();

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.a
    public boolean e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void g() {
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public void d() {
        super.d();
        if (this.f113487h instanceof NotificationVM) {
            this.f113487h.e().removeObserver(this.f113646a);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public void bY_() {
        c.HandlerC2905c b2;
        super.bY_();
        g();
        if (this.f113487h instanceof NotificationVM) {
            this.f113487h.e().observe((d) this.f113647i, this.f113646a);
        }
        if (this.f113648j != null && (b2 = c.b()) != null) {
            com.ss.android.ugc.aweme.notification.e.d.a(new c.HandlerC2905c.e(b2, this.f113648j, getLayoutPosition()));
        }
    }

    public k(View view) {
        super(view);
        this.f113647i = view.getContext();
        View findViewById = view.findViewById(bX_());
        if (findViewById != null && e()) {
            findViewById.setOnLongClickListener(this);
        }
    }

    public static String a(BaseNotice baseNotice, Context context) {
        return a(baseNotice.createTime, context);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        a(spannableStringBuilder, baseNotice, this.f113647i);
    }

    public final void a(BaseNotice baseNotice, int i2) {
        this.f113648j = baseNotice;
        this.f113649k = i2;
        this.f113650l = f.a(baseNotice.timeLineType);
    }

    public static String a(long j2, Context context) {
        String str;
        if (j2 == 0) {
            return "";
        }
        if (b.a().a(true, "standardize_timestamp", false)) {
            StringBuilder sb = new StringBuilder(" ");
            aa.a aVar = aa.s;
            str = sb.append(aa.a.a(j2 * 1000)).toString();
        } else {
            str = " " + ib.b(context, j2 * 1000);
        }
        String replaceAll = str.replaceAll("(.)", "$1⁠");
        if (!gb.a(context)) {
            return "‭" + replaceAll + (char) 8237;
        }
        return replaceAll;
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i2) {
        a(str, i2, (String) null);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, Context context) {
        int i2;
        String a2 = a(baseNotice, context);
        if (a2.indexOf(8237) >= 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (!TextUtils.isEmpty(a2)) {
            spannableStringBuilder.append((CharSequence) a2);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.bz)), (spannableStringBuilder.length() - a2.length()) + i2, spannableStringBuilder.length(), 17);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, int i2, String str2) {
        String str3;
        BaseNotice baseNotice = this.f113648j;
        if (baseNotice != null) {
            str3 = baseNotice.templateId;
        } else {
            str3 = "";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("action_type", "click").a("account_type", str).a("client_order", String.valueOf(i2)).a("template_id", str3);
        if (!TextUtils.isEmpty(str2)) {
            a2.a("button_type", str2);
        }
        r.a("notification_message_inner_message", a2.f66730a);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, BaseNotice baseNotice, String str3, String str4, User user) {
        a(str, str2, baseNotice.clientOrder, baseNotice, "", str4, str3, baseNotice.hasRead ? 1 : 0, user);
    }
}
