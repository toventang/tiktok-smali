package com.ss.android.ugc.aweme.profile.presenter;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.a.c;
import com.ss.android.ugc.aweme.common.e.f;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.detail.i.k;
import com.ss.android.ugc.aweme.experiment.fp;
import com.ss.android.ugc.aweme.experiment.fs;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.profile.a.v;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.f.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.service.h;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.cs;
import f.a.h.a;
import f.a.t;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class b extends q<Aweme, FeedItemList> implements com.ss.android.ugc.aweme.commercialize.profile.talent.b, k {

    /* renamed from: f  reason: collision with root package name */
    public static int f116540f = -1;

    /* renamed from: a  reason: collision with root package name */
    protected int f116541a;

    /* renamed from: b  reason: collision with root package name */
    public int f116542b;

    /* renamed from: c  reason: collision with root package name */
    public String f116543c;

    /* renamed from: d  reason: collision with root package name */
    public User f116544d;

    /* renamed from: e  reason: collision with root package name */
    public String f116545e = "";

    /* renamed from: g  reason: collision with root package name */
    private int f116546g;

    /* renamed from: h  reason: collision with root package name */
    private int f116547h;

    /* renamed from: i  reason: collision with root package name */
    private String f116548i = "";

    /* renamed from: j  reason: collision with root package name */
    private LinkedHashSet<String> f116549j = new LinkedHashSet<>();

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isNewDataEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.q
    public final void a(List<Aweme> list, boolean z) {
        setItems(new ArrayList(list));
        ((FeedItemList) this.mData).cursor = (long) list.size();
        ((FeedItemList) this.mData).maxCursor = (long) list.size();
        ((FeedItemList) this.mData).hasMore = z ? 1 : 0;
    }

    public final boolean a(Aweme aweme) {
        int i2 = 0;
        if (aweme == null || aweme.getAid() == null) {
            return false;
        }
        int i3 = -1;
        List items = getItems();
        if (items == null) {
            items = new ArrayList();
            setItems(items);
        }
        for (int i4 = 0; i4 < items.size(); i4++) {
            Aweme aweme2 = (Aweme) items.get(i4);
            if (aweme2 != null) {
                if (aweme.getAwemeType() == 40) {
                }
                i3 = i4 + 1;
                if (aweme.getAid().equals(aweme2.getAid())) {
                    return false;
                }
            }
        }
        if (i3 >= 0) {
            i2 = i3;
        }
        items.add(i2, aweme);
        for (o oVar : this.mNotifyListeners) {
            if (oVar != null && (oVar instanceof f)) {
                ((f) oVar).a(items, i2);
            }
        }
        return true;
    }

    public final void a(FeedItemList feedItemList, String str) {
        MethodCollector.i(8823);
        synchronized (this) {
            try {
                File d2 = d(str);
                if (d2 != null) {
                    try {
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(d2));
                        outputStreamWriter.write(GsonHolder.c().b().b(feedItemList));
                        outputStreamWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    MethodCollector.o(8823);
                }
            } finally {
                MethodCollector.o(8823);
            }
        }
    }

    public final void a(Collection<Aweme> collection, String str) {
        if (!collection.isEmpty()) {
            t.a(new k(this, str, collection)).b(a.b(f.a.k.a.f158006c)).g();
        }
    }

    public final boolean c() {
        if (this.f116547h == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(75308);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    @Override // com.ss.android.ugc.aweme.detail.i.k
    public final List<Aweme> a() {
        if (this.f116541a == 1) {
            return getItems();
        }
        return getItems();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        User user = this.f116544d;
        boolean z = false;
        if (!(user == null || user.getCommerceUserInfo() == null || this.f116544d.getCommerceUserInfo().getAdRevenueRits() == null)) {
            for (Integer num : this.f116544d.getCommerceUserInfo().getAdRevenueRits()) {
                if (num != null && num.intValue() == com.ss.android.ugc.aweme.commercialize.profile.talent.a.a.PROFILE_RIT.getTYPE()) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.q
    public final void a(String str) {
        this.f116548i = str;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 5) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        super.setItems(list);
        if (this.mData == null) {
            FeedItemList feedItemList = new FeedItemList();
            feedItemList.items = list;
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) this.mData).items = list;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Object obj) {
        ITalentAdRevenueShareService e2;
        Aweme aweme = (Aweme) obj;
        boolean a2 = m.a(getItems(), aweme, this.mNotifyListeners);
        if (!(!a2 || (e2 = TalentAdRevenueShareServiceImpl.e()) == null || aweme.getAwemeRawAd() == null)) {
            e2.a(aweme.getAwemeRawAd().getCreativeIdStr());
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.ss.android.ugc.aweme.common.e.a
    public final boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        this.mListQueryType = ((Integer) objArr[0]).intValue();
        int i2 = this.mListQueryType;
        if (i2 == 1) {
            refreshList(objArr);
        } else if (i2 == 2) {
            loadLatestList(objArr);
        } else if (i2 == 4) {
            loadMoreList(objArr);
        }
        return true;
    }

    public static void a(Context context) {
        if (f116540f == -1 && context != null) {
            int b2 = ((int) ((((((float) n.b(context)) / ((float) n.a(context))) - 0.3f) / 0.44444445f) + 0.5f)) * 3;
            f116540f = b2;
            if (b2 < 12) {
                f116540f = 12;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        int i2;
        long j2;
        long j3;
        this.f116542b = ((Integer) objArr[4]).intValue();
        if (fs.f90079c) {
            i2 = 18;
        } else {
            i2 = 10;
        }
        if (objArr.length >= 6) {
            String str = (String) objArr[2];
            int intValue = ((Integer) objArr[3]).intValue();
            if (this.mData == null) {
                j3 = 0;
            } else {
                j3 = ((FeedItemList) this.mData).maxCursor;
            }
            a(str, intValue, j3, i2, (String) objArr[5], this.f116546g, this.f116547h);
            return;
        }
        String str2 = (String) objArr[2];
        int intValue2 = ((Integer) objArr[3]).intValue();
        if (this.mData == null) {
            j2 = 0;
        } else {
            j2 = ((FeedItemList) this.mData).maxCursor;
        }
        a(str2, intValue2, j2, i2, "", this.f116546g, this.f116547h);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        int i2;
        this.f116542b = ((Integer) objArr[4]).intValue();
        int i3 = 12;
        if (this.f116541a == 4) {
            i2 = 12;
        } else {
            i2 = 20;
        }
        if (!fs.f90079c || this.f116541a != 0) {
            i3 = i2;
        } else {
            int i4 = f116540f;
            if (i4 > 0) {
                i3 = i4;
            }
        }
        if (objArr.length >= 6) {
            b(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), 0, i3, (String) objArr[5], 0, 0);
        } else {
            b(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), 0, i3, "", 0, 0);
        }
    }

    private static File d(String str) {
        Context a2 = d.a();
        if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107194b = a2.getCacheDir();
        }
        File file = com.ss.android.ugc.aweme.lancet.d.f107194b;
        if (file == null || !file.exists()) {
            return null;
        }
        File file2 = new File(file.getPath() + File.separator + "aweme_publish");
        try {
            if (!file2.exists() && !file2.mkdirs()) {
                return null;
            }
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
        return new File(file2.getPath() + File.separator + h.f116622a.hexDigest(AwemeApi.f115976a + str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r3 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f.a.t<com.ss.android.ugc.aweme.feed.model.FeedItemList> b(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.b.b(java.lang.String):f.a.t");
    }

    /* access modifiers changed from: package-private */
    public final FeedItemList c(String str) {
        String a2;
        MethodCollector.i(9030);
        File d2 = d(str);
        if (d2 != null && d2.exists()) {
            synchronized (this) {
                try {
                    a2 = cs.a(d2, "UTF-8");
                } catch (Throwable th) {
                    MethodCollector.o(9030);
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(a2)) {
                try {
                    FeedItemList feedItemList = (FeedItemList) GsonHolder.c().b().a(a2, FeedItemList.class);
                    MethodCollector.o(9030);
                    return feedItemList;
                } catch (com.google.gson.t e2) {
                    e2.printStackTrace();
                } catch (com.google.gson.m e3) {
                    e3.printStackTrace();
                } catch (UnsupportedOperationException e4) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e4);
                }
            }
        }
        MethodCollector.o(9030);
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        final boolean z;
        final FeedItemList feedItemList = (FeedItemList) obj;
        ac.a.f91473a.a(feedItemList.getRequestId(), feedItemList.logPb);
        if (feedItemList.fetchType == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean a2 = com.bytedance.common.utility.collection.b.a((Collection) feedItemList.getItems());
        if (this.f116541a == 1) {
            if (this.mData != null) {
                ((FeedItemList) this.mData).invalidItemCount = feedItemList.invalidItemCount;
                ((FeedItemList) this.mData).invalidItemText = feedItemList.invalidItemText;
                ((FeedItemList) this.mData).hidingInvalidItem = feedItemList.hidingInvalidItem;
                ((FeedItemList) this.mData).isClearInvalidItem = feedItemList.isClearInvalidItem;
            }
            if (!com.bytedance.common.utility.collection.b.a((Collection) feedItemList.invalidItemIdList)) {
                this.f116549j.addAll(feedItemList.invalidItemIdList);
            }
        }
        if (!a2) {
            if (fp.f90066d) {
                final int i2 = this.f116541a;
                final int i3 = this.f116542b;
                if (this.mListQueryType == 1) {
                    com.bytedance.aweme.b.a.f25788b.f25790a.postDelayed(new Runnable() {
                        /* class com.ss.android.ugc.aweme.profile.presenter.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(75310);
                        }

                        public final void run() {
                            b.a(feedItemList, z, i2, i3);
                        }
                    }, 1000);
                } else {
                    a(feedItemList, z, this.f116541a, this.f116542b);
                }
            } else {
                a(feedItemList, z, this.f116541a, this.f116542b);
            }
            int i4 = this.mListQueryType;
            if (i4 == 1) {
                this.mData = feedItemList;
                if (TextUtils.equals(this.f116543c, com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
                    e.a(this.f116541a, false, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            } else if (i4 == 4) {
                if (this.mData == null) {
                    this.mData = feedItemList;
                } else {
                    if (com.bytedance.common.utility.collection.b.a((Collection) ((FeedItemList) this.mData).getItems())) {
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                    } else {
                        List<Aweme> items = ((FeedItemList) this.mData).getItems();
                        List<Aweme> items2 = feedItemList.getItems();
                        List<Aweme> items3 = ((FeedItemList) this.mData).getItems();
                        if (!(items2 == null || items3 == null)) {
                            ArrayList arrayList = new ArrayList();
                            for (Aweme aweme : items2) {
                                arrayList.add(aweme);
                                Iterator<Aweme> it = items3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (TextUtils.equals(aweme.getAid(), it.next().getAid())) {
                                            arrayList.remove(aweme);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            items2 = arrayList;
                        }
                        items.addAll(items2);
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                }
                if (TextUtils.equals(this.f116543c, com.ss.android.ugc.aweme.account.b.g().getCurUserId()) && ((FeedItemList) this.mData).getItems().size() - feedItemList.getItems().size() <= 10) {
                    e.a(this.f116541a, true, feedItemList.hasMore, feedItemList.maxCursor, feedItemList.minCursor, feedItemList.getItems().size());
                }
            }
            if (this.f116541a == 4 && this.mData != null) {
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                ((FeedItemList) this.mData).maxCursor = feedItemList.cursor;
            }
        } else if (this.mData != null) {
            ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
            ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
        } else {
            this.mData = feedItemList;
        }
    }

    static Aweme a(Aweme aweme, List<com.ss.android.ugc.aweme.commercialize.profile.talent.a.b> list) {
        if (!(aweme == null || list == null || list.isEmpty())) {
            for (com.ss.android.ugc.aweme.commercialize.profile.talent.a.b bVar : list) {
                if (!(bVar == null || TextUtils.isEmpty(bVar.f75264a) || !bVar.f75264a.equals(aweme.getAid()))) {
                    return bVar.f75265b;
                }
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.b
    public final void a(int i2, String str) {
        ITalentAdRevenueShareService e2 = TalentAdRevenueShareServiceImpl.e();
        if (e2 != null && e2.a(i2)) {
            a(i2, str, c.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE);
        }
    }

    public final void a(Aweme aweme, String str) {
        t.a(new l(this, str, aweme)).b(a.b(f.a.k.a.f158006c)).g();
    }

    public final void a(int i2, String str, c cVar) {
        ITalentAdRevenueShareService e2;
        if (!(this.mData == null || ((FeedItemList) this.mData).getItems() == null || TextUtils.isEmpty(str) || i2 < 0 || i2 >= ((FeedItemList) this.mData).getItems().size() || !b() || (e2 = TalentAdRevenueShareServiceImpl.e()) == null)) {
            int a2 = e2.a();
            ArrayList arrayList = new ArrayList();
            List<Aweme> items = ((FeedItemList) this.mData).getItems();
            for (int i3 = i2 + 1; i3 < items.size(); i3++) {
                Aweme aweme = items.get(i3);
                if (a2 > 0) {
                    arrayList.add(aweme.getAid());
                    a2--;
                }
            }
            e2.a(str, arrayList, i2, cVar, new com.ss.android.ugc.aweme.commercialize.profile.talent.d() {
                /* class com.ss.android.ugc.aweme.profile.presenter.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(75309);
                }

                @Override // com.ss.android.ugc.aweme.commercialize.profile.talent.d
                public final void a(com.ss.android.ugc.aweme.commercialize.profile.talent.a.d dVar) {
                    int i2;
                    Aweme aweme;
                    if (dVar != null) {
                        b bVar = b.this;
                        List<com.ss.android.ugc.aweme.commercialize.profile.talent.a.b> list = dVar.f75268b;
                        if (list != null && !list.isEmpty() && ((FeedItemList) bVar.mData).getItems() != null && !((FeedItemList) bVar.mData).getItems().isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < ((FeedItemList) bVar.mData).getItems().size(); i3++) {
                                Aweme aweme2 = ((FeedItemList) bVar.mData).getItems().get(i3);
                                arrayList.add(aweme2);
                                Aweme a2 = b.a(aweme2, list);
                                if (a2 != null && ((i2 = i3 + 1) >= ((FeedItemList) bVar.mData).getItems().size() || (aweme = ((FeedItemList) bVar.mData).getItems().get(i2)) == null || !aweme.isAd())) {
                                    arrayList.add(AwemeService.b().a(a2));
                                }
                            }
                            ((FeedItemList) bVar.mData).items = arrayList;
                        }
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.profile.talent.c(((FeedItemList) b.this.mData).getItems()));
                    }
                }
            });
        }
    }

    public static void a(FeedItemList feedItemList, boolean z, int i2, int i3) {
        int isTop;
        Aweme a2;
        if (!(feedItemList == null || feedItemList.getItems() == null)) {
            int size = feedItemList.getItems().size();
            for (int i4 = 0; i4 < size; i4++) {
                Aweme aweme = feedItemList.getItems().get(i4);
                if (aweme == null) {
                    isTop = -1;
                } else {
                    isTop = aweme.getIsTop();
                    if (aweme.isSelfSee() || aweme.isProhibited()) {
                        a2 = AwemeService.b().a(aweme, i2);
                        if (z && isTop >= 0) {
                            a2.setIsTop(isTop);
                        }
                        RequestIdService.a().a(a2.getAid() + (i3 + i2), feedItemList.getRequestId(), i4);
                        feedItemList.getItems().set(i4, a2);
                    }
                }
                a2 = AwemeService.b().a(aweme);
                a2.setIsTop(isTop);
                RequestIdService.a().a(a2.getAid() + (i3 + i2), feedItemList.getRequestId(), i4);
                feedItemList.getItems().set(i4, a2);
            }
        }
    }

    private void a(String str, int i2, long j2, int i3, String str2, int i4, int i5) {
        b(false, str, i2, j2, i3, str2, i4, i5);
    }

    private void b(boolean z, String str, int i2, long j2, int i3, String str2, int i4, int i5) {
        this.f116541a = i2;
        this.f116543c = str;
        if (v.a.a(i2, this.f116544d)) {
            c(z, str, i2, j2, i3, str2, i4, i5);
        } else {
            com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, new c(this, z, str, i2, j2, i3, str2, i4, i5), 0);
        }
    }

    private void c(boolean z, String str, int i2, long j2, int i3, String str2, int i4, int i5) {
        String str3;
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        t<Aweme> a2 = g.f137757a.e().a(str3, false);
        t c2 = t.c(new d(this, z, str, i2, j2, i3, str2, i4, i5));
        v.a aVar = v.f115938f;
        aVar.getClass();
        t.a(a2, c2, f.a(aVar)).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new g(this), new h(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r6 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.feed.model.FeedItemList a(boolean r20, java.lang.String r21, int r22, long r23, int r25, java.lang.String r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.presenter.b.a(boolean, java.lang.String, int, long, int, java.lang.String, int, int):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
