package com.ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    l f78536a;

    /* renamed from: b  reason: collision with root package name */
    int f78537b;

    static {
        Covode.recordClassIndex(48773);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        view.setOnLongClickListener(new View.OnLongClickListener(this) {
            /* class com.ss.android.ugc.aweme.crossplatform.activity.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f78538a;

            static {
                Covode.recordClassIndex(48774);
            }

            {
                this.f78538a = r1;
            }

            public final boolean onLongClick(View view) {
                String str;
                d dVar = this.f78538a;
                LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
                View view2 = dVar.itemView;
                l.b(view2, "");
                Context context = view2.getContext();
                l lVar = dVar.f78536a;
                String str2 = null;
                if (lVar != null) {
                    str = lVar.f78554a;
                } else {
                    str = null;
                }
                l lVar2 = dVar.f78536a;
                if (lVar2 != null) {
                    str2 = lVar2.f78555b;
                }
                localTestApi.getDebugUrlMessage(context, str, str2);
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a("Copied").a();
                return true;
            }
        });
    }
}
