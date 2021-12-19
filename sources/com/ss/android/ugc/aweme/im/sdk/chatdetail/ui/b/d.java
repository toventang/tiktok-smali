package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.epoxy.q;
import com.airbnb.epoxy.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.proto.GroupRole;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;

public abstract class d extends t<a> {

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a f101659h;

    /* renamed from: i  reason: collision with root package name */
    public h.f.a.a<z> f101660i;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101661a = {new y(a.class, "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new y(a.class, "nickname", "getNickname()Landroid/widget/TextView;", 0), new y(a.class, "relationShipTag", "getRelationShipTag()Landroid/widget/TextView;", 0), new y(a.class, "adminTag", "getAdminTag()Landroid/widget/TextView;", 0), new y(a.class, "userId", "getUserId()Landroid/widget/TextView;", 0), new y(a.class, "actionButton", "getActionButton()Landroid/widget/ImageView;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final h.h.d f101662b = a((int) R.id.bkk);

        /* renamed from: c  reason: collision with root package name */
        final h.h.d f101663c = a((int) R.id.bkn);

        /* renamed from: d  reason: collision with root package name */
        final h.h.d f101664d = a((int) R.id.bko);

        /* renamed from: e  reason: collision with root package name */
        final h.h.d f101665e = a((int) R.id.bkl);

        /* renamed from: f  reason: collision with root package name */
        private final h.h.d f101666f = a((int) R.id.bkj);

        /* renamed from: h  reason: collision with root package name */
        private final h.h.d f101667h = a((int) R.id.bki);

        static {
            Covode.recordClassIndex(65019);
        }

        public final TextView b() {
            return (TextView) this.f101666f.a(this, f101661a[3]);
        }

        public final ImageView c() {
            return (ImageView) this.f101667h.a(this, f101661a[5]);
        }
    }

    static {
        Covode.recordClassIndex(65018);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a88;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f101668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101669b;

        static {
            Covode.recordClassIndex(65020);
        }

        b(d dVar, a aVar) {
            this.f101668a = dVar;
            this.f101669b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.a<z> aVar = this.f101668a.f101660i;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IMUser f101670a;

        static {
            Covode.recordClassIndex(65021);
        }

        c(IMUser iMUser) {
            this.f101670a = iMUser;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(this.f101670a.getUid(), "member_list", null);
            com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(this.f101670a.getUid(), "member_list");
        }
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        ah member;
        IMUser user;
        int i2;
        l.d(aVar, "");
        super.a((q) aVar);
        if (this.f101659h != null) {
            v.a(aVar.a());
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar2 = this.f101659h;
            if (!(aVar2 == null || (user = aVar2.getUser()) == null)) {
                e.a((RemoteImageView) aVar.f101662b.a(aVar, a.f101661a[0]), user.getAvatarThumb());
                ((TextView) aVar.f101663c.a(aVar, a.f101661a[1])).setText(user.getNickName());
                ((TextView) aVar.f101665e.a(aVar, a.f101661a[4])).setText(user.getUniqueId());
                TextView textView = (TextView) aVar.f101664d.a(aVar, a.f101661a[2]);
                if (user.getFollowStatus() != 2 || !(!l.a((Object) user.getSecUid(), (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.c()))) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a(user)) {
                    aVar.c().setVisibility(8);
                } else {
                    aVar.c().setVisibility(0);
                    aVar.c().setOnClickListener(new b(this, aVar));
                }
                aVar.a().setOnClickListener(new c(user));
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar3 = this.f101659h;
            if (aVar3 != null && (member = aVar3.getMember()) != null) {
                if (member.getRole() == GroupRole.OWNER.getValue()) {
                    aVar.b().setVisibility(0);
                } else {
                    aVar.b().setVisibility(8);
                }
            }
        }
    }
}
