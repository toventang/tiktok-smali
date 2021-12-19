package com.ss.android.medialib.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.RecordInvoker;
import com.ss.android.medialib.presenter.d;

public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private RecordInvoker f59808a;

    public interface a {
        static {
            Covode.recordClassIndex(36956);
        }
    }

    public interface b extends d.a {
        static {
            Covode.recordClassIndex(36957);
        }
    }

    static {
        Covode.recordClassIndex(36955);
    }

    @Override // com.ss.android.medialib.presenter.d
    public final void a() {
        RecordInvoker recordInvoker = this.f59808a;
        if (recordInvoker != null) {
            recordInvoker.postDuetAction(0, 0);
        }
    }

    @Override // com.ss.android.medialib.presenter.d
    public final void b() {
        RecordInvoker recordInvoker = this.f59808a;
        if (recordInvoker != null) {
            recordInvoker.postDuetAction(2, 0);
        }
    }

    g(RecordInvoker recordInvoker) {
        this.f59808a = recordInvoker;
    }

    @Override // com.ss.android.medialib.presenter.d
    public final void a(boolean z) {
        RecordInvoker recordInvoker = this.f59808a;
        if (recordInvoker != null) {
            recordInvoker.setEnableEffCtrl(z);
        }
    }

    @Override // com.ss.android.medialib.presenter.d
    public final void a(d.a aVar) {
        RecordInvoker recordInvoker = this.f59808a;
        if (recordInvoker != null) {
            recordInvoker.setVEOnVideoEOFListener((b) aVar);
        }
    }
}
