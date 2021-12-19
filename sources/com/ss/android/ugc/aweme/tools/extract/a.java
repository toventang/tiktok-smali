package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.t;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.tools.extract.l;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class a implements l {

    /* renamed from: a  reason: collision with root package name */
    protected ExtractFramesModel f139983a = new ExtractFramesModel(e());

    /* renamed from: b  reason: collision with root package name */
    protected volatile boolean f139984b;

    /* renamed from: c  reason: collision with root package name */
    protected n f139985c = new n(c.f115622a);

    /* renamed from: d  reason: collision with root package name */
    protected String f139986d = UUID.randomUUID().toString();

    static {
        Covode.recordClassIndex(91480);
    }

    /* access modifiers changed from: package-private */
    public abstract List<z> d();

    public final ExtractFramesModel c() {
        return this.f139983a;
    }

    public static boolean b() {
        if (t.a() == 0) {
            return true;
        }
        return false;
    }

    public void a() {
        this.f139984b = false;
        this.f139983a = new ExtractFramesModel(e());
        this.f139986d = UUID.randomUUID().toString();
    }

    public void a(boolean z) {
        dmt.av.video.a.a("extracting_frame");
        this.f139984b = false;
    }

    public void a(l.a aVar) {
        g.a().o().k().a("extract_frame", "start extract frame for " + e());
        dmt.av.video.a.a("extracting_frame", e());
        if (!b()) {
            aVar.a(false);
            return;
        }
        this.f139984b = true;
        n nVar = this.f139985c;
        nVar.a(n.a(nVar.f140101a).getAbsolutePath(), e(), this.f139986d);
        this.f139983a.setExtractFramesDir(this.f139985c.f140102b);
        com.ss.android.ugc.aweme.port.in.l.f115658a.k().getFrameVerificationService().onExtractFrameContextActive(e(), this.f139986d, this.f139985c.f140102b, "creationId not available currently.");
        this.f139983a.addFrameSegment(new ArrayList<>(), null);
    }
}
