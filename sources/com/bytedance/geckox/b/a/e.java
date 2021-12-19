package com.bytedance.geckox.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.b.b;
import java.io.File;
import java.util.List;

final class e extends b {
    static {
        Covode.recordClassIndex(17264);
    }

    e() {
    }

    @Override // com.bytedance.geckox.b.a.b
    public final void a() {
        for (String str : this.f29739f) {
            List<File> b2 = com.bytedance.geckox.utils.e.b(new File(this.f29738e, str));
            if (b2 != null && b2.size() > this.f29737d.f29728a) {
                for (File file : b2.subList(0, b2.size() - this.f29737d.f29728a)) {
                    b.a(file.getAbsolutePath());
                    if (this.f29737d.f29730c != null) {
                        file.getName();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.geckox.b.a.b
    public final void a(a aVar, File file, List<String> list) {
        super.a(aVar, file, list);
    }
}
