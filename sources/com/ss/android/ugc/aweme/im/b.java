package com.ss.android.ugc.aweme.im;

import android.app.Dialog;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.g;
import java.lang.ref.WeakReference;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f100060a;

    static {
        Covode.recordClassIndex(63772);
    }

    public b(WeakReference weakReference) {
        this.f100060a = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.g
    public final void a(String str, String str2, boolean z, boolean z2) {
        Dialog dialog = (Dialog) this.f100060a.get();
        if (dialog != null && !TextUtils.equals(str, "HOME")) {
            dialog.dismiss();
        }
    }
}
