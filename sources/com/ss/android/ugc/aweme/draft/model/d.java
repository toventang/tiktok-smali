package com.ss.android.ugc.aweme.draft.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.draft.k;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.h;
import com.ss.android.ugc.aweme.shortvideo.sticker.e;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

public final class d {
    static {
        Covode.recordClassIndex(51871);
    }

    public static final class c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f83197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IEffectService.OnVideoCoverCallback f83198b;

        static {
            Covode.recordClassIndex(51874);
        }

        static final class a<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f83199a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f83200b;

            static {
                Covode.recordClassIndex(51875);
            }

            a(c cVar, int i2) {
                this.f83199a = cVar;
                this.f83200b = i2;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f83199a.f83198b.onGetVideoCoverFailed(this.f83200b);
                return z.f158842a;
            }
        }

        static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f83201a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f83202b;

            static {
                Covode.recordClassIndex(51876);
            }

            b(c cVar, Bitmap bitmap) {
                this.f83201a = cVar;
                this.f83202b = bitmap;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f83201a.f83198b.onGetVideoCoverSuccess(this.f83202b);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            i.b(new a(this, i2), i.f4826c);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            l.d(bitmap, "");
            i.b(new b(this, com.ss.android.ugc.aweme.editSticker.model.a.a(this.f83197a.W.aR, bitmap)), i.f4826c);
        }

        c(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
            this.f83197a = cVar;
            this.f83198b = onVideoCoverCallback;
        }
    }

    public static final class b implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f83195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IEffectService.OnVideoCoverCallback f83196b;

        static {
            Covode.recordClassIndex(51873);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            d.b(this.f83195a, this.f83196b);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            l.d(bitmap, "");
            this.f83196b.onGetVideoCoverSuccess(bitmap);
        }

        b(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
            this.f83195a = cVar;
            this.f83196b = onVideoCoverCallback;
        }
    }

    public static final EditPreviewInfo h(c cVar) {
        l.d(cVar, "");
        return a(cVar, true);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f83194a = new a();

        static {
            Covode.recordClassIndex(51872);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return Boolean.valueOf(!p.a((CharSequence) str2));
        }
    }

    public static final String a(c cVar) {
        l.d(cVar, "");
        String str = cVar.W.bD;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("session id is needed for story draft");
    }

    public static final String b(c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar.f83185f;
        if (cVar2 == null) {
            return "";
        }
        if (cVar2.isLocalMusic()) {
            return String.valueOf(cVar2.getLocalMusicId());
        }
        String musicId = cVar2.getMusicId();
        l.b(musicId, "");
        return musicId;
    }

    public static final String c(c cVar) {
        String str;
        l.d(cVar, "");
        try {
            if (cVar.E == null) {
                str = "";
            } else {
                str = g.a().G().b(cVar.E);
            }
            l.b(str, "");
            return str;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static final void j(c cVar) {
        InfoStickerModel j2 = cVar.j();
        if (!(j2 == null || com.bytedance.common.utility.collection.b.a((Collection) j2.stickers))) {
            for (StickerItemModel stickerItemModel : j2.stickers) {
                if (stickerItemModel.isPin) {
                    com.ss.android.ugc.tools.utils.i.b(stickerItemModel.pinAlgorithmFile);
                }
            }
        }
    }

    private static final g l(c cVar) {
        g gVar = cVar.W.am;
        if (!(gVar == null || cVar.W.an == null)) {
            List<DraftVideoSegment> list = cVar.W.an;
            if (list == null) {
                l.b();
            }
            if (!list.isEmpty() && !com.ss.android.ugc.tools.utils.i.a(gVar.f83208c.get(0).f83157h)) {
                List<DraftVideoSegment> list2 = cVar.W.an;
                if (list2 == null) {
                    list2 = h.a.z.INSTANCE;
                }
                gVar.a(list2);
                k.a("draftOpt==>getDraftPreviewConfigure,using copy video videoSegment");
            }
        }
        return gVar;
    }

    public static final String d(c cVar) {
        l.d(cVar, "");
        if (cVar.f83182c != null) {
            PhotoMovieContext photoMovieContext = cVar.f83182c;
            if (photoMovieContext == null) {
                l.b();
            }
            String str = photoMovieContext.mFinalVideoTmpPath;
            l.b(str, "");
            return str;
        }
        EditPreviewInfo h2 = h(cVar);
        if (h2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = h2.getVideoList().iterator();
        while (it.hasNext()) {
            sb.append(it.next().getVideoPath()).append(",");
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        if (sb2 == null) {
            return "";
        }
        return sb2;
    }

    public static final String e(c cVar) {
        String str;
        l.d(cVar, "");
        if (cVar.f83182c != null) {
            PhotoMovieContext photoMovieContext = cVar.f83182c;
            if (photoMovieContext == null) {
                l.b();
            }
            str = photoMovieContext.mFinalVideoTmpPath;
        } else {
            List<EditVideoSegment> i2 = i(cVar);
            if (i2 == null || i2.isEmpty()) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder();
                Iterator<T> it = i2.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getVideoPath()).append(",");
                }
                str = sb.toString();
            }
        }
        l.b(str, "");
        return str;
    }

    /* JADX DEBUG: Type inference failed for r0v18. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment>, java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment> */
    public static final List<EditVideoSegment> i(c cVar) {
        l.d(cVar, "");
        if (cVar.W.ap != null) {
            return cVar.W.ap;
        }
        if (cVar.W.an == null) {
            return null;
        }
        List<DraftVideoSegment> list = cVar.W.an;
        if (list == null) {
            l.b();
        }
        if (!(!list.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<DraftVideoSegment> list2 = cVar.W.an;
        if (list2 != null) {
            for (DraftVideoSegment draftVideoSegment : list2) {
                arrayList.add(com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(draftVideoSegment));
            }
        }
        cVar.f(arrayList);
        return arrayList;
    }

    public static final void g(c cVar) {
        String str;
        String str2 = "";
        l.d(cVar, str2);
        if (cVar.f83182c != null) {
            PhotoMovieContext photoMovieContext = cVar.f83182c;
            if (photoMovieContext != null) {
                str = photoMovieContext.mFinalVideoTmpPath;
            } else {
                str = null;
            }
            com.ss.android.ugc.tools.utils.i.b(str);
        } else {
            com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(g.a().c().b(cVar));
            List<EditVideoSegment> i2 = i(cVar);
            if (i2 != null && (!i2.isEmpty())) {
                for (EditVideoSegment editVideoSegment : i2) {
                    com.ss.android.ugc.tools.utils.i.b(editVideoSegment.getVideoPath());
                    com.ss.android.ugc.tools.utils.i.b(editVideoSegment.getAudioPath());
                    k.a("[removeRelatedFiles]: segment.videoPath = " + editVideoSegment.getVideoPath());
                }
            }
        }
        if (cVar.W.aj != null && !TextUtils.isEmpty(cVar.W.aj.getAudioUrl())) {
            com.ss.android.ugc.tools.utils.i.b(cVar.W.aj.getAudioUrl());
            AudioRecorderParam audioRecorderParam = cVar.W.aj;
            l.b(audioRecorderParam, str2);
            l.d(audioRecorderParam, str2);
            if (p.c(audioRecorderParam.getAudioUrl(), "df", false)) {
                String audioUrl = audioRecorderParam.getAudioUrl();
                Objects.requireNonNull(audioUrl, "null cannot be cast to non-null type java.lang.String");
                String substring = audioUrl.substring(0, audioRecorderParam.getAudioUrl().length() - 2);
                l.b(substring, str2);
                str2 = substring;
            }
            com.ss.android.ugc.tools.utils.i.b(str2);
        }
        j(cVar);
        com.ss.android.ugc.tools.utils.i.c(cVar.W.aA);
        com.ss.android.ugc.tools.utils.i.b(cVar.W.aA);
        if (cVar.e()) {
            com.ss.android.ugc.tools.utils.i.c(dj.f126463f + "duet/" + cVar.f());
        }
    }

    private static HashSet<String> k(c cVar) {
        boolean z;
        l.d(cVar, "");
        HashSet<String> hashSet = new HashSet<>();
        EditPreviewInfo a2 = a(cVar, false);
        if (a2 != null) {
            String draftDir = a2.getDraftDir();
            if (draftDir.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && draftDir != null) {
                hashSet.add(draftDir);
            }
            for (T t : a2.getVideoList()) {
                String videoPath = t.getVideoPath();
                if (com.ss.android.ugc.tools.utils.i.a(videoPath) && videoPath != null) {
                    hashSet.add(videoPath);
                    String b2 = com.bytedance.common.utility.d.b(videoPath);
                    if ((b2 == null || b2.length() == 0) && b2 != null) {
                        hashSet.add(b2);
                    }
                }
                String audioPath = t.getAudioPath();
                if (!(audioPath == null || audioPath.length() == 0 || audioPath == null)) {
                    hashSet.add(audioPath);
                }
            }
            String[] reverseVideoArray = a2.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str : reverseVideoArray) {
                    if (str.length() > 0 && str != null) {
                        hashSet.add(str);
                    }
                }
            }
            String[] reverseAudioArray = a2.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str2 : reverseAudioArray) {
                    if (str2.length() > 0 && str2 != null) {
                        hashSet.add(str2);
                    }
                }
            }
            String[] tempVideoArray = a2.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str3 : tempVideoArray) {
                    if (str3.length() > 0 && str3 != null) {
                        hashSet.add(str3);
                    }
                }
            }
        }
        return hashSet;
    }

    public static final Set<String> f(c cVar) {
        EffectTextModel effectTextModel;
        StickerItemModel textSticker;
        String str;
        List<StickerItemModel> list;
        CoverPublishModel coverPublishModel;
        EffectTextModel effectTextModel2;
        StickerItemModel textSticker2;
        String str2;
        PhotoMovieContext photoMovieContext;
        String str3;
        String str4;
        ArrayList<MvNetFileBean> arrayList;
        String str5;
        String str6;
        ArrayList<String> arrayList2;
        List<Object> g2;
        ArrayList<EffectPointModel> effectPointModels;
        List<EffectPointModel> g3;
        String str7;
        l.d(cVar, "");
        j jVar = new j(a.f83194a);
        String calculateDraftDir = AVServiceImpl.a().draftService().calculateDraftDir(cVar);
        if (calculateDraftDir != null) {
            l.b(calculateDraftDir, "");
            Boolean.valueOf(jVar.add(calculateDraftDir));
        }
        String str8 = cVar.W.S;
        if (str8 != null) {
            Boolean.valueOf(jVar.add(str8));
        }
        if (cVar.f83192m != 0) {
            IInternalAVService a2 = AVServiceImpl.a();
            l.b(a2, "");
            FilterBean filter = a2.getFilterService().getFilter(cVar.f83192m);
            l.b(filter, "");
            String filterFolder = filter.getFilterFolder();
            if (filterFolder != null) {
                Boolean.valueOf(jVar.add(filterFolder));
            }
        }
        String str9 = cVar.W.ac;
        if (str9 != null) {
            l.b(str9, "");
            Boolean.valueOf(jVar.add(str9));
        }
        i q = cVar.q();
        if (!(q == null || (str7 = q.f83217d) == null)) {
            Boolean.valueOf(jVar.add(str7));
        }
        String str10 = cVar.f83187h;
        if (str10 != null && str10.length() > 0) {
            Boolean.valueOf(jVar.add(str10));
        }
        EffectListModel effectListModel = cVar.E;
        if (!(effectListModel == null || (effectPointModels = effectListModel.getEffectPointModels()) == null || (g3 = n.g((Iterable) effectPointModels)) == null)) {
            for (EffectPointModel effectPointModel : g3) {
                String resDir = effectPointModel.getResDir();
                if (resDir != null) {
                    jVar.add(resDir);
                }
            }
        }
        String str11 = cVar.W.T;
        if (str11 != null) {
            Boolean.valueOf(jVar.add(str11));
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar = cVar.W.M;
        if (!(dVar == null || (arrayList2 = dVar.selectMediaList) == null || (g2 = n.g((Iterable) arrayList2)) == null)) {
            for (Object obj : g2) {
                jVar.add(obj);
            }
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar2 = cVar.W.M;
        if (!(dVar2 == null || (str6 = dVar2.videoCoverImgPath) == null)) {
            Boolean.valueOf(jVar.add(str6));
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar3 = cVar.W.M;
        if (!(dVar3 == null || (str5 = dVar3.mvResUnzipPath) == null || str5.length() == 0)) {
            String absolutePath = new File(dVar3.mvResUnzipPath).getAbsolutePath();
            l.b(absolutePath, "");
            Boolean.valueOf(jVar.add(absolutePath));
        }
        com.ss.android.ugc.aweme.mvtheme.d dVar4 = cVar.W.M;
        if (!(dVar4 == null || (arrayList = dVar4.newMaskFileData) == null)) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                jVar.add(it.next().getFilePath());
            }
        }
        PhotoMovieContext photoMovieContext2 = cVar.f83182c;
        if (!(photoMovieContext2 == null || (str4 = photoMovieContext2.mFinalVideoTmpPath) == null || str4.length() == 0)) {
            String str12 = photoMovieContext2.mFinalVideoTmpPath;
            l.b(str12, "");
            Boolean.valueOf(jVar.add(str12));
        }
        PhotoMovieContext photoMovieContext3 = cVar.f83182c;
        if (!(photoMovieContext3 == null || (str3 = photoMovieContext3.mMusicPath) == null)) {
            Boolean.valueOf(jVar.add(str3));
        }
        PhotoMovieContext photoMovieContext4 = cVar.f83182c;
        if (!(photoMovieContext4 == null || photoMovieContext4.mFilterPath == null || (photoMovieContext = cVar.f83182c) == null)) {
            jVar.add(g.a().r().c().d(photoMovieContext.mFilterId));
        }
        PhotoMovieContext photoMovieContext5 = cVar.f83182c;
        if (!(photoMovieContext5 == null || (coverPublishModel = photoMovieContext5.getCoverPublishModel()) == null || (effectTextModel2 = coverPublishModel.getEffectTextModel()) == null || (textSticker2 = effectTextModel2.getTextSticker()) == null || (str2 = textSticker2.path) == null || str2.length() <= 0)) {
            Boolean.valueOf(jVar.add(str2));
        }
        jVar.addAll(k(cVar));
        InfoStickerModel j2 = cVar.j();
        if (!(j2 == null || (list = j2.stickers) == null)) {
            for (T t : list) {
                if (t != null) {
                    String str13 = t.path;
                    if (str13 != null && str13.length() > 0) {
                        Boolean.valueOf(jVar.add(str13));
                    }
                    if (t.isTextSticker()) {
                        SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) g.a().G().a(t.extra, SimpleTextStickerData.class);
                        if (simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getAudioTrackFilePath())) {
                            String audioTrackFilePath = simpleTextStickerData.getAudioTrackFilePath();
                            if (audioTrackFilePath == null) {
                                l.b();
                            }
                            jVar.add(audioTrackFilePath);
                        }
                    }
                }
            }
        }
        CoverPublishModel coverPublishModel2 = cVar.W.aR;
        if (!(coverPublishModel2 == null || (effectTextModel = coverPublishModel2.getEffectTextModel()) == null || (textSticker = effectTextModel.getTextSticker()) == null || (str = textSticker.path) == null || str.length() <= 0)) {
            Boolean.valueOf(jVar.add(str));
        }
        e.a(jVar, cVar);
        return jVar;
    }

    public static final void a(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        l.d(cVar, "");
        l.d(onVideoCoverCallback, "");
        a(cVar, null, onVideoCoverCallback);
    }

    private static final Bitmap a(k kVar, String str) {
        MethodCollector.i(11859);
        if (l.a(kVar)) {
            Bitmap a2 = com.ss.android.ugc.aweme.tools.d.a(str, kVar.f83222a, kVar.f83223b);
            MethodCollector.o(11859);
            return a2;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        MethodCollector.o(11859);
        return decodeFile;
    }

    public static final void a(c cVar, int i2) {
        l.d(cVar, "");
        cVar.f83192m = i2;
        IInternalAVService a2 = AVServiceImpl.a();
        l.b(a2, "");
        FilterBean filter = a2.getFilterService().getFilter(i2);
        l.b(filter, "");
        cVar.t(filter.getFilterFolder());
    }

    private static final void c(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        MethodCollector.i(12014);
        String o = cVar.o();
        if (o == null || !com.ss.android.ugc.tools.utils.i.a(o)) {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
            MethodCollector.o(12014);
            return;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(cVar.o());
        if (decodeFile == null || !(!decodeFile.isRecycled())) {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
            MethodCollector.o(12014);
            return;
        }
        onVideoCoverCallback.onGetVideoCoverSuccess(com.ss.android.ugc.aweme.editSticker.model.a.a(cVar.W.aR, decodeFile));
        MethodCollector.o(12014);
    }

    public static final void a(c cVar, AudioRecorderParam audioRecorderParam) {
        l.d(cVar, "");
        l.d(audioRecorderParam, "");
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(audioRecorderParam);
        audioRecorderParam2.setAudioUrl(com.ss.android.ugc.tools.utils.a.a(audioRecorderParam2));
        audioRecorderParam2.setExtraUrl("");
        cVar.W.aj = audioRecorderParam2;
    }

    public static final void b(c cVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        float s;
        ArrayList arrayList = new ArrayList();
        EffectListModel effectListModel = cVar.E;
        if (effectListModel != null) {
            ArrayList<EffectPointModel> effectPointModels = effectListModel.getEffectPointModels();
            l.b(effectPointModels, "");
            arrayList.addAll(effectPointModels);
        }
        boolean equals = TextUtils.equals(String.valueOf(cVar.o), "1");
        IEffectService effectService = AVServiceImpl.a().effectService();
        IInternalAVService a2 = AVServiceImpl.a();
        l.b(a2, "");
        FilterBean filter = a2.getFilterService().getFilter(cVar.f83192m);
        l.b(filter, "");
        String filterFolder = filter.getFilterFolder();
        if (filterFolder == null) {
            l.b();
        }
        if (cVar.s() == -1.0f) {
            s = 0.8f;
        } else {
            s = cVar.s();
        }
        effectService.getVideoCoverByCallback(arrayList, filterFolder, s, (int) (cVar.S * 1000.0f), equals, h(cVar), new c(cVar, onVideoCoverCallback));
    }

    public static final EditPreviewInfo a(c cVar, boolean z) {
        VideoFileInfo videoFileInfo;
        l.d(cVar, "");
        k.a("[getPreviewInfo]: creation id = " + cVar.f() + " is fast import = " + cVar.W.Q);
        if (cVar.W.ao != null) {
            EditPreviewInfo editPreviewInfo = cVar.W.ao;
            if (editPreviewInfo != null) {
                if (editPreviewInfo.getPreviewWidth() <= 0 && cVar.W.V > 0) {
                    editPreviewInfo.setPreviewWidth(cVar.W.V);
                }
                if (editPreviewInfo.getPreviewHeight() <= 0 && cVar.W.W > 0) {
                    editPreviewInfo.setPreviewHeight(cVar.W.W);
                }
                if (cVar.p == 1 && !cVar.W.bC) {
                    cVar.W.bC = true;
                    List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
                    int i2 = 0;
                    for (T t : videoList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            n.a();
                        }
                        T t2 = t;
                        long duration = t2.getVideoFileInfo().getDuration();
                        long j2 = duration / 1000;
                        videoList.set(i2, EditVideoSegment.copy$default(t2, null, null, VideoFileInfo.copy$default(t2.getVideoFileInfo(), 0, 0, j2, 0, 0, 0, 0, 0, 251, null), null, 11, null));
                        k.a("[getPreviewInfo]:fix video length in draft,old:" + duration + ",new:" + j2);
                        i2 = i3;
                    }
                }
            }
            List<EditVideoSegment> i4 = i(cVar);
            k.a("[getPreviewInfo]: previewVideoListCopy = ".concat(String.valueOf(i4)));
            if (i4 != null && !i4.isEmpty()) {
                int size = i4.size();
                if (editPreviewInfo == null) {
                    l.b();
                }
                if (size < editPreviewInfo.getVideoList().size()) {
                    k.a("[getPreviewInfo]: copySize < previewInfo!!.videoList.size");
                    return editPreviewInfo;
                }
                int size2 = editPreviewInfo.getVideoList().size();
                for (int i5 = 0; i5 < size2; i5++) {
                    EditVideoSegment editVideoSegment = editPreviewInfo.getVideoList().get(i5);
                    boolean a2 = com.ss.android.ugc.tools.utils.i.a(editVideoSegment.getVideoPath());
                    k.a("[getPreviewInfo]: videoPath = " + editVideoSegment.getVideoPath() + " is exist = " + a2);
                    if (!a2) {
                        editPreviewInfo.getVideoList().set(i5, i4.get(i5));
                    }
                }
            }
            cVar.a(editPreviewInfo);
            return editPreviewInfo;
        }
        g l2 = l(cVar);
        EditPreviewInfo editPreviewInfo2 = null;
        if (l2 != null) {
            editPreviewInfo2 = com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(l2);
        } else if (cVar.f83186g != null) {
            String str = cVar.f83186g;
            l.b(str, "");
            String str2 = cVar.f83188i;
            if (z) {
                videoFileInfo = com.ss.android.ugc.aweme.shortvideo.edit.model.b.a(cVar.f83186g);
            } else {
                videoFileInfo = new VideoFileInfo(0, 0, 0, 0, 0, 0, 0, 0, 240, null);
            }
            editPreviewInfo2 = new h(0, 0, null, 31).a(new EditVideoSegment(str, str2, videoFileInfo));
            if (!TextUtils.isEmpty(cVar.q)) {
                String str3 = cVar.q;
                l.b(str3, "");
                editPreviewInfo2.setReverseVideoArray(new String[]{str3});
            }
        }
        cVar.a(editPreviewInfo2);
        return editPreviewInfo2;
    }

    private static final void b(c cVar, k kVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        if (!com.ss.android.ugc.tools.utils.i.a(cVar.p())) {
            q.b("multi edit video cover img path not exist:" + cVar.p());
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
            return;
        }
        String p = cVar.p();
        if (p != null && com.ss.android.ugc.tools.utils.i.a(p)) {
            String p2 = cVar.p();
            l.b(p2, "");
            Bitmap a2 = a(kVar, p2);
            if (a2 == null || !(!a2.isRecycled())) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            } else {
                onVideoCoverCallback.onGetVideoCoverSuccess(com.ss.android.ugc.aweme.editSticker.model.a.a(cVar.W.aR, a2));
            }
        }
    }

    public static final void a(c cVar, k kVar, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        l.d(cVar, "");
        l.d(onVideoCoverCallback, "");
        b bVar = new b(cVar, onVideoCoverCallback);
        String str = cVar.W.T;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && new File(cVar.W.T).exists()) {
            String str2 = cVar.W.T;
            l.b(str2, "");
            Bitmap a2 = a(kVar, str2);
            if (a2 == null || !(!a2.isRecycled())) {
                bVar.onGetVideoCoverFailed(-1);
            } else {
                bVar.onGetVideoCoverSuccess(a2);
            }
        } else if (cVar.R == 2) {
            bVar.onGetVideoCoverFailed(-1);
        } else if (cVar.k()) {
            c(cVar, bVar);
        } else if (cVar.n()) {
            b(cVar, kVar, bVar);
        } else {
            b(cVar, onVideoCoverCallback);
        }
    }
}
