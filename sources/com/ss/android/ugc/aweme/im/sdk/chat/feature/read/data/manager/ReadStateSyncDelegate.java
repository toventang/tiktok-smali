package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.manager;

import android.os.Message;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import h.a.i;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ReadStateSyncDelegate extends AbsReadStateDelegate {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer[] f100927a = {1, 1001, 1002, 1005};

    /* renamed from: b  reason: collision with root package name */
    public static final a f100928b = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private boolean f100929d;

    public static final class a {
        static {
            Covode.recordClassIndex(64564);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    public final void onResume() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onResume");
        this.f100929d = true;
        a(true);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate, com.ss.android.ugc.aweme.im.sdk.chat.ui.b.a
    public final void onStop() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onStop");
        this.f100929d = false;
    }

    static {
        Covode.recordClassIndex(64563);
    }

    private final void d() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "applySyncStrategyB");
        com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value = this.f100938c.c().getValue();
        if (value != null && value.b()) {
            sendEmptyMessageDelayed(1, 200);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate
    public final void a() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onMessageInComing");
        if (this.f100938c.f100947b.isGroupChat()) {
            d();
            return;
        }
        this.f100938c.a((ai) null);
        a a2 = this.f100938c.a();
        if (a2 != null) {
            a2.a();
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "applySyncStrategyA");
        com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value = this.f100938c.c().getValue();
        if (value != null && value.b()) {
            sendEmptyMessageDelayed(0, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.AbsReadStateDelegate
    public final void bA_() {
        Object obj;
        a a2;
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onDataChanged");
        if (!this.f100938c.b().isEmpty()) {
            if (!this.f100938c.f100947b.isGroupChat() && (a2 = this.f100938c.a()) != null) {
                boolean z = !this.f100938c.b().get(0).isSelf();
                com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateReporter", "reportMessageReplyOnce: " + a2.f100935c);
                if (!a2.f100935c && z) {
                    a2.a("replied");
                }
                a2.f100935c = true;
            }
            List<ai> b2 = this.f100938c.b();
            ArrayList arrayList = new ArrayList();
            for (T t : b2) {
                T t2 = t;
                if (t2 != null && !i.a(f100927a, Integer.valueOf(t2.getMsgType()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ai aiVar = (ai) obj;
                if (aiVar.isSelf() && !aiVar.isDeleted()) {
                    break;
                }
            }
            ai aiVar2 = (ai) obj;
            if (aiVar2 != null) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a aVar = this.f100938c;
                if (aVar.f100947b.isGroupChat() || arrayList2.indexOf(aiVar2) == 0) {
                    com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onDataChanged, lastSent: " + aiVar2.getMsgId() + " --- last: " + ((ai) n.g((List) this.f100938c.b())).getMsgId());
                    if (a(aiVar2) && this.f100938c.a(aiVar2)) {
                        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onDataChanged, update");
                        d();
                        c();
                    }
                } else if (aVar.c().getValue() != null) {
                    aVar.a((ai) null);
                    a a3 = this.f100938c.a();
                    if (a3 != null) {
                        a3.a();
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReadStateSyncDelegate(com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public static boolean a(ai aiVar) {
        if ((aiVar.getMsgId() <= 0 || aiVar.getMsgStatus() != 2) && aiVar.getMsgStatus() != 5) {
            return false;
        }
        return true;
    }

    private static boolean b(ai aiVar) {
        return l.a((Object) "1", (Object) aiVar.getExt().get("visible_code"));
    }

    public final void handleMessage(Message message) {
        l.d(message, "");
        int i2 = message.what;
        if (i2 == 0) {
            removeMessages(0);
            a(true);
        } else if (i2 == 1) {
            removeMessages(1);
            a(false);
        }
    }

    public final class b implements com.bytedance.im.core.a.a.b<Pair<List<? extends Long>, List<? extends Long>>> {

        /* renamed from: a  reason: collision with root package name */
        public final ai f100930a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadStateSyncDelegate f100931b;

        static {
            Covode.recordClassIndex(64565);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            Integer num;
            StringBuilder sb = new StringBuilder("onFailure: error={");
            String str = null;
            if (uVar != null) {
                num = Integer.valueOf(uVar.f38023a);
            } else {
                num = null;
            }
            StringBuilder append = sb.append(num).append(", ");
            if (uVar != null) {
                str = uVar.f38025c;
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", append.append(str).append('}').toString());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(Pair<List<? extends Long>, List<? extends Long>> pair) {
            Pair<List<? extends Long>, List<? extends Long>> pair2 = pair;
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "onSuccess: spot: " + this.f100931b.f100938c.c().getValue() + ", message: " + this.f100930a.getMsgId() + ", result: " + pair2);
            this.f100931b.c();
            if (pair2 != null) {
                Collection collection = (Collection) pair2.second;
                int i2 = 0;
                if (collection != null && !collection.isEmpty()) {
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a aVar = this.f100931b.f100938c;
                    ai aiVar = this.f100930a;
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value = aVar.c().getValue();
                    if (value != null && l.a(aiVar, value.f100920b)) {
                        Collection collection2 = (Collection) pair2.first;
                        if (collection2 == null || collection2.isEmpty()) {
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.a aVar2 = this.f100931b.f100938c;
                            if (!ReadStateSyncDelegate.a(this.f100930a)) {
                                i2 = -1;
                            }
                            aVar2.a(i2);
                            return;
                        }
                        List list = (List) pair2.first;
                        if (list != null) {
                            int size = list.size();
                            Object obj = pair2.second;
                            if (obj == null) {
                                l.b();
                            }
                            if (size == ((List) obj).size()) {
                                this.f100931b.f100938c.a(2);
                            }
                        }
                    }
                }
            }
        }

        public b(ReadStateSyncDelegate readStateSyncDelegate, ai aiVar) {
            l.d(aiVar, "");
            this.f100931b = readStateSyncDelegate;
            this.f100930a = aiVar;
        }
    }

    private final void a(boolean z) {
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "startSyncReadReal: " + this.f100929d + ", " + z);
        if (ReadStateViewModel.f100939b && this.f100938c.f100947b.getSelectMsgType() != 1) {
            if (this.f100938c.d() != null) {
                h d2 = this.f100938c.d();
                if (d2 == null) {
                    l.b();
                }
                if (d2.isMember()) {
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.read.data.a value = this.f100938c.c().getValue();
                    if (value != null && this.f100929d && value.b()) {
                        if (b(value.f100920b)) {
                            this.f100938c.a(3);
                            return;
                        } else {
                            this.f100938c.f100946a.a(value.f100920b, z, new b(this, value.f100920b));
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateSyncDelegate", "startSyncReadReal: has leave group chat");
        }
    }
}
