package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

final /* synthetic */ class bb implements bl {

    /* renamed from: a  reason: collision with root package name */
    private final bm f52863a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f52864b;

    static {
        Covode.recordClassIndex(32694);
    }

    bb(bm bmVar, Bundle bundle) {
        this.f52863a = bmVar;
        this.f52864b = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.bl
    public final Object a() {
        bk bkVar;
        bm bmVar = this.f52863a;
        Bundle bundle = this.f52864b;
        int i2 = bundle.getInt("session_id");
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        Map<Integer, bj> map = bmVar.f52896e;
        Integer valueOf = Integer.valueOf(i2);
        if (map.containsKey(valueOf)) {
            bj b2 = bmVar.b(i2);
            int i3 = bundle.getInt(bq.a("status", b2.f52885c.f52878a));
            if (bw.a(b2.f52885c.f52880c, i3)) {
                bm.f52892a.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(b2.f52885c.f52880c));
                bi biVar = b2.f52885c;
                String str = biVar.f52878a;
                int i4 = biVar.f52880c;
                if (i4 == 4) {
                    bmVar.f52894c.a().a(i2, str);
                } else if (i4 == 5) {
                    bmVar.f52894c.a().a(i2);
                } else if (i4 == 6) {
                    bmVar.f52894c.a().a(Arrays.asList(str));
                }
            } else {
                b2.f52885c.f52880c = i3;
                if (bw.b(i3)) {
                    bmVar.a(i2);
                    bmVar.f52895d.a(b2.f52885c.f52878a);
                } else {
                    for (bk bkVar2 : b2.f52885c.f52882e) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(bq.a("chunk_intents", b2.f52885c.f52878a, bkVar2.f52886a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    bkVar2.f52889d.get(i5).f52877a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String a2 = bm.a(bundle);
            long j2 = bundle.getLong(bq.a("pack_version", a2));
            int i6 = bundle.getInt(bq.a("status", a2));
            long j3 = bundle.getLong(bq.a("total_bytes_to_download", a2));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(bq.a("slice_ids", a2));
            ArrayList arrayList = new ArrayList();
            for (String str2 : bm.a(stringArrayList)) {
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(bq.a("chunk_intents", a2, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : bm.a(parcelableArrayList2)) {
                    if (obj != null) {
                        z = true;
                    }
                    arrayList2.add(new bh(z));
                    z = false;
                }
                String string = bundle.getString(bq.a("uncompressed_hash_sha256", a2, str2));
                long j4 = bundle.getLong(bq.a("uncompressed_size", a2, str2));
                int i7 = bundle.getInt(bq.a("patch_format", a2, str2), 0);
                if (i7 != 0) {
                    bkVar = new bk(str2, string, j4, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    bkVar = new bk(str2, string, j4, arrayList2, bundle.getInt(bq.a("compression_format", a2, str2), 0), 0);
                }
                arrayList.add(bkVar);
            }
            bmVar.f52896e.put(Integer.valueOf(i2), new bj(i2, bundle.getInt("app_version_code"), new bi(a2, j2, i6, j3, arrayList)));
        }
        return true;
    }
}
