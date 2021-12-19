package com.ss.android.ugc.aweme.friends.widget.contact.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.widget.contact.e;
import com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM;
import com.ss.android.ugc.aweme.inbox.f;
import com.ss.android.ugc.aweme.inbox.widget.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends a<e> {

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.friends.invite.a f97319e;

    static {
        Covode.recordClassIndex(61823);
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.a.a
    public final void c() {
        this.f97319e.b();
    }

    @Override // com.ss.android.ugc.aweme.friends.widget.contact.a.a
    public final void b() {
        boolean z;
        this.f97319e.a();
        ContactVM a2 = a();
        T t = this.f97314b;
        if (t == null) {
            l.a("data");
        }
        e eVar = (e) t;
        l.d(eVar, "");
        if (!a2.f97347a.contains(Integer.valueOf(eVar.hashCode()))) {
            a2.f97347a.add(Integer.valueOf(eVar.hashCode()));
            int a3 = a2.a(eVar);
            if (eVar.f97327b.getPhotoUri() != null) {
                z = true;
            } else {
                z = false;
            }
            r.a().execute(new ContactVM.b(a2, com.ss.android.ugc.aweme.friends.widget.a.a.a(z), a3));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.ss.android.ugc.aweme.friends.invite.a aVar) {
        super((View) aVar);
        l.d(aVar, "");
        this.f97319e = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.friends.widget.contact.a.a
    public final void b(b bVar) {
        l.d(bVar, "");
        super.b(bVar);
        this.f97319e.a(bVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.friends.widget.contact.a] */
    @Override // com.ss.android.ugc.aweme.friends.widget.contact.a.a
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        l.d(eVar2, "");
        this.f97319e.a(eVar2.f97327b);
        this.f97319e.setOutClickListener(new a(this, eVar2));
    }

    static final class a extends m implements h.f.a.b<String, z> {
        final /* synthetic */ e $data;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(61824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, e eVar) {
            super(1);
            this.this$0 = cVar;
            this.$data = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            boolean z;
            String str2 = str;
            l.d(str2, "");
            f.a(AnonymousClass1.f97320a);
            ContactVM a2 = this.this$0.a();
            e eVar = this.$data;
            l.d(eVar, "");
            l.d(str2, "");
            String valueOf = String.valueOf(a2.a(eVar));
            if (eVar.f97327b.getPhotoUri() != null) {
                z = true;
            } else {
                z = false;
            }
            r.a().execute(new ContactVM.a(a2, com.ss.android.ugc.aweme.friends.widget.a.a.a(z), valueOf, str2));
            return z.f158842a;
        }
    }
}
