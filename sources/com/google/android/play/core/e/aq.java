package com.google.android.play.core.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

final class aq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f53250a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ as f53251b;

    static {
        Covode.recordClassIndex(32911);
    }

    aq(as asVar, e eVar) {
        this.f53251b = asVar;
        this.f53250a = eVar;
    }

    public final void run() {
        ap apVar = this.f53251b.f53253a;
        List<String> list = this.f53250a.f53312a;
        List<String> a2 = as.a(this.f53250a.f53313b);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(list));
        }
        if (!a2.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(a2));
        }
        bundle.putLong("total_bytes_to_download", 0);
        bundle.putLong("bytes_downloaded", 0);
        apVar.a(f.a(bundle));
    }
}
