package com.ss.android.ugc.gamora.editor.sticker.donation.a;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.l;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.ss.android.ugc.gamora.editor.sticker.donation.a;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.g;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;

public final class b extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    RemoteImageView f146504a;

    /* renamed from: b  reason: collision with root package name */
    TextView f146505b;

    /* renamed from: c  reason: collision with root package name */
    TextView f146506c;

    /* renamed from: d  reason: collision with root package name */
    RemoteImageView f146507d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.editor.sticker.donation.b f146508e;

    /* renamed from: f  reason: collision with root package name */
    public a f146509f;

    static {
        Covode.recordClassIndex(96405);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146510a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.donation.c.b f146511b;

        static {
            Covode.recordClassIndex(96406);
        }

        a(b bVar, com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar2) {
            this.f146510a = bVar;
            this.f146511b = bVar2;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!l.a(view, 1200)) {
                this.f146510a.f146509f.b(this.f146511b);
                com.ss.android.ugc.gamora.editor.sticker.donation.b bVar = this.f146510a.f146508e;
                String str2 = null;
                if (bVar != null) {
                    str = bVar.getShootWay();
                } else {
                    str = null;
                }
                com.ss.android.ugc.gamora.editor.sticker.donation.b bVar2 = this.f146510a.f146508e;
                if (bVar2 != null) {
                    str2 = bVar2.getCreationId();
                }
                String name = this.f146511b.getName();
                JSONObject jSONObject = new JSONObject();
                com.ss.android.ugc.gamora.editor.sticker.donation.a.a(jSONObject, new a.c(str, str2, name));
                d.a("enter_ngo_detail", jSONObject);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC3921b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f146512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.donation.c.b f146513b;

        static {
            Covode.recordClassIndex(96407);
        }

        View$OnClickListenerC3921b(b bVar, com.ss.android.ugc.gamora.editor.sticker.donation.c.b bVar2) {
            this.f146512a = bVar;
            this.f146513b = bVar2;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            if (!l.a(view, 1200)) {
                this.f146512a.f146509f.a(this.f146513b);
                com.ss.android.ugc.gamora.editor.sticker.donation.b bVar = this.f146512a.f146508e;
                String str4 = null;
                if (bVar != null) {
                    str = bVar.getShootWay();
                } else {
                    str = null;
                }
                com.ss.android.ugc.gamora.editor.sticker.donation.b bVar2 = this.f146512a.f146508e;
                if (bVar2 != null) {
                    str2 = bVar2.getCreationId();
                } else {
                    str2 = null;
                }
                String name = this.f146513b.getName();
                int adapterPosition = this.f146512a.getAdapterPosition() + 1;
                com.ss.android.ugc.gamora.editor.sticker.donation.b bVar3 = this.f146512a.f146508e;
                if (bVar3 != null) {
                    str3 = bVar3.getContentSource();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.gamora.editor.sticker.donation.b bVar4 = this.f146512a.f146508e;
                if (bVar4 != null) {
                    str4 = bVar4.getContentType();
                }
                JSONObject jSONObject = new JSONObject();
                com.ss.android.ugc.gamora.editor.sticker.donation.a.a(jSONObject, new a.d(str, str2, name, str3, str4, adapterPosition));
                d.a("add_donation_sticker", jSONObject);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, com.ss.android.ugc.gamora.editor.sticker.donation.b bVar, a aVar) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(aVar, "");
        this.f146508e = bVar;
        this.f146509f = aVar;
        this.f146504a = (RemoteImageView) view.findViewById(R.id.bzk);
        this.f146505b = (TextView) view.findViewById(R.id.f40);
        this.f146506c = (TextView) view.findViewById(R.id.f3z);
        this.f146507d = (RemoteImageView) view.findViewById(R.id.bzj);
    }

    static Spannable a(String str, Context context, List<g> list) {
        SpannableString spannableString = new SpannableString(str);
        for (g gVar : list) {
            if (!(gVar.getStartIndex() == null || gVar.getEndIndex() == null || context == null)) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.b.c(context, R.color.bh));
                Integer startIndex = gVar.getStartIndex();
                if (startIndex == null) {
                    h.f.b.l.b();
                }
                int intValue = startIndex.intValue();
                Integer endIndex = gVar.getEndIndex();
                if (endIndex == null) {
                    h.f.b.l.b();
                }
                spannableString.setSpan(foregroundColorSpan, intValue, endIndex.intValue(), 33);
            }
        }
        return spannableString;
    }
}
