package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class o extends a<GroupInviteCardContent> {

    /* renamed from: a  reason: collision with root package name */
    private CircleImageView f101451a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f101452b;
    private TextView x;

    static {
        Covode.recordClassIndex(64874);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        Object a2 = a(R.id.icon_iv);
        l.b(a2, "");
        this.f101451a = (CircleImageView) a2;
        Object a3 = a(R.id.title_tv);
        l.b(a3, "");
        this.f101452b = (TextView) a3;
        Object a4 = a(R.id.akl);
        l.b(a4, "");
        this.x = (TextView) a4;
        Object a5 = a(R.id.adh);
        l.b(a5, "");
        this.o = a.C2518a.a((View) a5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, GroupInviteCardContent groupInviteCardContent, int i2) {
        String str;
        String name;
        String str2 = "";
        l.d(aiVar, str2);
        super.a(aiVar, aiVar2, (BaseContent) groupInviteCardContent, i2);
        if (groupInviteCardContent != null) {
            CircleImageView circleImageView = this.f101451a;
            if (circleImageView == null) {
                l.a("icon");
            }
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group = groupInviteCardContent.getGroup();
            if (group != null) {
                str = group.getAvatarUrl();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(circleImageView, str);
            TextView textView = this.f101452b;
            if (textView == null) {
                l.a("tvTitle");
            }
            textView.setText(d.a().getString(R.string.c8c));
            TextView textView2 = this.x;
            if (textView2 == null) {
                l.a("tvContent");
            }
            a.C0730a aVar = new a.C0730a();
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group2 = groupInviteCardContent.getGroup();
            if (!(group2 == null || (name = group2.getName()) == null)) {
                str2 = name;
            }
            textView2.setText(aVar.a(str2).f33382a);
        }
        this.o.a(50331648, 46);
        this.o.a(67108864, this.s);
    }
}
