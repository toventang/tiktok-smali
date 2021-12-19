package com.ss.android.ugc.aweme.shortvideo.view;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private final Editable f132663a;

    static {
        Covode.recordClassIndex(86798);
    }

    m(Editable editable) {
        this.f132663a = editable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Editable editable = this.f132663a;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }
}
