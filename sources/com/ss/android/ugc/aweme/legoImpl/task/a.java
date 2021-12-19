package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.facebook.imageutils.b;
import com.ss.android.ugc.aweme.application.o;

final /* synthetic */ class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    static final b.a f108021a = new a();

    static {
        Covode.recordClassIndex(69265);
    }

    private a() {
    }

    @Override // com.facebook.imageutils.b.a
    public final void a(String str) {
        if (o.f66957b.get(str) == null) {
            Librarian.a(str, false, (Context) null);
        }
    }
}
