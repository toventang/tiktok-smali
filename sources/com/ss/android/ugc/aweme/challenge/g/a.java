package com.ss.android.ugc.aweme.challenge.g;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.challenge.b.a;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.common.e.a<Aweme, ChallengeAwemeList> {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap<String, String> f69953a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f69954b;

    /* renamed from: c  reason: collision with root package name */
    public String f69955c = "challenge_video";

    /* renamed from: d  reason: collision with root package name */
    public final C1584a f69956d = new C1584a();

    /* renamed from: e  reason: collision with root package name */
    public long f69957e = 0;

    /* renamed from: f  reason: collision with root package name */
    private String f69958f;

    /* renamed from: g  reason: collision with root package name */
    private int f69959g;

    /* renamed from: h  reason: collision with root package name */
    private List<Aweme> f69960h;

    /* renamed from: com.ss.android.ugc.aweme.challenge.g.a$a  reason: collision with other inner class name */
    public static class C1584a {

        /* renamed from: a  reason: collision with root package name */
        public int f69969a;

        /* renamed from: b  reason: collision with root package name */
        public int f69970b;

        /* renamed from: c  reason: collision with root package name */
        public long f69971c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f69972d;

        /* renamed from: e  reason: collision with root package name */
        public String f69973e;

        /* renamed from: f  reason: collision with root package name */
        public String f69974f;

        /* renamed from: g  reason: collision with root package name */
        public String f69975g;

        /* renamed from: h  reason: collision with root package name */
        public String f69976h;

        /* renamed from: i  reason: collision with root package name */
        boolean f69977i;

        static {
            Covode.recordClassIndex(43140);
        }
    }

    static {
        Covode.recordClassIndex(43138);
    }

    public final List<Aweme> a() {
        if (this.mData == null) {
            return null;
        }
        return ((ChallengeAwemeList) this.mData).items;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        ArrayList arrayList = new ArrayList();
        if (!b.a((Collection) this.f69960h)) {
            arrayList.addAll(this.f69960h);
        }
        List<Aweme> a2 = a();
        if (!b.a((Collection) a2)) {
            arrayList.addAll(a2);
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) && b.a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((ChallengeAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 4) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return m.a(getItems(), aweme, this.mNotifyListeners);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new ChallengeAwemeList();
        }
        ((ChallengeAwemeList) this.mData).hasMore = 1;
        ((ChallengeAwemeList) this.mData).items = list;
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f69955c = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        long j2;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j2 = 0;
        } else {
            j2 = ((ChallengeAwemeList) this.mData).cursor;
        }
        a(str, j2, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), this.f69958f, this.f69954b);
    }

    public final void a(List<Aweme> list) {
        if (!b.a((Collection) list)) {
            if (this.f69960h == null) {
                this.f69960h = new ArrayList();
            }
            this.f69960h.clear();
            this.f69960h.addAll(list);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            a((String) objArr[1], 0, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, this.f69954b, ((Boolean) objArr[5]).booleanValue());
        } else {
            a((String) objArr[1], 0, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[3]).booleanValue(), null, this.f69954b);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) obj;
        if (!this.f69956d.f69977i) {
            C1584a aVar = this.f69956d;
            l.d(aVar, "");
            l.d(challengeAwemeList, "");
            String str = aVar.f69975g;
            long j2 = aVar.f69971c;
            int i2 = aVar.f69969a;
            int i3 = aVar.f69970b;
            boolean z2 = aVar.f69972d;
            String str2 = aVar.f69976h;
            String str3 = aVar.f69973e;
            String str4 = aVar.f69974f;
            if (j2 == 0) {
                com.ss.android.ugc.aweme.challenge.b.a.f69909c.a(str + '&' + j2 + '&' + i2 + '&' + i3 + '&' + z2 + '&' + str2 + '&' + str3 + '&' + str4, new a.C1582a(challengeAwemeList, System.currentTimeMillis()));
            }
        }
        if (challengeAwemeList != null && this.mListQueryType == 1) {
            if (challengeAwemeList.logPb == null) {
                this.f69958f = "";
            } else {
                this.f69958f = challengeAwemeList.logPb.getImprId();
            }
        }
        ac.a.f91473a.a(challengeAwemeList.getRequestId(), challengeAwemeList.logPb);
        List<Aweme> a2 = com.ss.android.ugc.aweme.challenge.h.a.a(challengeAwemeList);
        challengeAwemeList.items = a2;
        if (!b.a((Collection) a2) || challengeAwemeList.isHasMore()) {
            z = false;
        } else {
            z = true;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (a2 != null) {
                int size = a2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Aweme a3 = AwemeService.b().a(a2.get(i4));
                    a3.setIsTop(a2.get(i4).getIsTop());
                    if (a3.getAid() != null) {
                        f69953a.put(a3.getAid(), this.f69958f);
                    }
                    RequestIdService.a().a(a3.getAid() + (this.f69959g + 3000), challengeAwemeList.getRequestId(), i4);
                    a2.set(i4, a3);
                }
            }
            int i5 = this.mListQueryType;
            if (i5 == 1) {
                this.mData = challengeAwemeList;
            } else if (i5 == 4) {
                if (a2 != null) {
                    if (b.a((Collection) ((ChallengeAwemeList) this.mData).items)) {
                        ((ChallengeAwemeList) this.mData).items = a2;
                    } else {
                        h.a(((ChallengeAwemeList) this.mData).items, a2, c.f69980a);
                    }
                }
                ((ChallengeAwemeList) this.mData).cursor = challengeAwemeList.cursor;
                ((ChallengeAwemeList) this.mData).hasMore = challengeAwemeList.hasMore & ((ChallengeAwemeList) this.mData).hasMore;
            }
        } else if (this.mData != null) {
            ((ChallengeAwemeList) this.mData).hasMore = 0;
        }
    }

    private void a(String str, long j2, int i2, boolean z, String str2, String str3) {
        a(str, j2, i2, z, str2, str3, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r26, long r27, int r29, boolean r30, java.lang.String r31, java.lang.String r32, boolean r33) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.g.a.a(java.lang.String, long, int, boolean, java.lang.String, java.lang.String, boolean):void");
    }
}
