package com.ss.android.ugc.aweme.tools.draft;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.draft.model.b;
import com.ss.android.ugc.aweme.draft.model.c;
import h.f.b.l;
import java.util.List;

public final class h extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public List<c> f139775a;

    /* renamed from: b  reason: collision with root package name */
    public List<c> f139776b;

    /* renamed from: c  reason: collision with root package name */
    private final String f139777c = "AwemeDraftDiffCallback";

    /* renamed from: d  reason: collision with root package name */
    private final int f139778d;

    static {
        Covode.recordClassIndex(91365);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f139775a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f139776b.size();
    }

    public h(List<c> list, List<c> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f139775a = list;
        this.f139776b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        String f2;
        Object obj = "";
        if (this.f139775a.get(i2).x == this.f139778d) {
            String f3 = this.f139775a.get(i2).f();
            c cVar = this.f139776b.get(i3);
            if (!(cVar == null || (f2 = cVar.f()) == null)) {
                obj = f2;
            }
            return l.a((Object) f3, obj);
        }
        int i4 = this.f139775a.get(i2).x;
        c cVar2 = this.f139776b.get(i3);
        if (cVar2 != null) {
            obj = Integer.valueOf(cVar2.x);
        }
        if ((obj instanceof Integer) && i4 == ((Integer) obj).intValue()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        List<String> list;
        List<String> list2;
        b bVar;
        CanvasVideoData canvasVideoData;
        c cVar = this.f139775a.get(i2);
        c cVar2 = this.f139776b.get(i3);
        CanvasVideoData canvasVideoData2 = cVar.W.bo;
        String str = null;
        if (canvasVideoData2 != null) {
            list = canvasVideoData2.getSourceInfo();
        } else {
            list = null;
        }
        if (cVar2 == null || (bVar = cVar2.W) == null || (canvasVideoData = bVar.bo) == null) {
            list2 = null;
        } else {
            list2 = canvasVideoData.getSourceInfo();
        }
        if (l.a(list, list2)) {
            return true;
        }
        String str2 = cVar.W.T;
        if (cVar2 != null) {
            str = cVar2.W.T;
        }
        if (l.a((Object) str2, (Object) str)) {
            return true;
        }
        return false;
    }
}
