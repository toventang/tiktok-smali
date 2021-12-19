package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.d;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.android.ugc.playerkit.simapicommon.a.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f143951a;

    /* renamed from: b  reason: collision with root package name */
    private final i f143952b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f143953c;

    static {
        Covode.recordClassIndex(94183);
    }

    u(boolean z, i iVar, boolean z2) {
        this.f143951a = z;
        this.f143952b = iVar;
        this.f143953c = z2;
    }

    @Override // com.ss.android.ugc.playerkit.a.d
    public final Object a() {
        com.ss.android.ugc.playerkit.model.u uVar;
        boolean z = this.f143951a;
        i iVar = this.f143952b;
        boolean z2 = this.f143953c;
        if (z || !a.C3820a.f143369a.b().PreloadProcessDataExperiment() || s.f143938b == null || (uVar = s.f143938b.get(iVar)) == null) {
            return a.C3820a.f143369a.a().createVideoUrlProcessor().a(iVar, m.e.TT, z, z2);
        }
        return uVar;
    }
}
