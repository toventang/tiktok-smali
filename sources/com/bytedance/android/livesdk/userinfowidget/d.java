package com.bytedance.android.livesdk.userinfowidget;

import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.d.a;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21966a;

    static {
        Covode.recordClassIndex(12929);
    }

    d(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21966a = liveRoomUserInfoWidget;
    }

    public final void run() {
        String str;
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = this.f21966a;
        if (liveRoomUserInfoWidget.isViewValid()) {
            User owner = liveRoomUserInfoWidget.q.getOwner();
            if (owner != null) {
                liveRoomUserInfoWidget.f21931d.setVAble(false);
                if (liveRoomUserInfoWidget.s || liveRoomUserInfoWidget.z == null || !liveRoomUserInfoWidget.z.isMicRoomForCurrentRoom() || liveRoomUserInfoWidget.q.officialChannelInfo == null || liveRoomUserInfoWidget.q.officialChannelInfo.f18978a == null) {
                    if (!liveRoomUserInfoWidget.v && owner.getAvatarThumb() != null) {
                        liveRoomUserInfoWidget.v = true;
                        g.a(liveRoomUserInfoWidget.f21931d, owner.getAvatarThumb(), 2131234425);
                    }
                    liveRoomUserInfoWidget.f21933f.setText(com.bytedance.android.livesdk.ac.g.b(owner));
                } else {
                    if (!liveRoomUserInfoWidget.v && liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.getAvatarThumb() != null) {
                        liveRoomUserInfoWidget.v = true;
                        g.a(liveRoomUserInfoWidget.f21931d, liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.getAvatarThumb(), 2131234425);
                    }
                    liveRoomUserInfoWidget.f21933f.setText(liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.displayId);
                }
                liveRoomUserInfoWidget.a(a.a(owner));
                liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.UNFOLLOW);
                if (liveRoomUserInfoWidget.s || liveRoomUserInfoWidget.z == null || liveRoomUserInfoWidget.q.officialChannelInfo == null || liveRoomUserInfoWidget.q.officialChannelInfo.f18978a == null || !liveRoomUserInfoWidget.z.isMicRoomForCurrentRoom()) {
                    if (owner.isFollowing()) {
                        liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.FOLLOWED);
                    }
                } else if (liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.getFollowInfo().getFollowStatus() == 1 || liveRoomUserInfoWidget.q.officialChannelInfo.f18978a.getFollowInfo().getFollowStatus() == 2) {
                    liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.FOLLOWED);
                }
                if (u.a().b().c() == owner.getId()) {
                    liveRoomUserInfoWidget.a(LiveRoomUserInfoWidget.a.FOLLOWED);
                }
                if (owner.getAuthenticationInfo() != null) {
                    n.a(liveRoomUserInfoWidget.f21934g, 0);
                    p.a(liveRoomUserInfoWidget.f21934g, owner.getAuthenticationInfo().f19067c, 0, new p.a.C0135a() {
                        /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(12919);
                        }

                        @Override // com.bytedance.android.live.core.f.p.a.C0135a
                        public final void a(boolean z) {
                            int i2;
                            ImageView imageView = LiveRoomUserInfoWidget.this.f21934g;
                            if (z) {
                                i2 = 0;
                            } else {
                                i2 = 8;
                            }
                            n.a(imageView, i2);
                        }
                    });
                    if (liveRoomUserInfoWidget.w != liveRoomUserInfoWidget.q.getId()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_id", owner.getIdStr());
                        hashMap.put("room_id", liveRoomUserInfoWidget.q.getIdStr());
                        hashMap.put("show_type", "nickname_anchor");
                        hashMap.put("live_type", liveRoomUserInfoWidget.q.getStreamType().logStreamingType);
                        hashMap.put("enter_from_merge", e.a());
                        hashMap.put("enter_method", e.d());
                        b a2 = u.a().b().a();
                        if (a2.getId() == owner.getId()) {
                            str = "anchor";
                        } else {
                            str = (a2.getUserAttr() == null || !a2.getUserAttr().f19030b) ? "viewer" : "admin";
                        }
                        hashMap.put("admin_type", str);
                        b.a.a("livesdk_authentication_icon_show").a().a((Map<String, String>) hashMap).b();
                    }
                } else {
                    n.a(liveRoomUserInfoWidget.f21934g, 8);
                    liveRoomUserInfoWidget.f21934g.setImageDrawable(null);
                }
            }
            liveRoomUserInfoWidget.w = liveRoomUserInfoWidget.q.getId();
            liveRoomUserInfoWidget.show();
        }
    }
}
