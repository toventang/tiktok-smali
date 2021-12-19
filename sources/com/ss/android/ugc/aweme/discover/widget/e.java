package com.ss.android.ugc.aweme.discover.widget;

import android.widget.ScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.ies.dmt.ui.widget.g;
import h.f.b.l;

public final class e extends ScrollView implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82866a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.discover.ui.d.a f82867b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.ies.dmt.ui.widget.e f82868c;

    /* renamed from: d  reason: collision with root package name */
    private d f82869d;

    /* renamed from: e  reason: collision with root package name */
    private final int f82870e;

    static {
        Covode.recordClassIndex(51633);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51634);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getPageIndex() {
        return this.f82870e;
    }

    public final com.ss.android.ugc.aweme.discover.ui.d.a getSearchStatusName() {
        return this.f82867b;
    }

    public final void setSearchStatusName(com.ss.android.ugc.aweme.discover.ui.d.a aVar) {
        this.f82867b = aVar;
    }

    @Override // com.bytedance.ies.dmt.ui.widget.g
    public final void setStatus(d dVar) {
        l.d(dVar, "");
        com.bytedance.ies.dmt.ui.widget.e eVar = this.f82868c;
        if (eVar == null) {
            l.a("emptyDefaultView");
        }
        eVar.setStatus(dVar);
        this.f82869d = dVar;
    }
}
