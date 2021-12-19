package com.ss.android.ugc.aweme.keyword;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import h.f.b.m;
import h.h;
import h.i;

public final class SugKeywordViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f105231a = i.a((h.f.a.a) a.f105232a);

    static {
        Covode.recordClassIndex(67458);
    }

    public final NextLiveData<String> a() {
        return (NextLiveData) this.f105231a.getValue();
    }

    static final class a extends m implements h.f.a.a<NextLiveData<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f105232a = new a();

        static {
            Covode.recordClassIndex(67459);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<String> invoke() {
            return new NextLiveData();
        }
    }
}
