package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.v;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f106109b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f106110a;

    /* renamed from: c  reason: collision with root package name */
    private final LinearLayout f106111c;

    /* renamed from: d  reason: collision with root package name */
    private final List<AnchorCommonStruct> f106112d;

    static {
        Covode.recordClassIndex(67868);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67869);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(67870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f106110a.dismiss();
            return z.f158842a;
        }
    }

    public d(Context context, List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        UrlModel icon;
        l.d(context, "");
        l.d(list, "");
        MethodCollector.i(8360);
        this.f106112d = list;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        for (AnchorCommonStruct anchorCommonStruct : list) {
            c cVar = new c(context, (byte) 0);
            List<AnchorPanelAction> actions = anchorCommonStruct.getActions();
            if (!(actions == null || (anchorPanelAction = actions.get(0)) == null || (icon = anchorPanelAction.getIcon()) == null)) {
                com.ss.android.ugc.aweme.base.l a2 = v.a(icon);
                l.b(a2, "");
                cVar.setActionIcon(a2);
            }
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                com.ss.android.ugc.aweme.base.l a3 = v.a(thumbnail);
                l.b(a3, "");
                cVar.setIcon(a3);
            }
            cVar.setTitle(anchorCommonStruct.getKeyword());
            cVar.setSubtitle(anchorCommonStruct.getDescription());
            linearLayout.addView(cVar);
        }
        this.f106111c = linearLayout;
        a.C1112a b2 = new a.C1112a().a(linearLayout).b(true).c(true).b().b(linearLayout.getHeight());
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a4 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark);
        a4.f45194b = true;
        TuxNavBar.a a5 = aVar.a(a4.a((h.f.a.a<z>) new b(this)));
        g gVar = new g();
        String string = context.getString(R.string.ct8);
        l.b(string, "");
        TuxNavBar.a a6 = a5.a(gVar.a(string));
        a6.f45188d = true;
        this.f106110a = b2.a(a6).f45299a;
        MethodCollector.o(8360);
    }
}
