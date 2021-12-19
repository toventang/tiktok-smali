package com.ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f65479a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(40266);
    }

    public static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
