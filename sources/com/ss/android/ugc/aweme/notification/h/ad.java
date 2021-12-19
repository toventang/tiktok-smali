package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.l;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.z;

public final class ad extends k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f113499a;

    /* renamed from: b  reason: collision with root package name */
    private AvatarImageWithVerify f113500b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f113501c;

    /* renamed from: d  reason: collision with root package name */
    private NotificationFollowUserBtn f113502d;

    /* renamed from: e  reason: collision with root package name */
    private FriendNotice f113503e;

    /* renamed from: f  reason: collision with root package name */
    private Context f113504f;

    /* renamed from: m  reason: collision with root package name */
    private a f113505m = new a(this.f113502d, null);

    static {
        Covode.recordClassIndex(72980);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final int bX_() {
        return R.id.cx3;
    }

    private static boolean h() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        this.f113487h.a(this.f113648j, new ae(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c() {
        e.a("friend", this.f113649k, this.f113650l, this.f113487h.a(), this.f113648j.templateId);
        return null;
    }

    public ad(View view) {
        super(view);
        this.f113504f = view.getContext();
        this.f113499a = (RelativeLayout) view.findViewById(R.id.cx3);
        this.f113500b = (AvatarImageWithVerify) view.findViewById(R.id.cx2);
        this.f113501c = (TextView) view.findViewById(R.id.cwx);
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) view.findViewById(R.id.cww);
        this.f113502d = notificationFollowUserBtn;
        notificationFollowUserBtn.getLayoutParams().width = g.a(this.f113647i);
        g.a(this.f113499a);
        g.a(this.f113500b);
        com.ss.android.ugc.aweme.notification.g.a.a(this.f113502d);
        this.f113499a.setOnClickListener(this);
        this.f113500b.setOnClickListener(this);
        this.f113500b.setRequestImgSize(em.a(101));
    }

    public final void a(MusNotice musNotice) {
        UserVerify userVerify;
        if (musNotice != null && musNotice.friendNotice != null) {
            FriendNotice friendNotice = musNotice.friendNotice;
            this.f113503e = friendNotice;
            User user = friendNotice.getUser();
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()));
            } else {
                userVerify = null;
            }
            this.f113500b.setUserData(userVerify);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String a2 = l.a(this.f113503e.getUser());
            if (a2 != null) {
                spannableStringBuilder.append((CharSequence) a2);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append((CharSequence) this.f113504f.getString(R.string.d_0));
            a(spannableStringBuilder, musNotice);
            this.f113501c.setText(spannableStringBuilder);
            this.f113502d.setFollowStatus(this.f113503e.getUser().getFollowStatus());
            a aVar = this.f113505m;
            if (aVar != null) {
                aVar.a(this.f113503e.getUser());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = h();
        }
        if (!j.f107229h) {
            new b(this.itemView).e(R.string.de8).b();
            return;
        }
        int id = view.getId();
        if (id == R.id.cx3 || id == R.id.cww) {
            a("friend", getLayoutPosition());
            t.a(t.a(), u.a(this.f113503e.getOpenUrl()).a("enter_from", "message").f71178a.a());
        } else if (id == R.id.cx2) {
            t.a(t.a(), u.a(this.f113503e.getOpenUrl()).a("enter_from", "message").f71178a.a());
        }
    }
}
