package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.android.live.core.f.af;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.d.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.c.i;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.net.URLDecoder;

public class ae extends a<ShareLiveEventContent> {

    /* renamed from: a  reason: collision with root package name */
    private SmartAvatarImageView f101333a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f101334b;
    private TuxTextView x;
    private TuxTextView y;
    private TuxTextView z;

    static {
        Covode.recordClassIndex(64805);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public void a() {
        super.a();
        View findViewById = this.itemView.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.o = a.C2518a.a(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.ayf);
        l.b(findViewById2, "");
        this.f101334b = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.ayc);
        l.b(findViewById3, "");
        this.f101333a = (SmartAvatarImageView) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.ayg);
        l.b(findViewById4, "");
        this.x = (TuxTextView) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.aye);
        l.b(findViewById5, "");
        this.y = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.ei7);
        l.b(findViewById6, "");
        this.z = (TuxTextView) findViewById6;
    }

    private static long a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ae(View view, b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    public void a(ai aiVar, ai aiVar2, ShareLiveEventContent shareLiveEventContent, int i2) {
        Uri uri;
        String decode;
        l.d(aiVar, "");
        l.d(shareLiveEventContent, "");
        super.a(aiVar, aiVar2, (BaseContent) shareLiveEventContent, i2);
        this.o.a(50331648, 45);
        this.o.a(67108864, shareLiveEventContent.getLinkUrl());
        this.o.a(50331649, shareLiveEventContent);
        this.o.a(150994945, false);
        String linkUrl = shareLiveEventContent.getLinkUrl();
        if (linkUrl == null || (decode = URLDecoder.decode(linkUrl)) == null) {
            uri = null;
        } else {
            uri = Uri.parse(decode);
            l.a((Object) uri, "");
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(shareLiveEventContent.getEventId(), af.a(uri, "is_paid_event"), "show");
        if (h.a(shareLiveEventContent.getLinkUrl()) || (i.a(shareLiveEventContent.getOrganizerAvatar(), i.a()))) {
            this.o.a(150994945, true);
            TuxTextView tuxTextView = this.f101334b;
            if (tuxTextView == null) {
                l.a("nameView");
            }
            tuxTextView.setText(R.string.co7);
            v a2 = r.a(2131232828);
            SmartAvatarImageView smartAvatarImageView = this.f101333a;
            if (smartAvatarImageView == null) {
                l.a("avatarView");
            }
            a2.E = smartAvatarImageView;
            a2.c();
            return;
        }
        TuxTextView tuxTextView2 = this.f101334b;
        if (tuxTextView2 == null) {
            l.a("nameView");
        }
        tuxTextView2.setText(shareLiveEventContent.getTitle());
        TuxTextView tuxTextView3 = this.x;
        if (tuxTextView3 == null) {
            l.a("timeView");
        }
        tuxTextView3.setText(aa.a.e(a(shareLiveEventContent.getStartTime())));
        TuxTextView tuxTextView4 = this.y;
        if (tuxTextView4 == null) {
            l.a("hosterView");
        }
        tuxTextView4.setText(shareLiveEventContent.getOrganizerName());
        v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(shareLiveEventContent.getOrganizerAvatar()));
        SmartAvatarImageView smartAvatarImageView2 = this.f101333a;
        if (smartAvatarImageView2 == null) {
            l.a("avatarView");
        }
        a3.E = smartAvatarImageView2;
        a3.c();
        View view = this.itemView;
        l.b(view, "");
        Context context = view.getContext();
        String organizerVerifyReason = shareLiveEventContent.getOrganizerVerifyReason();
        String organizerEnterprise = shareLiveEventContent.getOrganizerEnterprise();
        TuxTextView tuxTextView5 = this.y;
        if (tuxTextView5 == null) {
            l.a("hosterView");
        }
        io.a(context, organizerVerifyReason, organizerEnterprise, tuxTextView5);
    }
}
