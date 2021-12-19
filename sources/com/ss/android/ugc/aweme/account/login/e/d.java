package com.ss.android.ugc.aweme.account.login.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f63429a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63430b;

    static {
        Covode.recordClassIndex(39082);
    }

    d(a aVar, String str) {
        this.f63429a = aVar;
        this.f63430b = str;
    }

    public final void run() {
        a aVar = this.f63429a;
        String str = this.f63430b;
        aVar.f63418a.setText(str);
        if (!TextUtils.isEmpty(str)) {
            aVar.f63418a.setSelection(str.length());
        }
    }
}
