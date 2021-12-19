package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.ai;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.activity.SearchLiveListActivity;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter;
import com.ss.android.ugc.aweme.discover.model.tab.SearchTabViewModel;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.j.g;
import h.j.h;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenLiveMoreMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82681b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82682c = "open_live_more";

    /* renamed from: d  reason: collision with root package name */
    private k.a f82683d = k.a.PRIVATE;

    /* renamed from: e  reason: collision with root package name */
    private String f82684e = "";

    static {
        Covode.recordClassIndex(51498);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51499);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f82683d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82682c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f82683d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenLiveMoreMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        NextLiveData<ai> nextLiveData;
        JSONArray optJSONArray;
        int length;
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject.has("react_id")) {
            this.f82684e = jSONObject.optString("react_id");
            try {
                String optString = jSONObject.optString("enter_from");
                String optString2 = jSONObject.optString("search_keyword");
                if (!jSONObject.has("item_ids") || (length = (optJSONArray = jSONObject.optJSONArray("item_ids")).length()) <= 0) {
                    str = "";
                } else {
                    g a2 = h.a(0, length);
                    ArrayList arrayList = new ArrayList(n.a(a2, 10));
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(optJSONArray.get(((af) it).a()));
                    }
                    str = n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
                }
                if (!com.ss.android.ugc.aweme.a.a.a()) {
                    Context context = GlobalContext.getContext();
                    l.b(context, "");
                    com.ss.android.ugc.aweme.discover.activity.b bVar = new com.ss.android.ugc.aweme.discover.activity.b();
                    bVar.setSearchKeyword(optString2);
                    bVar.setEnterFrom(optString);
                    bVar.setSearchId("searchId");
                    bVar.setSearchType("general");
                    bVar.setRoomIdList(str);
                    bVar.setEnterMethod("click_more_general_list");
                    SearchLiveListActivity.a.a(context, bVar, com.ss.android.ugc.aweme.search.h.f121133a.e());
                } else {
                    SearchTabViewModel searchTabViewModel = SearchTabJumpCenter.INSTANCE.getSearchTabViewModel();
                    if (!(searchTabViewModel == null || (nextLiveData = searchTabViewModel.tabInfo) == null)) {
                        nextLiveData.setValue(new ai(com.ss.android.ugc.aweme.search.i.LIVE.getTabName()));
                    }
                }
            } catch (Exception e2) {
                aVar.a(0, e2.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}
