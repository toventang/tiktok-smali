package com.ss.android.ugc.aweme.comment.ui;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    private final Set f72818a;

    static {
        Covode.recordClassIndex(44851);
    }

    t(Set set) {
        this.f72818a = set;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return !this.f72818a.contains(((Map.Entry) obj).getKey());
    }
}
