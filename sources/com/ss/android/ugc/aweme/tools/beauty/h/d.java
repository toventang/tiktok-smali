package com.ss.android.ugc.aweme.tools.beauty.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class d implements f.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f139016a = i.a((h.f.a.a) a.f139018a);

    /* renamed from: b  reason: collision with root package name */
    private final f.a f139017b;

    static {
        Covode.recordClassIndex(90931);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a() {
        this.f139017b.a();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(String str, String str2, float f2) {
        l.d(str, "");
        l.d(str2, "");
        this.f139017b.a(str, str2, f2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(List<BeautyComposerInfo> list, int i2) {
        l.d(list, "");
        this.f139017b.a(list, i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i2) {
        l.d(list, "");
        l.d(list2, "");
        this.f139017b.a(list, list2, i2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void a(boolean z) {
        this.f139017b.a(z);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final int[] a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return this.f139017b.a(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.a
    public final void b() {
        this.f139017b.b();
    }

    static final class a extends m implements h.f.a.a<AVPreferences> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f139018a = new a();

        static {
            Covode.recordClassIndex(90932);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AVPreferences invoke() {
            return g.a().e();
        }
    }

    public d(f.a aVar) {
        l.d(aVar, "");
        this.f139017b = aVar;
    }
}
