package com.ss.android.ugc.aweme.story.edit.model;

import android.graphics.Bitmap;
import android.net.Uri;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.f.g;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.vesdk.VEUtils;
import com.ss.android.vesdk.ad;
import dmt.av.video.VEPreviewParams;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class a {
    static {
        Covode.recordClassIndex(90015);
    }

    public static final class d implements ad {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f137582a;

        static {
            Covode.recordClassIndex(90020);
        }

        /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$d$a  reason: collision with other inner class name */
        static final class CallableC3615a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f137583a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f137584b;

            static {
                Covode.recordClassIndex(90021);
            }

            CallableC3615a(d dVar, Bitmap bitmap) {
                this.f137583a = dVar;
                this.f137584b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f137583a.f137582a.invoke(this.f137584b);
                return z.f158842a;
            }
        }

        d(h.f.a.b bVar) {
            this.f137582a = bVar;
        }

        @Override // com.ss.android.vesdk.ad
        public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
            MethodCollector.i(2458);
            if (byteBuffer == null) {
                this.f137582a.invoke(null);
                MethodCollector.o(2458);
                return false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
            i.b(new CallableC3615a(this, createBitmap), i.f4826c);
            MethodCollector.o(2458);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f137581a;

        static {
            Covode.recordClassIndex(90018);
        }

        c(h.f.a.b bVar) {
            this.f137581a = bVar;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            final Bitmap bitmap = (Bitmap) obj;
            g.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.story.edit.model.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(90019);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ z invoke() {
                    this.this$0.f137581a.invoke(bitmap);
                    return z.f158842a;
                }
            });
        }
    }

    public static final String a(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        return com.ss.android.ugc.aweme.story.base.b.b.a(storyEditClipModel.getSessionId(), null);
    }

    public static final boolean e(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        if (storyEditClipModel.getSourceContentType() == 2) {
            return true;
        }
        return false;
    }

    public static final int b(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        return com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport(), false, false);
    }

    public static final int c(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        return com.ss.android.ugc.aweme.shortvideo.edit.model.b.b(storyEditClipModel.getPreviewMediaInfo(), storyEditClipModel.isFastImport(), false, false);
    }

    public static final boolean d(StoryEditClipModel storyEditClipModel) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        l.d(storyEditClipModel, "");
        if (storyEditClipModel.getInfoStickerModel() == null || (infoStickerModel = storyEditClipModel.getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean f(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        if (storyEditClipModel.getVoiceVolume() == 0.0f) {
            return true;
        }
        return false;
    }

    public static final boolean h(StoryEditClipModel storyEditClipModel) {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        l.d(storyEditClipModel, "");
        if (storyEditClipModel.getInfoStickerModel() == null || (infoStickerModel = storyEditClipModel.getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean j(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        ArrayList<EffectPointModel> effectList = storyEditClipModel.getEffectList();
        if (effectList == null || effectList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.model.a$a  reason: collision with other inner class name */
    static final class C3614a extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ StoryEditModel $this_clearEdit;
        int label;

        static {
            Covode.recordClassIndex(90016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3614a(StoryEditModel storyEditModel, h.c.d dVar) {
            super(2, dVar);
            this.$this_clearEdit = storyEditModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C3614a(this.$this_clearEdit, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C3614a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                for (T t : this.$this_clearEdit.getClips()) {
                    l.d(t, "");
                    bz unused = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new b(t, null), 2);
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ StoryEditClipModel $this_clearEdit;
        int label;

        static {
            Covode.recordClassIndex(90017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryEditClipModel storyEditClipModel, h.c.d dVar) {
            super(2, dVar);
            this.$this_clearEdit = storyEditClipModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$this_clearEdit, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                a.i(this.$this_clearEdit);
                StoryEditClipModel storyEditClipModel = this.$this_clearEdit;
                l.d(storyEditClipModel, "");
                Iterator<T> it = storyEditClipModel.getCacheFileList().iterator();
                while (it.hasNext()) {
                    com.ss.android.ugc.tools.utils.i.b((String) it.next());
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final boolean b(StoryEditModel storyEditModel) {
        l.d(storyEditModel, "");
        List<StoryEditClipModel> clips = storyEditModel.getClips();
        if ((clips instanceof Collection) && clips.isEmpty()) {
            return false;
        }
        Iterator<T> it = clips.iterator();
        while (it.hasNext()) {
            if (j(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final void c(StoryEditModel storyEditModel) {
        l.d(storyEditModel, "");
        bz unused = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new C3614a(storyEditModel, null), 2);
    }

    public static final String g(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        return new StringBuilder().append(b(storyEditClipModel)).append('*').append(c(storyEditClipModel)).toString();
    }

    public static final void i(StoryEditClipModel storyEditClipModel) {
        l.d(storyEditClipModel, "");
        HashMap<String, String> stickerCacheDirMap = storyEditClipModel.getStickerCacheDirMap();
        if ((!stickerCacheDirMap.isEmpty()) && stickerCacheDirMap != null) {
            Collection<String> values = new HashMap(stickerCacheDirMap).values();
            l.b(values, "");
            for (String str : values) {
                com.ss.android.ugc.tools.utils.i.a(new File(str));
            }
        }
    }

    private static final String a(String str) {
        Uri uri;
        boolean z;
        String str2 = null;
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            uri = null;
        }
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            uri = Uri.fromFile(new File(str));
        }
        return String.valueOf(uri);
    }

    public static final boolean a(StoryEditModel storyEditModel) {
        l.d(storyEditModel, "");
        List<StoryEditClipModel> clips = storyEditModel.getClips();
        if ((clips instanceof Collection) && clips.isEmpty()) {
            return false;
        }
        Iterator<T> it = clips.iterator();
        while (it.hasNext()) {
            if (h(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final FilterBean a(StoryEditClipModel storyEditClipModel, o oVar) {
        FilterBean filterBean;
        l.d(storyEditClipModel, "");
        l.d(oVar, "");
        String mSelectedFilterId = storyEditClipModel.getMSelectedFilterId();
        if (mSelectedFilterId != null) {
            try {
                filterBean = com.ss.android.ugc.aweme.filter.repository.a.a.c.b(oVar.f(), Integer.parseInt(mSelectedFilterId));
            } catch (NumberFormatException unused) {
                filterBean = null;
            }
            if (filterBean != null) {
                return filterBean;
            }
        }
        return com.ss.android.ugc.aweme.filter.repository.a.a.c.a(oVar.f(), 0);
    }

    public static final VEPreviewParams a(StoryEditClipModel storyEditClipModel, bq bqVar, int i2) {
        List h2;
        int size = storyEditClipModel.getPreviewMediaInfo().getVideoList().size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr[i3] = "";
        }
        String[] strArr2 = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr2[i4] = "";
        }
        float[] fArr = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            fArr[i5] = 1.0f;
        }
        int[] iArr = new int[size];
        for (int i6 = 0; i6 < size; i6++) {
            iArr[i6] = 0;
        }
        int[] iArr2 = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr2[i7] = 0;
        }
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr3[i8] = -1;
        }
        int i9 = 0;
        for (T t : storyEditClipModel.getPreviewMediaInfo().getVideoList()) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                n.a();
            }
            T t2 = t;
            strArr[i9] = t2.getVideoPath();
            String audioPath = t2.getAudioPath();
            if (audioPath == null) {
                audioPath = "";
            }
            strArr2[i9] = audioPath;
            VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
            if (videoCutInfo != null) {
                fArr[i9] = videoCutInfo.getSpeed();
                iArr[i9] = videoCutInfo.getRotate();
                iArr2[i9] = (int) videoCutInfo.getStart();
                iArr3[i9] = (int) videoCutInfo.getEnd();
            }
            if (storyEditClipModel.getSourceContentType() == 2) {
                iArr3[i9] = 5000;
            }
            i9 = i10;
        }
        if (storyEditClipModel.isFastImport() || (h2 = h.a.i.h(strArr2)) == null || h2.isEmpty()) {
            strArr2 = null;
        }
        b bVar = new b(strArr, strArr2, fArr, iArr, iArr2, iArr3);
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        vEPreviewParams.mWorkspace = a(storyEditClipModel);
        vEPreviewParams.mVideoPaths = bVar.f137585a;
        vEPreviewParams.mAudioPaths = bVar.f137586b;
        vEPreviewParams.mSpeedArray = bVar.f137587c;
        vEPreviewParams.mRotateArray = bVar.f137588d;
        vEPreviewParams.mVTrimIn = bVar.f137589e;
        vEPreviewParams.mVTrimOut = bVar.f137590f;
        vEPreviewParams.mVolume = storyEditClipModel.getVoiceVolume();
        vEPreviewParams.mMusicVolume = vEPreviewParams.getMusicVolume();
        vEPreviewParams.mPageType = 1;
        vEPreviewParams.mFps = i2;
        vEPreviewParams.mCanvasWidth = bqVar.a();
        vEPreviewParams.mCanvasHeight = bqVar.b();
        vEPreviewParams.isFastImport = storyEditClipModel.isFastImport();
        vEPreviewParams.recordData = storyEditClipModel.getMultiEditVideoRecordData();
        vEPreviewParams.isStoryEditMode = true;
        vEPreviewParams.canvasVideoPreviewData = storyEditClipModel.getCanvasVideoData();
        return vEPreviewParams;
    }

    public static final void a(EditPreviewInfo editPreviewInfo, boolean z, StoryCoverExtractConfig storyCoverExtractConfig, h.f.a.b<? super Bitmap, z> bVar) {
        l.d(editPreviewInfo, "");
        l.d(storyCoverExtractConfig, "");
        l.d(bVar, "");
        if (z) {
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(n.a(a(editPreviewInfo.getVideoList().get(0).getVideoPath())));
            com.ss.android.ugc.tools.c.a.a(urlModel, storyCoverExtractConfig.getWidth(), storyCoverExtractConfig.getHeight(), new c(bVar));
            return;
        }
        VEUtils.getVideoFrames(editPreviewInfo.getVideoList().get(0).getVideoPath(), new int[]{storyCoverExtractConfig.getTimestamp()}, -1, storyCoverExtractConfig.getHeight(), false, new d(bVar));
    }
}
