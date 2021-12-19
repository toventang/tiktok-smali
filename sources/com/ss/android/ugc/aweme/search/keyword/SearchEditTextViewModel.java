package com.ss.android.ugc.aweme.search.keyword;

import android.widget.EditText;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import h.f.b.m;
import h.h;
import h.i;

public final class SearchEditTextViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f121295a = i.a((h.f.a.a) a.f121296a);

    static {
        Covode.recordClassIndex(79059);
    }

    public final NextLiveData<EditText> a() {
        return (NextLiveData) this.f121295a.getValue();
    }

    static final class a extends m implements h.f.a.a<NextLiveData<EditText>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121296a = new a();

        static {
            Covode.recordClassIndex(79060);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<EditText> invoke() {
            return new NextLiveData();
        }
    }
}
