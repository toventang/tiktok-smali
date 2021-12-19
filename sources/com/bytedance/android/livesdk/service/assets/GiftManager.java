package com.bytedance.android.livesdk.service.assets;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.c.d;
import androidx.lifecycle.t;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.chatroom.c.j;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.gift.assets.b;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.g;
import com.bytedance.android.livesdk.gift.model.h;
import com.bytedance.android.livesdk.gift.model.j;
import com.bytedance.android.livesdk.gift.model.n;
import com.bytedance.android.livesdk.gift.model.p;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDownloadSetting;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.service.a.c;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.utils.f;
import f.a.a;
import f.a.v;
import f.a.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GiftManager {
    private static GiftManager sInst;
    f gson = e.a.f9628b;
    private final b mAssetsManager;
    private final SparseArray<j> mGiftsMap = new SparseArray<>();
    private final SparseArray<d<u>> mGiftsMapByFind = new SparseArray<>();
    private final List<g> mGroupCountInfo = new ArrayList();
    public t<Boolean> mHideBottomBar = new t<>();
    private ConcurrentHashMap<Long, Long> mRoomFastGiftIdMap = new ConcurrentHashMap<>(20);
    private ConcurrentHashMap<Long, h> mRoomGiftInfoMap = new ConcurrentHashMap<>(20);

    static {
        Covode.recordClassIndex(12539);
    }

    public void clearGiftIconInfo() {
        this.mRoomFastGiftIdMap.clear();
    }

    public static synchronized GiftManager inst() {
        GiftManager giftManager;
        synchronized (GiftManager.class) {
            MethodCollector.i(10269);
            if (sInst == null) {
                sInst = new GiftManager();
            }
            giftManager = sInst;
            MethodCollector.o(10269);
        }
        return giftManager;
    }

    private void loadLocal() {
        f.a.h.a(new e(this), a.BUFFER).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f(this), g.f21267a);
    }

    public List<GiftPage> getGiftPageList() {
        int i2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            i2 = room.getOrientation();
        } else {
            i2 = 0;
        }
        j jVar = this.mGiftsMap.get(i2);
        if (jVar == null || com.bytedance.common.utility.h.a(jVar.f17898c)) {
            return new ArrayList();
        }
        return new ArrayList(jVar.f17898c);
    }

    public List<u> getStickerGifts() {
        ArrayList arrayList = new ArrayList();
        ArrayList<u> arrayList2 = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            for (GiftPage giftPage : giftPageList) {
                arrayList2.addAll(giftPage.gifts);
            }
        }
        for (u uVar : arrayList2) {
            if (uVar.f19762e == 4) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    public boolean hideBottomBar() {
        int i2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            i2 = room.getOrientation();
        } else {
            i2 = 0;
        }
        j jVar = this.mGiftsMap.get(i2);
        if (jVar != null) {
            return jVar.f17897b.f17923i;
        }
        return false;
    }

    private GiftManager() {
        ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).initImageLib();
        loadLocal();
        this.mAssetsManager = a.b.f18870a;
    }

    public static boolean com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(Context context) {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void syncGiftList(int i2) {
        syncGiftList(null, 0, i2, false);
    }

    public static boolean com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable_1(Context context) {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo = com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(context);
        com.ss.android.ugc.aweme.lancet.j.f107229h = com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
        return com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends u> collection) {
        Iterator<? extends u> it = collection.iterator();
        while (it.hasNext()) {
            if (!((u) it.next()).f19770m) {
                it.remove();
            }
        }
    }

    private com.bytedance.android.livesdk.ap.b<String> getPropertyByLiveType(int i2) {
        return new com.bytedance.android.livesdk.ap.b<>("gift_list_response_".concat(String.valueOf(i2)), "");
    }

    public void clearFastGift(long j2) {
        this.mRoomFastGiftIdMap.remove(Long.valueOf(j2));
        this.mRoomFastGiftIdMap.remove(0L);
    }

    public static void filterFirstAndCallbackGifts(Collection<? extends u> collection) {
        long i2 = com.bytedance.android.livesdk.firstrecharge.d.u.i();
        Iterator<? extends u> it = collection.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar.f19761d == i2 || uVar.f19761d == 0) {
                it.remove();
            }
        }
    }

    public u findGiftById(long j2) {
        int i2;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            i2 = room.getOrientation();
        } else {
            i2 = 0;
        }
        d<u> dVar = this.mGiftsMapByFind.get(i2);
        if (dVar == null) {
            return null;
        }
        return dVar.a(j2, null);
    }

    public u getFastGift(long j2) {
        Long l2;
        if (this.mRoomFastGiftIdMap.containsKey(Long.valueOf(j2))) {
            l2 = this.mRoomFastGiftIdMap.get(Long.valueOf(j2));
        } else {
            l2 = this.mRoomFastGiftIdMap.get(0L);
        }
        if (l2 != null) {
            return findGiftById(l2.longValue());
        }
        return null;
    }

    public h getGiftIconInfo(long j2) {
        if (this.mRoomGiftInfoMap.containsKey(Long.valueOf(j2))) {
            return this.mRoomGiftInfoMap.get(Long.valueOf(j2));
        }
        return this.mRoomGiftInfoMap.get(0L);
    }

    public int getTabByGiftId(long j2) {
        for (GiftPage giftPage : this.mGiftsMap.get(0).f17898c) {
            if (giftPage.display) {
                for (u uVar : giftPage.gifts) {
                    if (uVar.f19761d == j2) {
                        return giftPage.pageType;
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public int getTabLocation(int i2) {
        int i3 = 0;
        j jVar = this.mGiftsMap.get(0);
        if (!(jVar == null || jVar.f17898c == null)) {
            for (GiftPage giftPage : jVar.f17898c) {
                i3++;
                if (giftPage.pageType == a.C0355a.C0356a.f17017a.f17014j) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public String getTabName(int i2) {
        j jVar = this.mGiftsMap.get(0);
        if (!(jVar == null || jVar.f17898c == null)) {
            for (GiftPage giftPage : jVar.f17898c) {
                if (giftPage.pageType == i2) {
                    return giftPage.pageName;
                }
            }
        }
        return "Gift";
    }

    public String getTabNameByIndex(int i2) {
        j jVar = this.mGiftsMap.get(0);
        if (jVar == null || jVar.f17898c == null || i2 >= jVar.f17898c.size()) {
            return "Gift";
        }
        return jVar.f17898c.get(i2).pageName;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadLocal$5$GiftManager(Map map) {
        if (!(map == null || map.isEmpty())) {
            for (Integer num : map.keySet()) {
                j jVar = (j) map.get(num);
                if (jVar != null) {
                    addGiftMap(jVar, num.intValue());
                }
            }
            updateGiftsInfo(this.mGiftsMap.get(0), 0);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ x lambda$syncGiftList$1$GiftManager(com.bytedance.android.live.network.response.b bVar) {
        if (bVar == null) {
            return f.a.t.a(new Exception("response is empty"));
        }
        if (bVar.data == null) {
            return f.a.t.a(new Exception("response.data is empty"));
        }
        if (bVar.extra != null) {
            c.f21168b = ((com.bytedance.android.livesdk.service.b.c) bVar.extra).f21284a;
        }
        return f.a.t.a(new h(this, bVar));
    }

    public int getGiftPosition(long j2) {
        j jVar = this.mGiftsMap.get(0);
        if (!(jVar == null || jVar.f17898c == null)) {
            for (GiftPage giftPage : jVar.f17898c) {
                if (giftPage.pageType == a.C0355a.C0356a.f17017a.f17014j) {
                    int i2 = 0;
                    for (u uVar : giftPage.gifts) {
                        i2++;
                        if (uVar.f19761d == j2) {
                            return i2;
                        }
                    }
                    continue;
                }
            }
        }
        return -1;
    }

    public n getGiftType(u uVar) {
        if (uVar == null) {
            return n.UNKNOWN;
        }
        if (uVar.f19762e == 10) {
            return n.GOLDEN_BEAN_CELL;
        }
        if (uVar.f19762e == 9) {
            return n.FREE_CELL;
        }
        if (uVar.f19762e == 1) {
            return n.NORMAL_GIFT;
        }
        if (uVar.f19762e == 5) {
            return n.TASK_GIFT;
        }
        if (uVar.f19762e == 4) {
            return n.STICKER_GIFT;
        }
        if (uVar.f19762e == 8) {
            return n.MIDDLE_GIFT;
        }
        if (uVar.f19762e == 2) {
            return n.SPECIAL_GIFT;
        }
        if (uVar.f19762e == 11) {
            return n.GAME;
        }
        return n.UNKNOWN;
    }

    public boolean isDynamicGift(long j2) {
        j jVar = this.mGiftsMap.get(0);
        if (jVar != null && jVar.f17898c != null) {
            Iterator<GiftPage> it = jVar.f17898c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Iterator<u> it2 = it.next().gifts.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        u next = it2.next();
                        if (next.f19761d == j2) {
                            ImageModel imageModel = next.p;
                            if (imageModel == null || imageModel.mUrls == null || imageModel.mUrls.size() <= 0) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$loadLocal$4$GiftManager(f.a.j jVar) {
        HashMap hashMap = new HashMap(4);
        for (String str : com.bytedance.android.livesdk.ap.a.f14008b.a()) {
            int intValue = Integer.valueOf(str).intValue();
            String a2 = getPropertyByLiveType(intValue).a();
            if (!m.a(a2)) {
                hashMap.put(Integer.valueOf(intValue), this.gson.a(a2, j.class));
            }
        }
        jVar.a(hashMap);
        jVar.a();
    }

    public static void filterInteractNotSupportGift(Collection<? extends u> collection, boolean z) {
        filterNotSupportGift(collection, z);
        Iterator<? extends u> it = collection.iterator();
        while (it.hasNext()) {
            if (!((u) it.next()).f19766i) {
                it.remove();
            }
        }
    }

    private void updateGiftsInfo(j jVar, long j2) {
        if (jVar != null) {
            p pVar = jVar.f17897b;
            if (pVar == null) {
                com.bytedance.android.livesdk.an.a.a().a(j.a.a());
                return;
            }
            notifyFastGiftModule(j2, pVar.f17915a);
            notifyGiftIconModule(j2, pVar.f17924j);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$null$0$GiftManager(com.bytedance.android.live.network.response.b bVar, v vVar) {
        vVar.a(new androidx.core.g.e(bVar.data, this.gson.b(bVar.data)));
    }

    private void notifyFastGiftModule(long j2, long j3) {
        this.mRoomFastGiftIdMap.put(Long.valueOf(j2), Long.valueOf(j3));
        this.mRoomFastGiftIdMap.put(0L, Long.valueOf(j3));
        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.h(j2, j3));
    }

    private void addGiftMap(com.bytedance.android.livesdk.gift.model.j jVar, int i2) {
        List<GiftPage> list;
        if (jVar != null) {
            this.mGiftsMap.put(i2, jVar);
            d<u> dVar = this.mGiftsMapByFind.get(i2);
            if (dVar != null) {
                dVar.c();
            } else {
                dVar = new d<>();
                this.mGiftsMapByFind.append(i2, dVar);
            }
            ArrayList<u> arrayList = new ArrayList();
            if (!com.bytedance.common.utility.h.a(jVar.f17898c) && (list = jVar.f17898c) != null) {
                for (GiftPage giftPage : list) {
                    arrayList.addAll(giftPage.gifts);
                }
            }
            for (u uVar : arrayList) {
                dVar.c(uVar.f19761d, uVar);
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends u> collection, boolean z) {
        Iterator<? extends u> it = collection.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar.f19761d == 998) {
                it.remove();
            } else if ((uVar.f19762e == 2 || uVar.f19762e == 8 || uVar.f19762e == 11) && !com.bytedance.android.livesdk.manage.a.b(uVar.n)) {
                it.remove();
            } else if (uVar.f19762e == 4 && z && !com.bytedance.android.livesdk.manage.a.b(uVar.n)) {
                it.remove();
            }
        }
    }

    public void notifyGiftIconModule(long j2, h hVar) {
        this.mRoomGiftInfoMap.put(Long.valueOf(j2), hVar);
        this.mRoomGiftInfoMap.put(0L, hVar);
        if (hVar == null) {
            com.bytedance.android.livesdk.an.a.a().a(j.a.a());
        } else if (hVar.f17886c >= System.currentTimeMillis() / 1000 || hVar.f17887d <= System.currentTimeMillis() / 1000) {
            this.mRoomGiftInfoMap.remove(Long.valueOf(j2));
            this.mRoomGiftInfoMap.remove(0L);
            com.bytedance.android.livesdk.an.a.a().a(j.a.a());
        } else {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.j(j2, hVar));
        }
    }

    static final /* synthetic */ void lambda$syncGiftList$3$GiftManager(boolean z, WeakReference weakReference, Throwable th) {
        Exception exc = new Exception(th);
        exc.printStackTrace();
        com.bytedance.android.live.core.c.a.a(6, "GIFT_MANAGER", "syncgiftlist error! " + exc.getMessage());
        if (z) {
            String message = exc.getMessage();
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", message);
            com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_gift_list_status"), 1, 0, hashMap);
            com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.b("ttlive_gift_list_status"), 1, hashMap);
            com.bytedance.android.livesdk.ab.a.a.a();
            com.bytedance.android.livesdk.ab.a.a.a(com.bytedance.android.livesdk.ab.a.b.Gift.info, "ttlive_gift_list_status", hashMap);
        }
        if (weakReference.get() != null) {
            weakReference.get();
        }
    }

    public void syncGiftList(com.bytedance.android.livesdk.gift.e.b bVar, long j2, int i2, boolean z) {
        boolean z2;
        if (com_bytedance_android_livesdk_service_assets_GiftManager_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable_1(y.e())) {
            if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() == 0) {
                this.mAssetsManager.a(i2, z, Long.valueOf(j2));
            }
            WeakReference weakReference = new WeakReference(bVar);
            if (j2 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ((GiftRetrofitApi) com.bytedance.android.live.network.e.a().a(GiftRetrofitApi.class)).syncGiftList(String.valueOf(j2), i2).a((f.a.d.g<? super com.bytedance.android.live.network.response.b<com.bytedance.android.livesdk.gift.model.j, com.bytedance.android.livesdk.service.b.c>, ? extends x<? extends R>>) new b(this), false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, i2, z, j2, bVar, SystemClock.uptimeMillis(), z2), new d(z2, weakReference));
        }
    }

    private void onSyncGiftListSuccess(com.bytedance.android.livesdk.gift.model.j jVar, String str, boolean z, long j2, com.bytedance.android.livesdk.gift.e.b bVar) {
        int i2;
        if (jVar != null) {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room != null) {
                i2 = room.getOrientation();
            } else {
                i2 = 0;
            }
            addGiftMap(jVar, i2);
            List<GiftPage> list = jVar.f17898c;
            com.bytedance.android.livesdk.ap.c.a(getPropertyByLiveType(i2), str);
            Set<String> a2 = com.bytedance.android.livesdk.ap.a.f14008b.a();
            a2.add(String.valueOf(i2));
            com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.f14008b, a2);
            updateGiftsInfo(jVar, j2);
            if (bVar != null) {
                bVar.b(list);
            }
        } else if (bVar != null) {
            bVar.a(new ArrayList());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$syncGiftList$2$GiftManager(int i2, boolean z, long j2, com.bytedance.android.livesdk.gift.e.b bVar, long j3, boolean z2, androidx.core.g.e eVar) {
        long j4;
        if (LiveGiftResourceDownloadSetting.INSTANCE.getValue() != 0) {
            this.mAssetsManager.a(i2, z, Long.valueOf(j2));
        }
        this.mHideBottomBar.setValue(Boolean.valueOf(eVar.f2397a.f17897b.f17923i));
        p pVar = eVar.f2397a.f17897b;
        com.bytedance.android.livesdk.firstrecharge.d dVar = com.bytedance.android.livesdk.firstrecharge.d.u;
        dVar.f17736d = pVar;
        p pVar2 = dVar.f17736d;
        if (pVar2 != null) {
            com.bytedance.android.livesdk.gift.model.u uVar = pVar2.f17916b;
            if (uVar != null) {
                j4 = uVar.f17946c;
            } else {
                j4 = 0;
            }
            dVar.f17737e = j4;
            if (0 > dVar.f17737e) {
                dVar.f17737e = 0;
            }
        }
        dVar.f17738f = dVar.e();
        onSyncGiftListSuccess(eVar.f2397a, eVar.f2398b, z, j2, bVar);
        long uptimeMillis = SystemClock.uptimeMillis() - j3;
        if (z2) {
            com.bytedance.android.live.core.d.c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_gift_list_status"), 0, uptimeMillis);
        }
    }
}
