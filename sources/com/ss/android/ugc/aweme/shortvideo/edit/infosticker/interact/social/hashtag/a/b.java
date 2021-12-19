package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.views.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static final a f127632c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    TuxTextView f127633a;

    /* renamed from: b  reason: collision with root package name */
    public final j f127634b;

    static {
        Covode.recordClassIndex(83677);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83679);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(final View view, j jVar) {
        super(view);
        l.d(view, "");
        l.d(jVar, "");
        this.f127634b = jVar;
        this.f127633a = (TuxTextView) view.findViewById(R.id.f18);
        view.setOnClickListener(new d(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f127636a;

            static {
                Covode.recordClassIndex(83678);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                j jVar = this.f127636a.f127634b;
                if (jVar != null) {
                    jVar.a(view, this.f127636a.getAdapterPosition());
                }
            }

            {
                this.f127636a = r1;
            }
        });
    }
}
