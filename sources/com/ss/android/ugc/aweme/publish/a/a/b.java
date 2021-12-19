package com.ss.android.ugc.aweme.publish.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.publish.f.a;
import com.ss.android.ugc.aweme.publish.t;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;

public final class b {
    static {
        Covode.recordClassIndex(77028);
    }

    public static boolean a(int i2) {
        return i2 == 2;
    }

    public static AVUploadSaveModel a(AVUploadSaveModel aVUploadSaveModel, int i2, boolean z, a aVar) {
        boolean z2;
        boolean z3;
        if (!com.ss.android.ugc.aweme.property.b.i()) {
            return null;
        }
        if (aVUploadSaveModel == null) {
            aVUploadSaveModel = new AVUploadSaveModel();
        }
        if (TextUtils.isEmpty(aVUploadSaveModel.getLocalTempPath())) {
            aVUploadSaveModel.setLocalTempPath(dj.f126468k + dj.b(".mp4"));
        }
        boolean z4 = false;
        aVUploadSaveModel.setWaterMark(!SettingsManager.a().a("forbid_local_watermark", false));
        if (z) {
            if (i2 == 0 && !aVar.a() && (!aVar.b() || t.b() <= 0)) {
                z3 = false;
            } else {
                z3 = true;
            }
            aVUploadSaveModel.setSaveLocal(z3);
        } else {
            if (i2 == 0 && t.b() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            aVUploadSaveModel.setSaveLocal(z2);
        }
        aVUploadSaveModel.setSaveType(i2);
        if ((aVar.b() || com.ss.android.ugc.aweme.shortvideo.k.a.a()) && t.b() == 2) {
            z4 = true;
        }
        aVUploadSaveModel.setSaveWithCaption(z4);
        return aVUploadSaveModel;
    }
}
