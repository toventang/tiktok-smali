package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.framework.a.a;
import f.a.v;
import f.a.w;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements w {

    /* renamed from: a  reason: collision with root package name */
    private final int f92882a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92883b;

    /* renamed from: c  reason: collision with root package name */
    private final int f92884c;

    static {
        Covode.recordClassIndex(58918);
    }

    d(int i2, String str, int i3) {
        this.f92882a = i2;
        this.f92883b = str;
        this.f92884c = i3;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        int i2 = this.f92882a;
        String str = this.f92883b;
        int i3 = this.f92884c;
        if (i2 != 14000) {
            try {
                a.a((Exception) new IllegalArgumentException("wrong pageType argument"));
            } catch (Exception unused) {
            } finally {
                vVar.a();
            }
        } else {
            AwemeStatsApi.f91915a.awemeFastStatsReport(str, 21, i3, "").get();
            vVar.a();
        }
    }
}
