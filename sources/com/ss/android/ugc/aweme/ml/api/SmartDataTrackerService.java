package com.ss.android.ugc.aweme.ml.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl;
import h.f.b.l;

public abstract class SmartDataTrackerService implements ISmartDataTrackerService {
    public static final a Companion = new a((byte) 0);
    public static boolean debug = com.ss.android.ugc.aweme.ml.a.a.f110297a;

    public static final boolean getDebug() {
        return debug;
    }

    public static final void setDebug(boolean z) {
        debug = z;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70871);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ISmartDataTrackerService f110381a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f110382b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(70872);
            ISmartDataTrackerService a2 = SmartDataTrackerServiceImpl.a();
            l.b(a2, "");
            f110381a = a2;
        }
    }

    public static final ISmartDataTrackerService instance() {
        return b.f110381a;
    }

    static {
        Covode.recordClassIndex(70870);
    }
}
