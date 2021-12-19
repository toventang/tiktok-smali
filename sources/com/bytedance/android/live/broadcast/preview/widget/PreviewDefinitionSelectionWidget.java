package com.bytedance.android.live.broadcast.preview.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.broadcast.model.n;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.j.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class PreviewDefinitionSelectionWidget extends PreviewToolBaseWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8352a = new a((byte) 0);

    static {
        Covode.recordClassIndex(4263);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int a() {
        return R.string.duk;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final int b() {
        return 2131234409;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(4264);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class);
        if (bVar != null) {
            bVar.reportAnchorDefinitionBtnShow();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        n.a c2 = c();
        if (c2 != null) {
            a(c2);
        }
        this.dataChannel.b(dg.class, (h.f.a.b) new b(this));
        DataChannelGlobal.f34575d.a(this, this, v.class, new c(this));
    }

    public static n.a c() {
        boolean z;
        n.a aVar;
        String str;
        com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cR;
        l.b(bVar, "");
        Map<String, String> a2 = bVar.a();
        if (a2 == null || a2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (!z) {
            aVar = new n.a();
            aVar.f7937a = a2.get(StringSet.name);
            aVar.f7938b = a2.get("sdk_key");
        } else {
            aVar = null;
        }
        StringBuilder sb = new StringBuilder("getLastSpSelectedQuality. lastQuality.name=");
        if (aVar != null) {
            str = aVar.f7937a;
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append(", lastQuality.sdkKey=");
        if (aVar != null) {
            str2 = aVar.f7938b;
        }
        com.bytedance.android.live.core.c.a.a(4, "PreviewDefinitionSelectionWidget", append.append(str2).toString());
        return aVar;
    }

    public static void a(n.a aVar) {
        DataChannelGlobal.f34575d.b(v.class, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    public final void a(View view) {
        Activity activity;
        l.d(view, "");
        com.bytedance.android.live.d.b bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class);
        Context context = view.getContext();
        l.b(context, "");
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        bVar.showDefinitionSelectionDialog(activity, true);
    }

    static final class b extends h.f.b.m implements h.f.a.b<o, z> {
        final /* synthetic */ PreviewDefinitionSelectionWidget this$0;

        static {
            Covode.recordClassIndex(4265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PreviewDefinitionSelectionWidget previewDefinitionSelectionWidget) {
            super(1);
            this.this$0 = previewDefinitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(o oVar) {
            List<n.a> list;
            n nVar;
            o oVar2 = oVar;
            l.d(oVar2, "");
            Map<Long, n> map = oVar2.r;
            n.a aVar = null;
            if (map == null || (nVar = map.get(4L)) == null) {
                list = null;
            } else {
                list = nVar.f7936b;
                List<n.a> list2 = nVar.f7936b;
                if (list2 != null) {
                    aVar = (n.a) h.a.n.h((List) list2);
                }
            }
            n.a c2 = PreviewDefinitionSelectionWidget.c();
            if (c2 != null && list != null && !list.isEmpty()) {
                Iterator<n.a> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f7938b.equals(c2.f7938b)) {
                            PreviewDefinitionSelectionWidget.a(c2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (aVar != null) {
                PreviewDefinitionSelectionWidget.a(aVar);
            }
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<n.a, z> {
        final /* synthetic */ PreviewDefinitionSelectionWidget this$0;

        static {
            Covode.recordClassIndex(4266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PreviewDefinitionSelectionWidget previewDefinitionSelectionWidget) {
            super(1);
            this.this$0 = previewDefinitionSelectionWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(n.a aVar) {
            ImageView imageView;
            n.a aVar2 = aVar;
            l.d(aVar2, "");
            PreviewDefinitionSelectionWidget previewDefinitionSelectionWidget = this.this$0;
            String str = aVar2.f7938b;
            l.b(str, "");
            int hashCode = str.hashCode();
            int i2 = 2131234406;
            if (hashCode != -1008619738) {
                if (hashCode != 3324) {
                    if (hashCode != 3448) {
                        if (hashCode != 3665) {
                            if (hashCode == 115761) {
                                str.equals("uhd");
                            }
                        } else if (str.equals("sd")) {
                            i2 = 2131234408;
                        }
                    } else if (str.equals("ld")) {
                        i2 = 2131234407;
                    }
                } else if (str.equals("hd")) {
                    i2 = 2131234409;
                }
            } else if (str.equals("origin")) {
                i2 = 2131234410;
            }
            View view = previewDefinitionSelectionWidget.getView();
            if (!(view == null || (imageView = (ImageView) view.findViewById(R.id.fmh)) == null)) {
                imageView.setImageResource(i2);
            }
            return z.f158842a;
        }
    }
}
