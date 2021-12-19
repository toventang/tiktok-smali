package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b;

import android.view.View;
import android.widget.TextView;
import com.airbnb.epoxy.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxRadio;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;

public abstract class a extends t<C2528a> {

    /* renamed from: h  reason: collision with root package name */
    public IMUser f101640h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f101641i;

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.b<? super IMUser, z> f101642j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.a$a  reason: collision with other inner class name */
    public static final class C2528a extends c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f101643a = {new y(C2528a.class, "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", 0), new y(C2528a.class, "nickName", "getNickName()Landroid/widget/TextView;", 0), new y(C2528a.class, "friendTag", "getFriendTag()Landroid/widget/TextView;", 0), new y(C2528a.class, "detail", "getDetail()Landroid/widget/TextView;", 0), new y(C2528a.class, "checkRadio", "getCheckRadio()Lcom/bytedance/tux/input/TuxRadio;", 0)};

        /* renamed from: b  reason: collision with root package name */
        final d f101644b = a((int) R.id.a5r);

        /* renamed from: c  reason: collision with root package name */
        final d f101645c = a((int) R.id.a5u);

        /* renamed from: d  reason: collision with root package name */
        final d f101646d = a((int) R.id.a5t);

        /* renamed from: e  reason: collision with root package name */
        final d f101647e = a((int) R.id.a5s);

        /* renamed from: f  reason: collision with root package name */
        final d f101648f = a((int) R.id.a5v);

        static {
            Covode.recordClassIndex(65011);
        }
    }

    static {
        Covode.recordClassIndex(65010);
    }

    @Override // com.airbnb.epoxy.s
    public final int b() {
        return R.layout.a52;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IMUser f101649a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f101650b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2528a f101651c;

        static {
            Covode.recordClassIndex(65012);
        }

        b(IMUser iMUser, a aVar, C2528a aVar2) {
            this.f101649a = iMUser;
            this.f101650b = aVar;
            this.f101651c = aVar2;
        }

        public final void onClick(View view) {
            h.f.a.b<? super IMUser, z> bVar;
            ClickAgent.onClick(view);
            if (!this.f101650b.f101641i && (bVar = this.f101650b.f101642j) != null) {
                bVar.invoke(this.f101649a);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(C2528a aVar) {
        l.d(aVar, "");
        IMUser iMUser = this.f101640h;
        if (iMUser != null) {
            int i2 = 0;
            e.a((AvatarImageView) aVar.f101644b.a(aVar, C2528a.f101643a[0]), iMUser.getAvatarThumb());
            ((TextView) aVar.f101645c.a(aVar, C2528a.f101643a[1])).setText(iMUser.getNickName());
            TextView textView = (TextView) aVar.f101646d.a(aVar, C2528a.f101643a[2]);
            if (iMUser.getFollowStatus() != 2) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            ((TextView) aVar.f101647e.a(aVar, C2528a.f101643a[3])).setText(iMUser.getUniqueId());
            ((TuxRadio) aVar.f101648f.a(aVar, C2528a.f101643a[4])).setChecked(this.f101641i);
            aVar.a().setOnClickListener(new b(iMUser, this, aVar));
        }
    }
}
