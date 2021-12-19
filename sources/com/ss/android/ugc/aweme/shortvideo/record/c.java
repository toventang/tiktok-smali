package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.asve.recorder.e;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import h.f.b.l;
import java.io.File;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final File f130089a;

    /* renamed from: b  reason: collision with root package name */
    private final File f130090b;

    /* renamed from: c  reason: collision with root package name */
    private final File f130091c;

    /* renamed from: d  reason: collision with root package name */
    private final File f130092d;

    /* renamed from: e  reason: collision with root package name */
    private final File f130093e;

    static {
        Covode.recordClassIndex(85355);
    }

    @Override // com.ss.android.ugc.asve.recorder.e
    public final File a() {
        return this.f130089a;
    }

    @Override // com.ss.android.ugc.asve.recorder.e
    public final File b() {
        return this.f130090b;
    }

    @Override // com.ss.android.ugc.asve.recorder.e
    public final File c() {
        return this.f130091c;
    }

    @Override // com.ss.android.ugc.asve.recorder.e
    public final File d() {
        return this.f130092d;
    }

    public c(Workspace workspace) {
        l.d(workspace, "");
        File e2 = workspace.e();
        e2.mkdirs();
        this.f130089a = e2;
        this.f130090b = workspace.e();
        this.f130091c = workspace.a();
        this.f130092d = workspace.b();
        this.f130093e = new File(e2, UGCMonitor.TYPE_PHOTO);
    }
}
