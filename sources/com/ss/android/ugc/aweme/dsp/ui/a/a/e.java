package com.ss.android.ugc.aweme.dsp.ui.a.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f83957a;

    /* renamed from: b  reason: collision with root package name */
    private final h f83958b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(52372);
    }

    private final dj f() {
        return (dj) this.f83958b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final String e() {
        return "track_reco";
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final Class<? extends Fragment> b() {
        return com.ss.android.ugc.aweme.dsp.playpage.mainpage.a.class;
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
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(52373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dj invoke() {
            Context context = this.this$0.f83957a;
            l.d(context, "");
            String string = context.getResources().getString(R.string.dc5);
            l.b(string, "");
            return new dj(context, "Daily Mix", string);
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.a.a
    public final View a(b bVar) {
        l.d(bVar, "");
        return bVar.a(f());
    }

    public e(Context context) {
        l.d(context, "");
        this.f83957a = context;
    }
}
