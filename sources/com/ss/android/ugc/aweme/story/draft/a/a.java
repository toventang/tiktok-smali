package com.ss.android.ugc.aweme.story.draft.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasBackground;
import com.ss.android.ugc.aweme.canvas.PhotoCanvasTransformFilterParam;
import com.ss.android.ugc.aweme.draft.h;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.b;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final C3585a f137020a = new C3585a((byte) 0);

    static {
        Covode.recordClassIndex(89573);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.a.a$a  reason: collision with other inner class name */
    public static final class C3585a {
        static {
            Covode.recordClassIndex(89574);
        }

        private C3585a() {
        }

        public /* synthetic */ C3585a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a, com.ss.android.ugc.aweme.story.draft.a.b
    public final DraftFileSaveResult a() {
        PhotoCanvasBackground photoCanvasBackground;
        EditPreviewInfo h2;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        DraftFileSaveException component1;
        DraftFileSaveResult a2 = super.a();
        if (!a2.isSuc()) {
            return a2;
        }
        c cVar = this.f137024d;
        CanvasVideoData canvasVideoData = cVar.W.bo;
        if (canvasVideoData != null) {
            ArrayList arrayList = new ArrayList();
            List<String> sourceInfo = canvasVideoData.getSourceInfo();
            if (sourceInfo != null) {
                Iterator<T> it = sourceInfo.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p<DraftFileSaveException, String> b2 = b(it.next());
                    component1 = b2.component1();
                    String component2 = b2.component2();
                    if (!component1.isSuc()) {
                        break;
                    }
                    arrayList.add(component2);
                }
                return new DraftFileSaveResult(0, component1, 1, null);
            }
            ArrayList arrayList2 = new ArrayList();
            List<String> auditFrames = canvasVideoData.getAuditFrames();
            if (auditFrames != null) {
                Iterator<T> it2 = auditFrames.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    p<DraftFileSaveException, String> b3 = b(it2.next());
                    component1 = b3.component1();
                    String component22 = b3.component2();
                    if (!component1.isSuc()) {
                        break;
                    }
                    arrayList2.add(component22);
                }
            }
            PhotoCanvasBackground background = canvasVideoData.getBackground();
            if (background != null) {
                photoCanvasBackground = new PhotoCanvasBackground(background.getType());
                photoCanvasBackground.setFilePath(background.getFilePath());
                photoCanvasBackground.setStartColor(background.getStartColor());
                photoCanvasBackground.setEndColor(background.getEndColor());
                String filePath = background.getFilePath();
                if (filePath != null) {
                    p<DraftFileSaveException, String> b4 = b(filePath);
                    component1 = b4.component1();
                    String component23 = b4.component2();
                    if (component1.isSuc()) {
                        photoCanvasBackground.setFilePath(component23);
                    }
                    return new DraftFileSaveResult(0, component1, 1, null);
                }
            } else {
                photoCanvasBackground = null;
            }
            b bVar = cVar.W;
            CanvasVideoData canvasVideoData2 = new CanvasVideoData(a(arrayList), a(arrayList2), photoCanvasBackground, null, 8, null);
            List<PhotoCanvasTransformFilterParam> transformInfo = canvasVideoData.getTransformInfo();
            if (transformInfo != null) {
                Iterator<T> it3 = transformInfo.iterator();
                while (it3.hasNext()) {
                    canvasVideoData2.putTransform(it3.next());
                }
            }
            bVar.bo = canvasVideoData2;
            String str = (String) n.h((List) arrayList);
            if (!(str == null || (h2 = d.h(cVar)) == null || (videoList = h2.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) n.h((List) videoList)) == null)) {
                editVideoSegment.setVideoPath(str);
            }
        }
        component1 = b();
        return new DraftFileSaveResult(0, component1, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T> List<T> a(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    private final p<DraftFileSaveException, String> b(String str) {
        if (str.length() == 0 || a(str)) {
            return v.a(b(), str);
        }
        String str2 = h.a(this.f137022b) + "canvas/" + new File(str).getName();
        DraftFileSaveException a2 = h.a(str, str2, true);
        q.a("CanvasDraftFileSaver:src copy,from " + str + " to " + str2);
        return v.a(a2, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(VideoPublishEditModel videoPublishEditModel, c cVar) {
        super(videoPublishEditModel, cVar);
        l.d(videoPublishEditModel, "");
        l.d(cVar, "");
    }
}
