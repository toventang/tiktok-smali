package com.ss.android.ugc.aweme.live.feedpage;

import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.f.c;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.d.f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f108379a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public static final Long f108380b = 0L;

    /* renamed from: i  reason: collision with root package name */
    public static c<e> f108381i = new c<e>() {
        /* class com.ss.android.ugc.aweme.live.feedpage.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69446);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.f.c
        public final /* synthetic */ e a() {
            return new e();
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public Map<Long, Long> f108382c = new HashMap(20);

    /* renamed from: d  reason: collision with root package name */
    public Map<Long, Long> f108383d = new HashMap(20);

    /* renamed from: e  reason: collision with root package name */
    public LruCache<Long, Long> f108384e = new LruCache<>(19);

    /* renamed from: f  reason: collision with root package name */
    Map<Long, Long> f108385f = new HashMap(40);

    /* renamed from: g  reason: collision with root package name */
    LruCache<Long, Long> f108386g = new LruCache<>(40);

    /* renamed from: h  reason: collision with root package name */
    public LiveStateApi f108387h = ((LiveStateApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit("https://" + Live.getLiveDomain()).create(LiveStateApi.class));

    /* renamed from: j  reason: collision with root package name */
    private a f108388j = null;

    /* renamed from: k  reason: collision with root package name */
    private ArrayDeque<a> f108389k = new ArrayDeque<>(10);

    /* access modifiers changed from: package-private */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public boolean f108390a;

        /* renamed from: b  reason: collision with root package name */
        final Long f108391b;

        /* renamed from: c  reason: collision with root package name */
        Set<Long> f108392c;

        /* renamed from: d  reason: collision with root package name */
        List<f<Map<Long, Long>>> f108393d;

        /* renamed from: f  reason: collision with root package name */
        private final Long f108395f;

        /* renamed from: g  reason: collision with root package name */
        private String f108396g;

        static {
            Covode.recordClassIndex(69447);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f108390a = false;
            a(e.this.f108382c);
            e.this.a();
        }

        public final void run() {
            this.f108390a = true;
            if (!(this.f108391b == null || this.f108395f == null)) {
                e.this.f108384e.put(this.f108391b, this.f108395f);
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = 0;
            if (this.f108391b.longValue() != 0) {
                Long l2 = e.this.f108383d.get(Long.valueOf(this.f108391b.longValue()));
                if (l2 != null) {
                    j2 = l2.longValue();
                }
                if (currentTimeMillis - Long.valueOf(j2).longValue() < e.b()) {
                    a();
                    return;
                }
            }
            this.f108392c = new HashSet(e.this.f108384e.snapshot().keySet());
            StringBuilder sb = new StringBuilder();
            this.f108392c.add(this.f108391b);
            if (!b.a((Collection) this.f108392c)) {
                for (Long l3 : this.f108392c) {
                    sb.append(String.valueOf(l3)).append(",");
                }
            }
            String sb2 = sb.toString();
            if (sb2.endsWith(",")) {
                sb2 = sb2.substring(0, sb2.length() - 1);
            }
            e.this.f108387h.liveStates(sb2, this.f108396g).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this, currentTimeMillis), new i(this));
        }

        private void a(Map<Long, Long> map) {
            if (!b.a((Collection) this.f108393d)) {
                for (f<Map<Long, Long>> fVar : this.f108393d) {
                    try {
                        fVar.accept(map);
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.b("LiveStateManager", "onResult:" + Log.getStackTraceString(e2));
                    }
                }
            }
        }

        a(Long l2, Long l3, f<Map<Long, Long>> fVar, String str) {
            ArrayList arrayList = new ArrayList(3);
            this.f108393d = arrayList;
            this.f108391b = l2;
            this.f108395f = l3;
            this.f108396g = str;
            arrayList.add(fVar);
        }
    }

    static {
        Covode.recordClassIndex(69445);
    }

    private static boolean c() {
        if (g.a()) {
            return false;
        }
        return LiveHostOuterService.q().g();
    }

    public final void a() {
        a aVar = this.f108388j;
        if (aVar == null || !aVar.f108390a) {
            a pollLast = this.f108389k.pollLast();
            this.f108388j = pollLast;
            if (pollLast != null) {
                pollLast.run();
            }
        }
    }

    private static boolean d() {
        if (!((Boolean) LiveOuterService.s().d().a("enable_refresh_foru_avatar_live_status", (Object) false)).booleanValue() && !c()) {
            return true;
        }
        return false;
    }

    public static long b() {
        try {
            if (((Boolean) LiveOuterService.s().d().a("enable_refresh_foru_avatar_live_status", (Object) false)).booleanValue()) {
                return (long) ((Integer) LiveOuterService.s().d().a("mt_refresh_foru_avatar_live_state_interval", (Object) 60000)).intValue();
            }
            return LiveHostOuterService.q().h();
        } catch (Exception unused) {
            return 60000;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.feedpage.c
    public final void a(long j2) {
        this.f108382c.remove(Long.valueOf(j2));
        this.f108383d.remove(Long.valueOf(j2));
        this.f108384e.remove(Long.valueOf(j2));
    }

    @Override // com.ss.android.ugc.aweme.live.feedpage.c
    public final void b(List<FollowFeed> list) {
        LiveRoomStruct newLiveRoomData;
        if (!d() && !b.a((Collection) list)) {
            long currentTimeMillis = System.currentTimeMillis();
            for (FollowFeed followFeed : list) {
                if (followFeed.getFeedType() == 65298) {
                    RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                    if (!(roomStruct == null || (newLiveRoomData = roomStruct.getNewLiveRoomData()) == null)) {
                        newLiveRoomData.owner.roomId = newLiveRoomData.id;
                        a(currentTimeMillis, newLiveRoomData.owner);
                        b(currentTimeMillis, newLiveRoomData.owner);
                    }
                } else {
                    Aweme aweme = followFeed.getAweme();
                    if (aweme != null) {
                        a(currentTimeMillis, aweme.getAuthor());
                        b(currentTimeMillis, aweme.getAuthor());
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.feedpage.c
    public final void a(List<Aweme> list) {
        if (!(d() || b.a((Collection) list))) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Aweme aweme : list) {
                if ("homepage_follow".equals(Integer.valueOf(aweme.getAwemeType()))) {
                    aweme.getAwemeType();
                }
                if (aweme.getAuthor() != null) {
                    a(currentTimeMillis, aweme.getAuthor());
                }
                b(currentTimeMillis, aweme.getAuthor());
            }
        }
    }

    private void b(long j2, User user) {
        if (user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            this.f108386g.put(valueOf, Long.valueOf(user.roomId));
            this.f108385f.put(valueOf, Long.valueOf(j2));
        }
    }

    private void a(long j2, User user) {
        if (!d() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            if (user.roomId != 0) {
                this.f108382c.put(valueOf, Long.valueOf(user.roomId));
                this.f108383d.put(valueOf, Long.valueOf(j2));
                this.f108384e.put(valueOf, Long.valueOf(user.roomId));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.feedpage.c
    public final void a(User user, f<Map<Long, Long>> fVar, String str) {
        if (!d() && user != null && !TextUtils.isEmpty(user.getUid())) {
            Long valueOf = Long.valueOf(user.getUid());
            a aVar = this.f108388j;
            if (aVar == null || aVar.f108392c == null || !aVar.f108392c.contains(valueOf)) {
                this.f108389k.addFirst(new a(valueOf, Long.valueOf(user.roomId), fVar, str));
                a();
                return;
            }
            this.f108388j.f108393d.add(fVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.feedpage.c
    public final void a(User user, List<User> list, f<Long> fVar, String str) {
        long j2;
        if (user != null) {
            long j3 = 0;
            try {
                j2 = Long.parseLong(user.getUid());
            } catch (Exception e2) {
                e2.printStackTrace();
                j2 = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = this.f108385f.get(Long.valueOf(j2));
            if (l2 != null) {
                j3 = l2.longValue();
            }
            if (currentTimeMillis - Long.valueOf(j3).longValue() < b()) {
                try {
                    fVar.accept(this.f108386g.get(Long.valueOf(j2)));
                } catch (Exception e3) {
                    com.ss.android.ugc.aweme.framework.a.a.b("LiveStateManager", "onResult:" + Log.getStackTraceString(e3));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(user.getUid()).append(",");
                if (!b.a((Collection) list)) {
                    for (User user2 : list) {
                        sb.append(user2.getUid()).append(",");
                    }
                }
                String sb2 = sb.toString();
                if (sb2.endsWith(",")) {
                    sb2 = sb2.substring(0, sb2.length() - 1);
                }
                this.f108387h.liveStates(sb2, str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this, fVar, j2, list), g.f108401a);
            }
        }
    }
}
