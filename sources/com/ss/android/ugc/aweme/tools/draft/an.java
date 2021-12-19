package com.ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class an implements m {

    /* renamed from: a  reason: collision with root package name */
    private final c f139372a;

    /* renamed from: b  reason: collision with root package name */
    private final IDraftService.DraftListener f139373b;

    /* renamed from: c  reason: collision with root package name */
    private final ProgressDialog f139374c;

    /* renamed from: d  reason: collision with root package name */
    private final e f139375d;

    /* renamed from: e  reason: collision with root package name */
    private final int f139376e;

    /* renamed from: f  reason: collision with root package name */
    private final long f139377f;

    static {
        Covode.recordClassIndex(91114);
    }

    an(c cVar, IDraftService.DraftListener draftListener, ProgressDialog progressDialog, e eVar, int i2, long j2) {
        this.f139372a = cVar;
        this.f139373b = draftListener;
        this.f139374c = progressDialog;
        this.f139375d = eVar;
        this.f139376e = i2;
        this.f139377f = j2;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        return ak.a(this.f139372a, this.f139373b, this.f139374c, this.f139375d, this.f139376e, this.f139377f, (Boolean) obj);
    }
}
