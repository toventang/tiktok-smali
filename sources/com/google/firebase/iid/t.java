package com.google.firebase.iid;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;
import com.google.android.gms.c.k;
import java.util.concurrent.ExecutorService;

final class t implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f54487a;

    static {
        Covode.recordClassIndex(33817);
    }

    t(ExecutorService executorService) {
        this.f54487a = executorService;
    }

    public static Bundle b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.firebase.iid.a
    public final h<Integer> a(Intent intent) {
        return k.a(this.f54487a, new u(intent));
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
