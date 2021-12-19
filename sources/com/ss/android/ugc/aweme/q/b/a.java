package com.ss.android.ugc.aweme.q.b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.google.gson.f;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.model.AnchorIcon;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.bl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.q.a.a<AnchorCell, C3050a> {

    /* renamed from: d  reason: collision with root package name */
    public final String f118946d;

    static {
        Covode.recordClassIndex(77275);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.b.a$a  reason: collision with other inner class name */
    public final class C3050a extends com.ss.android.ugc.aweme.q.a.a<AnchorCell, C3050a>.c {

        /* renamed from: b  reason: collision with root package name */
        public final SmartImageView f118947b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f118948c;

        /* renamed from: d  reason: collision with root package name */
        public final Button f118949d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a f118950e;

        static {
            Covode.recordClassIndex(77276);
        }

        /* renamed from: com.ss.android.ugc.aweme.q.b.a$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC3051a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3050a f118951a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AnchorCell f118952b;

            static {
                Covode.recordClassIndex(77277);
            }

            View$OnClickListenerC3051a(C3050a aVar, AnchorCell anchorCell) {
                this.f118951a = aVar;
                this.f118952b = anchorCell;
            }

            public final void onClick(View view) {
                Collection<AnchorPublishStruct> values;
                T t;
                ClickAgent.onClick(view);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("third_id", this.f118952b.f66453a);
                    jSONObject.put("add_from", 2);
                    jSONObject.put("common_type", true);
                    String str = this.f118952b.f66458f;
                    if (str != null) {
                        Object a2 = new f().a(str, Map.class);
                        l.b(a2, "");
                        for (Map.Entry entry : ((Map) a2).entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (JSONException e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
                }
                bl blVar = this.f118951a.f118950e.f118917b;
                String str2 = null;
                String d2 = blVar != null ? blVar.d() : null;
                bl blVar2 = this.f118951a.f118950e.f118917b;
                String e3 = blVar2 != null ? blVar2.e() : null;
                Map<String, AnchorPublishStruct> d3 = AnchorListManager.d();
                if (!(d3 == null || (values = d3.values()) == null)) {
                    Iterator<T> it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.type == this.f118952b.f66459g) {
                            break;
                        }
                    }
                    T t2 = t;
                    if (t2 != null) {
                        str2 = t2.logExtra;
                    }
                }
                d dVar = new d();
                dVar.a("anchor_entry", this.f118952b.f66455c).a("enter_from", "video_post_page").a("shoot_way", d2).a("creation_id", e3).a("status", 1);
                if (!(str2 == null || str2.length() == 0)) {
                    JSONObject jSONObject2 = new JSONObject(str2);
                    Iterator<String> keys = jSONObject2.keys();
                    l.b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        dVar.a(next, jSONObject2.get(next).toString());
                    }
                }
                r.a("choose_anchor", dVar.f66730a);
                int i2 = this.f118952b.f66459g;
                String jSONObject3 = jSONObject.toString();
                l.b(jSONObject3, "");
                c.a(new com.ss.android.ugc.aweme.commercialize.b.a(new com.ss.android.ugc.aweme.common.a(i2, jSONObject3, this.f118952b.f66455c, null, 1, null, null, false, null, null, null, null, null, 8168, null)));
                bl blVar3 = this.f118951a.f118950e.f118917b;
                if (blVar3 != null) {
                    blVar3.c();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3050a(a aVar, View view) {
            super(aVar, view, aVar.f118946d);
            l.d(view, "");
            this.f118950e = aVar;
            this.f118947b = (SmartImageView) view.findViewById(R.id.bhm);
            this.f118948c = (TextView) view.findViewById(R.id.euw);
            this.f118949d = (Button) view.findViewById(R.id.xt);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(bl blVar, String str) {
        super(blVar);
        l.d(str, "");
        this.f118946d = str;
    }

    @Override // j.a.a.c
    public final /* synthetic */ RecyclerView.ViewHolder a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.a9e, viewGroup, false);
        l.b(a2, "");
        return new C3050a(this, a2);
    }

    @Override // j.a.a.c
    public final /* synthetic */ void a(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        ArrayList<String> arrayList;
        C3050a aVar = (C3050a) viewHolder;
        AnchorCell anchorCell = (AnchorCell) obj;
        l.d(aVar, "");
        l.d(anchorCell, "");
        l.d(anchorCell, "");
        AnchorIcon anchorIcon = anchorCell.f66454b;
        if (anchorIcon == null || (arrayList = anchorIcon.f66462b) == null || (str = arrayList.get(0)) == null) {
            str = "";
        }
        v a2 = com.bytedance.lighten.a.r.a(str);
        a2.E = aVar.f118947b;
        a2.c();
        TextView textView = aVar.f118948c;
        l.b(textView, "");
        textView.setText(anchorCell.f66455c);
        aVar.f118949d.setOnClickListener(new C3050a.View$OnClickListenerC3051a(aVar, anchorCell));
    }
}
