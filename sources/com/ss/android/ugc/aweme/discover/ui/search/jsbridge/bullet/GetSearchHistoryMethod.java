package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class GetSearchHistoryMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f82653b = "getSearchHistory";

    static {
        Covode.recordClassIndex(51482);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82653b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSearchHistoryMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            ISearchHistoryManager inst = SearchHistoryManager.inst(jSONObject.optString("enterFrom"));
            ArrayList<SearchHistory> arrayList = new ArrayList();
            l.b(inst, "");
            List<SearchHistory> searchHistory = inst.getSearchHistory();
            l.b(searchHistory, "");
            arrayList.addAll(searchHistory);
            JSONArray jSONArray = new JSONArray();
            for (SearchHistory searchHistory2 : arrayList) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("word", searchHistory2.keyword);
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("history_list", jSONArray);
            aVar.a((Object) jSONObject3);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "GetSearchHistoryMethod");
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
