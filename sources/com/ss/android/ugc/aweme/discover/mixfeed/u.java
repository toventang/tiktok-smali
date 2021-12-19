package com.ss.android.ugc.aweme.discover.mixfeed;

import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.detail.i.k;
import com.ss.android.ugc.aweme.discover.api.a;
import com.ss.android.ugc.aweme.discover.j.f;
import com.ss.android.ugc.aweme.discover.j.l;
import com.ss.android.ugc.aweme.discover.mixfeed.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class u extends f<h, m> implements k {

    /* renamed from: a  reason: collision with root package name */
    private int f81869a;

    /* renamed from: f  reason: collision with root package name */
    protected String f81870f;

    /* renamed from: g  reason: collision with root package name */
    protected int f81871g;

    static {
        Covode.recordClassIndex(50831);
    }

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final boolean b() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.discover.j.f
    public final int c() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.detail.i.k
    public final List<Aweme> a() {
        return a(getItems());
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public boolean isHasMore() {
        if (this.mData == null || !((m) this.mData).f81825b) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.ss.android.ugc.aweme.discover.mixfeed.m r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0010
            java.lang.String r0 = r2.getRequestId()
            r1.p = r0
            java.util.List<com.ss.android.ugc.aweme.discover.mixfeed.h> r0 = r2.f81826c
            boolean r0 = com.bytedance.common.utility.collection.b.a(r0)
            if (r0 == 0) goto L_0x001d
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1.mIsNewDataEmpty = r0
            boolean r0 = r1.mIsNewDataEmpty
            if (r0 != 0) goto L_0x001c
            com.ss.android.ugc.aweme.discover.c.e r0 = com.ss.android.ugc.aweme.discover.c.e.f80919b
            r0.a(r2)
        L_0x001c:
            return
        L_0x001d:
            r0 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.mixfeed.u.c(com.ss.android.ugc.aweme.discover.mixfeed.m):void");
    }

    public static List<Aweme> a(List<h> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (h hVar : list) {
            if (hVar.getFeedType() == 65280) {
                arrayList.add(hVar.getAweme());
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void loadMoreList(Object... objArr) {
        int i2;
        if (b.a((Collection) getItems())) {
            i2 = 0;
        } else {
            i2 = ((m) this.mData).f81824a;
        }
        if (objArr.length == 1) {
            a(a(objArr), i2, this.q, i(), this.r);
        } else {
            a(a(objArr), i2, 10, 0, this.q, ((Integer) objArr[5]).intValue(), (com.ss.android.ugc.aweme.search.g.b) objArr[6], i(), this.r);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public void refreshList(Object... objArr) {
        if (objArr.length == 2) {
            a(a(objArr), 0, "", i(), this.r);
        } else {
            a(a(objArr), 0, p.f81853c, ((Integer) objArr[2]).intValue(), "", ((Integer) objArr[5]).intValue(), (com.ss.android.ugc.aweme.search.g.b) objArr[6], i(), this.r);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0168  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.ss.android.ugc.aweme.discover.mixfeed.m r11) {
        /*
        // Method dump skipped, instructions count: 507
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.mixfeed.u.handleData(com.ss.android.ugc.aweme.discover.mixfeed.m):void");
    }

    private void a(String str, int i2, String str2, String str3, String str4) {
        a(str, i2, 10, 0, str2, this.f81871g, this.f81244h, str3, str4);
    }

    /* access modifiers changed from: protected */
    public void a(String str, int i2, int i3, int i4, String str2, int i5, com.ss.android.ugc.aweme.search.g.b bVar, String str3, String str4) {
        p<n, i<m>> b2;
        i<m> iVar = null;
        if (!(i2 == 0 || this.mData == null)) {
            i<m> iVar2 = ((m) this.mData).f81829g;
            ((m) this.mData).f81829g = null;
            if (iVar2 != null) {
                iVar2.a(new e(this.mHandler));
                return;
            }
        }
        String str5 = "";
        if (!(this.f81245i == null || this.f81245i.getSugUserId() == null || this.f81245i.getSugUserId().equals(str5))) {
            str5 = this.f81245i.getSugUserId();
        }
        this.f81871g = i5;
        this.f81244h = bVar;
        n a2 = new n.a().a(str).a(i2).b(i3).c(i4).b(str2).d(i5).a(this.f81244h).d(e()).e(this.o).a(this.f81245i).e(str3).h(str5).f(a.a()).c(str4).a();
        if (i2 == 0 && (b2 = l.b(a2)) != null) {
            a2 = b2.getFirst();
            iVar = b2.getSecond();
        }
        a(1, "topMixModel new request");
        this.mIsLoading = true;
        if (iVar == null) {
            iVar = a2.a();
        }
        this.f81247k = a2;
        iVar.b(v.f81873a).b(w.f81874a).a(new e(this.mHandler));
    }
}
