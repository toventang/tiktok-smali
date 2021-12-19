package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a;
import com.ss.android.ugc.aweme.im.sdk.share.data.model.PureDataSharePackage;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class GroupInviteCardContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @c(a = "expired_at")
    private Long expiredAt;
    @c(a = "group")
    private a group;
    @c(a = "invite_id")
    private String inviteId;

    static {
        Covode.recordClassIndex(64037);
    }

    public static final GroupInviteCardContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(64038);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final GroupInviteCardContent fromSharePackage(SharePackage sharePackage) {
            l.d(sharePackage, "");
            GroupInviteCardContent groupInviteCardContent = new GroupInviteCardContent();
            groupInviteCardContent.type = 103301;
            Bundle bundle = sharePackage.f124595i;
            groupInviteCardContent.setInviteId(bundle.getString("invite_id"));
            groupInviteCardContent.setExpiredAt(Long.valueOf(bundle.getLong("expired_at", 0)));
            Serializable serializable = bundle.getSerializable("group");
            if (!(serializable instanceof a)) {
                serializable = null;
            }
            groupInviteCardContent.setGroup((a) serializable);
            return groupInviteCardContent;
        }
    }

    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    public final a getGroup() {
        return this.group;
    }

    public final String getInviteId() {
        return this.inviteId;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final SharePackage generateSharePackage() {
        SharePackage a2 = PureDataSharePackage.a.a("group");
        Bundle bundle = a2.f124595i;
        bundle.putString("invite_id", this.inviteId);
        Long l2 = this.expiredAt;
        if (l2 != null) {
            bundle.putLong("expired_at", l2.longValue());
        }
        bundle.putSerializable("group", String.valueOf(this.group));
        return a2;
    }

    public final void setExpiredAt(Long l2) {
        this.expiredAt = l2;
    }

    public final void setGroup(a aVar) {
        this.group = aVar;
    }

    public final void setInviteId(String str) {
        this.inviteId = str;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String getQuoteHint(Context context) {
        l.d(context, "");
        String string = context.getResources().getString(R.string.cgw);
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public final String wrapMsgHint(boolean z, boolean z2, String str) {
        Context a2 = d.a();
        if (z || z2) {
            String string = d.a().getString(R.string.a_w);
            l.b(string, "");
            return string;
        }
        String string2 = a2.getString(R.string.fkm);
        l.b(string2, "");
        return string2;
    }
}
