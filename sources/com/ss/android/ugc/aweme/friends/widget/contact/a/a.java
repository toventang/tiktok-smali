package com.ss.android.ugc.aweme.friends.widget.contact.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.widget.contact.a;
import com.ss.android.ugc.aweme.friends.widget.contact.vm.ContactVM;
import com.ss.android.ugc.aweme.inbox.widget.b;
import h.f.b.l;

public abstract class a<T extends com.ss.android.ugc.aweme.friends.widget.contact.a> extends RecyclerView.ViewHolder implements com.ss.android.ugc.aweme.inbox.widget.a {

    /* renamed from: a  reason: collision with root package name */
    public ContactVM f97313a;

    /* renamed from: b  reason: collision with root package name */
    public T f97314b;

    /* renamed from: c  reason: collision with root package name */
    public int f97315c = -1;

    /* renamed from: d  reason: collision with root package name */
    public b f97316d;

    static {
        Covode.recordClassIndex(61820);
    }

    public abstract void a(T t);

    public void b() {
    }

    /* access modifiers changed from: protected */
    public void b(b bVar) {
        l.d(bVar, "");
    }

    public void c() {
    }

    public final ContactVM a() {
        ContactVM contactVM = this.f97313a;
        if (contactVM == null) {
            l.a("contactVM");
        }
        return contactVM;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.a
    public final void a(b bVar) {
        l.d(bVar, "");
        if (!l.a(this.f97316d, bVar)) {
            this.f97316d = bVar;
            b(bVar);
        }
    }
}
