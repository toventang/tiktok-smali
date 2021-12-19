package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.h;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.b;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.f.a;
import com.ss.android.ugc.tools.utils.i;
import h.e.j;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class l implements a {

    /* renamed from: a  reason: collision with root package name */
    public final c f124861a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f124862b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f124863c;

    /* renamed from: d  reason: collision with root package name */
    private final Workspace f124864d;

    static {
        Covode.recordClassIndex(82036);
    }

    private final void b() {
        String str;
        EditPreviewInfo h2 = d.h(this.f124861a);
        if (h2 == null) {
            h.f.b.l.b();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        File a2 = this.f124864d.a();
        h.f.b.l.b(a2, "");
        String sb2 = sb.append(com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a(a2.getPath())).append(File.separator).toString();
        for (T t : h2.getVideoList()) {
            String videoPath = t.getVideoPath();
            String str2 = di.f126461d;
            h.f.b.l.b(str2, "");
            String a3 = p.a(videoPath, str2, sb2);
            String audioPath = t.getAudioPath();
            if (audioPath != null) {
                String str3 = di.f126461d;
                h.f.b.l.b(str3, "");
                str = p.a(audioPath, str3, sb2);
            } else {
                str = null;
            }
            arrayList.add(new EditVideoSegment(a3, str, t.getVideoFileInfo()));
        }
        this.f124861a.a(new EditPreviewInfo(arrayList, h2.getPreviewWidth(), h2.getPreviewHeight(), h2.getSceneIn(), h2.getSceneOut(), sb2));
        a.a();
        b.a(this.f124864d, this.f124863c);
        b.a(this.f124861a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public final DraftFileSaveResult a() {
        boolean z;
        List<EditVideoSegment> videoList = this.f124862b.getPreviewInfo().getVideoList();
        if (videoList == null || videoList.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(4, new DraftFileSaveException(-600, new RuntimeException("model.previewInfo.videoList.isNullOrEmpty()")));
        }
        File a2 = this.f124864d.a();
        h.f.b.l.b(a2, "");
        String a3 = com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a(a2.getPath());
        i.c(a3);
        DraftFileSaveException draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
        for (T t : this.f124862b.getPreviewInfo().getVideoList()) {
            draftFileSaveException = h.a(t.getVideoPath(), a3 + File.separator + j.f(new File(t.getVideoPath())), true);
            if (!draftFileSaveException.isSuc()) {
                return new DraftFileSaveResult(4, draftFileSaveException);
            }
            String audioPath = t.getAudioPath();
            if (!(audioPath == null || audioPath.length() == 0)) {
                h.a(audioPath, a3 + File.separator + j.f(new File(audioPath)), true);
            }
        }
        b();
        return new DraftFileSaveResult(4, draftFileSaveException);
    }

    public l(c cVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(videoPublishEditModel, "");
        this.f124861a = cVar;
        this.f124862b = videoPublishEditModel;
        this.f124863c = z;
        this.f124864d = b.a(videoPublishEditModel);
    }
}
