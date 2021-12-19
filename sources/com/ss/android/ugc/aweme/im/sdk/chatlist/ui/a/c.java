package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;

public final class c extends b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f102079h = "DeleteAction";

    /* renamed from: i  reason: collision with root package name */
    public static final a f102080i = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final boolean f102081f;

    /* renamed from: g  reason: collision with root package name */
    final int f102082g;

    /* renamed from: j  reason: collision with root package name */
    private final int f102083j;

    /* renamed from: k  reason: collision with root package name */
    private final int f102084k;

    public static final class a {
        static {
            Covode.recordClassIndex(65320);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int a() {
        return this.f102082g;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int b() {
        return this.f102084k;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int c() {
        return this.f102083j;
    }

    static {
        Covode.recordClassIndex(65319);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final void d() {
        int i2;
        int i3;
        String str;
        i coreInfo;
        Context context = this.f102073c;
        if (this.f102081f) {
            i2 = R.string.b9k;
        } else {
            i2 = R.string.b9i;
        }
        String string = context.getString(i2);
        l.b(string, "");
        Context context2 = this.f102073c;
        if (this.f102081f) {
            i3 = R.string.b9l;
        } else {
            i3 = R.string.b9j;
        }
        String string2 = context2.getString(i3);
        l.b(string2, "");
        if (this.f102081f) {
            Object[] objArr = new Object[1];
            h hVar = this.f102071a;
            if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
                str = "";
            }
            objArr[0] = str;
            l.b(com.a.a(string, Arrays.copyOf(objArr, 1)), "");
        }
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(this.f102073c).b(string).d(string2), new b(this)).a(false)).a().b().show();
        r.onEvent(MobClick.obtain().setEventName("delete").setLabelName("message").setValue(String.valueOf(b.a.c(this.f102072b))));
        com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.a("delete", this.f102075e.c());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c$c  reason: collision with other inner class name */
    public static final class C2553c implements com.bytedance.im.core.a.a.b<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f102085a;

        static {
            Covode.recordClassIndex(65324);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2553c(c cVar) {
            this.f102085a = cVar;
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            String str = "ChatSession delete conversation failed: ";
            if (uVar != null) {
                str = str + uVar.f38023a + ", " + uVar.f38025c;
            }
            com.ss.android.ugc.aweme.im.service.m.a.e(c.f102079h, str);
            new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.ceo).a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(String str) {
            l.d(str, "");
            if (!this.f102085a.f102081f) {
                long c2 = b.a.c(this.f102085a.f102072b);
                if (c2 > 0) {
                    n a2 = n.a();
                    String valueOf = String.valueOf(c2);
                    if (!TextUtils.isEmpty(valueOf)) {
                        a2.f102428a.edit().putBoolean("key_friend_rec_".concat(String.valueOf(valueOf)), true).commit();
                    }
                }
            }
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(65321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.c(this.this$0.f102082g, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(65322);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    c cVar = this.this$0.this$0;
                    a.C0745a.a().c(cVar.f102072b, new C2553c(cVar));
                    com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.b("delete", this.this$0.this$0.f102075e.c());
                    return z.f158842a;
                }
            });
            String string = this.this$0.f102073c.getString(R.string.a9e);
            l.b(string, "");
            bVar2.b(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.c.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(65323);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.b("cancel", this.this$0.this$0.f102075e.c());
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        super(context, bVar, aVar, (byte) 0);
        l.d(context, "");
        l.d(bVar, "");
        l.d(aVar, "");
        boolean z = false;
        h c2 = bVar.c();
        this.f102081f = c2 != null ? c2.isStranger() : z;
        this.f102083j = 1;
        this.f102082g = R.string.ce9;
        this.f102084k = R.raw.icon_trash_bin;
    }
}
