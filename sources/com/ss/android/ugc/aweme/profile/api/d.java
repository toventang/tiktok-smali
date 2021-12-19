package com.ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.c;
import com.bytedance.ies.powerpreload.d.a;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.profile.preload.ProfilePagePreload;
import java.util.ArrayList;

public final /* synthetic */ class d implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f116008a;

    /* renamed from: b  reason: collision with root package name */
    private final int f116009b;

    /* renamed from: c  reason: collision with root package name */
    private final String f116010c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f116011d;

    static {
        Covode.recordClassIndex(74810);
    }

    public d(String str, int i2, String str2, Integer num) {
        this.f116008a = str;
        this.f116009b = i2;
        this.f116010c = str2;
        this.f116011d = num;
    }

    @Override // com.bytedance.ies.powerpreload.c.b
    public final void a(a aVar) {
        String str = this.f116008a;
        int i2 = this.f116009b;
        String str2 = this.f116010c;
        Integer num = this.f116011d;
        ArrayList arrayList = new ArrayList();
        arrayList.add("sec_user_id");
        arrayList.add("user_id");
        arrayList.add("unique_id");
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo("others_homepage", str, "/aweme/v1/user/profile/other/", i2, arrayList);
        Intent intent = new Intent();
        intent.putExtra("preload_profile_page_url", str2);
        if (num != null) {
            intent.putExtra("profile_aweme_ttl", num);
        }
        intent.putExtra("preload_profile_page_extra_info", preloadExtraInfo);
        aVar.a(c.a(intent), ProfilePagePreload.class);
    }
}
