package com.ss.android.ugc.aweme.profile.api;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.c;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.profile.preload.ProfilePagePreload;
import java.util.ArrayList;

public final /* synthetic */ class a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f115991a;

    /* renamed from: b  reason: collision with root package name */
    private final int f115992b;

    /* renamed from: c  reason: collision with root package name */
    private final String f115993c;

    /* renamed from: d  reason: collision with root package name */
    private final String f115994d;

    /* renamed from: e  reason: collision with root package name */
    private final int f115995e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final long f115996f = 0;

    /* renamed from: g  reason: collision with root package name */
    private final int f115997g = 20;

    /* renamed from: h  reason: collision with root package name */
    private final int f115998h = 0;

    /* renamed from: i  reason: collision with root package name */
    private final int f115999i = 0;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f116000j = null;

    /* renamed from: k  reason: collision with root package name */
    private final Integer f116001k;

    static {
        Covode.recordClassIndex(74807);
    }

    public a(String str, int i2, String str2, String str3, Integer num) {
        this.f115991a = str;
        this.f115992b = i2;
        this.f115993c = str2;
        this.f115994d = str3;
        this.f116001k = num;
    }

    @Override // com.bytedance.ies.powerpreload.c.b
    public final void a(com.bytedance.ies.powerpreload.d.a aVar) {
        String str = this.f115991a;
        int i2 = this.f115992b;
        String str2 = this.f115993c;
        String str3 = this.f115994d;
        int i3 = this.f115995e;
        long j2 = this.f115996f;
        int i4 = this.f115997g;
        int i5 = this.f115998h;
        int i6 = this.f115999i;
        Integer num = this.f116000j;
        Integer num2 = this.f116001k;
        ArrayList arrayList = new ArrayList();
        arrayList.add("sec_user_id");
        arrayList.add("user_id");
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo("others_homepage", str, "/aweme/v1/aweme/post/", i2, arrayList);
        String a2 = AwemeApi.a(str2, str3, i3, j2, i4, i5, i6, num);
        Intent intent = new Intent();
        intent.putExtra("preload_profile_page_url", a2);
        if (num2 != null) {
            intent.putExtra("profile_aweme_ttl", num2);
        }
        intent.putExtra("preload_profile_page_extra_info", preloadExtraInfo);
        aVar.a(AwemeApi.a(intent), ProfilePagePreload.class);
    }
}
