package com.ss.android.ugc.aweme.tools.music.e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f140586b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final j f140587a;

    /* renamed from: c  reason: collision with root package name */
    private AVDmtImageTextView f140588c;

    static {
        Covode.recordClassIndex(91815);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91817);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(final View view, j jVar) {
        super(view);
        l.d(view, "");
        this.f140587a = jVar;
        AVDmtImageTextView aVDmtImageTextView = (AVDmtImageTextView) view.findViewById(R.id.bt0);
        this.f140588c = aVDmtImageTextView;
        if (aVDmtImageTextView != null) {
            aVDmtImageTextView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tools.music.e.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f140589a;

                static {
                    Covode.recordClassIndex(91816);
                }

                {
                    this.f140589a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    j jVar = this.f140589a.f140587a;
                    if (jVar != null) {
                        jVar.a(view, this.f140589a.getAdapterPosition());
                    }
                }
            });
        }
    }
}
