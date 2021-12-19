package com.google.android.play.core.e;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public abstract class f {
    static {
        Covode.recordClassIndex(32934);
    }

    public static f a(int i2, int i3, int i4, long j2, long j3, List<String> list, List<String> list2) {
        if (i3 != 8) {
            return new h(i2, i3, i4, j2, j3, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static f a(Bundle bundle) {
        return new h(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public final List<String> f() {
        return i() != null ? new ArrayList(i()) : new ArrayList();
    }

    public final List<String> g() {
        return j() != null ? new ArrayList(j()) : new ArrayList();
    }

    public abstract PendingIntent h();

    /* access modifiers changed from: package-private */
    public abstract List<String> i();

    /* access modifiers changed from: package-private */
    public abstract List<String> j();

    /* access modifiers changed from: package-private */
    public abstract List<Intent> k();
}
