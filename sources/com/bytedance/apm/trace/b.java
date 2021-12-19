package com.bytedance.apm.trace;

import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.apm.c;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static e f25287a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f25288b;

    static {
        Covode.recordClassIndex(14729);
    }

    public static void a() {
        e eVar = new e("start_trace", "launch_stats");
        f25287a = eVar;
        eVar.f25367b = System.currentTimeMillis();
        if (c.c()) {
            boolean isOpenLaunchEvilMethod = EvilMethodSwitcher.isOpenLaunchEvilMethod();
            f25288b = isOpenLaunchEvilMethod;
            if (isOpenLaunchEvilMethod) {
                com.bytedance.apm.f.a.b.a();
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f25289a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f25290b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f25291c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f25292d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f25293e;

        /* renamed from: com.bytedance.apm.trace.b$a$a  reason: collision with other inner class name */
        public static class C0532a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f25299a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f25300b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f25301c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f25302d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f25303e;

            static {
                Covode.recordClassIndex(14731);
            }
        }

        static {
            Covode.recordClassIndex(14730);
        }

        private a(C0532a aVar) {
            this.f25289a = aVar.f25299a;
            this.f25290b = aVar.f25300b;
            this.f25291c = aVar.f25301c;
            this.f25292d = aVar.f25302d;
            this.f25293e = aVar.f25303e;
        }

        public /* synthetic */ a(C0532a aVar, byte b2) {
            this(aVar);
        }
    }
}
