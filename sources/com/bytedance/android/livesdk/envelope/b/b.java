package com.bytedance.android.livesdk.envelope.b;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.envelope.api.RedEnvelopeApi;
import com.bytedance.android.livesdk.gift.d.g;
import com.bytedance.android.livesdk.gift.d.j;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xbridge.n;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f17156f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Set<com.bytedance.android.livesdk.model.message.e.b> f17157a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f17158b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.envelope.widget.a f17159c;

    /* renamed from: d  reason: collision with root package name */
    String f17160d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17161e;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f17162g;

    /* renamed from: h  reason: collision with root package name */
    private Room f17163h;

    /* renamed from: i  reason: collision with root package name */
    private final OnMessageListener f17164i = new e(this);

    /* renamed from: j  reason: collision with root package name */
    private final C0359b f17165j = new C0359b(this);

    static {
        Covode.recordClassIndex(9520);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9521);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final Room d() {
        return this.f17163h;
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final String e() {
        return this.f17160d;
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final boolean c() {
        return f();
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final boolean b() {
        Boolean bool = this.f17162g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean f() {
        String str = this.f17160d;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final void a() {
        IMessageManager iMessageManager;
        this.f17159c = null;
        DataChannel dataChannel = this.f17158b;
        if (!(dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) == null)) {
            iMessageManager.removeMessageListener(this.f17164i);
        }
        com.bytedance.ies.xbridge.e.b.b("liveGoldenEnvelopeCreate", this.f17165j);
        com.bytedance.ies.xbridge.e.b.b("liveGoldenEnvelopCloseAll", this.f17165j);
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$b  reason: collision with other inner class name */
    public static final class C0359b implements com.bytedance.ies.xbridge.e.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f17166a;

        static {
            Covode.recordClassIndex(9522);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0359b(b bVar) {
            this.f17166a = bVar;
        }

        @Override // com.bytedance.ies.xbridge.e.d
        public final void a(com.bytedance.ies.xbridge.e.c cVar) {
            boolean z;
            Map<String, Object> b2;
            l.d(cVar, "");
            b bVar = this.f17166a;
            String str = cVar.f35926a;
            int hashCode = str.hashCode();
            if (hashCode != -1091071735) {
                if (hashCode == -126454431 && str.equals("liveGoldenEnvelopeCreate")) {
                    com.bytedance.android.live.core.c.a.a(3, "RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopeCreate");
                    n nVar = cVar.f35927b;
                    if (nVar != null && (b2 = nVar.b()) != null) {
                        com.google.gson.f fVar = e.a.f9628b;
                        com.bytedance.android.livesdk.model.message.e.b bVar2 = (com.bytedance.android.livesdk.model.message.e.b) fVar.a(fVar.b(b2), com.bytedance.android.livesdk.model.message.e.b.class);
                        l.b(bVar2, "");
                        String a2 = bVar.a(bVar2);
                        if (a2 != null) {
                            bVar.b(a2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (str.equals("liveGoldenEnvelopCloseAll")) {
                com.bytedance.android.live.core.c.a.a(3, "RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopCloseAll");
                bVar.f17160d = null;
                String str2 = bVar.f17160d;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.f17161e = !z;
                return;
            }
            com.bytedance.android.live.core.c.a.a(6, "RedEnvelopePresenter", "handleEvent: unknown event->" + cVar.f35926a);
        }
    }

    public final void b(String str) {
        com.bytedance.android.livesdk.envelope.widget.a aVar = this.f17159c;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f17168a = new d();

        static {
            Covode.recordClassIndex(9524);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.core.c.a.a(6, "RedEnvelopePresenter", "err stack: ".concat(String.valueOf(obj)));
        }
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final void a(String str) {
        boolean z;
        l.d(str, "");
        this.f17160d = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f17161e = !z;
    }

    static final class f extends m implements h.f.a.b<j, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(9526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j jVar) {
            j jVar2 = jVar;
            l.d(jVar2, "");
            com.bytedance.android.livesdk.envelope.widget.a aVar = this.this$0.f17159c;
            if (aVar != null) {
                aVar.a(jVar2);
            }
            DataChannel dataChannel = this.this$0.f17158b;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.gift.e.class, true);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(com.bytedance.android.livesdk.model.message.e.b bVar) {
        boolean z;
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        com.bytedance.android.livesdk.envelope.a.b bVar2 = null;
        if (z || bVar.f19615a == null) {
            return null;
        }
        com.bytedance.android.livesdk.envelope.a.d dVar = new com.bytedance.android.livesdk.envelope.a.d();
        if (f()) {
            com.bytedance.android.livesdk.envelope.a.f[] fVarArr = new com.bytedance.android.livesdk.envelope.a.f[1];
            com.bytedance.android.livesdk.envelope.a.f fVar = new com.bytedance.android.livesdk.envelope.a.f();
            com.bytedance.android.livesdk.model.message.e.a aVar = bVar.f19615a;
            if (aVar != null) {
                bVar2 = com.bytedance.android.livesdk.envelope.a.c.a(aVar);
            }
            fVar.f17152a = bVar2;
            fVar.f17153b = bVar.f19616f;
            fVarArr[0] = fVar;
            dVar.f17149a = h.a.n.d(fVarArr);
        } else if (bVar.f19616f == 1) {
            com.bytedance.android.livesdk.envelope.a.f[] fVarArr2 = new com.bytedance.android.livesdk.envelope.a.f[1];
            com.bytedance.android.livesdk.envelope.a.f fVar2 = new com.bytedance.android.livesdk.envelope.a.f();
            com.bytedance.android.livesdk.model.message.e.a aVar2 = bVar.f19615a;
            if (aVar2 != null) {
                bVar2 = com.bytedance.android.livesdk.envelope.a.c.a(aVar2);
            }
            fVar2.f17152a = bVar2;
            fVar2.f17153b = bVar.f19616f;
            fVarArr2[0] = fVar2;
            dVar.f17149a = h.a.n.d(fVarArr2);
        } else {
            com.bytedance.android.live.core.c.a.a(6, "RedEnvelopePresenter", "wait interface");
        }
        dVar.f17150b = an.f22242a;
        return e.a.f9628b.b(dVar);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f17167a;

        static {
            Covode.recordClassIndex(9523);
        }

        c(b bVar) {
            this.f17167a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<com.bytedance.android.livesdk.envelope.a.a> list;
            com.bytedance.android.livesdk.envelope.a.b bVar;
            String str;
            List<String> urls;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            com.bytedance.android.livesdk.envelope.a.e eVar = (com.bytedance.android.livesdk.envelope.a.e) dVar.data;
            if (eVar == null || (list = eVar.f17151a) == null) {
                com.bytedance.android.live.core.c.a.a(6, "RedEnvelopePresenter", "err info: empty list");
            } else if (list.size() > 0) {
                b bVar2 = this.f17167a;
                Object obj2 = dVar.data;
                l.b(obj2, "");
                com.bytedance.android.livesdk.envelope.a.d dVar2 = new com.bytedance.android.livesdk.envelope.a.d();
                List<com.bytedance.android.livesdk.envelope.a.a> list2 = ((com.bytedance.android.livesdk.envelope.a.e) obj2).f17151a;
                if (list2 != null) {
                    for (T t : list2) {
                        List<com.bytedance.android.livesdk.envelope.a.f> list3 = dVar2.f17149a;
                        com.bytedance.android.livesdk.envelope.a.f fVar = new com.bytedance.android.livesdk.envelope.a.f();
                        l.d(t, "");
                        com.bytedance.android.livesdk.envelope.a.b bVar3 = new com.bytedance.android.livesdk.envelope.a.b();
                        bVar3.f17141b = t.f17132b;
                        bVar3.f17144e = t.f17135e;
                        bVar3.f17140a = t.f17131a;
                        bVar3.f17142c = t.f17133c;
                        bVar3.f17145f = t.f17136f;
                        bVar3.f17147h = t.f17138h;
                        bVar3.f17146g = t.f17137g;
                        bVar3.f17143d = t.f17134d;
                        ImageModel imageModel = t.f17139i;
                        if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = urls.get(0)) == null) {
                            str = "";
                        }
                        bVar3.f17148i = str;
                        fVar.f17152a = bVar3;
                        fVar.f17153b = 1;
                        list3.add(fVar);
                    }
                }
                for (T t2 : bVar2.f17157a) {
                    List<com.bytedance.android.livesdk.envelope.a.f> list4 = dVar2.f17149a;
                    com.bytedance.android.livesdk.envelope.a.f fVar2 = new com.bytedance.android.livesdk.envelope.a.f();
                    com.bytedance.android.livesdk.model.message.e.a aVar = t2.f19615a;
                    if (aVar != null) {
                        bVar = com.bytedance.android.livesdk.envelope.a.c.a(aVar);
                    } else {
                        bVar = null;
                    }
                    fVar2.f17152a = bVar;
                    fVar2.f17153b = t2.f19616f;
                    list4.add(fVar2);
                }
                bVar2.f17157a.clear();
                dVar2.f17150b = an.f22242a;
                String b2 = e.a.f9628b.b(dVar2);
                l.b(b2, "");
                bVar2.b(b2);
                this.f17167a.f17161e = true;
            } else {
                com.bytedance.android.live.core.c.a.a(6, "RedEnvelopePresenter", "err info: list size = 0");
            }
        }
    }

    static final class e implements OnMessageListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f17169a;

        static {
            Covode.recordClassIndex(9525);
        }

        e(b bVar) {
            this.f17169a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:72:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01d3  */
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r11) {
            /*
            // Method dump skipped, instructions count: 476
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.envelope.b.b.e.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
        }
    }

    @Override // com.bytedance.android.livesdk.envelope.b.a
    public final void a(DataChannel dataChannel, com.bytedance.android.livesdk.envelope.widget.a aVar) {
        IMessageManager iMessageManager;
        l.d(dataChannel, "");
        l.d(aVar, "");
        com.bytedance.android.live.core.c.a.a(3, "RedEnvelopePresenter", "attachView(" + dataChannel + ')');
        this.f17159c = aVar;
        this.f17158b = dataChannel;
        this.f17162g = (Boolean) dataChannel.b(ee.class);
        Room room = (Room) dataChannel.b(df.class);
        this.f17163h = room;
        if (room == null) {
            com.bytedance.android.live.core.c.a.a(3, "RedEnvelopePresenter", "getRedEnvelops: room info null");
        } else {
            RedEnvelopeApi redEnvelopeApi = (RedEnvelopeApi) com.bytedance.android.live.network.e.a().a(RedEnvelopeApi.class);
            Room room2 = this.f17163h;
            if (room2 == null) {
                l.b();
            }
            String idStr = room2.getIdStr();
            l.b(idStr, "");
            redEnvelopeApi.getRedEnvelopList(idStr).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new c(this), d.f17168a);
        }
        DataChannel dataChannel2 = this.f17158b;
        if (dataChannel2 != null) {
            dataChannel2.a(g.class, (h.f.a.b) new f(this));
        }
        com.bytedance.ies.xbridge.e.b.a("liveGoldenEnvelopeCreate", this.f17165j);
        com.bytedance.ies.xbridge.e.b.a("liveGoldenEnvelopCloseAll", this.f17165j);
        DataChannel dataChannel3 = this.f17158b;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.b(cg.class)) != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.RED_ENVELOPE_MESSAGE.getIntType(), this.f17164i);
        }
    }
}
