package com.ss.android.ugc.aweme.tools.extract;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.extract.l;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.List;

public final class ac extends a {

    /* renamed from: e  reason: collision with root package name */
    private int f140018e;

    /* renamed from: f  reason: collision with root package name */
    private EditPreviewInfo f140019f;

    static {
        Covode.recordClassIndex(91506);
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.l
    public final String e() {
        return "extract_upload";
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final List<z> d() {
        return aa.a(this.f140019f.getVideoList());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void f() {
        EditPreviewInfo editPreviewInfo = this.f140019f;
        if (editPreviewInfo != null && !editPreviewInfo.getVideoList().isEmpty()) {
            String str = this.f139985c.f140102b;
            if (!str.endsWith(File.separator)) {
                str = str + File.separator;
            }
            int i2 = 0;
            for (EditVideoSegment editVideoSegment : this.f140019f.getVideoList()) {
                VEUtils.saveVideoFrames(editVideoSegment.getVideoPath(), a(editVideoSegment), k.f140100a[0], -1, false, str, i2 + "extract_frame", 1);
                i2++;
            }
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    this.f139983a.addFrameAtLastSegment(new FrameItem(file.getAbsolutePath()));
                }
            }
        }
        return null;
    }

    public ac(EditPreviewInfo editPreviewInfo) {
        this.f140019f = editPreviewInfo;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.a
    public final void a(l.a aVar) {
        super.a(aVar);
        if (b()) {
            i.b(new ad(this), i.f4824a).a((g) new ae(this, aVar));
        }
    }

    private int[] a(EditVideoSegment editVideoSegment) {
        int[] iArr;
        int i2 = 0;
        if (editVideoSegment.getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
            int end = ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart())) / 500;
            this.f140018e = end;
            iArr = new int[end];
            while (i2 < this.f140018e) {
                iArr[i2] = (int) (videoCutInfo.getStart() + ((long) (i2 * 500)));
                i2++;
            }
        } else {
            int duration = (int) (editVideoSegment.getVideoFileInfo().getDuration() / 500);
            this.f140018e = duration;
            iArr = new int[duration];
            while (i2 < this.f140018e) {
                iArr[i2] = i2 * 500;
                i2++;
            }
        }
        com.ss.android.ugc.aweme.port.in.g.a().o().k().a("split_extract_frame", "upload frame size: " + iArr.length);
        return iArr;
    }
}
