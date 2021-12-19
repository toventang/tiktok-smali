package com.ss.android.ugc.aweme.tools.music.e.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.a.f;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: h  reason: collision with root package name */
    public static final a f140508h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AVDmtImageTextView f140509a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f140510b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f140511c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f140512d;

    /* renamed from: e  reason: collision with root package name */
    public ImageView f140513e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f140514f;

    /* renamed from: g  reason: collision with root package name */
    public final f f140515g;

    static {
        Covode.recordClassIndex(91770);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91774);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(final View view, f fVar) {
        super(view);
        l.d(view, "");
        l.d(fVar, "");
        this.f140515g = fVar;
        this.f140509a = (AVDmtImageTextView) view.findViewById(R.id.bsa);
        this.f140510b = (TextView) view.findViewById(R.id.f35);
        this.f140511c = (TextView) view.findViewById(R.id.title);
        this.f140512d = (TextView) view.findViewById(R.id.evs);
        this.f140514f = (ImageView) view.findViewById(R.id.a8g);
        this.f140513e = (ImageView) view.findViewById(R.id.ai2);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.tools.music.e.b.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f140516a;

            static {
                Covode.recordClassIndex(91771);
            }

            {
                this.f140516a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f140516a.f140515g.a(view, this.f140516a.getAdapterPosition());
            }
        });
        ImageView imageView = this.f140513e;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tools.music.e.b.e.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f140518a;

                static {
                    Covode.recordClassIndex(91772);
                }

                {
                    this.f140518a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f140518a.f140515g.b(view, this.f140518a.getAdapterPosition());
                }
            });
        }
        ImageView imageView2 = this.f140514f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tools.music.e.b.e.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f140520a;

                static {
                    Covode.recordClassIndex(91773);
                }

                {
                    this.f140520a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f140520a.f140515g.c(view, this.f140520a.getAdapterPosition());
                }
            });
        }
    }
}
