package com.ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f123520a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f123521b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f123522c;

    /* renamed from: d  reason: collision with root package name */
    private final String f123523d;

    /* renamed from: e  reason: collision with root package name */
    private final String f123524e;

    /* renamed from: f  reason: collision with root package name */
    private final String f123525f;

    static {
        Covode.recordClassIndex(81092);
    }

    d(b bVar, Activity activity, Aweme aweme, String str, String str2, String str3) {
        this.f123520a = bVar;
        this.f123521b = activity;
        this.f123522c = aweme;
        this.f123523d = str;
        this.f123524e = str2;
        this.f123525f = str3;
    }

    public final void run() {
        b bVar = this.f123520a;
        Activity activity = this.f123521b;
        Aweme aweme = this.f123522c;
        String str = this.f123523d;
        String str2 = this.f123524e;
        String str3 = this.f123525f;
        if (!activity.isFinishing()) {
            if (bVar.f123511b != null) {
                bVar.f123511b.dismiss();
            }
            VideoShare2GifEditActivity.a(activity, aweme.getAid(), aweme.getAuthorUid(), b.a(aweme), str, str2, str3);
            if (bVar.f123510a != null) {
                bVar.f123510a.f124402h.setValue(false);
            }
        }
    }
}
