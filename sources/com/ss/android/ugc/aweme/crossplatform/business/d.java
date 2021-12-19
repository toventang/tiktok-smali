package com.ss.android.ugc.aweme.crossplatform.business;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.web.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    static final ValueCallback f78673a = new d();

    static {
        Covode.recordClassIndex(48843);
    }

    private d() {
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            String replace = str.replace("\"", "");
            if (!TextUtils.isEmpty(replace)) {
                a.f144860f = replace;
            }
        }
    }
}
