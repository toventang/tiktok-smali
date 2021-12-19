package com.ss.android.ugc.aweme.discover.ui.e;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.model.suicide.SearchDialInfo;
import com.ss.android.ugc.aweme.search.k.v;
import com.ss.android.ugc.aweme.utils.aq;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends com.ss.android.ugc.aweme.discover.adapter.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f82555c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public aq f82556a;

    /* renamed from: b  reason: collision with root package name */
    public View f82557b;

    static {
        Covode.recordClassIndex(51395);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51396);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchDialInfo f82559b;

        static {
            Covode.recordClassIndex(51397);
        }

        b(c cVar, SearchDialInfo searchDialInfo) {
            this.f82558a = cVar;
            this.f82559b = searchDialInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f82558a;
            SearchDialInfo searchDialInfo = this.f82559b;
            new v("click_get_call").f();
            a.C0731a aVar = new a.C0731a(cVar.G());
            aVar.f33402b = searchDialInfo.number;
            aVar.b(R.string.a9e, (DialogInterface.OnClickListener) null, false).a(R.string.a8y, (DialogInterface.OnClickListener) new d(cVar, searchDialInfo), false).a().b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.e.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1939c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchDialInfo f82561b;

        static {
            Covode.recordClassIndex(51398);
        }

        View$OnClickListenerC1939c(c cVar, SearchDialInfo searchDialInfo) {
            this.f82560a = cVar;
            this.f82561b = searchDialInfo;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f82560a;
            SearchDialInfo searchDialInfo = this.f82561b;
            String str = searchDialInfo.content;
            new v("send_sms_sign").f();
            Uri parse = Uri.parse("smsto:" + searchDialInfo.number);
            Context G = cVar.G();
            Intent intent = new Intent("android.intent.action.SENDTO", parse);
            intent.putExtra("sms_body", str);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, G);
            G.startActivity(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(View view, View view2) {
        super(view);
        l.d(view, "");
        l.d(view2, "");
        this.f82557b = view2;
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f82562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchDialInfo f82563b;

        static {
            Covode.recordClassIndex(51399);
        }

        d(c cVar, SearchDialInfo searchDialInfo) {
            this.f82562a = cVar;
            this.f82563b = searchDialInfo;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                this.f82562a.f82556a = new aq(this.f82562a.G(), this.f82563b.number, this.f82562a.G().getString(R.string.a8z));
                aq aqVar = this.f82562a.f82556a;
                if (aqVar != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + aqVar.f142648b));
                    Context context = aqVar.f142647a;
                    com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                    context.startActivity(intent);
                }
                new v("click_call_sign").f();
            }
        }
    }

    public final void a(SearchDialInfo searchDialInfo, int i2) {
        String str;
        l.d(searchDialInfo, "");
        View view = this.itemView;
        l.b(view, "");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.by0);
        String str2 = searchDialInfo.icon;
        if (str2 == null) {
            str2 = "";
        }
        e.b(remoteImageView, str2, -1, -1);
        View view2 = this.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.title);
        tuxTextView.setText(searchDialInfo.title);
        tuxTextView.setTuxFont(52);
        if (i2 == 2) {
            View view3 = this.itemView;
            l.b(view3, "");
            TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.cyc);
            l.b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            View view4 = this.itemView;
            l.b(view4, "");
            TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.cyc);
            l.b(tuxTextView3, "");
            tuxTextView3.setText(searchDialInfo.number);
        } else if (i2 == 3) {
            try {
                String str3 = searchDialInfo.content;
                if (!(str3 == null || str3.length() == 0 || (str = searchDialInfo.number) == null)) {
                    if (str.length() != 0) {
                        View view5 = this.itemView;
                        l.b(view5, "");
                        TuxTextView tuxTextView4 = (TuxTextView) view5.findViewById(R.id.cyc);
                        l.b(tuxTextView4, "");
                        tuxTextView4.setVisibility(0);
                        View view6 = this.itemView;
                        l.b(view6, "");
                        Context context = view6.getContext();
                        Object[] objArr = new Object[2];
                        String str4 = searchDialInfo.content;
                        if (str4 == null) {
                            str4 = "";
                        }
                        objArr[0] = str4;
                        String str5 = searchDialInfo.number;
                        if (str5 == null) {
                            str5 = "";
                        }
                        objArr[1] = str5;
                        String string = context.getString(R.string.g1r, objArr);
                        l.b(string, "");
                        View view7 = this.itemView;
                        l.b(view7, "");
                        TuxTextView tuxTextView5 = (TuxTextView) view7.findViewById(R.id.cyc);
                        l.b(tuxTextView5, "");
                        tuxTextView5.setText(string);
                    }
                }
                View view8 = this.itemView;
                l.b(view8, "");
                TuxTextView tuxTextView6 = (TuxTextView) view8.findViewById(R.id.cyc);
                l.b(tuxTextView6, "");
                tuxTextView6.setVisibility(8);
            } catch (Exception e2) {
                e2.printStackTrace();
                View view9 = this.itemView;
                l.b(view9, "");
                TuxTextView tuxTextView7 = (TuxTextView) view9.findViewById(R.id.cyc);
                l.b(tuxTextView7, "");
                tuxTextView7.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(searchDialInfo.desc)) {
            View view10 = this.itemView;
            l.b(view10, "");
            ((TuxTextView) view10.findViewById(R.id.ak7)).setText(searchDialInfo.desc);
            View view11 = this.itemView;
            l.b(view11, "");
            TuxTextView tuxTextView8 = (TuxTextView) view11.findViewById(R.id.ak7);
            l.b(tuxTextView8, "");
            tuxTextView8.setVisibility(0);
        } else {
            View view12 = this.itemView;
            l.b(view12, "");
            TuxTextView tuxTextView9 = (TuxTextView) view12.findViewById(R.id.ak7);
            l.b(tuxTextView9, "");
            tuxTextView9.setVisibility(8);
        }
        View view13 = this.itemView;
        l.b(view13, "");
        ((TuxTextView) view13.findViewById(R.id.acs)).setTuxFont(52);
        if (i2 == 2) {
            View view14 = this.itemView;
            l.b(view14, "");
            TuxTextView tuxTextView10 = (TuxTextView) view14.findViewById(R.id.acs);
            l.b(tuxTextView10, "");
            View view15 = this.itemView;
            l.b(view15, "");
            tuxTextView10.setText(view15.getContext().getString(R.string.dpz));
            View view16 = this.itemView;
            l.b(view16, "");
            ((TuxTextView) view16.findViewById(R.id.acs)).setOnClickListener(new b(this, searchDialInfo));
        } else if (i2 == 3) {
            View view17 = this.itemView;
            l.b(view17, "");
            TuxTextView tuxTextView11 = (TuxTextView) view17.findViewById(R.id.acs);
            l.b(tuxTextView11, "");
            View view18 = this.itemView;
            l.b(view18, "");
            tuxTextView11.setText(view18.getContext().getString(R.string.g1q));
            View view19 = this.itemView;
            l.b(view19, "");
            ((TuxTextView) view19.findViewById(R.id.acs)).setOnClickListener(new View$OnClickListenerC1939c(this, searchDialInfo));
        }
    }
}
