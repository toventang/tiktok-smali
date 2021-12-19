package com.ss.android.ugc.aweme.challenge.ui.a.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: d  reason: collision with root package name */
    public static final a f70047d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final AnimatedImageView f70048a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f70049b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC1588b f70050c;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a.b$b  reason: collision with other inner class name */
    public interface AbstractC1588b {
        static {
            Covode.recordClassIndex(43215);
        }

        void a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(43212);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43214);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, AbstractC1588b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
        this.f70050c = bVar;
        View findViewById = view.findViewById(R.id.e5s);
        l.b(findViewById, "");
        AnimatedImageView animatedImageView = (AnimatedImageView) findViewById;
        this.f70048a = animatedImageView;
        animatedImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.challenge.ui.a.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f70052a;

            static {
                Covode.recordClassIndex(43213);
            }

            {
                this.f70052a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f70052a.f70049b != null && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                    AbstractC1588b bVar = this.f70052a.f70050c;
                    Aweme aweme = this.f70052a.f70049b;
                    if (aweme == null) {
                        l.b();
                    }
                    this.f70052a.getAdapterPosition();
                    bVar.a(aweme);
                }
            }
        });
    }
}
