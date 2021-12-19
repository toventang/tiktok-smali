package com.ss.android.ugc.aweme.shortvideo.u;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.tools.utils.c;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f131088a;

    /* renamed from: b  reason: collision with root package name */
    private final EditVideoSegment f131089b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectThumb f131090c;

    /* renamed from: d  reason: collision with root package name */
    private final String f131091d;

    /* renamed from: e  reason: collision with root package name */
    private final IEffectService.OnVideoCoverCallback f131092e;

    static {
        Covode.recordClassIndex(85906);
    }

    b(boolean z, EditVideoSegment editVideoSegment, EffectThumb effectThumb, String str, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.f131088a = z;
        this.f131089b = editVideoSegment;
        this.f131090c = effectThumb;
        this.f131091d = str;
        this.f131092e = onVideoCoverCallback;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2;
        Bitmap bitmap;
        MethodCollector.i(11104);
        boolean z = this.f131088a;
        EditVideoSegment editVideoSegment = this.f131089b;
        EffectThumb effectThumb = this.f131090c;
        String str = this.f131091d;
        IEffectService.OnVideoCoverCallback onVideoCoverCallback = this.f131092e;
        if (!z) {
            VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(editVideoSegment.getVideoPath());
            if (videoFileInfo == null) {
                i2 = 0;
            } else {
                i2 = videoFileInfo.rotation;
            }
            if (editVideoSegment.getVideoCutInfo() != null) {
                i2 += editVideoSegment.getVideoCutInfo().getRotate();
            }
        } else {
            i2 = 0;
        }
        CoverInfo thumb = effectThumb.getThumb(0);
        if (thumb == null || thumb.getData() == null) {
            bitmap = null;
        } else {
            bitmap = Bitmap.createBitmap(thumb.getData(), thumb.getWidth(), thumb.getHeight(), Bitmap.Config.ARGB_8888);
            if (i2 > 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i2);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
        }
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            c.a(bitmap, new File(str), 60, Bitmap.CompressFormat.PNG);
        }
        s.a(new d(onVideoCoverCallback, bitmap));
        effectThumb.stopRender();
        MethodCollector.o(11104);
        return null;
    }
}
