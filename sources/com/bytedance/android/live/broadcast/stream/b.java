package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCaptureVideoRecordDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.avframework.livestreamv2.ILiveStream;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;

public final class b implements ILiveStream.CatchVideoCallback {

    /* renamed from: d  reason: collision with root package name */
    public static final a f8486d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f8487a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.android.live.broadcast.api.d.a f8488b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8489c;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f8490e = h.i.a((h.f.a.a) e.f8498a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f8491f = h.i.a((h.f.a.a) c.f8496a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f8492g = h.i.a((h.f.a.a) C0129b.f8495a);

    /* renamed from: h  reason: collision with root package name */
    private final int f8493h;

    /* renamed from: i  reason: collision with root package name */
    private final int f8494i;

    static {
        Covode.recordClassIndex(4355);
    }

    public final String a() {
        return (String) this.f8490e.getValue();
    }

    public final String b() {
        return (String) this.f8491f.getValue();
    }

    public final f.a.b.a c() {
        return (f.a.b.a) this.f8492g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4356);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.b$b  reason: collision with other inner class name */
    static final class C0129b extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0129b f8495a = new C0129b();

        static {
            Covode.recordClassIndex(4357);
        }

        C0129b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(4359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.android.live.core.c.a.a(3, "CaptureVideoUploadController", "origin file update success");
            this.this$0.a(new File(this.this$0.b()), "2", AnonymousClass1.f8497a);
            return z.f158842a;
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onComplete() {
        com.bytedance.android.live.core.c.a.a(3, "CaptureVideoUploadController", "onComplete");
        a(new File(a()), "1", new d(this));
    }

    static final class c extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8496a = new c();

        static {
            Covode.recordClassIndex(4358);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            StringBuilder sb = new StringBuilder();
            File dir = y.e().getDir("live_capture_video", 0);
            l.b(dir, "");
            return sb.append(dir.getAbsolutePath()).append(File.separator).append("effect_video.h264").toString();
        }
    }

    static final class e extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f8498a = new e();

        static {
            Covode.recordClassIndex(4361);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            StringBuilder sb = new StringBuilder();
            File dir = y.e().getDir("live_capture_video", 0);
            l.b(dir, "");
            return sb.append(dir.getAbsolutePath()).append(File.separator).append("origin_video.h264").toString();
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8500a = new g();

        static {
            Covode.recordClassIndex(4363);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a("CaptureVideoUploadController", (Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f8501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f8502b;

        static {
            Covode.recordClassIndex(4364);
        }

        h(h.f.a.a aVar, File file) {
            this.f8501a = aVar;
            this.f8502b = file;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f8501a.invoke();
            a(this.f8502b);
        }

        private static boolean a(File file) {
            MethodCollector.i(6142);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(6142);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(6142);
            return delete;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f8503a;

        static {
            Covode.recordClassIndex(4365);
        }

        i(File file) {
            this.f8503a = file;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a("CaptureVideoUploadController", (Throwable) obj);
            a(this.f8503a);
        }

        private static boolean a(File file) {
            MethodCollector.i(7067);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(7067);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(7067);
            return delete;
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f8499a;

        static {
            Covode.recordClassIndex(4362);
        }

        public f(b bVar) {
            this.f8499a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(3, "CaptureVideoUploadController", "catchVideo");
            Bundle bundle = new Bundle();
            bundle.putInt("mode", 0);
            bundle.putString("outputPathOrigin", this.f8499a.a());
            bundle.putString("outputPathWithEffect", this.f8499a.b());
            bundle.putBoolean("hardwareEncode", this.f8499a.f8489c);
            bundle.putFloat("duration", LiveCaptureVideoRecordDurationSetting.INSTANCE.getValue());
            this.f8499a.f8488b.a(bundle, this.f8499a);
        }
    }

    public static boolean a(File file) {
        MethodCollector.i(7138);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(7138);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7138);
        return delete;
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
    public final void onError(int i2, String str) {
        com.bytedance.android.live.core.c.a.a(6, "CaptureVideoUploadController", "error code:" + i2 + " error msg:" + str);
    }

    public final void a(File file, String str, h.f.a.a<z> aVar) {
        if (file.exists() && file.isFile()) {
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("video_type", new TypedString(str));
            multipartTypedOutput.addPart("file_type", new TypedString("4"));
            multipartTypedOutput.addPart("pixel_x", new TypedString(String.valueOf(this.f8493h)));
            multipartTypedOutput.addPart("pixel_y", new TypedString(String.valueOf(this.f8494i)));
            multipartTypedOutput.addPart("data_size", new TypedString(String.valueOf(file.length())));
            multipartTypedOutput.addPart("data", new TypedFile("multipart/form-data", file));
            c().a(d.a.a().a().updateCaptureVideo(multipartTypedOutput).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new h(aVar, file), new i(file)));
        }
    }

    public b(com.bytedance.android.live.broadcast.api.d.a aVar, int i2, int i3, boolean z) {
        l.d(aVar, "");
        this.f8488b = aVar;
        this.f8493h = i2;
        this.f8494i = i3;
        this.f8489c = z;
    }
}
