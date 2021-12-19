package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.a.a;
import h.f.b.l;
import h.z;

public final class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private final h f94924a;

    /* renamed from: b  reason: collision with root package name */
    private final f f94925b;

    /* renamed from: c  reason: collision with root package name */
    private final i f94926c;

    static {
        Covode.recordClassIndex(60206);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        Context context;
        l.d(view, "");
        f fVar = this.f94925b;
        if (fVar != null && (context = fVar.getContext()) != null) {
            this.f94924a.a(context, this.f94926c.a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(h hVar, final f fVar, i iVar) {
        super(new a<z>() {
            /* class com.ss.android.ugc.aweme.feed.ui.masklayer2.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(60207);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                f fVar = fVar;
                if (fVar != null) {
                    fVar.dismiss();
                }
                return z.f158842a;
            }
        });
        l.d(hVar, "");
        l.d(iVar, "");
        this.f94924a = hVar;
        this.f94925b = fVar;
        this.f94926c = iVar;
    }
}
