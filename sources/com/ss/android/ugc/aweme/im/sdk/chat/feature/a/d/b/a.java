package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public abstract class a {

    /* renamed from: f  reason: collision with root package name */
    public static final C2467a f100340f = new C2467a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final View f100341a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f100342b;

    /* renamed from: c  reason: collision with root package name */
    protected ai f100343c;

    /* renamed from: d  reason: collision with root package name */
    protected SayHelloContent f100344d;

    /* renamed from: e  reason: collision with root package name */
    public final d f100345e;

    /* renamed from: g  reason: collision with root package name */
    private View f100346g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f100347h;

    /* renamed from: i  reason: collision with root package name */
    private View f100348i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f100349j;

    static {
        Covode.recordClassIndex(64107);
    }

    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public abstract List<com.ss.android.ugc.aweme.emoji.g.a> b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a$a  reason: collision with other inner class name */
    public static final class C2467a {
        static {
            Covode.recordClassIndex(64108);
        }

        private C2467a() {
        }

        public /* synthetic */ C2467a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final SayHelloContent a() {
        SayHelloContent sayHelloContent = this.f100344d;
        if (sayHelloContent == null) {
            l.a("content");
        }
        return sayHelloContent;
    }

    private final String e() {
        ai aiVar = this.f100343c;
        if (aiVar == null) {
            l.a("message");
        }
        String valueOf = String.valueOf(b.a.c(aiVar.getConversationId()));
        l.b(valueOf, "");
        return valueOf;
    }

    public void c() {
        this.f100347h = (TextView) b(R.id.ds_);
        this.f100346g = b(R.id.a7y);
        View b2 = b(R.id.anj);
        this.f100348i = b2;
        if (b2 == null) {
            l.a("dividerTop");
        }
        b2.setVisibility(8);
        View view = this.f100346g;
        if (view == null) {
            l.a("closeIv");
        }
        view.setOnClickListener(new b(this));
    }

    public final void d() {
        String e2 = e();
        ai aiVar = this.f100343c;
        if (aiVar == null) {
            l.a("message");
        }
        String conversationId = aiVar.getConversationId();
        l.b(conversationId, "");
        com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a.a(e2, conversationId, b(), true);
        ai aiVar2 = this.f100343c;
        if (aiVar2 == null) {
            l.a("message");
        }
        t.a(aiVar2, (com.bytedance.im.core.a.a.b<ai>) null);
        if (this.f100349j) {
            this.f100341a.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f100350a;

        static {
            Covode.recordClassIndex(64109);
        }

        b(a aVar) {
            this.f100350a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f100350a.d();
        }
    }

    /* access modifiers changed from: protected */
    public final <T extends View> T b(int i2) {
        T t = (T) this.f100341a.findViewById(i2);
        l.b(t, "");
        return t;
    }

    public a(d dVar) {
        l.d(dVar, "");
        this.f100345e = dVar;
        View view = dVar.itemView;
        l.b(view, "");
        this.f100341a = view;
        Context context = view.getContext();
        if (context == null) {
            l.b();
        }
        this.f100342b = context;
        c();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        if (i2 < b().size()) {
            com.ss.android.ugc.aweme.emoji.g.a aVar = b().get(i2);
            ai aiVar = this.f100343c;
            if (aiVar == null) {
                l.a("message");
            }
            t.a(aiVar, (com.bytedance.im.core.a.a.b<ai>) null);
            if (this.f100349j) {
                this.f100341a.setVisibility(8);
            }
            ai aiVar2 = this.f100343c;
            if (aiVar2 == null) {
                l.a("message");
            }
            String conversationId = aiVar2.getConversationId();
            l.b(conversationId, "");
            com.ss.android.ugc.aweme.im.sdk.chat.feature.story.b.a(conversationId, "");
            g.a.a().a(e()).a(EmojiContent.obtain(aVar)).a();
            ai aiVar3 = this.f100343c;
            if (aiVar3 == null) {
                l.a("message");
            }
            String conversationId2 = aiVar3.getConversationId();
            String valueOf = String.valueOf(aVar.getId());
            a.d dVar = a.d.f100331a;
            l.d(valueOf, "");
            l.d(dVar, "");
            androidx.c.a aVar2 = new androidx.c.a();
            String b2 = d.b(conversationId2);
            l.b(b2, "");
            aVar2.put("conversation_id", b2);
            aVar2.put(a.b.f100328a, valueOf);
            dVar.invoke(a.C2466a.f100326c, aVar2);
        }
    }

    public void a(ai aiVar, ai aiVar2, SayHelloContent sayHelloContent, int i2, boolean z) {
        String str;
        l.d(aiVar, "");
        l.d(sayHelloContent, "");
        this.f100343c = aiVar;
        this.f100344d = sayHelloContent;
        this.f100349j = z;
        if (aiVar.getLocalExt().get("is_logger") == null) {
            aiVar.addLocalExt("is_logger", "true");
            String e2 = e();
            ai aiVar3 = this.f100343c;
            if (aiVar3 == null) {
                l.a("message");
            }
            String conversationId = aiVar3.getConversationId();
            l.b(conversationId, "");
            com.ss.android.ugc.aweme.im.sdk.chat.feature.a.a.a.a(e2, conversationId, b(), false);
            t.a(aiVar);
        }
        TextView textView = this.f100347h;
        if (textView == null) {
            l.a("sayHelloTv");
        }
        String str2 = sayHelloContent.helloText;
        if (str2 == null || str2.length() == 0) {
            str = this.f100342b.getString(R.string.c_n, sayHelloContent.nickname);
        } else {
            str = sayHelloContent.helloText;
        }
        textView.setText(str);
    }
}
