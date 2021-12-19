package d.a.b.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class j implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final h f156569a = i.a((h.f.a.a) b.f156572a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f156570b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f156571c;

    static final class a {
        static {
            Covode.recordClassIndex(103966);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<ThreadFactory> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f156572a = new b();

        static {
            Covode.recordClassIndex(103967);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ThreadFactory invoke() {
            return Executors.defaultThreadFactory();
        }
    }

    static {
        Covode.recordClassIndex(103965);
    }

    public j(String str) {
        l.c(str, "");
        this.f156571c = str;
    }

    public final Thread newThread(Runnable runnable) {
        l.c(runnable, "");
        Thread newThread = ((ThreadFactory) f156569a.getValue()).newThread(runnable);
        newThread.setName(this.f156571c + ", " + newThread.getName());
        newThread.setDaemon(true);
        l.a((Object) newThread, "");
        return newThread;
    }
}
