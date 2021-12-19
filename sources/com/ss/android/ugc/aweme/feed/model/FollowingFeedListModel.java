package com.ss.android.ugc.aweme.feed.model;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.feed.api.j;
import com.ss.android.ugc.aweme.feed.j.b;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class FollowingFeedListModel extends a<Aweme, j> {
    private final List<String> blueDotList;
    public int footerNextCursor;
    public String footerUid = "";
    public boolean hasMoreFooter;
    public boolean hasMoreHeader;
    public int headerNextCursor;
    public String headerUid = "";
    public final List<String> uidList;

    static {
        Covode.recordClassIndex(59385);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return this.hasMoreFooter;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        j jVar = (j) this.mData;
        if (jVar != null) {
            return jVar.getAwemeList();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        if (this.hasMoreFooter) {
            loadList(this.footerNextCursor, this.footerUid, 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        Object obj = objArr[1];
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            loadList(0, str, 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadLatestList(Object... objArr) {
        l.d(objArr, "");
        if (!this.hasMoreHeader) {
            Message obtainMessage = this.mHandler.obtainMessage(0);
            l.b(obtainMessage, "");
            obtainMessage.obj = new b();
            this.mHandler.sendMessage(obtainMessage);
            return;
        }
        loadList(this.headerNextCursor, this.headerUid, 3);
    }

    public FollowingFeedListModel(List<String> list, List<String> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.uidList = list;
        this.blueDotList = list2;
    }

    private final void loadList(int i2, String str, int i3) {
        int i4;
        boolean z;
        if (i3 != 3) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        Iterator<String> it = this.uidList.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (p.a(it.next(), str, true)) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= this.blueDotList.size() || !p.a(this.blueDotList.get(i5), "true", true)) {
            z = false;
        } else {
            z = true;
        }
        FollowFeedApi.a.a().getFollowingInterestFeed(i2, 8, str, i4, 2, z).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new FollowingFeedListModel$loadList$1(this, i3, str, z, i2), new FollowingFeedListModel$loadList$2(this));
    }
}
