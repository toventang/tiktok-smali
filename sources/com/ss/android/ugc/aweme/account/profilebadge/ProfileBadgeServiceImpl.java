package com.ss.android.ugc.aweme.account.profilebadge;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IProfileBadgeService;
import com.ss.android.ugc.aweme.account.profilebadge.UserGetApi;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import f.a.d.f;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class ProfileBadgeServiceImpl implements WeakHandler.IHandler, IProfileBadgeService {

    /* renamed from: a  reason: collision with root package name */
    final List<IProfileBadgeService.c> f65286a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Handler f65287b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final List<WeakReference<IProfileBadgeService.b>> f65288c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List<WeakReference<IProfileBadgeService.a>> f65289d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private ProfileBadgeStruct f65290e;

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65294a = new d();

        static {
            Covode.recordClassIndex(40148);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(40144);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeServiceImpl f65291a;

        static {
            Covode.recordClassIndex(40145);
        }

        a(ProfileBadgeServiceImpl profileBadgeServiceImpl) {
            this.f65291a = profileBadgeServiceImpl;
        }

        public final void run() {
            this.f65291a.b(false, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeServiceImpl f65292a;

        static {
            Covode.recordClassIndex(40146);
        }

        b(ProfileBadgeServiceImpl profileBadgeServiceImpl) {
            this.f65292a = profileBadgeServiceImpl;
        }

        public final void run() {
            this.f65292a.a(false, (ProfileBadgeStruct) null);
        }
    }

    private final void c() {
        this.f65287b.post(new b(this));
    }

    private final void d() {
        this.f65287b.post(new a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeServiceImpl f65295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeStruct f65296b;

        static {
            Covode.recordClassIndex(40149);
        }

        e(ProfileBadgeServiceImpl profileBadgeServiceImpl, ProfileBadgeStruct profileBadgeStruct) {
            this.f65295a = profileBadgeServiceImpl;
            this.f65296b = profileBadgeStruct;
        }

        public final void run() {
            MethodCollector.i(9248);
            this.f65295a.a(true, this.f65296b);
            this.f65295a.b(true, this.f65296b);
            ProfileBadgeServiceImpl profileBadgeServiceImpl = this.f65295a;
            ProfileBadgeStruct profileBadgeStruct = this.f65296b;
            synchronized (profileBadgeServiceImpl.f65286a) {
                try {
                    for (IProfileBadgeService.c cVar : profileBadgeServiceImpl.f65286a) {
                        cVar.a(profileBadgeStruct);
                    }
                } finally {
                    MethodCollector.o(9248);
                }
            }
        }
    }

    public static IProfileBadgeService b() {
        MethodCollector.i(10793);
        Object a2 = com.ss.android.ugc.b.a(IProfileBadgeService.class, false);
        if (a2 != null) {
            IProfileBadgeService iProfileBadgeService = (IProfileBadgeService) a2;
            MethodCollector.o(10793);
            return iProfileBadgeService;
        }
        if (com.ss.android.ugc.b.F == null) {
            synchronized (IProfileBadgeService.class) {
                try {
                    if (com.ss.android.ugc.b.F == null) {
                        com.ss.android.ugc.b.F = new ProfileBadgeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10793);
                    throw th;
                }
            }
        }
        ProfileBadgeServiceImpl profileBadgeServiceImpl = (ProfileBadgeServiceImpl) com.ss.android.ugc.b.F;
        MethodCollector.o(10793);
        return profileBadgeServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public final void a() {
        UserGetApi.a.a().getSelf().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), d.f65294a);
    }

    private final void a(Boolean bool) {
        ProfileBadgeStruct profileBadgeStruct;
        if (!(bool == null || (profileBadgeStruct = this.f65290e) == null)) {
            profileBadgeStruct.setShouldShow(bool.booleanValue());
        }
        a(this.f65290e);
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public final void b(IProfileBadgeService.c cVar) {
        MethodCollector.i(10331);
        l.d(cVar, "");
        synchronized (this.f65286a) {
            try {
                this.f65286a.remove(cVar);
            } finally {
                MethodCollector.o(10331);
            }
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileBadgeServiceImpl f65293a;

        static {
            Covode.recordClassIndex(40147);
        }

        c(ProfileBadgeServiceImpl profileBadgeServiceImpl) {
            this.f65293a = profileBadgeServiceImpl;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            User user = ((UserGetResponse) obj).getUser();
            if (user != null) {
                this.f65293a.a(user.getProfileBadge());
                IVideoGiftService l2 = VideoGiftService.l();
                if (user.getVideoGiftStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                l2.a(z);
            }
        }
    }

    private final void a(Long l2) {
        ProfileBadgeStruct profileBadgeStruct;
        if (!(l2 == null || (profileBadgeStruct = this.f65290e) == null)) {
            profileBadgeStruct.setId(l2.longValue());
        }
        a(this.f65290e);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        Boolean bool;
        Boolean bool2;
        l.d(message, "");
        if (message.obj instanceof Exception) {
            c();
            d();
            return;
        }
        Long l2 = null;
        if (message.obj instanceof User) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            ProfileBadgeStruct profileBadge = ((User) obj).getProfileBadge();
            if (profileBadge != null) {
                bool2 = Boolean.valueOf(profileBadge.getShouldShow());
            } else {
                bool2 = null;
            }
            a(bool2);
            Object obj2 = message.obj;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            ProfileBadgeStruct profileBadge2 = ((User) obj2).getProfileBadge();
            if (profileBadge2 != null) {
                l2 = Long.valueOf(profileBadge2.getId());
            }
            a(l2);
        } else if (message.obj instanceof UserResponse) {
            Object obj3 = message.obj;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
            int action = ((UserResponse) obj3).getAction();
            if (action == 1) {
                c();
                d();
            } else if (action != 2) {
                Object obj4 = message.obj;
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                User user = ((UserResponse) obj4).getUser();
                l.b(user, "");
                ProfileBadgeStruct profileBadge3 = user.getProfileBadge();
                if (profileBadge3 != null) {
                    bool = Boolean.valueOf(profileBadge3.getShouldShow());
                } else {
                    bool = null;
                }
                a(bool);
                Object obj5 = message.obj;
                Objects.requireNonNull(obj5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
                User user2 = ((UserResponse) obj5).getUser();
                l.b(user2, "");
                ProfileBadgeStruct profileBadge4 = user2.getProfileBadge();
                if (profileBadge4 != null) {
                    l2 = Long.valueOf(profileBadge4.getId());
                }
                a(l2);
            } else {
                c();
                d();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public final void a(IProfileBadgeService.c cVar) {
        MethodCollector.i(10330);
        l.d(cVar, "");
        synchronized (this.f65286a) {
            try {
                this.f65286a.add(cVar);
            } finally {
                MethodCollector.o(10330);
            }
        }
    }

    public final void a(ProfileBadgeStruct profileBadgeStruct) {
        AccountService.a().e().updateCurProfileBadge(profileBadgeStruct);
        this.f65287b.post(new e(this, profileBadgeStruct));
    }

    public final synchronized void b(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        MethodCollector.i(10643);
        for (WeakReference<IProfileBadgeService.a> weakReference : this.f65289d) {
            IProfileBadgeService.a aVar = weakReference.get();
            if (aVar != null) {
                if (z) {
                    aVar.a(profileBadgeStruct);
                } else {
                    aVar.a();
                }
            }
        }
        MethodCollector.o(10643);
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public final void a(long j2, IProfileBadgeService.a aVar) {
        l.d(aVar, "");
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        User curUser = e2.getCurUser();
        l.b(curUser, "");
        this.f65290e = curUser.getProfileBadge();
        com.ss.android.ugc.aweme.account.b.g().updateProfileWidgetId(new WeakHandler(this), Long.valueOf(j2), 0);
        this.f65289d.add(new WeakReference<>(aVar));
    }

    @Override // com.ss.android.ugc.aweme.IProfileBadgeService
    public final void a(boolean z, IProfileBadgeService.b bVar) {
        MethodCollector.i(10003);
        l.d(bVar, "");
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        User curUser = e2.getCurUser();
        l.b(curUser, "");
        this.f65290e = curUser.getProfileBadge();
        com.ss.android.ugc.aweme.account.b.g().updateProfileWidgetShouldShow(new WeakHandler(this), z, 0);
        synchronized (this.f65288c) {
            try {
                this.f65288c.add(new WeakReference<>(bVar));
            } finally {
                MethodCollector.o(10003);
            }
        }
    }

    public final void a(boolean z, ProfileBadgeStruct profileBadgeStruct) {
        MethodCollector.i(10485);
        synchronized (this.f65288c) {
            try {
                for (WeakReference<IProfileBadgeService.b> weakReference : this.f65288c) {
                    IProfileBadgeService.b bVar = weakReference.get();
                    if (bVar != null) {
                        if (z) {
                            bVar.a(profileBadgeStruct);
                        } else {
                            bVar.a();
                        }
                    }
                }
            } finally {
                MethodCollector.o(10485);
            }
        }
    }
}
