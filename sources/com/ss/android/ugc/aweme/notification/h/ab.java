package com.ss.android.ugc.aweme.notification.h;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.m;
import com.ss.android.ugc.aweme.notification.h.p;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.List;

public final class ab extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f113488a;

    /* renamed from: b  reason: collision with root package name */
    private final View f113489b;

    /* renamed from: c  reason: collision with root package name */
    private final AvatarImageWithVerify f113490c;

    /* renamed from: d  reason: collision with root package name */
    private final AvatarImageView f113491d;

    /* renamed from: e  reason: collision with root package name */
    private final AvatarImageView f113492e;

    /* renamed from: f  reason: collision with root package name */
    private final TextView f113493f;
    private final TextView q;
    private final RemoteImageView r;
    private m s;
    private boolean t = true;
    private BaseNotice u;

    static {
        Covode.recordClassIndex(72977);
    }

    private static boolean c() {
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
        this.f113487h.a(this.f113648j, new a(this));
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ab this$0;

        static {
            Covode.recordClassIndex(72978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ab abVar) {
            super(0);
            this.this$0 = abVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.this$0.f113649k;
            String str = this.this$0.f113650l;
            l.b(str, "");
            e.a("pollsticker", i2, str, this.this$0.f113487h.a(), this.this$0.f113648j.templateId);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ab(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113488a = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        this.f113489b = findViewById2;
        View findViewById3 = view.findViewById(R.id.cx8);
        l.b(findViewById3, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById3;
        this.f113490c = avatarImageWithVerify;
        View findViewById4 = view.findViewById(R.id.cx_);
        l.b(findViewById4, "");
        this.f113491d = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cxa);
        l.b(findViewById5, "");
        this.f113492e = (AvatarImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cxm);
        l.b(findViewById6, "");
        this.f113493f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.cwx);
        l.b(findViewById7, "");
        this.q = (TextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.cwz);
        l.b(findViewById8, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById8;
        this.r = remoteImageView;
        j.b(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(findViewById2);
        com.ss.android.ugc.aweme.notification.g.a.a(remoteImageView);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        remoteImageView.setOnClickListener(this);
        ((com.facebook.drawee.f.a) remoteImageView.getHierarchy()).c(R.color.f159922f);
        j.a(remoteImageView);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        Integer valueOf;
        List<? extends User> list;
        User user;
        String uid;
        List<? extends User> list2;
        User user2;
        String secUid;
        ClickAgent.onClick(view);
        d.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107229h = c();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.de8).b();
            return;
        }
        m mVar = this.s;
        if (mVar != null && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.cwz || valueOf.intValue() == R.id.cx6 || valueOf.intValue() == R.id.cxx) {
                String str = mVar.f112884g;
                a("pollsticker", getLayoutPosition());
                t.a(t.a(), u.a(str).a("refer", "message").f71178a.a());
            } else if (valueOf.intValue() == R.id.cx8 && (list = mVar.f112878a) != null && (user = (User) n.h((List) list)) != null && (uid = user.getUid()) != null && (list2 = mVar.f112878a) != null && (user2 = (User) n.h((List) list2)) != null && (secUid = user2.getSecUid()) != null) {
                p.a.a(uid, secUid, false, null, null, 56);
            }
        }
    }

    public final void a(BaseNotice baseNotice, boolean z, String str, String str2) {
        List<? extends User> list;
        int size;
        String string;
        List<String> urlList;
        l.d(baseNotice, "");
        l.d(str2, "");
        if (baseNotice.voteNotice != null) {
            this.u = baseNotice;
            this.t = z;
            m mVar = baseNotice.voteNotice;
            this.s = mVar;
            if (mVar != null && (list = mVar.f112878a) != null && (size = list.size()) > 0) {
                a(this.f113493f, list, 3, mVar.f112881d, this.u, z, str, str2);
                if (size == 1) {
                    this.f113490c.setVisibility(0);
                    this.f113491d.setVisibility(8);
                    this.f113492e.setVisibility(8);
                    this.f113490c.setUserData(new UserVerify(((User) list.get(0)).getAvatarThumb(), ((User) list.get(0)).getCustomVerify(), ((User) list.get(0)).getEnterpriseVerifyReason(), Integer.valueOf(((User) list.get(0)).getVerificationType())));
                    this.f113489b.setVisibility(8);
                    this.f113490c.a();
                } else {
                    this.f113489b.setVisibility(0);
                    this.f113490c.setVisibility(8);
                    this.f113491d.setVisibility(0);
                    this.f113492e.setVisibility(0);
                    com.ss.android.ugc.aweme.base.e.a(this.f113491d, ((User) list.get(0)).getAvatarThumb());
                    com.ss.android.ugc.aweme.base.e.a(this.f113492e, ((User) list.get(1)).getAvatarThumb());
                }
                if (size == 1) {
                    string = this.f113647i.getString(R.string.hdg, mVar.f112880c);
                } else {
                    string = this.f113647i.getString(R.string.hde);
                }
                q.a(this.q, new SpannableStringBuilder(string), baseNotice, 7, com.bytedance.common.utility.n.a(this.f113647i) - ((int) com.bytedance.common.utility.n.b(this.f113647i, 148.0f)));
                UrlModel urlModel = mVar.f112879b;
                if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
                    this.r.setImageDrawable(androidx.core.content.b.a(this.f113647i, (int) R.color.f159922f));
                } else {
                    com.ss.android.ugc.aweme.base.e.a(this.r, urlModel);
                }
            }
        }
    }
}
