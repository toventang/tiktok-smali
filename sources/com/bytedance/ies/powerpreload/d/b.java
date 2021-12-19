package com.bytedance.ies.powerpreload.d;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f34527b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.powerpreload.b f34528a;

    static {
        Covode.recordClassIndex(20652);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20653);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
