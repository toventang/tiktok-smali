package com.bytedance.im.core.f.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.internal.b.a.w;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.e.a;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageDirection;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.List;

public final class d extends w<MessageBody> {

    /* renamed from: a  reason: collision with root package name */
    public String f38084a;

    /* renamed from: b  reason: collision with root package name */
    public int f38085b;

    /* renamed from: c  reason: collision with root package name */
    public long f38086c;

    /* renamed from: d  reason: collision with root package name */
    public long f38087d;

    /* renamed from: e  reason: collision with root package name */
    public long f38088e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f38089f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f38090g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f38091h;

    /* renamed from: i  reason: collision with root package name */
    public int f38092i;

    /* renamed from: j  reason: collision with root package name */
    public List<Long> f38093j;

    /* renamed from: k  reason: collision with root package name */
    private long f38094k;

    /* renamed from: l  reason: collision with root package name */
    private int f38095l;

    /* renamed from: m  reason: collision with root package name */
    private int f38096m;
    private int n;
    private int o;

    static {
        Covode.recordClassIndex(22818);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public d(b<MessageBody> bVar) {
        this(false, 0, 0, 0, 0, 0, false, false, bVar);
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar.f38725f.body == null || kVar.f38725f.body.messages_in_conversation_body == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            return;
        }
        MessagesInConversationResponseBody messagesInConversationResponseBody = kVar.f38725f.body.messages_in_conversation_body;
        final List<MessageBody> list = messagesInConversationResponseBody.messages;
        if (list == null || list.isEmpty()) {
            a((Object) null);
            return;
        }
        final boolean z = true;
        if (this.o == 0) {
            a(list.get(list.size() - 1));
        }
        int size = this.o + list.size();
        this.o = size;
        if (size < this.n && messagesInConversationResponseBody.has_more.booleanValue()) {
            a(this.f38096m, this.f38084a, this.f38094k, this.f38095l, list.get(0).index_in_conversation.longValue());
            z = false;
        }
        a.a().execute(new Runnable() {
            /* class com.bytedance.im.core.f.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22819);
            }

            /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                // Method dump skipped, instructions count: 315
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.f.a.d.AnonymousClass1.run():void");
            }
        });
    }

    public final void a(int i2, String str, long j2, int i3, long j3) {
        if (TextUtils.isEmpty(str)) {
            a(u.a(k.a(-1015)));
            return;
        }
        if (j3 < 0) {
            j3 = 0;
        }
        this.f38084a = str;
        this.f38094k = j2;
        this.f38095l = i3;
        this.f38096m = i2;
        a(i2, new RequestBody.Builder().messages_in_conversation_body(new MessagesInConversationRequestBody.Builder().conversation_id(this.f38084a).conversation_short_id(Long.valueOf(this.f38094k)).conversation_type(Integer.valueOf(this.f38095l)).direction(MessageDirection.OLDER).anchor_index(Long.valueOf(j3)).build()).build(), null, new Object[0]);
    }

    public d(boolean z, int i2, int i3, long j2, long j3, long j4, boolean z2, boolean z3, b<MessageBody> bVar) {
        super(IMCMD.GET_MESSAGES_BY_CONVERSATION.getValue(), bVar);
        this.f38089f = z;
        this.n = i2;
        this.f38091h = z2;
        this.f38085b = i3;
        this.f38086c = j2;
        this.f38087d = j3;
        this.f38088e = j4;
        this.f38090g = z3;
    }
}
