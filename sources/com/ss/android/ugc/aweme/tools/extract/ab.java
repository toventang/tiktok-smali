package com.ss.android.ugc.aweme.tools.extract;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.extract.a.b;
import com.ss.android.ugc.aweme.tools.extract.a.f;
import com.ss.android.ugc.aweme.tools.extract.a.h;
import com.ss.android.ugc.aweme.tools.extract.a.i;
import com.ss.android.ugc.aweme.tools.extract.a.j;
import com.ss.android.ugc.aweme.tools.extract.b.a;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class ab {

    /* renamed from: a */
    public static j f140003a;

    /* renamed from: b */
    public static final ab f140004b = new ab();

    public interface a {
        static {
            Covode.recordClassIndex(91501);
        }

        void a(String str);
    }

    private ab() {
    }

    public static final void a(Object obj, int i2, int i3, String str) {
        if (str == null) {
            str = "";
        }
        String str2 = str + ", " + a();
        l.b(str2, "");
        ar a2 = new ar().a("frame_type", Integer.valueOf(i2)).a("extra_msg", str2).a("status_code", Integer.valueOf(i3));
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            a2.a("content_type", es.c(videoPublishEditModel)).a("aweme_type", Integer.valueOf(es.g(videoPublishEditModel))).a("enter_from", videoPublishEditModel.enterFrom);
        }
        if (i3 == 0) {
            q.a("av_extra_video_frame", 0, a2.a());
            r.a("av_extra_video_frame", a2.a());
            return;
        }
        q.a("av_extra_video_frame", i3, a2.a());
        r.a("av_extra_video_frame", a2.a());
        com.ss.android.ugc.tools.utils.q.a("saveVideoFrames", str2);
    }

    public static void a(Object obj, a aVar, boolean z, int i2, String str, boolean z2) {
        StringBuilder sb = new StringBuilder();
        j jVar = f140003a;
        if (jVar != null) {
            sb.append("video_type:").append(jVar.getVideoType()).append(",");
            sb.append("video_origin:").append(jVar.getVideoOrigin()).append(",");
            sb.append(str);
            if (z2) {
                a(obj, jVar.getVideoType(), i2, sb.toString());
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
                a((VideoPublishEditModel) obj, i2, sb.toString());
            }
        }
        if (z && aVar != null) {
            aVar.a(sb.toString());
        }
    }

    static {
        Covode.recordClassIndex(91500);
    }

    public static final class b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ p f140005a;

        /* renamed from: b */
        final /* synthetic */ Object f140006b;

        /* renamed from: c */
        final /* synthetic */ a f140007c;

        /* renamed from: d */
        final /* synthetic */ boolean f140008d = false;

        static {
            Covode.recordClassIndex(91502);
        }

        public b(p pVar, Object obj, a aVar, boolean z) {
            this.f140005a = pVar;
            this.f140006b = obj;
            this.f140007c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int intValue = ((Number) this.f140005a.getFirst()).intValue();
            if (intValue != -1) {
                ab.a(this.f140006b, this.f140007c, this.f140008d, intValue, (String) this.f140005a.getSecond(), false);
            }
            return z.f158842a;
        }
    }

    private static String a() {
        List<z> uploadFrameInfoList;
        StringBuilder sb = new StringBuilder("{");
        j jVar = f140003a;
        if (!(jVar == null || (uploadFrameInfoList = jVar.getUploadFrameInfoList()) == null || !(!uploadFrameInfoList.isEmpty()))) {
            for (T t : uploadFrameInfoList) {
                sb.append("d:" + t.f140189c);
                sb.append(", s:" + t.f140190d);
                sb.append(";");
            }
        }
        sb.append("}");
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final class d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Object f140012a;

        /* renamed from: b */
        final /* synthetic */ ai f140013b;

        static {
            Covode.recordClassIndex(91504);
        }

        public d(Object obj, ai aiVar) {
            this.f140012a = obj;
            this.f140013b = aiVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<FrameItem> list;
            int i2;
            boolean z;
            int i3;
            String str;
            Object obj = this.f140012a;
            ai aiVar = this.f140013b;
            l.d(obj, "");
            l.d(aiVar, "");
            if (obj instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                String str2 = null;
                if (!i.a(extractFramesModel != null ? extractFramesModel.getExtractFramesDir() : null)) {
                    StringBuilder sb = new StringBuilder("extract frame dir:");
                    if (extractFramesModel != null) {
                        str2 = extractFramesModel.getExtractFramesDir();
                    }
                    return v.a(8, sb.append(str2).toString());
                }
                if (extractFramesModel == null || (list = extractFramesModel.getAllFrames()) == null) {
                    list = h.a.z.INSTANCE;
                }
                int size = list.size();
                if (size == 0) {
                    return v.a(9, "frame count == 0");
                }
                for (T t : list) {
                    if (!com.ss.android.ugc.aweme.video.e.b(t.getPath())) {
                        return v.a(18, "frame file not exist path:" + t.getPath());
                    }
                }
                int b2 = com.ss.android.ugc.aweme.tools.extract.a.i.b(videoPublishEditModel);
                l.d(videoPublishEditModel, "");
                l.d(aiVar, "");
                boolean z2 = false;
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                com.ss.android.ugc.aweme.shortvideo.a a2 = createIAVServiceProxybyMonsterPlugin.getAVConverter().a(aiVar);
                ar a3 = new ar().a("aweme_id", a2 != null ? a2.aid : null).a("match_factors", Integer.valueOf(y.a(videoPublishEditModel).f140023a));
                String cameraIds = videoPublishEditModel.getCameraIds();
                if (cameraIds == null || cameraIds.length() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                ar a4 = a3.a("origin", Integer.valueOf(i2 ^ 1)).a("is_draft", Boolean.valueOf(videoPublishEditModel.mIsFromDraft));
                if (videoPublishEditModel.mRestoreType == 2) {
                    z = true;
                } else {
                    z = false;
                }
                ar a5 = a4.a("is_backup", Boolean.valueOf(z)).a("video_type", Integer.valueOf(es.g(videoPublishEditModel)));
                if (b2 > size) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i4 = b2 - size;
                ar a6 = a5.a("status", Integer.valueOf(i3)).a("missing_count", Integer.valueOf(i4));
                float f2 = ((float) i4) / ((float) b2);
                q.a("av_video_audit_missing", 1, a6.a("missing_rate", Float.valueOf(f2)).a());
                if (i4 >= 3) {
                    com.ss.android.ugc.aweme.tools.extract.b.a aVar = new com.ss.android.ugc.aweme.tools.extract.b.a();
                    com.ss.android.ugc.aweme.tools.extract.b.b bVar = aVar.f140030c;
                    if (a2 != null) {
                        str2 = a2.aid;
                    }
                    bVar.f140041a = str2;
                    aVar.f140031d.f140041a = String.valueOf(y.a(videoPublishEditModel).f140023a);
                    aVar.f140032e.f140041a = String.valueOf(videoPublishEditModel.mIsFromDraft);
                    com.ss.android.ugc.aweme.tools.extract.b.b bVar2 = aVar.f140033f;
                    String cameraIds2 = videoPublishEditModel.getCameraIds();
                    if (cameraIds2 == null || cameraIds2.length() == 0) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    bVar2.f140041a = str;
                    com.ss.android.ugc.aweme.tools.extract.b.b bVar3 = aVar.f140034g;
                    if (videoPublishEditModel.mRestoreType == 2) {
                        z2 = true;
                    }
                    bVar3.f140041a = String.valueOf(z2);
                    aVar.f140039l.f140041a = String.valueOf(i4);
                    aVar.f140040m.f140041a = String.valueOf(f2);
                    aVar.f140038k.f140041a = "missing count: " + i4 + " missing rate: " + f2;
                    String a7 = com.bytedance.crash.util.ab.a(new Throwable("VideoAuditMissing"));
                    l.b(a7, "");
                    com.ss.android.ugc.aweme.tools.extract.b.c.a(aVar, a7, "VideoAuditMiss", "creative_tools_audit_error");
                }
                i.a a8 = com.ss.android.ugc.aweme.tools.extract.a.i.a(videoPublishEditModel, size);
                if (a8.f139999a != -2) {
                    return new p(Integer.valueOf(a8.f139999a), a8.f140001c);
                }
                int i5 = a8.f140000b;
                ArrayList<com.ss.android.ugc.aweme.tools.extract.a.e> arrayList = new ArrayList();
                arrayList.add(new h());
                if (videoPublishEditModel.canvasVideoData != null) {
                    arrayList.add(com.ss.android.ugc.aweme.tools.extract.a.a.f139987a);
                }
                if (videoPublishEditModel.isMvThemeVideoType()) {
                    arrayList.add(new f());
                }
                arrayList.add(new com.ss.android.ugc.aweme.tools.extract.a.d());
                for (com.ss.android.ugc.aweme.tools.extract.a.e eVar : arrayList) {
                    p<Integer, String> a9 = eVar.a(videoPublishEditModel, i5);
                    if (a9.getFirst().intValue() != -2) {
                        return a9;
                    }
                }
                return v.a(-1, "");
            }
            throw new IllegalArgumentException("");
        }
    }

    public static final class c implements b.AbstractC3694b {

        /* renamed from: a */
        final /* synthetic */ Object f140009a;

        /* renamed from: b */
        final /* synthetic */ a f140010b;

        /* renamed from: c */
        final /* synthetic */ boolean f140011c = false;

        static {
            Covode.recordClassIndex(91503);
        }

        @Override // com.ss.android.ugc.aweme.tools.extract.a.b.AbstractC3694b
        public final void a(boolean z) {
            if (!z) {
                ab.a(this.f140009a, this.f140010b, this.f140011c, 10, "", true);
            }
        }

        public c(Object obj, a aVar, boolean z) {
            this.f140009a = obj;
            this.f140010b = aVar;
        }
    }

    public static final void c(j jVar) {
        l.d(jVar, "");
        com.ss.android.ugc.aweme.tools.extract.b.a a2 = a.C3695a.a(jVar);
        String a3 = com.bytedance.crash.util.ab.a(new Throwable("AuditOutdated"));
        l.b(a3, "");
        com.ss.android.ugc.aweme.tools.extract.b.c.a(a2, a3, "AuditOutdated", "creative_tools_audit_outdated_error");
    }

    public static final class e<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a */
        final /* synthetic */ Object f140014a;

        /* renamed from: b */
        final /* synthetic */ a f140015b;

        /* renamed from: c */
        final /* synthetic */ boolean f140016c = false;

        /* renamed from: d */
        final /* synthetic */ h.f.a.a f140017d;

        static {
            Covode.recordClassIndex(91505);
        }

        public e(Object obj, a aVar, boolean z, h.f.a.a aVar2) {
            this.f140014a = obj;
            this.f140015b = aVar;
            this.f140017d = aVar2;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            p pVar;
            Integer num;
            int intValue;
            String str;
            p pVar2;
            if (!(iVar == null || (pVar = (p) iVar.d()) == null || (num = (Integer) pVar.getFirst()) == null || (intValue = num.intValue()) == -1)) {
                Object obj = this.f140014a;
                a aVar = this.f140015b;
                boolean z = this.f140016c;
                if (iVar == null || (pVar2 = (p) iVar.d()) == null || (str = (String) pVar2.getSecond()) == null) {
                    str = "";
                }
                ab.a(obj, aVar, z, intValue, str, true);
            }
            this.f140017d.invoke();
            return z.f158842a;
        }
    }

    public static final void b(j jVar) {
        int i2;
        Integer num;
        l.d(jVar, "");
        jVar.a();
        if (jVar.f140095f == null || ((num = jVar.f140095f) != null && num.intValue() == 0)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        q.a("av_audio_audit", i2, jVar.a());
        if (jVar.f140096g == 0) {
            com.ss.android.ugc.aweme.tools.extract.b.a a2 = a.C3695a.a(jVar);
            String a3 = com.bytedance.crash.util.ab.a(new Throwable("AudioAuditError"));
            l.b(a3, "");
            com.ss.android.ugc.aweme.tools.extract.b.c.a(a2, a3, "AudioAudit", "creative_tools_audit_error");
        }
    }

    public static final void a(j jVar) {
        int i2;
        Integer num;
        l.d(jVar, "");
        jVar.a();
        if (jVar.f140095f == null || ((num = jVar.f140095f) != null && num.intValue() == 0)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        q.a("av_video_audit", i2, jVar.a());
        if (jVar.f140096g == 0) {
            com.ss.android.ugc.aweme.tools.extract.b.a a2 = a.C3695a.a(jVar);
            String a3 = com.bytedance.crash.util.ab.a(new Throwable("VideoAuditError"));
            l.b(a3, "");
            com.ss.android.ugc.aweme.tools.extract.b.c.a(a2, a3, "VideoAudit", "creative_tools_audit_error");
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, int i2, String str) {
        String str2;
        Integer num;
        if (str == null) {
            str = "";
        }
        String str3 = str + ", " + a();
        l.b(str3, "");
        ar a2 = new ar().a("extra_msg", str3);
        String str4 = null;
        if (videoPublishEditModel != null) {
            str2 = es.c(videoPublishEditModel);
        } else {
            str2 = null;
        }
        ar a3 = a2.a("content_type", str2);
        if (videoPublishEditModel != null) {
            num = Integer.valueOf(es.g(videoPublishEditModel));
        } else {
            num = null;
        }
        ar a4 = a3.a("aweme_type", num);
        if (videoPublishEditModel != null) {
            str4 = videoPublishEditModel.enterFrom;
        }
        ar a5 = a4.a("enter_from", str4).a("status_code", Integer.valueOf(i2));
        q.a("av_extra_audio_frame", i2, a5.a());
        r.a("av_extra_audio_frame", a5.a());
    }

    public static final void a(ai aiVar, Object obj, Integer num, Boolean bool, String str) {
        String str2;
        int i2;
        boolean z;
        l.d(aiVar, "");
        l.d(obj, "");
        l.d(str, "");
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            l.d(aiVar, "");
            l.d(videoPublishEditModel, "");
            l.d(str, "");
            int i3 = 0;
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            com.ss.android.ugc.aweme.shortvideo.a a2 = createIAVServiceProxybyMonsterPlugin.getAVConverter().a(aiVar);
            j jVar = new j();
            if (a2 != null) {
                str2 = a2.aid;
            } else {
                str2 = null;
            }
            jVar.f140090a = str2;
            jVar.f140091b = y.a(videoPublishEditModel).f140023a;
            String cameraIds = videoPublishEditModel.getCameraIds();
            if (cameraIds == null || cameraIds.length() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jVar.f140092c = i2;
            jVar.f140093d = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
            if (videoPublishEditModel.mRestoreType == 2) {
                z = true;
            } else {
                z = false;
            }
            jVar.f140094e = Boolean.valueOf(z);
            jVar.f140095f = num;
            if (num == null || num.intValue() == 0) {
                i3 = 1;
            }
            jVar.f140096g = i3;
            jVar.f140097h = bool;
            jVar.a(str);
            a(jVar);
        }
    }

    public static void a(VideoPublishEditModel videoPublishEditModel, ai aiVar, Integer num, Boolean bool, String str) {
        String str2;
        int i2;
        boolean z;
        l.d(videoPublishEditModel, "");
        l.d(aiVar, "");
        l.d(str, "");
        int i3 = 0;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        com.ss.android.ugc.aweme.shortvideo.a a2 = createIAVServiceProxybyMonsterPlugin.getAVConverter().a(aiVar);
        j jVar = new j();
        if (a2 != null) {
            str2 = a2.aid;
        } else {
            str2 = null;
        }
        jVar.f140090a = str2;
        jVar.f140091b = r.a(videoPublishEditModel).f140026a;
        String cameraIds = videoPublishEditModel.getCameraIds();
        if (cameraIds == null || cameraIds.length() == 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        jVar.f140092c = i2;
        jVar.f140093d = Boolean.valueOf(videoPublishEditModel.mIsFromDraft);
        if (videoPublishEditModel.mRestoreType == 2) {
            z = true;
        } else {
            z = false;
        }
        jVar.f140094e = Boolean.valueOf(z);
        jVar.f140095f = num;
        if (num == null || num.intValue() == 0) {
            i3 = 1;
        }
        jVar.f140096g = i3;
        jVar.f140097h = bool;
        jVar.a(str);
        b(jVar);
    }
}
