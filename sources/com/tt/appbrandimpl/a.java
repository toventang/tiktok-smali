package com.tt.appbrandimpl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.e.a<Aweme, FeedItemList> {

    /* renamed from: a  reason: collision with root package name */
    private int f155089a;

    /* renamed from: b  reason: collision with root package name */
    private int f155090b;

    static {
        Covode.recordClassIndex(103235);
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

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a((String) objArr[1], (String) objArr[2], 0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a((String) objArr[1], (String) objArr[2], ((FeedItemList) this.mData).cursor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r10 != null) goto L_0x000b;
     */
    @Override // com.ss.android.ugc.aweme.common.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void handleData(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.appbrandimpl.a.handleData(java.lang.Object):void");
    }

    private static List<Aweme> a(List<Aweme> list, List<Aweme> list2) {
        if (list == null || list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(aweme);
            Iterator<Aweme> it = list2.iterator();
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
        return arrayList;
    }

    private void a(final String str, final String str2, final long j2) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.tt.appbrandimpl.a.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f155093c = 10;

            static {
                Covode.recordClassIndex(103236);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, 0);
    }
}
