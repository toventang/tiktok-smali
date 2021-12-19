package com.ss.android.ugc.aweme.shortvideo.edit;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.n;
import h.f.b.l;
import h.m.p;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f127802a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(83771);
    }

    private static SparseArray<Integer> b() {
        SparseArray<Integer> sparseArray = new SparseArray<>(6);
        int i2 = 0;
        for (Object obj : p.c("30,40,50,60,69,100", new String[]{","})) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            sparseArray.put(i2, Integer.valueOf(Integer.parseInt((String) obj)));
            i2 = i3;
        }
        return sparseArray;
    }

    public static SparseArray<Integer> a() {
        SparseArray<Integer> sparseArray = new SparseArray<>(6);
        try {
            String a2 = SettingsManager.a().a("edit_page_process_bar_velocity_factor", "30,40,50,60,69,100");
            l.b(a2, "");
            int i2 = 0;
            for (Object obj : p.c(a2, new String[]{","})) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    n.a();
                }
                sparseArray.put(i2, Integer.valueOf(Integer.parseInt((String) obj)));
                i2 = i3;
            }
        } catch (Exception unused) {
            sparseArray = b();
        }
        if (sparseArray.size() != 6) {
            return b();
        }
        return sparseArray;
    }
}
