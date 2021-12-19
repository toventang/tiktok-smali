package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.google.c.a.f;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.common.ah;
import com.ss.android.ugc.aweme.property.t;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.tools.extract.w;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.k;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static int f140181a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final x f140182b = new x();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f140183a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(91584);
        }

        public static final boolean a() {
            return com.bytedance.ies.abmock.b.a().a(true, "enable_upload_frame_check", false);
        }
    }

    private x() {
    }

    static {
        Covode.recordClassIndex(91583);
    }

    /* access modifiers changed from: package-private */
    public static final class c<F, T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f140185a = new c();

        static {
            Covode.recordClassIndex(91586);
        }

        c() {
        }

        @Override // com.google.c.a.f
        public final /* synthetic */ Object a(Object obj) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) obj;
            if (editVideoSegment == null) {
                return null;
            }
            l.d(editVideoSegment, "");
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            if (videoCutInfo != null) {
                return new ah(editVideoSegment.getVideoPath(), videoCutInfo.getStart(), videoCutInfo.getEnd() - videoCutInfo.getStart());
            }
            return new ah(editVideoSegment.getVideoPath(), 0, editVideoSegment.getVideoFileInfo().getDuration());
        }
    }

    public static final boolean c(Object obj) {
        if (t.a() != 0 || !(obj instanceof VideoPublishEditModel)) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType() || videoPublishEditModel.canvasVideoData != null) {
            return true;
        }
        return videoPublishEditModel.shouldUploadExtractFrames();
    }

    private static boolean d(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            ArrayList<TimeSpeedModelExtension> a2 = CameraComponentModel.a(((VideoPublishEditModel) obj).mVideoSegmentsDesc);
            l.b(a2, "");
            if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                for (T t : a2) {
                    l.b(t, "");
                    if (t.getBackgroundVideo() != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static List<Integer> b(Object obj) {
        a a2 = a(obj);
        List<z> d2 = a2 != null ? a2.d() : null;
        if (!(c(obj) || ((obj instanceof VideoPublishEditModel) && w.a.a((VideoPublishEditModel) obj))) || d2 == null || d2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (z zVar : d2) {
            if (!i.a(zVar.f140187a)) {
                return null;
            }
            String str = zVar.f140187a;
            if (str != null && e.b(str)) {
                arrayList.add(Integer.valueOf((int) zVar.f140189c));
            }
        }
        return arrayList;
    }

    public static final a a(Object obj) {
        List list;
        List<String> auditFrames;
        List<FrameItem> allFrames;
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (videoPublishEditModel.canvasVideoData != null) {
                ExtractFramesModel extractFramesModel = videoPublishEditModel.extractFramesModel;
                if (extractFramesModel == null || (allFrames = extractFramesModel.getAllFrames()) == null) {
                    list = new ArrayList();
                } else {
                    ArrayList arrayList = new ArrayList(n.a((Iterable) allFrames, 10));
                    Iterator<T> it = allFrames.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getPath());
                    }
                    list = n.g((Collection) arrayList);
                }
                CanvasVideoData canvasVideoData = videoPublishEditModel.canvasVideoData;
                if (!(canvasVideoData == null || (auditFrames = canvasVideoData.getAuditFrames()) == null)) {
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) auditFrames, 10));
                    Iterator<T> it2 = auditFrames.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(it2.next());
                    }
                    ArrayList arrayList3 = arrayList2;
                    if ((!arrayList3.isEmpty()) && arrayList3 != null) {
                        list.addAll(arrayList3);
                    }
                }
                return new s(list);
            } else if (videoPublishEditModel.isMvThemeVideoType()) {
                f140181a = 1;
                return new s(videoPublishEditModel.mvCreateVideoData.srcSelectMediaList);
            } else if (videoPublishEditModel.isCutSameVideoType()) {
                f140181a = 2;
                return new f(videoPublishEditModel.cutSameEditData.f83146g);
            } else if ((es.j(videoPublishEditModel) || videoPublishEditModel.editMusicSyncMode) && videoPublishEditModel.getPreviewInfo() != null && !k.a(videoPublishEditModel.getPreviewInfo().getVideoList())) {
                f140181a = 7;
                List a2 = ap.a(videoPublishEditModel.getPreviewInfo().getVideoList(), c.f140185a);
                return new b(a2, a2);
            } else if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut || com.ss.android.ugc.aweme.shortvideo.edit.model.b.c(videoPublishEditModel)) {
                f140181a = 6;
                return new ac(videoPublishEditModel.getPreviewInfo());
            } else if (videoPublishEditModel.containBackgroundVideo || d(obj)) {
                f140181a = 10;
                return new d(videoPublishEditModel);
            }
        }
        return null;
    }

    public static final class b extends q {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f140184f;

        static {
            Covode.recordClassIndex(91585);
        }

        @Override // com.ss.android.ugc.aweme.tools.extract.q, com.ss.android.ugc.aweme.tools.extract.l
        public final String e() {
            return "extract_upload";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, List list2) {
            super(list2);
            this.f140184f = list;
        }
    }
}
