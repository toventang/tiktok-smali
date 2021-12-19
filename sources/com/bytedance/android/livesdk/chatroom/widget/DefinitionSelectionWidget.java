package com.bytedance.android.livesdk.chatroom.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.h;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.z;

public final class DefinitionSelectionWidget extends LiveRecyclableWidget implements View.OnClickListener, au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16556a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private ImageView f16557b;

    static {
        Covode.recordClassIndex(9177);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgq;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(9178);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ DefinitionSelectionWidget this$0;

        static {
            Covode.recordClassIndex(9180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DefinitionSelectionWidget definitionSelectionWidget) {
            super(1);
            this.this$0 = definitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            DefinitionSelectionWidget definitionSelectionWidget = this.this$0;
            if (booleanValue) {
                View view = definitionSelectionWidget.getView();
                if (view != null) {
                    view.setVisibility(4);
                }
            } else {
                definitionSelectionWidget.show();
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<n.a, z> {
        final /* synthetic */ DefinitionSelectionWidget this$0;

        static {
            Covode.recordClassIndex(9181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DefinitionSelectionWidget definitionSelectionWidget) {
            super(1);
            this.this$0 = definitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n.a aVar) {
            n.a aVar2 = aVar;
            l.d(aVar2, "");
            DefinitionSelectionWidget definitionSelectionWidget = this.this$0;
            String str = aVar2.f7938b;
            l.b(str, "");
            definitionSelectionWidget.a(str);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ DefinitionSelectionWidget this$0;

        static {
            Covode.recordClassIndex(9182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DefinitionSelectionWidget definitionSelectionWidget) {
            super(1);
            this.this$0 = definitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            com.bytedance.android.live.core.c.a.a(4, "DefinitionSelectionWidget", "onResolutionDegrade. newResolution=".concat(String.valueOf(str2)));
            this.this$0.a(str2);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.setOnClickListener(this);
        }
        this.f16557b = (ImageView) getView();
    }

    public final void onClick(View view) {
        Context context;
        com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class);
        Activity activity = null;
        if (view != null && (context = view.getContext()) != null) {
            while (true) {
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    activity = (Activity) context;
                    break;
                }
            }
        }
        bVar.showDefinitionSelectionDialog(activity, false);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DefinitionSelectionWidget f16558a;

        static {
            Covode.recordClassIndex(9179);
        }

        b(DefinitionSelectionWidget definitionSelectionWidget) {
            this.f16558a = definitionSelectionWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g gVar = (g) obj;
            String str = "";
            l.d(gVar, str);
            SparseBooleanArray sparseBooleanArray = gVar.f17192a;
            DefinitionSelectionWidget definitionSelectionWidget = this.f16558a;
            boolean z = false;
            if (sparseBooleanArray != null) {
                boolean z2 = sparseBooleanArray.get(0);
                boolean z3 = sparseBooleanArray.get(2);
                if (z2 || z3) {
                    z = true;
                    com.bytedance.android.livesdk.chatroom.g.e.a(definitionSelectionWidget.context, definitionSelectionWidget.getView(), !z, gVar.f17194c);
                }
            }
            String valueOf = String.valueOf(definitionSelectionWidget.dataChannel.b(di.class));
            com.bytedance.android.livesdkapi.depend.model.live.i iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) definitionSelectionWidget.dataChannel.b(bx.class);
            if (iVar != null) {
                str = j.a(iVar);
            }
            ((com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class)).reportAudienceDefinitionBtnShow(valueOf, str, "1");
            com.bytedance.android.livesdk.chatroom.g.e.a(definitionSelectionWidget.context, definitionSelectionWidget.getView(), !z, gVar.f17194c);
        }
    }

    public final void a(String str) {
        int hashCode = str.hashCode();
        int i2 = 2131234461;
        if (hashCode != -1008619738) {
            if (hashCode != 3324) {
                if (hashCode != 3448) {
                    if (hashCode != 3665) {
                        if (hashCode == 115761) {
                            str.equals("uhd");
                        }
                    } else if (str.equals("sd")) {
                        i2 = 2131234463;
                    }
                } else if (str.equals("ld")) {
                    i2 = 2131234462;
                }
            } else if (str.equals("hd")) {
                i2 = 2131234464;
            }
        } else if (str.equals("origin")) {
            i2 = 2131234465;
        }
        ImageView imageView = this.f16557b;
        if (imageView != null) {
            imageView.setImageResource(i2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String g2;
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(g.class).a(WidgetExtendsKt.autoDispose(this))).a(new b(this));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.a((m) this, ba.class, (h.f.a.b) new c(this)).a((m) this, com.bytedance.android.livesdk.j.i.class, (h.f.a.b) new d(this)).a((m) this, h.class, (h.f.a.b) new e(this));
        }
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        String str = "";
        l.b(fVar, str);
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, str);
        String str2 = a2.f23354b.f23299c.E;
        if (str2 == null) {
            str2 = str;
        }
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class);
        l.b(a3, str);
        k b2 = ((com.bytedance.android.live.i.a.d) a3).getLivePlayControllerManager().b(str2);
        if (!(b2 == null || (g2 = b2.g()) == null)) {
            str = g2;
        }
        a(str);
    }
}
