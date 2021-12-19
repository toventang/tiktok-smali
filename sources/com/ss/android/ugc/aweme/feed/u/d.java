package com.ss.android.ugc.aweme.feed.u;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.commercialize.feed.be;
import com.ss.android.ugc.aweme.commercialize.utils.bd;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.ab.f;
import com.ss.android.ugc.aweme.feed.cache.c;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.v;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.Lock;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends a<Aweme, FeedItemList> {

    /* renamed from: k  reason: collision with root package name */
    private static boolean f94000k;

    /* renamed from: l  reason: collision with root package name */
    private static boolean f94001l;

    /* renamed from: a  reason: collision with root package name */
    public boolean f94002a;

    /* renamed from: b  reason: collision with root package name */
    public FeedItemList f94003b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f94004c;

    /* renamed from: d  reason: collision with root package name */
    public v f94005d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f94006e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f94007f;

    /* renamed from: g  reason: collision with root package name */
    private int f94008g;

    /* renamed from: h  reason: collision with root package name */
    private String f94009h;

    /* renamed from: i  reason: collision with root package name */
    private long f94010i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f94011j;

    static {
        Covode.recordClassIndex(59776);
    }

    private static boolean a(int i2, int i3, Lock lock, boolean z) {
        if (i2 != 0 || i3 != 0 || lock == null || !s.a().booleanValue()) {
            return false;
        }
        if (!f94001l && !z) {
            f94001l = true;
            System.currentTimeMillis();
            c.a(lock);
            System.currentTimeMillis();
        }
        return true;
    }

    private static boolean a(Lock lock) {
        if (f94001l || lock == null) {
            return false;
        }
        f94001l = true;
        System.currentTimeMillis();
        c.a(lock);
        System.currentTimeMillis();
        return true;
    }

    private boolean a(int i2, String str, int i3, String str2, Lock lock, Message message) {
        if (i2 != 0 || i3 != 0 || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || f94000k) {
            return false;
        }
        boolean a2 = a(lock);
        f94000k = true;
        i.b(new g(this, i2, message, lock), g.a());
        return a2;
    }

    private static boolean a(Message message) {
        return (message == null || message.getData() == null || !message.getData().getBoolean("is_from_feed_cache")) ? false : true;
    }

    private static boolean a(Aweme aweme) {
        if (aweme.isLiveNoDeduplicate() && f.a()) {
            return false;
        }
        if (!aweme.isAd()) {
            return true;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(int i2, Message message, Lock lock) {
        MethodCollector.i(8399);
        a.b.f109011a.b("feed_get_cache_to_use_cache", false);
        a.b.f109011a.a("feed_try_use_cache_duration", false);
        FeedItemList i3 = e.i();
        a.b.f109011a.b("feed_try_use_cache_duration", false);
        a.b.f109011a.a("feed_load_cache_completed_to_focus", false);
        a.b.f109011a.a("feed_use_cache_to_send_msg", false);
        if (i3 == null || b.a((Collection) i3.getItems())) {
            MethodCollector.o(8399);
            return null;
        }
        k.a(i3.getItems(), i3.getRequestId(), i2);
        i3.getItems().size();
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = i3;
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_feed_cache", true);
        obtainMessage.setData(bundle);
        if (com.ss.android.ugc.aweme.s.f.b() && Build.VERSION.SDK_INT >= 22) {
            obtainMessage.setAsynchronous(true);
        }
        boolean a2 = com.ss.android.ugc.aweme.s.f.a();
        if (a2) {
            message.copyFrom(obtainMessage);
            message.setTarget(this.mHandler);
        }
        a.b.f109011a.a("feed_load_cache_try_callback_duration", false);
        System.currentTimeMillis();
        c.b(lock);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_load_cache_try_callback_duration", false);
        a.b.f109011a.b("feed_use_cache_to_send_msg", false);
        a.b.f109011a.b("cold_boot_focus_end_to_post_cache_message", false);
        if (!a2) {
            this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
        } else {
            Bundle data = message.getData();
            data.hashCode();
            if (com.ss.android.ugc.aweme.s.f.c() && !data.getBoolean("has_used_feed_cache", false)) {
                synchronized (data) {
                    try {
                        data.putBoolean("has_used_feed_cache", true);
                    } catch (Throwable th) {
                        MethodCollector.o(8399);
                        throw th;
                    }
                }
                this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
            if (com.ss.android.ugc.aweme.s.f.b() && !this.mHandler.hasMessages(0, i3)) {
                this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
            }
        }
        a.b.f109011a.a("feed_post_cache_message_to_success", false);
        MethodCollector.o(8399);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(int i2, int i3, String str, long j2, long j3, int i4, Integer num, String str2, String str3, String str4, boolean z) {
        com.ss.android.ugc.aweme.feed.t.d.f93914a.a(4).c();
        com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedFetchModel", "start commit to fetchList,type:" + i2 + ",pullType:" + i3 + ",aids:" + str);
        FeedItemList fetchFeedList = FeedApiService.a().fetchFeedList(i2, j2, j3, i4, num, str2, i3, 0, str3, str, str4, this.f94010i, null, null, Boolean.valueOf(z));
        if (!m.a(str2) && fetchFeedList != null) {
            fetchFeedList.setLocalExtra("aweme_id", str2);
        }
        if (i2 == 0 && fetchFeedList != null) {
            fetchFeedList.appendCache = e.a();
        }
        if (fetchFeedList == null || fetchFeedList.getItems() == null || fetchFeedList.getItems().size() <= 0) {
            i.b(k.f94044a, i.f4824a);
        } else {
            try {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedFetchModel", "end commit to fetchList,type:" + i2 + ",pullType:" + i3 + ",aids:" + str + ",listSize:" + fetchFeedList.getItems().size());
            } catch (Throwable unused) {
                com.ss.android.ugc.aweme.framework.a.a.b(6, "FeedFetchModel", "end commit to fetchList log error,should never happen!");
            }
            BusinessComponentServiceUtils.getLiveStateManager().a(fetchFeedList.getItems());
        }
        return fetchFeedList;
    }

    public d() {
        this.mCount = 6;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ Object a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "feed_banned");
            jSONObject.put("scene", "feed");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        AppLog.recordMiscLog(com.bytedance.ies.ugc.appcontext.d.a(), "app_perf", jSONObject);
        return null;
    }

    private static boolean b(FeedItemList feedItemList) {
        if (feedItemList == null || feedItemList.getItems() == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        if (this.mData != null) {
            ((FeedItemList) this.mData).items = list;
        }
    }

    private static Integer a(Object[] objArr) {
        if (objArr.length < 4 || !(objArr[3] instanceof Integer)) {
            return null;
        }
        return (Integer) objArr[3];
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        if (objArr.length == 3 || objArr.length == 4 || objArr.length == 5 || objArr.length == 6 || objArr.length == 7 || objArr.length == 8) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (!SplashSettingServiceImpl.g().f() || this.mData != null || !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.a(aweme2) || !com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
            return com.ss.android.ugc.aweme.feed.x.m.a(getItems(), aweme2, this.mNotifyListeners);
        }
        com.ss.android.ugc.d.a.c.a(new com.bytedance.ies.ugc.aweme.commercialize.splash.b.a(aweme2));
        return true;
    }

    private void c(FeedItemList feedItemList) {
        List<Aweme> items;
        boolean z;
        if (feedItemList != null && (items = feedItemList.getItems()) != null && !items.isEmpty()) {
            ListIterator<Aweme> listIterator = items.listIterator();
            try {
                z = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getDiscardRefreshTopDsp().booleanValue();
            } catch (com.bytedance.ies.a unused) {
                z = true;
            }
            bd h2 = com.ss.android.ugc.aweme.commercialize.g.h();
            int i2 = 0;
            while (listIterator.hasNext()) {
                Aweme next = listIterator.next();
                if (next == null) {
                    listIterator.remove();
                } else {
                    if (h2.a(next) || h2.b(next)) {
                        if (this.mListQueryType != 1 || i2 >= 3 || !br.a(next, 3)) {
                            h2.a(next, i.f4824a, false);
                        } else if (z) {
                            listIterator.remove();
                        } else {
                            h2.a(next, null, true);
                            if (br.a(next, false)) {
                                listIterator.remove();
                            }
                        }
                    }
                    i2++;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadLatestList(Object... objArr) {
        long j2;
        this.f94007f = ((Integer) objArr[1]).intValue();
        this.f94008g = ((Integer) objArr[2]).intValue();
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.f94009h = "";
        } else {
            this.f94009h = (String) objArr[4];
        }
        int i2 = this.f94007f;
        if (b.a((Collection) getItems())) {
            j2 = 0;
        } else {
            j2 = -1;
        }
        a(i2, j2, ((FeedItemList) this.mData).minCursor, this.mCount, a(objArr), null, this.f94008g, this.f94009h, null, null, null, null, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r10 != null) goto L_0x0046;
     */
    @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r10) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.u.d.handleMsg(android.os.Message):void");
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        boolean z;
        long j2;
        if (this.mData != null) {
            this.f94010i = ((FeedItemList) this.mData).cursor;
        }
        this.f94007f = ((Integer) objArr[1]).intValue();
        this.f94008g = ((Integer) objArr[2]).intValue();
        if (objArr.length < 4 || !(objArr[3] instanceof Boolean)) {
            z = false;
        } else {
            z = ((Boolean) objArr[3]).booleanValue();
        }
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.f94009h = "";
        } else {
            this.f94009h = (String) objArr[4];
        }
        if (objArr.length < 5 || !(objArr[4] instanceof Boolean)) {
            this.f94004c = false;
        } else {
            this.f94004c = true;
        }
        com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedFetchModel", "loadMoreList call,type:" + this.f94007f + ",pullType:" + this.f94008g + ",countryCode:" + this.f94009h);
        int i2 = this.f94007f;
        if (b.a((Collection) getItems())) {
            j2 = 0;
        } else {
            j2 = ((FeedItemList) this.mData).maxCursor;
        }
        a(i2, j2, -1, this.mCount, a(objArr), null, this.f94008g, this.f94009h, null, null, null, null, z);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        String str;
        String str2;
        Lock lock;
        Message message;
        String str3;
        this.f94010i = 0;
        this.f94007f = ((Integer) objArr[1]).intValue();
        this.f94008g = ((Integer) objArr[2]).intValue();
        if (this.f94007f == 0) {
            this.f94006e = false;
        }
        if (objArr.length < 5 || !(objArr[4] instanceof String)) {
            this.f94009h = "";
        } else {
            this.f94009h = (String) objArr[4];
        }
        Boolean bool = false;
        if (objArr.length >= 4 && (objArr[3] instanceof Boolean)) {
            bool = (Boolean) objArr[3];
        }
        if (bool.booleanValue()) {
            n.a().a(this.mHandler, new e(this), 0);
            return;
        }
        if (objArr.length < 6 || !(objArr[4] instanceof String)) {
            str = null;
        } else {
            str = (String) objArr[4];
        }
        if (!TextUtils.isEmpty(str) || objArr.length < 6 || !(objArr[5] instanceof String)) {
            str2 = null;
        } else {
            str2 = (String) objArr[5];
        }
        if (objArr.length < 7 || !(objArr[6] instanceof Lock)) {
            lock = null;
        } else {
            lock = (Lock) objArr[6];
        }
        if (objArr.length < 8 || !(objArr[7] instanceof Message)) {
            message = null;
        } else {
            message = (Message) objArr[7];
        }
        int i2 = this.f94007f;
        int i3 = this.mCount;
        Integer a2 = a(objArr);
        if (objArr.length < 4 || !(objArr[3] instanceof String)) {
            str3 = null;
        } else {
            str3 = (String) objArr[3];
        }
        a(i2, 0, 0, i3, a2, str3, this.f94008g, this.f94009h, str, str2, lock, message, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r5 != 1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r5 != 2) goto L_0x00a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object a(java.util.List r15) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.u.d.a(java.util.List):java.lang.Object");
    }

    private static void a(FeedItemList feedItemList) {
        if (feedItemList != null && !b.a((Collection) feedItemList.getItems())) {
            Iterator<Aweme> it = feedItemList.getItems().iterator();
            while (it.hasNext()) {
                Aweme next = it.next();
                if (next != null && next.isLive()) {
                    LiveRoomStruct newLiveRoomData = next.getNewLiveRoomData();
                    if (newLiveRoomData == null || newLiveRoomData.owner == null || TextUtils.isEmpty(newLiveRoomData.owner.getUid()) || TextUtils.isEmpty(newLiveRoomData.owner.getSecUid())) {
                        it.remove();
                    } else {
                        User user = newLiveRoomData.owner;
                        User user2 = new User();
                        user2.setUid(user.getUid());
                        user2.setSecUid(user.getSecUid());
                        user2.setNickname(user.getNickname());
                        user2.setShortId(user.getShortId());
                        user2.setUniqueId(user.getUniqueId());
                        user2.setSignature(user.getSignature());
                        user2.setAvatarThumb(user.getAvatarThumb());
                        user2.setAvatarLarger(user.getAvatarLarger());
                        user2.setAvatarMedium(user.getAvatarMedium());
                        RoomFeedCellStruct roomFeedCellStruct = next.getRoomFeedCellStruct();
                        roomFeedCellStruct.room = newLiveRoomData;
                        next.setRoomFeedCellStruct(roomFeedCellStruct);
                        next.setAuthor(user2);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        if (r1 != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0219  */
    @Override // com.ss.android.ugc.aweme.common.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.u.d.handleData(java.lang.Object):void");
    }

    private void a(String str) {
        if (this.mData != null && ((FeedItemList) this.mData).getItems() != null && !((FeedItemList) this.mData).getItems().isEmpty()) {
            Iterator<Aweme> it = ((FeedItemList) this.mData).getItems().iterator();
            while (it.hasNext()) {
                Aweme next = it.next();
                if (!TextUtils.isEmpty(next.getAid()) && next.getAid().equals(str)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    private static String a(List<String> list, String str) {
        if (b.a((Collection) list)) {
            return "";
        }
        StringBuilder sb = null;
        for (String str2 : list) {
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private void a(FeedItemList feedItemList, String str) {
        String str2;
        int i2;
        int i3;
        Iterator<Aweme> it = feedItemList.getItems().iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i4 = 2;
            if (!it.hasNext()) {
                break;
            }
            Aweme next = it.next();
            if (!TextUtils.equals(next.getAid(), str) && !isDataEmpty() && com.ss.android.ugc.aweme.feed.x.m.a(((FeedItemList) this.mData).getItems(), next) >= 0) {
                Aweme aweme = ((FeedItemList) this.mData).getItems().get(com.ss.android.ugc.aweme.feed.x.m.b(((FeedItemList) this.mData).getItems(), next));
                if (aweme != null && TextUtils.equals(next.getAid(), aweme.getAid())) {
                    if (next.isAd()) {
                        be a2 = com.ss.android.ugc.aweme.commercialize.g.a();
                        Context a3 = com.bytedance.ies.ugc.appcontext.d.a();
                        if (aweme.isAd()) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        a2.a(a3, next, i2);
                        a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "item_repeat", next.getAwemeRawAd());
                        if (aweme.isAd()) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        a4.a("filter_reason", Integer.valueOf(i3)).c();
                    }
                    if (a(next)) {
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.an(next)) {
                            com.ss.android.ugc.aweme.commercialize.g.a().a(com.bytedance.ies.ugc.appcontext.d.a(), next, com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.b("8"));
                            a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", next.getAwemeRawAd()).a("ad_show_fail_type", "8");
                            if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                str2 = "1";
                            } else {
                                str2 = "2";
                            }
                            a5.a("awemelaunch", str2).c();
                        }
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        if (aweme.isAd()) {
                            i4 = 1;
                        }
                        r.a("vv_failed", dVar.a("failed_reason", i4).a("group_id", aweme.getAid()).f66730a);
                    }
                }
                if (a(next)) {
                    it.remove();
                    arrayList.add(next.getAid());
                }
            }
        }
        if (arrayList.size() > 0) {
            int i5 = this.f94007f;
            if (i5 == 0) {
                r.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_hot").setValue(String.valueOf(arrayList.size())));
                String requestId = feedItemList.getRequestId();
                if (!b.a((Collection) arrayList)) {
                    com.ss.android.ugc.aweme.app.n.a("service_monitor", "aweme_delete_duplicated_items", new com.ss.android.ugc.aweme.app.f.c().a("request_id", requestId).a("user_id", com.ss.android.ugc.aweme.account.b.g().getCurUserId()).a("list_count", Integer.valueOf(arrayList.size())).a("item_ids_str", a(arrayList, ",")).a("page_type", "homepage_hot").a());
                }
            } else if (i5 == 2) {
                r.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_fresh").setValue(String.valueOf(arrayList.size())));
            }
        }
    }

    private void a(int i2, long j2, long j3, int i3, Integer num, String str, int i4, String str2, String str3, String str4, Lock lock, Message message, boolean z) {
        com.ss.android.ugc.aweme.framework.a.a.b(4, "FeedFetchModel", "start to fetchList,type:" + i2 + ",pullType:" + i4 + ",aids:" + str3);
        new f(this, i2, i4, str3, j2, j3, i3, num, str, str2, str4, z, a(i2, i4, lock, a(i2, str, i4, str3, lock, message)), lock).run();
    }
}
