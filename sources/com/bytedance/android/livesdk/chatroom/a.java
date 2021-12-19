package com.bytedance.android.livesdk.chatroom;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.b.o;
import com.bytedance.android.livesdk.chatroom.c.ad;
import com.bytedance.android.livesdk.chatroom.c.ak;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

public final class a extends o {

    /* renamed from: b  reason: collision with root package name */
    public final ar f14870b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f14871c;

    /* renamed from: d  reason: collision with root package name */
    private View f14872d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f14873e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14874f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.android.livesdk.i.a f14875g;

    static {
        Covode.recordClassIndex(8243);
    }

    @Override // com.bytedance.android.live.b.o
    public final int a() {
        return R.layout.be6;
    }

    private /* synthetic */ a() {
        this(null, null, null);
    }

    @Override // com.bytedance.android.live.b.o
    public final void d() {
        super.d();
        com.bytedance.android.livesdk.i.a aVar = this.f14875g;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.bytedance.android.live.b.o
    public final void c() {
        super.c();
        if (!this.f14871c.isDisposed()) {
            this.f14871c.dispose();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    @Override // com.bytedance.android.live.b.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.a.b():void");
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0317a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14876a;

        static {
            Covode.recordClassIndex(8244);
        }

        View$OnClickListenerC0317a(a aVar) {
            this.f14876a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.browser.c.c cVar = this.f14876a.f7350a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14919a;

        static {
            Covode.recordClassIndex(8247);
        }

        d(a aVar) {
            this.f14919a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.browser.c.c cVar = this.f14919a.f7350a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14920a;

        static {
            Covode.recordClassIndex(8248);
        }

        e(a aVar) {
            this.f14920a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.browser.c.c cVar = this.f14920a.f7350a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WebView f14885b;

        static {
            Covode.recordClassIndex(8245);
        }

        b(a aVar, WebView webView) {
            this.f14884a = aVar;
            this.f14885b = webView;
        }

        public final void onClick(View view) {
            if (this.f14885b.canGoBack()) {
                this.f14885b.goBack();
                return;
            }
            com.bytedance.android.livesdk.browser.c.c cVar = this.f14884a.f7350a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f14896a;

        static {
            Covode.recordClassIndex(8246);
        }

        c(a aVar) {
            this.f14896a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.an.a.a().a(new ad(this.f14896a.f14870b));
        }
    }

    @Override // com.bytedance.android.live.b.o
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        this.f14872d = view.findViewById(R.id.eav);
        this.f14873e = (ImageView) view.findViewById(R.id.eas);
        TextView textView = (TextView) view.findViewById(R.id.eaw);
        if (textView != null && this.f14870b != null) {
            textView.setOnClickListener(new c(this));
            this.f14871c.a(com.bytedance.android.livesdk.an.a.a().a(ak.class).d(new d(this)));
            this.f14871c.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.chatroom.c.f.class).d(new e(this)));
        }
    }

    public a(String str, ar arVar, com.bytedance.android.livesdk.i.a aVar) {
        this.f14874f = str;
        this.f14870b = arVar;
        this.f14875g = aVar;
        this.f14871c = new f.a.b.a();
    }
}
