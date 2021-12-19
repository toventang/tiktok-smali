package com.ss.android.ugc.aweme.profile.widgets.l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.profile.af;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.i;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class e extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    private TextView f117934j;

    static {
        Covode.recordClassIndex(76428);
    }

    static final class b extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            this.this$0.a("");
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(76429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                e eVar = this.this$0;
                t.getFollowStatus();
                eVar.a(t.getSignature());
            }
            return z.f158842a;
        }
    }

    public final void a(String str) {
        User user;
        if (TextUtils.isEmpty(str)) {
            TextView textView = this.f117934j;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        i iVar = (i) d.f(this, ab.a(j.class));
        if (iVar != null) {
            user = iVar.f117705a;
        } else {
            user = null;
        }
        TextView textView2 = this.f117934j;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (in.g(user) && in.d()) {
            TextView textView3 = this.f117934j;
            if (textView3 != null) {
                textView3.setText(R.string.g0r);
            }
        } else if (this.f25594h) {
            af.a(this.f117934j, str);
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        this.f117934j = (TextView) view.findViewById(R.id.fdt);
        if (in.d()) {
            o.a(false, this.f117934j);
        }
        d.a(this, ab.a(j.class), f.f117935a, new a(this));
        d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), g.f117936a, new b(this));
    }
}
