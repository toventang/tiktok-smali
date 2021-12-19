package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;

public final class at extends Binder {

    /* renamed from: a  reason: collision with root package name */
    final a f54438a;

    public interface a {
        static {
            Covode.recordClassIndex(33792);
        }

        h<Void> a(Intent intent);
    }

    static {
        Covode.recordClassIndex(33791);
    }

    public at(a aVar) {
        this.f54438a = aVar;
    }
}
