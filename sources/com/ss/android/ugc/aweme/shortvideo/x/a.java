package com.ss.android.ugc.aweme.shortvideo.x;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.tools.c;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.asve.recorder.effect.a f132970a;

    /* renamed from: b  reason: collision with root package name */
    private String f132971b;

    static {
        Covode.recordClassIndex(86963);
    }

    public final void a() {
        com.ss.android.ugc.asve.recorder.effect.a aVar = this.f132970a;
        if (aVar != null) {
            aVar.i(true);
        }
    }

    public a(com.ss.android.ugc.asve.recorder.effect.a aVar) {
        this.f132970a = aVar;
    }

    public final void a(String str) {
        this.f132970a.a(str);
        this.f132971b = str;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a$a  reason: collision with other inner class name */
    public static class C3440a {

        /* renamed from: a  reason: collision with root package name */
        public String f132972a;

        /* renamed from: b  reason: collision with root package name */
        public String f132973b;

        /* renamed from: c  reason: collision with root package name */
        public String f132974c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f132975d;

        /* renamed from: e  reason: collision with root package name */
        public com.ss.android.ugc.asve.recorder.c.a f132976e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f132977f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f132978g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f132979h;

        static {
            Covode.recordClassIndex(86964);
        }

        private static boolean a(File file) {
            MethodCollector.i(6188);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(6188);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(6188);
            return delete;
        }

        private void b(j jVar) {
            if (this.f132978g) {
                a(jVar, this.f132972a, this.f132973b, 0);
                return;
            }
            if (this.f132972a != null) {
                File file = new File(this.f132972a);
                if (file.exists()) {
                    a(file);
                }
            }
            if (this.f132973b != null) {
                File file2 = new File(this.f132973b);
                if (file2.exists()) {
                    a(file2);
                }
            }
            if (this.f132972a != null && this.f132973b != null) {
                c.f149151f.d("CameraVideoRecorder concatWithReleaseGPUResource concatAsync enableSingleSegmentConcatUseCopy " + this.f132975d);
                this.f132976e.a(this.f132972a, this.f132973b, this.f132975d, this.f132974c, "", new c(this, jVar));
            }
        }

        public final void a(j jVar) {
            if (this.f132977f || this.f132979h) {
                b(jVar);
            } else if (this.f132978g) {
                c.f149151f.d("CameraVideoRecorder concat return 0");
                jVar.a(this.f132972a, this.f132973b, this.f132974c, 0);
            } else {
                if (this.f132972a != null) {
                    File file = new File(this.f132972a);
                    if (file.exists()) {
                        a(file);
                    }
                }
                if (this.f132973b != null) {
                    File file2 = new File(this.f132973b);
                    if (file2.exists()) {
                        a(file2);
                    }
                }
                c.f149151f.d("CameraVideoRecorder executeAsync concatasync enableSingleSegmentConcatUseCopy " + this.f132975d);
                this.f132976e.a(this.f132972a, this.f132973b, this.f132975d, this.f132974c, "", new b(this, jVar));
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(j jVar, String str, String str2, int i2) {
            this.f132976e.a(new d(this, jVar, str, str2, i2));
        }
    }

    public final void a(String str, float f2) {
        this.f132970a.a(str, f2);
        this.f132971b = str;
    }
}
