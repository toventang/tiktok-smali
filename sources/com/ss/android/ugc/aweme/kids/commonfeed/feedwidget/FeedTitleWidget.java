package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class FeedTitleWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(67847);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    public final com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a b(View view) {
        return new a(view, view);
    }

    public static final class a extends com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f106062a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f106063b;

        static {
            Covode.recordClassIndex(67848);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(DataCenter dataCenter) {
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final String b() {
            return "title";
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(View view) {
            MethodCollector.i(8437);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.ad5, (ViewGroup) null);
                this.f106063b = (TextView) inflate.findViewById(R.id.f9l);
                frameLayout.addView(inflate);
            }
            MethodCollector.o(8437);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar) {
            User author;
            String shortId;
            super.a(aVar);
            TextView textView = this.f106063b;
            if (textView != null) {
                StringBuilder sb = new StringBuilder("@");
                Aweme aweme = this.f106099d;
                String str = "";
                if (aweme == null || (author = aweme.getAuthor()) == null) {
                    str = null;
                } else {
                    l.d(author, str);
                    if (!TextUtils.isEmpty(author.getUniqueId())) {
                        shortId = author.getUniqueId();
                        l.b(shortId, str);
                    } else if (!TextUtils.isEmpty(author.getShortId())) {
                        shortId = author.getShortId();
                        l.b(shortId, str);
                    }
                    str = shortId;
                }
                textView.setText(sb.append(str).toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, View view2) {
            super(view2);
            this.f106062a = view;
        }
    }
}
