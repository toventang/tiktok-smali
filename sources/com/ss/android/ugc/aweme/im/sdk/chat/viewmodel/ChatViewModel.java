package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.u;
import com.bytedance.im.core.proto.MessageStatus;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a;
import f.a.aa;
import h.f.b.l;
import h.m.p;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class ChatViewModel extends ac {

    /* renamed from: i  reason: collision with root package name */
    public static final a f101491i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f101492a;

    /* renamed from: b  reason: collision with root package name */
    public int f101493b;

    /* renamed from: c  reason: collision with root package name */
    public f.a.b.a f101494c;

    /* renamed from: d  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a<Object>> f101495d;

    /* renamed from: e  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a<ai>> f101496e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.c.a f101497f;

    /* renamed from: g  reason: collision with root package name */
    public final aa f101498g;

    /* renamed from: h  reason: collision with root package name */
    public final aa f101499h;

    static {
        Covode.recordClassIndex(64915);
    }

    public ChatViewModel() {
        this((byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64916);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ChatViewModel a(Fragment fragment) {
            l.d(fragment, "");
            ac a2 = ae.a(fragment, (ad.b) null).a(ChatViewModel.class);
            l.b(a2, "");
            return (ChatViewModel) a2;
        }
    }

    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatViewModel f101500a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f101501b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f101502c;

        static {
            Covode.recordClassIndex(64917);
        }

        public b(ChatViewModel chatViewModel, String str, long j2) {
            this.f101500a = chatViewModel;
            this.f101501b = str;
            this.f101502c = j2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f101500a.f101497f.a(this.f101501b, this.f101502c);
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f101494c.a();
    }

    public static final class d implements com.bytedance.ies.im.core.api.b.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatViewModel f101504a;

        static {
            Covode.recordClassIndex(64919);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(ChatViewModel chatViewModel) {
            this.f101504a = chatViewModel;
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar) {
            this.f101504a.f101495d.setValue(new a.d(aiVar));
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar, u uVar) {
            this.f101504a.f101493b = 3;
            this.f101504a.f101495d.setValue(new a.C2572a(uVar));
        }
    }

    public static final class e implements com.bytedance.ies.im.core.api.b.a.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatViewModel f101505a;

        static {
            Covode.recordClassIndex(64920);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public e(ChatViewModel chatViewModel) {
            this.f101505a = chatViewModel;
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar) {
            this.f101505a.f101495d.setValue(new a.d(aiVar));
        }

        @Override // com.bytedance.ies.im.core.api.b.a.e
        public final void a(ai aiVar, u uVar) {
            this.f101505a.f101495d.setValue(new a.C2572a(uVar));
        }
    }

    public final void a(ai aiVar) {
        this.f101496e.setValue(new a.d(aiVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private /* synthetic */ ChatViewModel(byte r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.b r3 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.b
            com.ss.android.ugc.aweme.im.sdk.chat.data.a.b r0 = new com.ss.android.ugc.aweme.im.sdk.chat.data.a.b
            r0.<init>()
            r3.<init>(r0)
            f.a.aa r0 = f.a.k.a.f158006c
            f.a.aa r2 = f.a.h.a.b(r0)
            java.lang.String r1 = ""
            h.f.b.l.b(r2, r1)
            f.a.aa r0 = f.a.a.b.a.f157156a
            f.a.aa r0 = f.a.a.a.a.a(r0)
            h.f.b.l.b(r0, r1)
            r4.<init>(r3, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel.<init>(byte):void");
    }

    public static final class c<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatViewModel f101503a;

        static {
            Covode.recordClassIndex(64918);
        }

        public c(ChatViewModel chatViewModel) {
            this.f101503a = chatViewModel;
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            if (obj != null) {
                this.f101503a.f101496e.setValue(new a.d(obj));
            }
            if (obj2 != null) {
                this.f101503a.f101496e.setValue(new a.b.C2573a(obj2));
            }
        }
    }

    public final void a(CharSequence charSequence, String str) {
        T t;
        int i2;
        boolean z;
        this.f101492a = 100;
        if (!(charSequence == null || charSequence.length() == 0)) {
            String obj = charSequence.toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            if (p.b((CharSequence) obj).toString().length() != 0) {
                if (charSequence.length() > 6000) {
                    this.f101493b = 2;
                    this.f101495d.setValue(new a.C2572a(Integer.valueOf(this.f101493b)));
                    return;
                }
                this.f101495d.setValue(new a.c(charSequence));
                long currentTimeMillis = System.currentTimeMillis();
                TextContent.Companion companion = TextContent.Companion;
                String obj2 = charSequence.toString();
                int length = obj2.length() - 1;
                int i3 = 0;
                boolean z2 = false;
                while (i3 <= length) {
                    if (!z2) {
                        i2 = i3;
                    } else {
                        i2 = length;
                    }
                    if (l.a(obj2.charAt(i2), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2) {
                        if (!z) {
                            break;
                        }
                        length--;
                    } else if (!z) {
                        z2 = true;
                    } else {
                        i3++;
                    }
                }
                TextContent obtain = companion.obtain(obj2.subSequence(i3, length + 1).toString());
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                com.ss.android.ugc.aweme.im.sdk.common.controller.g.a.a(str, obtain);
                com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a<ai> value = this.f101496e.getValue();
                ReferenceInfo referenceInfo = null;
                if (!(value instanceof a.d)) {
                    value = null;
                }
                a.d dVar = (a.d) value;
                if (!(dVar == null || (t = dVar.f102463a) == null)) {
                    obtain.setType(703);
                    String content = t.getContent();
                    l.b(content, "");
                    String valueOf = String.valueOf(t.getSender());
                    String str2 = t.getSecSender().toString();
                    int msgType = t.getMsgType();
                    String content2 = t.getContent();
                    l.b(content2, "");
                    referenceInfo = new ReferenceInfo.Builder().hint(j.a(new ReferenceInfoHint(content, valueOf, str2, msgType, content2))).referenced_message_id(Long.valueOf(t.getMsgId())).ref_message_type(0L).referenced_message_status(MessageStatus.AVAILABLE).build();
                }
                g.a.a().b(str).a(obtain).a(referenceInfo).a(new d(this));
                return;
            }
        }
        this.f101493b = 1;
        this.f101495d.setValue(new a.C2572a(Integer.valueOf(this.f101493b)));
    }

    private ChatViewModel(com.ss.android.ugc.aweme.im.sdk.chat.data.c.a aVar, aa aaVar, aa aaVar2) {
        l.d(aVar, "");
        l.d(aaVar, "");
        l.d(aaVar2, "");
        this.f101497f = aVar;
        this.f101498g = aaVar;
        this.f101499h = aaVar2;
        this.f101492a = 100;
        this.f101493b = 1;
        this.f101494c = new f.a.b.a();
        this.f101495d = new t<>();
        this.f101496e = new t<>();
    }
}
