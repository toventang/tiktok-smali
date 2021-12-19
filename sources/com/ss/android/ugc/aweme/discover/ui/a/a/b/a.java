package com.ss.android.ugc.aweme.discover.ui.a.a.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchUserFeedback;
import h.f.b.l;
import java.util.Map;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static final C1924a f82196c = new C1924a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public SearchUserFeedback f82197a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f82198b;

    static {
        Covode.recordClassIndex(51158);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.a.a.b.a$a  reason: collision with other inner class name */
    public static final class C1924a {
        static {
            Covode.recordClassIndex(51160);
        }

        private C1924a() {
        }

        public /* synthetic */ C1924a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(final View view) {
        super(view);
        l.d(view, "");
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.discover.ui.a.a.b.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f82199a;

            static {
                Covode.recordClassIndex(51159);
            }

            {
                this.f82199a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                SearchUserFeedback searchUserFeedback = this.f82199a.f82197a;
                if (searchUserFeedback != null) {
                    com.ss.android.ugc.aweme.search.feedback.a.a(view.getContext(), searchUserFeedback.schema, false, this.f82199a.f82198b, null);
                }
            }
        });
    }
}
