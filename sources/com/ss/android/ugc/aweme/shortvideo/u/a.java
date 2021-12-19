package com.ss.android.ugc.aweme.shortvideo.u;

import android.graphics.Bitmap;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.jni.EffectThumb;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.b;
import h.u;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f131087a;

    static {
        Covode.recordClassIndex(85905);
        l.a a2 = l.a(o.FIXED);
        a2.f79173b = "EffectVideoCover";
        a2.f79174c = 3;
        f131087a = g.a(a2.a());
    }

    public static void a(Bitmap bitmap, String str) {
        i.b(new c(str, bitmap), f131087a);
    }

    public static void a(List<EffectPointModel> list, String str, float f2, int i2, boolean z, EditPreviewInfo editPreviewInfo, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        a(list, str, f2, i2, z, editPreviewInfo, null, onVideoCoverCallback);
    }

    public static void a(List<EffectPointModel> list, String str, float f2, int i2, boolean z, EditPreviewInfo editPreviewInfo, String str2, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        EffectThumb effectThumb = new EffectThumb();
        u<EditVideoSegment, Long, long[]> a2 = b.a(editPreviewInfo, z, (long) i2);
        EditVideoSegment first = a2.getFirst();
        if (effectThumb.init(first.getVideoPath()) < 0) {
            if (onVideoCoverCallback != null) {
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
            }
            effectThumb.stopRender();
            return;
        }
        EffectConfig filter = com.ss.android.ugc.aweme.effect.g.a(list, first.getVideoCutInfo(), z, a2.getThird()).setFilter(str);
        if (f2 != -1.0f) {
            filter.setFilterIntensity(f2);
        }
        int width = first.getVideoFileInfo().getWidth();
        if (width <= 0 || width >= 256) {
            width = 256;
        }
        effectThumb.renderVideo(new long[]{a2.getSecond().longValue()}, filter, width, width);
        i.b(new b(z, first, effectThumb, str2, onVideoCoverCallback), f131087a);
    }
}
