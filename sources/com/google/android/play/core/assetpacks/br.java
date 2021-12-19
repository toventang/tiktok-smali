package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bq;
import com.google.android.play.core.b.r;
import com.google.android.play.core.common.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

final /* synthetic */ class br implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bu f52912a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52913b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52914c;

    static {
        Covode.recordClassIndex(32710);
    }

    br(bu buVar, int i2, String str) {
        this.f52912a = buVar;
        this.f52913b = i2;
        this.f52914c = str;
    }

    public final void run() {
        bu buVar = this.f52912a;
        int i2 = this.f52913b;
        String str = this.f52914c;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_version_code", buVar.f52922d.a());
            bundle.putInt("session_id", i2);
            File[] a2 = buVar.a(str);
            ArrayList<String> arrayList = new ArrayList<>();
            long j2 = 0;
            for (File file : a2) {
                j2 += file.length();
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                arrayList2.add(null);
                String a3 = r.a(file);
                bundle.putParcelableArrayList(bq.a("chunk_intents", str, a3), arrayList2);
                bundle.putString(bq.a("uncompressed_hash_sha256", str, a3), bu.a(file));
                bundle.putLong(bq.a("uncompressed_size", str, a3), file.length());
                arrayList.add(a3);
            }
            bundle.putStringArrayList(bq.a("slice_ids", str), arrayList);
            bundle.putLong(bq.a("pack_version", str), (long) buVar.f52922d.a());
            bundle.putInt(bq.a("status", str), 4);
            bundle.putInt(bq.a("error_code", str), 0);
            bundle.putLong(bq.a("bytes_downloaded", str), j2);
            bundle.putLong(bq.a("total_bytes_to_download", str), j2);
            bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
            bundle.putLong("bytes_downloaded", j2);
            bundle.putLong("total_bytes_to_download", j2);
            buVar.f52923e.post(new bt(buVar, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        } catch (b e2) {
            bu.f52918a.e("notifyModuleCompleted failed", e2);
        }
    }
}
