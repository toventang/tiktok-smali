package com.ss.android.ugc.aweme.port.in;

import android.app.Application;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.asve.context.e;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.property.co;
import com.ss.android.ugc.aweme.property.db;
import com.ss.android.ugc.aweme.property.ez;
import com.ss.android.ugc.aweme.setting.u;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public final class b implements e {

    /* renamed from: b  reason: collision with root package name */
    private final h f115591b = i.a((h.f.a.a) C2953b.f115602a);

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f115592c;

    /* renamed from: d  reason: collision with root package name */
    private final h f115593d;

    /* renamed from: e  reason: collision with root package name */
    private final h f115594e;

    /* renamed from: f  reason: collision with root package name */
    private final h f115595f;

    /* renamed from: g  reason: collision with root package name */
    private final File f115596g;

    /* renamed from: h  reason: collision with root package name */
    private final f f115597h;

    /* renamed from: i  reason: collision with root package name */
    private ez f115598i;

    /* renamed from: j  reason: collision with root package name */
    private final ResourceFinder f115599j;

    /* renamed from: k  reason: collision with root package name */
    private final k f115600k;

    static {
        Covode.recordClassIndex(74549);
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final com.ss.android.ugc.asve.d a() {
        return (com.ss.android.ugc.asve.d) this.f115593d.getValue();
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final com.ss.android.ugc.asve.recorder.c b() {
        return (com.ss.android.ugc.asve.recorder.c) this.f115594e.getValue();
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final VEListener.d c() {
        return (VEListener.d) this.f115595f.getValue();
    }

    public final boolean s() {
        return ((Boolean) this.f115591b.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final ResourceFinder d() {
        return this.f115599j;
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final File e() {
        return this.f115596g;
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final k m() {
        return this.f115600k;
    }

    static final class a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(74550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.asve.d(this) {
                /* class com.ss.android.ugc.aweme.port.in.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f115601a;

                static {
                    Covode.recordClassIndex(74551);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f115601a = r1;
                }

                @Override // com.ss.android.ugc.asve.d
                public final void a(String str) {
                    l.d(str, "");
                    if (!this.f115601a.this$0.s()) {
                        bj.c(str);
                    }
                }

                @Override // com.ss.android.ugc.asve.d
                public final void b(String str) {
                    l.d(str, "");
                    if (!this.f115601a.this$0.s()) {
                        bj.b(str);
                    }
                }

                @Override // com.ss.android.ugc.asve.d
                public final void c(String str) {
                    l.d(str, "");
                    if (!this.f115601a.this$0.s()) {
                        bj.a(str);
                    }
                }

                @Override // com.ss.android.ugc.asve.d
                public final void d(String str) {
                    l.d(str, "");
                    if (!this.f115601a.this$0.s()) {
                        bj.d(str);
                    }
                }
            };
        }
    }

    static final class c extends m implements h.f.a.a<AnonymousClass1> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f115603a = new c();

        static {
            Covode.recordClassIndex(74553);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new com.ss.android.ugc.asve.recorder.c() {
                /* class com.ss.android.ugc.aweme.port.in.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(74554);
                }

                @Override // com.ss.android.vesdk.VEListener.ac
                public final void a(String str, JSONObject jSONObject) {
                    l.d(str, "");
                    l.d(jSONObject, "");
                    q.a(str, jSONObject);
                }

                @Override // com.ss.android.ugc.asve.recorder.c
                public final void a(Throwable th, String str) {
                    l.d(th, "");
                    l.d(str, "");
                    com.ss.android.ugc.aweme.df.f.a(th, str);
                }
            };
        }
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final boolean i() {
        return u.a();
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final com.ss.android.ugc.asve.editor.h r() {
        return new com.ss.android.ugc.asve.editor.e();
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final boolean g() {
        return SettingsManager.a().a("enable_h264_hw_decoder", false);
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final int j() {
        return SettingsManager.a().a("min_size_bytevc1_hw_decoder", 1090);
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final int k() {
        return SettingsManager.a().a("high_fps_lower_limit_bytevc1_hw_decoder", 40);
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final int l() {
        return SettingsManager.a().a("high_fps_min_side_bytevc1_hw_decoder", 1070);
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final String o() {
        String a2 = SettingsManager.a().a("ve_runtime_config", "");
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final boolean p() {
        return com.bytedance.ies.abmock.b.a().a(true, "enable_effect_async_api", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.b$b  reason: collision with other inner class name */
    static final class C2953b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2953b f115602a = new C2953b();

        static {
            Covode.recordClassIndex(74552);
        }

        C2953b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((Boolean) com.ss.android.ugc.aweme.setting.i.h.f122219a.getValue()).booleanValue());
        }
    }

    static final class d extends m implements h.f.a.a<dmt.av.video.d.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f115604a = new d();

        static {
            Covode.recordClassIndex(74555);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dmt.av.video.d.c invoke() {
            if (com.bytedance.ies.abmock.b.a().a(true, "enable_ve_upload_applog", true)) {
                return new dmt.av.video.d.c();
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final int f() {
        int a2 = SettingsManager.a().a("enable_ve_single_gl", 0) | com.bytedance.ies.abmock.b.a().a(true, "enable_ve_cache_gl_context", 0) | 1024 | com.bytedance.ies.abmock.b.a().a(true, "enable_sdk_input_cross_platform", 0) | 65536 | 512;
        if (co.b()) {
            return a2 | 4194304;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final int h() {
        try {
            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
            l.b(iESSettingsProxy, "");
            Integer hdHwDecoderMinSideSize = iESSettingsProxy.getHdHwDecoderMinSideSize();
            l.b(hdHwDecoderMinSideSize, "");
            int intValue = hdHwDecoderMinSideSize.intValue();
            if (intValue <= 720 || intValue >= 2200) {
                return 1090;
            }
            return intValue;
        } catch (com.bytedance.ies.a unused) {
            return 1090;
        }
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final PreviewSize n() {
        f fVar = this.f115597h;
        boolean z = true;
        String a2 = com.bytedance.ies.abmock.b.a().a(true, "ve_camera_preview_size", "");
        if (!(a2 == null || a2.length() == 0)) {
            z = false;
        }
        Object obj = null;
        if (!z) {
            try {
                obj = fVar.a(a2, PreviewSize.class);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return (PreviewSize) obj;
    }

    @Override // com.ss.android.ugc.asve.context.e
    public final Map<String, Object> q() {
        ez ezVar = this.f115598i;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, db.a> entry : ez.b().entrySet()) {
            hashMap.put(entry.getKey(), ezVar.a(entry.getValue()).getFirst());
        }
        return hashMap;
    }

    public b(Application application, f fVar, ez ezVar, ResourceFinder resourceFinder, k kVar) {
        l.d(application, "");
        l.d(fVar, "");
        l.d(ezVar, "");
        l.d(kVar, "");
        this.f115597h = fVar;
        this.f115598i = ezVar;
        this.f115599j = resourceFinder;
        this.f115600k = kVar;
        ExecutorService executorService = com.bytedance.common.utility.b.c.f26891a;
        l.b(executorService, "");
        this.f115592c = executorService;
        this.f115593d = i.a((h.f.a.a) new a(this));
        this.f115594e = i.a((h.f.a.a) c.f115603a);
        this.f115595f = i.a((h.f.a.a) d.f115604a);
        this.f115596g = new File(com.ss.android.ugc.asve.a.b().getFilesDir(), "vesdk");
    }
}
