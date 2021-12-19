package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.b.g;
import com.ss.android.ugc.asve.context.d;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import h.f.b.l;

public final class t implements d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f130150a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f130151b;

    /* renamed from: c  reason: collision with root package name */
    public float f130152c;

    /* renamed from: d  reason: collision with root package name */
    public int f130153d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f130154e;

    /* renamed from: f  reason: collision with root package name */
    private g f130155f;

    /* renamed from: g  reason: collision with root package name */
    private String f130156g;

    static {
        Covode.recordClassIndex(85382);
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final boolean a() {
        return this.f130151b;
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final float b() {
        return this.f130152c;
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final boolean c() {
        return this.f130150a;
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final int d() {
        return this.f130153d;
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final g e() {
        return this.f130155f;
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final boolean f() {
        return this.f130154e;
    }

    @Override // com.ss.android.ugc.asve.context.d
    public final String g() {
        return this.f130156g;
    }

    public final void a(g gVar) {
        l.d(gVar, "");
        this.f130155f = gVar;
    }

    public t(CameraComponentModel cameraComponentModel) {
        l.d(cameraComponentModel, "");
        this.f130150a = cameraComponentModel.f124710e != 1 ? false : true;
        this.f130152c = 4.0f;
        this.f130155f = g.AS_ENCODE_PROFILE_MAIN;
        this.f130153d = 15;
        this.f130156g = "";
    }
}
