package com.ss.android.ugc.aweme.shortvideo.ab;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.b;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.HashSet;
import java.util.List;

public final class h implements a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f124855d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f124856a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoPublishEditModel f124857b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f124858c;

    /* renamed from: e  reason: collision with root package name */
    private final Workspace f124859e;

    static {
        Covode.recordClassIndex(82030);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82031);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ab.a
    public final DraftFileSaveResult a() {
        boolean z;
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2 = this.f124857b.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new DraftFileSaveResult(3, new DraftFileSaveException(-600, new RuntimeException("model.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList.isNullOrEmpty()")));
        }
        String draftDir = this.f124857b.draftDir();
        l.b(draftDir, "");
        String a2 = com.ss.android.ugc.aweme.draft.h.a(draftDir);
        HashSet<String> hashSet = new HashSet();
        HashSet<String> hashSet2 = new HashSet();
        List<MultiEditVideoSegmentRecordData> list3 = this.f124857b.multiEditVideoRecordData.curMultiEditVideoRecordData.segmentDataList;
        l.b(list3, "");
        for (T t : list3) {
            String str = t.videoPath;
            l.b(str, "");
            hashSet.add(str);
            String str2 = t.audioPath;
            if (!(str2 == null || str2.length() == 0 || str2 == null)) {
                hashSet2.add(str2);
            }
        }
        MultiEditVideoRecordData multiEditVideoRecordData = this.f124857b.multiEditVideoRecordData.restoreMultiEditVideoRecordData;
        if (!(multiEditVideoRecordData == null || (list = multiEditVideoRecordData.segmentDataList) == null)) {
            for (T t2 : list) {
                String str3 = t2.videoPath;
                l.b(str3, "");
                hashSet.add(str3);
                String str4 = t2.audioPath;
                if (!(str4 == null || str4.length() == 0 || str4 == null)) {
                    hashSet2.add(str4);
                }
            }
        }
        for (String str5 : hashSet) {
            StringBuilder append = new StringBuilder().append(a2);
            String absolutePath = new File(str5).getAbsolutePath();
            l.b(absolutePath, "");
            String str6 = di.f126462e;
            l.b(str6, "");
            DraftFileSaveException a3 = com.ss.android.ugc.aweme.draft.h.a(str5, append.append(p.a(absolutePath, (CharSequence) com.ss.android.ugc.aweme.draft.h.a(str6))).toString(), true);
            if (!a3.isSuc()) {
                return new DraftFileSaveResult(3, a3);
            }
        }
        for (String str7 : hashSet2) {
            StringBuilder append2 = new StringBuilder().append(a2);
            String absolutePath2 = new File(str7).getAbsolutePath();
            l.b(absolutePath2, "");
            String str8 = di.f126462e;
            l.b(str8, "");
            com.ss.android.ugc.aweme.draft.h.a(str7, append2.append(p.a(absolutePath2, (CharSequence) com.ss.android.ugc.aweme.draft.h.a(str8))).toString(), true);
        }
        StringBuilder sb = new StringBuilder();
        String str9 = di.f126462e;
        l.b(str9, "");
        DraftFileSaveException a4 = com.ss.android.ugc.aweme.draft.h.a(sb.append(com.ss.android.ugc.aweme.draft.h.a(str9)).append("data.txt").toString(), a2 + "data.txt", true);
        if (a4.isSuc()) {
            String str10 = di.f126462e;
            l.b(str10, "");
            d.a(str10, this.f124857b.draftDir() + File.separator, this.f124856a.W.ax);
            c cVar = this.f124856a;
            com.ss.android.ugc.aweme.shortvideo.edit.model.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.edit.model.c(false);
            MultiEditVideoRecordData multiEditVideoRecordData2 = cVar.W.ax.curMultiEditVideoRecordData;
            l.b(multiEditVideoRecordData2, "");
            EditPreviewInfo editPreviewInfo = cVar.W.ao;
            if (editPreviewInfo == null) {
                l.b();
            }
            cVar.a(cVar2.a(new h.p<>(multiEditVideoRecordData2, editPreviewInfo)));
            com.ss.android.ugc.aweme.shortvideo.f.a.a();
            b.a(this.f124859e, this.f124858c);
            b.a(this.f124856a);
        }
        return new DraftFileSaveResult(3, a4);
    }

    public h(c cVar, VideoPublishEditModel videoPublishEditModel, boolean z) {
        l.d(cVar, "");
        l.d(videoPublishEditModel, "");
        this.f124856a = cVar;
        this.f124857b = videoPublishEditModel;
        this.f124858c = z;
        this.f124859e = b.a(videoPublishEditModel);
    }
}
