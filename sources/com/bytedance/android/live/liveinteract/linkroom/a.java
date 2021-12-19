package com.bytedance.android.live.liveinteract.linkroom;

import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.api.aw;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.e;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.af;
import com.bytedance.android.live.liveinteract.multiguest.a.c.c;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.live.liveinteract.platform.common.g.z;
import com.bytedance.android.live.liveinteract.platform.common.h.c;
import com.bytedance.android.livesdk.b.a.f;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.d.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class a implements com.bytedance.android.live.liveinteract.api.b {
    private boolean mHasAddInteractObserve;
    private final f<Integer> mInteractObserver = new b(this);
    public final List<d> mListeners = new ArrayList();

    static {
        Covode.recordClassIndex(5578);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a$a  reason: collision with other inner class name */
    public static final class C0187a implements com.bytedance.android.live.liveinteract.api.d {
        static {
            Covode.recordClassIndex(5579);
        }

        C0187a() {
        }

        @Override // com.bytedance.android.live.liveinteract.api.d
        public final int a() {
            return LinkCrossRoomWidget.f10463b;
        }

        @Override // com.bytedance.android.live.liveinteract.api.d
        public final int b() {
            return LinkCrossRoomWidget.f10464c;
        }

        @Override // com.bytedance.android.live.liveinteract.api.d
        public final int c() {
            return LinkCrossRoomWidget.f10462a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public Set<Long> getHasInvitedUidSet() {
        return c.f11064e;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getLinkStatus4H5() {
        return com.bytedance.android.live.liveinteract.linkroom.b.a.f10536a;
    }

    public Set<Long> getSocialLocalInviteUIDs() {
        return com.bytedance.android.live.liveinteract.a.a.b.f9922a;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public long getBattleId() {
        return com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b();
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public SurfaceView getLinkInAnchorSurface() {
        return com.bytedance.android.livesdk.b.a.d.a().s;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public e getLinkWidgetFactory() {
        return new af();
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public int getLinkedGuestNum() {
        return com.bytedance.android.livesdk.b.a.d.a().u;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public long getRivalAnchorUidWhenAnchorLinkMic() {
        return b.a.a().f9941f;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isBattleStarter() {
        return com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10679c;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInCoHost() {
        return b.a.a().f9936a;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInRandomLinkMic() {
        return com.bytedance.android.live.liveinteract.cohost.a.c.a.a();
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public com.bytedance.android.live.liveinteract.api.d linkCrossRoomWidget() {
        return new C0187a();
    }

    private final void addInteractObserve() {
        com.bytedance.android.live.liveinteract.api.a.c.a().a((f) this.mInteractObserver);
        this.mHasAddInteractObserve = true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getCurrentInviteeList() {
        return w.a(b.a.a().p);
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public int getCurrentLinkMode() {
        return b.a.a().a();
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public Set<Long> getUninvitedUidSet() {
        Set<Long> set = com.bytedance.android.livesdk.b.a.d.a().t;
        l.b(set, "");
        return set;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void handleLiveRoomStopped() {
        if (com.bytedance.android.livesdk.b.a.d.a().u > 0) {
            z.d("live_over");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isAudienceApplied() {
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        l.b(a2, "");
        return a2.f14182c;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isBattling() {
        if (com.bytedance.android.live.liveinteract.match.b.b.c.START == com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInMultiGuest() {
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        l.b(a2, "");
        return a2.f14182c;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void preloadWidgetView() {
        com.bytedance.android.b.a((int) R.layout.bfb);
        com.bytedance.android.b.a((int) R.layout.bfa);
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getCurrentPkState() {
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.START) {
            return "in_pk";
        }
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) {
            return "pk_punish";
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getInviteeList() {
        if (!isInCoHost()) {
            return "";
        }
        return w.a(b.a.a().p);
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isAnchorVideoEnable() {
        Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        if (a2 == null) {
            return true;
        }
        if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a) || !((com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2).f11294d) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isInteracting() {
        com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
        l.b(a2, "");
        T t = a2.n;
        l.b(t, "");
        int intValue = t.intValue();
        if (intValue == 2 || intValue == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isLinkingMic() {
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        l.b(a2, "");
        if (a2.f14182c || b.a.a().f9936a) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isMultiLiveFloatLayout() {
        Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a)) {
            return false;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2;
        if (aVar.q == n.FLOATING_FIX || aVar.q == n.FLOATING) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isMultiLiveGridLayout() {
        Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("MULTI_GUEST_DATA_HOLDER");
        if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.opt.a.a)) {
            return false;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = (com.bytedance.android.live.liveinteract.multiguest.opt.a.a) a2;
        if (aVar.q == n.GRID_FIX || aVar.q == n.GRID) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public boolean isRoomInBattle() {
        com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
        if (a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.START) < 0 || a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.END) >= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
        ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).addOnRegistryReadyListener(new b());
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public long getChannelId() {
        Room room;
        if (aj.a(getCurrentLinkMode(), 4)) {
            return b.a.a().f9940e;
        }
        if (!aj.a(getCurrentLinkMode(), 2) || (room = (Room) DataChannelGlobal.f34575d.b(ac.class)) == null) {
            return 0;
        }
        return room.getId();
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public String getRoomScene() {
        c.a aVar;
        if (((com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class)).isMicRoomForCurrentRoom()) {
            aVar = c.a.LINE_UP;
        } else {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.IInteractService");
            com.bytedance.android.live.liveinteract.api.b bVar = (com.bytedance.android.live.liveinteract.api.b) a2;
            if (bVar.isBattling()) {
                aVar = c.a.LINK_MIC_PK;
            } else if (bVar.getLinkedGuestNum() > 0) {
                aVar = c.a.LINK_MIC_GUEST;
            } else if (bVar.isInCoHost()) {
                aVar = c.a.LINK_MIC_ANCHOR;
            } else {
                aVar = c.a.NORMAL_VIDEO;
            }
        }
        return aVar.getDesc();
    }

    public Set<Long> getSocialOnlineUserIds() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = com.bytedance.android.live.liveinteract.a.a.b.f9923b.f9918a.iterator();
        while (it.hasNext()) {
            User user = it.next().f15750a;
            l.b(user, "");
            linkedHashSet.add(Long.valueOf(user.getId()));
        }
        return linkedHashSet;
    }

    public Set<Long> getSocialInvitingUserId() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<com.bytedance.android.livesdk.chatroom.model.d.a> list = com.bytedance.android.live.liveinteract.a.a.b.f9923b.f9920c;
        ArrayList<com.bytedance.android.livesdk.chatroom.model.d.a> arrayList = new ArrayList();
        for (T t : list) {
            if (t.f15753d == 3) {
                arrayList.add(t);
            }
        }
        for (com.bytedance.android.livesdk.chatroom.model.d.a aVar : arrayList) {
            User user = aVar.f15750a;
            l.b(user, "");
            linkedHashSet.add(Long.valueOf(user.getId()));
        }
        return linkedHashSet;
    }

    public Set<Long> getSocialOnlineAndWaitingUserId() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = com.bytedance.android.live.liveinteract.a.a.b.f9923b.f9918a.iterator();
        while (it.hasNext()) {
            User user = it.next().f15750a;
            l.b(user, "");
            linkedHashSet.add(Long.valueOf(user.getId()));
        }
        Iterator<T> it2 = com.bytedance.android.live.liveinteract.a.a.b.f9923b.f9919b.iterator();
        while (it2.hasNext()) {
            User user2 = it2.next().f15750a;
            l.b(user2, "");
            linkedHashSet.add(Long.valueOf(user2.getId()));
        }
        return linkedHashSet;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void removeInteractStateChangeListener(d dVar) {
        List<d> list = this.mListeners;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        ad.b(list).remove(dVar);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10493a;

        static {
            Covode.recordClassIndex(5580);
        }

        b(a aVar) {
            this.f10493a = aVar;
        }

        @Override // com.bytedance.android.livesdk.b.a.f
        public final /* synthetic */ void a(Object obj) {
            this.f10493a.isInteracting();
            for (d dVar : this.f10493a.mListeners) {
                dVar.a();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public void registerInteractStateChangeListener(d dVar) {
        if (!this.mHasAddInteractObserve) {
            addInteractObserve();
        }
        if (dVar != null && !this.mListeners.contains(dVar)) {
            this.mListeners.add(dVar);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public aw getUserRole(long j2) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return aw.NORMAL_AUDIENCE;
        }
        if (j2 == room.getOwnerUserId()) {
            return aw.CURRENT_ANCHOR;
        }
        if (j2 == b.a.a().f9941f) {
            return aw.GUEST_ANCHOR;
        }
        if (g.a.f14199a.f14196a.containsKey(Long.valueOf(j2))) {
            return aw.GUEST_AUDIENCE;
        }
        return aw.NORMAL_AUDIENCE;
    }

    @Override // com.bytedance.android.live.liveinteract.api.b
    public int getLinkState(User user) {
        l.d(user, "");
        Object a2 = com.bytedance.android.live.liveinteract.api.c.e.f10014a.a("LINK_USER_INFO_CENTER");
        if (!(a2 instanceof com.bytedance.android.live.liveinteract.multiguest.a.c.d)) {
            a2 = null;
        }
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = (com.bytedance.android.live.liveinteract.multiguest.a.c.d) a2;
        if (dVar != null) {
            l.d(user, "");
            for (T t : dVar.f11074b) {
                User user2 = t.f15722c;
                l.b(user2, "");
                if (user2.getId() == user.getId()) {
                    return t.f15724e;
                }
            }
        }
        return 0;
    }
}
