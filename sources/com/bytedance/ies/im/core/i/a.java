package com.bytedance.ies.im.core.i;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.d.e;
import com.bytedance.ies.im.core.api.j.b;
import com.bytedance.im.core.d.bd;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a implements e, com.bytedance.ies.im.core.api.j.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f34189a;

    /* renamed from: b  reason: collision with root package name */
    private static final h f34190b = i.a((h.f.a.a) C0759a.f34191a);

    private static CopyOnWriteArraySet<com.bytedance.ies.im.core.api.j.a> b() {
        return (CopyOnWriteArraySet) f34190b.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.ies.im.core.i.a$a  reason: collision with other inner class name */
    static final class C0759a extends m implements h.f.a.a<CopyOnWriteArraySet<com.bytedance.ies.im.core.api.j.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0759a f34191a = new C0759a();

        static {
            Covode.recordClassIndex(20362);
        }

        C0759a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<com.bytedance.ies.im.core.api.j.a> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    static {
        Covode.recordClassIndex(20361);
        a aVar = new a();
        f34189a = aVar;
        com.bytedance.ies.im.core.api.a.d().a(aVar);
    }

    @Override // com.bytedance.ies.im.core.api.d.e
    public final boolean a() {
        return com.bytedance.ies.im.core.api.a.d().a();
    }

    @Override // com.bytedance.ies.im.core.api.d.e
    public final void a(com.bytedance.ies.im.core.api.j.a aVar) {
        l.d(aVar, "");
        b().add(aVar);
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(b bVar) {
        l.d(bVar, "");
        com.bytedance.ies.im.core.api.a.b().b("WsBridge", "onStateChanged: ".concat(String.valueOf(bVar)));
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.e
    public final void b(WsChannelMsg wsChannelMsg) {
        l.d(wsChannelMsg, "");
        com.bytedance.ies.im.core.api.a.b().a("WsBridge", "sendMsg: " + wsChannelMsg.f27297f + ", " + wsChannelMsg.f27298g);
        com.bytedance.ies.im.core.api.a.d().b(wsChannelMsg);
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(String str) {
        com.bytedance.ies.im.core.api.a.b().b("WsBridge", "onLogConnectEvent: ".concat(String.valueOf(str)));
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(WsChannelMsg wsChannelMsg, bd bdVar) {
        l.d(wsChannelMsg, "");
        com.bytedance.ies.im.core.api.a.b().a("WsBridge", "onReceivedMsg: " + wsChannelMsg.f27297f + ", " + wsChannelMsg.f27298g);
        Iterator<T> it = b().iterator();
        while (it.hasNext()) {
            it.next().a(wsChannelMsg, bdVar);
        }
    }
}
