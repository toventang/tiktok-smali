package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.camera.a;
import com.ss.android.ugc.asve.recorder.camera.d;
import com.ss.android.ugc.asve.recorder.camera.e;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.n;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;

public final class af implements e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f131255a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f131256b;

    /* renamed from: c  reason: collision with root package name */
    private final e f131257c;

    static {
        Covode.recordClassIndex(85991);
    }

    public af(byte b2) {
        this();
    }

    private /* synthetic */ af() {
        this(a.f62195a);
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.e
    public final boolean a() {
        if (n.a() || n.b()) {
            return true;
        }
        return false;
    }

    private af(e eVar) {
        boolean z;
        l.d(eVar, "");
        this.f131257c = eVar;
        if (g.a().A().a() || !g.a().A().b()) {
            z = true;
        } else {
            z = false;
        }
        this.f131255a = z;
        this.f131256b = n.b();
        if (z) {
            q.a("CameraAntiShakeV1", " -> initialize: The user is not logged in or in FTC mode");
        }
        if (this.f131256b) {
            q.a("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v2");
        }
        if (a() && !this.f131256b) {
            q.a("CameraAntiShakeV1", " -> initialize: current anti-shake experiment version is v1");
        }
    }

    @Override // com.ss.android.ugc.asve.recorder.camera.e
    public final boolean a(Context context, d dVar, int i2) {
        l.d(context, "");
        l.d(dVar, "");
        if (this.f131255a) {
            return false;
        }
        if (this.f131256b) {
            return true;
        }
        return this.f131257c.a(context, dVar, i2);
    }
}
