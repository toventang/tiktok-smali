package com.ss.android.ugc.aweme.story.draft.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEUtils;
import h.e.j;
import h.f.b.l;
import h.p;
import h.v;
import java.io.File;
import java.util.ArrayList;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f137026a = new a((byte) 0);

    static {
        Covode.recordClassIndex(89577);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89578);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a, com.ss.android.ugc.aweme.story.draft.a.b
    public final DraftFileSaveResult a() {
        String valueOf;
        int i2;
        p a2;
        DraftFileSaveResult a3 = super.a();
        if (!a3.isSuc()) {
            return a3;
        }
        EditPreviewInfo h2 = d.h(this.f137024d);
        char c2 = 0;
        if (h2 == null) {
            return new DraftFileSaveResult(0, null, 3, null);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : h2.getVideoList()) {
            String draftDir = h2.getDraftDir();
            if (a(t.getVideoPath())) {
                a2 = v.a(b(), t);
            } else {
                if (!h.b(t.getVideoPath())) {
                    valueOf = j.f(new File(t.getVideoPath()));
                } else {
                    valueOf = String.valueOf(t.getVideoPath().hashCode());
                }
                String str = com.ss.android.ugc.aweme.draft.h.a(draftDir) + valueOf;
                VideoCutInfo videoCutInfo = t.getVideoCutInfo();
                int i3 = -1;
                if (videoCutInfo != null) {
                    i2 = (int) videoCutInfo.getStart();
                } else {
                    i2 = -1;
                }
                VideoCutInfo videoCutInfo2 = t.getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    i3 = (int) videoCutInfo2.getEnd();
                }
                int[] iArr = new int[2];
                iArr[c2] = i2;
                iArr[1] = i3;
                if (t.getVideoCutInfo() == null || t.getVideoFileInfo().getDuration() - ((long) (i3 - i2)) <= 5000) {
                    DraftFileSaveException a4 = com.ss.android.ugc.aweme.draft.h.a(t.getVideoPath(), str, true);
                    if (!a4.isSuc()) {
                        a2 = v.a(a4, t);
                    }
                } else {
                    File file = new File(str);
                    if (file.exists()) {
                        a(file);
                    }
                    i.a(str, true);
                    int trimToDraft = VEUtils.trimToDraft(t.getVideoPath(), new int[]{i2, i3}, str, iArr);
                    if (trimToDraft != 0) {
                        a2 = v.a(new DraftFileSaveException(trimToDraft - 20000, new RuntimeException("VEUtils.trimToDraft invoke ; retCode : ".concat(String.valueOf(trimToDraft)))), t);
                    }
                }
                q.a("ImportVideoFileSaver:src copy,from " + t.getVideoPath() + " to " + str);
                DraftFileSaveException b2 = b();
                EditVideoSegment editVideoSegment = new EditVideoSegment(str, t.getAudioPath(), VideoFileInfo.copy$default(t.getVideoFileInfo(), 0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                VideoCutInfo videoCutInfo3 = t.getVideoCutInfo();
                if (videoCutInfo3 != null) {
                    editVideoSegment.setVideoCutInfo(new VideoCutInfo((long) iArr[0], (long) iArr[1], videoCutInfo3.getSpeed(), videoCutInfo3.getRotate()));
                }
                a2 = v.a(b2, editVideoSegment);
            }
            DraftFileSaveException draftFileSaveException = (DraftFileSaveException) a2.component1();
            Object component2 = a2.component2();
            if (!draftFileSaveException.isSuc()) {
                return new DraftFileSaveResult(2, draftFileSaveException);
            }
            arrayList.add(component2);
            c2 = 0;
        }
        this.f137024d.a(h2.cloneWithNewVideos(arrayList));
        return new DraftFileSaveResult(0, null, 3, null);
    }

    private static boolean a(File file) {
        MethodCollector.i(1364);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1364);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1364);
        return delete;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.draft.model.c cVar) {
        super(videoPublishEditModel, cVar);
        l.d(videoPublishEditModel, "");
        l.d(cVar, "");
    }
}
