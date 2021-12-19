package com.ss.android.ugc.aweme.feedback.runtime.behavior;

import android.content.Context;
import androidx.room.i;
import androidx.room.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.runtime.behavior.RuntimeBehaviorDataBase;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f95401b = b.f95404a;

    /* renamed from: c  reason: collision with root package name */
    public static final C2290a f95402c = new C2290a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final RuntimeBehaviorDataBase f95403a;

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.a$a  reason: collision with other inner class name */
    public static final class C2290a {
        static {
            Covode.recordClassIndex(60417);
        }

        private C2290a() {
        }

        public /* synthetic */ C2290a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final a f95404a = new a(d.a(), (byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f95405b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(60418);
        }
    }

    static {
        Covode.recordClassIndex(60416);
    }

    private a(Context context) {
        j a2 = i.a(context, RuntimeBehaviorDataBase.class, "runtimeBehavior").a();
        l.b(a2, "");
        this.f95403a = (RuntimeBehaviorDataBase) a2;
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
