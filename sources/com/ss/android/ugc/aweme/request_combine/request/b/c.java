package com.ss.android.ugc.aweme.request_combine.request.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.lego.s;
import com.ss.android.ugc.aweme.request_combine.api.SettingCombineApi;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.request_combine.request.c;
import com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo;
import com.ss.android.ugc.aweme.requestcombine.b;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;
import h.f.b.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class c implements r {
    static {
        Covode.recordClassIndex(78576);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return s.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "request_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a implements b {
        static {
            Covode.recordClassIndex(78577);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.requestcombine.b
        public final void a(Map<String, String> map) {
            ISettingsRequestService i2 = SettingsRequestServiceImpl.i();
            if (i2 != null) {
                i2.a(map);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final aa b() {
        return aa.P0;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.r
    public final void a(Context context, boolean z) {
        Integer num;
        l.d(context, "");
        ISettingRequestExtraInfo a2 = SettingRequestExtraInfoImpl.a();
        if (a2 != null) {
            a2.a(new a());
        }
        com.ss.android.ugc.aweme.request_combine.b.a.a(com.ss.android.ugc.aweme.request_combine.b.b.FETCH_COMBINE_SETTINGS_REQUEST);
        l.d(context, "");
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = com.ss.android.ugc.aweme.request_combine.request.c.f120648c.keySet();
        l.b(keySet, "");
        int i2 = 0;
        for (T t : keySet) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append((String) t);
            i2++;
        }
        Keva repoFromSp = Keva.getRepoFromSp(context, "setting_repo_sp", 0);
        if (repoFromSp != null) {
            num = Integer.valueOf(repoFromSp.getInt("key_has_local_cache", 0));
        } else {
            num = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("api_list", sb.toString());
        hashMap.put("has_local_cache", String.valueOf(num));
        Collection<com.ss.android.ugc.aweme.request_combine.request.b> values = com.ss.android.ugc.aweme.request_combine.request.c.f120648c.values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            Map<String, String> a3 = it.next().a(context);
            if (a3 != null) {
                hashMap.putAll(a3);
            }
        }
        com.ss.android.ugc.aweme.request_combine.b.a.a(com.ss.android.ugc.aweme.request_combine.b.b.SETTINGS_COMBINE_API_CREATE);
        ((SettingCombineApi) com.bytedance.ies.ugc.aweme.network.ext.a.a().a(SettingCombineApi.a.f120613a).a(SettingCombineApi.class)).request(hashMap).b(f.a.h.a.b(f.a.k.a.f158006c)).d(c.e.f120657a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new c.f(context));
    }
}
