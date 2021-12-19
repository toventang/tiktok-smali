package com.ss.android.ugc.aweme.app;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.f;
import com.ss.android.ugc.aweme.commercialize.depend.g;
import com.ss.android.ugc.aweme.commercialize.depend.p;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.b;
import h.f.b.m;
import h.h;
import h.i;

public final class r implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final r f66864a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final h f66865b = i.a((h.f.a.a) a.f66866a);

    static SparseArray<com.ss.android.ugc.aweme.commercialize_ad_api.a.a> a() {
        return (SparseArray) f66865b.getValue();
    }

    private r() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.a.b
    public final SparseArray<com.ss.android.ugc.aweme.commercialize_ad_api.a.a> b() {
        return a();
    }

    static {
        Covode.recordClassIndex(41174);
    }

    static final class a extends m implements h.f.a.a<SparseArray<com.ss.android.ugc.aweme.commercialize_ad_api.a.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66866a = new a();

        static {
            Covode.recordClassIndex(41175);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SparseArray<com.ss.android.ugc.aweme.commercialize_ad_api.a.a> invoke() {
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(4, new f());
            sparseArray.put(5, new AdCommentDependImpl());
            sparseArray.put(17, new p());
            sparseArray.put(19, new g());
            return sparseArray;
        }
    }
}
