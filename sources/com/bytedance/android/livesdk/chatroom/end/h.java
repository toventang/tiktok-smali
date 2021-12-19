package com.bytedance.android.livesdk.chatroom.end;

import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class h extends a {

    /* renamed from: d  reason: collision with root package name */
    protected Room f15446d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f15447e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f15448f;

    /* renamed from: g  reason: collision with root package name */
    protected String f15449g;

    /* renamed from: h  reason: collision with root package name */
    public String f15450h;

    static {
        Covode.recordClassIndex(8531);
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    protected static void d() {
        com.bytedance.android.livesdk.an.a.a().a(new r(5));
    }

    /* access modifiers changed from: protected */
    public final void c() {
        Room room = this.f15446d;
        if (room != null && room.getOwner() != null) {
            User owner = this.f15446d.getOwner();
            com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
            if (aVar != null && aVar.isMicRoomForRoom(this.f15446d) && aVar.isMicAudienceForRoom(this.f15446d)) {
                Room room2 = this.f15446d;
                owner = (room2 == null || room2.officialChannelInfo == null || this.f15446d.officialChannelInfo.f18978a == null) ? this.f15446d.getOwner() : this.f15446d.officialChannelInfo.f18978a;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("log_enter_live_source", this.f15449g);
            hashMap.put("sec_user_id", owner.getSecUid());
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).showUserProfile(owner.getId(), null, hashMap);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Room room) {
        this.f15446d = room;
        c();
    }

    /* access modifiers changed from: protected */
    public final <T extends View> T a(int i2) {
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i2);
    }
}
