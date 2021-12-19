package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.e;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f100946a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a f100947b;

    /* renamed from: c  reason: collision with root package name */
    private final h f100948c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f100949d = i.a((h.f.a.a) C2504a.f100951a);

    /* renamed from: e  reason: collision with root package name */
    private final h f100950e = i.a((h.f.a.a) c.f100952a);

    static {
        Covode.recordClassIndex(64574);
    }

    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a a() {
        return (com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a) this.f100948c.getValue();
    }

    public final List<ai> b() {
        return (List) this.f100949d.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a> c() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f100950e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a$a  reason: collision with other inner class name */
    static final class C2504a extends m implements h.f.a.a<List<ai>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2504a f100951a = new C2504a();

        static {
            Covode.recordClassIndex(64575);
        }

        C2504a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<ai> invoke() {
            return new ArrayList();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100952a = new c();

        static {
            Covode.recordClassIndex(64577);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a invoke() {
            com.bytedance.im.core.d.h d2 = this.this$0.d();
            if (d2 != null) {
                return new com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a(d2);
            }
            return null;
        }
    }

    public final com.bytedance.im.core.d.h d() {
        return a.C0745a.a().a(this.f100947b.getConversationId());
    }

    public final boolean a(ai aiVar) {
        if (aiVar == null) {
            c().setValue(null);
            return true;
        }
        if (c().getValue() != null) {
            com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value = c().getValue();
            if (value == null) {
                l.b();
            }
            if (l.a(aiVar, value.f100920b)) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value2 = c().getValue();
                if (value2 == null) {
                    l.b();
                }
                value2.a(aiVar);
                return false;
            }
        }
        c().setValue(new com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a(aiVar, this.f100947b));
        return true;
    }

    public final void a(int i2) {
        int i3;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value = c().getValue();
        if (value != null) {
            value.f100919a = i2;
            value.a().clear();
            c().setValue(c().getValue());
            com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager.a a2 = a();
            if (a2 != null) {
                ai aiVar = value.f100920b;
                String str = "";
                l.d(aiVar, str);
                if (i2 == -1) {
                    com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateReporter", "reportReadState state non");
                    return;
                }
                if (!a2.f100936d.isGroupChat() || i2 != 1) {
                    i3 = i2;
                } else {
                    i3 = 2;
                }
                if (!l.a(a2.f100933a, aiVar) || a2.f100934b != i3) {
                    a2.f100933a = aiVar;
                    a2.f100934b = i3;
                    if (i3 == 0) {
                        str = "send";
                    } else if (i3 != 2) {
                        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateReporter", "reportReadState invalid read state: " + i3 + ", " + i2);
                    } else {
                        str = "read";
                    }
                    a2.a(str);
                    return;
                }
                com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateReporter", "reportReadState state same to last: " + i3 + ", " + i2);
            }
        }
    }

    public a(e eVar, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        l.d(eVar, "");
        l.d(aVar, "");
        this.f100946a = eVar;
        this.f100947b = aVar;
    }
}
