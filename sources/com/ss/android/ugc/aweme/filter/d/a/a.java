package com.ss.android.ugc.aweme.filter.d.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.a.l;
import com.ss.android.ugc.aweme.filter.repository.internal.a.d;
import com.ss.android.ugc.aweme.filter.repository.internal.main.e;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.io.File;

public final class a extends e {
    static {
        Covode.recordClassIndex(60504);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l lVar) {
        super(lVar);
        h.f.b.l.d(lVar, "");
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.e, com.ss.android.ugc.aweme.filter.repository.internal.l
    public final boolean a(f fVar) {
        String str;
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(fVar, "");
        String string = d.f95581a.getString(String.valueOf(fVar.f95550a), "");
        h.f.b.l.b(string, "");
        ToolsUrlModel toolsUrlModel = fVar.f95554e;
        if (toolsUrlModel == null || (str = toolsUrlModel.f138732a) == null || !(!h.f.b.l.a((Object) string, (Object) str))) {
            return super.a(fVar);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.main.e
    public final boolean f(int i2) {
        File[] listFiles;
        File file = new File(c(i2));
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            h.f.b.l.b(file2, "");
            if (file2.isFile() && h.f.b.l.a((Object) file2.getName(), (Object) "config.json")) {
                return true;
            }
        }
        return false;
    }
}
