package com.facebook.drawee.b;

import com.bytedance.covode.number.Covode;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f47290b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f47291c = true;

    /* renamed from: a  reason: collision with root package name */
    private final Queue<a> f47292a = new ArrayBlockingQueue(20);

    public String toString() {
        return this.f47292a.toString();
    }

    static {
        Covode.recordClassIndex(28743);
    }

    private b() {
    }

    public static b a() {
        if (f47291c) {
            return new b();
        }
        return f47290b;
    }

    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT;

        static {
            Covode.recordClassIndex(28744);
        }
    }

    public final void a(a aVar) {
        if (f47291c) {
            if (this.f47292a.size() + 1 > 20) {
                this.f47292a.poll();
            }
            this.f47292a.add(aVar);
        }
    }
}
