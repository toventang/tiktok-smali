package com.ss.android.ugc.aweme.views.mention;

import android.text.Editable;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    private final Editable f144660a;

    static {
        Covode.recordClassIndex(94646);
    }

    a(Editable editable) {
        this.f144660a = editable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Editable editable = this.f144660a;
        return editable.getSpanStart(obj) - editable.getSpanStart(obj2);
    }
}
