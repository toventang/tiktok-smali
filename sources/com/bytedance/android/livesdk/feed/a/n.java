package com.bytedance.android.livesdk.feed.a;

import androidx.lifecycle.u;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f17265a;

    static {
        Covode.recordClassIndex(9582);
    }

    n(d dVar) {
        this.f17265a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        Map<String, Long> map;
        d dVar = this.f17265a;
        if (obj == BaseFeedRepository.a.START && (map = dVar.f17230a.f17226l) != null) {
            map.size();
        }
        if (obj == BaseFeedRepository.a.SUCCESS) {
            a aVar = dVar.f17230a;
            aVar.a(aVar.f17226l, false);
            dVar.f17231b.b(0);
        }
    }
}
