package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.utils.d;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageCompressRateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageIntervalSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageWidthSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.filter.VideoCatcher;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import h.p;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class a {

    /* renamed from: j  reason: collision with root package name */
    public static final C0128a f8466j = new C0128a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f8467a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f8468b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<p<byte[], Long>> f8469c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8470d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8471e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.api.d.a f8472f;

    /* renamed from: g  reason: collision with root package name */
    public long f8473g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8474h = true;

    /* renamed from: i  reason: collision with root package name */
    public long f8475i;

    /* renamed from: k  reason: collision with root package name */
    private f.a.b.b f8476k;

    static {
        Covode.recordClassIndex(4345);
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.a$a  reason: collision with other inner class name */
    public static final class C0128a {
        static {
            Covode.recordClassIndex(4346);
        }

        private C0128a() {
        }

        public /* synthetic */ C0128a(byte b2) {
            this();
        }
    }

    public final void a() {
        if (this.f8470d && this.f8474h) {
            this.f8474h = false;
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "resume");
            this.f8468b = com.bytedance.android.livesdk.utils.b.b.b(LiveBroadcastUploadVideoImageIntervalSetting.INSTANCE.getValue(), TimeUnit.SECONDS).a(new c(this)).a(f.a.h.a.b(f.a.k.a.f158006c)).d(new d(this));
        }
    }

    public final void b() {
        long j2 = this.f8475i - 1;
        this.f8475i = j2;
        if (j2 <= 0) {
            f.a.b.b bVar = this.f8467a;
            if (bVar != null && !bVar.isDisposed()) {
                f.a.b.b bVar2 = this.f8467a;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                this.f8467a = null;
            }
            this.f8467a = t.b(1, TimeUnit.SECONDS).d(new e(this));
        }
    }

    public final synchronized void c() {
        f.a.b.b bVar;
        MethodCollector.i(6438);
        if (this.f8471e) {
            MethodCollector.o(6438);
        } else if (this.f8469c.size() <= 0) {
            MethodCollector.o(6438);
        } else {
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "upload start cache size:" + this.f8469c.size());
            p<byte[], Long> remove = this.f8469c.remove(0);
            byte[] first = remove.getFirst();
            long longValue = remove.getSecond().longValue();
            this.f8471e = true;
            f.a.b.b bVar2 = this.f8476k;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f8476k) == null)) {
                bVar.dispose();
            }
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            multipartTypedOutput.addPart("data", new TypedByteArray("application/octet-stream", first, String.valueOf(System.currentTimeMillis())));
            this.f8476k = d.a.a().a().uploadOriginScreen(multipartTypedOutput, Long.valueOf(this.f8473g)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(new f(this, longValue), new g(this, longValue));
            MethodCollector.o(6438);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8479a;

        static {
            Covode.recordClassIndex(4348);
        }

        c(a aVar) {
            this.f8479a = aVar;
        }

        @Override // f.a.d.k
        public final /* synthetic */ boolean a(Object obj) {
            l.d(obj, "");
            if (this.f8479a.f8469c.size() < 5) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8480a;

        static {
            Covode.recordClassIndex(4349);
        }

        d(a aVar) {
            this.f8480a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.broadcast.api.d.a aVar = this.f8480a.f8472f;
            if (aVar != null) {
                a aVar2 = this.f8480a;
                com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "capture start");
                Bundle bundle = new Bundle();
                long currentTimeMillis = System.currentTimeMillis();
                bundle.putInt("mode", 1);
                bundle.putBoolean("outputPixelBufferOrigin", true);
                bundle.putBoolean("outputPixelBufferWithEffect", false);
                bundle.putInt("frameCount", 1);
                bundle.putBoolean("keepVideoCatcherAlive", true);
                aVar.a(bundle, new b(aVar2, currentTimeMillis));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8481a;

        static {
            Covode.recordClassIndex(4350);
        }

        e(a aVar) {
            this.f8481a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            f.a.b.b bVar;
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "stop");
            this.f8481a.f8470d = false;
            this.f8481a.f8474h = true;
            f.a.b.b bVar2 = this.f8481a.f8468b;
            if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f8481a.f8468b) == null)) {
                bVar.dispose();
            }
            this.f8481a.f8469c.clear();
            this.f8481a.f8472f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8483b;

        static {
            Covode.recordClassIndex(4351);
        }

        f(a aVar, long j2) {
            this.f8482a = aVar;
            this.f8483b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f8482a.f8471e = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f8483b;
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "upload complete duration:".concat(String.valueOf(currentTimeMillis)));
            com.bytedance.android.live.core.d.c.a("ttlive_sticker_upload_image_all", 0, currentTimeMillis);
            this.f8482a.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8484a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8485b;

        static {
            Covode.recordClassIndex(4352);
        }

        g(a aVar, long j2) {
            this.f8484a = aVar;
            this.f8485b = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f8484a.f8471e = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f8485b;
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "upload error msg:" + th.getMessage() + " duration:" + currentTimeMillis);
            JSONObject jSONObject = new JSONObject();
            if (th instanceof com.bytedance.android.live.a.a.a) {
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", (long) ((com.bytedance.android.live.a.a.a) th).getErrorCode());
            } else {
                com.bytedance.android.live.core.d.a.a(jSONObject, "error_code", -1L);
            }
            com.bytedance.android.live.core.d.a.a(jSONObject, "error_msg", th.getMessage());
            com.bytedance.android.live.core.d.c.a("ttlive_sticker_upload_image_error", 0, currentTimeMillis, jSONObject);
            this.f8484a.c();
        }
    }

    public static final class b implements ILiveStream.CatchPicCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f8478b;

        static {
            Covode.recordClassIndex(4347);
        }

        @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
        public final void onComplete() {
        }

        b(a aVar, long j2) {
            this.f8477a = aVar;
            this.f8478b = j2;
        }

        @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchMediaDataCallback
        public final void onError(int i2, String str) {
            com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "capture error code:" + i2 + " msg " + str);
        }

        @Override // com.ss.avframework.livestreamv2.ILiveStream.CatchPicCallback
        public final void onCatchedPic(boolean z, VideoCatcher videoCatcher) {
            if (videoCatcher != null && !z) {
                com.bytedance.android.live.core.c.a.a(3, "CaptureImageUploadController", "capture catched pic");
                try {
                    this.f8477a.f8469c.add(new p<>(videoCatcher.getCompressedStream(LiveBroadcastUploadVideoImageWidthSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageHeightSetting.INSTANCE.getValue(), LiveBroadcastUploadVideoImageCompressRateSetting.INSTANCE.getValue()), Long.valueOf(this.f8478b)));
                    this.f8477a.c();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
