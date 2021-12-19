package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.h;
import com.bytedance.tux.sheet.a.a;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final h f102071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f102072b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f102073c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.ies.im.core.api.b.b f102074d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.k.a f102075e;

    /* renamed from: f  reason: collision with root package name */
    private final int f102076f;

    static {
        Covode.recordClassIndex(65316);
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public abstract void d();

    public boolean e() {
        return false;
    }

    /* access modifiers changed from: protected */
    public int c() {
        return this.f102076f;
    }

    public final a.e f() {
        return (a.e) new a.e().a(a()).b(c()).a(new View$OnClickListenerC2552b(this));
    }

    public final a.d g() {
        return (a.d) new a.d().c(b()).a(a()).b(c()).a(new a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f102077a;

        static {
            Covode.recordClassIndex(65317);
        }

        a(b bVar) {
            this.f102077a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f102077a.d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2552b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f102078a;

        static {
            Covode.recordClassIndex(65318);
        }

        View$OnClickListenerC2552b(b bVar) {
            this.f102078a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f102078a.d();
        }
    }

    private b(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        this.f102073c = context;
        this.f102074d = bVar;
        this.f102075e = aVar;
        this.f102071a = bVar.c();
        this.f102072b = bVar.b();
    }

    public /* synthetic */ b(Context context, com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar, byte b2) {
        this(context, bVar, aVar);
    }
}
