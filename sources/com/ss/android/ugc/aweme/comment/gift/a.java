package com.ss.android.ugc.aweme.comment.gift;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentGiftStruct;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.a<C1615a> {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<CommentGiftStruct> f71801a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f71802b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f71803c;

    /* renamed from: d  reason: collision with root package name */
    private final LayoutInflater f71804d;

    /* renamed from: e  reason: collision with root package name */
    private final View.OnClickListener f71805e;

    static {
        Covode.recordClassIndex(44168);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ C1615a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f71801a.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(C1615a aVar, int i2) {
        C1615a aVar2 = aVar;
        l.d(aVar2, "");
        CommentGiftStruct commentGiftStruct = this.f71801a.get(i2);
        SmartImageView smartImageView = (SmartImageView) aVar2.f71806a.findViewById(R.id.eoe);
        if (commentGiftStruct != null && smartImageView != null) {
            smartImageView.setOnClickListener(aVar2.f71808c);
            UrlModel image = commentGiftStruct.getImage();
            if (image != null && image.getUrlList() != null) {
                UrlModel image2 = commentGiftStruct.getImage();
                if (image2 == null) {
                    l.b();
                }
                List<String> urlList = image2.getUrlList();
                if (urlList == null) {
                    l.b();
                }
                if (!urlList.isEmpty()) {
                    smartImageView.setVisibility(0);
                    v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(commentGiftStruct.getImage()));
                    a2.E = smartImageView;
                    a2.v = w.CENTER_INSIDE;
                    a2.c();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.a$a  reason: collision with other inner class name */
    public static final class C1615a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final View f71806a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f71807b;

        /* renamed from: c  reason: collision with root package name */
        public final View.OnClickListener f71808c;

        static {
            Covode.recordClassIndex(44169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1615a(View view, Context context, View.OnClickListener onClickListener) {
            super(view);
            l.d(view, "");
            l.d(context, "");
            l.d(onClickListener, "");
            this.f71806a = view;
            this.f71807b = context;
            this.f71808c = onClickListener;
        }
    }

    public a(ViewGroup viewGroup, Context context, View.OnClickListener onClickListener) {
        l.d(viewGroup, "");
        l.d(context, "");
        l.d(onClickListener, "");
        this.f71802b = viewGroup;
        this.f71803c = context;
        this.f71805e = onClickListener;
        LayoutInflater from = LayoutInflater.from(context);
        l.b(from, "");
        this.f71804d = from;
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(1049);
        l.d(viewGroup, "");
        View a3 = com.a.a(aVar.f71804d, R.layout.ju, aVar.f71802b, false);
        l.b(a3, "");
        C1615a aVar2 = new C1615a(a3, aVar.f71803c, aVar.f71805e);
        try {
            if (aVar2.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar2.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar2.getClass().getName();
        MethodCollector.o(1049);
        return aVar2;
    }
}
