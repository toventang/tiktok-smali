package com.ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e;
import com.ss.android.ugc.aweme.tools.extract.l;
import com.ss.android.ugc.tools.utils.c;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    private int f140064e;

    /* renamed from: f  reason: collision with root package name */
    private List<EditVideoSegment> f140065f;

    static {
        Covode.recordClassIndex(91529);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.l
    public final String e() {
        return "extract_movie";
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a() {
        super.a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final List<z> d() {
        return aa.a(this.f140065f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void f() {
        if (k.a(this.f140065f)) {
            return null;
        }
        ArrayList<EditVideoSegment> arrayList = new ArrayList();
        ArrayList<EditVideoSegment> arrayList2 = new ArrayList();
        for (EditVideoSegment editVideoSegment : this.f140065f) {
            if (e.b(editVideoSegment.getVideoPath())) {
                arrayList.add(editVideoSegment);
            } else {
                arrayList2.add(editVideoSegment);
            }
        }
        HashSet hashSet = new HashSet();
        for (EditVideoSegment editVideoSegment2 : arrayList) {
            Bitmap a2 = c.a(editVideoSegment2.getVideoPath(), k.f140100a);
            if (a2 != null) {
                String a3 = this.f139985c.a();
                c.a(a2, new File(a3), 70, Bitmap.CompressFormat.JPEG);
                hashSet.add(a3);
            }
        }
        String str = this.f139985c.f140102b;
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        int i2 = 0;
        for (EditVideoSegment editVideoSegment3 : arrayList2) {
            VEUtils.saveVideoFrames(editVideoSegment3.getVideoPath().toString(), a(editVideoSegment3), k.f140100a[0], -1, false, str, i2 + "extract_frame", 1);
            i2++;
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File file : listFiles) {
                hashSet.add(file.getAbsolutePath());
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList3.add(it.next());
        }
        ArrayList<FrameItem> arrayList4 = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new FrameItem((String) it2.next()));
        }
        this.f139983a.clearAllFrames();
        this.f139983a.addFrameSegment(arrayList4, null);
        return null;
    }

    public f(List<EditVideoSegment> list) {
        this.f140065f = list;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(boolean z) {
        super.a(z);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(l.a aVar) {
        super.a(aVar);
        if (b()) {
            i.b(new g(this), i.f4824a).a((g) new h(this, aVar));
        }
    }

    private int[] a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i2 = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            int end = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500;
            this.f140064e = end;
            iArr = new int[end];
            while (i2 < this.f140064e) {
                iArr[i2] = (int) (videoCutInfo.getStart() + ((long) (i2 * 500)));
                i2++;
            }
        } else {
            int duration = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            this.f140064e = duration;
            iArr = new int[duration];
            while (i2 < this.f140064e) {
                iArr[i2] = i2 * 500;
                i2++;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(l.a aVar, i iVar) {
        aVar.a(iVar.a());
        super.a(true);
        super.a();
        return null;
    }
}
