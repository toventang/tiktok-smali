package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final l f54622a;

    static {
        Covode.recordClassIndex(33893);
    }

    m(l lVar) {
        this.f54622a = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.i(3701);
        l lVar = this.f54622a;
        String.valueOf(String.valueOf(lVar.f54619a)).length();
        byte[] a2 = lVar.a();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a2, 0, a2.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String.valueOf(String.valueOf(lVar.f54619a)).length();
            }
            MethodCollector.o(3701);
            return decodeByteArray;
        }
        String valueOf = String.valueOf(lVar.f54619a);
        IOException iOException = new IOException(new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to decode image: ").append(valueOf).toString());
        MethodCollector.o(3701);
        throw iOException;
    }
}
