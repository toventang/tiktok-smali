package com.ss.android.ugc.aweme.follow.presenter;

import android.os.Message;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.detail.i.c;
import com.ss.android.ugc.aweme.detail.i.k;
import com.ss.android.ugc.aweme.feed.ab.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1;
import com.ss.android.ugc.aweme.follow.api.b;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.utils.em;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a extends c<FollowFeed, FollowFeedList> implements k, Cloneable {

    /* renamed from: l  reason: collision with root package name */
    private static HashMap<String, Aweme> f96231l = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public String f96232a = "homepage_follow";

    /* renamed from: b  reason: collision with root package name */
    public String f96233b = "extra_follow_type_follow";

    /* renamed from: c  reason: collision with root package name */
    public boolean f96234c;

    /* renamed from: d  reason: collision with root package name */
    public long f96235d;

    /* renamed from: e  reason: collision with root package name */
    public int f96236e = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f96237f = "";

    /* renamed from: g  reason: collision with root package name */
    public List<FollowFeed> f96238g = new CopyOnWriteArrayList();

    /* renamed from: h  reason: collision with root package name */
    public boolean f96239h;

    /* renamed from: i  reason: collision with root package name */
    public int f96240i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f96241j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f96242k;

    static {
        Covode.recordClassIndex(60964);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<FollowFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            aVar.mData = ((FollowFeedList) this.mData).clone();
            return aVar;
        } catch (CloneNotSupportedException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c() {
        if (this.mNotifyListeners == null) {
            return null;
        }
        try {
            for (o oVar : this.mNotifyListeners) {
                oVar.c();
            }
            return null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((FollowFeedList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final List<Aweme> b() {
        if (this.mData == null) {
            return null;
        }
        this.f96236e = -1;
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme());
            } else if (followFeed.getFeedType() == 65297) {
                this.f96236e = arrayList.size();
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.detail.i.k
    public final List<Aweme> a() {
        return a(getItems());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Message message) {
        handleData((FollowFeedList) message.obj);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    private static d a(Object... objArr) {
        if (objArr.length < 2 || !(objArr[1] instanceof d)) {
            return null;
        }
        return (d) objArr[1];
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<FollowFeed> list) {
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        String str;
        d a2 = a(objArr);
        if (a2 != null) {
            String str2 = a2.f96263e;
            if (TextUtils.isEmpty(str2)) {
                str = a2.f96267i;
            } else {
                str = str2;
            }
            int i2 = this.f96242k + 1;
            this.f96242k = i2;
            a(i2, 0, 1, 0, 0, a2.f96260b, a2.f96261c, a2.f96262d, "", a2.f96265g, str2, str, 0, a2.f96264f.intValue());
            com.ss.android.ugc.aweme.live.b.a.f108335a.a();
        }
    }

    public static List<Aweme> a(List<FollowFeed> list) {
        Aweme aweme;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280 && (aweme = followFeed.getAweme()) != null) {
                if (!aweme.isForwardAweme() || aweme.getForwardItem() != null) {
                    arrayList.add(aweme);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
            if (this.mNotifyListeners != null) {
                for (o oVar : this.mNotifyListeners) {
                    oVar.a_((Exception) message.obj);
                }
            }
            a(this.f96240i, "", ((Exception) message.obj).getMessage(), 0);
            return;
        }
        i.b(new b(this, Message.obtain(message)), g.a()).a(new c(this), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        long j2;
        int i2;
        long maxCursor;
        d a2 = a(objArr);
        if (a2 != null) {
            int i3 = this.f96242k;
            if (this.mData != null) {
                j2 = ((FollowFeedList) this.mData).getCursor();
            } else {
                j2 = 0;
            }
            if (this.mData != null) {
                i2 = ((FollowFeedList) this.mData).getLevel();
            } else {
                i2 = 1;
            }
            if (b.a((Collection) getItems())) {
                maxCursor = 0;
            } else {
                maxCursor = ((FollowFeedList) this.mData).getMaxCursor();
            }
            a(i3, j2, i2, maxCursor, -1, a2.f96260b, a2.f96261c, a2.f96262d, a2.f96263e, null, null, null, ((FollowFeedList) this.mData).getIsRecommend(), 0);
        }
    }

    private boolean a(FollowFeed followFeed) {
        if (followFeed == null) {
            return false;
        }
        if (!(followFeed.getFeedType() == 65280 || followFeed.getFeedType() == 65298)) {
            return false;
        }
        if (!((followFeed.getAweme() != null && followFeed.getAweme().isLiveNoDeduplicate() && f.a()) || this.mData == null || ((FollowFeedList) this.mData).getItems().size() == 0)) {
            for (FollowFeed followFeed2 : ((FollowFeedList) this.mData).getItems()) {
                if (followFeed.getFeedType() == 65280 && followFeed2.getFeedType() == 65280) {
                    Aweme aweme = followFeed.getAweme();
                    Aweme aweme2 = followFeed2.getAweme();
                    if (!(aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid()))) {
                        return true;
                    }
                } else if (followFeed.getFeedType() == 65298 && followFeed2.getFeedType() == 65298) {
                    RoomFeedCellStruct roomStruct = followFeed.getRoomStruct();
                    RoomFeedCellStruct roomStruct2 = followFeed2.getRoomStruct();
                    if (!(roomStruct == null || roomStruct2 == null || roomStruct.getNewLiveRoomData().id != roomStruct2.getNewLiveRoomData().id)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02dd, code lost:
        if (r12.getVideo().getHeight() != 0) goto L_0x030d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0305, code lost:
        if (r12.getHeight() == 0) goto L_0x02df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05f5, code lost:
        if (r17 != null) goto L_0x05e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0575  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r17) {
        /*
        // Method dump skipped, instructions count: 1603
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.follow.presenter.a.handleData(com.ss.android.ugc.aweme.follow.presenter.FollowFeedList):void");
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

    private void a(int i2, String str, String str2, int i3) {
        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
        cVar.a("feed_r_type", Integer.valueOf(i2)).a("feed_r_pull_type", Integer.valueOf(this.f96241j)).a("origin_count", Integer.valueOf(i3));
        if (!TextUtils.isEmpty(str)) {
            cVar.a("request_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            cVar.a("error_desc", str2);
        }
        n.a("aweme_feed_fetch_abnormal_log", "", cVar.a());
    }

    private void a(final int i2, final long j2, final int i3, final long j3, final long j4, final int i4, final int i5, final String str, final String str2, final String str3, final String str4, final String str5, final int i6, final int i7) {
        final String str6;
        boolean booleanValue = SharePrefCache.inst().getIsContactsUploaded().c().booleanValue();
        int[] a2 = em.a(101);
        if (a2 == null) {
            str6 = "";
        } else {
            str6 = a2[0] + "_" + a2[1];
        }
        com.ss.android.ugc.aweme.base.n a3 = com.ss.android.ugc.aweme.base.n.a();
        WeakHandler weakHandler = this.mHandler;
        final int i8 = booleanValue ? 1 : 0;
        a3.a(weakHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.follow.presenter.a.AnonymousClass1 */
            final /* synthetic */ int o = 2;

            static {
                Covode.recordClassIndex(60965);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2;
                FollowFeedList a2;
                int i3;
                AnonymousClass1 r0 = this;
                if (com.ss.android.ugc.aweme.account.b.g().isUidContactPermisioned()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if (TextUtils.equals(a.this.f96233b, "extra_follow_type_friend")) {
                    long j2 = j3;
                    long j3 = j4;
                    int i4 = i4;
                    int i5 = i5;
                    long j4 = a.this.f96235d;
                    if (a.this.mData != null) {
                        i3 = ((FollowFeedList) a.this.mData).getFetchRecommend();
                    } else {
                        i3 = 1;
                    }
                    String str = str;
                    String str2 = str5;
                    int i6 = i8;
                    int i7 = i6;
                    IFollowFeedApiV1 iFollowFeedApiV1 = com.ss.android.ugc.aweme.follow.api.a.f96208a;
                    String str3 = com.ss.android.ugc.aweme.follow.d.b.f96220b;
                    Integer num = com.ss.android.ugc.aweme.follow.d.b.f96223e.get(3, 0);
                    l.b(num, "");
                    FollowFeedList followFeedList = iFollowFeedApiV1.getFriendList(j2, j3, 20, i4, i5, j4, i3, str, i6, i7, str2, i2, str3, Integer.valueOf(num.intValue()), Integer.valueOf(com.ss.android.ugc.aweme.follow.d.b.f96219a), Long.valueOf(com.ss.android.ugc.aweme.follow.d.b.f96222d), Long.valueOf(com.ss.android.ugc.aweme.follow.d.b.f96221c)).get();
                    l.b(followFeedList, "");
                    a2 = followFeedList;
                    r0 = this;
                    a.this.f96240i = 2;
                } else if (TextUtils.equals(a.this.f96232a, "rec_follow")) {
                    FollowFeedList followFeedList2 = com.ss.android.ugc.aweme.follow.api.a.f96208a.getRecommendList(20, i4, i5, a.this.f96235d, str, str2).get();
                    l.b(followFeedList2, "");
                    a2 = followFeedList2;
                } else {
                    int i8 = i2;
                    long j5 = j2;
                    int i9 = i3;
                    int i10 = i4;
                    int i11 = i5;
                    long j6 = a.this.f96235d;
                    if (a.this.mData != null) {
                        ((FollowFeedList) a.this.mData).getFetchRecommend();
                    }
                    a2 = b.a.a(i8, j5, i9, i10, i11, j6, str3, str4, str5, i2, r0.o, i7, str6);
                    a.this.f96240i = 1;
                }
                a.this.f96241j = i4;
                if (a2 != null) {
                    BusinessComponentServiceUtils.getLiveStateManager().b(a2.getItems());
                    a.this.f96237f = a2.getBlankPanelText();
                }
                return a2;
            }
        }, 0);
    }
}
