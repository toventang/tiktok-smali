package com.android.installreferrer.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class InstallReferrerClient {
    static {
        Covode.recordClassIndex(2471);
    }

    public abstract void a(InstallReferrerStateListener installReferrerStateListener);

    public abstract boolean a();

    public abstract void b();

    public abstract ReferrerDetails c();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5909a;

        static {
            Covode.recordClassIndex(2472);
        }

        private a(Context context) {
            this.f5909a = context;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }

        public final InstallReferrerClient a() {
            Context context = this.f5909a;
            if (context != null) {
                return new a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static a a(Context context) {
        return new a(context, (byte) 0);
    }
}
