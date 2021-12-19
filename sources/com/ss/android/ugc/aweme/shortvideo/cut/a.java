package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import h.f.b.l;
import java.io.File;

public final class a {
    static {
        Covode.recordClassIndex(82315);
    }

    public static final BackgroundVideoCompileConfigure a(Workspace workspace) {
        l.d(workspace, "");
        File c2 = workspace.f124790a.c("");
        l.b(c2, "");
        String path = c2.getPath();
        l.b(path, "");
        File d2 = workspace.f124790a.d("");
        l.b(d2, "");
        String path2 = d2.getPath();
        l.b(path2, "");
        return new BackgroundVideoCompileConfigure(path, path2);
    }
}
