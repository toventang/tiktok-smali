package com.ss.android.ugc.aweme.shortvideo.WorkSpace;

import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dj;
import h.f.b.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f124792a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(81998);
    }

    public static final Workspace a() {
        OldImpl oldImpl = new OldImpl();
        Workspace workspace = new Workspace(oldImpl);
        oldImpl.p = workspace;
        return workspace;
    }

    public static final String b() {
        return dj.f126464g + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
    }

    public static final Workspace a(WorkspaceImpl workspaceImpl) {
        l.d(workspaceImpl, "");
        return new Workspace(workspaceImpl);
    }

    public static final String a(String str) {
        return dj.f126463f + d.b(str);
    }

    public static final Workspace a(String str, String str2, String str3, String str4) {
        OldImpl oldImpl = new OldImpl();
        oldImpl.f124777a = 1;
        oldImpl.f124780d = str;
        oldImpl.f124781e = str2;
        oldImpl.f124783g = str3;
        oldImpl.f124782f = str4;
        oldImpl.f124779c = a(str);
        Workspace workspace = new Workspace(oldImpl);
        oldImpl.p = workspace;
        return workspace;
    }
}
