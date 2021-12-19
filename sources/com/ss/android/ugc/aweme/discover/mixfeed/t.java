package com.ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class t extends BaseResponse {
    @c(a = "sug_word_list")

    /* renamed from: a  reason: collision with root package name */
    public List<s> f81867a;
    @c(a = "log_pb")

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f81868b;

    static {
        Covode.recordClassIndex(50830);
    }

    public final String a() {
        Map<String, String> map = this.f81868b;
        if (map == null || map.isEmpty()) {
            return "";
        }
        Map<String, String> map2 = this.f81868b;
        if (map2 == null) {
            l.b();
        }
        String str = map2.get("impr_id");
        if (str == null || str.length() == 0) {
            return "";
        }
        Map<String, String> map3 = this.f81868b;
        if (map3 == null) {
            l.b();
        }
        String str2 = map3.get("impr_id");
        if (str2 == null) {
            l.b();
        }
        return str2;
    }
}
