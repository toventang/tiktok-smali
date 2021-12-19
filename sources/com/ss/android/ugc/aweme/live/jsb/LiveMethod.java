package com.ss.android.ugc.aweme.live.jsb;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.a.n;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

public final class LiveMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f108429a;

    static {
        Covode.recordClassIndex(69472);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveMethod(WeakReference<Context> weakReference, a aVar) {
        super(aVar);
        l.d(weakReference, "");
        this.f108429a = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("room_id_list");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(Long.valueOf(Long.parseLong(jSONArray.get(i2).toString())));
                }
                String string = jSONObject.getString("current_room_id");
                l.b(string, "");
                long parseLong = Long.parseLong(string);
                String string2 = jSONObject.getString("enter_from");
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f23299c.R = parseLong;
                enterRoomConfig.f23299c.J = string2;
                enterRoomConfig.f23299c.H = n.f((Collection<Long>) arrayList);
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.i().a(this.f108429a.get(), enterRoomConfig);
                if (aVar != null) {
                    aVar.a((Object) null);
                }
            } catch (Exception e2) {
                if (aVar != null) {
                    aVar.a(-1, e2.getMessage());
                }
                e2.printStackTrace();
            }
        }
    }
}
