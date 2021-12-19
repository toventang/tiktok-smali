package com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    final RemoteImageView f100337a;

    /* renamed from: b  reason: collision with root package name */
    public m<? super View, ? super Integer, z> f100338b;

    static {
        Covode.recordClassIndex(64105);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(ViewGroup viewGroup) {
        super(a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a56, viewGroup, false));
        l.d(viewGroup, "");
        View findViewById = this.itemView.findViewById(R.id.av9);
        l.b(findViewById, "");
        RemoteImageView remoteImageView = (RemoteImageView) findViewById;
        this.f100337a = remoteImageView;
        remoteImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f100339a;

            static {
                Covode.recordClassIndex(64106);
            }

            {
                this.f100339a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                m<? super View, ? super Integer, z> mVar = this.f100339a.f100338b;
                if (mVar != null) {
                    l.b(view, "");
                    mVar.invoke(view, Integer.valueOf(this.f100339a.getAdapterPosition()));
                }
            }
        });
        ((com.facebook.drawee.f.a) remoteImageView.getHierarchy()).c(R.drawable.atm);
    }
}
