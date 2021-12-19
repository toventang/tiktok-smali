package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.chatroom.api.DecorationApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.livesetting.decoration.StickerAudienceEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.DecoTextModifyFrequencySetting;
import com.bytedance.android.livesdk.model.DecorationTextAuditResult;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.model.m;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdk.model.message.cf;
import com.bytedance.android.livesdk.model.message.o;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class l extends r<a> implements WeakHandler.IHandler, OnMessageListener {

    /* renamed from: e  reason: collision with root package name */
    private static final String f15365e = l.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public WeakHandler f15366a = new WeakHandler(this);

    /* renamed from: b  reason: collision with root package name */
    public long f15367b;

    /* renamed from: c  reason: collision with root package name */
    public String f15368c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15369d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15370f;

    /* renamed from: g  reason: collision with root package name */
    private long f15371g;

    /* renamed from: h  reason: collision with root package name */
    private String f15372h;

    /* renamed from: i  reason: collision with root package name */
    private int f15373i = DecoTextModifyFrequencySetting.INSTANCE.getValue();

    /* renamed from: j  reason: collision with root package name */
    private int f15374j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15375k = true;

    public interface a extends bq {
        static {
            Covode.recordClassIndex(8493);
        }

        void a();

        void a(av avVar);

        void a(String str);

        void a(List<av> list);

        void b();

        void b(String str);

        void c();
    }

    static {
        Covode.recordClassIndex(8491);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.l$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f15376a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 8492(0x212c, float:1.19E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.model.message.a.a[] r0 = com.bytedance.android.livesdk.model.message.a.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.chatroom.e.l.AnonymousClass1.f15376a = r2
                com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.a.a.REMIND     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.chatroom.e.l.AnonymousClass1.f15376a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.a.a.MODIFY_DECORATION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.chatroom.e.l.AnonymousClass1.f15376a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.a.a.MODIFY_STICKER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.e.l.AnonymousClass1.<clinit>():void");
        }
    }

    public final boolean a() {
        if (this.f15374j < this.f15373i) {
            return true;
        }
        return false;
    }

    static String a(int i2) {
        Context context = ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).context();
        if (context == null) {
            return "";
        }
        String string = context.getString(i2);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return string;
    }

    public final String a(av avVar) {
        if (!TextUtils.isEmpty(this.f15372h)) {
            return this.f15372h;
        }
        if (avVar != null) {
            return avVar.f19002d;
        }
        return "";
    }

    public final void a(a aVar) {
        super.a((bq) aVar);
        if (this.x != null) {
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MODIFY_DECORATION.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MODIFY_STICKER.getIntType(), this);
            this.x.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.REMIND.getIntType(), this);
        }
        boolean z = this.f15370f;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && this.y != null) {
            if (26 == message.what) {
                this.f15369d = false;
            }
            if (26 != message.what) {
                return;
            }
            if (message.obj instanceof DecorationTextAuditResult) {
                DecorationTextAuditResult decorationTextAuditResult = (DecorationTextAuditResult) message.obj;
                if (this.y != null && decorationTextAuditResult != null) {
                    if (31 == decorationTextAuditResult.getAuditStatus()) {
                        this.f15372h = "";
                        c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.aF, (Object) 31);
                        c.a(com.bytedance.android.livesdk.ap.a.aE, "");
                        ((a) this.y).b();
                        String auditNotPassWarnText = decorationTextAuditResult.getAuditNotPassWarnText();
                        if (TextUtils.isEmpty(auditNotPassWarnText)) {
                            auditNotPassWarnText = a((int) R.string.gmx);
                        }
                        ((a) this.y).a(auditNotPassWarnText);
                        this.f15375k = true;
                        return;
                    }
                    if (this.f15375k) {
                        this.f15374j++;
                        this.f15372h = this.f15368c;
                        ((a) this.y).b(this.f15372h);
                        ((a) this.y).a();
                    } else {
                        this.f15375k = true;
                    }
                    c.a(com.bytedance.android.livesdk.ap.a.aF, Integer.valueOf(decorationTextAuditResult.getAuditStatus()));
                    c.a(com.bytedance.android.livesdk.ap.a.aE, this.f15372h);
                }
            } else if (message.obj instanceof com.bytedance.android.live.a.a.b.a) {
                ((a) this.y).a(((com.bytedance.android.live.a.a.b.a) message.obj).getPrompt());
            } else {
                ((a) this.y).a(a((int) R.string.gmy));
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        ArrayList arrayList;
        int i2 = AnonymousClass1.f15376a[((com.bytedance.android.livesdkapi.h.a) iMessage).L.ordinal()];
        if (i2 == 1) {
            bv bvVar = (bv) iMessage;
            if (bvVar.f19368f == 1 && this.y != null) {
                this.f15372h = "";
                c.a((com.bytedance.android.livesdk.ao.c) com.bytedance.android.livesdk.ap.a.aF, (Object) 31);
                c.a(com.bytedance.android.livesdk.ap.a.aE, "");
                ((a) this.y).b();
                ((a) this.y).a(bvVar.f19367a);
            }
        } else if (i2 != 2) {
            if (i2 == 3 && this.y != null && StickerAudienceEnableSetting.INSTANCE.getValue() == 1) {
                cf cfVar = (cf) iMessage;
                if (b.a((Collection) cfVar.f19476a)) {
                    ((a) this.y).c();
                } else {
                    ((a) this.y).a(cfVar.f19476a.get(0));
                }
            }
        } else if (this.y != null) {
            a aVar = (a) this.y;
            List<m> list = ((o) iMessage).f19664a;
            if (list == null || list.size() == 0) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                for (m mVar : list) {
                    arrayList.add(mVar.a());
                }
            }
            aVar.a(arrayList);
        }
    }

    public final void a(HashMap<String, String> hashMap, int i2) {
        ((DecorationApi) e.a().a(DecorationApi.class)).setDecoration(this.f15367b, i2, hashMap).a(new f()).a(i.f22197b, new m(this));
    }

    public l(long j2, long j3, boolean z) {
        this.f15367b = j2;
        this.f15371g = j3;
        this.f15370f = z;
    }
}
