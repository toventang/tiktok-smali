package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<TextStickerTextWrap> f88420a;

    /* renamed from: b  reason: collision with root package name */
    public final String f88421b;

    static {
        Covode.recordClassIndex(55646);
    }

    public final int hashCode() {
        List<TextStickerTextWrap> list = this.f88420a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f88421b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EffectTextChangeInfo(textWrapList=" + this.f88420a + ", effectTextId=" + this.f88421b + ")";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (l.a((Object) cVar.f88421b, (Object) this.f88421b)) {
                List<TextStickerTextWrap> list = cVar.f88420a;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().safeStrPair());
                }
                List<TextStickerTextWrap> list2 = this.f88420a;
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().safeStrPair());
                }
                if (l.a(arrayList, arrayList2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public c(List<TextStickerTextWrap> list, String str) {
        l.d(list, "");
        this.f88420a = list;
        this.f88421b = str;
    }
}
