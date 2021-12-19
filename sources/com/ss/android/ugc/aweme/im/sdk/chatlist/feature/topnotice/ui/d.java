package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends RecyclerView.ViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static final a f102028e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final TuxButton f102029a;

    /* renamed from: b  reason: collision with root package name */
    final ImageView f102030b;

    /* renamed from: c  reason: collision with root package name */
    final TextView f102031c;

    /* renamed from: d  reason: collision with root package name */
    final TextView f102032d;

    static {
        Covode.recordClassIndex(65288);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65289);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListTopNoticeViewModel f102034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TopChatNoticeSourceType f102035b;

        static {
            Covode.recordClassIndex(65291);
        }

        c(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, TopChatNoticeSourceType topChatNoticeSourceType) {
            this.f102034a = sessionListTopNoticeViewModel;
            this.f102035b = topChatNoticeSourceType;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            SessionListTopNoticeViewModel sessionListTopNoticeViewModel = this.f102034a;
            TopChatNoticeSourceType topChatNoticeSourceType = this.f102035b;
            l.d(topChatNoticeSourceType, "");
            b value = sessionListTopNoticeViewModel.f102057h.getValue();
            if (value != null) {
                str = value.getNoticeCode();
            } else {
                str = null;
            }
            sessionListTopNoticeViewModel.a(str, topChatNoticeSourceType, 1, "");
            sessionListTopNoticeViewModel.a("notification_setting_alert_close");
            sessionListTopNoticeViewModel.f102057h.setValue(b.EmptyTopNoticeView);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SessionListTopNoticeViewModel f102033a;

        static {
            Covode.recordClassIndex(65290);
        }

        b(SessionListTopNoticeViewModel sessionListTopNoticeViewModel) {
            this.f102033a = sessionListTopNoticeViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
            if (r1 != 3) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r6) {
            /*
            // Method dump skipped, instructions count: 101
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.d.b.onClick(android.view.View):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.blw);
        l.b(findViewById, "");
        this.f102029a = (TuxButton) findViewById;
        View findViewById2 = view.findViewById(R.id.bhl);
        l.b(findViewById2, "");
        this.f102030b = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.f0h);
        l.b(findViewById3, "");
        this.f102031c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f0g);
        l.b(findViewById4, "");
        this.f102032d = (TextView) findViewById4;
    }
}
