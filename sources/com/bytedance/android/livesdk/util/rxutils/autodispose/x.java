package com.bytedance.android.livesdk.util.rxutils.autodispose;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

final class x {

    /* renamed from: a  reason: collision with root package name */
    static final Throwable f22181a = new a();

    static final class a extends Throwable {
        static {
            Covode.recordClassIndex(13089);
        }

        a() {
            super("No further exceptions");
        }

        public final synchronized Throwable fillInStackTrace() {
            MethodCollector.i(11036);
            MethodCollector.o(11036);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(13088);
    }
}
