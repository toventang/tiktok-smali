package com.ss.android.ugc.aweme.editSticker.text.effect;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.h;
import com.ss.android.ugc.aweme.editSticker.text.effect.m;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.b.a.c;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public int f88507a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.editSticker.text.bean.a> f88508b;

    /* renamed from: c  reason: collision with root package name */
    public final r<com.ss.android.ugc.aweme.editSticker.text.bean.a> f88509c;

    /* renamed from: d  reason: collision with root package name */
    public final r<h> f88510d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.b<com.ss.android.ugc.aweme.editSticker.text.bean.a, z> f88511e;

    static {
        Covode.recordClassIndex(55716);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f88508b.size();
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final com.ss.android.ugc.tools.view.widget.c.a f88512a;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f88513b;

        /* renamed from: c  reason: collision with root package name */
        com.ss.android.ugc.tools.b.a.a f88514c = com.ss.android.ugc.tools.b.a.a.NOT_DOWNLOAD;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f88515d;

        /* renamed from: e  reason: collision with root package name */
        private final h.h f88516e = i.a((h.f.a.a) new C2147a(this));

        static {
            Covode.recordClassIndex(55717);
        }

        /* access modifiers changed from: package-private */
        public final ObjectAnimator a() {
            return (ObjectAnimator) this.f88516e.getValue();
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            a().cancel();
            ImageView imageView = this.f88513b;
            l.b(imageView, "");
            imageView.setRotation(0.0f);
            this.f88513b.setImageResource(2131232284);
        }

        /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.k$a$a  reason: collision with other inner class name */
        static final class C2147a extends m implements h.f.a.a<ObjectAnimator> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(55719);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2147a(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ObjectAnimator invoke() {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.this$0.f88513b, "rotation", 0.0f, 360.0f);
                l.b(ofFloat, "");
                ofFloat.setDuration(800L);
                ofFloat.setRepeatMode(1);
                ofFloat.setRepeatCount(-1);
                ofFloat.setInterpolator(new LinearInterpolator());
                return ofFloat;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, View view) {
            super(view);
            l.d(view, "");
            this.f88515d = kVar;
            com.ss.android.ugc.tools.view.widget.c.a aVar = (com.ss.android.ugc.tools.view.widget.c.a) view.findViewById(R.id.bwr);
            this.f88512a = aVar;
            this.f88513b = (ImageView) view.findViewById(R.id.bwq);
            aVar.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.editSticker.text.effect.k.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f88517a;

                static {
                    Covode.recordClassIndex(55718);
                }

                {
                    this.f88517a = r1;
                }

                public final void onClick(View view) {
                    int adapterPosition;
                    ClickAgent.onClick(view);
                    if (this.f88517a.getAdapterPosition() != -1 && this.f88517a.getAdapterPosition() != this.f88517a.f88515d.f88507a) {
                        int i2 = this.f88517a.f88515d.f88507a;
                        k kVar = this.f88517a.f88515d;
                        if (this.f88517a.f88514c != com.ss.android.ugc.tools.b.a.a.DOWNLOADED) {
                            h.f.a.b<com.ss.android.ugc.aweme.editSticker.text.bean.a, z> bVar = this.f88517a.f88515d.f88511e;
                            if (bVar != null) {
                                bVar.invoke(this.f88517a.f88515d.f88508b.get(this.f88517a.getAdapterPosition()));
                            }
                            adapterPosition = this.f88517a.f88515d.f88507a;
                        } else {
                            h.f.a.b<com.ss.android.ugc.aweme.editSticker.text.bean.a, z> bVar2 = this.f88517a.f88515d.f88511e;
                            if (bVar2 != null) {
                                bVar2.invoke(this.f88517a.f88515d.f88508b.get(this.f88517a.getAdapterPosition()));
                            }
                            adapterPosition = this.f88517a.getAdapterPosition();
                        }
                        kVar.f88507a = adapterPosition;
                        this.f88517a.f88515d.notifyItemChanged(i2);
                        this.f88517a.f88515d.notifyItemChanged(this.f88517a.getAdapterPosition());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<m.a, z> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(55720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(m.a aVar) {
            m.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f88531a = true;
            View view = this.$itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            aVar2.f88534d = (int) r.a(context, 52.0f);
            View view2 = this.$itemView;
            l.b(view2, "");
            Context context2 = view2.getContext();
            l.b(context2, "");
            aVar2.f88533c = (int) r.a(context2, 52.0f);
            aVar2.f88535e = 2131230950;
            aVar2.f88541k = true;
            aVar2.f88536f = true;
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        boolean z;
        boolean z2;
        com.ss.android.ugc.tools.b.a.a aVar2;
        a aVar3 = aVar;
        l.d(aVar3, "");
        if (this.f88508b.size() > i2) {
            com.ss.android.ugc.aweme.editSticker.text.bean.a aVar4 = aVar3.f88515d.f88508b.get(i2);
            if (aVar4.f88419e.f88425b) {
                com.ss.android.ugc.tools.c.a.a(aVar3.f88512a.getImageView(), 2131232286);
            } else if (aVar4.f88419e.f88424a) {
                com.ss.android.ugc.tools.c.a.a(aVar3.f88512a.getImageView(), 2131232287);
            } else {
                UrlModel urlModel = new UrlModel();
                com.ss.android.ugc.effectmanager.common.model.UrlModel iconUrl = aVar4.f88093b.getIconUrl();
                urlModel.setUri(iconUrl.getUri());
                urlModel.setUrlList(iconUrl.getUrlList());
                com.ss.android.ugc.tools.c.a.a(aVar3.f88512a.getImageView(), urlModel, -1, -1);
            }
            aVar3.f88512a.setText(aVar4.f88093b.getName());
            aVar3.f88512a.getImageView().setBackgroundResource(R.drawable.a84);
            com.ss.android.ugc.tools.view.widget.c.a aVar5 = aVar3.f88512a;
            if (aVar3.getAdapterPosition() == aVar3.f88515d.f88507a) {
                z = true;
            } else {
                z = false;
            }
            aVar5.setCustomSelected(z);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(aVar3.f88515d.f88509c.a(aVar4)));
            Iterator<T> it = aVar4.f88418d.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(aVar3.f88515d.f88510d.a(it.next())));
            }
            int a2 = com.ss.android.ugc.tools.b.a.b.a(arrayList);
            if (a2 == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                aVar2 = com.ss.android.ugc.tools.b.a.a.DOWNLOADING;
            } else if (a2 == 2 || a2 == 1 || a2 == 32 || !c.a(a2)) {
                aVar2 = com.ss.android.ugc.tools.b.a.a.NOT_DOWNLOAD;
            } else {
                aVar2 = com.ss.android.ugc.tools.b.a.a.DOWNLOADED;
            }
            aVar3.f88514c = aVar2;
            int i3 = l.f88518a[aVar3.f88514c.ordinal()];
            if (i3 == 1) {
                ImageView imageView = aVar3.f88513b;
                l.b(imageView, "");
                imageView.setVisibility(0);
                aVar3.b();
            } else if (i3 == 2) {
                ImageView imageView2 = aVar3.f88513b;
                l.b(imageView2, "");
                imageView2.setVisibility(8);
                aVar3.b();
            } else if (i3 != 3) {
                ImageView imageView3 = aVar3.f88513b;
                l.b(imageView3, "");
                imageView3.setVisibility(0);
                aVar3.b();
            } else {
                ImageView imageView4 = aVar3.f88513b;
                l.b(imageView4, "");
                imageView4.setVisibility(0);
                aVar3.f88513b.setImageResource(2131232285);
                aVar3.a().start();
            }
        }
    }

    private static RecyclerView.ViewHolder a(k kVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(5245);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.zc, viewGroup, false);
        l.b(a3, "");
        Context context = a3.getContext();
        l.b(context, "");
        b bVar = new b(a3);
        m.a aVar = new m.a(context);
        bVar.invoke(aVar);
        m mVar = new m(aVar.p, aVar.f88531a, aVar.f88532b, aVar.f88533c, aVar.f88534d, aVar.f88535e, aVar.f88536f, aVar.f88537g, aVar.f88538h, aVar.f88539i, aVar.f88540j, aVar.f88541k, aVar.f88542l, aVar.f88543m, aVar.n, aVar.o);
        if (com.ss.android.ugc.tools.a.f149054l.f149061f) {
            TextView textView = mVar.getTextView();
            if (textView != null) {
                textView.setTextSize(12.0f);
            }
            TextView textView2 = mVar.getTextView();
            if (textView2 != null) {
                g.a(textView2);
            }
        } else {
            TextView textView3 = mVar.getTextView();
            if (textView3 != null) {
                textView3.setTextSize(11.0f);
            }
            TextView textView4 = mVar.getTextView();
            if (textView4 != null) {
                textView4.setTypeface(Typeface.defaultFromStyle(0));
            }
        }
        mVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        mVar.setId(R.id.bwr);
        ((FrameLayout) a3.findViewById(R.id.b5c)).addView(mVar, 0);
        a aVar2 = new a(kVar, a3);
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
        MethodCollector.o(5245);
        return aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.effect.r<? super com.ss.android.ugc.aweme.editSticker.text.bean.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.effect.r<? super com.ss.android.ugc.aweme.editSticker.text.bean.h> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.bean.a, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(List<com.ss.android.ugc.aweme.editSticker.text.bean.a> list, r<? super com.ss.android.ugc.aweme.editSticker.text.bean.a> rVar, r<? super h> rVar2, h.f.a.b<? super com.ss.android.ugc.aweme.editSticker.text.bean.a, z> bVar) {
        l.d(list, "");
        l.d(rVar, "");
        l.d(rVar2, "");
        this.f88508b = list;
        this.f88509c = rVar;
        this.f88510d = rVar2;
        this.f88511e = bVar;
    }
}
