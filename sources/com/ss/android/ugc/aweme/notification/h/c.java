package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.inbox.f;
import com.ss.android.ugc.aweme.notification.bean.a;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c extends p {

    /* renamed from: a  reason: collision with root package name */
    public a f113622a;

    /* renamed from: b  reason: collision with root package name */
    public final BaseNotificationVM f113623b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.friends.invite.a f113624c;

    static {
        Covode.recordClassIndex(73044);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void d() {
        super.d();
        this.f113624c.b();
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        super.bY_();
        this.f113624c.a();
        a aVar = this.f113622a;
        if (aVar != null && aVar.f113233a == 2010) {
            this.f113623b.a(aVar);
        }
    }

    public final void a(a aVar) {
        Friend friend;
        if (aVar != null && (friend = aVar.f113234b) != null) {
            this.f113624c.a(friend);
            this.f113622a = aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.friends.invite.a aVar, BaseNotificationVM baseNotificationVM) {
        super((View) aVar);
        l.d(aVar, "");
        l.d(baseNotificationVM, "");
        this.f113624c = aVar;
        this.f113623b = baseNotificationVM;
        aVar.setOutClickListener(new b<String, z>(this) {
            /* class com.ss.android.ugc.aweme.notification.h.c.AnonymousClass1 */
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(73045);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                l.d(str2, "");
                f.b(AnonymousClass1.f113625a);
                a aVar = this.this$0.f113622a;
                if (aVar != null) {
                    this.this$0.f113623b.a(aVar, str2);
                }
                return z.f158842a;
            }
        });
    }
}
