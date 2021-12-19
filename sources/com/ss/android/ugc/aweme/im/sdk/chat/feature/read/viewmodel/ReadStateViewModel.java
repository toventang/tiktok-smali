package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.an;
import com.bytedance.im.core.d.ar;
import com.bytedance.im.core.d.ay;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateMarkDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.ReadStateSyncDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class ReadStateViewModel extends ac implements com.bytedance.ies.im.core.api.b.a.d, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a, b.a, com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f100939b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final a f100940c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f100941a;

    /* renamed from: d  reason: collision with root package name */
    private final h f100942d = i.a((h.f.a.a) b.f100945a);

    /* renamed from: e  reason: collision with root package name */
    private final h f100943e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f100944f = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(64569);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, ai aiVar, ay ayVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(int i2, an anVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, Map map, Map map2) {
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(ai aiVar, boolean z) {
    }

    public final ReadStateMarkDelegate b() {
        return (ReadStateMarkDelegate) this.f100943e.getValue();
    }

    public final ReadStateSyncDelegate c() {
        return (ReadStateSyncDelegate) this.f100944f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64570);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        a.C2516a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        a.C2516a.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        a.C2516a.onResume(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_START)
    public final void onStart() {
        a.C2516a.onStart(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    @v(a = i.a.ON_STOP)
    public final void onStop() {
        a.C2516a.onStop(this);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, Map<String, Map<String, String>> map) {
        Integer num = null;
        StringBuilder append = new StringBuilder("onUpdateMessage: ").append(list != null ? Integer.valueOf(list.size()) : null).append("  && ");
        if (map != null) {
            num = Integer.valueOf(map.size());
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", append.append(num).toString());
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, boolean z) {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", "onLoadOlder: " + (list != null ? Integer.valueOf(list.size()) : null));
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100945a = new b();

        static {
            Covode.recordClassIndex(64571);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class c extends m implements h.f.a.a<ReadStateMarkDelegate> {
        final /* synthetic */ ReadStateViewModel this$0;

        static {
            Covode.recordClassIndex(64572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ReadStateViewModel readStateViewModel) {
            super(0);
            this.this$0 = readStateViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReadStateMarkDelegate invoke() {
            return new ReadStateMarkDelegate(this.this$0.f100941a);
        }
    }

    static final class d extends m implements h.f.a.a<ReadStateSyncDelegate> {
        final /* synthetic */ ReadStateViewModel this$0;

        static {
            Covode.recordClassIndex(64573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ReadStateViewModel readStateViewModel) {
            super(0);
            this.this$0 = readStateViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ReadStateSyncDelegate invoke() {
            return new ReadStateSyncDelegate(this.this$0.f100941a);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b.a
    public final void a() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", "onInputting");
        ReadStateMarkDelegate b2 = b();
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "onInputting");
        b2.b();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a.a
    public final void e() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", "onNewestMessageVisible");
        ReadStateMarkDelegate b2 = b();
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateMarkDelegate", "onNewestMessageVisible");
        b2.b();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    public final void onDestroy() {
        com.bytedance.ies.im.core.api.b.a().b(this.f100941a.f100946a.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.a.a
    public final void a(List<ai> list) {
        StringBuilder sb = new StringBuilder("onDataChanged: ");
        Integer num = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", sb.append(num).toString());
        if (list != null && !list.isEmpty()) {
            this.f100941a.b().clear();
            n.a((Iterable) list, (Collection) this.f100941a.b());
            b().bA_();
            c().bA_();
        }
    }

    public ReadStateViewModel(e eVar, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        this.f100941a = new a(eVar, aVar);
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void b(List<ai> list, boolean z) {
        Integer num;
        StringBuilder sb = new StringBuilder("onLoadNewer: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", sb.append(num).toString());
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, ar arVar) {
        Integer num;
        l.d(arVar, "");
        StringBuilder sb = new StringBuilder("onGetMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", sb.append(num).append(' ').append(i2).append("  ").append(arVar).toString());
        b().a();
        c().a();
    }

    @Override // com.bytedance.ies.im.core.api.b.a.d, com.bytedance.im.core.d.v
    public final void a(List<ai> list, int i2, String str) {
        Integer num;
        StringBuilder sb = new StringBuilder("onQueryMessage: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", sb.append(num).toString());
    }
}
