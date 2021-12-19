package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class KidsAnchorWidget extends AbsFeedWidget {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106064a = new a((byte) 0);

    static {
        Covode.recordClassIndex(67849);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67850);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        static boolean a(AnchorCommonStruct anchorCommonStruct) {
            List<AnchorPanelAction> actions;
            if (anchorCommonStruct.getType() == 28 && (actions = anchorCommonStruct.getActions()) != null) {
                Iterator<T> it = actions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.getActionType() == 1) {
                        if (next != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public static boolean a(Aweme aweme) {
            List<AnchorCommonStruct> anchors;
            if (!(aweme == null || (anchors = aweme.getAnchors()) == null || ((anchors instanceof Collection) && anchors.isEmpty()))) {
                for (T t : anchors) {
                    l.b(t, "");
                    if (a((AnchorCommonStruct) t)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    public final com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a b(View view) {
        return new b(view, view);
    }

    public static final class b extends com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f106065a;

        /* renamed from: b  reason: collision with root package name */
        private TuxTextView f106066b;

        /* renamed from: c  reason: collision with root package name */
        private SmartImageView f106067c;

        /* renamed from: j  reason: collision with root package name */
        private TuxTextView f106068j;

        /* renamed from: k  reason: collision with root package name */
        private TuxIconView f106069k;

        /* renamed from: l  reason: collision with root package name */
        private View f106070l;

        static {
            Covode.recordClassIndex(67851);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(DataCenter dataCenter) {
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final String b() {
            return "anchor";
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f106071a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f106072b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ i f106073c;

            static {
                Covode.recordClassIndex(67852);
            }

            a(b bVar, List list, i iVar) {
                this.f106071a = bVar;
                this.f106072b = list;
                this.f106073c = iVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f106071a.a(this.f106072b, this.f106073c);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(View view) {
            TuxTextView tuxTextView;
            SmartImageView smartImageView;
            TuxTextView tuxTextView2;
            MethodCollector.i(8449);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                TuxIconView tuxIconView = null;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ad0, (ViewGroup) null);
                this.f106070l = inflate;
                if (inflate != null) {
                    tuxTextView = (TuxTextView) inflate.findViewById(R.id.c40);
                } else {
                    tuxTextView = null;
                }
                this.f106066b = tuxTextView;
                View view2 = this.f106070l;
                if (view2 != null) {
                    smartImageView = (SmartImageView) view2.findViewById(R.id.c3y);
                } else {
                    smartImageView = null;
                }
                this.f106067c = smartImageView;
                View view3 = this.f106070l;
                if (view3 != null) {
                    tuxTextView2 = (TuxTextView) view3.findViewById(R.id.c41);
                } else {
                    tuxTextView2 = null;
                }
                this.f106068j = tuxTextView2;
                View view4 = this.f106070l;
                if (view4 != null) {
                    tuxIconView = (TuxIconView) view4.findViewById(R.id.c3z);
                }
                this.f106069k = tuxIconView;
                viewGroup.addView(this.f106070l);
            }
            MethodCollector.o(8449);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
            if (r3 == null) goto L_0x003b;
         */
        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a r8) {
            /*
            // Method dump skipped, instructions count: 228
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.KidsAnchorWidget.b.a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view, View view2) {
            super(view2);
            this.f106065a = view;
        }

        public final void a(List<AnchorCommonStruct> list, i iVar) {
            if (list != null && !list.isEmpty() && list.size() > 1) {
                View view = this.f106102g;
                l.b(view, "");
                Context context = view.getContext();
                l.b(context, "");
                new d(context, list).f106110a.show(iVar, "KidsAnchorSelectionSheet");
            }
        }
    }
}
