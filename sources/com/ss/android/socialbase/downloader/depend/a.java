package com.ss.android.socialbase.downloader.depend;

import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class a implements t {

    /* renamed from: a  reason: collision with root package name */
    private boolean f60379a;

    static {
        Covode.recordClassIndex(37268);
    }

    @Override // com.ss.android.socialbase.downloader.depend.t
    public final boolean a() {
        return this.f60379a;
    }

    @Override // com.ss.android.socialbase.downloader.depend.t
    public void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f60379a = true;
        }
    }
}
