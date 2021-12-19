package com.ss.android.ugc.aweme.notification.redpoint;

import android.text.TextUtils;
import b.g;
import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.a.a;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.Collection;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final c f113798a;

    /* renamed from: b  reason: collision with root package name */
    private final String f113799b;

    static {
        Covode.recordClassIndex(73180);
    }

    d(c cVar, String str) {
        this.f113798a = cVar;
        this.f113799b = str;
    }

    @Override // b.g
    public final Object then(i iVar) {
        e eVar;
        c cVar = this.f113798a;
        String str = this.f113799b;
        if (iVar == null || !iVar.a() || (eVar = (e) iVar.d()) == null || b.a((Collection) eVar.f113800a)) {
            return null;
        }
        cVar.f113797a.clear();
        for (NoticeList noticeList : eVar.f113800a) {
            int i2 = 0;
            for (NoticeCount noticeCount : noticeList.getItems()) {
                int group = noticeCount.getGroup();
                if (!a.d() && (group == 3 || group == 7 || group == 6 || group == 2 || group == 228)) {
                    i2 += noticeCount.getCount();
                }
            }
            cVar.f113797a.put(noticeList.getUserId(), Integer.valueOf(i2));
            if (str.equals("cold_start") && TextUtils.equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId(), noticeList.getUserId().toString())) {
                a.f113788b.a(noticeList);
            }
        }
        return null;
    }
}
