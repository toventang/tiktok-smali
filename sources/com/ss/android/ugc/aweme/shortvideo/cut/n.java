package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.b;
import com.ss.android.ugc.aweme.shortvideo.edit.model.e;
import com.ss.android.ugc.aweme.shortvideo.edit.model.h;
import dmt.av.video.a;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f125513a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(82367);
    }

    private static void a(List<? extends VideoSegment> list) {
        T next;
        int i2;
        T next2;
        int i3;
        Iterator<T> it = list.iterator();
        T t = null;
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int i4 = next.f125483g;
                do {
                    T next3 = it.next();
                    int i5 = next3.f125483g;
                    if (i4 < i5) {
                        next = next3;
                        i4 = i5;
                    }
                } while (it.hasNext());
            }
        }
        T t2 = next;
        int i6 = 0;
        if (t2 != null) {
            i2 = t2.f125483g;
        } else {
            i2 = 0;
        }
        a.a("video_height", Integer.valueOf(i2));
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            next2 = null;
        } else {
            next2 = it2.next();
            if (it2.hasNext()) {
                int i7 = next2.f125482f;
                do {
                    T next4 = it2.next();
                    int i8 = next4.f125482f;
                    if (i7 < i8) {
                        next2 = next4;
                        i7 = i8;
                    }
                } while (it2.hasNext());
            }
        }
        T t3 = next2;
        if (t3 != null) {
            i3 = t3.f125482f;
        } else {
            i3 = 0;
        }
        a.a("video_width", Integer.valueOf(i3));
        Iterator<T> it3 = list.iterator();
        if (it3.hasNext()) {
            t = it3.next();
            if (it3.hasNext()) {
                int a2 = t.a();
                do {
                    T next5 = it3.next();
                    int a3 = next5.a();
                    if (a2 < a3) {
                        t = next5;
                        a2 = a3;
                    }
                } while (it3.hasNext());
            }
        }
        T t4 = t;
        if (t4 != null) {
            i6 = t4.a();
        }
        a.a("video_fps", Integer.valueOf(i6));
    }

    public static EditPreviewInfo a(boolean z, Workspace workspace, List<? extends VideoSegment> list, long[] jArr) {
        VideoCutInfo videoCutInfo;
        VideoCutInfo videoCutInfo2;
        l.d(workspace, "");
        l.d(list, "");
        l.d(jArr, "");
        if (z) {
            ArrayList arrayList = new ArrayList();
            a(list);
            ArrayList arrayList2 = new ArrayList(h.a.n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.a((VideoSegment) it.next()));
            }
            ArrayList arrayList3 = arrayList2;
            if ((!arrayList3.isEmpty()) && arrayList3 != null) {
                arrayList.addAll(arrayList3);
            }
            long[] jArr2 = {jArr[0], jArr[1]};
            long j2 = jArr2[0];
            long j3 = jArr2[1];
            if (j2 >= 0 && (videoCutInfo2 = ((EditVideoSegment) arrayList.get(0)).getVideoCutInfo()) != null) {
                arrayList.set(0, EditVideoSegment.copy$default((EditVideoSegment) arrayList.get(0), null, null, null, new VideoCutInfo(j2 + videoCutInfo2.getStart(), videoCutInfo2.getEnd(), videoCutInfo2.getSpeed(), videoCutInfo2.getRotate()), 7, null));
            }
            if (j3 >= 0 && (videoCutInfo = ((EditVideoSegment) arrayList.get(arrayList.size() - 1)).getVideoCutInfo()) != null) {
                arrayList.set(arrayList.size() - 1, EditVideoSegment.copy$default((EditVideoSegment) arrayList.get(arrayList.size() - 1), null, null, null, new VideoCutInfo(videoCutInfo.getStart(), videoCutInfo.getEnd() - j3, videoCutInfo.getSpeed(), videoCutInfo.getRotate()), 7, null));
            }
            return new e(g.a().i().getVideoWidth(), g.a().i().getVideoHeight(), 28).a(arrayList);
        }
        h hVar = new h(0, 0, null, 31);
        File a2 = workspace.a();
        l.b(a2, "");
        String path = a2.getPath();
        l.b(path, "");
        File b2 = workspace.b();
        l.b(b2, "");
        String path2 = b2.getPath();
        File a3 = workspace.a();
        l.b(a3, "");
        return hVar.a(new EditVideoSegment(path, path2, b.a(a3.getPath())));
    }
}
