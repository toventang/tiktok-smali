package com.ss.android.ugc.aweme.discover.ui.search.jsbridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.web.a.a;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.ai;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.discover.e.h;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import com.ss.android.ugc.aweme.discover.ui.search.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.search.model.d;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SearchKeywordChangeMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(51473);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public SearchKeywordChangeMethod() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchKeywordChangeMethod(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        NextLiveData<ai> nextLiveData;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("enterFrom");
                String optString2 = jSONObject.optString("keyword");
                String optString3 = jSONObject.optString(StringSet.type);
                d keyword = new d().setSearchFrom(optString).setKeyword(optString2);
                l.b(keyword, "");
                c.a(new h(keyword));
                SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
                if (!(searchTabViewModel == null || (nextLiveData = searchTabViewModel.tabInfo) == null)) {
                    if (optString3 == null) {
                        l.b();
                    }
                    nextLiveData.setValue(new ai(optString3));
                }
            } catch (Exception e2) {
                b.a(e2, "SearchKeywordChangeMethod");
                if (aVar != null) {
                    aVar.a(0, e2.getMessage());
                }
                e2.printStackTrace();
                return;
            }
        }
        if (aVar != null) {
            aVar.a(new JSONArray());
        }
    }
}
