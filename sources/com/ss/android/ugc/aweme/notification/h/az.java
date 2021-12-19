package com.ss.android.ugc.aweme.notification.h;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class az extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final View f113605a;

    /* renamed from: b  reason: collision with root package name */
    private final h f113606b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f113607c = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(73031);
    }

    private final RemoteImageView a() {
        return (RemoteImageView) this.f113606b.getValue();
    }

    private final TuxTextView b() {
        return (TuxTextView) this.f113607c.getValue();
    }

    static final class a extends m implements h.f.a.a<RemoteImageView> {
        final /* synthetic */ az this$0;

        static {
            Covode.recordClassIndex(73033);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(az azVar) {
            super(0);
            this.this$0 = azVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.this$0.f113605a.findViewById(R.id.bvt);
        }
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ az this$0;

        static {
            Covode.recordClassIndex(73034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(az azVar) {
            super(0);
            this.this$0 = azVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.f113605a.findViewById(R.id.f9l);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az(View view, UrlModel urlModel, String str, String str2, final h.f.a.a<z> aVar) {
        super(view);
        l.d(view, "");
        l.d(aVar, "");
        this.f113605a = view;
        if (urlModel != null) {
            e.a(a(), urlModel);
        } else if (str != null) {
            e.b(a(), str, -1, -1);
        }
        a().setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.notification.h.az.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73032);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.invoke();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            TuxTextView b2 = b();
            l.b(b2, "");
            b2.setVisibility(0);
            TuxTextView b3 = b();
            l.b(b3, "");
            b3.setText(str2);
            com.ss.android.ugc.aweme.emoji.i.b.b.a(b());
        }
    }
}
