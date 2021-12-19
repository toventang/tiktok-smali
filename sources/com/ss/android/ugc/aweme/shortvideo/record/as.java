package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.a.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.utils.e;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class as implements com.ss.android.ugc.asve.a.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f130063b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<c.b> f130064a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final String f130065c;

    static {
        Covode.recordClassIndex(85342);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85343);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.a f130066a;

        static {
            Covode.recordClassIndex(85344);
        }

        @Override // com.ss.android.ugc.aweme.df.c.b, com.ss.android.ugc.aweme.df.c.a
        public final void a() {
            this.f130066a.b();
        }

        @Override // com.ss.android.ugc.aweme.df.c.b, com.ss.android.ugc.aweme.df.c.a
        public final void b() {
            this.f130066a.a();
        }

        b(b.a aVar) {
            this.f130066a = aVar;
        }
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void k() {
        e.a(this.f130065c);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void l() {
        e.b(this.f130065c);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void m() {
        e.c(this.f130065c);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void q() {
        Iterator<T> it = this.f130064a.iterator();
        while (it.hasNext()) {
            c.C1870c.f80046a.b(it.next());
        }
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void i() {
        q.d("AVSecurityMobHelper onInitMic creationId: " + this.f130065c + " currentPage " + e.a());
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void j() {
        q.d("AVSecurityMobHelper onInitMicSuccess creationId: " + this.f130065c + " currentPage " + e.a());
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void a() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenCamera creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_open", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void b() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenCameraSuccess creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_open_success", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void c() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onReleaseCamera creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_release", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void d() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onReleaseCameraSuccess creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_release_success", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void e() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onStartPreview creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_start_preview", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void f() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onStartPreviewSuccess creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_start_preview_success", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void g() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onStopPreview creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_stop_preview", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void h() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onStopPreviewSuccess creationId: " + str + " currentPage " + e.a());
        r.a("tool_camera_stop_preview_success", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void n() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onReleaseMicSuccess creationId: " + str + " currentPage " + e.a());
        r.a("tool_mic_release_success", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void o() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenFlash creationId: " + str + " currentPage " + e.a());
        r.a("tool_flash_open", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void p() {
        String str = this.f130065c;
        l.d(str, "");
        q.d("AVSecurityMobHelper onCloseFlash creationId: " + str + " currentPage " + e.a());
        r.a("tool_flash_close", new com.ss.android.ugc.tools.f.b().a("creation_id", str).a("page", e.a()).f149193a);
    }

    public as(String str) {
        l.d(str, "");
        this.f130065c = str;
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void a(b.a aVar) {
        l.d(aVar, "");
        b bVar = new b(aVar);
        this.f130064a.add(bVar);
        c.C1870c.f80046a.a(bVar);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void a(String str) {
        l.d(str, "");
        q.d("AVSecurityMobHelper onInitMicFailed creationId: " + this.f130065c + " currentPage " + e.a());
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void b(int i2, String str) {
        l.d(str, "");
        e.a(this.f130065c, i2, str);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void a(int i2, String str) {
        l.d(str, "");
        String str2 = this.f130065c;
        l.d(str2, "");
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenCameraFailed creationId: " + str2 + " errCode: " + i2 + " msg: " + str + " currentPage " + e.a());
        r.a("tool_camera_open_fail", new com.ss.android.ugc.tools.f.b().a("creation_id", str2).a("error_code", i2).a("msg", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void c(int i2, String str) {
        l.d(str, "");
        String str2 = this.f130065c;
        l.d(str2, "");
        l.d(str, "");
        q.d("AVSecurityMobHelper onReleaseMicFailed creationId: " + str2 + " errCode: " + i2 + " msg: " + str + " currentPage " + e.a());
        r.a("tool_mic_release_fail", new com.ss.android.ugc.tools.f.b().a("creation_id", str2).a("error_code", i2).a("msg", str).a("page", e.a()).f149193a);
    }

    @Override // com.ss.android.ugc.asve.a.b
    public final void d(int i2, String str) {
        l.d(str, "");
        String str2 = this.f130065c;
        l.d(str2, "");
        l.d(str, "");
        q.d("AVSecurityMobHelper onOpenFlashFailed creationId: " + str2 + " errCode: " + i2 + " msg: " + str + " currentPage " + e.a());
        r.a("tool_flash_open_fail", new com.ss.android.ugc.tools.f.b().a("creation_id", str2).a("error_code", i2).a("msg", str).a("page", e.a()).f149193a);
    }
}
