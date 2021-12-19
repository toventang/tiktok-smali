package com.ss.android.ugc.gamora.recorder.quickupload;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.b.l;
import java.util.List;

public final class e extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<MediaModel> f148194a;

    /* renamed from: b  reason: collision with root package name */
    private final List<MediaModel> f148195b;

    static {
        Covode.recordClassIndex(97679);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f148194a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f148195b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends MediaModel> list, List<? extends MediaModel> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f148194a = list;
        this.f148195b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a((Object) this.f148194a.get(i2).f109389a, (Object) this.f148195b.get(i3).f109389a);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        if (this.f148194a.get(i2) == this.f148195b.get(i3)) {
            return true;
        }
        return false;
    }
}
