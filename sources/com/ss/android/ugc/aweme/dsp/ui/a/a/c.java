package com.ss.android.ugc.aweme.dsp.ui.a.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dj;
import com.ss.android.ugc.aweme.dsp.library.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f83953a;

    /* renamed from: b  reason: collision with root package name */
    private final h f83954b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(52369);
    }

    private final dj f() {
        return (dj) this.f83954b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final String e() {
        return "my_playlist";
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final Class<? extends Fragment> b() {
        return g.class;
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final String a() {
        return f().f82872h;
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final Bundle c() {
        return new Bundle();
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final String d() {
        return f().f82873i;
    }

    static final class a extends m implements h.f.a.a<dj> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(52370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dj invoke() {
            Context context = this.this$0.f83953a;
            l.d(context, "");
            String string = context.getResources().getString(R.string.dc4);
            l.b(string, "");
            return new dj(context, "LIBRARY", string);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final View a(b bVar) {
        l.d(bVar, "");
        return bVar.a(f());
    }

    public c(Context context) {
        l.d(context, "");
        this.f83953a = context;
    }
}
