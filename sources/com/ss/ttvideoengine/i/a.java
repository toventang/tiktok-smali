package com.ss.ttvideoengine.i;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.h.z;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f152832a = new Bundle();

    /* renamed from: b  reason: collision with root package name */
    private int f152833b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f152834c;

    /* renamed from: d  reason: collision with root package name */
    private long f152835d;

    /* renamed from: e  reason: collision with root package name */
    private long f152836e;

    /* renamed from: f  reason: collision with root package name */
    private long f152837f;

    /* renamed from: g  reason: collision with root package name */
    private long f152838g;

    /* renamed from: h  reason: collision with root package name */
    private long f152839h;

    static {
        Covode.recordClassIndex(101650);
    }

    @Override // com.ss.ttvideoengine.i.b
    public final long a(String str) {
        return this.f152832a.getLong(str);
    }

    public a(int i2) {
    }

    @Override // com.ss.ttvideoengine.i.b
    public final void a(z zVar) {
        long j2;
        if (zVar != null) {
            long j3 = 0;
            if (zVar.ah > 0) {
                j2 = zVar.ah - zVar.t;
            } else {
                j2 = 0;
            }
            this.f152834c = j2;
            this.f152835d = zVar.al - zVar.t;
            this.f152836e = zVar.an - zVar.t;
            this.f152837f = zVar.w - zVar.t;
            this.f152839h = zVar.cw - zVar.t;
            if (zVar.cl > 0) {
                j3 = zVar.cl - zVar.t;
            }
            this.f152838g = j3;
            this.f152832a.putLong("ffr_read_head_duration", this.f152834c);
            this.f152832a.putLong("ffr_read_first_data_duration", this.f152835d);
            this.f152832a.putLong("ffr_decode_duration", this.f152836e);
            this.f152832a.putLong("ffr_render_duration", this.f152837f);
            this.f152832a.putLong("ffr_playback_buffering_duration", this.f152838g);
            this.f152832a.putLong("ffr_prender_duration", this.f152839h);
        }
    }
}
