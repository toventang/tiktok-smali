package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.model.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.d.c;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class ag implements IHostUser {

    /* renamed from: a  reason: collision with root package name */
    private b f108454a;

    /* renamed from: b  reason: collision with root package name */
    private a f108455b;

    static {
        Covode.recordClassIndex(69496);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean interceptOperation(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void markAsOutOfDate(boolean z) {
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void setRoomAttrsAdminFlag(int i2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void updateUser(com.bytedance.android.live.base.model.user.b bVar) {
    }

    public static final class a implements i, j {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.livesdkapi.depend.f.a f108456a;

        static {
            Covode.recordClassIndex(69497);
        }

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(308, new g(a.class, "onEvent", c.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @r
        public final void onEvent(c cVar) {
            if (this.f108456a != null && (cVar.f69921b instanceof User)) {
                com.bytedance.android.livesdkapi.depend.model.b.a aVar = new com.bytedance.android.livesdkapi.depend.model.b.a();
                aVar.f23023e = cVar.f69920a;
                String uid = ((User) cVar.f69921b).getUid();
                if (uid != null) {
                    aVar.f23019a = Long.parseLong(uid);
                }
                this.f108456a.a(aVar);
            }
        }
    }

    public static final class b implements com.bytedance.android.livesdkapi.depend.f.b, i, j {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.livesdkapi.depend.f.b f108457a;

        static {
            Covode.recordClassIndex(69498);
        }

        @Override // org.greenrobot.eventbus.i
        public final Map<Integer, Object> getSubscriberEventTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put(54, new g(b.class, "onEvent", com.ss.android.ugc.aweme.base.d.c.class, ThreadMode.POSTING, 0, false));
            hashMap.put(213, new g(b.class, "onEvent", com.ss.android.ugc.aweme.base.d.g.class, ThreadMode.POSTING, 0, false));
            return hashMap;
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.bytedance.android.livesdkapi.depend.f.b
        public final void a(boolean z) {
            com.bytedance.android.livesdkapi.depend.f.b bVar = this.f108457a;
            if (bVar != null) {
                bVar.a(z);
            }
        }

        @r
        public final void onEvent(com.ss.android.ugc.aweme.base.d.g gVar) {
            a(false);
        }

        @r
        public final void onEvent(com.ss.android.ugc.aweme.base.d.c cVar) {
            a(BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin());
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isDeleteByAgeGate() {
        return in.f();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isMinorMode() {
        return in.d();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final com.bytedance.android.live.base.model.user.b getCurUser() {
        return s.a(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final long getCurUserId() {
        return Long.parseLong(BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final boolean isLogin() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final int getCurUserMode() {
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || createIUserServicebyMonsterPlugin.getCurrentUser() == null) {
            return -1;
        }
        return createIUserServicebyMonsterPlugin.getCurrentUser().getUserMode();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final List<e> getAllFriends() {
        List<IMUser> allFriends = IMService.createIIMServicebyMonsterPlugin(false).getAllFriends();
        ArrayList arrayList = new ArrayList();
        for (IMUser iMUser : allFriends) {
            if (!IMUser.isInvalidUser(iMUser.getUid())) {
                arrayList.add(new e(Long.valueOf(Long.parseLong(iMUser.getUid())), iMUser.getSecUid(), iMUser.getNickName(), iMUser.getUniqueId(), new ImageModel(iMUser.getAvatarThumb().getUri(), iMUser.getAvatarThumb().getUrlList())));
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void requestLivePermission(com.bytedance.android.livesdkapi.l.c cVar) {
        LiveOuterService.s().c().a(cVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unRegisterCurrentUserUpdateListener(com.bytedance.android.livesdkapi.depend.f.b bVar) {
        b bVar2 = this.f108454a;
        if (bVar2 != null) {
            EventBus.a().b(bVar2);
            bVar2.f108457a = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unRegisterFollowStatusListener(com.bytedance.android.livesdkapi.depend.f.a aVar) {
        a aVar2 = this.f108455b;
        if (aVar2 != null) {
            EventBus.a().b(aVar2);
            aVar2.f108456a = null;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerFollowStatusListener(com.bytedance.android.livesdkapi.depend.f.a aVar) {
        if (this.f108455b == null) {
            this.f108455b = new a((byte) 0);
        }
        this.f108455b.f108456a = aVar;
        EventBus.a(EventBus.a(), this.f108455b);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void registerCurrentUserUpdateListener(com.bytedance.android.livesdkapi.depend.f.b bVar) {
        if (this.f108454a == null) {
            this.f108454a = new b((byte) 0);
        }
        this.f108454a.f108457a = bVar;
        b bVar2 = this.f108454a;
        if (!EventBus.a().a(bVar2)) {
            EventBus.a(EventBus.a(), bVar2);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void onFollowStatusChanged(int i2, long j2) {
        FollowStatus followStatus = new FollowStatus();
        followStatus.userId = String.valueOf(j2);
        followStatus.followStatus = i2;
        new FollowStatusEvent(followStatus).post();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void unFollowWithConfirm(Activity activity, int i2, long j2, com.bytedance.android.livesdkapi.host.c.b bVar) {
        bVar.a();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostUser
    public final void login(androidx.fragment.app.e eVar, com.bytedance.android.livesdkapi.host.c.a aVar, String str, String str2, int i2, String str3, String str4, String str5) {
        com.ss.android.ugc.aweme.login.c.a(eVar, str4, "live_room", (Bundle) null, new ah(aVar));
    }
}
