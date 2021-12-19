package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.app.Activity;
import android.webkit.DownloadListener;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.view.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    private final DownloadBusiness f74410a;

    /* renamed from: b  reason: collision with root package name */
    private final j f74411b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f74412c;

    static {
        Covode.recordClassIndex(45893);
    }

    f(DownloadBusiness downloadBusiness, j jVar, Activity activity) {
        this.f74410a = downloadBusiness;
        this.f74411b = jVar;
        this.f74412c = activity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        this.f74410a.a(this.f74411b, this.f74412c, str, str2, str3, str4, j2);
    }
}
