package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a;

import android.content.Context;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    private final int f102091f = R.string.b9v;

    /* renamed from: g  reason: collision with root package name */
    private final int f102092g = R.raw.icon_tick_circle;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f102093h;

    /* renamed from: i  reason: collision with root package name */
    private final h f102094i;

    static {
        Covode.recordClassIndex(65328);
    }

    private final boolean h() {
        return ((Boolean) this.f102094i.getValue()).booleanValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int a() {
        return this.f102091f;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final int b() {
        return this.f102092g;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final boolean e() {
        if (this.f102093h || h()) {
            return false;
        }
        return true;
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(65329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Integer mark_read;
            com.ss.android.ugc.aweme.im.sdk.chatlist.b.a c2 = c.c(this.this$0.f102071a);
            if (c2 == null || (mark_read = c2.getMark_read()) == null || mark_read.intValue() != 0) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.a.b
    public final void d() {
        t<String> a2;
        if (this.f102093h) {
            this.f102074d.e();
        }
        if (h()) {
            c.e(this.f102071a);
            DmViewModel a3 = DmViewModel.a.a(com.bytedance.ies.ugc.appcontext.f.j());
            if (!(a3 == null || (a2 = a3.a()) == null)) {
                a2.setValue(this.f102072b);
            }
        }
        com.ss.android.ugc.aweme.im.sdk.chatlist.a.a.a("read", this.f102075e.c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, b bVar, com.ss.android.ugc.aweme.im.service.k.a aVar) {
        super(context, bVar, aVar, (byte) 0);
        l.d(context, "");
        l.d(bVar, "");
        l.d(aVar, "");
        boolean z = false;
        com.bytedance.im.core.d.h hVar = this.f102071a;
        if (hVar != null && hVar.getUnreadCount() > 0) {
            z = true;
        }
        this.f102093h = z;
        this.f102094i = i.a((h.f.a.a) new a(this));
    }
}
