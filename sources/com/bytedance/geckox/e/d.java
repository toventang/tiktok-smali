package com.bytedance.geckox.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.q.j;
import java.io.File;
import java.util.List;

public class d extends j<UpdatePackage, UpdatePackage> {
    static {
        Covode.recordClassIndex(17297);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.q.j
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        File a2;
        UpdatePackage updatePackage2 = updatePackage;
        UpdatePackage.Package patch = updatePackage2.getPatch();
        if (patch == null) {
            a.a("no patch, start full update, channel:", updatePackage2.toString());
            return "full";
        }
        List<String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            a.a("patch url error, start full update, channel:", updatePackage2.toString());
            return "full";
        } else if (updatePackage2.getIsZstd() || ((a2 = j.a(updatePackage2)) != null && a2.exists())) {
            updatePackage2.setUpdateWithPatch(true);
            a.a("start patch update, channel:", updatePackage2.toString());
            return "patch";
        } else {
            a.a("old file is null, start full update, channel:", updatePackage2.toString());
            updatePackage2.setNotUsePatchReason(3);
            return "full";
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Throwable, java.lang.String] */
    @Override // com.bytedance.q.j
    public final /* synthetic */ String a(UpdatePackage updatePackage, Throwable th, String str) {
        UpdatePackage updatePackage2 = updatePackage;
        if ("patch".equals(str)) {
            updatePackage2.setUpdateWithPatch(false);
            a.a("start full update", updatePackage2.toString());
            return "full";
        }
        throw new RuntimeException("full update failed, caused by:" + th.getMessage(), th);
    }
}
