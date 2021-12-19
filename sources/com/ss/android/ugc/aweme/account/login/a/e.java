package com.ss.android.ugc.aweme.account.login.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IAssistantService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public final TuxTextView f63259a;

    /* renamed from: b  reason: collision with root package name */
    public final View f63260b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f63261c;

    static {
        Covode.recordClassIndex(38991);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view, boolean z) {
        super(view);
        l.d(view, "");
        this.f63260b = view;
        View findViewById = view.findViewById(R.id.title);
        l.b(findViewById, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        this.f63259a = tuxTextView;
        View findViewById2 = view.findViewById(R.id.dwk);
        l.b(findViewById2, "");
        TextView textView = (TextView) findViewById2;
        this.f63261c = textView;
        if (z) {
            tuxTextView.setText(view.getContext().getText(R.string.aql));
        } else {
            tuxTextView.setText(view.getContext().getText(R.string.aoy));
            textView.setText(view.getContext().getText(R.string.aov));
        }
        tuxTextView.setOnLongClickListener(new View.OnLongClickListener(this) {
            /* class com.ss.android.ugc.aweme.account.login.a.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f63262a;

            static {
                Covode.recordClassIndex(38992);
            }

            {
                this.f63262a = r1;
            }

            public final boolean onLongClick(View view) {
                IAssistantService iAssistantService = (IAssistantService) ServiceManager.get().getService(IAssistantService.class);
                if (iAssistantService == null) {
                    return true;
                }
                Context context = this.f63262a.f63260b.getContext();
                l.b(context, "");
                iAssistantService.openPage(context);
                return true;
            }
        });
    }
}
