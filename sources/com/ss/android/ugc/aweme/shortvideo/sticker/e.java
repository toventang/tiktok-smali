package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.text.TextUtils;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.tools.utils.i;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f130264a = g.a().g().c().e("save-photo");

    /* renamed from: b  reason: collision with root package name */
    public static final e f130265b = new e();

    /* renamed from: c  reason: collision with root package name */
    private static final String f130266c = g.a().g().c().a("EffectCapturedPhoto");

    private e() {
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f130268a;

        static {
            Covode.recordClassIndex(85447);
        }

        a(String str) {
            this.f130268a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                i.a(new File(this.f130268a));
            } catch (Exception e2) {
                g.a().I().a((Throwable) e2);
            }
            return z.f158842a;
        }
    }

    public static String a() {
        File file = new File(f130264a);
        if (!file.exists()) {
            file.mkdirs();
        }
        String path = file.getPath();
        l.b(path, "");
        return path;
    }

    static {
        Covode.recordClassIndex(85446);
    }

    public static final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            d(f130266c + str);
        }
    }

    public static final void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            b.i.b(new a(str), b.i.f4824a);
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return f130266c;
        }
        return f130266c + File.separator + str;
    }

    public static String c(String str) {
        l.d(str, "");
        String path = new File(a(), str + "_watermark.png").getPath();
        l.b(path, "");
        return path;
    }

    public static void a(HashSet<String> hashSet, c cVar) {
        ArrayList<TimeSpeedModelExtension> a2;
        l.d(hashSet, "");
        l.d(cVar, "");
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = cVar.W.ax;
        if (h.b(multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.editCutSegments : null)) {
            a2 = cVar.W.ax.editCutSegments;
        } else {
            a2 = CameraComponentModel.a(cVar.K);
        }
        if (a2 != null) {
            for (T t : a2) {
                SavePhotoStickerInfo savePhotoStickerInfo = t.getSavePhotoStickerInfo();
                if (!k.a(savePhotoStickerInfo != null ? savePhotoStickerInfo.getCapturedPhotoPaths() : null)) {
                    String stickerId = t.getStickerId();
                    l.b(stickerId, "");
                    String c2 = c(stickerId);
                    if (!TextUtils.isEmpty(c2)) {
                        hashSet.add(c2);
                    }
                }
            }
        }
    }
}
