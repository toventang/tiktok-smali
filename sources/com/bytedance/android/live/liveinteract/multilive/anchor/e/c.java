package com.bytedance.android.live.liveinteract.multilive.anchor.e;

import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveAnchorSwitchFrequency;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11639a = MultiLiveAnchorSwitchFrequency.INSTANCE.getValue();

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList<Long> f11640b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public static final c f11641c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final ArrayList<Long> f11642d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private static final ArrayList<Long> f11643e = new ArrayList<>();

    private c() {
    }

    static {
        Covode.recordClassIndex(6329);
    }

    public static boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = f11642d;
        if (arrayList.size() < f11639a) {
            arrayList.add(Long.valueOf(currentTimeMillis));
            return true;
        }
        Long l2 = arrayList.get(0);
        l.b(l2, "");
        if (currentTimeMillis - l2.longValue() < 60000) {
            return false;
        }
        arrayList.remove(0);
        arrayList.add(Long.valueOf(currentTimeMillis));
        return true;
    }

    public static boolean b() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<Long> arrayList = f11643e;
        if (arrayList.size() < f11639a) {
            arrayList.add(Long.valueOf(currentTimeMillis));
            return true;
        }
        Long l2 = arrayList.get(0);
        l.b(l2, "");
        if (currentTimeMillis - l2.longValue() < 60000) {
            return false;
        }
        arrayList.remove(0);
        arrayList.add(Long.valueOf(currentTimeMillis));
        return true;
    }

    public static boolean a(View view) {
        l.d(view, "");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] < y.b() / 2) {
            return true;
        }
        return false;
    }

    public static final n a(int i2, int i3) {
        if (i2 == 1) {
            if (i3 == 0) {
                return n.FLOATING_FIX;
            }
        } else if (i2 != 1) {
            if (i2 == 0) {
                if (i3 == 0) {
                    return n.GRID_FIX;
                }
                if (i3 == 1) {
                    return n.GRID;
                }
            }
            return n.NORMAL;
        }
        if (i3 == 1) {
            return n.FLOATING;
        }
        return n.NORMAL;
    }
}
