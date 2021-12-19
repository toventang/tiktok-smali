package com.ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final int f127837a;

    /* renamed from: b  reason: collision with root package name */
    private final int f127838b;

    /* renamed from: c  reason: collision with root package name */
    private final long f127839c;

    /* renamed from: d  reason: collision with root package name */
    private final long f127840d;

    /* renamed from: e  reason: collision with root package name */
    private final String f127841e;

    static {
        Covode.recordClassIndex(83801);
    }

    public e() {
        this(0, 0, 31);
    }

    public e(int i2, int i3) {
        this(i2, i3, 28);
    }

    public final EditPreviewInfo a(List<? extends EditVideoSegment> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        int i2 = this.f127837a;
        int i3 = this.f127838b;
        long j2 = this.f127839c;
        long j3 = this.f127840d;
        String str = this.f127841e;
        if (str == null) {
            str = b.a();
        }
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(arrayList, i2, i3, j2, j3, str);
        if (!(!list.isEmpty()) || list == null) {
            throw new IllegalArgumentException("segments must not be NullOrEmpty");
        }
        editPreviewInfo.getVideoList().addAll(list);
        return editPreviewInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, 0, 0, null);
    }

    public e(int i2, int i3, long j2, long j3, String str) {
        this.f127837a = i2;
        this.f127838b = i3;
        this.f127839c = j2;
        this.f127840d = j3;
        this.f127841e = str;
    }
}
