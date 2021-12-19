package com.ss.android.ugc.aweme.keyword;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import h.f.b.m;
import h.h;
import h.i;

public final class SearchKeywordViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f105229a = i.a((h.f.a.a) a.f105230a);

    static {
        Covode.recordClassIndex(67456);
    }

    public final NextLiveData<b> a() {
        return (NextLiveData) this.f105229a.getValue();
    }

    static final class a extends m implements h.f.a.a<NextLiveData<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f105230a = new a();

        static {
            Covode.recordClassIndex(67457);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<b> invoke() {
            return new NextLiveData();
        }
    }
}
