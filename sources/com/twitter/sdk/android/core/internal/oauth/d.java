package com.twitter.sdk.android.core.internal.oauth;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.a.e;
import com.twitter.sdk.android.core.q;
import java.text.Normalizer;
import l.a.a.a;
import l.m;
import okhttp3.OkHttpClient;

public abstract class d {

    /* renamed from: b  reason: collision with root package name */
    public final q f156016b;

    /* renamed from: c  reason: collision with root package name */
    public final com.twitter.sdk.android.core.internal.q f156017c;

    /* renamed from: d  reason: collision with root package name */
    public final String f156018d = com.twitter.sdk.android.core.internal.q.a(Normalizer.normalize("TwitterAndroidSDK" + '/' + "3.2.0.11" + ' ' + Build.MODEL + '/' + Build.VERSION.RELEASE + " (" + Build.MANUFACTURER + ';' + Build.MODEL + ';' + Build.BRAND + ';' + Build.PRODUCT + ')', Normalizer.Form.NFD));

    /* renamed from: e  reason: collision with root package name */
    public final m f156019e;

    static {
        Covode.recordClassIndex(103659);
    }

    d(q qVar, com.twitter.sdk.android.core.internal.q qVar2) {
        this.f156016b = qVar;
        this.f156017c = qVar2;
        this.f156019e = new m.a().a(qVar2.f156021a).a(new OkHttpClient.Builder().addInterceptor(new e(this)).certificatePinner(e.a()).build()).a(a.a()).a();
    }
}
