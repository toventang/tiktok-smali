package com.bytedance.scene;

import android.content.Intent;
import android.os.Messenger;
import com.bytedance.covode.number.Covode;

public final class v {

    /* renamed from: b  reason: collision with root package name */
    private static String f43061b = "SingeProcessMessengerHandler";

    /* renamed from: a  reason: collision with root package name */
    public Messenger f43062a;

    static {
        Covode.recordClassIndex(26391);
    }

    private v(Messenger messenger) {
        this.f43062a = messenger;
    }

    public static v a(Intent intent) {
        Messenger messenger = (Messenger) intent.getParcelableExtra(f43061b);
        if (messenger != null) {
            return new v(messenger);
        }
        return null;
    }
}
