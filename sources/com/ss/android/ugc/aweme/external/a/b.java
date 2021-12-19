package com.ss.android.ugc.aweme.external.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.external.a.e;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.video.VideoCoverServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.u;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import dmt.av.video.aj;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class b implements IAVInfoService {
    static {
        Covode.recordClassIndex(56645);
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;

        static {
            Covode.recordClassIndex(56649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.$callback = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.$callback;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(-3);
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;

        static {
            Covode.recordClassIndex(56651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.$callback = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.$callback;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(-3);
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;

        static {
            Covode.recordClassIndex(56654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.$callback = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.$callback;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(null);
            }
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.a<z> {
        final /* synthetic */ int[] $ptsMs;
        final /* synthetic */ String $videoPath;
        final /* synthetic */ ad $wrapperListener;

        static {
            Covode.recordClassIndex(56655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(String str, int[] iArr, ad adVar) {
            super(0);
            this.$videoPath = str;
            this.$ptsMs = iArr;
            this.$wrapperListener = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            VEUtils.getVideoFrames(this.$videoPath, this.$ptsMs, this.$wrapperListener);
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $isShowErrToast;
        final /* synthetic */ int $maxDuration;
        final /* synthetic */ int $minDuration;
        final /* synthetic */ r $onError;
        final /* synthetic */ h.f.a.m $onSuccess;
        final /* synthetic */ String $videoPath;

        static {
            Covode.recordClassIndex(56646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, String str, boolean z, int i2, int i3, h.f.a.m mVar, r rVar) {
            super(0);
            this.$context = context;
            this.$videoPath = str;
            this.$isShowErrToast = z;
            this.$maxDuration = i2;
            this.$minDuration = i3;
            this.$onSuccess = mVar;
            this.$onError = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            new com.ss.android.ugc.aweme.mediachoose.b(this.$context).isVideoLengthOrTypeSupportedAndShowErrToast(this.$videoPath, this.$isShowErrToast, this.$maxDuration, this.$minDuration, this.$onSuccess, this.$onError);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.b$b  reason: collision with other inner class name */
    static final class C2170b extends m implements h.f.a.a<z> {
        final /* synthetic */ r $onError;

        static {
            Covode.recordClassIndex(56647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2170b(r rVar) {
            super(0);
            this.$onError = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$onError.a("", 0L, -10086, "decompress failed");
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;
        final /* synthetic */ String $mp3FilePath;

        static {
            Covode.recordClassIndex(56650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(IAVInfoService.IGetInfoCallback iGetInfoCallback, String str) {
            super(0);
            this.$callback = iGetInfoCallback;
            this.$mp3FilePath = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.$callback;
            if (iGetInfoCallback != null) {
                iGetInfoCallback.finish(Integer.valueOf(VEUtils.checkMp3File(this.$mp3FilePath)));
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c $draft;

        static {
            Covode.recordClassIndex(56652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.ss.android.ugc.aweme.draft.model.c cVar, IAVInfoService.IGetInfoCallback iGetInfoCallback) {
            super(0);
            this.$draft = cVar;
            this.$callback = iGetInfoCallback;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            new VideoCoverServiceImpl().getVideoCoverByCallback(this.$draft, new IEffectService.OnVideoCoverCallback(this) {
                /* class com.ss.android.ugc.aweme.external.a.b.g.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ g f90287a;

                static {
                    Covode.recordClassIndex(56653);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f90287a = r1;
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i2) {
                    IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f90287a.$callback;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(null);
                    }
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    l.d(bitmap, "");
                    IAVInfoService.IGetInfoCallback iGetInfoCallback = this.f90287a.$callback;
                    if (iGetInfoCallback != null) {
                        iGetInfoCallback.finish(bitmap);
                    }
                }
            });
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $mp3FilePath;

        static {
            Covode.recordClassIndex(56648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, IAVInfoService.IGetInfoCallback iGetInfoCallback, Context context) {
            super(0);
            this.$mp3FilePath = str;
            this.$callback = iGetInfoCallback;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2;
            if (com.ss.android.ugc.aweme.shortvideo.af.b.a(this.$mp3FilePath)) {
                IAVInfoService.IGetInfoCallback iGetInfoCallback = this.$callback;
                if (iGetInfoCallback != null) {
                    iGetInfoCallback.finish(Integer.valueOf(VEUtils.checkMp3File(this.$mp3FilePath)));
                }
            } else {
                IAVInfoService.IGetInfoCallback iGetInfoCallback2 = this.$callback;
                if (iGetInfoCallback2 != null) {
                    if (com.ss.android.ugc.aweme.shortvideo.af.b.a(this.$mp3FilePath, this.$context)) {
                        i2 = 0;
                    } else {
                        i2 = -1;
                    }
                    iGetInfoCallback2.finish(Integer.valueOf(i2));
                }
            }
            return z.f158842a;
        }
    }

    static final class k extends m implements h.f.a.a<z> {
        final /* synthetic */ IAVInfoService.IGetInfoCallback $callback;
        final /* synthetic */ String $videoFilePath;
        final /* synthetic */ boolean $withRotation;

        static {
            Covode.recordClassIndex(56657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(IAVInfoService.IGetInfoCallback iGetInfoCallback, String str, boolean z) {
            super(0);
            this.$callback = iGetInfoCallback;
            this.$videoFilePath = str;
            this.$withRotation = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVInfoService.IGetInfoCallback iGetInfoCallback = this.$callback;
            String str = this.$videoFilePath;
            boolean z = this.$withRotation;
            l.d(str, "");
            com.ss.android.ugc.aweme.port.in.g.a().u();
            int[] iArr = new int[11];
            if (z) {
                VEUtils.VEVideoFileInfo a2 = u.a(str);
                if (a2 != null) {
                    iArr[0] = a2.width;
                    iArr[1] = a2.height;
                    iArr[2] = a2.rotation;
                    iArr[3] = a2.rotation;
                    iArr[4] = 0;
                    iArr[5] = 0;
                    iArr[6] = a2.bitrate;
                    iArr[7] = a2.fps;
                    iArr[8] = a2.codec;
                    iArr[9] = a2.keyFrameCount;
                    iArr[10] = a2.maxDuration;
                }
            } else {
                aj.a(str);
            }
            iGetInfoCallback.finish(iArr);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final int[] photoInfo(String str) {
        int[] iArr;
        l.d(str, "");
        if (!com.ss.android.ugc.tools.utils.i.a(str)) {
            iArr = new int[]{0, 0};
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.ss.android.ugc.tools.utils.h.a(str, options);
            iArr = new int[]{options.outWidth, options.outHeight};
        }
        l.b(iArr, "");
        return iArr;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(List<String> list, IAVInfoService.IGetInfoCallback<List<Integer>> iGetInfoCallback) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            arrayList.add(Integer.valueOf(VEUtils.checkAudioFile(str)));
        }
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoCover(com.ss.android.ugc.aweme.draft.model.c cVar, IAVInfoService.IGetInfoCallback<Bitmap> iGetInfoCallback) {
        l.d(cVar, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new g(cVar, iGetInfoCallback));
        a2.f90299a = new h(iGetInfoCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void mp3Legal(String str, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        l.d(str, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new e(iGetInfoCallback, str));
        a2.f90299a = new f(iGetInfoCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(String str, int i2, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        l.d(str, "");
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(Integer.valueOf(VEUtils.checkAudioFile(str)));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoInfo(String str, boolean z, IAVInfoService.IGetInfoCallback<int[]> iGetInfoCallback) {
        l.d(str, "");
        l.d(iGetInfoCallback, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        aVar.a(new k(iGetInfoCallback, str, z)).a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void mp3Legal(Context context, String str, IAVInfoService.IGetInfoCallback<Integer> iGetInfoCallback) {
        l.d(context, "");
        l.d(str, "");
        e.a aVar = new e.a();
        aVar.f90301c = false;
        e.a a2 = aVar.a(new c(str, iGetInfoCallback, context));
        a2.f90299a = new d(iGetInfoCallback);
        a2.a();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void videoFrame(String str, int[] iArr, IAVInfoService.VEFrameAvailableListener vEFrameAvailableListener) {
        l.d(str, "");
        l.d(iArr, "");
        l.d(vEFrameAvailableListener, "");
        j jVar = new j(vEFrameAvailableListener);
        e.a aVar = new e.a();
        aVar.f90301c = true;
        aVar.a(new i(str, iArr, jVar)).a();
    }

    static final class j implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IAVInfoService.VEFrameAvailableListener f90288a;

        static {
            Covode.recordClassIndex(56656);
        }

        j(IAVInfoService.VEFrameAvailableListener vEFrameAvailableListener) {
            this.f90288a = vEFrameAvailableListener;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            return this.f90288a.processFrame(byteBuffer, i2, i3, i4);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void audioLegal(Context context, List<? extends MusicModel> list, IAVInfoService.IFilterMedia<Integer> iFilterMedia, IAVInfoService.IGetInfoCallback<List<MusicModel>> iGetInfoCallback) {
        l.d(context, "");
        l.d(list, "");
        l.d(iFilterMedia, "");
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel : list) {
            if (com.ss.android.ugc.aweme.shortvideo.af.b.a(musicModel.getLocalPath(), context) && iFilterMedia.filter(Integer.valueOf(list.indexOf(musicModel)))) {
                arrayList.add(musicModel);
            }
        }
        if (iGetInfoCallback != null) {
            iGetInfoCallback.finish(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService
    public final void importLegal(Context context, String str, boolean z, int i2, int i3, h.f.a.m<? super String, ? super Long, z> mVar, r<? super String, ? super Long, ? super Integer, ? super String, z> rVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(mVar, "");
        l.d(rVar, "");
        e.a aVar = new e.a();
        aVar.f90301c = true;
        e.a a2 = aVar.a(new a(context, str, z, i2, i3, mVar, rVar));
        a2.f90299a = new C2170b(rVar);
        a2.a();
    }
}
