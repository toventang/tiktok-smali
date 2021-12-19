package com.bytedance.android.live.liveinteract.multiguest.a.f;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.multilive.a.a.i;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.b.d;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends a.AbstractC0206a {

    /* renamed from: a  reason: collision with root package name */
    Room f11135a;

    /* renamed from: b  reason: collision with root package name */
    int f11136b = 1;

    /* renamed from: c  reason: collision with root package name */
    boolean f11137c;

    /* renamed from: d  reason: collision with root package name */
    boolean f11138d;

    /* renamed from: e  reason: collision with root package name */
    int f11139e;

    /* renamed from: f  reason: collision with root package name */
    DataChannel f11140f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f11141h;

    /* renamed from: i  reason: collision with root package name */
    private List<d> f11142i;

    /* renamed from: j  reason: collision with root package name */
    private int f11143j;

    /* renamed from: k  reason: collision with root package name */
    private int f11144k = 2;

    /* renamed from: l  reason: collision with root package name */
    private String f11145l = "";

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.depend.model.a f11146m;
    private String n;
    private f.a.b.a o = new f.a.b.a();

    static {
        Covode.recordClassIndex(5985);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final int a() {
        return this.f11136b;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final int b() {
        return this.f11144k;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final String c() {
        return this.f11145l;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final boolean e() {
        return this.f11141h;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void f() {
        a((i) null);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.a.a
    public final void g() {
        super.g();
        this.o.a();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final ImageModel d() {
        return u.a().b().a().getAvatarThumb();
    }

    private void h() {
        String str;
        HashMap hashMap = new HashMap();
        Room room = this.f11135a;
        if (room != null) {
            if (room.getStreamType() == com.bytedance.android.livesdkapi.depend.model.live.i.AUDIO) {
                str = "radio";
            } else {
                str = "video";
            }
            hashMap.put("room_type", str);
        }
        hashMap.put("audience_connection_type", "voice");
        b.a.a("audience_connection_apply").a((Map<String, String>) hashMap).d("live_detail").b("live").c("click").a().b();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void a(int i2) {
        this.f11136b = i2;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void a(com.bytedance.android.livesdkapi.depend.model.a aVar) {
        this.f11146m = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.android.live.liveinteract.platform.common.a.b] */
    @Override // com.bytedance.android.live.liveinteract.platform.common.a.a
    public final /* synthetic */ void a(a.b bVar) {
        super.a(bVar);
        this.f11144k = ((com.bytedance.android.livesdkapi.host.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.b.class)).b().c(com.bytedance.android.livesdk.h.b.LIVE_INTERACT_BEAUTY_LEVEL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void b(int i2) {
        this.f11144k = i2;
        ((com.bytedance.android.livesdkapi.host.b) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.b.class)).b().a(com.bytedance.android.livesdk.h.b.LIVE_INTERACT_BEAUTY_LEVEL, i2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void a(String str) {
        this.f11145l = str;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void a(boolean z) {
        long j2;
        int i2;
        if (this.f11135a != null && !this.f11138d) {
            String str = com.bytedance.android.livesdk.b.a.d.a().v;
            if (z) {
                c.a().f9959k = this.f11136b;
                c.a().f9953e = this.f11144k;
                c.a().f9954f = this.f11146m;
                c.a().f9955g = this.f11145l;
                j2 = 1;
            } else {
                j2 = 2;
            }
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(j2, this.f11135a.getOwnerUserId(), g.a.f14199a.a(this.f11135a.getOwnerUserId()));
            this.f11137c = true;
            boolean value = MultiLiveServerAutoJoinChannel.INSTANCE.getValue();
            f.a.b.a aVar = this.o;
            LinkApi linkApi = (LinkApi) e.a().a(LinkApi.class);
            long id = this.f11135a.getId();
            if (z) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            aVar.a(linkApi.linkInRoomGuestReplyAnchor(id, i2, this.f11135a.getId(), this.f11135a.getOwnerUserId(), this.f11136b, str, value).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, z), new e(this, z)));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.b.a.AbstractC0206a
    public final void a(i iVar) {
        int i2;
        if (!this.f11137c) {
            this.f11137c = true;
            c a2 = c.a();
            int i3 = 0;
            if (this.f11141h) {
                d dVar = this.f11142i.get(this.f11143j);
                i3 = dVar.f15718a;
                i2 = dVar.f15719b;
                a2.f9956h = true;
                a2.f9957i = i3;
                a2.f9958j = i2;
                String.valueOf(i3);
            } else {
                a2.f9956h = false;
                a2.f9957i = 0;
                a2.f9958j = 0;
                i2 = 0;
            }
            com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Guest_Apply", "roomId:" + this.f11135a.getId() + "; ownerUid:" + this.f11135a.getOwnerUserId() + "; type:" + this.f11136b);
            com.bytedance.android.live.liveinteract.platform.common.g.i.g();
            HashMap hashMap = new HashMap();
            hashMap.put("link_type", String.valueOf(this.f11136b));
            hashMap.put("guest_supported_vendor", "12");
            hashMap.put("guest_supported_layout", "15");
            hashMap.put("payed_money", String.valueOf(i3));
            hashMap.put("link_duration", String.valueOf(i2));
            if (iVar != null) {
                hashMap.put("required_mic_idx", String.valueOf(iVar.f11486a));
                int i4 = iVar.f11487b;
                if (i4 == 11 || i4 == 12) {
                    hashMap.put("layout", "1");
                } else if (i4 == 13 || i4 == 14) {
                    hashMap.put("layout", "0");
                }
            }
            this.o.a(((LinkApi) e.a().a(LinkApi.class)).apply(this.f11135a.getId(), this.f11135a.getOwnerUserId(), hashMap).a(new f()).a(new b(this), new c(this)));
            c.a().f9953e = this.f11144k;
            c.a().f9954f = this.f11146m;
            c.a().f9955g = this.f11145l;
            h();
        }
    }

    public a(Room room, boolean z, List<d> list, String str, int i2, DataChannel dataChannel) {
        this.f11135a = room;
        this.f11141h = z;
        this.f11142i = list;
        this.n = str;
        this.f11139e = i2;
        this.f11140f = dataChannel;
    }
}
