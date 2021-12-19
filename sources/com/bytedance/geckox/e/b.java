package com.bytedance.geckox.e;

import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.a;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.statistic.c;
import com.bytedance.geckox.utils.i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.q.d;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public class b extends d<Pair<Uri, UpdatePackage>, Pair<a, UpdatePackage>> {

    /* renamed from: a  reason: collision with root package name */
    private e f29812a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.geckox.f.a f29813b;

    static {
        Covode.recordClassIndex(17295);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f29812a = (e) objArr[0];
        this.f29813b = (com.bytedance.geckox.f.a) objArr[1];
    }

    public static File a(UpdatePackage updatePackage) {
        String accessKey = updatePackage.getAccessKey();
        String str = f.a().f29842a.get(accessKey);
        if (!TextUtils.isEmpty(str)) {
            return new File(str, accessKey + File.separator + updatePackage.getChannel() + File.separator + updatePackage.getVersion() + "--updating");
        }
        throw new com.bytedance.geckox.c.d("can not find the accessKey path", null);
    }

    private static boolean a(File file) {
        MethodCollector.i(8352);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(8352);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8352);
        return delete;
    }

    public static String a(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf != -1) {
                String substring = str.substring(lastIndexOf + 1);
                if (!TextUtils.isEmpty(substring)) {
                    return "res" + File.separator + substring;
                }
                throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
            }
            throw new RuntimeException("url path illegal, url:".concat(String.valueOf(str)));
        }
        throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
    }

    /* access modifiers changed from: private */
    public Object a(com.bytedance.q.b<Pair<a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) {
        int i2;
        String str;
        Throwable th;
        com.bytedance.geckox.buffer.a.b bVar2;
        long j2;
        com.bytedance.geckox.buffer.a.b bVar3;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        if (updatePackage.getUpdateWithPatch()) {
            i2 = com.bytedance.geckox.a.a().f29708f;
        } else {
            i2 = com.bytedance.geckox.a.a().f29707e;
        }
        if (i2 <= 0 || ((float) i2) <= com.bytedance.geckox.utils.a.a()) {
            com.bytedance.geckox.i.a.a("start download channel:", updatePackage.getChannel(), "pid:" + Process.myPid() + ",thread id:" + Thread.currentThread().getId());
            UpdatePackage.Package r6 = updatePackage.getPackage();
            long length = r6.getLength();
            File a2 = a(updatePackage);
            a2.mkdirs();
            if (updatePackage.getUpdateWithPatch()) {
                str = "patch.tmp";
            } else if (updatePackage.getIsZstd()) {
                str = "res.zst";
            } else {
                int packageType = updatePackage.getPackageType();
                if (packageType == 0) {
                    str = "res.zip";
                } else if (packageType == 1) {
                    str = a(updatePackage, uri);
                } else {
                    throw new RuntimeException("unknown file type: ".concat(String.valueOf(packageType)));
                }
            }
            a a3 = com.bytedance.geckox.buffer.impl.a.a(new File(a2, str), length);
            try {
                bVar2 = bVar3;
                j2 = 0;
                try {
                    bVar3 = new com.bytedance.geckox.buffer.a.b(a3, this.f29813b, updatePackage, length);
                    try {
                        this.f29812a.f29786e.a(uri, bVar2);
                        a3.b(0);
                        try {
                            i.a(new com.bytedance.geckox.buffer.a.a(a3), r6.getMd5());
                            try {
                                return bVar.a(new Pair<>(a3, updatePackage));
                            } finally {
                                try {
                                    a3.e();
                                } catch (Exception unused) {
                                    com.bytedance.geckox.i.a.a();
                                }
                            }
                        } catch (Throwable th2) {
                            a(a3.f());
                            throw new com.bytedance.geckox.c.e(th2.getMessage(), th2);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (bVar2 != null && bVar2.f29749c > j2 && bVar2.f29749c < bVar2.f29748b) {
                            c.a(2, 21, com.a.a("download interrupt, ak:%s, channel:%s", new Object[]{bVar2.f29747a.getAccessKey(), bVar2.f29747a.getChannel()}), com.a.a("pkg_id:%d, currentSize:%d, percent:%d", new Object[]{Long.valueOf(bVar2.f29747a.getPackage().getId()), Long.valueOf(bVar2.f29749c), Integer.valueOf((int) ((bVar2.f29749c * 100) / bVar2.f29748b))}));
                        }
                        a3.e();
                        a(a3.f());
                        throw new com.bytedance.geckox.c.d(th.getMessage(), th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bVar2 = null;
                    c.a(2, 21, com.a.a("download interrupt, ak:%s, channel:%s", new Object[]{bVar2.f29747a.getAccessKey(), bVar2.f29747a.getChannel()}), com.a.a("pkg_id:%d, currentSize:%d, percent:%d", new Object[]{Long.valueOf(bVar2.f29747a.getPackage().getId()), Long.valueOf(bVar2.f29749c), Integer.valueOf((int) ((bVar2.f29749c * 100) / bVar2.f29748b))}));
                    a3.e();
                    a(a3.f());
                    throw new com.bytedance.geckox.c.d(th.getMessage(), th);
                }
            } catch (Throwable th5) {
                th = th5;
                j2 = 0;
                bVar2 = null;
                c.a(2, 21, com.a.a("download interrupt, ak:%s, channel:%s", new Object[]{bVar2.f29747a.getAccessKey(), bVar2.f29747a.getChannel()}), com.a.a("pkg_id:%d, currentSize:%d, percent:%d", new Object[]{Long.valueOf(bVar2.f29747a.getPackage().getId()), Long.valueOf(bVar2.f29749c), Integer.valueOf((int) ((bVar2.f29749c * 100) / bVar2.f29748b))}));
                a3.e();
                a(a3.f());
                throw new com.bytedance.geckox.c.d(th.getMessage(), th);
            }
        } else {
            throw new com.bytedance.geckox.c.d("cancel download, not available storage:", null);
        }
    }
}
