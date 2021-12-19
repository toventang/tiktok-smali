package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.keva.Keva;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.api.d.d;
import com.ss.android.ugc.aweme.notification.bean.t;
import com.ss.android.ugc.aweme.notification.g.a;
import com.ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aq extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f113567a;

    /* renamed from: b  reason: collision with root package name */
    private final AvatarImageView f113568b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f113569c;

    /* renamed from: d  reason: collision with root package name */
    private final DmtButton f113570d;

    /* renamed from: e  reason: collision with root package name */
    private TutorialVideoViewModel f113571e;

    /* renamed from: f  reason: collision with root package name */
    private Context f113572f;
    private String q = "";
    private String r = "";

    static {
        Covode.recordClassIndex(73007);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.p
    public final int bX_() {
        return R.id.cxx;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private final void b(String str) {
        if (!TextUtils.isEmpty(this.q)) {
            r.a(str, new d().a("group_id", this.q).f66730a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113567a = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f113568b = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cwx);
        l.b(findViewById3, "");
        this.f113569c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cww);
        l.b(findViewById4, "");
        DmtButton dmtButton = (DmtButton) findViewById4;
        this.f113570d = dmtButton;
        g.a(findViewById);
        a.a(avatarImageView);
        a.a(dmtButton);
        dmtButton.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        dmtButton.getLayoutParams().width = g.a(this.f113647i);
        this.f113571e = new TutorialVideoViewModel();
        Context context = view.getContext();
        l.b(context, "");
        this.f113572f = context;
    }

    public final void a(t tVar) {
        if (tVar != null) {
            this.q = tVar.f113292a;
            this.r = tVar.f113297f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) tVar.f113294c);
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tVar.f113295d);
            this.f113569c.setText(spannableStringBuilder);
            e.b(this.f113568b, tVar.f113293b, -1, -1);
            this.f113570d.setText(tVar.f113296e);
            b("show_teach_video");
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.de8).b();
        } else if (!TextUtils.isEmpty(this.r)) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            Keva repo = Keva.getRepo("top_message_keva_repo");
            repo.storeLong("current_show_time_".concat(String.valueOf(curUserId)), System.currentTimeMillis());
            repo.storeInt("clicked_".concat(String.valueOf(curUserId)), 1);
            com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), u.a(this.r).f71178a.a());
            b("enter_teach_video");
            com.ss.android.ugc.aweme.notice.api.d.e eVar = (com.ss.android.ugc.aweme.notice.api.d.e) d.a.a(com.ss.android.ugc.aweme.notice.api.d.e.class);
            if (eVar != null) {
                eVar.b("");
                eVar.d("");
                eVar.f("");
                eVar.h("");
                eVar.j("");
                eVar.l("");
            }
        }
    }
}
