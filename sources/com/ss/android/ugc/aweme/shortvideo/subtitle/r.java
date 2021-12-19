package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.au;
import com.ss.android.ugc.aweme.property.dw;
import com.ss.android.ugc.aweme.property.q;
import com.ss.android.ugc.aweme.property.s;
import com.ss.android.ugc.aweme.publish.f.g;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.x;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130992a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.n.b f130993b = new com.ss.android.ugc.aweme.n.b();

    /* renamed from: c  reason: collision with root package name */
    private volatile x f130994c;

    /* renamed from: d  reason: collision with root package name */
    private final h f130995d = i.a((h.f.a.a) c.f130999a);

    static {
        Covode.recordClassIndex(85866);
    }

    private final SubtitleApi c() {
        return (SubtitleApi) this.f130995d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85867);
        }

        private a() {
        }

        public static void a() {
            bj.d("RecognizeCaptionExecutor delete audio file");
            e.c(new File(dj.f126461d + "output.aac").getPath());
            e.c(new File(dj.f126461d + "origin.aac").getPath());
            e.c(new File(dj.f126461d + "outputmix.aac").getPath());
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final i<String> a(String str, int i2, int i3) {
        l.d(str, "");
        try {
            T t = c().submit(str, i2, i3).execute().f42630b;
            if (t != null) {
                if (t.f131004a != 0 || t.f131005b.f130988a.length() <= 0) {
                    return new i<>(1, null, null, 6);
                }
                return new i<>(0, null, t.f131005b.f130988a, 3);
            }
        } catch (Exception e2) {
            bj.a(e2);
        }
        return new i<>(-1, null, null, 6);
    }

    public static final class d implements AbstractVideoUploader.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractVideoUploader f131000a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f131001b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f131002c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f131003d;

        static {
            Covode.recordClassIndex(85870);
        }

        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader.b
        public final int a() {
            return com.ss.android.ugc.aweme.shortvideo.upload.b.a(this.f131003d, "SubtitleOriginalSoundUpload");
        }

        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader.b
        public final void a(int i2, long j2, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
            if (i2 == 0) {
                this.f131001b.element = (T) videoUploadInfo.getMTosKey();
                this.f131000a.b();
                this.f131002c.countDown();
            } else if (i2 == 2) {
                this.f131000a.b();
                this.f131002c.countDown();
            }
        }

        d(AbstractVideoUploader abstractVideoUploader, z.e eVar, CountDownLatch countDownLatch, g gVar) {
            this.f131000a = abstractVideoUploader;
            this.f131001b = eVar;
            this.f131002c = countDownLatch;
            this.f131003d = gVar;
        }
    }

    static final class c extends m implements h.f.a.a<SubtitleApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f130999a = new c();

        static {
            Covode.recordClassIndex(85869);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SubtitleApi invoke() {
            au C = com.ss.android.ugc.aweme.port.in.g.a().C();
            AVApi b2 = AVApiImpl.b();
            l.b(b2, "");
            String a2 = b2.a();
            l.b(a2, "");
            return C.createRetrofit(a2, true, SubtitleApi.class);
        }
    }

    public static final class b implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f130996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f130997b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CountDownLatch f130998c;

        static {
            Covode.recordClassIndex(85868);
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            this.f130996a.element = (T) this.f130997b;
            bj.d("RecognizeCaptionExecutor extractAudio compile audio done streamAudioPath " + ((String) this.f130996a.element));
            this.f130998c.countDown();
        }

        b(z.e eVar, String str, CountDownLatch countDownLatch) {
            this.f130996a = eVar;
            this.f130997b = str;
            this.f130998c = countDownLatch;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            bj.b("RecognizeCaptionExecutor subtitle mix fail, code =".concat(String.valueOf(i2)));
            this.f130998c.countDown();
        }
    }

    public final void b() {
        bj.d("RecognizeCaptionExecutor stopExtractAudio mVeEditor: " + this.f130994c);
        x xVar = this.f130994c;
        if (xVar != null) {
            xVar.h();
        }
        x xVar2 = this.f130994c;
        if (xVar2 != null) {
            xVar2.j();
        }
        this.f130994c = null;
    }

    public static i<com.ss.android.ugc.aweme.publish.f.h> a() {
        Object a2 = com.ss.android.ugc.aweme.port.in.g.a().G().a(com.ss.android.ugc.aweme.port.in.g.a().e().getSdkV4AuthKey(""), com.ss.android.ugc.aweme.publish.f.d.class);
        if (a2 != null) {
            return new i<>(0, "", a2);
        }
        try {
            return new i<>(0, "", new TTUploaderService().a().get());
        } catch (Exception e2) {
            bj.a(e2);
            return new i<>(1, "request upload config failed", null, 4);
        }
    }

    private static boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.veAudioRecorderParam == null || !videoPublishEditModel.veAudioRecorderParam.hasRecord()) {
            return false;
        }
        return true;
    }

    public final i<List<com.ss.android.ugc.aweme.sticker.data.h>> a(String str) {
        l.d(str, "");
        try {
            T t = c().query(str).execute().f42630b;
            if (t != null) {
                if (t.f131004a == 0) {
                    return new i<>(0, null, t.f131005b.f130991d, 3);
                }
                return new i<>(t.f131004a, null, null, 6);
            }
        } catch (Exception e2) {
            bj.a(e2);
        }
        return new i<>(-1, null, null, 6);
    }

    private static int a(String str, String str2) {
        if (dw.a()) {
            return com.ss.android.ugc.aweme.n.b.a("Caption", str, str2, com.ss.android.ugc.aweme.property.r.a(), q.a(), s.a());
        }
        return com.ss.android.ugc.aweme.n.b.a("Caption", str, str2, 1, -1, 16000);
    }

    public static i<String> a(String str, g gVar) {
        l.d(str, "");
        l.d(gVar, "");
        if (VEUtils.checkAudioFile(str) != 0) {
            return new i<>(1, "audio file is not valid", null, 4);
        }
        AbstractVideoUploader a2 = com.ss.android.ugc.aweme.uploader.factory.b.a(gVar, AbstractVideoUploader.a.CAPTION);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        z.e eVar = new z.e();
        eVar.element = null;
        try {
            a2.a(new d(a2, eVar, countDownLatch, gVar));
            a2.a(str);
            a2.a();
            try {
                countDownLatch.await(40000, TimeUnit.MILLISECONDS);
            } catch (Exception e2) {
                bj.a(e2);
            }
            T t = eVar.element;
            if (t == null || t.length() == 0) {
                return new i<>(1, "upload failed", null, 4);
            }
            return new i<>(0, null, eVar.element, 3);
        } catch (Exception e3) {
            a2.b();
            return new i<>(1, String.valueOf(e3.getMessage()), null, 4);
        }
    }

    private static void a(EditPreviewInfo editPreviewInfo, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        int size = editPreviewInfo.getVideoList().size();
        for (int i2 = 0; i2 < size; i2++) {
            EditVideoSegment editVideoSegment = editPreviewInfo.getVideoList().get(i2);
            strArr[i2] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    l.b();
                }
                jArr[i2] = videoCutInfo.getStart();
                jArr2[i2] = videoCutInfo.getEnd();
                fArr[i2] = videoCutInfo.getSpeed();
            } else {
                jArr[i2] = -1;
                jArr2[i2] = -1;
                fArr[i2] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }

    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.shortvideo.subtitle.i<java.lang.String> a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r35, int r36, int r37, int r38, int r39, h.f.a.a<java.lang.Boolean> r40) {
        /*
        // Method dump skipped, instructions count: 990
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.subtitle.r.a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int, int, int, int, h.f.a.a):com.ss.android.ugc.aweme.shortvideo.subtitle.i");
    }
}
