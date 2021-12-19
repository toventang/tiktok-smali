package com.bytedance.geckox.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.q.a;

public class c extends a<UpdatePackage, UpdatePackage> {
    static {
        Covode.recordClassIndex(17296);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.q.a
    public final /* synthetic */ String a(UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        if (updatePackage2.getIsZstd()) {
            return "branch_zstd";
        }
        int packageType = updatePackage2.getPackageType();
        if (packageType == 0) {
            return "branch_zip";
        }
        if (packageType == 1) {
            return "branch_single_file";
        }
        throw new RuntimeException("unknown file type: ".concat(String.valueOf(packageType)));
    }
}
