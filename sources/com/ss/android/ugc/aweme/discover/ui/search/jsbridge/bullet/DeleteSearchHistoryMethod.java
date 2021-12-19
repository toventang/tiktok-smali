package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.kakao.usermgmt.StringSet;
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

public final class DeleteSearchHistoryMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f82649b = "deleteSearchHistory";

    static {
        Covode.recordClassIndex(51478);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82649b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteSearchHistoryMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    private static JSONObject a(ISearchHistoryManager iSearchHistoryManager) {
        l.d(iSearchHistoryManager, "");
        ArrayList<SearchHistory> arrayList = new ArrayList();
        List<SearchHistory> searchHistory = iSearchHistoryManager.getSearchHistory();
        l.b(searchHistory, "");
        arrayList.addAll(searchHistory);
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory2 : arrayList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("word", searchHistory2.keyword);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("history_list", jSONArray);
        return jSONObject2;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String string = jSONObject.getString(StringSet.type);
            ISearchHistoryManager inst = SearchHistoryManager.inst(jSONObject.optString("enterFrom"));
            if (l.a((Object) string, (Object) "0")) {
                inst.clearSearchHistory();
                l.b(inst, "");
                aVar.a((Object) a(inst));
            } else if (l.a((Object) string, (Object) "1")) {
                inst.deleteSearchHistory(new SearchHistory(jSONObject.getString("keyword"), 0));
                l.b(inst, "");
                aVar.a((Object) a(inst));
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "DeleteSearchHistoryMethod");
            aVar.a(-1, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
