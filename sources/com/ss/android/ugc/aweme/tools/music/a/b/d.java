package com.ss.android.ugc.aweme.tools.music.a.b;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.music.a.e;
import com.ss.android.ugc.tools.utils.u;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.c.d f140335e;

    static {
        Covode.recordClassIndex(91684);
    }

    @Override // com.ss.android.ugc.aweme.tools.music.a.b.a
    public final void e() {
        if (this.f140335e.f69587a == null) {
            a("");
        } else {
            super.e();
        }
    }

    public d(com.ss.android.ugc.aweme.c.d dVar) {
        l.d(dVar, "");
        this.f140335e = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.tools.music.a.b.a
    public final Object a(h.c.d<? super String> dVar) {
        Bitmap decodeBitmap;
        ExtractFramesModel extractFramesModel = this.f140335e.f69587a;
        if (extractFramesModel == null) {
            return null;
        }
        List<FrameItem> allFrames = extractFramesModel.getAllFrames();
        int i2 = 0;
        if (allFrames == null || allFrames.isEmpty()) {
            return null;
        }
        List<FrameItem> a2 = e.a(allFrames, b());
        String a3 = a();
        ArrayList arrayList = new ArrayList();
        for (FrameItem frameItem : a2) {
            File file = new File(frameItem.getPath());
            if (file.exists() && (decodeBitmap = BitmapUtils.decodeBitmap(file)) != null) {
                String absolutePath = a(e.a(decodeBitmap), i2).getAbsolutePath();
                l.b(absolutePath, "");
                arrayList.add(absolutePath);
            }
            i2++;
        }
        return u.a(a3, arrayList);
    }
}
