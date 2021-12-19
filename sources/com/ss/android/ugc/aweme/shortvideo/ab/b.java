package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.vesdk.VEUtils;
import h.a.n;
import h.e.j;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;

public final class b {
    static {
        Covode.recordClassIndex(82023);
    }

    public static final class a extends k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Workspace f124844a;

        static {
            Covode.recordClassIndex(82024);
        }

        a(Workspace workspace) {
            this.f124844a = workspace;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(d dVar, Object obj) {
            l.d(dVar, "");
            Workspace workspace = this.f124844a;
            if (workspace != null) {
                workspace.g();
            }
        }
    }

    public static final void a(c cVar) {
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("duration", System.currentTimeMillis() - cVar.I).a("videoPath", cVar.f83186g).a("modify_time", cVar.I);
        com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
        aVar.a(cVar);
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_draft_save", a2.a("size", aVar.a()).f149193a);
    }

    private static boolean a(File file) {
        MethodCollector.i(11823);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11823);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11823);
        return delete;
    }

    public static final void a(Workspace workspace, boolean z) {
        if (!z) {
            if (SettingsManager.a().a("creative_prefix_enable_delete_record_files_after_cancel_on_save_draft", false) && h.b()) {
                h.a(new a(workspace), (String) null);
            } else if (workspace != null) {
                workspace.g();
            }
        }
    }

    public static final DraftFileSaveException a(EditPreviewInfo editPreviewInfo, c cVar) {
        String valueOf;
        ArrayList arrayList = new ArrayList();
        DraftFileSaveException draftFileSaveException = new DraftFileSaveException(0, null, 3, null);
        int i2 = 0;
        for (T t : editPreviewInfo.getVideoList()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            T t2 = t;
            if (!com.ss.android.ugc.tools.utils.h.b(t2.getVideoPath())) {
                valueOf = j.f(new File(t2.getVideoPath()));
            } else {
                valueOf = String.valueOf(t2.getVideoPath().hashCode());
            }
            String str = com.ss.android.ugc.aweme.draft.h.a(editPreviewInfo.getDraftDir()) + valueOf + "_copy";
            VideoCutInfo videoCutInfo = t2.getVideoCutInfo();
            if (videoCutInfo == null) {
                l.b();
            }
            int start = (int) videoCutInfo.getStart();
            VideoCutInfo videoCutInfo2 = t2.getVideoCutInfo();
            if (videoCutInfo2 == null) {
                l.b();
            }
            int end = (int) videoCutInfo2.getEnd();
            int[] iArr = {start, end};
            if (t2.getVideoFileInfo().getDuration() - ((long) (end - start)) <= 5000) {
                draftFileSaveException = com.ss.android.ugc.aweme.draft.h.a(t2.getVideoPath(), str, true);
                if (!draftFileSaveException.isSuc()) {
                    return draftFileSaveException;
                }
            } else {
                File file = new File(str);
                if (file.exists()) {
                    a(file);
                }
                i.a(str, true);
                int trimToDraft = VEUtils.trimToDraft(t2.getVideoPath(), new int[]{start, end}, str, iArr);
                if (trimToDraft != 0) {
                    return new DraftFileSaveException(trimToDraft - 20000, new RuntimeException("VEUtils.trimToDraft invoke ; retCode : ".concat(String.valueOf(trimToDraft))));
                }
            }
            EditVideoSegment editVideoSegment = new EditVideoSegment(str, t2.getAudioPath(), VideoFileInfo.copy$default(t2.getVideoFileInfo(), 0, 0, 0, 0, 0, 0, 0, 0, 255, null));
            VideoCutInfo videoCutInfo3 = t2.getVideoCutInfo();
            if (videoCutInfo3 != null) {
                editVideoSegment.setVideoCutInfo(new VideoCutInfo((long) iArr[0], (long) iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate()));
            }
            arrayList.add(editVideoSegment);
            i2 = i3;
        }
        cVar.f(arrayList);
        return draftFileSaveException;
    }
}
