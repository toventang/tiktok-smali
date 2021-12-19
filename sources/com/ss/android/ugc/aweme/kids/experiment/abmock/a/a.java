package com.ss.android.ugc.aweme.kids.experiment.abmock.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.api.abmock.b;
import com.ss.android.ugc.aweme.kids.api.abmock.c;
import h.a.n;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.kids.api.abmock.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106530a = new a();

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final String a() {
        return "discover_page_icon_version";
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final boolean d() {
        return false;
    }

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final c c() {
        return c.INT;
    }

    static {
        Covode.recordClassIndex(68072);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.abmock.a
    public final List<b> b() {
        return n.c(new b("default version of discover page icon", true, 0), new b("version 1 of discover page icon", false, 1));
    }
}
