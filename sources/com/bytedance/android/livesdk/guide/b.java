package com.bytedance.android.livesdk.guide;

import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideWattingDurationSetting;
import com.bytedance.android.livesdk.model.message.w;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.concurrent.TimeUnit;

public final class b implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    DataChannel f18097a;

    /* renamed from: b  reason: collision with root package name */
    IMessageManager f18098b;

    /* renamed from: c  reason: collision with root package name */
    a f18099c;

    /* renamed from: d  reason: collision with root package name */
    public long f18100d;

    /* renamed from: e  reason: collision with root package name */
    public w f18101e;

    /* renamed from: f  reason: collision with root package name */
    f.a.b.b f18102f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f18103g;

    /* renamed from: h  reason: collision with root package name */
    f.a.b.a f18104h = new f.a.b.a();

    /* renamed from: i  reason: collision with root package name */
    private boolean f18105i;

    public interface a {
        static {
            Covode.recordClassIndex(10035);
        }

        void a(long j2, com.bytedance.android.livesdk.model.message.c.b bVar);

        void a(com.bytedance.android.livesdk.model.message.c.b bVar);
    }

    static {
        Covode.recordClassIndex(10034);
    }

    public final void a() {
        Object obj;
        long j2;
        com.bytedance.android.livesdk.model.message.c.b bVar;
        a aVar;
        com.bytedance.android.livesdk.model.message.c.b bVar2;
        if (!this.f18103g) {
            if (!this.f18105i) {
                DataChannel dataChannel = this.f18097a;
                if (dataChannel != null) {
                    obj = dataChannel.b(ee.class);
                } else {
                    obj = null;
                }
                if (!l.a(obj, (Object) true)) {
                    w wVar = this.f18101e;
                    if (wVar == null || wVar.f19699g) {
                        if (LiveGiftGuideSetting.INSTANCE.getValue() == 2 || LiveGiftGuideSetting.INSTANCE.getValue() == 3) {
                            GiftManager inst = GiftManager.inst();
                            w wVar2 = this.f18101e;
                            long j3 = 0;
                            if (wVar2 != null) {
                                j2 = wVar2.f19698f;
                            } else {
                                j2 = 0;
                            }
                            if (inst.findGiftById(j2) != null) {
                                a aVar2 = this.f18099c;
                                if (aVar2 != null) {
                                    w wVar3 = this.f18101e;
                                    if (wVar3 != null) {
                                        j3 = wVar3.f19698f;
                                    }
                                    w wVar4 = this.f18101e;
                                    if (wVar4 != null) {
                                        bVar = wVar4.f19697a;
                                    } else {
                                        bVar = null;
                                    }
                                    aVar2.a(j3, bVar);
                                }
                            } else {
                                return;
                            }
                        }
                    } else if ((LiveGiftGuideSetting.INSTANCE.getValue() == 1 || LiveGiftGuideSetting.INSTANCE.getValue() == 3) && (aVar = this.f18099c) != null) {
                        w wVar5 = this.f18101e;
                        if (wVar5 != null) {
                            bVar2 = wVar5.f19697a;
                        } else {
                            bVar2 = null;
                        }
                        aVar.a(bVar2);
                    }
                    this.f18105i = true;
                    this.f18101e = null;
                    return;
                }
            }
            this.f18101e = null;
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18107a;

        static {
            Covode.recordClassIndex(10038);
        }

        d(b bVar) {
            this.f18107a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18107a.a();
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18108a;

        static {
            Covode.recordClassIndex(10039);
        }

        e(b bVar) {
            this.f18108a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18108a.a();
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(10037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.f18103g = true;
            } else {
                this.this$0.f18103g = false;
                if (this.this$0.f18101e != null) {
                    this.this$0.a();
                }
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.guide.b$b  reason: collision with other inner class name */
    static final class C0379b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f18106a;

        static {
            Covode.recordClassIndex(10036);
        }

        C0379b(b bVar) {
            this.f18106a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f18106a.f18100d = com.bytedance.android.livesdk.utils.a.a.a();
            if (this.f18106a.f18101e != null) {
                b bVar = this.f18106a;
                f.a.b.b bVar2 = bVar.f18102f;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                bVar.f18102f = t.b((long) LiveGuideWattingDurationSetting.INSTANCE.getValue(), TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new d(bVar));
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof w) {
            this.f18101e = (w) iMessage;
            if (com.bytedance.android.livesdk.utils.a.a.a() - this.f18100d > ((long) LiveGuideWattingDurationSetting.INSTANCE.getValue()) * 1000) {
                a();
                return;
            }
            f.a.b.b bVar = this.f18102f;
            if (bVar != null) {
                bVar.dispose();
            }
            long value = (((long) (LiveGuideWattingDurationSetting.INSTANCE.getValue() * 1000)) + this.f18100d) - com.bytedance.android.livesdk.utils.a.a.a();
            if (value <= 0) {
                a();
            } else {
                this.f18102f = t.b(value, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new e(this));
            }
        }
    }
}
