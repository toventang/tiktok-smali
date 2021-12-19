package com.bytedance.geckox.e;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.i;
import com.bytedance.q.b;
import com.bytedance.q.d;
import java.io.File;

public class j extends d<Pair<a, UpdatePackage>, Pair<a, UpdatePackage>> {

    /* renamed from: a  reason: collision with root package name */
    private e f29829a;

    static {
        Covode.recordClassIndex(17305);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f29829a = (e) objArr[0];
    }

    public static File a(UpdatePackage updatePackage) {
        int packageType = updatePackage.getPackageType();
        String accessKey = updatePackage.getAccessKey();
        String str = f.a().f29842a.get(accessKey);
        if (TextUtils.isEmpty(str)) {
            com.bytedance.geckox.i.a.a("can not find the accessKey path");
            return null;
        }
        File file = new File(str, accessKey + File.separator + updatePackage.getChannel());
        if (packageType == 0) {
            return new File(file, updatePackage.getLocalVersion() + File.separator + "res.zip");
        }
        if (packageType != 1) {
            com.bytedance.geckox.i.a.a("unknown file type: ".concat(String.valueOf(packageType)));
            return null;
        }
        File file2 = new File(file, updatePackage.getLocalVersion() + File.separator + "res");
        File[] listFiles = file2.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            return listFiles[0];
        }
        com.bytedance.geckox.i.a.a("can not found old full single file,:" + file2.getAbsolutePath());
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* bridge */ /* synthetic */ Object a(b<Pair<a, UpdatePackage>> bVar, Pair<a, UpdatePackage> pair) {
        return a(bVar, pair);
    }

    private static Object a(b<Pair<a, UpdatePackage>> bVar, Pair<a, UpdatePackage> pair) {
        File file;
        com.bytedance.geckox.i.a.a("start merge patch, channel:", ((UpdatePackage) pair.second).getChannel());
        a aVar = (a) pair.first;
        File f2 = aVar.f();
        aVar.a();
        aVar.e();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File a2 = a(updatePackage);
        if (a2 != null) {
            int packageType = updatePackage.getPackageType();
            if (packageType == 0) {
                file = new File(f2.getParentFile(), "res.zip");
            } else if (packageType == 1) {
                file = new File(f2.getParentFile(), b.a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
            } else {
                throw new RuntimeException("unknown file type: ".concat(String.valueOf(packageType)));
            }
            com.bytedance.geckox.utils.e.a(file);
            try {
                BsPatch.a(a2, f2, file.getParentFile(), file.getName());
                com.bytedance.geckox.utils.e.a(f2);
                a a3 = com.bytedance.geckox.buffer.impl.a.a(file, file.length());
                a3.b(0);
                try {
                    i.a(new com.bytedance.geckox.buffer.a.a(a3), updatePackage.getFullPackage().getMd5());
                    try {
                        return bVar.a(new Pair<>(a3, updatePackage));
                    } finally {
                        a3.e();
                    }
                } catch (Throwable th) {
                    throw new com.bytedance.geckox.c.a("check md5 failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
                }
            } catch (Exception e2) {
                throw new RuntimeException("merge patch failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e2.getMessage(), e2);
            } catch (Throwable th2) {
                com.bytedance.geckox.utils.e.a(f2);
                throw th2;
            }
        } else {
            throw new RuntimeException("get old file is null");
        }
    }
}
