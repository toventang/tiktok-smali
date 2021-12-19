package com.bytedance.android.livesdk.survey.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.b.a;
import h.f.b.l;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private g f21560a;

    /* renamed from: d  reason: collision with root package name */
    public final a f21561d;

    /* renamed from: e  reason: collision with root package name */
    public DataChannel f21562e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21563f;

    static {
        Covode.recordClassIndex(12700);
    }

    public abstract void a();

    private f() {
        this.f21563f = false;
        this.f21561d = new a();
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public final void a(g gVar) {
        l.d(gVar, "");
        this.f21560a = gVar;
    }

    public final void a(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f21562e = dataChannel;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        if (this.f21563f != z) {
            this.f21563f = z;
            g gVar = this.f21560a;
            if (gVar != null) {
                gVar.a(z);
            }
        }
    }
}
