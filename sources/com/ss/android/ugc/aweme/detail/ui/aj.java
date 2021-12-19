package com.ss.android.ugc.aweme.detail.ui;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.search.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aj implements AwemeChangeCallBack.a {

    /* renamed from: a  reason: collision with root package name */
    private final z f79923a;

    static {
        Covode.recordClassIndex(49719);
    }

    aj(z zVar) {
        this.f79923a = zVar;
    }

    @Override // com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack.a
    public final void a(Aweme aweme) {
        z zVar = this.f79923a;
        ArrayMap arrayMap = new ArrayMap(4);
        if (zVar.f79991j != null) {
            arrayMap.put("enter_from", zVar.f79991j.getEventType());
            if (!TextUtils.isEmpty(zVar.f79991j.getTrendingEventId())) {
                arrayMap.put("isTrending", "ture");
            }
            String tabName = zVar.f79991j.getTabName();
            if (!TextUtils.isEmpty(tabName)) {
                arrayMap.put("tab_name", tabName);
            }
        }
        if (aweme != null) {
            h.f121133a.a(zVar, aweme.getAid(), arrayMap);
        }
    }
}
