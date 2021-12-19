package com.ss.android.ugc.aweme.x;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.utils.ag;
import com.ss.android.ugc.aweme.x.c;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.VEUtils;
import f.a.ad;
import f.a.af;
import h.e.j;
import h.f.b.l;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static String f145122a;

    /* renamed from: b  reason: collision with root package name */
    static final String f145123b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f145124c = new b();

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f145129a = new e();

        static {
            Covode.recordClassIndex(94907);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public static final class h extends com.ss.android.vesdk.runtime.e {
        static {
            Covode.recordClassIndex(94910);
        }

        @Override // com.ss.android.vesdk.runtime.e
        public final String a() {
            return dj.f126462e;
        }

        h(String str) {
            super(str);
        }
    }

    private b() {
    }

    static {
        Covode.recordClassIndex(94902);
        StringBuilder sb = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        f145123b = sb.append(filesDir.getAbsolutePath()).append(File.separator).append("multi_edit").append(File.separator).toString();
    }

    public static final class f implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f145130a;

        static {
            Covode.recordClassIndex(94908);
        }

        f(ad adVar) {
            this.f145130a = adVar;
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            this.f145130a.a(new c(null, null));
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            l.d(bitmap, "");
            this.f145130a.a(new c(null, bitmap));
        }
    }

    static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145127a = new c();

        static {
            Covode.recordClassIndex(94905);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            Bitmap bitmap;
            c cVar = (c) obj;
            l.d(cVar, "");
            if (cVar.f145133a != null || (bitmap = cVar.f145134b) == null || bitmap.isRecycled()) {
                return cVar;
            }
            Application application = i.f115645a;
            l.b(application, "");
            File cacheDir = application.getCacheDir();
            l.b(cacheDir, "");
            File a2 = j.a(cacheDir, String.valueOf(System.currentTimeMillis()) + "_temp.jpg");
            ag.a(bitmap, a2, 70, Bitmap.CompressFormat.JPEG);
            return c.a.a(a2.getPath());
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f145128a;

        static {
            Covode.recordClassIndex(94906);
        }

        d(WeakReference weakReference) {
            this.f145128a = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c cVar = (c) obj;
            SmartImageView smartImageView = (SmartImageView) this.f145128a.get();
            if (smartImageView != null && cVar.f145133a != null) {
                if (!TextUtils.isEmpty(cVar.f145133a)) {
                    smartImageView.setImageURI(Uri.fromFile(new File(cVar.f145133a)).toString());
                }
                e.a aVar = new e.a();
                aVar.f39831e = com.ss.android.ttve.utils.b.b(smartImageView.getContext(), 8.0f);
                smartImageView.setCircleOptions(aVar.a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.x.b$b  reason: collision with other inner class name */
    static final class C3857b<T> implements af {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WeakReference f145126a;

        static {
            Covode.recordClassIndex(94904);
        }

        C3857b(WeakReference weakReference) {
            this.f145126a = weakReference;
        }

        @Override // f.a.af
        public final void subscribe(ad<c> adVar) {
            int i2;
            Integer valueOf;
            MethodCollector.i(9015);
            l.d(adVar, "");
            int d2 = com.ss.android.ugc.aweme.shortvideo.f.a.d();
            if (d2 == 0 || d2 == 3) {
                VERecordData a2 = VERecordData.a((com.ss.android.vesdk.runtime.e) new h(""), false);
                l.b(a2, "");
                VEUtils.getVideoFrames(a2.f150790b.get(0).f150794a, new int[]{0}, new g(adVar));
                MethodCollector.o(9015);
                return;
            }
            WeakReference weakReference = this.f145126a;
            com.ss.android.ugc.aweme.draft.model.c b2 = com.ss.android.ugc.aweme.port.in.c.C.d().b();
            if (b2 == null) {
                adVar.b(new NullPointerException());
                MethodCollector.o(9015);
                return;
            }
            new bn("CheckPointServiceImpl");
            VideoPublishEditModel a3 = bn.a(b2);
            l.b(a3, "");
            if (a3.isDuet()) {
                MultiEditVideoRecordData curMultiEditVideoRecordData = a3.getCurMultiEditVideoRecordData();
                l.b(curMultiEditVideoRecordData, "");
                VERecordData a4 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(curMultiEditVideoRecordData);
                MultiEditVideoRecordData curMultiEditVideoRecordData2 = a3.getCurMultiEditVideoRecordData();
                l.b(curMultiEditVideoRecordData2, "");
                Pair<Integer, Integer> playInOutTime = curMultiEditVideoRecordData2.getPlayInOutTime();
                a4.a(((Number) playInOutTime.first).longValue() * 1000, 1000 * ((Number) playInOutTime.second).longValue());
                int i3 = (int) (a3.mVideoCoverStartTm * 1000.0f);
                if (a3.isUseTimeReverseEffect()) {
                    int intValue = ((Number) playInOutTime.second).intValue();
                    Object obj = playInOutTime.first;
                    l.b(obj, "");
                    i2 = (intValue - ((Number) obj).intValue()) - i3;
                } else {
                    i2 = i3;
                }
                SmartImageView smartImageView = (SmartImageView) weakReference.get();
                if (!(smartImageView == null || (valueOf = Integer.valueOf(smartImageView.getWidth())) == null)) {
                    VEUtils.getVideoThumb(a4, i2, valueOf.intValue(), (int) (((float) valueOf.intValue()) / ((((float) a3.videoWidth()) * 1.0f) / ((float) a3.videoHeight()))), false, new a(a3));
                    String str = a3.multiEditVideoRecordData.coverImagePath;
                    if (str != null) {
                        adVar.a(c.a.a(str));
                        MethodCollector.o(9015);
                        return;
                    }
                }
                adVar.b(new NullPointerException());
                MethodCollector.o(9015);
            } else if (a3.isMvThemeVideoType()) {
                if (TextUtils.isEmpty(a3.mvCreateVideoData.videoCoverImgPath) || !com.ss.android.ugc.tools.utils.i.a(a3.mvCreateVideoData.videoCoverImgPath)) {
                    a3.mvCreateVideoData.videoCoverImgPath = com.ss.android.ugc.aweme.port.in.l.f115658a.d().a().a();
                    Bitmap decodeFile = BitmapFactory.decodeFile(a3.mvCreateVideoData.selectMediaList.get(0));
                    if (decodeFile != null && (true ^ decodeFile.isRecycled())) {
                        ag.a(com.ss.android.ugc.aweme.editSticker.model.a.a(a3.getCoverPublishModel(), decodeFile), new File(a3.mvCreateVideoData.videoCoverImgPath), 70, Bitmap.CompressFormat.JPEG);
                    }
                }
                adVar.a(c.a.a(a3.mvCreateVideoData.videoCoverImgPath));
                MethodCollector.o(9015);
            } else {
                com.ss.android.ugc.aweme.draft.model.d.a(b2, null, new f(adVar));
                MethodCollector.o(9015);
            }
        }
    }

    static final class a implements com.ss.android.vesdk.ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f145125a;

        static {
            Covode.recordClassIndex(94903);
        }

        a(VideoPublishEditModel videoPublishEditModel) {
            this.f145125a = videoPublishEditModel;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            MethodCollector.i(8974);
            l.d(byteBuffer, "");
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            EffectTextModel effectTextModel = this.f145125a.getCoverPublishModel().getEffectTextModel();
            l.b(createBitmap, "");
            Bitmap mergeCoverText = effectTextModel.mergeCoverText(createBitmap);
            if (TextUtils.isEmpty(this.f145125a.multiEditVideoRecordData.coverImagePath)) {
                this.f145125a.multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
            }
            ag.a(mergeCoverText, new File(this.f145125a.multiEditVideoRecordData.coverImagePath), 70, Bitmap.CompressFormat.JPEG);
            MethodCollector.o(8974);
            return false;
        }
    }

    static final class g implements com.ss.android.vesdk.ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f145131a;

        static {
            Covode.recordClassIndex(94909);
        }

        g(ad adVar) {
            this.f145131a = adVar;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            MethodCollector.i(8969);
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
            if (!com.ss.android.ugc.aweme.video.e.b(b.f145123b)) {
                new File(b.f145123b).mkdirs();
            }
            b.f145122a = b.f145123b + System.currentTimeMillis() + "_cover_img.jpg";
            ag.a(createBitmap, new File(b.f145122a), 70, Bitmap.CompressFormat.JPEG);
            c.a.a(b.f145122a);
            this.f145131a.a(c.a.a(b.f145122a));
            MethodCollector.o(8969);
            return false;
        }
    }
}
