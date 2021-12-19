package com.ss.android.ugc.aweme.sticker.view.internal.main;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.a.b;
import com.ss.android.ugc.tools.view.style.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class c implements b<j, Fragment> {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, com.ss.android.ugc.aweme.sticker.view.a.a<j, Fragment>> f136286a;

    /* renamed from: b  reason: collision with root package name */
    private final h f136287b;

    static {
        Covode.recordClassIndex(89013);
    }

    static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.sticker.view.a.a<? extends j, ? extends Fragment>> {
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.a.a $defaultCategoryView = null;

        static {
            Covode.recordClassIndex(89014);
        }

        a(com.ss.android.ugc.aweme.sticker.view.a.a aVar) {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.sticker.view.a.a<? extends j, ? extends Fragment> invoke() {
            com.ss.android.ugc.aweme.sticker.view.a.a aVar = this.$defaultCategoryView;
            if (aVar == null) {
                return new com.ss.android.ugc.aweme.sticker.view.internal.pager.b.a();
            }
            return aVar;
        }
    }

    private c() {
        this.f136286a = new HashMap<>();
        this.f136287b = i.a((h.f.a.a) new a(null));
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.b
    public final com.ss.android.ugc.aweme.sticker.view.a.a<j, Fragment> a(String str) {
        com.ss.android.ugc.aweme.sticker.view.a.a<j, Fragment> aVar = this.f136286a.get(str);
        if (aVar == null) {
            return (com.ss.android.ugc.aweme.sticker.view.a.a) this.f136287b.getValue();
        }
        return aVar;
    }

    public final void a(String str, com.ss.android.ugc.aweme.sticker.view.a.a<j, ? extends Fragment> aVar) {
        l.d(str, "");
        l.d(aVar, "");
        this.f136286a.put(str, aVar);
    }
}
