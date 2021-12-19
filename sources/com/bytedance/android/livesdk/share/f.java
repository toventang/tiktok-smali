package com.bytedance.android.livesdk.share;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.share.ShareApi;
import com.bytedance.android.live.share.a;
import com.bytedance.android.live.share.b;
import com.bytedance.android.live.share.c;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.utils.k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import f.a.t;

public class f implements c {
    private a shareCenter;

    static {
        Covode.recordClassIndex(12633);
    }

    public String getShareUrl(User user) {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.share.c
    public LiveWidget getShareWidget() {
        return new LiveShareWidget();
    }

    @Override // com.bytedance.android.live.share.c
    public b provideShareCountManager() {
        return new e();
    }

    @Override // com.bytedance.android.live.share.c
    public a share() {
        if (this.shareCenter == null) {
            this.shareCenter = new d((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class));
        }
        return this.shareCenter;
    }

    @Override // com.bytedance.android.live.share.c
    public boolean shareable(Room room) {
        if (room == null || room.getOwner() == null || room.getOwner().getSecret() == 1) {
            return false;
        }
        if (room.getRoomAuthStatus() == null || room.getRoomAuthStatus().isEnableShare()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.share.c
    public com.bytedance.android.live.p.f getShareBehavior(e eVar, Context context, i iVar, m mVar) {
        return new g(eVar, context, iVar, mVar);
    }

    @Override // com.bytedance.android.live.share.c
    public t<d<ShareReportResult>> sendShare(long j2, String str, int i2, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        return ((ShareApi) com.bytedance.android.live.network.e.a().a(ShareApi.class)).sendShare(j2, new k().a("target_id", "-1").a("share_type", String.valueOf(i2)).a("common_label_list", String.valueOf(str2)).a("to_user_ids", str3.replaceAll(" ", "")).f22332a).a(new com.bytedance.android.livesdk.util.rxutils.f());
    }
}
